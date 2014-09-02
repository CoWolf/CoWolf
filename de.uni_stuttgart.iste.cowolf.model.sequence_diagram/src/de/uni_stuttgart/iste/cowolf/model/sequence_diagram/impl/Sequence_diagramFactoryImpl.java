/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sequence_diagramFactoryImpl extends EFactoryImpl implements Sequence_diagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sequence_diagramFactory init() {
		try {
			Sequence_diagramFactory theSequence_diagramFactory = (Sequence_diagramFactory)EPackage.Registry.INSTANCE.getEFactory(Sequence_diagramPackage.eNS_URI);
			if (theSequence_diagramFactory != null) {
				return theSequence_diagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Sequence_diagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_diagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Sequence_diagramPackage.LIFELINE: return createLifeline();
			case Sequence_diagramPackage.TASK: return createTask();
			case Sequence_diagramPackage.LOOP_BLOCK: return createLoopBlock();
			case Sequence_diagramPackage.ALT_BLOCK: return createAltBlock();
			case Sequence_diagramPackage.ALTERNATIVE: return createAlternative();
			case Sequence_diagramPackage.OPT_BLOCK: return createoptBlock();
			case Sequence_diagramPackage.TOP_LAYER: return createtopLayer();
			case Sequence_diagramPackage.INITIAL_MESSAGE: return createInitialMessage();
			case Sequence_diagramPackage.ACTOR: return createActor();
			case Sequence_diagramPackage.SPECIAL_MESSAGE: return createSpecialMessage();
			case Sequence_diagramPackage.NORMAL_MESSAGE: return createNormalMessage();
			case Sequence_diagramPackage.SEQUENCE: return createSequence();
			case Sequence_diagramPackage.BLOCK_BASE: return createBlockBase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Sequence_diagramPackage.MESSAGE_KIND:
				return createMessageKindFromString(eDataType, initialValue);
			case Sequence_diagramPackage.MESSAGE_SORT_SPECIAL:
				return createMessageSortSpecialFromString(eDataType, initialValue);
			case Sequence_diagramPackage.MESSAGE_SORT_NORMAL:
				return createMessageSortNormalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Sequence_diagramPackage.MESSAGE_KIND:
				return convertMessageKindToString(eDataType, instanceValue);
			case Sequence_diagramPackage.MESSAGE_SORT_SPECIAL:
				return convertMessageSortSpecialToString(eDataType, instanceValue);
			case Sequence_diagramPackage.MESSAGE_SORT_NORMAL:
				return convertMessageSortNormalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopBlock createLoopBlock() {
		LoopBlockImpl loopBlock = new LoopBlockImpl();
		return loopBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltBlock createAltBlock() {
		AltBlockImpl altBlock = new AltBlockImpl();
		return altBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public optBlock createoptBlock() {
		optBlockImpl optBlock = new optBlockImpl();
		return optBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public topLayer createtopLayer() {
		topLayerImpl topLayer = new topLayerImpl();
		return topLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialMessage createInitialMessage() {
		InitialMessageImpl initialMessage = new InitialMessageImpl();
		return initialMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialMessage createSpecialMessage() {
		SpecialMessageImpl specialMessage = new SpecialMessageImpl();
		return specialMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalMessage createNormalMessage() {
		NormalMessageImpl normalMessage = new NormalMessageImpl();
		return normalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockBase createBlockBase() {
		BlockBaseImpl blockBase = new BlockBaseImpl();
		return blockBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindFromString(EDataType eDataType, String initialValue) {
		MessageKind result = MessageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSortSpecial createMessageSortSpecialFromString(EDataType eDataType, String initialValue) {
		MessageSortSpecial result = MessageSortSpecial.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortSpecialToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSortNormal createMessageSortNormalFromString(EDataType eDataType, String initialValue) {
		MessageSortNormal result = MessageSortNormal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortNormalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_diagramPackage getSequence_diagramPackage() {
		return (Sequence_diagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Sequence_diagramPackage getPackage() {
		return Sequence_diagramPackage.eINSTANCE;
	}

} //Sequence_diagramFactoryImpl
