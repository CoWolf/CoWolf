/**
 */
package sequence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sequence.Actor;
import sequence.AltBlock;
import sequence.Lifeline;
import sequence.LoopBlock;
import sequence.SequencePackage;
import sequence.optBlock;
import sequence.topLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>top Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sequence.impl.topLayerImpl#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link sequence.impl.topLayerImpl#getLoopBlocks <em>Loop Blocks</em>}</li>
 *   <li>{@link sequence.impl.topLayerImpl#getAltBlocks <em>Alt Blocks</em>}</li>
 *   <li>{@link sequence.impl.topLayerImpl#getOptBlocks <em>Opt Blocks</em>}</li>
 *   <li>{@link sequence.impl.topLayerImpl#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class topLayerImpl extends ContainerImpl implements topLayer {
	/**
	 * The cached value of the '{@link #getLifelines() <em>Lifelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifelines()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> lifelines;

	/**
	 * The cached value of the '{@link #getLoopBlocks() <em>Loop Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<LoopBlock> loopBlocks;

	/**
	 * The cached value of the '{@link #getAltBlocks() <em>Alt Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<AltBlock> altBlocks;

	/**
	 * The cached value of the '{@link #getOptBlocks() <em>Opt Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<optBlock> optBlocks;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected topLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencePackage.Literals.TOP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getLifelines() {
		if (lifelines == null) {
			lifelines = new EObjectContainmentEList<Lifeline>(Lifeline.class, this, SequencePackage.TOP_LAYER__LIFELINES);
		}
		return lifelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopBlock> getLoopBlocks() {
		if (loopBlocks == null) {
			loopBlocks = new EObjectContainmentEList<LoopBlock>(LoopBlock.class, this, SequencePackage.TOP_LAYER__LOOP_BLOCKS);
		}
		return loopBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AltBlock> getAltBlocks() {
		if (altBlocks == null) {
			altBlocks = new EObjectContainmentEList<AltBlock>(AltBlock.class, this, SequencePackage.TOP_LAYER__ALT_BLOCKS);
		}
		return altBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<optBlock> getOptBlocks() {
		if (optBlocks == null) {
			optBlocks = new EObjectContainmentEList<optBlock>(optBlock.class, this, SequencePackage.TOP_LAYER__OPT_BLOCKS);
		}
		return optBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, SequencePackage.TOP_LAYER__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequencePackage.TOP_LAYER__LIFELINES:
				return ((InternalEList<?>)getLifelines()).basicRemove(otherEnd, msgs);
			case SequencePackage.TOP_LAYER__LOOP_BLOCKS:
				return ((InternalEList<?>)getLoopBlocks()).basicRemove(otherEnd, msgs);
			case SequencePackage.TOP_LAYER__ALT_BLOCKS:
				return ((InternalEList<?>)getAltBlocks()).basicRemove(otherEnd, msgs);
			case SequencePackage.TOP_LAYER__OPT_BLOCKS:
				return ((InternalEList<?>)getOptBlocks()).basicRemove(otherEnd, msgs);
			case SequencePackage.TOP_LAYER__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequencePackage.TOP_LAYER__LIFELINES:
				return getLifelines();
			case SequencePackage.TOP_LAYER__LOOP_BLOCKS:
				return getLoopBlocks();
			case SequencePackage.TOP_LAYER__ALT_BLOCKS:
				return getAltBlocks();
			case SequencePackage.TOP_LAYER__OPT_BLOCKS:
				return getOptBlocks();
			case SequencePackage.TOP_LAYER__ACTORS:
				return getActors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SequencePackage.TOP_LAYER__LIFELINES:
				getLifelines().clear();
				getLifelines().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case SequencePackage.TOP_LAYER__LOOP_BLOCKS:
				getLoopBlocks().clear();
				getLoopBlocks().addAll((Collection<? extends LoopBlock>)newValue);
				return;
			case SequencePackage.TOP_LAYER__ALT_BLOCKS:
				getAltBlocks().clear();
				getAltBlocks().addAll((Collection<? extends AltBlock>)newValue);
				return;
			case SequencePackage.TOP_LAYER__OPT_BLOCKS:
				getOptBlocks().clear();
				getOptBlocks().addAll((Collection<? extends optBlock>)newValue);
				return;
			case SequencePackage.TOP_LAYER__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SequencePackage.TOP_LAYER__LIFELINES:
				getLifelines().clear();
				return;
			case SequencePackage.TOP_LAYER__LOOP_BLOCKS:
				getLoopBlocks().clear();
				return;
			case SequencePackage.TOP_LAYER__ALT_BLOCKS:
				getAltBlocks().clear();
				return;
			case SequencePackage.TOP_LAYER__OPT_BLOCKS:
				getOptBlocks().clear();
				return;
			case SequencePackage.TOP_LAYER__ACTORS:
				getActors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SequencePackage.TOP_LAYER__LIFELINES:
				return lifelines != null && !lifelines.isEmpty();
			case SequencePackage.TOP_LAYER__LOOP_BLOCKS:
				return loopBlocks != null && !loopBlocks.isEmpty();
			case SequencePackage.TOP_LAYER__ALT_BLOCKS:
				return altBlocks != null && !altBlocks.isEmpty();
			case SequencePackage.TOP_LAYER__OPT_BLOCKS:
				return optBlocks != null && !optBlocks.isEmpty();
			case SequencePackage.TOP_LAYER__ACTORS:
				return actors != null && !actors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //topLayerImpl
