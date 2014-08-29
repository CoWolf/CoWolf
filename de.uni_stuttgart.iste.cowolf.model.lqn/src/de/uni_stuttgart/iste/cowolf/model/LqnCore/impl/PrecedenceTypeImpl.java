/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityListType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopListType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OrListType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.SingleActivityListType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl#getPreOR <em>Pre OR</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl#getPreAND <em>Pre AND</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl#getPost <em>Post</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl#getPostOR <em>Post OR</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl#getPostAND <em>Post AND</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl#getPostLOOP <em>Post LOOP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceTypeImpl extends IDBaseImpl implements PrecedenceType {
	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected SingleActivityListType pre;

	/**
	 * The cached value of the '{@link #getPreOR() <em>Pre OR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreOR()
	 * @generated
	 * @ordered
	 */
	protected ActivityListType preOR;

	/**
	 * The cached value of the '{@link #getPreAND() <em>Pre AND</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAND()
	 * @generated
	 * @ordered
	 */
	protected AndJoinListType preAND;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected SingleActivityListType post;

	/**
	 * The cached value of the '{@link #getPostOR() <em>Post OR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostOR()
	 * @generated
	 * @ordered
	 */
	protected OrListType postOR;

	/**
	 * The cached value of the '{@link #getPostAND() <em>Post AND</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostAND()
	 * @generated
	 * @ordered
	 */
	protected ActivityListType postAND;

	/**
	 * The cached value of the '{@link #getPostLOOP() <em>Post LOOP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostLOOP()
	 * @generated
	 * @ordered
	 */
	protected ActivityLoopListType postLOOP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.PRECEDENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleActivityListType getPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPre(SingleActivityListType newPre, NotificationChain msgs) {
		SingleActivityListType oldPre = pre;
		pre = newPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__PRE, oldPre, newPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(SingleActivityListType newPre) {
		if (newPre != pre) {
			NotificationChain msgs = null;
			if (pre != null)
				msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__PRE, null, msgs);
			if (newPre != null)
				msgs = ((InternalEObject)newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__PRE, null, msgs);
			msgs = basicSetPre(newPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__PRE, newPre, newPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityListType getPreOR() {
		return preOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreOR(ActivityListType newPreOR, NotificationChain msgs) {
		ActivityListType oldPreOR = preOR;
		preOR = newPreOR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__PRE_OR, oldPreOR, newPreOR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreOR(ActivityListType newPreOR) {
		if (newPreOR != preOR) {
			NotificationChain msgs = null;
			if (preOR != null)
				msgs = ((InternalEObject)preOR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__PRE_OR, null, msgs);
			if (newPreOR != null)
				msgs = ((InternalEObject)newPreOR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__PRE_OR, null, msgs);
			msgs = basicSetPreOR(newPreOR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__PRE_OR, newPreOR, newPreOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndJoinListType getPreAND() {
		return preAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAND(AndJoinListType newPreAND, NotificationChain msgs) {
		AndJoinListType oldPreAND = preAND;
		preAND = newPreAND;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__PRE_AND, oldPreAND, newPreAND);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAND(AndJoinListType newPreAND) {
		if (newPreAND != preAND) {
			NotificationChain msgs = null;
			if (preAND != null)
				msgs = ((InternalEObject)preAND).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__PRE_AND, null, msgs);
			if (newPreAND != null)
				msgs = ((InternalEObject)newPreAND).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__PRE_AND, null, msgs);
			msgs = basicSetPreAND(newPreAND, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__PRE_AND, newPreAND, newPreAND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleActivityListType getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(SingleActivityListType newPost, NotificationChain msgs) {
		SingleActivityListType oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__POST, oldPost, newPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(SingleActivityListType newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__POST, null, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__POST, null, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrListType getPostOR() {
		return postOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostOR(OrListType newPostOR, NotificationChain msgs) {
		OrListType oldPostOR = postOR;
		postOR = newPostOR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__POST_OR, oldPostOR, newPostOR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOR(OrListType newPostOR) {
		if (newPostOR != postOR) {
			NotificationChain msgs = null;
			if (postOR != null)
				msgs = ((InternalEObject)postOR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__POST_OR, null, msgs);
			if (newPostOR != null)
				msgs = ((InternalEObject)newPostOR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__POST_OR, null, msgs);
			msgs = basicSetPostOR(newPostOR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__POST_OR, newPostOR, newPostOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityListType getPostAND() {
		return postAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostAND(ActivityListType newPostAND, NotificationChain msgs) {
		ActivityListType oldPostAND = postAND;
		postAND = newPostAND;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__POST_AND, oldPostAND, newPostAND);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostAND(ActivityListType newPostAND) {
		if (newPostAND != postAND) {
			NotificationChain msgs = null;
			if (postAND != null)
				msgs = ((InternalEObject)postAND).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__POST_AND, null, msgs);
			if (newPostAND != null)
				msgs = ((InternalEObject)newPostAND).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__POST_AND, null, msgs);
			msgs = basicSetPostAND(newPostAND, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__POST_AND, newPostAND, newPostAND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLoopListType getPostLOOP() {
		return postLOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostLOOP(ActivityLoopListType newPostLOOP, NotificationChain msgs) {
		ActivityLoopListType oldPostLOOP = postLOOP;
		postLOOP = newPostLOOP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__POST_LOOP, oldPostLOOP, newPostLOOP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostLOOP(ActivityLoopListType newPostLOOP) {
		if (newPostLOOP != postLOOP) {
			NotificationChain msgs = null;
			if (postLOOP != null)
				msgs = ((InternalEObject)postLOOP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__POST_LOOP, null, msgs);
			if (newPostLOOP != null)
				msgs = ((InternalEObject)newPostLOOP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PRECEDENCE_TYPE__POST_LOOP, null, msgs);
			msgs = basicSetPostLOOP(newPostLOOP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PRECEDENCE_TYPE__POST_LOOP, newPostLOOP, newPostLOOP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.PRECEDENCE_TYPE__PRE:
				return basicSetPre(null, msgs);
			case LQNPackage.PRECEDENCE_TYPE__PRE_OR:
				return basicSetPreOR(null, msgs);
			case LQNPackage.PRECEDENCE_TYPE__PRE_AND:
				return basicSetPreAND(null, msgs);
			case LQNPackage.PRECEDENCE_TYPE__POST:
				return basicSetPost(null, msgs);
			case LQNPackage.PRECEDENCE_TYPE__POST_OR:
				return basicSetPostOR(null, msgs);
			case LQNPackage.PRECEDENCE_TYPE__POST_AND:
				return basicSetPostAND(null, msgs);
			case LQNPackage.PRECEDENCE_TYPE__POST_LOOP:
				return basicSetPostLOOP(null, msgs);
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
			case LQNPackage.PRECEDENCE_TYPE__PRE:
				return getPre();
			case LQNPackage.PRECEDENCE_TYPE__PRE_OR:
				return getPreOR();
			case LQNPackage.PRECEDENCE_TYPE__PRE_AND:
				return getPreAND();
			case LQNPackage.PRECEDENCE_TYPE__POST:
				return getPost();
			case LQNPackage.PRECEDENCE_TYPE__POST_OR:
				return getPostOR();
			case LQNPackage.PRECEDENCE_TYPE__POST_AND:
				return getPostAND();
			case LQNPackage.PRECEDENCE_TYPE__POST_LOOP:
				return getPostLOOP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LQNPackage.PRECEDENCE_TYPE__PRE:
				setPre((SingleActivityListType)newValue);
				return;
			case LQNPackage.PRECEDENCE_TYPE__PRE_OR:
				setPreOR((ActivityListType)newValue);
				return;
			case LQNPackage.PRECEDENCE_TYPE__PRE_AND:
				setPreAND((AndJoinListType)newValue);
				return;
			case LQNPackage.PRECEDENCE_TYPE__POST:
				setPost((SingleActivityListType)newValue);
				return;
			case LQNPackage.PRECEDENCE_TYPE__POST_OR:
				setPostOR((OrListType)newValue);
				return;
			case LQNPackage.PRECEDENCE_TYPE__POST_AND:
				setPostAND((ActivityListType)newValue);
				return;
			case LQNPackage.PRECEDENCE_TYPE__POST_LOOP:
				setPostLOOP((ActivityLoopListType)newValue);
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
			case LQNPackage.PRECEDENCE_TYPE__PRE:
				setPre((SingleActivityListType)null);
				return;
			case LQNPackage.PRECEDENCE_TYPE__PRE_OR:
				setPreOR((ActivityListType)null);
				return;
			case LQNPackage.PRECEDENCE_TYPE__PRE_AND:
				setPreAND((AndJoinListType)null);
				return;
			case LQNPackage.PRECEDENCE_TYPE__POST:
				setPost((SingleActivityListType)null);
				return;
			case LQNPackage.PRECEDENCE_TYPE__POST_OR:
				setPostOR((OrListType)null);
				return;
			case LQNPackage.PRECEDENCE_TYPE__POST_AND:
				setPostAND((ActivityListType)null);
				return;
			case LQNPackage.PRECEDENCE_TYPE__POST_LOOP:
				setPostLOOP((ActivityLoopListType)null);
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
			case LQNPackage.PRECEDENCE_TYPE__PRE:
				return pre != null;
			case LQNPackage.PRECEDENCE_TYPE__PRE_OR:
				return preOR != null;
			case LQNPackage.PRECEDENCE_TYPE__PRE_AND:
				return preAND != null;
			case LQNPackage.PRECEDENCE_TYPE__POST:
				return post != null;
			case LQNPackage.PRECEDENCE_TYPE__POST_OR:
				return postOR != null;
			case LQNPackage.PRECEDENCE_TYPE__POST_AND:
				return postAND != null;
			case LQNPackage.PRECEDENCE_TYPE__POST_LOOP:
				return postLOOP != null;
		}
		return super.eIsSet(featureID);
	}

} //PrecedenceTypeImpl
