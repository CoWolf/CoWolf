/**
 */
package de.uni_stuttgart.iste.cowolf.model.commonBase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage
 * @generated
 */
public interface CommonBaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonBaseFactory eINSTANCE = de.uni_stuttgart.iste.cowolf.model.commonBase.impl.CommonBaseFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonBasePackage getCommonBasePackage();

} //CommonBaseFactory
