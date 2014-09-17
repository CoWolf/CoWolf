package de.uni_stuttgart.iste.cowolf.evolution;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Handler which knows the provided extensions.
 */
public class EvolutionRegistry {

    /**
     * ID for the evolution manager extension.
     */
    public static final String EVOLUTION_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.evolution.evolutionManagerExtension"; //$NON-NLS-1$

    /**
     * Holds an instance of all installed EvolutionModelManager.
     */
    private List<AbstractEvolutionManager> evolutionManagers;

    /**
     * Singleton
     */
    private static final EvolutionRegistry INSTANCE = new EvolutionRegistry();

    /**
     * Basic constructor. Initializes model managers.
     */
    private EvolutionRegistry() {
        this.refreshManagers();
    }

    public static EvolutionRegistry getInstance() {
        return INSTANCE;
    }

    /**
     * Refreshes the list of model managers.
     */
    private void refreshManagers() {
        this.createEvolutionManagerExtensions();
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
    
    public AbstractEvolutionManager getEvolutionManager(Class<?> modelClass) {
    	for (final AbstractEvolutionManager manager : this.evolutionManagers) {
            if (manager.isManaged(modelClass)) {
                return manager;
            }
        }
        return null;
    }

}
