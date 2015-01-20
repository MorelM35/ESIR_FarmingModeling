/**
 */
package activity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see activity.ActivityFactory
 * @model kind="package"
 * @generated
 */
public interface ActivityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://activity/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityPackage eINSTANCE = activity.impl.ActivityPackageImpl.init();

	/**
	 * The meta object id for the '{@link activity.impl.PeriodicActivityImpl <em>Periodic Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.PeriodicActivityImpl
	 * @see activity.impl.ActivityPackageImpl#getPeriodicActivity()
	 * @generated
	 */
	int PERIODIC_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__END = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__RULE = 3;

	/**
	 * The feature id for the '<em><b>Res Allocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__RES_ALLOCATION = 4;

	/**
	 * The feature id for the '<em><b>Atelier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__ATELIER = 5;

	/**
	 * The feature id for the '<em><b>Periodicity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__PERIODICITY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY__FREQUENCY = 7;

	/**
	 * The number of structural features of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Periodic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.DateImpl
	 * @see activity.impl.ActivityPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MONTH = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__YEAR = 2;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ModelImpl
	 * @see activity.impl.ActivityPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Ressource Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RESSOURCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.RessourceAllocationImpl <em>Ressource Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.RessourceAllocationImpl
	 * @see activity.impl.ActivityPackageImpl#getRessourceAllocation()
	 * @generated
	 */
	int RESSOURCE_ALLOCATION = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ALLOCATION__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ALLOCATION__RESSOURCE = 1;

	/**
	 * The feature id for the '<em><b>Periodicity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ALLOCATION__PERIODICITY_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Ressource Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ALLOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ressource Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.RuleImpl
	 * @see activity.impl.ActivityPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.PredicatImpl <em>Predicat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.PredicatImpl
	 * @see activity.impl.ActivityPackageImpl#getPredicat()
	 * @generated
	 */
	int PREDICAT = 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT__DATE = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.CheckDoneActivityImpl <em>Check Done Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.CheckDoneActivityImpl
	 * @see activity.impl.ActivityPackageImpl#getCheckDoneActivity()
	 * @generated
	 */
	int CHECK_DONE_ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DONE_ACTIVITY__DATE = PREDICAT__DATE;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DONE_ACTIVITY__ELAPSED_TIME = PREDICAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DONE_ACTIVITY__EREFERENCE0 = PREDICAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity To Validate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE = PREDICAT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Periodicity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DONE_ACTIVITY__PERIODICITY_TYPE = PREDICAT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Check Done Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DONE_ACTIVITY_FEATURE_COUNT = PREDICAT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Check Done Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_DONE_ACTIVITY_OPERATION_COUNT = PREDICAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.NoRainImpl <em>No Rain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.NoRainImpl
	 * @see activity.impl.ActivityPackageImpl#getNoRain()
	 * @generated
	 */
	int NO_RAIN = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_RAIN__DATE = PREDICAT__DATE;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_RAIN__ELAPSED_TIME = PREDICAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Periodicity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_RAIN__PERIODICITY_TYPE = PREDICAT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>No Rain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_RAIN_FEATURE_COUNT = PREDICAT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>No Rain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_RAIN_OPERATION_COUNT = PREDICAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.BinaryExpressionImpl
	 * @see activity.impl.ActivityPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPE = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.WeatherImpl <em>Weather</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.WeatherImpl
	 * @see activity.impl.ActivityPackageImpl#getWeather()
	 * @generated
	 */
	int WEATHER = 9;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__DATE = PREDICAT__DATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__COMPARATOR = PREDICAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weather</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_FEATURE_COUNT = PREDICAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Weather</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_OPERATION_COUNT = PREDICAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.TemperatureImpl <em>Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.TemperatureImpl
	 * @see activity.impl.ActivityPackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 10;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__DATE = WEATHER__DATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__COMPARATOR = WEATHER__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__VALUE = WEATHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_FEATURE_COUNT = WEATHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_OPERATION_COUNT = WEATHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.EvapoTranspirationImpl <em>Evapo Transpiration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.EvapoTranspirationImpl
	 * @see activity.impl.ActivityPackageImpl#getEvapoTranspiration()
	 * @generated
	 */
	int EVAPO_TRANSPIRATION = 11;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAPO_TRANSPIRATION__DATE = WEATHER__DATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAPO_TRANSPIRATION__COMPARATOR = WEATHER__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAPO_TRANSPIRATION__VALUE = WEATHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evapo Transpiration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAPO_TRANSPIRATION_FEATURE_COUNT = WEATHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evapo Transpiration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAPO_TRANSPIRATION_OPERATION_COUNT = WEATHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.PrecipitationImpl <em>Precipitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.PrecipitationImpl
	 * @see activity.impl.ActivityPackageImpl#getPrecipitation()
	 * @generated
	 */
	int PRECIPITATION = 12;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION__DATE = WEATHER__DATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION__COMPARATOR = WEATHER__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION__HEIGHT = WEATHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Precipitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_FEATURE_COUNT = WEATHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Precipitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECIPITATION_OPERATION_COUNT = WEATHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.RayonnementImpl <em>Rayonnement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.RayonnementImpl
	 * @see activity.impl.ActivityPackageImpl#getRayonnement()
	 * @generated
	 */
	int RAYONNEMENT = 13;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAYONNEMENT__DATE = WEATHER__DATE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAYONNEMENT__COMPARATOR = WEATHER__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAYONNEMENT__VALUE = WEATHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rayonnement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAYONNEMENT_FEATURE_COUNT = WEATHER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rayonnement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAYONNEMENT_OPERATION_COUNT = WEATHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.GrainStateImpl <em>Grain State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.GrainStateImpl
	 * @see activity.impl.ActivityPackageImpl#getGrainState()
	 * @generated
	 */
	int GRAIN_STATE = 14;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAIN_STATE__DATE = PREDICAT__DATE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAIN_STATE__STATE = PREDICAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grain State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAIN_STATE_FEATURE_COUNT = PREDICAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Grain State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAIN_STATE_OPERATION_COUNT = PREDICAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.LauncherImpl <em>Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.LauncherImpl
	 * @see activity.impl.ActivityPackageImpl#getLauncher()
	 * @generated
	 */
	int LAUNCHER = 15;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__END = 1;

	/**
	 * The feature id for the '<em><b>QMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__QMAX = 2;

	/**
	 * The feature id for the '<em><b>Quantity Of Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__QUANTITY_OF_WATER = 3;

	/**
	 * The number of structural features of the '<em>Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.periodicity <em>periodicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.periodicity
	 * @see activity.impl.ActivityPackageImpl#getperiodicity()
	 * @generated
	 */
	int PERIODICITY = 16;

	/**
	 * The meta object id for the '{@link activity.Month <em>Month</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.Month
	 * @see activity.impl.ActivityPackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 17;

	/**
	 * The meta object id for the '{@link activity.ComparatorType <em>Comparator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.ComparatorType
	 * @see activity.impl.ActivityPackageImpl#getComparatorType()
	 * @generated
	 */
	int COMPARATOR_TYPE = 18;

	/**
	 * The meta object id for the '{@link activity.BinaryExpressionType <em>Binary Expression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.BinaryExpressionType
	 * @see activity.impl.ActivityPackageImpl#getBinaryExpressionType()
	 * @generated
	 */
	int BINARY_EXPRESSION_TYPE = 19;

	/**
	 * The meta object id for the '{@link activity.GrainStateEnum <em>Grain State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.GrainStateEnum
	 * @see activity.impl.ActivityPackageImpl#getGrainStateEnum()
	 * @generated
	 */
	int GRAIN_STATE_ENUM = 20;


	/**
	 * Returns the meta object for class '{@link activity.PeriodicActivity <em>Periodic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Activity</em>'.
	 * @see activity.PeriodicActivity
	 * @generated
	 */
	EClass getPeriodicActivity();

	/**
	 * Returns the meta object for the attribute '{@link activity.PeriodicActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activity.PeriodicActivity#getName()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EAttribute getPeriodicActivity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link activity.PeriodicActivity#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see activity.PeriodicActivity#getStart()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EReference getPeriodicActivity_Start();

	/**
	 * Returns the meta object for the containment reference '{@link activity.PeriodicActivity#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see activity.PeriodicActivity#getEnd()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EReference getPeriodicActivity_End();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.PeriodicActivity#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see activity.PeriodicActivity#getRule()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EReference getPeriodicActivity_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.PeriodicActivity#getResAllocation <em>Res Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Res Allocation</em>'.
	 * @see activity.PeriodicActivity#getResAllocation()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EReference getPeriodicActivity_ResAllocation();

	/**
	 * Returns the meta object for the reference '{@link activity.PeriodicActivity#getAtelier <em>Atelier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atelier</em>'.
	 * @see activity.PeriodicActivity#getAtelier()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EReference getPeriodicActivity_Atelier();

	/**
	 * Returns the meta object for the attribute '{@link activity.PeriodicActivity#getPeriodicityType <em>Periodicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodicity Type</em>'.
	 * @see activity.PeriodicActivity#getPeriodicityType()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EAttribute getPeriodicActivity_PeriodicityType();

	/**
	 * Returns the meta object for the attribute '{@link activity.PeriodicActivity#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see activity.PeriodicActivity#getFrequency()
	 * @see #getPeriodicActivity()
	 * @generated
	 */
	EAttribute getPeriodicActivity_Frequency();

	/**
	 * Returns the meta object for class '{@link activity.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see activity.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link activity.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see activity.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for the attribute '{@link activity.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see activity.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link activity.Date#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see activity.Date#getYear()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Year();

	/**
	 * Returns the meta object for class '{@link activity.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see activity.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Model#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see activity.Model#getActivity()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Activity();

	/**
	 * Returns the meta object for the reference list '{@link activity.Model#getRessourceType <em>Ressource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ressource Type</em>'.
	 * @see activity.Model#getRessourceType()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_RessourceType();

	/**
	 * Returns the meta object for the attribute '{@link activity.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activity.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link activity.RessourceAllocation <em>Ressource Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource Allocation</em>'.
	 * @see activity.RessourceAllocation
	 * @generated
	 */
	EClass getRessourceAllocation();

	/**
	 * Returns the meta object for the attribute '{@link activity.RessourceAllocation#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see activity.RessourceAllocation#getDuration()
	 * @see #getRessourceAllocation()
	 * @generated
	 */
	EAttribute getRessourceAllocation_Duration();

	/**
	 * Returns the meta object for the reference '{@link activity.RessourceAllocation#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ressource</em>'.
	 * @see activity.RessourceAllocation#getRessource()
	 * @see #getRessourceAllocation()
	 * @generated
	 */
	EReference getRessourceAllocation_Ressource();

	/**
	 * Returns the meta object for the attribute '{@link activity.RessourceAllocation#getPeriodicityType <em>Periodicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodicity Type</em>'.
	 * @see activity.RessourceAllocation#getPeriodicityType()
	 * @see #getRessourceAllocation()
	 * @generated
	 */
	EAttribute getRessourceAllocation_PeriodicityType();

	/**
	 * Returns the meta object for class '{@link activity.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see activity.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for class '{@link activity.Predicat <em>Predicat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicat</em>'.
	 * @see activity.Predicat
	 * @generated
	 */
	EClass getPredicat();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Predicat#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see activity.Predicat#getDate()
	 * @see #getPredicat()
	 * @generated
	 */
	EReference getPredicat_Date();

	/**
	 * Returns the meta object for class '{@link activity.CheckDoneActivity <em>Check Done Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Done Activity</em>'.
	 * @see activity.CheckDoneActivity
	 * @generated
	 */
	EClass getCheckDoneActivity();

	/**
	 * Returns the meta object for the attribute '{@link activity.CheckDoneActivity#getElapsedTime <em>Elapsed Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed Time</em>'.
	 * @see activity.CheckDoneActivity#getElapsedTime()
	 * @see #getCheckDoneActivity()
	 * @generated
	 */
	EAttribute getCheckDoneActivity_ElapsedTime();

	/**
	 * Returns the meta object for the reference '{@link activity.CheckDoneActivity#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see activity.CheckDoneActivity#getEReference0()
	 * @see #getCheckDoneActivity()
	 * @generated
	 */
	EReference getCheckDoneActivity_EReference0();

	/**
	 * Returns the meta object for the reference '{@link activity.CheckDoneActivity#getActivityToValidate <em>Activity To Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity To Validate</em>'.
	 * @see activity.CheckDoneActivity#getActivityToValidate()
	 * @see #getCheckDoneActivity()
	 * @generated
	 */
	EReference getCheckDoneActivity_ActivityToValidate();

	/**
	 * Returns the meta object for the attribute '{@link activity.CheckDoneActivity#getPeriodicityType <em>Periodicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodicity Type</em>'.
	 * @see activity.CheckDoneActivity#getPeriodicityType()
	 * @see #getCheckDoneActivity()
	 * @generated
	 */
	EAttribute getCheckDoneActivity_PeriodicityType();

	/**
	 * Returns the meta object for class '{@link activity.NoRain <em>No Rain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Rain</em>'.
	 * @see activity.NoRain
	 * @generated
	 */
	EClass getNoRain();

	/**
	 * Returns the meta object for the attribute '{@link activity.NoRain#getElapsedTime <em>Elapsed Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed Time</em>'.
	 * @see activity.NoRain#getElapsedTime()
	 * @see #getNoRain()
	 * @generated
	 */
	EAttribute getNoRain_ElapsedTime();

	/**
	 * Returns the meta object for the attribute '{@link activity.NoRain#getPeriodicityType <em>Periodicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodicity Type</em>'.
	 * @see activity.NoRain#getPeriodicityType()
	 * @see #getNoRain()
	 * @generated
	 */
	EAttribute getNoRain_PeriodicityType();

	/**
	 * Returns the meta object for class '{@link activity.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see activity.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link activity.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activity.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activity.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activity.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link activity.BinaryExpression#getOpe <em>Ope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ope</em>'.
	 * @see activity.BinaryExpression#getOpe()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Ope();

	/**
	 * Returns the meta object for class '{@link activity.Weather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weather</em>'.
	 * @see activity.Weather
	 * @generated
	 */
	EClass getWeather();

	/**
	 * Returns the meta object for the attribute '{@link activity.Weather#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see activity.Weather#getComparator()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_Comparator();

	/**
	 * Returns the meta object for class '{@link activity.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature</em>'.
	 * @see activity.Temperature
	 * @generated
	 */
	EClass getTemperature();

	/**
	 * Returns the meta object for the attribute '{@link activity.Temperature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activity.Temperature#getValue()
	 * @see #getTemperature()
	 * @generated
	 */
	EAttribute getTemperature_Value();

	/**
	 * Returns the meta object for class '{@link activity.EvapoTranspiration <em>Evapo Transpiration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evapo Transpiration</em>'.
	 * @see activity.EvapoTranspiration
	 * @generated
	 */
	EClass getEvapoTranspiration();

	/**
	 * Returns the meta object for the attribute '{@link activity.EvapoTranspiration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activity.EvapoTranspiration#getValue()
	 * @see #getEvapoTranspiration()
	 * @generated
	 */
	EAttribute getEvapoTranspiration_Value();

	/**
	 * Returns the meta object for class '{@link activity.Precipitation <em>Precipitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precipitation</em>'.
	 * @see activity.Precipitation
	 * @generated
	 */
	EClass getPrecipitation();

	/**
	 * Returns the meta object for the attribute '{@link activity.Precipitation#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see activity.Precipitation#getHeight()
	 * @see #getPrecipitation()
	 * @generated
	 */
	EAttribute getPrecipitation_Height();

	/**
	 * Returns the meta object for class '{@link activity.Rayonnement <em>Rayonnement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rayonnement</em>'.
	 * @see activity.Rayonnement
	 * @generated
	 */
	EClass getRayonnement();

	/**
	 * Returns the meta object for the attribute '{@link activity.Rayonnement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activity.Rayonnement#getValue()
	 * @see #getRayonnement()
	 * @generated
	 */
	EAttribute getRayonnement_Value();

	/**
	 * Returns the meta object for class '{@link activity.GrainState <em>Grain State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grain State</em>'.
	 * @see activity.GrainState
	 * @generated
	 */
	EClass getGrainState();

	/**
	 * Returns the meta object for the attribute '{@link activity.GrainState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see activity.GrainState#getState()
	 * @see #getGrainState()
	 * @generated
	 */
	EAttribute getGrainState_State();

	/**
	 * Returns the meta object for class '{@link activity.Launcher <em>Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launcher</em>'.
	 * @see activity.Launcher
	 * @generated
	 */
	EClass getLauncher();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Launcher#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see activity.Launcher#getBegin()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Launcher#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see activity.Launcher#getEnd()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_End();

	/**
	 * Returns the meta object for the attribute '{@link activity.Launcher#getQMax <em>QMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QMax</em>'.
	 * @see activity.Launcher#getQMax()
	 * @see #getLauncher()
	 * @generated
	 */
	EAttribute getLauncher_QMax();

	/**
	 * Returns the meta object for the attribute '{@link activity.Launcher#getQuantityOfWater <em>Quantity Of Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Of Water</em>'.
	 * @see activity.Launcher#getQuantityOfWater()
	 * @see #getLauncher()
	 * @generated
	 */
	EAttribute getLauncher_QuantityOfWater();

	/**
	 * Returns the meta object for enum '{@link activity.periodicity <em>periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>periodicity</em>'.
	 * @see activity.periodicity
	 * @generated
	 */
	EEnum getperiodicity();

	/**
	 * Returns the meta object for enum '{@link activity.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month</em>'.
	 * @see activity.Month
	 * @generated
	 */
	EEnum getMonth();

	/**
	 * Returns the meta object for enum '{@link activity.ComparatorType <em>Comparator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparator Type</em>'.
	 * @see activity.ComparatorType
	 * @generated
	 */
	EEnum getComparatorType();

	/**
	 * Returns the meta object for enum '{@link activity.BinaryExpressionType <em>Binary Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Expression Type</em>'.
	 * @see activity.BinaryExpressionType
	 * @generated
	 */
	EEnum getBinaryExpressionType();

	/**
	 * Returns the meta object for enum '{@link activity.GrainStateEnum <em>Grain State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grain State Enum</em>'.
	 * @see activity.GrainStateEnum
	 * @generated
	 */
	EEnum getGrainStateEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityFactory getActivityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activity.impl.PeriodicActivityImpl <em>Periodic Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.PeriodicActivityImpl
		 * @see activity.impl.ActivityPackageImpl#getPeriodicActivity()
		 * @generated
		 */
		EClass PERIODIC_ACTIVITY = eINSTANCE.getPeriodicActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVITY__NAME = eINSTANCE.getPeriodicActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_ACTIVITY__START = eINSTANCE.getPeriodicActivity_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_ACTIVITY__END = eINSTANCE.getPeriodicActivity_End();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_ACTIVITY__RULE = eINSTANCE.getPeriodicActivity_Rule();

		/**
		 * The meta object literal for the '<em><b>Res Allocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_ACTIVITY__RES_ALLOCATION = eINSTANCE.getPeriodicActivity_ResAllocation();

		/**
		 * The meta object literal for the '<em><b>Atelier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_ACTIVITY__ATELIER = eINSTANCE.getPeriodicActivity_Atelier();

		/**
		 * The meta object literal for the '<em><b>Periodicity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVITY__PERIODICITY_TYPE = eINSTANCE.getPeriodicActivity_PeriodicityType();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_ACTIVITY__FREQUENCY = eINSTANCE.getPeriodicActivity_Frequency();

		/**
		 * The meta object literal for the '{@link activity.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.DateImpl
		 * @see activity.impl.ActivityPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

		/**
		 * The meta object literal for the '{@link activity.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ModelImpl
		 * @see activity.impl.ActivityPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ACTIVITY = eINSTANCE.getModel_Activity();

		/**
		 * The meta object literal for the '<em><b>Ressource Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RESSOURCE_TYPE = eINSTANCE.getModel_RessourceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link activity.impl.RessourceAllocationImpl <em>Ressource Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.RessourceAllocationImpl
		 * @see activity.impl.ActivityPackageImpl#getRessourceAllocation()
		 * @generated
		 */
		EClass RESSOURCE_ALLOCATION = eINSTANCE.getRessourceAllocation();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE_ALLOCATION__DURATION = eINSTANCE.getRessourceAllocation_Duration();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE_ALLOCATION__RESSOURCE = eINSTANCE.getRessourceAllocation_Ressource();

		/**
		 * The meta object literal for the '<em><b>Periodicity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE_ALLOCATION__PERIODICITY_TYPE = eINSTANCE.getRessourceAllocation_PeriodicityType();

		/**
		 * The meta object literal for the '{@link activity.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.RuleImpl
		 * @see activity.impl.ActivityPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '{@link activity.impl.PredicatImpl <em>Predicat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.PredicatImpl
		 * @see activity.impl.ActivityPackageImpl#getPredicat()
		 * @generated
		 */
		EClass PREDICAT = eINSTANCE.getPredicat();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICAT__DATE = eINSTANCE.getPredicat_Date();

		/**
		 * The meta object literal for the '{@link activity.impl.CheckDoneActivityImpl <em>Check Done Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.CheckDoneActivityImpl
		 * @see activity.impl.ActivityPackageImpl#getCheckDoneActivity()
		 * @generated
		 */
		EClass CHECK_DONE_ACTIVITY = eINSTANCE.getCheckDoneActivity();

		/**
		 * The meta object literal for the '<em><b>Elapsed Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_DONE_ACTIVITY__ELAPSED_TIME = eINSTANCE.getCheckDoneActivity_ElapsedTime();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_DONE_ACTIVITY__EREFERENCE0 = eINSTANCE.getCheckDoneActivity_EReference0();

		/**
		 * The meta object literal for the '<em><b>Activity To Validate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE = eINSTANCE.getCheckDoneActivity_ActivityToValidate();

		/**
		 * The meta object literal for the '<em><b>Periodicity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_DONE_ACTIVITY__PERIODICITY_TYPE = eINSTANCE.getCheckDoneActivity_PeriodicityType();

		/**
		 * The meta object literal for the '{@link activity.impl.NoRainImpl <em>No Rain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.NoRainImpl
		 * @see activity.impl.ActivityPackageImpl#getNoRain()
		 * @generated
		 */
		EClass NO_RAIN = eINSTANCE.getNoRain();

		/**
		 * The meta object literal for the '<em><b>Elapsed Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_RAIN__ELAPSED_TIME = eINSTANCE.getNoRain_ElapsedTime();

		/**
		 * The meta object literal for the '<em><b>Periodicity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_RAIN__PERIODICITY_TYPE = eINSTANCE.getNoRain_PeriodicityType();

		/**
		 * The meta object literal for the '{@link activity.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.BinaryExpressionImpl
		 * @see activity.impl.ActivityPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Ope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPE = eINSTANCE.getBinaryExpression_Ope();

		/**
		 * The meta object literal for the '{@link activity.impl.WeatherImpl <em>Weather</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.WeatherImpl
		 * @see activity.impl.ActivityPackageImpl#getWeather()
		 * @generated
		 */
		EClass WEATHER = eINSTANCE.getWeather();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__COMPARATOR = eINSTANCE.getWeather_Comparator();

		/**
		 * The meta object literal for the '{@link activity.impl.TemperatureImpl <em>Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.TemperatureImpl
		 * @see activity.impl.ActivityPackageImpl#getTemperature()
		 * @generated
		 */
		EClass TEMPERATURE = eINSTANCE.getTemperature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE__VALUE = eINSTANCE.getTemperature_Value();

		/**
		 * The meta object literal for the '{@link activity.impl.EvapoTranspirationImpl <em>Evapo Transpiration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.EvapoTranspirationImpl
		 * @see activity.impl.ActivityPackageImpl#getEvapoTranspiration()
		 * @generated
		 */
		EClass EVAPO_TRANSPIRATION = eINSTANCE.getEvapoTranspiration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVAPO_TRANSPIRATION__VALUE = eINSTANCE.getEvapoTranspiration_Value();

		/**
		 * The meta object literal for the '{@link activity.impl.PrecipitationImpl <em>Precipitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.PrecipitationImpl
		 * @see activity.impl.ActivityPackageImpl#getPrecipitation()
		 * @generated
		 */
		EClass PRECIPITATION = eINSTANCE.getPrecipitation();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECIPITATION__HEIGHT = eINSTANCE.getPrecipitation_Height();

		/**
		 * The meta object literal for the '{@link activity.impl.RayonnementImpl <em>Rayonnement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.RayonnementImpl
		 * @see activity.impl.ActivityPackageImpl#getRayonnement()
		 * @generated
		 */
		EClass RAYONNEMENT = eINSTANCE.getRayonnement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAYONNEMENT__VALUE = eINSTANCE.getRayonnement_Value();

		/**
		 * The meta object literal for the '{@link activity.impl.GrainStateImpl <em>Grain State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.GrainStateImpl
		 * @see activity.impl.ActivityPackageImpl#getGrainState()
		 * @generated
		 */
		EClass GRAIN_STATE = eINSTANCE.getGrainState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAIN_STATE__STATE = eINSTANCE.getGrainState_State();

		/**
		 * The meta object literal for the '{@link activity.impl.LauncherImpl <em>Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.LauncherImpl
		 * @see activity.impl.ActivityPackageImpl#getLauncher()
		 * @generated
		 */
		EClass LAUNCHER = eINSTANCE.getLauncher();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__BEGIN = eINSTANCE.getLauncher_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__END = eINSTANCE.getLauncher_End();

		/**
		 * The meta object literal for the '<em><b>QMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER__QMAX = eINSTANCE.getLauncher_QMax();

		/**
		 * The meta object literal for the '<em><b>Quantity Of Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER__QUANTITY_OF_WATER = eINSTANCE.getLauncher_QuantityOfWater();

		/**
		 * The meta object literal for the '{@link activity.periodicity <em>periodicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.periodicity
		 * @see activity.impl.ActivityPackageImpl#getperiodicity()
		 * @generated
		 */
		EEnum PERIODICITY = eINSTANCE.getperiodicity();

		/**
		 * The meta object literal for the '{@link activity.Month <em>Month</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.Month
		 * @see activity.impl.ActivityPackageImpl#getMonth()
		 * @generated
		 */
		EEnum MONTH = eINSTANCE.getMonth();

		/**
		 * The meta object literal for the '{@link activity.ComparatorType <em>Comparator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.ComparatorType
		 * @see activity.impl.ActivityPackageImpl#getComparatorType()
		 * @generated
		 */
		EEnum COMPARATOR_TYPE = eINSTANCE.getComparatorType();

		/**
		 * The meta object literal for the '{@link activity.BinaryExpressionType <em>Binary Expression Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.BinaryExpressionType
		 * @see activity.impl.ActivityPackageImpl#getBinaryExpressionType()
		 * @generated
		 */
		EEnum BINARY_EXPRESSION_TYPE = eINSTANCE.getBinaryExpressionType();

		/**
		 * The meta object literal for the '{@link activity.GrainStateEnum <em>Grain State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.GrainStateEnum
		 * @see activity.impl.ActivityPackageImpl#getGrainStateEnum()
		 * @generated
		 */
		EEnum GRAIN_STATE_ENUM = eINSTANCE.getGrainStateEnum();

	}

} //ActivityPackage
