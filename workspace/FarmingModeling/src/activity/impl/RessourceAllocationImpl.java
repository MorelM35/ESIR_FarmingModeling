/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.RessourceAllocation;

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
 *   <li>{@link activity.impl.RessourceAllocationImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link activity.impl.RessourceAllocationImpl#getRessource <em>Ressource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RessourceAllocationImpl extends MinimalEObjectImpl.Container implements RessourceAllocation {
	/**
	 * The default value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected static final int DUREE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected int duree = DUREE_EDEFAULT;

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
	public int getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(int newDuree) {
		int oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.RESSOURCE_ALLOCATION__DUREE, oldDuree, duree));
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
			case ActivityPackage.RESSOURCE_ALLOCATION__DUREE:
				return getDuree();
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				if (resolve) return getRessource();
				return basicGetRessource();
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
			case ActivityPackage.RESSOURCE_ALLOCATION__DUREE:
				setDuree((Integer)newValue);
				return;
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				setRessource((Ressource)newValue);
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
			case ActivityPackage.RESSOURCE_ALLOCATION__DUREE:
				setDuree(DUREE_EDEFAULT);
				return;
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				setRessource((Ressource)null);
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
			case ActivityPackage.RESSOURCE_ALLOCATION__DUREE:
				return duree != DUREE_EDEFAULT;
			case ActivityPackage.RESSOURCE_ALLOCATION__RESSOURCE:
				return ressource != null;
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
		result.append(" (duree: ");
		result.append(duree);
		result.append(')');
		return result.toString();
	}

} //RessourceAllocationImpl
