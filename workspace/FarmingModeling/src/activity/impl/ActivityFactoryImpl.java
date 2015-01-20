/**
 */
package activity.impl;

import activity.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityFactoryImpl extends EFactoryImpl implements ActivityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityFactory init() {
		try {
			ActivityFactory theActivityFactory = (ActivityFactory)EPackage.Registry.INSTANCE.getEFactory(ActivityPackage.eNS_URI);
			if (theActivityFactory != null) {
				return theActivityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActivityPackage.PERIODIC_ACTIVITY: return createPeriodicActivity();
			case ActivityPackage.DATE: return createDate();
			case ActivityPackage.MODEL: return createModel();
			case ActivityPackage.RESSOURCE_ALLOCATION: return createRessourceAllocation();
			case ActivityPackage.RULE: return createRule();
			case ActivityPackage.PREDICAT: return createPredicat();
			case ActivityPackage.CHECK_DONE_ACTIVITY: return createCheckDoneActivity();
			case ActivityPackage.NO_RAIN: return createNoRain();
			case ActivityPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case ActivityPackage.TEMPERATURE: return createTemperature();
			case ActivityPackage.EVAPO_TRANSPIRATION: return createEvapoTranspiration();
			case ActivityPackage.PRECIPITATION: return createPrecipitation();
			case ActivityPackage.RAYONNEMENT: return createRayonnement();
			case ActivityPackage.GRAIN_STATE: return createGrainState();
			case ActivityPackage.LAUNCHER: return createLauncher();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ActivityPackage.PERIODICITY:
				return createperiodicityFromString(eDataType, initialValue);
			case ActivityPackage.MONTH:
				return createMonthFromString(eDataType, initialValue);
			case ActivityPackage.COMPARATOR_TYPE:
				return createComparatorTypeFromString(eDataType, initialValue);
			case ActivityPackage.BINARY_EXPRESSION_TYPE:
				return createBinaryExpressionTypeFromString(eDataType, initialValue);
			case ActivityPackage.GRAIN_STATE_ENUM:
				return createGrainStateEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ActivityPackage.PERIODICITY:
				return convertperiodicityToString(eDataType, instanceValue);
			case ActivityPackage.MONTH:
				return convertMonthToString(eDataType, instanceValue);
			case ActivityPackage.COMPARATOR_TYPE:
				return convertComparatorTypeToString(eDataType, instanceValue);
			case ActivityPackage.BINARY_EXPRESSION_TYPE:
				return convertBinaryExpressionTypeToString(eDataType, instanceValue);
			case ActivityPackage.GRAIN_STATE_ENUM:
				return convertGrainStateEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicActivity createPeriodicActivity() {
		PeriodicActivityImpl periodicActivity = new PeriodicActivityImpl();
		return periodicActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceAllocation createRessourceAllocation() {
		RessourceAllocationImpl ressourceAllocation = new RessourceAllocationImpl();
		return ressourceAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicat createPredicat() {
		PredicatImpl predicat = new PredicatImpl();
		return predicat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckDoneActivity createCheckDoneActivity() {
		CheckDoneActivityImpl checkDoneActivity = new CheckDoneActivityImpl();
		return checkDoneActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoRain createNoRain() {
		NoRainImpl noRain = new NoRainImpl();
		return noRain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temperature createTemperature() {
		TemperatureImpl temperature = new TemperatureImpl();
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvapoTranspiration createEvapoTranspiration() {
		EvapoTranspirationImpl evapoTranspiration = new EvapoTranspirationImpl();
		return evapoTranspiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precipitation createPrecipitation() {
		PrecipitationImpl precipitation = new PrecipitationImpl();
		return precipitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rayonnement createRayonnement() {
		RayonnementImpl rayonnement = new RayonnementImpl();
		return rayonnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrainState createGrainState() {
		GrainStateImpl grainState = new GrainStateImpl();
		return grainState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Launcher createLauncher() {
		LauncherImpl launcher = new LauncherImpl();
		return launcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public periodicity createperiodicityFromString(EDataType eDataType, String initialValue) {
		periodicity result = periodicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertperiodicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Month createMonthFromString(EDataType eDataType, String initialValue) {
		Month result = Month.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparatorType createComparatorTypeFromString(EDataType eDataType, String initialValue) {
		ComparatorType result = ComparatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionType createBinaryExpressionTypeFromString(EDataType eDataType, String initialValue) {
		BinaryExpressionType result = BinaryExpressionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryExpressionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrainStateEnum createGrainStateEnumFromString(EDataType eDataType, String initialValue) {
		GrainStateEnum result = GrainStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGrainStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPackage getActivityPackage() {
		return (ActivityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivityPackage getPackage() {
		return ActivityPackage.eINSTANCE;
	}

} //ActivityFactoryImpl
