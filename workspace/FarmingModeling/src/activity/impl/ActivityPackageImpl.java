/**
 */
package activity.impl;

import activity.ActivityFactory;
import activity.ActivityPackage;
import activity.BinaryExpression;
import activity.BinaryExpressionType;
import activity.CheckDoneActivity;
import activity.ComparatorType;
import activity.Date;
import activity.EvapoTranspiration;
import activity.GrainState;
import activity.GrainStateEnum;
import activity.Launcher;
import activity.Model;
import activity.Month;
import activity.NoRain;
import activity.PeriodicActivity;
import activity.Precipitation;
import activity.Predicat;
import activity.Rayonnement;
import activity.RessourceAllocation;
import activity.Rule;
import activity.Temperature;
import activity.Weather;
import activity.periodicity;

import exploitation.ExploitationPackage;

import exploitation.impl.ExploitationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityPackageImpl extends EPackageImpl implements ActivityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkDoneActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noRainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weatherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evapoTranspirationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precipitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rayonnementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grainStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum periodicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryExpressionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum grainStateEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see activity.ActivityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivityPackageImpl() {
		super(eNS_URI, ActivityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ActivityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivityPackage init() {
		if (isInited) return (ActivityPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);

		// Obtain or create and register package
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivityPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExploitationPackageImpl theExploitationPackage = (ExploitationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExploitationPackage.eNS_URI) instanceof ExploitationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExploitationPackage.eNS_URI) : ExploitationPackage.eINSTANCE);

		// Create package meta-data objects
		theActivityPackage.createPackageContents();
		theExploitationPackage.createPackageContents();

		// Initialize created meta-data
		theActivityPackage.initializePackageContents();
		theExploitationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivityPackage.eNS_URI, theActivityPackage);
		return theActivityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicActivity() {
		return periodicActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivity_Name() {
		return (EAttribute)periodicActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivity_Start() {
		return (EReference)periodicActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivity_End() {
		return (EReference)periodicActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivity_Rule() {
		return (EReference)periodicActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivity_ResAllocation() {
		return (EReference)periodicActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivity_Atelier() {
		return (EReference)periodicActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivity_PeriodicityType() {
		return (EAttribute)periodicActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicActivity_Frequency() {
		return (EAttribute)periodicActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Day() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Month() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Year() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Activity() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_RessourceType() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessourceAllocation() {
		return ressourceAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessourceAllocation_Duration() {
		return (EAttribute)ressourceAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessourceAllocation_Ressource() {
		return (EReference)ressourceAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessourceAllocation_PeriodicityType() {
		return (EAttribute)ressourceAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicat() {
		return predicatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicat_Date() {
		return (EReference)predicatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckDoneActivity() {
		return checkDoneActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckDoneActivity_ElapsedTime() {
		return (EAttribute)checkDoneActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckDoneActivity_EReference0() {
		return (EReference)checkDoneActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckDoneActivity_ActivityToValidate() {
		return (EReference)checkDoneActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckDoneActivity_PeriodicityType() {
		return (EAttribute)checkDoneActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoRain() {
		return noRainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoRain_ElapsedTime() {
		return (EAttribute)noRainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoRain_PeriodicityType() {
		return (EAttribute)noRainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Ope() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeather() {
		return weatherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_Comparator() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemperature() {
		return temperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperature_Value() {
		return (EAttribute)temperatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvapoTranspiration() {
		return evapoTranspirationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvapoTranspiration_Value() {
		return (EAttribute)evapoTranspirationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecipitation() {
		return precipitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecipitation_Height() {
		return (EAttribute)precipitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRayonnement() {
		return rayonnementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRayonnement_Value() {
		return (EAttribute)rayonnementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrainState() {
		return grainStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrainState_State() {
		return (EAttribute)grainStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLauncher() {
		return launcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_Begin() {
		return (EReference)launcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_End() {
		return (EReference)launcherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncher_QMax() {
		return (EAttribute)launcherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncher_QuantityOfWater() {
		return (EAttribute)launcherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getperiodicity() {
		return periodicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonth() {
		return monthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparatorType() {
		return comparatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryExpressionType() {
		return binaryExpressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGrainStateEnum() {
		return grainStateEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFactory getActivityFactory() {
		return (ActivityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		periodicActivityEClass = createEClass(PERIODIC_ACTIVITY);
		createEAttribute(periodicActivityEClass, PERIODIC_ACTIVITY__NAME);
		createEReference(periodicActivityEClass, PERIODIC_ACTIVITY__START);
		createEReference(periodicActivityEClass, PERIODIC_ACTIVITY__END);
		createEReference(periodicActivityEClass, PERIODIC_ACTIVITY__RULE);
		createEReference(periodicActivityEClass, PERIODIC_ACTIVITY__RES_ALLOCATION);
		createEReference(periodicActivityEClass, PERIODIC_ACTIVITY__ATELIER);
		createEAttribute(periodicActivityEClass, PERIODIC_ACTIVITY__PERIODICITY_TYPE);
		createEAttribute(periodicActivityEClass, PERIODIC_ACTIVITY__FREQUENCY);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__DAY);
		createEAttribute(dateEClass, DATE__MONTH);
		createEAttribute(dateEClass, DATE__YEAR);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ACTIVITY);
		createEReference(modelEClass, MODEL__RESSOURCE_TYPE);
		createEAttribute(modelEClass, MODEL__NAME);

		ressourceAllocationEClass = createEClass(RESSOURCE_ALLOCATION);
		createEAttribute(ressourceAllocationEClass, RESSOURCE_ALLOCATION__DURATION);
		createEReference(ressourceAllocationEClass, RESSOURCE_ALLOCATION__RESSOURCE);
		createEAttribute(ressourceAllocationEClass, RESSOURCE_ALLOCATION__PERIODICITY_TYPE);

		ruleEClass = createEClass(RULE);

		predicatEClass = createEClass(PREDICAT);
		createEReference(predicatEClass, PREDICAT__DATE);

		checkDoneActivityEClass = createEClass(CHECK_DONE_ACTIVITY);
		createEAttribute(checkDoneActivityEClass, CHECK_DONE_ACTIVITY__ELAPSED_TIME);
		createEReference(checkDoneActivityEClass, CHECK_DONE_ACTIVITY__EREFERENCE0);
		createEReference(checkDoneActivityEClass, CHECK_DONE_ACTIVITY__ACTIVITY_TO_VALIDATE);
		createEAttribute(checkDoneActivityEClass, CHECK_DONE_ACTIVITY__PERIODICITY_TYPE);

		noRainEClass = createEClass(NO_RAIN);
		createEAttribute(noRainEClass, NO_RAIN__ELAPSED_TIME);
		createEAttribute(noRainEClass, NO_RAIN__PERIODICITY_TYPE);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPE);

		weatherEClass = createEClass(WEATHER);
		createEAttribute(weatherEClass, WEATHER__COMPARATOR);

		temperatureEClass = createEClass(TEMPERATURE);
		createEAttribute(temperatureEClass, TEMPERATURE__VALUE);

		evapoTranspirationEClass = createEClass(EVAPO_TRANSPIRATION);
		createEAttribute(evapoTranspirationEClass, EVAPO_TRANSPIRATION__VALUE);

		precipitationEClass = createEClass(PRECIPITATION);
		createEAttribute(precipitationEClass, PRECIPITATION__HEIGHT);

		rayonnementEClass = createEClass(RAYONNEMENT);
		createEAttribute(rayonnementEClass, RAYONNEMENT__VALUE);

		grainStateEClass = createEClass(GRAIN_STATE);
		createEAttribute(grainStateEClass, GRAIN_STATE__STATE);

		launcherEClass = createEClass(LAUNCHER);
		createEReference(launcherEClass, LAUNCHER__BEGIN);
		createEReference(launcherEClass, LAUNCHER__END);
		createEAttribute(launcherEClass, LAUNCHER__QMAX);
		createEAttribute(launcherEClass, LAUNCHER__QUANTITY_OF_WATER);

		// Create enums
		periodicityEEnum = createEEnum(PERIODICITY);
		monthEEnum = createEEnum(MONTH);
		comparatorTypeEEnum = createEEnum(COMPARATOR_TYPE);
		binaryExpressionTypeEEnum = createEEnum(BINARY_EXPRESSION_TYPE);
		grainStateEnumEEnum = createEEnum(GRAIN_STATE_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExploitationPackage theExploitationPackage = (ExploitationPackage)EPackage.Registry.INSTANCE.getEPackage(ExploitationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		predicatEClass.getESuperTypes().add(this.getRule());
		checkDoneActivityEClass.getESuperTypes().add(this.getPredicat());
		noRainEClass.getESuperTypes().add(this.getPredicat());
		binaryExpressionEClass.getESuperTypes().add(this.getRule());
		weatherEClass.getESuperTypes().add(this.getPredicat());
		temperatureEClass.getESuperTypes().add(this.getWeather());
		evapoTranspirationEClass.getESuperTypes().add(this.getWeather());
		precipitationEClass.getESuperTypes().add(this.getWeather());
		rayonnementEClass.getESuperTypes().add(this.getWeather());
		grainStateEClass.getESuperTypes().add(this.getPredicat());

		// Initialize classes, features, and operations; add parameters
		initEClass(periodicActivityEClass, PeriodicActivity.class, "PeriodicActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivity_Start(), this.getDate(), null, "start", null, 1, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivity_End(), this.getDate(), null, "end", null, 1, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivity_Rule(), this.getRule(), null, "rule", null, 0, -1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivity_ResAllocation(), this.getRessourceAllocation(), null, "resAllocation", null, 0, -1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivity_Atelier(), theExploitationPackage.getAtelier(), theExploitationPackage.getAtelier_Activity(), "atelier", null, 0, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicActivity_PeriodicityType(), this.getperiodicity(), "periodicityType", null, 0, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicActivity_Frequency(), ecorePackage.getEInt(), "frequency", "1", 0, 1, PeriodicActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Day(), ecorePackage.getEInt(), "day", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Month(), this.getMonth(), "month", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Activity(), this.getPeriodicActivity(), null, "activity", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_RessourceType(), theExploitationPackage.getRessourceType(), null, "ressourceType", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourceAllocationEClass, RessourceAllocation.class, "RessourceAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessourceAllocation_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, RessourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRessourceAllocation_Ressource(), theExploitationPackage.getRessource(), theExploitationPackage.getRessource_ResAllocation(), "ressource", null, 1, 1, RessourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessourceAllocation_PeriodicityType(), this.getperiodicity(), "periodicityType", null, 0, 1, RessourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicatEClass, Predicat.class, "Predicat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicat_Date(), this.getDate(), null, "date", null, 0, 1, Predicat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkDoneActivityEClass, CheckDoneActivity.class, "CheckDoneActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckDoneActivity_ElapsedTime(), ecorePackage.getEInt(), "elapsedTime", null, 0, 1, CheckDoneActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckDoneActivity_EReference0(), this.getCheckDoneActivity(), null, "EReference0", null, 0, 1, CheckDoneActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckDoneActivity_ActivityToValidate(), this.getPeriodicActivity(), null, "activityToValidate", null, 0, 1, CheckDoneActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckDoneActivity_PeriodicityType(), this.getperiodicity(), "periodicityType", null, 0, 1, CheckDoneActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noRainEClass, NoRain.class, "NoRain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoRain_ElapsedTime(), ecorePackage.getEInt(), "elapsedTime", null, 0, 1, NoRain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoRain_PeriodicityType(), this.getperiodicity(), "periodicityType", null, 0, 1, NoRain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getRule(), null, "left", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getRule(), null, "right", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExpression_Ope(), this.getBinaryExpressionType(), "ope", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weatherEClass, Weather.class, "Weather", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeather_Comparator(), this.getComparatorType(), "comparator", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temperatureEClass, Temperature.class, "Temperature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemperature_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Temperature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evapoTranspirationEClass, EvapoTranspiration.class, "EvapoTranspiration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvapoTranspiration_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, EvapoTranspiration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precipitationEClass, Precipitation.class, "Precipitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecipitation_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Precipitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rayonnementEClass, Rayonnement.class, "Rayonnement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRayonnement_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Rayonnement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grainStateEClass, GrainState.class, "GrainState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrainState_State(), this.getGrainStateEnum(), "state", null, 0, 1, GrainState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(launcherEClass, Launcher.class, "Launcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLauncher_Begin(), this.getDate(), null, "begin", null, 1, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLauncher_End(), this.getDate(), null, "end", null, 1, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncher_QMax(), ecorePackage.getEInt(), "qMax", null, 0, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncher_QuantityOfWater(), ecorePackage.getEInt(), "quantityOfWater", null, 0, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(periodicityEEnum, periodicity.class, "periodicity");
		addEEnumLiteral(periodicityEEnum, periodicity.YEARS);
		addEEnumLiteral(periodicityEEnum, periodicity.MONTH);
		addEEnumLiteral(periodicityEEnum, periodicity.WEEKS);
		addEEnumLiteral(periodicityEEnum, periodicity.DAYS);
		addEEnumLiteral(periodicityEEnum, periodicity.HOURS);

		initEEnum(monthEEnum, Month.class, "Month");
		addEEnumLiteral(monthEEnum, Month.JANUARY);
		addEEnumLiteral(monthEEnum, Month.FEBRUARY);
		addEEnumLiteral(monthEEnum, Month.MARCH);
		addEEnumLiteral(monthEEnum, Month.APRIL);
		addEEnumLiteral(monthEEnum, Month.MAY);
		addEEnumLiteral(monthEEnum, Month.JUNE);
		addEEnumLiteral(monthEEnum, Month.JULY);
		addEEnumLiteral(monthEEnum, Month.AUGUST);
		addEEnumLiteral(monthEEnum, Month.SEPTEMBER);
		addEEnumLiteral(monthEEnum, Month.OCTOBER);
		addEEnumLiteral(monthEEnum, Month.NOVEMBER);
		addEEnumLiteral(monthEEnum, Month.DECEMBER);

		initEEnum(comparatorTypeEEnum, ComparatorType.class, "ComparatorType");
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.INFERIOR);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.INFERIOR_OR_EQUAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.EQUAL);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.DIFFERENT);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.SUPERIOR);
		addEEnumLiteral(comparatorTypeEEnum, ComparatorType.SUPERIOR_OR_EQUAL);

		initEEnum(binaryExpressionTypeEEnum, BinaryExpressionType.class, "BinaryExpressionType");
		addEEnumLiteral(binaryExpressionTypeEEnum, BinaryExpressionType.AND);
		addEEnumLiteral(binaryExpressionTypeEEnum, BinaryExpressionType.OR);
		addEEnumLiteral(binaryExpressionTypeEEnum, BinaryExpressionType.XOR);

		initEEnum(grainStateEnumEEnum, GrainStateEnum.class, "GrainStateEnum");
		addEEnumLiteral(grainStateEnumEEnum, GrainStateEnum.MATURE);
		addEEnumLiteral(grainStateEnumEEnum, GrainStateEnum.IMMATURE);

		// Create resource
		createResource(eNS_URI);
	}

} //ActivityPackageImpl
