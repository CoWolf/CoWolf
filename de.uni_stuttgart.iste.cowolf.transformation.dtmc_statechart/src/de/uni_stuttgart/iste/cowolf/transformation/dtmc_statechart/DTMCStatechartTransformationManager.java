package de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.impl.TraceImpl;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Root;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.transformation.TransformationTypeInfo;

public class DTMCStatechartTransformationManager
        extends
            AbstractTransformationManager {

    private final String HENSHIN_FILE = "henshin";
    private HenshinResourceSet rulesResourceSet;

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

        System.out.println(source.getContents().get(0) + " "
                + target.getContents().get(0));
        return ((source.getContents().get(0) instanceof StateMachine && target
                .getContents().get(0) instanceof Root) || (target.getContents()
                .get(0) instanceof Root && source.getContents().get(0) instanceof StateMachine));

    }

    @Override
    public boolean transform(Resource source, Resource target,
            SymmetricDifference difference) {
        // TODO maybe not needed
        // loadModels();

        // fill list of graphs
        List<EGraph> graphs = new ArrayList<EGraph>();
        graphs.add(new EGraphImpl(source));
        graphs.add(new EGraphImpl(target));

        EGraph graph = mergeInstanceModels(graphs);

        // TODO get Mapping between rules and params
        HashMap<String, HashMap<String, Object>> ruleParamsMap = new HashMap<>();

        graph = runTransformation(graph, HENSHIN_FILE, ruleParamsMap);

        save(graph, target, false);

        return false;
    }

    @Override
    public TransformationTypeInfo getTransformationTypeInfo() {
        // TODO Auto-generated method stub
        return null;
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

        Boolean result = null;
        EGraph currentGraph = null;

        // load each rule which has to be executed, set parameters and transform
        // the provided graph
        UnitApplication application = new UnitApplicationImpl(new EngineImpl());
        application.setEGraph(graph);

        // execute rules one by one
        for (Entry<String, HashMap<String, Object>> entry : rules.entrySet()) {
            Unit unit = rulesResourceSet.getModule(henshinFile).getUnit(
                    entry.getKey());

            if (currentGraph != null) {
                application = new UnitApplicationImpl(new EngineImpl());
                application.setEGraph(currentGraph);
            }
            application.setUnit(unit);

            // set parameters
            for (Entry<String, Object> parameter : entry.getValue().entrySet()) {
                application.setParameterValue(parameter.getKey(),
                        parameter.getValue());
            }

            // execute
            result = application.execute(null);
            currentGraph = application.getEGraph();

            System.out.println(unit.getName() + " "
                    + (result ? "successful" : "error"));

        }
        return application.getEGraph();
    }

    // /**
    // * registers the provided file extensions at the resource factory registry
    // * using standard XMIResourceFactoryImpl for each
    // *
    // * @param model
    // * of which the filename extension should be registered
    // */
    // private void registerExtension(String model) {
    //
    // String extension = model.split(Pattern.quote("."))[1];
    //
    // Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    // extension, new XMIResourceFactoryImpl());
    //
    // System.out.println("Registered extension: " + extension);
    // }

    /**
     * 
     * Loads the needed models once. This is necessary in order to be able to
     * access them.
     * 
     */
    private void loadModels() {
        DTMCemfPackage.eINSTANCE.getName();
        statechartemfPackage.eINSTANCE.getName();
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
     */
    public void save(EGraph result, Resource target, boolean inPlace) {
        // Save the models.
        System.out.println("Saving models...");
        System.out.println("Number of roots: " + result.getRoots().size());
        int traceCount = 0;

        HenshinResourceSet henshinResourceSet = ((HenshinResourceSet) target
                .getResourceSet());

        // TODO: decide where traces should be stored (source or target model
        // file or separate trace file).
        // TODO: Transformation in place or not?
        Resource traceModel = henshinResourceSet.createResource("traces.xmi");
        List<EObject> list = result.getRoots();

        for (EObject root : list) {
            // save all roots
            if (root.getClass() == TraceImpl.class) {
                target.getContents().add(root);
                traceCount++;
            } else {
                if (inPlace) {
                    henshinResourceSet.saveEObject(root, root.eResource()
                            .getURI());
                } else {
                    // create new filename
                    String fileName = getFileName(root);
                    henshinResourceSet.saveEObject(root, fileName);
                }
            }
        }

        if (traceCount > 0) {
            try {
                traceModel.save(null);
            } catch (IOException e) {
                System.out.println("Traces could not be saved!");
            }
        }

        System.out.println("Number of traces: " + traceCount);

    }

    /**
     * 
     * @param root
     * 
     * @return FileName
     */
    private String getFileName(EObject root) {

        String fileUri = root.eResource().getURI().toFileString();
        String extension = fileUri.substring(fileUri.lastIndexOf('.'),
                fileUri.length());
        String fileNameNoExtension = fileUri.substring(
                fileUri.lastIndexOf('/') + 1, fileUri.lastIndexOf('.'));

        return fileNameNoExtension + "_result" + extension;

    }

}
