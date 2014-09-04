package de.uni_stuttgart.iste.cowolf.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;

public class ModelRegistry {

	/**
	 * ID for the QoS model manager extension.
	 */
	public static final String QOS_MODEL_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.model.qosModelManagerExtension"; //$NON-NLS-1$
	/**
	 * ID for the architecture model manager extension.
	 */
	public static final String ARCHITECTURE_MODEL_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.model.architectureModelManagerExtension"; //$NON-NLS-1$
	
	private static ModelRegistry INSTANCE = new ModelRegistry();
	
	/**
	 * Holds an instance of all installed QoSModelManager.
	 */
	private List<AbstractQoSModelManager> qosModelManagers;
	/**
	 * Holds an instance of all installed ArchitectureModelManager.
	 */
	private List<AbstractArchitectureModelManager> architectureModelManagers;
	/**
	 * Index of model file extensions to model manager.
	 */
	private Map<String, AbstractModelManager> modelFileExtensionIndex;
	/**
	 * Index of model classes to model manager.
	 */
	private Map<Class<?>, AbstractModelManager> modelClassIndex;

	private ModelRegistry() {
		this.modelFileExtensionIndex = new HashMap<>();
    	this.modelClassIndex = new HashMap<>();
    	
    	this.createArchitectureModelManagerExtensions();
    	this.createQoSModelManagerExtensions();
	}
	
	public static ModelRegistry getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Create the QoS model manager extensions, which are registered.
	 */
	private void createQoSModelManagerExtensions() {
	
	    this.qosModelManagers = this.createExecuteableExtensions(
	            QOS_MODEL_MANAGER_EXTENSION_ID, "class",
	            AbstractQoSModelManager.class);
	
	    for (AbstractQoSModelManager manager : this.qosModelManagers) {
	    	this.modelFileExtensionIndex.put(manager.getFileExtension(), manager);
	    	this.modelClassIndex.put(manager.getManagedClass(), manager);
	    }
	}

	/**
	 * Create the architecture model manager extensions, which are registered.
	 */
	private void createArchitectureModelManagerExtensions() {
	    this.architectureModelManagers = this.createExecuteableExtensions(
	            ARCHITECTURE_MODEL_MANAGER_EXTENSION_ID, "class",
	            AbstractArchitectureModelManager.class);
	
	    for (AbstractModelManager manager : this.architectureModelManagers) {
	    	this.modelFileExtensionIndex.put(manager.getFileExtension(), manager);
	    	this.modelClassIndex.put(manager.getManagedClass(), manager);
	    }
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

	public AbstractModelManager getModelManager(String extension) {
		return this.modelFileExtensionIndex.get(extension);
	}

	public AbstractModelManager getModelManager(Class<?> managedClass) {
		return this.modelClassIndex.get(managedClass);
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

	/**
	 * Returns whether models with the given file extension are managed.
	 * 
	 * @param extension file extension (without leading .)
	 * @return true if there is a model manager for this extension, false otherwise.
	 */
	public boolean isModelManaged(String extension) {
		return this.modelFileExtensionIndex.containsKey(extension);
	}

	/**
	 * Returns a set of all supported file extensions.
	 * 
	 * @return set of file extension strings
	 */
	public Set<String> getAllModelFileExtensions() {
		return this.modelFileExtensionIndex.keySet();
	}

}
