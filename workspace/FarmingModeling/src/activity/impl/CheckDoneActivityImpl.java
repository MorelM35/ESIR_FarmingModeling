/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.CheckDoneActivity;
import activity.PeriodicActivity;
import activity.periodicity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Done Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.CheckDoneActivityImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link activity.impl.CheckDoneActivityImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link activity.impl.CheckDoneActivityImpl#getActivityToValidate <em>Activity To Validate</em>}</li>
 *   <li>{@link activity.impl.CheckDoneActivityImpl#getPeriodicityType <em>Periodicity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckDoneActivityImpl extends PredicatImpl implements CheckDoneActivity {
	/**
	 * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final int ELAPSED_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected int elapsedTime = ELAPSED_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected CheckDoneActivity eReference0;

	/**
	 * The cached value of the '{@link #getActivityToValidate() <em>Activity To Validate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityToValidate()
	 * @generated
	 * @ordered
	 */
	protected PeriodicActivity activityToValidate;

	/**
	 * The cached value of the '{@link #getPeriodicityType() <em>Periodicity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicityType()
	 * @generated
	 * @ordered
	 */
	protected periodicity periodicityType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckDoneActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.CHECK_DONE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElapsedTime(int newElapsedTime) {
		int oldElapsedTime = elapsedTime;
		elapsedTime = newElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.CHECK_DONE_ACTIVITY__ELAPSED_TIME, oldElapsedTime, elapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckDoneActivity getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (CheckDoneActivity)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.CHECK_DONE_ACTIVITY__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckDoneActivity basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(CheckDoneActivity newEReference0) {
		CheckDoneActivity oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.CHECK_DONE_ACTIVITY__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicActivity getActivityToValidate() {
		if (activityToValidate != null && activityToValidate.eIsProxy()) {
			InternalEObject oldActivityToValidate = (InternalEObject)activityToValidate;
			activityToValidate = (PeriodicActivity)eResolveProxy(oldActivityToValidate);
			if (activityToValidate != oldActivityToValidate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE, oldActivityToValidate, activityToValidate));
			}
		}
		return activityToValidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicActivity basicGetActivityToValidate() {
		return activityToValidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityToValidate(PeriodicActivity newActivityToValidate) {
		PeriodicActivity oldActivityToValidate = activityToValidate;
		activityToValidate = newActivityToValidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE, oldActivityToValidate, activityToValidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public periodicity getPeriodicityType() {
		return periodicityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicityType(periodicity newPeriodicityType) {
		periodicity oldPeriodicityType = periodicityType;
		periodicityType = newPeriodicityType == null ? null : newPeriodicityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.CHECK_DONE_ACTIVITY__PERIODICITY_TYPE, oldPeriodicityType, periodicityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.CHECK_DONE_ACTIVITY__ELAPSED_TIME:
				return getElapsedTime();
			case ActivityPackage.CHECK_DONE_ACTIVITY__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
			case ActivityPackage.CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE:
				if (resolve) return getActivityToValidate();
				return basicGetActivityToValidate();
			case ActivityPackage.CHECK_DONE_ACTIVITY__PERIODICITY_TYPE:
				return getPeriodicityType();
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
			case ActivityPackage.CHECK_DONE_ACTIVITY__ELAPSED_TIME:
				setElapsedTime((Integer)newValue);
				return;
			case ActivityPackage.CHECK_DONE_ACTIVITY__EREFERENCE0:
				setEReference0((CheckDoneActivity)newValue);
				return;
			case ActivityPackage.CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE:
				setActivityToValidate((PeriodicActivity)newValue);
				return;
			case ActivityPackage.CHECK_DONE_ACTIVITY__PERIODICITY_TYPE:
				setPeriodicityType((periodicity) newValue);
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
			case ActivityPackage.CHECK_DONE_ACTIVITY__ELAPSED_TIME:
				setElapsedTime(ELAPSED_TIME_EDEFAULT);
				return;
			case ActivityPackage.CHECK_DONE_ACTIVITY__EREFERENCE0:
				setEReference0((CheckDoneActivity)null);
				return;
			case ActivityPackage.CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE:
				setActivityToValidate((PeriodicActivity)null);
				return;
			case ActivityPackage.CHECK_DONE_ACTIVITY__PERIODICITY_TYPE:
				setPeriodicityType((periodicity)null);
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
			case ActivityPackage.CHECK_DONE_ACTIVITY__ELAPSED_TIME:
				return elapsedTime != ELAPSED_TIME_EDEFAULT;
			case ActivityPackage.CHECK_DONE_ACTIVITY__EREFERENCE0:
				return eReference0 != null;
			case ActivityPackage.CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE:
				return activityToValidate != null;
			case ActivityPackage.CHECK_DONE_ACTIVITY__PERIODICITY_TYPE:
				return periodicityType != null;
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
		result.append(" (elapsedTime: ");
		result.append(elapsedTime);
		result.append(", periodicityType: ");
		result.append(periodicityType);
		result.append(')');
		return result.toString();
	}

} //CheckDoneActivityImpl
