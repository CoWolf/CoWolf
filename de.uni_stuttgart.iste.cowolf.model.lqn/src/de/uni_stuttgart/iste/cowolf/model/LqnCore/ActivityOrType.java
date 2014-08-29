/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Or Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityOrType()
 * @model extendedMetaData="name='ActivityOrType' kind='empty'"
 * @generated
 */
public interface ActivityOrType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Prob</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' attribute.
	 * @see #isSetProb()
	 * @see #unsetProb()
	 * @see #setProb(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityOrType_Prob()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='prob' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProb();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #isSetProb()
	 * @see #unsetProb()
	 * @see #getProb()
	 * @generated
	 */
	void setProb(String value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProb()
	 * @see #getProb()
	 * @see #setProb(String)
	 * @generated
	 */
	void unsetProb();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType#getProb <em>Prob</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prob</em>' attribute is set.
	 * @see #unsetProb()
	 * @see #getProb()
	 * @see #setProb(String)
	 * @generated
	 */
	boolean isSetProb();

} // ActivityOrType
