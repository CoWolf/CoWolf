/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' trace='../../org.eclipse.emf.henshin.trace/model/trace.ecore#/'"
 * @generated
 */
public interface ModelAssociationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModelAssociation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cowolf.model_association/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModelAssociation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelAssociationPackage eINSTANCE = de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationImpl <em>Model Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationImpl
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationPackageImpl#getModelAssociation()
	 * @generated
	 */
	int MODEL_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOCIATION__MODELS = 0;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOCIATION__ASSOCIATIONS = 1;

	/**
	 * The number of structural features of the '<em>Model Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOCIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelImpl
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_ID = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.AssociationImpl
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TRACES = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TIMESTAMP = 3;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelVersionImpl <em>Model Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelVersionImpl
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationPackageImpl#getModelVersion()
	 * @generated
	 */
	int MODEL_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__CURRENT = 2;

	/**
	 * The feature id for the '<em><b>Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__MANUAL = 3;

	/**
	 * The feature id for the '<em><b>Target Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__TARGET_ASSOCIATIONS = 4;

	/**
	 * The feature id for the '<em><b>Source Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION__SOURCE_ASSOCIATIONS = 5;

	/**
	 * The number of structural features of the '<em>Model Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VERSION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation <em>Model Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Association</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation
	 * @generated
	 */
	EClass getModelAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation#getModels()
	 * @see #getModelAssociation()
	 * @generated
	 */
	EReference getModelAssociation_Models();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associations</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation#getAssociations()
	 * @see #getModelAssociation()
	 * @generated
	 */
	EReference getModelAssociation_Associations();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getVersions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Versions();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getModel()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Model();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getModelID <em>Model ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model ID</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getModelID()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelID();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traces</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTraces()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Traces();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTimestamp()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion <em>Model Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Version</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion
	 * @generated
	 */
	EClass getModelVersion();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getModel()
	 * @see #getModelVersion()
	 * @generated
	 */
	EReference getModelVersion_Model();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTimestamp()
	 * @see #getModelVersion()
	 * @generated
	 */
	EAttribute getModelVersion_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#isCurrent()
	 * @see #getModelVersion()
	 * @generated
	 */
	EAttribute getModelVersion_Current();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#isManual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#isManual()
	 * @see #getModelVersion()
	 * @generated
	 */
	EAttribute getModelVersion_Manual();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTargetAssociations <em>Target Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Associations</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTargetAssociations()
	 * @see #getModelVersion()
	 * @generated
	 */
	EReference getModelVersion_TargetAssociations();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getSourceAssociations <em>Source Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Associations</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getSourceAssociations()
	 * @see #getModelVersion()
	 * @generated
	 */
	EReference getModelVersion_SourceAssociations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelAssociationFactory getModelAssociationFactory();

} //ModelAssociationPackage
