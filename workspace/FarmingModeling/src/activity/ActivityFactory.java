/**
 */
package activity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activity.ActivityPackage
 * @generated
 */
public interface ActivityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityFactory eINSTANCE = activity.impl.ActivityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Periodic Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Activity</em>'.
	 * @generated
	 */
	PeriodicActivity createPeriodicActivity();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Ressource Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressource Allocation</em>'.
	 * @generated
	 */
	RessourceAllocation createRessourceAllocation();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Predicat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicat</em>'.
	 * @generated
	 */
	Predicat createPredicat();

	/**
	 * Returns a new object of class '<em>Check Done Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Done Activity</em>'.
	 * @generated
	 */
	CheckDoneActivity createCheckDoneActivity();

	/**
	 * Returns a new object of class '<em>No Rain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Rain</em>'.
	 * @generated
	 */
	NoRain createNoRain();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature</em>'.
	 * @generated
	 */
	Temperature createTemperature();

	/**
	 * Returns a new object of class '<em>Evapo Transpiration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evapo Transpiration</em>'.
	 * @generated
	 */
	EvapoTranspiration createEvapoTranspiration();

	/**
	 * Returns a new object of class '<em>Precipitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precipitation</em>'.
	 * @generated
	 */
	Precipitation createPrecipitation();

	/**
	 * Returns a new object of class '<em>Rayonnement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rayonnement</em>'.
	 * @generated
	 */
	Rayonnement createRayonnement();

	/**
	 * Returns a new object of class '<em>Grain State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grain State</em>'.
	 * @generated
	 */
	GrainState createGrainState();

	/**
	 * Returns a new object of class '<em>Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launcher</em>'.
	 * @generated
	 */
	Launcher createLauncher();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivityPackage getActivityPackage();

} //ActivityFactory
