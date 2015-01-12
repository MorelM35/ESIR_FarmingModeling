/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.ActivityPeriodic;
import activity.Date;
import activity.RessourceAllocation;
import activity.Rule;

import exploitation.Atelier;
import exploitation.ExploitationPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.ActivityPeriodicImpl#getName <em>Name</em>}</li>
 *   <li>{@link activity.impl.ActivityPeriodicImpl#getStart <em>Start</em>}</li>
 *   <li>{@link activity.impl.ActivityPeriodicImpl#getEnd <em>End</em>}</li>
 *   <li>{@link activity.impl.ActivityPeriodicImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link activity.impl.ActivityPeriodicImpl#getResAllocation <em>Res Allocation</em>}</li>
 *   <li>{@link activity.impl.ActivityPeriodicImpl#getAtelier <em>Atelier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPeriodicImpl extends MinimalEObjectImpl.Container implements ActivityPeriodic {
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
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start;

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
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * The cached value of the '{@link #getResAllocation() <em>Res Allocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<RessourceAllocation> resAllocation;

	/**
	 * The cached value of the '{@link #getAtelier() <em>Atelier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtelier()
	 * @generated
	 * @ordered
	 */
	protected Atelier atelier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPeriodicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY_PERIODIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PERIODIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Date newStart, NotificationChain msgs) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PERIODIC__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_PERIODIC__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_PERIODIC__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PERIODIC__START, newStart, newStart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PERIODIC__END, oldEnd, newEnd);
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
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_PERIODIC__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_PERIODIC__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PERIODIC__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectResolvingEList<Rule>(Rule.class, this, ActivityPackage.ACTIVITY_PERIODIC__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RessourceAllocation> getResAllocation() {
		if (resAllocation == null) {
			resAllocation = new EObjectResolvingEList<RessourceAllocation>(RessourceAllocation.class, this, ActivityPackage.ACTIVITY_PERIODIC__RES_ALLOCATION);
		}
		return resAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atelier getAtelier() {
		if (atelier != null && atelier.eIsProxy()) {
			InternalEObject oldAtelier = (InternalEObject)atelier;
			atelier = (Atelier)eResolveProxy(oldAtelier);
			if (atelier != oldAtelier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ACTIVITY_PERIODIC__ATELIER, oldAtelier, atelier));
			}
		}
		return atelier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atelier basicGetAtelier() {
		return atelier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtelier(Atelier newAtelier, NotificationChain msgs) {
		Atelier oldAtelier = atelier;
		atelier = newAtelier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PERIODIC__ATELIER, oldAtelier, newAtelier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtelier(Atelier newAtelier) {
		if (newAtelier != atelier) {
			NotificationChain msgs = null;
			if (atelier != null)
				msgs = ((InternalEObject)atelier).eInverseRemove(this, ExploitationPackage.ATELIER__ACTIVITY, Atelier.class, msgs);
			if (newAtelier != null)
				msgs = ((InternalEObject)newAtelier).eInverseAdd(this, ExploitationPackage.ATELIER__ACTIVITY, Atelier.class, msgs);
			msgs = basicSetAtelier(newAtelier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PERIODIC__ATELIER, newAtelier, newAtelier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY_PERIODIC__ATELIER:
				if (atelier != null)
					msgs = ((InternalEObject)atelier).eInverseRemove(this, ExploitationPackage.ATELIER__ACTIVITY, Atelier.class, msgs);
				return basicSetAtelier((Atelier)otherEnd, msgs);
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
			case ActivityPackage.ACTIVITY_PERIODIC__START:
				return basicSetStart(null, msgs);
			case ActivityPackage.ACTIVITY_PERIODIC__END:
				return basicSetEnd(null, msgs);
			case ActivityPackage.ACTIVITY_PERIODIC__ATELIER:
				return basicSetAtelier(null, msgs);
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
			case ActivityPackage.ACTIVITY_PERIODIC__NAME:
				return getName();
			case ActivityPackage.ACTIVITY_PERIODIC__START:
				return getStart();
			case ActivityPackage.ACTIVITY_PERIODIC__END:
				return getEnd();
			case ActivityPackage.ACTIVITY_PERIODIC__RULE:
				return getRule();
			case ActivityPackage.ACTIVITY_PERIODIC__RES_ALLOCATION:
				return getResAllocation();
			case ActivityPackage.ACTIVITY_PERIODIC__ATELIER:
				if (resolve) return getAtelier();
				return basicGetAtelier();
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
			case ActivityPackage.ACTIVITY_PERIODIC__NAME:
				setName((String)newValue);
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__START:
				setStart((Date)newValue);
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__END:
				setEnd((Date)newValue);
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Rule>)newValue);
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__RES_ALLOCATION:
				getResAllocation().clear();
				getResAllocation().addAll((Collection<? extends RessourceAllocation>)newValue);
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__ATELIER:
				setAtelier((Atelier)newValue);
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
			case ActivityPackage.ACTIVITY_PERIODIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__START:
				setStart((Date)null);
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__END:
				setEnd((Date)null);
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__RULE:
				getRule().clear();
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__RES_ALLOCATION:
				getResAllocation().clear();
				return;
			case ActivityPackage.ACTIVITY_PERIODIC__ATELIER:
				setAtelier((Atelier)null);
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
			case ActivityPackage.ACTIVITY_PERIODIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivityPackage.ACTIVITY_PERIODIC__START:
				return start != null;
			case ActivityPackage.ACTIVITY_PERIODIC__END:
				return end != null;
			case ActivityPackage.ACTIVITY_PERIODIC__RULE:
				return rule != null && !rule.isEmpty();
			case ActivityPackage.ACTIVITY_PERIODIC__RES_ALLOCATION:
				return resAllocation != null && !resAllocation.isEmpty();
			case ActivityPackage.ACTIVITY_PERIODIC__ATELIER:
				return atelier != null;
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
		result.append(')');
		return result.toString();
	}

} //ActivityPeriodicImpl
