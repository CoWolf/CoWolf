/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Scheduling Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getTaskSchedulingType()
 * @model extendedMetaData="name='TaskSchedulingType'"
 * @generated
 */
public enum TaskSchedulingType implements Enumerator {
	/**
	 * The '<em><b>Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REF_VALUE
	 * @generated
	 * @ordered
	 */
	REF(0, "ref", "ref"),

	/**
	 * The '<em><b>Fcfs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FCFS_VALUE
	 * @generated
	 * @ordered
	 */
	FCFS(1, "fcfs", "fcfs"),

	/**
	 * The '<em><b>Pri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRI_VALUE
	 * @generated
	 * @ordered
	 */
	PRI(2, "pri", "pri"),

	/**
	 * The '<em><b>Hol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOL_VALUE
	 * @generated
	 * @ordered
	 */
	HOL(3, "hol", "hol"),

	/**
	 * The '<em><b>Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURST_VALUE
	 * @generated
	 * @ordered
	 */
	BURST(4, "burst", "burst"),

	/**
	 * The '<em><b>Poll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLL_VALUE
	 * @generated
	 * @ordered
	 */
	POLL(5, "poll", "poll"),

	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(6, "inf", "inf"),

	/**
	 * The '<em><b>Semaphore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMAPHORE_VALUE
	 * @generated
	 * @ordered
	 */
	SEMAPHORE(7, "semaphore", "semaphore");

	/**
	 * The '<em><b>Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REF
	 * @model name="ref"
	 * @generated
	 * @ordered
	 */
	public static final int REF_VALUE = 0;

	/**
	 * The '<em><b>Fcfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fcfs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FCFS
	 * @model name="fcfs"
	 * @generated
	 * @ordered
	 */
	public static final int FCFS_VALUE = 1;

	/**
	 * The '<em><b>Pri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pri</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRI
	 * @model name="pri"
	 * @generated
	 * @ordered
	 */
	public static final int PRI_VALUE = 2;

	/**
	 * The '<em><b>Hol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOL
	 * @model name="hol"
	 * @generated
	 * @ordered
	 */
	public static final int HOL_VALUE = 3;

	/**
	 * The '<em><b>Burst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Burst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BURST
	 * @model name="burst"
	 * @generated
	 * @ordered
	 */
	public static final int BURST_VALUE = 4;

	/**
	 * The '<em><b>Poll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poll</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLL
	 * @model name="poll"
	 * @generated
	 * @ordered
	 */
	public static final int POLL_VALUE = 5;

	/**
	 * The '<em><b>Inf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model name="inf"
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 6;

	/**
	 * The '<em><b>Semaphore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semaphore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMAPHORE
	 * @model name="semaphore"
	 * @generated
	 * @ordered
	 */
	public static final int SEMAPHORE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Task Scheduling Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskSchedulingType[] VALUES_ARRAY =
		new TaskSchedulingType[] {
			REF,
			FCFS,
			PRI,
			HOL,
			BURST,
			POLL,
			INF,
			SEMAPHORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Task Scheduling Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaskSchedulingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Scheduling Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskSchedulingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskSchedulingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Scheduling Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskSchedulingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskSchedulingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Scheduling Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskSchedulingType get(int value) {
		switch (value) {
			case REF_VALUE: return REF;
			case FCFS_VALUE: return FCFS;
			case PRI_VALUE: return PRI;
			case HOL_VALUE: return HOL;
			case BURST_VALUE: return BURST;
			case POLL_VALUE: return POLL;
			case INF_VALUE: return INF;
			case SEMAPHORE_VALUE: return SEMAPHORE;
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
	private TaskSchedulingType(int value, String name, String literal) {
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
	
} //TaskSchedulingType
