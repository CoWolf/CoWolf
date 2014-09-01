package de.uni_stuttgart.iste.cowolf.core.extensions;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;
import de.uni_stuttgart.iste.cowolf.model.AbstractModelManager;
import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * Handler which knows the provided extensions.
 */
public class ExtensionHandler {

    /**
     * ID for the QoS model manager extension.
     */
    public static final String QOS_MODEL_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.model.qosModelManagerExtension"; //$NON-NLS-1$

    /**
     * ID for the architecture model manager extension.
     */
    public static final String ARCHITECTURE_MODEL_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.model.architectureModelManagerExtension"; //$NON-NLS-1$

    /**
     * ID for the evolution manager extension.
     */
    public static final String EVOLUTION_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.evolution.evolutionManagerExtension"; //$NON-NLS-1$

    /**
     * ID for the transformation manager extension.
     */
    public static final String TRANSFORMATION_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.transformationManagerExtension"; //$NON-NLS-1$

    /**
     * Holds an instance of all installed QoSModelManager.
     */
    private List<AbstractQoSModelManager> qosModelManagers;

    /**
     * Holds an instance of all installed ArchitectureModelManager.
     */
    private List<AbstractArchitectureModelManager> architectureModelManagers;

    /**
     * Holds an instance of all installed EvolutionModelManager.
     */
    private List<AbstractEvolutionManager> evolutionManagers;

    /**
     * Holds an instance of all installed TransformationModelManager.
     */
    private List<AbstractTransformationManager> transformationManagers;

    /**
     * Singleton
     */
    private static final ExtensionHandler INSTANCE = new ExtensionHandler();

    /**
     * Basic constructor. Initializes model managers.
     */
    private ExtensionHandler() {
        this.refreshManagers();
    }

    public static ExtensionHandler getInstance() {
        return INSTANCE;
    }

    /**
     * Refreshes the list of model managers.
     */
    private void refreshManagers() {
        this.createQoSModelManagerExtensions();
        this.createArchitectureModelManagerExtensions();
        this.createEvolutionManagerExtensions();
        this.createTransformationManagerExtensions();
    }

    /**
     * Create the QoS model manager extensions, which are registered.
     */
    private void createQoSModelManagerExtensions() {

        this.qosModelManagers = this.createExecuteableExtensions(
                QOS_MODEL_MANAGER_EXTENSION_ID, "class",
                AbstractQoSModelManager.class);

    }

    /**
     * Create the architecture model manager extensions, which are registered.
     */
    private void createArchitectureModelManagerExtensions() {
        this.architectureModelManagers = this.createExecuteableExtensions(
                ARCHITECTURE_MODEL_MANAGER_EXTENSION_ID, "class",
                AbstractArchitectureModelManager.class);

    }

    /**
     * Create the evolution manager extensions, which are registered.
     */
    private void createEvolutionManagerExtensions() {
        this.evolutionManagers = this
                .createExecuteableExtensions(

                EVOLUTION_MANAGER_EXTENSION_ID,
                        "class", AbstractEvolutionManager.class); //$NON-NLS-1$

    }

    /**
     * Create the transformation manager extensions, which are registered.
     */
    private void createTransformationManagerExtensions() {
        this.transformationManagers = this.createExecuteableExtensions(

        TRANSFORMATION_MANAGER_EXTENSION_ID,
                "class", AbstractTransformationManager.class); //$NON-NLS-1$

    }

    /**
     * Creates the given executable extensions specified by their extension id,
     * propertyName and class type.
     *
     * @param extensionPointID
     *            the unique identifier of the extension point
     * @param propertyName
     *            the name of the property have to be a class
     * @param type
     *            class type of the interface
     * @return All created extensions.
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> createExecuteableExtensions(String extensionPointID,
            String propertyName, Class<T> type) {
        final IExtensionRegistry registry = Platform.getExtensionRegistry();
        final IConfigurationElement[] config = registry
                .getConfigurationElementsFor(extensionPointID);
        final List<T> extensions = new LinkedList<T>();
        for (final IConfigurationElement element : config) {
            Object obj;
            try {
                obj = element.createExecutableExtension(propertyName);
                if (obj != null && type.isAssignableFrom(obj.getClass())) {
                    extensions.add((T) obj);
                }
            } catch (final CoreException e1) {
                e1.printStackTrace();
            }
        }
        return extensions;
    }

    /**
     * Searches the model manager for a given model, which handles this type of
     * model.
     * 
     * @param model
     *            model to search for a manager.
     * @return IModelManager, which can handle this model or null if none is
     *         defined or installed.
     */
    public AbstractModelManager getModelManager(Resource model) {
        for (final AbstractModelManager manager : this.architectureModelManagers) {
            if (manager.isManaged(model)) {
                return manager;
            }
        }

        for (final AbstractModelManager manager : this.qosModelManagers) {
            if (manager.isManaged(model)) {
                return manager;
            }
        }
        return null;
    }

    /**
     * Searches the evolution manager for a given model, which handles this type
     * of model.
     * 
     * @param model
     *            model to search for a manager.
     * @return IModelManager, which can handle this model or null if none is
     *         defined or installed.
     */
    public AbstractEvolutionManager getEvolutionManager(Resource model) {
        for (final AbstractEvolutionManager manager : this.evolutionManagers) {
            if (manager.isManaged(model)) {
                return manager;
            }
        }
        return null;
    }

    /**
     * Searches the right transformation manager for a given transformation from
     * source to target.
     * 
     * @param source
     *            Source model of transformation
     * @param target
     *            Target model of transformation
     * @return TransformationManager, which is responsible for this
     *         transformation, null if none is registered or installed.
     */
    public AbstractTransformationManager getTransformationManager(
            Resource source, Resource target) {
        for (final AbstractTransformationManager manager : this.transformationManagers) {
            if (manager.isManaged(source, target)) {
                return manager;
            }
        }
        return null;
    }

    public List<String> getAllModelNames() {
        List<String> allModelNames = new ArrayList<String>();

        for (AbstractQoSModelManager manager : qosModelManagers) {
            allModelNames.add(manager.getModelName());
        }
        for (AbstractArchitectureModelManager manager : architectureModelManagers) {
            allModelNames.add(manager.getModelName());
        }
        return allModelNames;
    }

    public List<String> getAllModelDocumentTypes() {
        List<String> allModelNames = new ArrayList<String>();

        for (AbstractQoSModelManager manager : qosModelManagers) {
            allModelNames.add(manager.getModelNamespace());
        }
        for (AbstractArchitectureModelManager manager : architectureModelManagers) {
            allModelNames.add(manager.getModelNamespace());
        }

        return allModelNames;
    }

    public List<OutputStream> createAllCommandLineExecutionListener() {
    	return this.createExecuteableExtensions("de.uni_stuttgart.iste.cowolf.core.CommandLineExecutionListener", "class", OutputStream.class);
    }
}
