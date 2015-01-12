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
	 * The meta object id for the '{@link activity.impl.ActivityPeriodicImpl <em>Periodic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ActivityPeriodicImpl
	 * @see activity.impl.ActivityPackageImpl#getActivityPeriodic()
	 * @generated
	 */
	int ACTIVITY_PERIODIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PERIODIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PERIODIC__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PERIODIC__END = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PERIODIC__RULE = 3;

	/**
	 * The feature id for the '<em><b>Res Allocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PERIODIC__RES_ALLOCATION = 4;

	/**
	 * The feature id for the '<em><b>Atelier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PERIODIC__ATELIER = 5;

	/**
	 * The number of structural features of the '<em>Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PERIODIC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PERIODIC_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ALLOCATION__DUREE = 0;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ALLOCATION__RESSOURCE = 1;

	/**
	 * The number of structural features of the '<em>Ressource Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_ALLOCATION_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRE = 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.EClass0Impl <em>EClass0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.EClass0Impl
	 * @see activity.impl.ActivityPackageImpl#getEClass0()
	 * @generated
	 */
	int ECLASS0 = 6;

	/**
	 * The number of structural features of the '<em>EClass0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS0_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EClass0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS0_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.periodicity <em>periodicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.periodicity
	 * @see activity.impl.ActivityPackageImpl#getperiodicity()
	 * @generated
	 */
	int PERIODICITY = 7;

	/**
	 * The meta object id for the '{@link activity.Month <em>Month</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.Month
	 * @see activity.impl.ActivityPackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 8;


	/**
	 * Returns the meta object for class '{@link activity.ActivityPeriodic <em>Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic</em>'.
	 * @see activity.ActivityPeriodic
	 * @generated
	 */
	EClass getActivityPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link activity.ActivityPeriodic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activity.ActivityPeriodic#getName()
	 * @see #getActivityPeriodic()
	 * @generated
	 */
	EAttribute getActivityPeriodic_Name();

	/**
	 * Returns the meta object for the containment reference '{@link activity.ActivityPeriodic#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see activity.ActivityPeriodic#getStart()
	 * @see #getActivityPeriodic()
	 * @generated
	 */
	EReference getActivityPeriodic_Start();

	/**
	 * Returns the meta object for the containment reference '{@link activity.ActivityPeriodic#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see activity.ActivityPeriodic#getEnd()
	 * @see #getActivityPeriodic()
	 * @generated
	 */
	EReference getActivityPeriodic_End();

	/**
	 * Returns the meta object for the reference list '{@link activity.ActivityPeriodic#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule</em>'.
	 * @see activity.ActivityPeriodic#getRule()
	 * @see #getActivityPeriodic()
	 * @generated
	 */
	EReference getActivityPeriodic_Rule();

	/**
	 * Returns the meta object for the reference list '{@link activity.ActivityPeriodic#getResAllocation <em>Res Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Res Allocation</em>'.
	 * @see activity.ActivityPeriodic#getResAllocation()
	 * @see #getActivityPeriodic()
	 * @generated
	 */
	EReference getActivityPeriodic_ResAllocation();

	/**
	 * Returns the meta object for the reference '{@link activity.ActivityPeriodic#getAtelier <em>Atelier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atelier</em>'.
	 * @see activity.ActivityPeriodic#getAtelier()
	 * @see #getActivityPeriodic()
	 * @generated
	 */
	EReference getActivityPeriodic_Atelier();

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
	 * Returns the meta object for class '{@link activity.RessourceAllocation <em>Ressource Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource Allocation</em>'.
	 * @see activity.RessourceAllocation
	 * @generated
	 */
	EClass getRessourceAllocation();

	/**
	 * Returns the meta object for the attribute '{@link activity.RessourceAllocation#getDuree <em>Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree</em>'.
	 * @see activity.RessourceAllocation#getDuree()
	 * @see #getRessourceAllocation()
	 * @generated
	 */
	EAttribute getRessourceAllocation_Duree();

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
	 * Returns the meta object for class '{@link activity.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see activity.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Rule#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see activity.Rule#getPre()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Pre();

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
	 * Returns the meta object for class '{@link activity.EClass0 <em>EClass0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass0</em>'.
	 * @see activity.EClass0
	 * @generated
	 */
	EClass getEClass0();

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
		 * The meta object literal for the '{@link activity.impl.ActivityPeriodicImpl <em>Periodic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ActivityPeriodicImpl
		 * @see activity.impl.ActivityPackageImpl#getActivityPeriodic()
		 * @generated
		 */
		EClass ACTIVITY_PERIODIC = eINSTANCE.getActivityPeriodic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PERIODIC__NAME = eINSTANCE.getActivityPeriodic_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PERIODIC__START = eINSTANCE.getActivityPeriodic_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PERIODIC__END = eINSTANCE.getActivityPeriodic_End();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PERIODIC__RULE = eINSTANCE.getActivityPeriodic_Rule();

		/**
		 * The meta object literal for the '<em><b>Res Allocation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PERIODIC__RES_ALLOCATION = eINSTANCE.getActivityPeriodic_ResAllocation();

		/**
		 * The meta object literal for the '<em><b>Atelier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PERIODIC__ATELIER = eINSTANCE.getActivityPeriodic_Atelier();

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
		 * The meta object literal for the '{@link activity.impl.RessourceAllocationImpl <em>Ressource Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.RessourceAllocationImpl
		 * @see activity.impl.ActivityPackageImpl#getRessourceAllocation()
		 * @generated
		 */
		EClass RESSOURCE_ALLOCATION = eINSTANCE.getRessourceAllocation();

		/**
		 * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE_ALLOCATION__DUREE = eINSTANCE.getRessourceAllocation_Duree();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE_ALLOCATION__RESSOURCE = eINSTANCE.getRessourceAllocation_Ressource();

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
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PRE = eINSTANCE.getRule_Pre();

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
		 * The meta object literal for the '{@link activity.impl.EClass0Impl <em>EClass0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.EClass0Impl
		 * @see activity.impl.ActivityPackageImpl#getEClass0()
		 * @generated
		 */
		EClass ECLASS0 = eINSTANCE.getEClass0();

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

	}

} //ActivityPackage
