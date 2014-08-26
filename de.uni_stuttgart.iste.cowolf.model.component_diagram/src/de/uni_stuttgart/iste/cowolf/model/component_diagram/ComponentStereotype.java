/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Stereotype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentStereotype()
 * @model
 * @generated
 */
public enum ComponentStereotype implements Enumerator {
	/**
	 * The '<em><b>Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(0, "Component", "Component"),

	/**
	 * The '<em><b>Subsystem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSYSTEM(1, "Subsystem", "Subsystem"),

	/**
	 * The '<em><b>Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS(2, "Process", "Process"),

	/**
	 * The '<em><b>Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(3, "Service", "Service"),

	/**
	 * The '<em><b>Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFICATION(4, "Specification", "Specification"),

	/**
	 * The '<em><b>Realization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	REALIZATION(5, "Realization", "Realization"),

	/**
	 * The '<em><b>Implement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENT(6, "Implement", "Implement");

	/**
	 * The '<em><b>Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Component</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model name="Component"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 0;

	/**
	 * The '<em><b>Subsystem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subsystem</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSYSTEM
	 * @model name="Subsystem"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSYSTEM_VALUE = 1;

	/**
	 * The '<em><b>Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Process</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESS
	 * @model name="Process"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_VALUE = 2;

	/**
	 * The '<em><b>Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model name="Service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 3;

	/**
	 * The '<em><b>Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Specification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIFICATION
	 * @model name="Specification"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION_VALUE = 4;

	/**
	 * The '<em><b>Realization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Realization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REALIZATION
	 * @model name="Realization"
	 * @generated
	 * @ordered
	 */
	public static final int REALIZATION_VALUE = 5;

	/**
	 * The '<em><b>Implement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENT
	 * @model name="Implement"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Component Stereotype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentStereotype[] VALUES_ARRAY =
		new ComponentStereotype[] {
			COMPONENT,
			SUBSYSTEM,
			PROCESS,
			SERVICE,
			SPECIFICATION,
			REALIZATION,
			IMPLEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Component Stereotype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentStereotype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Stereotype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentStereotype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentStereotype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Stereotype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentStereotype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentStereotype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Stereotype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentStereotype get(int value) {
		switch (value) {
			case COMPONENT_VALUE: return COMPONENT;
			case SUBSYSTEM_VALUE: return SUBSYSTEM;
			case PROCESS_VALUE: return PROCESS;
			case SERVICE_VALUE: return SERVICE;
			case SPECIFICATION_VALUE: return SPECIFICATION;
			case REALIZATION_VALUE: return REALIZATION;
			case IMPLEMENT_VALUE: return IMPLEMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComponentStereotype(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ComponentStereotype
