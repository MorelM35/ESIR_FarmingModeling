/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.ActivityPeriodic;
import activity.Model;

import exploitation.RessourceType;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.ModelImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link activity.impl.ModelImpl#getRessourceType <em>Ressource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPeriodic> activity;

	/**
	 * The cached value of the '{@link #getRessourceType() <em>Ressource Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceType()
	 * @generated
	 * @ordered
	 */
	protected EList<RessourceType> ressourceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPeriodic> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityPeriodic>(ActivityPeriodic.class, this, ActivityPackage.MODEL__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RessourceType> getRessourceType() {
		if (ressourceType == null) {
			ressourceType = new EObjectResolvingEList<RessourceType>(RessourceType.class, this, ActivityPackage.MODEL__RESSOURCE_TYPE);
		}
		return ressourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.MODEL__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
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
			case ActivityPackage.MODEL__ACTIVITY:
				return getActivity();
			case ActivityPackage.MODEL__RESSOURCE_TYPE:
				return getRessourceType();
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
			case ActivityPackage.MODEL__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityPeriodic>)newValue);
				return;
			case ActivityPackage.MODEL__RESSOURCE_TYPE:
				getRessourceType().clear();
				getRessourceType().addAll((Collection<? extends RessourceType>)newValue);
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
			case ActivityPackage.MODEL__ACTIVITY:
				getActivity().clear();
				return;
			case ActivityPackage.MODEL__RESSOURCE_TYPE:
				getRessourceType().clear();
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
			case ActivityPackage.MODEL__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case ActivityPackage.MODEL__RESSOURCE_TYPE:
				return ressourceType != null && !ressourceType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
