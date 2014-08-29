/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityGraph;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryMakingCallType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputEntryDistributionType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.PhaseActivities;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType;

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
 * An implementation of the model object '<em><b>Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getResultEntry <em>Result Entry</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getServiceTimeDistribution <em>Service Time Distribution</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getForwarding <em>Forwarding</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getEntryActivityGraph <em>Entry Activity Graph</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getEntryPhaseActivities <em>Entry Phase Activities</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getOpenArrivalRate <em>Open Arrival Rate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryTypeImpl extends IDBaseImpl implements EntryType {
	/**
	 * The cached value of the '{@link #getResultEntry() <em>Result Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultType> resultEntry;

	/**
	 * The cached value of the '{@link #getServiceTimeDistribution() <em>Service Time Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputEntryDistributionType> serviceTimeDistribution;

	/**
	 * The cached value of the '{@link #getForwarding() <em>Forwarding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwarding()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryMakingCallType> forwarding;

	/**
	 * The cached value of the '{@link #getEntryActivityGraph() <em>Entry Activity Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryActivityGraph()
	 * @generated
	 * @ordered
	 */
	protected EntryActivityGraph entryActivityGraph;

	/**
	 * The cached value of the '{@link #getEntryPhaseActivities() <em>Entry Phase Activities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPhaseActivities()
	 * @generated
	 * @ordered
	 */
	protected PhaseActivities entryPhaseActivities;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenArrivalRate() <em>Open Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenArrivalRate()
	 * @generated
	 * @ordered
	 */
	protected static final Object OPEN_ARRIVAL_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenArrivalRate() <em>Open Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenArrivalRate()
	 * @generated
	 * @ordered
	 */
	protected Object openArrivalRate = OPEN_ARRIVAL_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The default value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected static final SemaphoreType SEMAPHORE_EDEFAULT = SemaphoreType.SIGNAL;

	/**
	 * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected SemaphoreType semaphore = SEMAPHORE_EDEFAULT;

	/**
	 * This is true if the Semaphore attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean semaphoreESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.PH1PH2;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputResultType> getResultEntry() {
		if (resultEntry == null) {
			resultEntry = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this, LQNPackage.ENTRY_TYPE__RESULT_ENTRY);
		}
		return resultEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputEntryDistributionType> getServiceTimeDistribution() {
		if (serviceTimeDistribution == null) {
			serviceTimeDistribution = new EObjectContainmentEList<OutputEntryDistributionType>(OutputEntryDistributionType.class, this, LQNPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION);
		}
		return serviceTimeDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryMakingCallType> getForwarding() {
		if (forwarding == null) {
			forwarding = new EObjectContainmentEList<EntryMakingCallType>(EntryMakingCallType.class, this, LQNPackage.ENTRY_TYPE__FORWARDING);
		}
		return forwarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryActivityGraph getEntryActivityGraph() {
		return entryActivityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryActivityGraph(EntryActivityGraph newEntryActivityGraph, NotificationChain msgs) {
		EntryActivityGraph oldEntryActivityGraph = entryActivityGraph;
		entryActivityGraph = newEntryActivityGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH, oldEntryActivityGraph, newEntryActivityGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryActivityGraph(EntryActivityGraph newEntryActivityGraph) {
		if (newEntryActivityGraph != entryActivityGraph) {
			NotificationChain msgs = null;
			if (entryActivityGraph != null)
				msgs = ((InternalEObject)entryActivityGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH, null, msgs);
			if (newEntryActivityGraph != null)
				msgs = ((InternalEObject)newEntryActivityGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH, null, msgs);
			msgs = basicSetEntryActivityGraph(newEntryActivityGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH, newEntryActivityGraph, newEntryActivityGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseActivities getEntryPhaseActivities() {
		return entryPhaseActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryPhaseActivities(PhaseActivities newEntryPhaseActivities, NotificationChain msgs) {
		PhaseActivities oldEntryPhaseActivities = entryPhaseActivities;
		entryPhaseActivities = newEntryPhaseActivities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES, oldEntryPhaseActivities, newEntryPhaseActivities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPhaseActivities(PhaseActivities newEntryPhaseActivities) {
		if (newEntryPhaseActivities != entryPhaseActivities) {
			NotificationChain msgs = null;
			if (entryPhaseActivities != null)
				msgs = ((InternalEObject)entryPhaseActivities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES, null, msgs);
			if (newEntryPhaseActivities != null)
				msgs = ((InternalEObject)newEntryPhaseActivities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES, null, msgs);
			msgs = basicSetEntryPhaseActivities(newEntryPhaseActivities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES, newEntryPhaseActivities, newEntryPhaseActivities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOpenArrivalRate() {
		return openArrivalRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenArrivalRate(Object newOpenArrivalRate) {
		Object oldOpenArrivalRate = openArrivalRate;
		openArrivalRate = newOpenArrivalRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE, oldOpenArrivalRate, openArrivalRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		int oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.ENTRY_TYPE__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreType getSemaphore() {
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemaphore(SemaphoreType newSemaphore) {
		SemaphoreType oldSemaphore = semaphore;
		semaphore = newSemaphore == null ? SEMAPHORE_EDEFAULT : newSemaphore;
		boolean oldSemaphoreESet = semaphoreESet;
		semaphoreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__SEMAPHORE, oldSemaphore, semaphore, !oldSemaphoreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSemaphore() {
		SemaphoreType oldSemaphore = semaphore;
		boolean oldSemaphoreESet = semaphoreESet;
		semaphore = SEMAPHORE_EDEFAULT;
		semaphoreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.ENTRY_TYPE__SEMAPHORE, oldSemaphore, SEMAPHORE_EDEFAULT, oldSemaphoreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSemaphore() {
		return semaphoreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ENTRY_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.ENTRY_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.ENTRY_TYPE__RESULT_ENTRY:
				return ((InternalEList<?>)getResultEntry()).basicRemove(otherEnd, msgs);
			case LQNPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
				return ((InternalEList<?>)getServiceTimeDistribution()).basicRemove(otherEnd, msgs);
			case LQNPackage.ENTRY_TYPE__FORWARDING:
				return ((InternalEList<?>)getForwarding()).basicRemove(otherEnd, msgs);
			case LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
				return basicSetEntryActivityGraph(null, msgs);
			case LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
				return basicSetEntryPhaseActivities(null, msgs);
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
			case LQNPackage.ENTRY_TYPE__RESULT_ENTRY:
				return getResultEntry();
			case LQNPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
				return getServiceTimeDistribution();
			case LQNPackage.ENTRY_TYPE__FORWARDING:
				return getForwarding();
			case LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
				return getEntryActivityGraph();
			case LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
				return getEntryPhaseActivities();
			case LQNPackage.ENTRY_TYPE__NAME:
				return getName();
			case LQNPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
				return getOpenArrivalRate();
			case LQNPackage.ENTRY_TYPE__PRIORITY:
				return getPriority();
			case LQNPackage.ENTRY_TYPE__SEMAPHORE:
				return getSemaphore();
			case LQNPackage.ENTRY_TYPE__TYPE:
				return getType();
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
			case LQNPackage.ENTRY_TYPE__RESULT_ENTRY:
				getResultEntry().clear();
				getResultEntry().addAll((Collection<? extends OutputResultType>)newValue);
				return;
			case LQNPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
				getServiceTimeDistribution().clear();
				getServiceTimeDistribution().addAll((Collection<? extends OutputEntryDistributionType>)newValue);
				return;
			case LQNPackage.ENTRY_TYPE__FORWARDING:
				getForwarding().clear();
				getForwarding().addAll((Collection<? extends EntryMakingCallType>)newValue);
				return;
			case LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
				setEntryActivityGraph((EntryActivityGraph)newValue);
				return;
			case LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
				setEntryPhaseActivities((PhaseActivities)newValue);
				return;
			case LQNPackage.ENTRY_TYPE__NAME:
				setName((String)newValue);
				return;
			case LQNPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
				setOpenArrivalRate(newValue);
				return;
			case LQNPackage.ENTRY_TYPE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case LQNPackage.ENTRY_TYPE__SEMAPHORE:
				setSemaphore((SemaphoreType)newValue);
				return;
			case LQNPackage.ENTRY_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case LQNPackage.ENTRY_TYPE__RESULT_ENTRY:
				getResultEntry().clear();
				return;
			case LQNPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
				getServiceTimeDistribution().clear();
				return;
			case LQNPackage.ENTRY_TYPE__FORWARDING:
				getForwarding().clear();
				return;
			case LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
				setEntryActivityGraph((EntryActivityGraph)null);
				return;
			case LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
				setEntryPhaseActivities((PhaseActivities)null);
				return;
			case LQNPackage.ENTRY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LQNPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
				setOpenArrivalRate(OPEN_ARRIVAL_RATE_EDEFAULT);
				return;
			case LQNPackage.ENTRY_TYPE__PRIORITY:
				unsetPriority();
				return;
			case LQNPackage.ENTRY_TYPE__SEMAPHORE:
				unsetSemaphore();
				return;
			case LQNPackage.ENTRY_TYPE__TYPE:
				unsetType();
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
			case LQNPackage.ENTRY_TYPE__RESULT_ENTRY:
				return resultEntry != null && !resultEntry.isEmpty();
			case LQNPackage.ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION:
				return serviceTimeDistribution != null && !serviceTimeDistribution.isEmpty();
			case LQNPackage.ENTRY_TYPE__FORWARDING:
				return forwarding != null && !forwarding.isEmpty();
			case LQNPackage.ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH:
				return entryActivityGraph != null;
			case LQNPackage.ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES:
				return entryPhaseActivities != null;
			case LQNPackage.ENTRY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LQNPackage.ENTRY_TYPE__OPEN_ARRIVAL_RATE:
				return OPEN_ARRIVAL_RATE_EDEFAULT == null ? openArrivalRate != null : !OPEN_ARRIVAL_RATE_EDEFAULT.equals(openArrivalRate);
			case LQNPackage.ENTRY_TYPE__PRIORITY:
				return isSetPriority();
			case LQNPackage.ENTRY_TYPE__SEMAPHORE:
				return isSetSemaphore();
			case LQNPackage.ENTRY_TYPE__TYPE:
				return isSetType();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", openArrivalRate: ");
		result.append(openArrivalRate);
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", semaphore: ");
		if (semaphoreESet) result.append(semaphore); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EntryTypeImpl
