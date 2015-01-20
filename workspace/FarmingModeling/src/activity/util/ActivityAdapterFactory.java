/**
 */
package activity.util;

import activity.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see activity.ActivityPackage
 * @generated
 */
public class ActivityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivitySwitch<Adapter> modelSwitch =
		new ActivitySwitch<Adapter>() {
			@Override
			public Adapter casePeriodicActivity(PeriodicActivity object) {
				return createPeriodicActivityAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseRessourceAllocation(RessourceAllocation object) {
				return createRessourceAllocationAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter casePredicat(Predicat object) {
				return createPredicatAdapter();
			}
			@Override
			public Adapter caseCheckDoneActivity(CheckDoneActivity object) {
				return createCheckDoneActivityAdapter();
			}
			@Override
			public Adapter caseNoRain(NoRain object) {
				return createNoRainAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseWeather(Weather object) {
				return createWeatherAdapter();
			}
			@Override
			public Adapter caseTemperature(Temperature object) {
				return createTemperatureAdapter();
			}
			@Override
			public Adapter caseEvapoTranspiration(EvapoTranspiration object) {
				return createEvapoTranspirationAdapter();
			}
			@Override
			public Adapter casePrecipitation(Precipitation object) {
				return createPrecipitationAdapter();
			}
			@Override
			public Adapter caseRayonnement(Rayonnement object) {
				return createRayonnementAdapter();
			}
			@Override
			public Adapter caseGrainState(GrainState object) {
				return createGrainStateAdapter();
			}
			@Override
			public Adapter caseLauncher(Launcher object) {
				return createLauncherAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link activity.PeriodicActivity <em>Periodic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.PeriodicActivity
	 * @generated
	 */
	public Adapter createPeriodicActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.RessourceAllocation <em>Ressource Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.RessourceAllocation
	 * @generated
	 */
	public Adapter createRessourceAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Predicat <em>Predicat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Predicat
	 * @generated
	 */
	public Adapter createPredicatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.CheckDoneActivity <em>Check Done Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.CheckDoneActivity
	 * @generated
	 */
	public Adapter createCheckDoneActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.NoRain <em>No Rain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.NoRain
	 * @generated
	 */
	public Adapter createNoRainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Weather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Weather
	 * @generated
	 */
	public Adapter createWeatherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Temperature
	 * @generated
	 */
	public Adapter createTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.EvapoTranspiration <em>Evapo Transpiration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.EvapoTranspiration
	 * @generated
	 */
	public Adapter createEvapoTranspirationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Precipitation <em>Precipitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Precipitation
	 * @generated
	 */
	public Adapter createPrecipitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Rayonnement <em>Rayonnement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Rayonnement
	 * @generated
	 */
	public Adapter createRayonnementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.GrainState <em>Grain State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.GrainState
	 * @generated
	 */
	public Adapter createGrainStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activity.Launcher <em>Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activity.Launcher
	 * @generated
	 */
	public Adapter createLauncherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ActivityAdapterFactory
