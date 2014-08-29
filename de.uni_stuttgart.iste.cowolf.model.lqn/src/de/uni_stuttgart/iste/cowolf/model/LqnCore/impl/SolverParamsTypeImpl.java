/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.PragmaType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Params Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl#getResultGeneral <em>Result General</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl#getPragma <em>Pragma</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl#getConvVal <em>Conv Val</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl#getItLimit <em>It Limit</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl#getPrintInt <em>Print Int</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl#getUnderrelaxCoeff <em>Underrelax Coeff</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolverParamsTypeImpl extends IDBaseImpl implements SolverParamsType {
	/**
	 * The cached value of the '{@link #getResultGeneral() <em>Result General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultGeneral()
	 * @generated
	 * @ordered
	 */
	protected ResultGeneralType resultGeneral;

	/**
	 * The cached value of the '{@link #getPragma() <em>Pragma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPragma()
	 * @generated
	 * @ordered
	 */
	protected EList<PragmaType> pragma;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * This is true if the Comment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commentESet;

	/**
	 * The default value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvVal()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONV_VAL_EDEFAULT = LQNFactory.eINSTANCE.createFromString(LQNPackage.eINSTANCE.getSrvnFloat(), "1");

	/**
	 * The cached value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvVal()
	 * @generated
	 * @ordered
	 */
	protected Object convVal = CONV_VAL_EDEFAULT;

	/**
	 * This is true if the Conv Val attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean convValESet;

	/**
	 * The default value of the '{@link #getItLimit() <em>It Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int IT_LIMIT_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getItLimit() <em>It Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItLimit()
	 * @generated
	 * @ordered
	 */
	protected int itLimit = IT_LIMIT_EDEFAULT;

	/**
	 * This is true if the It Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itLimitESet;

	/**
	 * The default value of the '{@link #getPrintInt() <em>Print Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintInt()
	 * @generated
	 * @ordered
	 */
	protected static final int PRINT_INT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrintInt() <em>Print Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintInt()
	 * @generated
	 * @ordered
	 */
	protected int printInt = PRINT_INT_EDEFAULT;

	/**
	 * This is true if the Print Int attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean printIntESet;

	/**
	 * The default value of the '{@link #getUnderrelaxCoeff() <em>Underrelax Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderrelaxCoeff()
	 * @generated
	 * @ordered
	 */
	protected static final Object UNDERRELAX_COEFF_EDEFAULT = LQNFactory.eINSTANCE.createFromString(LQNPackage.eINSTANCE.getSrvnFloat(), "1");

	/**
	 * The cached value of the '{@link #getUnderrelaxCoeff() <em>Underrelax Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderrelaxCoeff()
	 * @generated
	 * @ordered
	 */
	protected Object underrelaxCoeff = UNDERRELAX_COEFF_EDEFAULT;

	/**
	 * This is true if the Underrelax Coeff attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean underrelaxCoeffESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverParamsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.SOLVER_PARAMS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultGeneralType getResultGeneral() {
		return resultGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultGeneral(ResultGeneralType newResultGeneral, NotificationChain msgs) {
		ResultGeneralType oldResultGeneral = resultGeneral;
		resultGeneral = newResultGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL, oldResultGeneral, newResultGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultGeneral(ResultGeneralType newResultGeneral) {
		if (newResultGeneral != resultGeneral) {
			NotificationChain msgs = null;
			if (resultGeneral != null)
				msgs = ((InternalEObject)resultGeneral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL, null, msgs);
			if (newResultGeneral != null)
				msgs = ((InternalEObject)newResultGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL, null, msgs);
			msgs = basicSetResultGeneral(newResultGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL, newResultGeneral, newResultGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PragmaType> getPragma() {
		if (pragma == null) {
			pragma = new EObjectContainmentEList<PragmaType>(PragmaType.class, this, LQNPackage.SOLVER_PARAMS_TYPE__PRAGMA);
		}
		return pragma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		boolean oldCommentESet = commentESet;
		commentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SOLVER_PARAMS_TYPE__COMMENT, oldComment, comment, !oldCommentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComment() {
		String oldComment = comment;
		boolean oldCommentESet = commentESet;
		comment = COMMENT_EDEFAULT;
		commentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.SOLVER_PARAMS_TYPE__COMMENT, oldComment, COMMENT_EDEFAULT, oldCommentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComment() {
		return commentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConvVal() {
		return convVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvVal(Object newConvVal) {
		Object oldConvVal = convVal;
		convVal = newConvVal;
		boolean oldConvValESet = convValESet;
		convValESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SOLVER_PARAMS_TYPE__CONV_VAL, oldConvVal, convVal, !oldConvValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConvVal() {
		Object oldConvVal = convVal;
		boolean oldConvValESet = convValESet;
		convVal = CONV_VAL_EDEFAULT;
		convValESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.SOLVER_PARAMS_TYPE__CONV_VAL, oldConvVal, CONV_VAL_EDEFAULT, oldConvValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConvVal() {
		return convValESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getItLimit() {
		return itLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItLimit(int newItLimit) {
		int oldItLimit = itLimit;
		itLimit = newItLimit;
		boolean oldItLimitESet = itLimitESet;
		itLimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SOLVER_PARAMS_TYPE__IT_LIMIT, oldItLimit, itLimit, !oldItLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItLimit() {
		int oldItLimit = itLimit;
		boolean oldItLimitESet = itLimitESet;
		itLimit = IT_LIMIT_EDEFAULT;
		itLimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.SOLVER_PARAMS_TYPE__IT_LIMIT, oldItLimit, IT_LIMIT_EDEFAULT, oldItLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItLimit() {
		return itLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrintInt() {
		return printInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintInt(int newPrintInt) {
		int oldPrintInt = printInt;
		printInt = newPrintInt;
		boolean oldPrintIntESet = printIntESet;
		printIntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SOLVER_PARAMS_TYPE__PRINT_INT, oldPrintInt, printInt, !oldPrintIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrintInt() {
		int oldPrintInt = printInt;
		boolean oldPrintIntESet = printIntESet;
		printInt = PRINT_INT_EDEFAULT;
		printIntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.SOLVER_PARAMS_TYPE__PRINT_INT, oldPrintInt, PRINT_INT_EDEFAULT, oldPrintIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrintInt() {
		return printIntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUnderrelaxCoeff() {
		return underrelaxCoeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderrelaxCoeff(Object newUnderrelaxCoeff) {
		Object oldUnderrelaxCoeff = underrelaxCoeff;
		underrelaxCoeff = newUnderrelaxCoeff;
		boolean oldUnderrelaxCoeffESet = underrelaxCoeffESet;
		underrelaxCoeffESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF, oldUnderrelaxCoeff, underrelaxCoeff, !oldUnderrelaxCoeffESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnderrelaxCoeff() {
		Object oldUnderrelaxCoeff = underrelaxCoeff;
		boolean oldUnderrelaxCoeffESet = underrelaxCoeffESet;
		underrelaxCoeff = UNDERRELAX_COEFF_EDEFAULT;
		underrelaxCoeffESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF, oldUnderrelaxCoeff, UNDERRELAX_COEFF_EDEFAULT, oldUnderrelaxCoeffESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnderrelaxCoeff() {
		return underrelaxCoeffESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
				return basicSetResultGeneral(null, msgs);
			case LQNPackage.SOLVER_PARAMS_TYPE__PRAGMA:
				return ((InternalEList<?>)getPragma()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
				return getResultGeneral();
			case LQNPackage.SOLVER_PARAMS_TYPE__PRAGMA:
				return getPragma();
			case LQNPackage.SOLVER_PARAMS_TYPE__COMMENT:
				return getComment();
			case LQNPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
				return getConvVal();
			case LQNPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
				return getItLimit();
			case LQNPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
				return getPrintInt();
			case LQNPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
				return getUnderrelaxCoeff();
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
			case LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
				setResultGeneral((ResultGeneralType)newValue);
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__PRAGMA:
				getPragma().clear();
				getPragma().addAll((Collection<? extends PragmaType>)newValue);
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
				setConvVal(newValue);
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
				setItLimit((Integer)newValue);
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
				setPrintInt((Integer)newValue);
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
				setUnderrelaxCoeff(newValue);
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
			case LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
				setResultGeneral((ResultGeneralType)null);
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__PRAGMA:
				getPragma().clear();
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__COMMENT:
				unsetComment();
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
				unsetConvVal();
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
				unsetItLimit();
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
				unsetPrintInt();
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
				unsetUnderrelaxCoeff();
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
			case LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
				return resultGeneral != null;
			case LQNPackage.SOLVER_PARAMS_TYPE__PRAGMA:
				return pragma != null && !pragma.isEmpty();
			case LQNPackage.SOLVER_PARAMS_TYPE__COMMENT:
				return isSetComment();
			case LQNPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
				return isSetConvVal();
			case LQNPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
				return isSetItLimit();
			case LQNPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
				return isSetPrintInt();
			case LQNPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
				return isSetUnderrelaxCoeff();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		if (commentESet) result.append(comment); else result.append("<unset>");
		result.append(", convVal: ");
		if (convValESet) result.append(convVal); else result.append("<unset>");
		result.append(", itLimit: ");
		if (itLimitESet) result.append(itLimit); else result.append("<unset>");
		result.append(", printInt: ");
		if (printIntESet) result.append(printInt); else result.append("<unset>");
		result.append(", underrelaxCoeff: ");
		if (underrelaxCoeffESet) result.append(underrelaxCoeff); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SolverParamsTypeImpl
