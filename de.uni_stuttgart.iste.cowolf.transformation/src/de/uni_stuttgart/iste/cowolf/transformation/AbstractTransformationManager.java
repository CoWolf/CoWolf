package de.uni_stuttgart.iste.cowolf.transformation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.LoggingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.impl.TraceImpl;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.SemanticChangeSet;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.transformation.model.Mapping;
import de.uni_stuttgart.iste.cowolf.transformation.model.Mappings;
import de.uni_stuttgart.iste.cowolf.transformation.model.Param;
import de.uni_stuttgart.iste.cowolf.transformation.model.Rule;
import de.uni_stuttgart.iste.cowolf.transformation.model.util.XMLMappingLoader;

/**
 * @author Michael Zimmermann
 * @TODO: How to get the right transformation rules (simple look up table?) and
 *        needed parameter.
 * @TODO: Decide where traces should be stored (source or target model file or
 *        separate trace file)
 * @TODO: Should the transformation be done in place or not?
 */
public abstract class AbstractTransformationManager {
    /**
     * 
     */
    protected Map<String, Mapping> mappings;
    protected Map<String, Unit> units;
    protected HenshinResourceSet rulesResourceSet = new HenshinResourceSet();

    /**
     * 
     * 
     * @param source
     *            source model.
     * @param target
     *            target model.
     * @return Returns whether given source and target models are managed by
     *         this manager.
     */
    public abstract boolean isManaged(Resource source, Resource target);

