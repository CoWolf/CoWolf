/**
 */
package de.uni_stuttgart.iste.cowolf.model.commonBase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBaseFactory
 * @model kind="package"
 * @generated
 */
public interface CommonBasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commonBase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://CommonBase/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commonBase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonBasePackage eINSTANCE = de.uni_stuttgart.iste.cowolf.model.commonBase.impl.CommonBasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl <em>ID Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.impl.CommonBasePackageImpl#getIDBase()
	 * @generated
	 */
	int ID_BASE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASE__ID = 0;

	/**
	 * The number of structural features of the '<em>ID Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ID Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase <em>ID Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Base</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase
	 * @generated
	 */
	EClass getIDBase();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase#getId()
	 * @see #getIDBase()
	 * @generated
	 */
	EAttribute getIDBase_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonBaseFactory getCommonBaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl <em>ID Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.impl.CommonBasePackageImpl#getIDBase()
		 * @generated
		 */
		EClass ID_BASE = eINSTANCE.getIDBase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BASE__ID = eINSTANCE.getIDBase_Id();

	}

} //CommonBasePackage
