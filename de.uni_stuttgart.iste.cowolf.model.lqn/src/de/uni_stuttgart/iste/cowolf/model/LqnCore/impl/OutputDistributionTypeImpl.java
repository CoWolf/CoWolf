/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType;

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
 * An implementation of the model object '<em><b>Output Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getUnderflowBin <em>Underflow Bin</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getHistogramBin <em>Histogram Bin</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getOverflowBin <em>Overflow Bin</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getBinSize <em>Bin Size</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getKurtosis <em>Kurtosis</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getMidPoint <em>Mid Point</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getNumberBins <em>Number Bins</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getSkew <em>Skew</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getStdDev <em>Std Dev</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl#getXSamples <em>XSamples</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputDistributionTypeImpl extends IDBaseImpl implements OutputDistributionType {
	/**
	 * The cached value of the '{@link #getUnderflowBin() <em>Underflow Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderflowBin()
	 * @generated
	 * @ordered
	 */
	protected HistogramBinType underflowBin;

	/**
	 * The cached value of the '{@link #getHistogramBin() <em>Histogram Bin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistogramBin()
	 * @generated
	 * @ordered
	 */
	protected EList<HistogramBinType> histogramBin;

	/**
	 * The cached value of the '{@link #getOverflowBin() <em>Overflow Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflowBin()
	 * @generated
	 * @ordered
	 */
	protected HistogramBinType overflowBin;

	/**
	 * The default value of the '{@link #getBinSize() <em>Bin Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinSize()
	 * @generated
	 * @ordered
	 */
	protected static final Object BIN_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinSize() <em>Bin Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinSize()
	 * @generated
	 * @ordered
	 */
	protected Object binSize = BIN_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurtosis()
	 * @generated
	 * @ordered
	 */
	protected static final Object KURTOSIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKurtosis() <em>Kurtosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurtosis()
	 * @generated
	 * @ordered
	 */
	protected Object kurtosis = KURTOSIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Object max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected static final Object MEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected Object mean = MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidPoint() <em>Mid Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Object MID_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidPoint() <em>Mid Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidPoint()
	 * @generated
	 * @ordered
	 */
	protected Object midPoint = MID_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final Object MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Object min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberBins() <em>Number Bins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBins()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_BINS_EDEFAULT = new BigInteger("20");

	/**
	 * The cached value of the '{@link #getNumberBins() <em>Number Bins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBins()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberBins = NUMBER_BINS_EDEFAULT;

	/**
	 * This is true if the Number Bins attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberBinsESet;

	/**
	 * The default value of the '{@link #getSkew() <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected static final Object SKEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkew() <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected Object skew = SKEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getStdDev() <em>Std Dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDev()
	 * @generated
	 * @ordered
	 */
	protected static final Object STD_DEV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStdDev() <em>Std Dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdDev()
	 * @generated
	 * @ordered
	 */
	protected Object stdDev = STD_DEV_EDEFAULT;

	/**
	 * The default value of the '{@link #getXSamples() <em>XSamples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSamples()
	 * @generated
	 * @ordered
	 */
	protected static final AxisType XSAMPLES_EDEFAULT = AxisType.LINEAR;

	/**
	 * The cached value of the '{@link #getXSamples() <em>XSamples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSamples()
	 * @generated
	 * @ordered
	 */
	protected AxisType xSamples = XSAMPLES_EDEFAULT;

	/**
	 * This is true if the XSamples attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xSamplesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDistributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.OUTPUT_DISTRIBUTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramBinType getUnderflowBin() {
		return underflowBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnderflowBin(HistogramBinType newUnderflowBin, NotificationChain msgs) {
		HistogramBinType oldUnderflowBin = underflowBin;
		underflowBin = newUnderflowBin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, oldUnderflowBin, newUnderflowBin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderflowBin(HistogramBinType newUnderflowBin) {
		if (newUnderflowBin != underflowBin) {
			NotificationChain msgs = null;
			if (underflowBin != null)
				msgs = ((InternalEObject)underflowBin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, null, msgs);
			if (newUnderflowBin != null)
				msgs = ((InternalEObject)newUnderflowBin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, null, msgs);
			msgs = basicSetUnderflowBin(newUnderflowBin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN, newUnderflowBin, newUnderflowBin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistogramBinType> getHistogramBin() {
		if (histogramBin == null) {
			histogramBin = new EObjectContainmentEList<HistogramBinType>(HistogramBinType.class, this, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN);
		}
		return histogramBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramBinType getOverflowBin() {
		return overflowBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverflowBin(HistogramBinType newOverflowBin, NotificationChain msgs) {
		HistogramBinType oldOverflowBin = overflowBin;
		overflowBin = newOverflowBin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, oldOverflowBin, newOverflowBin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverflowBin(HistogramBinType newOverflowBin) {
		if (newOverflowBin != overflowBin) {
			NotificationChain msgs = null;
			if (overflowBin != null)
				msgs = ((InternalEObject)overflowBin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, null, msgs);
			if (newOverflowBin != null)
				msgs = ((InternalEObject)newOverflowBin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, null, msgs);
			msgs = basicSetOverflowBin(newOverflowBin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN, newOverflowBin, newOverflowBin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBinSize() {
		return binSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinSize(Object newBinSize) {
		Object oldBinSize = binSize;
		binSize = newBinSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE, oldBinSize, binSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getKurtosis() {
		return kurtosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKurtosis(Object newKurtosis) {
		Object oldKurtosis = kurtosis;
		kurtosis = newKurtosis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS, oldKurtosis, kurtosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Object newMax) {
		Object oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(Object newMean) {
		Object oldMean = mean;
		mean = newMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN, oldMean, mean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMidPoint() {
		return midPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidPoint(Object newMidPoint) {
		Object oldMidPoint = midPoint;
		midPoint = newMidPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT, oldMidPoint, midPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(Object newMin) {
		Object oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberBins() {
		return numberBins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberBins(BigInteger newNumberBins) {
		BigInteger oldNumberBins = numberBins;
		numberBins = newNumberBins;
		boolean oldNumberBinsESet = numberBinsESet;
		numberBinsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS, oldNumberBins, numberBins, !oldNumberBinsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberBins() {
		BigInteger oldNumberBins = numberBins;
		boolean oldNumberBinsESet = numberBinsESet;
		numberBins = NUMBER_BINS_EDEFAULT;
		numberBinsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS, oldNumberBins, NUMBER_BINS_EDEFAULT, oldNumberBinsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberBins() {
		return numberBinsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSkew() {
		return skew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkew(Object newSkew) {
		Object oldSkew = skew;
		skew = newSkew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW, oldSkew, skew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStdDev() {
		return stdDev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdDev(Object newStdDev) {
		Object oldStdDev = stdDev;
		stdDev = newStdDev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV, oldStdDev, stdDev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType getXSamples() {
		return xSamples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXSamples(AxisType newXSamples) {
		AxisType oldXSamples = xSamples;
		xSamples = newXSamples == null ? XSAMPLES_EDEFAULT : newXSamples;
		boolean oldXSamplesESet = xSamplesESet;
		xSamplesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES, oldXSamples, xSamples, !oldXSamplesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXSamples() {
		AxisType oldXSamples = xSamples;
		boolean oldXSamplesESet = xSamplesESet;
		xSamples = XSAMPLES_EDEFAULT;
		xSamplesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES, oldXSamples, XSAMPLES_EDEFAULT, oldXSamplesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXSamples() {
		return xSamplesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				return basicSetUnderflowBin(null, msgs);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				return ((InternalEList<?>)getHistogramBin()).basicRemove(otherEnd, msgs);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				return basicSetOverflowBin(null, msgs);
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
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				return getUnderflowBin();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				return getHistogramBin();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				return getOverflowBin();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
				return getBinSize();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
				return getKurtosis();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
				return getMax();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
				return getMean();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
				return getMidPoint();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
				return getMin();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
				return getNumberBins();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
				return getSkew();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
				return getStdDev();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
				return getXSamples();
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
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				setUnderflowBin((HistogramBinType)newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				getHistogramBin().clear();
				getHistogramBin().addAll((Collection<? extends HistogramBinType>)newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				setOverflowBin((HistogramBinType)newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
				setBinSize(newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
				setKurtosis(newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
				setMax(newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
				setMean(newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
				setMidPoint(newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
				setMin(newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
				setNumberBins((BigInteger)newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
				setSkew(newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
				setStdDev(newValue);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
				setXSamples((AxisType)newValue);
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
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				setUnderflowBin((HistogramBinType)null);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				getHistogramBin().clear();
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				setOverflowBin((HistogramBinType)null);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
				setBinSize(BIN_SIZE_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
				setKurtosis(KURTOSIS_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
				setMean(MEAN_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
				setMidPoint(MID_POINT_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
				unsetNumberBins();
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
				setSkew(SKEW_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
				setStdDev(STD_DEV_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
				unsetXSamples();
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
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN:
				return underflowBin != null;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN:
				return histogramBin != null && !histogramBin.isEmpty();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN:
				return overflowBin != null;
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE:
				return BIN_SIZE_EDEFAULT == null ? binSize != null : !BIN_SIZE_EDEFAULT.equals(binSize);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__KURTOSIS:
				return KURTOSIS_EDEFAULT == null ? kurtosis != null : !KURTOSIS_EDEFAULT.equals(kurtosis);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MEAN:
				return MEAN_EDEFAULT == null ? mean != null : !MEAN_EDEFAULT.equals(mean);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MID_POINT:
				return MID_POINT_EDEFAULT == null ? midPoint != null : !MID_POINT_EDEFAULT.equals(midPoint);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS:
				return isSetNumberBins();
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__SKEW:
				return SKEW_EDEFAULT == null ? skew != null : !SKEW_EDEFAULT.equals(skew);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__STD_DEV:
				return STD_DEV_EDEFAULT == null ? stdDev != null : !STD_DEV_EDEFAULT.equals(stdDev);
			case LQNPackage.OUTPUT_DISTRIBUTION_TYPE__XSAMPLES:
				return isSetXSamples();
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
		result.append(" (binSize: ");
		result.append(binSize);
		result.append(", kurtosis: ");
		result.append(kurtosis);
		result.append(", max: ");
		result.append(max);
		result.append(", mean: ");
		result.append(mean);
		result.append(", midPoint: ");
		result.append(midPoint);
		result.append(", min: ");
		result.append(min);
		result.append(", numberBins: ");
		if (numberBinsESet) result.append(numberBins); else result.append("<unset>");
		result.append(", skew: ");
		result.append(skew);
		result.append(", stdDev: ");
		result.append(stdDev);
		result.append(", xSamples: ");
		if (xSamplesESet) result.append(xSamples); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutputDistributionTypeImpl
