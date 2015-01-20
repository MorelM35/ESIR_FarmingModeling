/**
 */
package activity.util;

import activity.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see activity.ActivityPackage
 * @generated
 */
public class ActivitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySwitch() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ActivityPackage.PERIODIC_ACTIVITY: {
				PeriodicActivity periodicActivity = (PeriodicActivity)theEObject;
				T result = casePeriodicActivity(periodicActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.RESSOURCE_ALLOCATION: {
				RessourceAllocation ressourceAllocation = (RessourceAllocation)theEObject;
				T result = caseRessourceAllocation(ressourceAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.PREDICAT: {
				Predicat predicat = (Predicat)theEObject;
				T result = casePredicat(predicat);
				if (result == null) result = caseRule(predicat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.CHECK_DONE_ACTIVITY: {
				CheckDoneActivity checkDoneActivity = (CheckDoneActivity)theEObject;
				T result = caseCheckDoneActivity(checkDoneActivity);
				if (result == null) result = casePredicat(checkDoneActivity);
				if (result == null) result = caseRule(checkDoneActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.NO_RAIN: {
				NoRain noRain = (NoRain)theEObject;
				T result = caseNoRain(noRain);
				if (result == null) result = casePredicat(noRain);
				if (result == null) result = caseRule(noRain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseRule(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.WEATHER: {
				Weather weather = (Weather)theEObject;
				T result = caseWeather(weather);
				if (result == null) result = casePredicat(weather);
				if (result == null) result = caseRule(weather);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.TEMPERATURE: {
				Temperature temperature = (Temperature)theEObject;
				T result = caseTemperature(temperature);
				if (result == null) result = caseWeather(temperature);
				if (result == null) result = casePredicat(temperature);
				if (result == null) result = caseRule(temperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.EVAPO_TRANSPIRATION: {
				EvapoTranspiration evapoTranspiration = (EvapoTranspiration)theEObject;
				T result = caseEvapoTranspiration(evapoTranspiration);
				if (result == null) result = caseWeather(evapoTranspiration);
				if (result == null) result = casePredicat(evapoTranspiration);
				if (result == null) result = caseRule(evapoTranspiration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.PRECIPITATION: {
				Precipitation precipitation = (Precipitation)theEObject;
				T result = casePrecipitation(precipitation);
				if (result == null) result = caseWeather(precipitation);
				if (result == null) result = casePredicat(precipitation);
				if (result == null) result = caseRule(precipitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.RAYONNEMENT: {
				Rayonnement rayonnement = (Rayonnement)theEObject;
				T result = caseRayonnement(rayonnement);
				if (result == null) result = caseWeather(rayonnement);
				if (result == null) result = casePredicat(rayonnement);
				if (result == null) result = caseRule(rayonnement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.GRAIN_STATE: {
				GrainState grainState = (GrainState)theEObject;
				T result = caseGrainState(grainState);
				if (result == null) result = casePredicat(grainState);
				if (result == null) result = caseRule(grainState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.LAUNCHER: {
				Launcher launcher = (Launcher)theEObject;
				T result = caseLauncher(launcher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicActivity(PeriodicActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessourceAllocation(RessourceAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicat(Predicat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Done Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Done Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckDoneActivity(CheckDoneActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Rain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Rain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoRain(NoRain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weather</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weather</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeather(Weather object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperature(Temperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evapo Transpiration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evapo Transpiration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvapoTranspiration(EvapoTranspiration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precipitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precipitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecipitation(Precipitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rayonnement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rayonnement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRayonnement(Rayonnement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grain State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grain State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrainState(GrainState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Launcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLauncher(Launcher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActivitySwitch
