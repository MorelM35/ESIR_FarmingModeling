/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.NoRain;
import activity.periodicity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Rain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.NoRainImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link activity.impl.NoRainImpl#getPeriodicityType <em>Periodicity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoRainImpl extends PredicatImpl implements NoRain {
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
	protected NoRainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.NO_RAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.NO_RAIN__ELAPSED_TIME, oldElapsedTime, elapsedTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.NO_RAIN__PERIODICITY_TYPE, oldPeriodicityType, periodicityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.NO_RAIN__ELAPSED_TIME:
				return getElapsedTime();
			case ActivityPackage.NO_RAIN__PERIODICITY_TYPE:
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
			case ActivityPackage.NO_RAIN__ELAPSED_TIME:
				setElapsedTime((Integer)newValue);
				return;
			case ActivityPackage.NO_RAIN__PERIODICITY_TYPE:
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
			case ActivityPackage.NO_RAIN__ELAPSED_TIME:
				setElapsedTime(ELAPSED_TIME_EDEFAULT);
				return;
			case ActivityPackage.NO_RAIN__PERIODICITY_TYPE:
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
			case ActivityPackage.NO_RAIN__ELAPSED_TIME:
				return elapsedTime != ELAPSED_TIME_EDEFAULT;
			case ActivityPackage.NO_RAIN__PERIODICITY_TYPE:
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

} //NoRainImpl