    /**
     * Performs an incremental transformation between source and target model.
     * The source model got evolved before and differences are stored in the
     * difference object.
     * 
     * @param source
     *            source model which got evolved before.
     * @param target
     *            model which should be evolved by changes in the source model.
     * @param difference
     *            contains evolution steps of the source model.
     * @return
     */
    public Resource transform(Resource source, Resource target,
            SymmetricDifference difference) {
        System.out.println("Loading mappings...");

        // Load mappings
        Mappings mappingObject;
        try {
            mappingObject = XMLMappingLoader.loadMapping(this.getMapping());
            this.mappings = mappingObject.getMapping();
            System.out.println("Found " + mappingObject.getMapping().size()
                    + " mappings.");
        } catch (JAXBException e1) {
            e1.printStackTrace();
            return null;
        }
        // Load rules from files in folder
        System.out.println("Load henshin rules");
        this.units = this.getHenshinRules();
        System.out.println("Number of henshin rules:" + this.units.size());

        System.out.println("Merging graphs");
        List<EGraph> graphs = new ArrayList<>();
        graphs.add(new EGraphImpl(source));
        graphs.add(new EGraphImpl(target));
        EGraph graph = this.mergeInstanceModels(graphs);
        System.out.println("Finished merging graphs.");

        if (difference != null) {
            System.out.println("Run Transformation");
            graph = this.runTransformation(graph, difference);
            System.out.println("Save result");
            try {
                return this.save(graph, target, false);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.println("Difference is null");
            return null;
        }
        return null;
    }

    /**
     * Saves root of the resulting model to an output file.
     *
     * @param result
     *            graph to be saved
     * @param target
     *            resource to save
     * @param inPlace
     *            overwrite the transformed models or create a new file
     * @throws IOException
     */
    protected Resource save(EGraph result, Resource target, boolean inPlace)
            throws IOException {
        // Save the models.
        System.out.println("Saving models...");
        System.out.println("Number of roots: " + result.getRoots().size());

        ResourceSet henshinResourceSet = target.getResourceSet();

        // TODO: decide where traces should be stored (source or target model
        // file or separate trace file).
        // TODO: Transformation in place or not?
        Resource temp = new ResourceImpl(target.getURI());

        List<EObject> list = result.getRoots();

        Class<? extends EObject> targetClass = target.getContents().get(0)
                .getClass();

        for (EObject root : list) {

            // root is element of target model
            if (root.getClass() == targetClass) {

                temp.getContents().add(root);

            }

            // root is a Trace and has source and target
            if (root.getClass() == TraceImpl.class) {

                int hasSource = ((TraceImpl) root).getSource().size();
                int hasTarget = ((TraceImpl) root).getTarget().size();

                if (hasSource >= 1 && hasTarget >= 1) {

                    temp.getContents().add(root);
                }

            }
        }

        // save all roots
        if (inPlace) {

            target.save(null);
            return target;

        } else {
            // create new filename
            String fileName = this.getFileName(temp.getContents().get(0));
            System.out.println("FileName: " + fileName);
            Resource res = henshinResourceSet.createResource(URI
                    .createURI(fileName));
            res.getContents().addAll(temp.getContents());
            res.save(null);
            return res;
        }

    }
    /**
     * Transforms a provided graph with multiple rules from the provided
     * henshinFile. Multiple parameters per rule possible.
     *
     * @param graph
     *            to be transformed
     * @param henshinFile
     *            .henshin File that contains the transformation rules. Located
     *            in the base-folder specified when calling init()
     * @param rules
     *            rule names to be executed plus Hashmap of parameter to be set
     *            for that rule.
     * @return
     */
    protected EGraph runTransformation(EGraph graph,
            SymmetricDifference difference) {
        // TODO: perform only rules needed
        boolean result;

        // load each rule which has to be executed, set parameters and transform
        // the provided graph
        UnitApplication application = new UnitApplicationImpl(new EngineImpl());
        application.setEGraph(graph);
        List<SemanticChangeSet> changeSets = difference.getChangeSets();

        // execute rules one by one, order from change sets.
        for (SemanticChangeSet changeSet : changeSets) {
            System.out.println("Changeset: " + changeSet.getName());
            Mapping mapping = this.mappings.get(changeSet.getName());

            if (mapping != null) {
                // fetch rule/unit from mapping
                Rule rule = mapping.getRule();
                Unit unit = this.units.get(rule.getName());
                if (unit != null) {
                    application.setUnit(unit);

                    // traverse parameters from config object.
                    for (Param param : rule.getParams().getParam()) {
                        String name = param.getName();
                        Object value = null;
                        List<String> path = param.getPath();
                        // check for corresponding change
                        for (Change change : changeSet.getChanges()) {
                            if (change.eClass().getName().equals(path.get(0))) {
                                value = change;
                            }
                        }
                        // traverse xml and object tree
                        int counter = 1;
                        while (value != null && counter < path.size()) {
                            EObject eObject = (EObject) value;
                            value = eObject.eGet(eObject.eClass()
                                    .getEStructuralFeature(path.get(counter)));
                            counter++;
                            System.out.println(value);
                        }
                        application.setParameterValue(name, value);
                    }

                    result = application
                            .execute(new LoggingApplicationMonitor());

                    System.out.println(unit.getName() + " "
                            + (result ? "successful" : "error"));
                } else {
                    System.out.println("No rule found for changeset with name "
                            + changeSet.getName());
                }
            }

        }

        return application.getEGraph();
    }

    public abstract TransformationTypeInfo getTransformationTypeInfo();

    /**
     * Returns an input stream with the mapping.
     * 
     * @return stream containing mapping.
     */
    private InputStream getMapping() {
        IExtensionRegistry er = RegistryFactory.getRegistry();
        IExtensionPoint exPoint = er
                .getExtensionPoint("de.uni_stuttgart.iste.cowolf.transformationMappingExtension");
        for (IExtension extension : exPoint.getExtensions()) {
            for (IConfigurationElement element : extension
                    .getConfigurationElements()) {
                // select config file via extension point
                if (element.getAttribute("key").equals(this.getKey())) {
                    String platformString = extension.getNamespaceIdentifier()
                            + File.separator + element.getAttribute("file");
                    try {
                        URL url = new URL(URI.createPlatformPluginURI(
                                platformString, true).toString());
                        return url.openStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    /**
     * Returns the filename, where the result of the transformation should be
     * stored.
     * 
     * @param root
     *            Root object of resource.
     * @return FileName
     */
    private String getFileName(EObject root) throws NullPointerException {
        String fileUri = root.eResource().getURI().toString();
        String extension = fileUri.substring(fileUri.lastIndexOf('.'),
                fileUri.length());
        String fileNameNoExtension = fileUri.substring(0,
                fileUri.lastIndexOf('.'));

        // start with parsing of file number
        int fileNumber = 0;
        boolean isNumber = true;
        int counter = 0;
        int nameLength = 0;
        while (isNumber) {
            try {
                // parse number at end of file.
                nameLength = fileNameNoExtension.length() - (counter + 1);
                fileNumber = Integer.parseInt(fileNameNoExtension
                        .substring(nameLength));
                counter++;
            } catch (NumberFormatException e) {
                isNumber = false;
                // add 1 as last character is no number anymore.
                nameLength++;
            }
        }
        fileNumber++;

        return fileNameNoExtension.substring(0, nameLength) + fileNumber
                + extension;
    }
    /**
     * Returns the key for which a mapping at the extension point can be stored.
     * 
     * @return string identifier
     */
    protected abstract String getKey();

    /**
     * Merges all provided EGraphs by adding all Root elements to the first
     * Graph.
     *
     * @param models
     *            to be merged
     * @return EGraph with all Roots of the provided models
     */
    private EGraph mergeInstanceModels(List<EGraph> models) {
        if (models.size() > 0) {
            EGraph mergedGraph = models.get(0);
            models.remove(0);
            for (EGraph current : models) {
                for (EObject tree : current.getRoots()) {
                    mergedGraph.addTree(tree);
                }
            }
            return mergedGraph;
        } else {
            return null;
        }
    }

    /**
     * Returns a Map containing the henshin rules with their name as identifier.
     * 
     * @return
     */
    private Map<String, Unit> getHenshinRules() {
        Map<String, Unit> units = new HashMap<>();
        File ruleDirectory = this.getRuleDirectory();
        List<File> henshinFiles = new ArrayList<>();
        if (!ruleDirectory.isDirectory()) {
            System.out.println("No directory selected.");
            return null;
        }
        for (File henshinFile : ruleDirectory.listFiles()) {
            //
            String extension = "";
            String fileName = henshinFile.toString();
            int i = fileName.lastIndexOf('.');
            if (i > 0) {
                extension = fileName.substring(i + 1);
            }
            if (!henshinFile.isDirectory() && extension.equals("henshin")) {
                henshinFiles.add(henshinFile);
            }
        }
        for (File henshinFile : henshinFiles) {
            System.out.println(henshinFile.toPath().toString());
            Module module = this.rulesResourceSet.getModule(henshinFile
                    .toPath().toString(), true);
            for (Unit unit : module.getUnits()) {
                units.put(unit.getName(), unit);
            }
        }
        return units;
    }
    /**
     * Returns the directory containing the rule files.
     * 
     * TODO: will be later replaced by path in transformation mapping file.
     * 
     * @return directory as file
     */
    protected abstract File getRuleDirectory();
}
