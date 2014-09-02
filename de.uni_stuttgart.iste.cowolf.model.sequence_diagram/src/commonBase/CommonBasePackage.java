/**
 */
package commonBase;

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
 * @see commonBase.CommonBaseFactory
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
	CommonBasePackage eINSTANCE = commonBase.impl.CommonBasePackageImpl.init();

	/**
	 * The meta object id for the '{@link commonBase.impl.IDBaseImpl <em>ID Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commonBase.impl.IDBaseImpl
	 * @see commonBase.impl.CommonBasePackageImpl#getIDBase()
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
	 * The meta object id for the '{@link commonBase.impl.NameBaseImpl <em>Name Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commonBase.impl.NameBaseImpl
	 * @see commonBase.impl.CommonBasePackageImpl#getNameBase()
	 * @generated
	 */
	int NAME_BASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link commonBase.IDBase <em>ID Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Base</em>'.
	 * @see commonBase.IDBase
	 * @generated
	 */
	EClass getIDBase();

	/**
	 * Returns the meta object for the attribute '{@link commonBase.IDBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see commonBase.IDBase#getId()
	 * @see #getIDBase()
	 * @generated
	 */
	EAttribute getIDBase_Id();

	/**
	 * Returns the meta object for class '{@link commonBase.NameBase <em>Name Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Base</em>'.
	 * @see commonBase.NameBase
	 * @generated
	 */
	EClass getNameBase();

	/**
	 * Returns the meta object for the attribute '{@link commonBase.NameBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commonBase.NameBase#getName()
	 * @see #getNameBase()
	 * @generated
	 */
	EAttribute getNameBase_Name();

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
		 * The meta object literal for the '{@link commonBase.impl.IDBaseImpl <em>ID Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commonBase.impl.IDBaseImpl
		 * @see commonBase.impl.CommonBasePackageImpl#getIDBase()
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

		/**
		 * The meta object literal for the '{@link commonBase.impl.NameBaseImpl <em>Name Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commonBase.impl.NameBaseImpl
		 * @see commonBase.impl.CommonBasePackageImpl#getNameBase()
		 * @generated
		 */
		EClass NAME_BASE = eINSTANCE.getNameBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_BASE__NAME = eINSTANCE.getNameBase_Name();

	}

} //CommonBasePackage
