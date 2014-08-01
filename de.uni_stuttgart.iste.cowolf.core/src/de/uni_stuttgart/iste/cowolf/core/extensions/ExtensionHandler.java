package de.uni_stuttgart.iste.cowolf.core.extensions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.model.IArchitectureModelManager;
import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * Handler which knows the provided extensions.
 */
public class ExtensionHandler {

	/**
	 * ID for the QoS model manager extension.
	 */
	public static final String QOS_MODEL_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.model.QoSModelManagerExtension";

	/**
	 * ID for the architecture model manager extension.
	 */
	public static final String ARCHITECTURE_MODEL_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.model.ArchitectureModelManagerExtension";

	/**
	 * ID for the evolution manager extension.
	 */
	public static final String EVOLUTION_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.evolution.EvolutionManagerExtension";

	/**
	 * ID for the transformation manager extension.
	 */
	public static final String TRANSFORMATION_MANAGER_EXTENSION_ID = "de.uni_stuttgart.iste.cowolf.TransformationManagerExtension";

	/**
	 * Create the QoS model manager extensions, which are registered.
	 * @return created QoS model manager extensions.
	 */
	public static List<IQoSModelManager> createQoSModelManagerExtensions() {
		final List<IQoSModelManager> modelManagers = createExecuteableExtensions(QOS_MODEL_MANAGER_EXTENSION_ID, "class", IQoSModelManager.class);
		return modelManagers;
	}

	/**
	 * Create the architecture model manager extensions, which are registered.
	 * @return created architecture model manager extensions.
	 */
	public static List<IArchitectureModelManager> createArchitectureModelManagerExtensions() {
		final List<IArchitectureModelManager> modelManagers = createExecuteableExtensions(ARCHITECTURE_MODEL_MANAGER_EXTENSION_ID, "class", IArchitectureModelManager.class);
		return modelManagers;
	}

	/**
	 * Create the evolution manager extensions, which are registered.
	 * @return created evolution manager extensions.
	 */
	public static List<AbstractEvolutionManager> createTransformationManagerExtensions() {
		final List<AbstractEvolutionManager> modelManagers = createExecuteableExtensions(EVOLUTION_MANAGER_EXTENSION_ID, "class", AbstractEvolutionManager.class);
		return modelManagers;
	}

	/**
	 * Create the transformation manager extensions, which are registered.
	 * @return created transformation manager extensions.
	 */
	public static List<AbstractTransformationManager> createEvolutionManagerExtensions() {
		final List<AbstractTransformationManager> modelManagers = createExecuteableExtensions(TRANSFORMATION_MANAGER_EXTENSION_ID, "class", AbstractTransformationManager.class);
		return modelManagers;
	}

	/**
	 * Creates the given executable extensions specified by their extension id, propertyName and class type.
	 *
	 * @param extensionPointID the unique identifier of the extension point
	 * @param propertyName the name of the property have to be a class
	 * @param type class type of the interface
	 * @return All created extensions.
	 */
	@SuppressWarnings("unchecked")
	private static <T> List<T> createExecuteableExtensions(String extensionPointID, String propertyName, Class<T> type) {
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		final IConfigurationElement[] config = registry.getConfigurationElementsFor(extensionPointID);
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
}
