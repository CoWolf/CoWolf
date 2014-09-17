package de.uni_stuttgart.iste.cowolf.transformation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransformationRegistry {
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(TransformationRegistry.class);
	
	/**
	 * ID for the transformation manager extension.
	 */
	public static final String TRANSFORMATION_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.transformationManagerExtension"; //$NON-NLS-1$
	
	private static TransformationRegistry INSTANCE = new TransformationRegistry();
	
	/**
	 * Holds an instance of all installed TransformationModelManager.
	 */
	private List<AbstractTransformationManager> transformationManagers;
	/**
	 * Caches the mapping from file extensions to model manager.
	 */
	private Map<Class<?>, Set<Class<?>>> modelTransformationRegistry;

	private TransformationRegistry() {
		this.modelTransformationRegistry = new HashMap<>();
		
		this.createTransformationManagerExtensions();
	}
	
	public static TransformationRegistry getInstance() {
		return INSTANCE;
	}

	/**
	 * Create the transformation manager extensions, which are registered.
	 */
	private void createTransformationManagerExtensions() {
	    this.transformationManagers = this.createExecuteableExtensions(
	
	    TRANSFORMATION_MANAGER_EXTENSION_ID,
	            "class", AbstractTransformationManager.class); //$NON-NLS-1$
	
	    
	    for (AbstractTransformationManager manager : this.transformationManagers) {
	    	if (manager.isManaged(manager.getManagedClass1(), manager.getManagedClass2())) {
	    		if (!this.modelTransformationRegistry.containsKey(manager.getManagedClass1())) {
	        		this.modelTransformationRegistry.put(manager.getManagedClass1(), new HashSet<Class<?>>());
	        	}
	    		this.modelTransformationRegistry.get(manager.getManagedClass1()).add(manager.getManagedClass2());
	    	}
	    	if (manager.isManaged(manager.getManagedClass2(), manager.getManagedClass1())) {
	    		if (!this.modelTransformationRegistry.containsKey(manager.getManagedClass2())) {
	        		this.modelTransformationRegistry.put(manager.getManagedClass2(), new HashSet<Class<?>>());
	        	}
	    		this.modelTransformationRegistry.get(manager.getManagedClass2()).add(manager.getManagedClass1());
	    	}
	    }
	    
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

	/**
	 * Returns all possible transformation (co-evolution) targets for the given class.
	 * 
	 * @param source the transformation source class
	 * @return set of transformation target's model managers.
	 * 			Always returns a set, never null.
	 */
	public Set<Class<?>> getTargetTransformations(Class<?> source) {
		if (!this.modelTransformationRegistry.containsKey(source)) {
			return new HashSet<Class<?>>(0);
		}
		return this.modelTransformationRegistry.get(source);
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
            	LOGGER.error("", e1);
            }
        }
        return extensions;
    }

}
