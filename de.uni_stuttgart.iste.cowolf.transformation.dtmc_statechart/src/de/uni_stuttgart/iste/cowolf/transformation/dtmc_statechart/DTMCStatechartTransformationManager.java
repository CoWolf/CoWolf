package de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.impl.TraceImpl;
import org.osgi.framework.Bundle;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.model.dtmc.Root;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.transformation.TransformationTypeInfo;
import de.uni_stuttgart.iste.cowolf.transformation.model.Mappings;
import de.uni_stuttgart.iste.cowolf.transformation.model.util.XMLMappingLoader;

/**
 * @author Michael Zimmermann
 * @author Michael Müller
 *
 *
 * @TODO: How to get the right transformation rules (simple look up table?) and
 *        needed parameter.
 * @TODO: Decide where traces should be stored (source or target model file or
 *        separate trace file)
 * @TODO: Should the transformation be done in place or not?
 *
 */
public class DTMCStatechartTransformationManager
        extends
            AbstractTransformationManager {

    private final String HENSHIN_FOLDER = "de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart.rules/rules/";
    private HenshinResourceSet rulesResourceSet;
    private Map<String, Unit> units;

    @Override
    public boolean isManaged(Resource source, Resource target) {
        System.out.println(source + " " + target);
        if (source == null || target == null) {
            return false;
        }

        System.out.println(source.getContents() + " " + target.getContents());
        if (source.getContents() == null || source.getContents().isEmpty()
                || target.getContents() == null
                || target.getContents().isEmpty()) {
            return false;
        }

        return ((source.getContents().get(0) instanceof StateMachine && target
                .getContents().get(0) instanceof Root) || (target.getContents()
                .get(0) instanceof StateMachine && source.getContents().get(0) instanceof Root));

    }

    @Override
    public boolean transform(Resource source, Resource target,
            SymmetricDifference difference) {
        System.out.println("Loading mappings...");

        // Load mappings
        Mappings mappings;
        try {
            mappings = XMLMappingLoader.loadMapping(this.getMapping());
            System.out.println(mappings);
            System.out.println("Found " + mappings.getMapping().size()
                    + " mappings.");
            /*
             * for (Entry<String, Mapping> mapping : mappings.getMapping()
             * .entrySet()) { System.out.println("Rule key: " +
             * mapping.getKey()); System.out.println("Rule value:" +
             * mapping.getValue()); }
             */
        } catch (JAXBException e1) {
            e1.printStackTrace();
            return false;
        }
        // Load rules from files in folder
        this.units = this.getHenshinRules();

        System.out.println("Merging graphs");
        List<EGraph> graphs = new ArrayList<>();
        graphs.add(new EGraphImpl(source));
        graphs.add(new EGraphImpl(target));
        EGraph graph = mergeInstanceModels(graphs);
        System.out.println("Finished merging graphs.");
        // TODO get Mapping between rules and params

        System.out.println("Load rules");
        HashMap<String, HashMap<String, Object>> ruleParamsMap = new HashMap<>();
        System.out.println("Run Transformation");
        graph = runTransformation(graph, HENSHIN_FOLDER, ruleParamsMap);
        System.out.println("Save result");
        try {
            save(graph, target, false);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Override
    public TransformationTypeInfo getTransformationTypeInfo() {
        // TODO Auto-generated method stub
        return null;
    }
    /**
     * 
     * @return
     */
    private Map<String, Unit> getHenshinRules() {
        Map<String, Unit> units = new HashMap<>();
        Bundle root = Platform
                .getBundle("de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart.rules");
        URL url = FileLocator.find(root, new Path("/rules/"), null);
        File file = null;
        try {
            url = FileLocator.toFileURL(url);
            file = new File(url.toURI());
        } catch (IOException | URISyntaxException e1) {
            return null;
        }
        if (!file.isDirectory()) {
            return null;
        }
        List<File> henshinFiles = new ArrayList<>();
        for (File henshinFil : file.listFiles()) {
            String extension = "";
            String fileName = henshinFil.toString();
            int i = fileName.lastIndexOf('.');
            if (i > 0) {
                extension = fileName.substring(i + 1);
            }
            if (!henshinFil.isDirectory() && extension.equals("henshin")) {
                henshinFiles.add(henshinFil);
            }
        }
        for (File henshinFil : henshinFiles) {
            Module module = rulesResourceSet.getModule(henshinFil.toString(),
                    true);
            for (Unit unit : module.getUnits()) {
                units.put(unit.getName(), unit);
            }
        }
        return units;
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
    public EGraph runTransformation(EGraph graph, String henshinFile,
            HashMap<String, HashMap<String, Object>> rules) {
        // TODO: perform only rules needed
        boolean result;

        // load each rule which has to be executed, set parameters and transform
        // the provided graph
        UnitApplication application = new UnitApplicationImpl(new EngineImpl());
        application.setEGraph(graph);
        // execute rules one by one
        // for (Entry<String, HashMap<String, Object>> entry : rules.entrySet())
        // {
        this.rulesResourceSet = new HenshinResourceSet();

        Unit unit = units.get("CreateState");

        // if (currentGraph != null) {
        // application = new UnitApplicationImpl(new EngineImpl());
        // application.setEGraph(currentGraph);
        // }
        application.setUnit(unit);
        application.setParameterValue("name", "_LvYfoCRrEeS7UbY-XnEkdA");
        // // set parameters
        // for (Entry<String, Object> parameter : entry.getValue().entrySet()) {
        // application.setParameterValue(parameter.getKey(),
        // parameter.getValue());
        // }

        // execute
        result = application.execute(null);
        System.out.println(unit.getName() + " "
                + (result ? "successful" : "error"));

        // }
        return application.getEGraph();
    }

    /**
     * Merges all provided EGraphs by adding all Root elements to the first
     * Graph.
     * 
     * @param models
     *            to be merged
     * @return EGraph with all Roots of the provided models
     */
    public EGraph mergeInstanceModels(List<EGraph> models) {
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
     * Saves all roots of the provided graph to an output file.
     * 
     * @param result
     *            graph to be saved
     * @param inPlace
     *            overwrite the transformed models or create a new file
     * @throws IOException
     */
    public void save(EGraph result, Resource target, boolean inPlace)
            throws IOException {
        // Save the models.
        System.out.println("Saving models...");
        System.out.println("Number of roots: " + result.getRoots().size());

        ResourceSet henshinResourceSet = target.getResourceSet();

        // TODO: decide where traces should be stored (source or target model
        // file or separate trace file).
        // TODO: Transformation in place or not?
        List<EObject> list = result.getRoots();

        for (EObject root : list) {
            if (root.getClass() == TraceImpl.class) {
                target.getContents().add(root);
            }
        }
        // save all roots
        if (inPlace) {
            target.save(null);
        } else {
            // create new filename
            String fileName = getFileName(target.getContents().get(0));
            Resource res = henshinResourceSet.createResource(URI
                    .createURI(fileName));
            res.getContents().addAll(target.getContents());
            res.save(null);
        }

    }

    @Override
    public InputStream getMapping() {
        URL url;
        try {
            url = new URL(
                    "platform:/plugin/de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart/res/dtmcmapping.xml");
            return url.openStream();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 
     * @param root
     * 
     * @return FileName
     */
    private String getFileName(EObject root) throws NullPointerException {
        String fileUri = root.eResource().getURI().toString();
        String extension = fileUri.substring(fileUri.lastIndexOf('.'),
                fileUri.length());
        String fileNameNoExtension = fileUri.substring(0,
                fileUri.lastIndexOf('.'));

        return fileNameNoExtension + "_result" + extension;
    }
}
