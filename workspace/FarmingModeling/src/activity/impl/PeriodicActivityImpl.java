/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.Date;
import activity.PeriodicActivity;
import activity.RessourceAllocation;
import activity.Rule;
import activity.periodicity;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.PeriodicActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link activity.impl.PeriodicActivityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link activity.impl.PeriodicActivityImpl#getEnd <em>End</em>}</li>
 *   <li>{@link activity.impl.PeriodicActivityImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link activity.impl.PeriodicActivityImpl#getResAllocation <em>Res Allocation</em>}</li>
 *   <li>{@link activity.impl.PeriodicActivityImpl#getAtelier <em>Atelier</em>}</li>
 *   <li>{@link activity.impl.PeriodicActivityImpl#getPeriodicityType <em>Periodicity Type</em>}</li>
 *   <li>{@link activity.impl.PeriodicActivityImpl#getFrequency <em>Frequency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodicActivityImpl extends MinimalEObjectImpl.Container implements PeriodicActivity {
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
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * The cached value of the '{@link #getResAllocation() <em>Res Allocation</em>}' containment reference list.
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
	 * The cached value of the '{@link #getPeriodicityType() <em>Periodicity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicityType()
	 * @generated
	 * @ordered
	 */
	protected periodicity periodicityType;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.PERIODIC_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__START, oldStart, newStart);
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
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.PERIODIC_ACTIVITY__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.PERIODIC_ACTIVITY__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__START, newStart, newStart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__END, oldEnd, newEnd);
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
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.PERIODIC_ACTIVITY__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.PERIODIC_ACTIVITY__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<Rule>(Rule.class, this, ActivityPackage.PERIODIC_ACTIVITY__RULE);
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
			resAllocation = new EObjectContainmentEList<RessourceAllocation>(RessourceAllocation.class, this, ActivityPackage.PERIODIC_ACTIVITY__RES_ALLOCATION);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.PERIODIC_ACTIVITY__ATELIER, oldAtelier, atelier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__ATELIER, oldAtelier, newAtelier);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__ATELIER, newAtelier, newAtelier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__PERIODICITY_TYPE, oldPeriodicityType, periodicityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.PERIODIC_ACTIVITY__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.PERIODIC_ACTIVITY__ATELIER:
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
			case ActivityPackage.PERIODIC_ACTIVITY__START:
				return basicSetStart(null, msgs);
			case ActivityPackage.PERIODIC_ACTIVITY__END:
				return basicSetEnd(null, msgs);
			case ActivityPackage.PERIODIC_ACTIVITY__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
			case ActivityPackage.PERIODIC_ACTIVITY__RES_ALLOCATION:
				return ((InternalEList<?>)getResAllocation()).basicRemove(otherEnd, msgs);
			case ActivityPackage.PERIODIC_ACTIVITY__ATELIER:
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
			case ActivityPackage.PERIODIC_ACTIVITY__NAME:
				return getName();
			case ActivityPackage.PERIODIC_ACTIVITY__START:
				return getStart();
			case ActivityPackage.PERIODIC_ACTIVITY__END:
				return getEnd();
			case ActivityPackage.PERIODIC_ACTIVITY__RULE:
				return getRule();
			case ActivityPackage.PERIODIC_ACTIVITY__RES_ALLOCATION:
				return getResAllocation();
			case ActivityPackage.PERIODIC_ACTIVITY__ATELIER:
				if (resolve) return getAtelier();
				return basicGetAtelier();
			case ActivityPackage.PERIODIC_ACTIVITY__PERIODICITY_TYPE:
				return getPeriodicityType();
			case ActivityPackage.PERIODIC_ACTIVITY__FREQUENCY:
				return getFrequency();
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
			case ActivityPackage.PERIODIC_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__START:
				setStart((Date)newValue);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__END:
				setEnd((Date)newValue);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Rule>)newValue);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__RES_ALLOCATION:
				getResAllocation().clear();
				getResAllocation().addAll((Collection<? extends RessourceAllocation>)newValue);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__ATELIER:
				setAtelier((Atelier)newValue);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__PERIODICITY_TYPE:
				setPeriodicityType((periodicity) newValue);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__FREQUENCY:
				setFrequency((Integer)newValue);
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
			case ActivityPackage.PERIODIC_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__START:
				setStart((Date)null);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__END:
				setEnd((Date)null);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__RULE:
				getRule().clear();
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__RES_ALLOCATION:
				getResAllocation().clear();
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__ATELIER:
				setAtelier((Atelier)null);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__PERIODICITY_TYPE:
				setPeriodicityType((periodicity)null);
				return;
			case ActivityPackage.PERIODIC_ACTIVITY__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
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
			case ActivityPackage.PERIODIC_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivityPackage.PERIODIC_ACTIVITY__START:
				return start != null;
			case ActivityPackage.PERIODIC_ACTIVITY__END:
				return end != null;
			case ActivityPackage.PERIODIC_ACTIVITY__RULE:
				return rule != null && !rule.isEmpty();
			case ActivityPackage.PERIODIC_ACTIVITY__RES_ALLOCATION:
				return resAllocation != null && !resAllocation.isEmpty();
			case ActivityPackage.PERIODIC_ACTIVITY__ATELIER:
				return atelier != null;
			case ActivityPackage.PERIODIC_ACTIVITY__PERIODICITY_TYPE:
				return periodicityType != null;
			case ActivityPackage.PERIODIC_ACTIVITY__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
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
		result.append(", periodicityType: ");
		result.append(periodicityType);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(')');
		return result.toString();
	}

} //PeriodicActivityImpl
