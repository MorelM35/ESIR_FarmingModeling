/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.RessourceAllocation;
import activity.periodicity;

import exploitation.ExploitationPackage;
import exploitation.Ressource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.RessourceAllocationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link activity.impl.RessourceAllocationImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link activity.impl.RessourceAllocationImpl#getPeriodicityType <em>Periodicity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RessourceAllocationImpl extends MinimalEObjectImpl.Container implements RessourceAllocation {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

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
	protected RessourceAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.RESSOURCE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.RESSOURCE_ALLOCATION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getRessource() {
		if (ressource != null && ressource.eIsProxy()) {
			InternalEObject oldRessource = (InternalEObject)ressource;
			ressource = (Ressource)eResolveProxy(oldRessource);
			if (ressource != oldRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE, oldRessource, ressource));
			}
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRessource(Ressource newRessource, NotificationChain msgs) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE, oldRessource, newRessource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessource(Ressource newRessource) {
		if (newRessource != ressource) {
			NotificationChain msgs = null;
			if (ressource != null)
				msgs = ((InternalEObject)ressource).eInverseRemove(this, ExploitationPackage.RESSOURCE__RES_ALLOCATION, Ressource.class, msgs);
			if (newRessource != null)
				msgs = ((InternalEObject)newRessource).eInverseAdd(this, ExploitationPackage.RESSOURCE__RES_ALLOCATION, Ressource.class, msgs);
			msgs = basicSetRessource(newRessource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE, newRessource, newRessource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.RESSOURCE_ALLOCATION__PERIODICITY_TYPE, oldPeriodicityType, periodicityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				if (ressource != null)
					msgs = ((InternalEObject)ressource).eInverseRemove(this, ExploitationPackage.RESSOURCE__RES_ALLOCATION, Ressource.class, msgs);
				return basicSetRessource((Ressource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				return basicSetRessource(null, msgs);
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
			case ActivityPackage.RESSOURCE_ALLOCATION__DURATION:
				return getDuration();
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				if (resolve) return getRessource();
				return basicGetRessource();
			case ActivityPackage.RESSOURCE_ALLOCATION__PERIODICITY_TYPE:
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
			case ActivityPackage.RESSOURCE_ALLOCATION__DURATION:
				setDuration((Integer)newValue);
				return;
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
			case ActivityPackage.RESSOURCE_ALLOCATION__PERIODICITY_TYPE:
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
			case ActivityPackage.RESSOURCE_ALLOCATION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				setRessource((Ressource)null);
				return;
			case ActivityPackage.RESSOURCE_ALLOCATION__PERIODICITY_TYPE:
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
			case ActivityPackage.RESSOURCE_ALLOCATION__DURATION:
				return duration != DURATION_EDEFAULT;
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				return ressource != null;
			case ActivityPackage.RESSOURCE_ALLOCATION__PERIODICITY_TYPE:
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", periodicityType: ");
		result.append(periodicityType);
		result.append(')');
		return result.toString();
	}

} //RessourceAllocationImpl
