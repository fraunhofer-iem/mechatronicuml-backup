/**
 */
package psm.properties;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see psm.properties.PropertiesPackage
 * @generated
 */
public interface PropertiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesFactory eINSTANCE = psm.properties.impl.PropertiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instance Execution Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Execution Properties</em>'.
	 * @generated
	 */
	ComponentInstanceExecutionProperties createComponentInstanceExecutionProperties();

	/**
	 * Returns a new object of class '<em>WCE Tpair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WCE Tpair</em>'.
	 * @generated
	 */
	WCETpair createWCETpair();

	/**
	 * Returns a new object of class '<em>Memory Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Pair</em>'.
	 * @generated
	 */
	MemoryPair createMemoryPair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PropertiesPackage getPropertiesPackage();

} //PropertiesFactory
