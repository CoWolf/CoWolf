/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ServiceType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskActivityGraph;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getResultTask <em>Result Task</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getTaskActivities <em>Task Activities</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getActivityGraph <em>Activity Graph</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getQueueLength <em>Queue Length</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getScheduling <em>Scheduling</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl#getThinkTime <em>Think Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskTypeImpl extends IDBaseImpl implements TaskType {
	/**
	 * The cached value of the '{@link #getResultTask() <em>Result Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultTask()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultType> resultTask;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryType> entry;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceType> service;

	/**
	 * The cached value of the '{@link #getTaskActivities() <em>Task Activities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskActivities()
	 * @generated
	 * @ordered
	 */
	protected TaskActivityGraph taskActivities;

	/**
	 * The default value of the '{@link #getActivityGraph() <em>Activity Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityGraph()
	 * @generated
	 * @ordered
	 */
	protected static final TaskOptionType ACTIVITY_GRAPH_EDEFAULT = TaskOptionType.YES;

	/**
	 * The cached value of the '{@link #getActivityGraph() <em>Activity Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityGraph()
	 * @generated
	 * @ordered
	 */
	protected TaskOptionType activityGraph = ACTIVITY_GRAPH_EDEFAULT;

	/**
	 * This is true if the Activity Graph attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activityGraphESet;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MULTIPLICITY_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * This is true if the Multiplicity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicityESet;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRIORITY_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The default value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUEUE_LENGTH_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getQueueLength() <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger queueLength = QUEUE_LENGTH_EDEFAULT;

	/**
	 * This is true if the Queue Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueLengthESet;

	/**
	 * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REPLICATION_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected BigInteger replication = REPLICATION_EDEFAULT;

	/**
	 * This is true if the Replication attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replicationESet;

	/**
	 * The default value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected static final TaskSchedulingType SCHEDULING_EDEFAULT = TaskSchedulingType.FCFS;

	/**
	 * The cached value of the '{@link #getScheduling() <em>Scheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduling()
	 * @generated
	 * @ordered
	 */
	protected TaskSchedulingType scheduling = SCHEDULING_EDEFAULT;

	/**
	 * This is true if the Scheduling attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schedulingESet;

	/**
	 * The default value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object THINK_TIME_EDEFAULT = LQNFactory.eINSTANCE.createFromString(LQNPackage.eINSTANCE.getSrvnFloat(), "0");

	/**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected Object thinkTime = THINK_TIME_EDEFAULT;

	/**
	 * This is true if the Think Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thinkTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.TASK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputResultType> getResultTask() {
		if (resultTask == null) {
			resultTask = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this, LQNPackage.TASK_TYPE__RESULT_TASK);
		}
		return resultTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryType> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<EntryType>(EntryType.class, this, LQNPackage.TASK_TYPE__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceType> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<ServiceType>(ServiceType.class, this, LQNPackage.TASK_TYPE__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskActivityGraph getTaskActivities() {
		return taskActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskActivities(TaskActivityGraph newTaskActivities, NotificationChain msgs) {
		TaskActivityGraph oldTaskActivities = taskActivities;
		taskActivities = newTaskActivities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__TASK_ACTIVITIES, oldTaskActivities, newTaskActivities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskActivities(TaskActivityGraph newTaskActivities) {
		if (newTaskActivities != taskActivities) {
			NotificationChain msgs = null;
			if (taskActivities != null)
				msgs = ((InternalEObject)taskActivities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.TASK_TYPE__TASK_ACTIVITIES, null, msgs);
			if (newTaskActivities != null)
				msgs = ((InternalEObject)newTaskActivities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.TASK_TYPE__TASK_ACTIVITIES, null, msgs);
			msgs = basicSetTaskActivities(newTaskActivities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__TASK_ACTIVITIES, newTaskActivities, newTaskActivities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOptionType getActivityGraph() {
		return activityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityGraph(TaskOptionType newActivityGraph) {
		TaskOptionType oldActivityGraph = activityGraph;
		activityGraph = newActivityGraph == null ? ACTIVITY_GRAPH_EDEFAULT : newActivityGraph;
		boolean oldActivityGraphESet = activityGraphESet;
		activityGraphESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__ACTIVITY_GRAPH, oldActivityGraph, activityGraph, !oldActivityGraphESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivityGraph() {
		TaskOptionType oldActivityGraph = activityGraph;
		boolean oldActivityGraphESet = activityGraphESet;
		activityGraph = ACTIVITY_GRAPH_EDEFAULT;
		activityGraphESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.TASK_TYPE__ACTIVITY_GRAPH, oldActivityGraph, ACTIVITY_GRAPH_EDEFAULT, oldActivityGraphESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivityGraph() {
		return activityGraphESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(BigInteger newMultiplicity) {
		BigInteger oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__MULTIPLICITY, oldMultiplicity, multiplicity, !oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiplicity() {
		BigInteger oldMultiplicity = multiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicity = MULTIPLICITY_EDEFAULT;
		multiplicityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.TASK_TYPE__MULTIPLICITY, oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiplicity() {
		return multiplicityESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(BigInteger newPriority) {
		BigInteger oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		BigInteger oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.TASK_TYPE__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
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
	public BigInteger getQueueLength() {
		return queueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueLength(BigInteger newQueueLength) {
		BigInteger oldQueueLength = queueLength;
		queueLength = newQueueLength;
		boolean oldQueueLengthESet = queueLengthESet;
		queueLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__QUEUE_LENGTH, oldQueueLength, queueLength, !oldQueueLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueueLength() {
		BigInteger oldQueueLength = queueLength;
		boolean oldQueueLengthESet = queueLengthESet;
		queueLength = QUEUE_LENGTH_EDEFAULT;
		queueLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.TASK_TYPE__QUEUE_LENGTH, oldQueueLength, QUEUE_LENGTH_EDEFAULT, oldQueueLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueueLength() {
		return queueLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplication(BigInteger newReplication) {
		BigInteger oldReplication = replication;
		replication = newReplication;
		boolean oldReplicationESet = replicationESet;
		replicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__REPLICATION, oldReplication, replication, !oldReplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplication() {
		BigInteger oldReplication = replication;
		boolean oldReplicationESet = replicationESet;
		replication = REPLICATION_EDEFAULT;
		replicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.TASK_TYPE__REPLICATION, oldReplication, REPLICATION_EDEFAULT, oldReplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplication() {
		return replicationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingType getScheduling() {
		return scheduling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduling(TaskSchedulingType newScheduling) {
		TaskSchedulingType oldScheduling = scheduling;
		scheduling = newScheduling == null ? SCHEDULING_EDEFAULT : newScheduling;
		boolean oldSchedulingESet = schedulingESet;
		schedulingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__SCHEDULING, oldScheduling, scheduling, !oldSchedulingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScheduling() {
		TaskSchedulingType oldScheduling = scheduling;
		boolean oldSchedulingESet = schedulingESet;
		scheduling = SCHEDULING_EDEFAULT;
		schedulingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.TASK_TYPE__SCHEDULING, oldScheduling, SCHEDULING_EDEFAULT, oldSchedulingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScheduling() {
		return schedulingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getThinkTime() {
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThinkTime(Object newThinkTime) {
		Object oldThinkTime = thinkTime;
		thinkTime = newThinkTime;
		boolean oldThinkTimeESet = thinkTimeESet;
		thinkTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.TASK_TYPE__THINK_TIME, oldThinkTime, thinkTime, !oldThinkTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThinkTime() {
		Object oldThinkTime = thinkTime;
		boolean oldThinkTimeESet = thinkTimeESet;
		thinkTime = THINK_TIME_EDEFAULT;
		thinkTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.TASK_TYPE__THINK_TIME, oldThinkTime, THINK_TIME_EDEFAULT, oldThinkTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThinkTime() {
		return thinkTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.TASK_TYPE__RESULT_TASK:
				return ((InternalEList<?>)getResultTask()).basicRemove(otherEnd, msgs);
			case LQNPackage.TASK_TYPE__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case LQNPackage.TASK_TYPE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case LQNPackage.TASK_TYPE__TASK_ACTIVITIES:
				return basicSetTaskActivities(null, msgs);
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
			case LQNPackage.TASK_TYPE__RESULT_TASK:
				return getResultTask();
			case LQNPackage.TASK_TYPE__ENTRY:
				return getEntry();
			case LQNPackage.TASK_TYPE__SERVICE:
				return getService();
			case LQNPackage.TASK_TYPE__TASK_ACTIVITIES:
				return getTaskActivities();
			case LQNPackage.TASK_TYPE__ACTIVITY_GRAPH:
				return getActivityGraph();
			case LQNPackage.TASK_TYPE__MULTIPLICITY:
				return getMultiplicity();
			case LQNPackage.TASK_TYPE__NAME:
				return getName();
			case LQNPackage.TASK_TYPE__PRIORITY:
				return getPriority();
			case LQNPackage.TASK_TYPE__QUEUE_LENGTH:
				return getQueueLength();
			case LQNPackage.TASK_TYPE__REPLICATION:
				return getReplication();
			case LQNPackage.TASK_TYPE__SCHEDULING:
				return getScheduling();
			case LQNPackage.TASK_TYPE__THINK_TIME:
				return getThinkTime();
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
			case LQNPackage.TASK_TYPE__RESULT_TASK:
				getResultTask().clear();
				getResultTask().addAll((Collection<? extends OutputResultType>)newValue);
				return;
			case LQNPackage.TASK_TYPE__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends EntryType>)newValue);
				return;
			case LQNPackage.TASK_TYPE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends ServiceType>)newValue);
				return;
			case LQNPackage.TASK_TYPE__TASK_ACTIVITIES:
				setTaskActivities((TaskActivityGraph)newValue);
				return;
			case LQNPackage.TASK_TYPE__ACTIVITY_GRAPH:
				setActivityGraph((TaskOptionType)newValue);
				return;
			case LQNPackage.TASK_TYPE__MULTIPLICITY:
				setMultiplicity((BigInteger)newValue);
				return;
			case LQNPackage.TASK_TYPE__NAME:
				setName((String)newValue);
				return;
			case LQNPackage.TASK_TYPE__PRIORITY:
				setPriority((BigInteger)newValue);
				return;
			case LQNPackage.TASK_TYPE__QUEUE_LENGTH:
				setQueueLength((BigInteger)newValue);
				return;
			case LQNPackage.TASK_TYPE__REPLICATION:
				setReplication((BigInteger)newValue);
				return;
			case LQNPackage.TASK_TYPE__SCHEDULING:
				setScheduling((TaskSchedulingType)newValue);
				return;
			case LQNPackage.TASK_TYPE__THINK_TIME:
				setThinkTime(newValue);
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
			case LQNPackage.TASK_TYPE__RESULT_TASK:
				getResultTask().clear();
				return;
			case LQNPackage.TASK_TYPE__ENTRY:
				getEntry().clear();
				return;
			case LQNPackage.TASK_TYPE__SERVICE:
				getService().clear();
				return;
			case LQNPackage.TASK_TYPE__TASK_ACTIVITIES:
				setTaskActivities((TaskActivityGraph)null);
				return;
			case LQNPackage.TASK_TYPE__ACTIVITY_GRAPH:
				unsetActivityGraph();
				return;
			case LQNPackage.TASK_TYPE__MULTIPLICITY:
				unsetMultiplicity();
				return;
			case LQNPackage.TASK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LQNPackage.TASK_TYPE__PRIORITY:
				unsetPriority();
				return;
			case LQNPackage.TASK_TYPE__QUEUE_LENGTH:
				unsetQueueLength();
				return;
			case LQNPackage.TASK_TYPE__REPLICATION:
				unsetReplication();
				return;
			case LQNPackage.TASK_TYPE__SCHEDULING:
				unsetScheduling();
				return;
			case LQNPackage.TASK_TYPE__THINK_TIME:
				unsetThinkTime();
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
			case LQNPackage.TASK_TYPE__RESULT_TASK:
				return resultTask != null && !resultTask.isEmpty();
			case LQNPackage.TASK_TYPE__ENTRY:
				return entry != null && !entry.isEmpty();
			case LQNPackage.TASK_TYPE__SERVICE:
				return service != null && !service.isEmpty();
			case LQNPackage.TASK_TYPE__TASK_ACTIVITIES:
				return taskActivities != null;
			case LQNPackage.TASK_TYPE__ACTIVITY_GRAPH:
				return isSetActivityGraph();
			case LQNPackage.TASK_TYPE__MULTIPLICITY:
				return isSetMultiplicity();
			case LQNPackage.TASK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LQNPackage.TASK_TYPE__PRIORITY:
				return isSetPriority();
			case LQNPackage.TASK_TYPE__QUEUE_LENGTH:
				return isSetQueueLength();
			case LQNPackage.TASK_TYPE__REPLICATION:
				return isSetReplication();
			case LQNPackage.TASK_TYPE__SCHEDULING:
				return isSetScheduling();
			case LQNPackage.TASK_TYPE__THINK_TIME:
				return isSetThinkTime();
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
		result.append(" (activityGraph: ");
		if (activityGraphESet) result.append(activityGraph); else result.append("<unset>");
		result.append(", multiplicity: ");
		if (multiplicityESet) result.append(multiplicity); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", queueLength: ");
		if (queueLengthESet) result.append(queueLength); else result.append("<unset>");
		result.append(", replication: ");
		if (replicationESet) result.append(replication); else result.append("<unset>");
		result.append(", scheduling: ");
		if (schedulingESet) result.append(scheduling); else result.append("<unset>");
		result.append(", thinkTime: ");
		if (thinkTimeESet) result.append(thinkTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TaskTypeImpl
