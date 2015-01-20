/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.Date;
import activity.Launcher;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.LauncherImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link activity.impl.LauncherImpl#getEnd <em>End</em>}</li>
 *   <li>{@link activity.impl.LauncherImpl#getQMax <em>QMax</em>}</li>
 *   <li>{@link activity.impl.LauncherImpl#getQuantityOfWater <em>Quantity Of Water</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LauncherImpl extends MinimalEObjectImpl.Container implements Launcher {
	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected Date begin;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end;

	/**
	 * The default value of the '{@link #getQMax() <em>QMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQMax()
	 * @generated
	 * @ordered
	 */
	protected static final int QMAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQMax() <em>QMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQMax()
	 * @generated
	 * @ordered
	 */
	protected int qMax = QMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityOfWater() <em>Quantity Of Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOfWater()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_OF_WATER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantityOfWater() <em>Quantity Of Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOfWater()
	 * @generated
	 * @ordered
	 */
	protected int quantityOfWater = QUANTITY_OF_WATER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LauncherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.LAUNCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegin(Date newBegin, NotificationChain msgs) {
		Date oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.LAUNCHER__BEGIN, oldBegin, newBegin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBegin(Date newBegin) {
		if (newBegin != begin) {
			NotificationChain msgs = null;
			if (begin != null)
				msgs = ((InternalEObject)begin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.LAUNCHER__BEGIN, null, msgs);
			if (newBegin != null)
				msgs = ((InternalEObject)newBegin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.LAUNCHER__BEGIN, null, msgs);
			msgs = basicSetBegin(newBegin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.LAUNCHER__BEGIN, newBegin, newBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Date newEnd, NotificationChain msgs) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.LAUNCHER__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.LAUNCHER__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.LAUNCHER__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.LAUNCHER__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQMax() {
		return qMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQMax(int newQMax) {
		int oldQMax = qMax;
		qMax = newQMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.LAUNCHER__QMAX, oldQMax, qMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantityOfWater() {
		return quantityOfWater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityOfWater(int newQuantityOfWater) {
		int oldQuantityOfWater = quantityOfWater;
		quantityOfWater = newQuantityOfWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.LAUNCHER__QUANTITY_OF_WATER, oldQuantityOfWater, quantityOfWater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.LAUNCHER__BEGIN:
				return basicSetBegin(null, msgs);
			case ActivityPackage.LAUNCHER__END:
				return basicSetEnd(null, msgs);
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
			case ActivityPackage.LAUNCHER__BEGIN:
				return getBegin();
			case ActivityPackage.LAUNCHER__END:
				return getEnd();
			case ActivityPackage.LAUNCHER__QMAX:
				return getQMax();
			case ActivityPackage.LAUNCHER__QUANTITY_OF_WATER:
				return getQuantityOfWater();
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
			case ActivityPackage.LAUNCHER__BEGIN:
				setBegin((Date)newValue);
				return;
			case ActivityPackage.LAUNCHER__END:
				setEnd((Date)newValue);
				return;
			case ActivityPackage.LAUNCHER__QMAX:
				setQMax((Integer)newValue);
				return;
			case ActivityPackage.LAUNCHER__QUANTITY_OF_WATER:
				setQuantityOfWater((Integer)newValue);
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
			case ActivityPackage.LAUNCHER__BEGIN:
				setBegin((Date)null);
				return;
			case ActivityPackage.LAUNCHER__END:
				setEnd((Date)null);
				return;
			case ActivityPackage.LAUNCHER__QMAX:
				setQMax(QMAX_EDEFAULT);
				return;
			case ActivityPackage.LAUNCHER__QUANTITY_OF_WATER:
				setQuantityOfWater(QUANTITY_OF_WATER_EDEFAULT);
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
			case ActivityPackage.LAUNCHER__BEGIN:
				return begin != null;
			case ActivityPackage.LAUNCHER__END:
				return end != null;
			case ActivityPackage.LAUNCHER__QMAX:
				return qMax != QMAX_EDEFAULT;
			case ActivityPackage.LAUNCHER__QUANTITY_OF_WATER:
				return quantityOfWater != QUANTITY_OF_WATER_EDEFAULT;
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
		result.append(" (qMax: ");
		result.append(qMax);
		result.append(", quantityOfWater: ");
		result.append(quantityOfWater);
		result.append(')');
		return result.toString();
	}

} //LauncherImpl
