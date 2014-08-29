/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynch Call Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getDest <em>Dest</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getFanin <em>Fanin</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getFanout <em>Fanout</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getAsynchCallType()
 * @model extendedMetaData="name='asynch-call_._type' kind='empty'"
 * @generated
 */
public interface AsynchCallType extends IDBase {
	/**
	 * Returns the value of the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' attribute.
	 * @see #setDest(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getAsynchCallType_Dest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='dest' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDest();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getDest <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' attribute.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(String value);

	/**
	 * Returns the value of the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fanin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fanin</em>' attribute.
	 * @see #isSetFanin()
	 * @see #unsetFanin()
	 * @see #setFanin(int)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getAsynchCallType_Fanin()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='fanin' namespace='##targetNamespace'"
	 * @generated
	 */
	int getFanin();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getFanin <em>Fanin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fanin</em>' attribute.
	 * @see #isSetFanin()
	 * @see #unsetFanin()
	 * @see #getFanin()
	 * @generated
	 */
	void setFanin(int value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getFanin <em>Fanin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFanin()
	 * @see #getFanin()
	 * @see #setFanin(int)
	 * @generated
	 */
	void unsetFanin();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getFanin <em>Fanin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fanin</em>' attribute is set.
	 * @see #unsetFanin()
	 * @see #getFanin()
	 * @see #setFanin(int)
	 * @generated
	 */
	boolean isSetFanin();

	/**
	 * Returns the value of the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fanout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fanout</em>' attribute.
	 * @see #isSetFanout()
	 * @see #unsetFanout()
	 * @see #setFanout(int)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getAsynchCallType_Fanout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='fanout' namespace='##targetNamespace'"
	 * @generated
	 */
	int getFanout();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getFanout <em>Fanout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fanout</em>' attribute.
	 * @see #isSetFanout()
	 * @see #unsetFanout()
	 * @see #getFanout()
	 * @generated
	 */
	void setFanout(int value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getFanout <em>Fanout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFanout()
	 * @see #getFanout()
	 * @see #setFanout(int)
	 * @generated
	 */
	void unsetFanout();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType#getFanout <em>Fanout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fanout</em>' attribute is set.
	 * @see #unsetFanout()
	 * @see #getFanout()
	 * @see #setFanout(int)
	 * @generated
	 */
	boolean isSetFanout();

} // AsynchCallType
