/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage
 * @generated
 */
public interface PousFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PousFactory eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Declaration</em>'.
	 * @generated
	 */
	FunctionDeclaration createFunctionDeclaration();

	/**
	 * Returns a new object of class '<em>Function Block Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Block Declaration</em>'.
	 * @generated
	 */
	FunctionBlockDeclaration createFunctionBlockDeclaration();

	/**
	 * Returns a new object of class '<em>Program Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Declaration</em>'.
	 * @generated
	 */
	ProgramDeclaration createProgramDeclaration();

	/**
	 * Returns a new object of class '<em>Blackbox Function Block Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackbox Function Block Declaration</em>'.
	 * @generated
	 */
	BlackboxFunctionBlockDeclaration createBlackboxFunctionBlockDeclaration();

	/**
	 * Returns a new object of class '<em>Function Block Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Block Pointer</em>'.
	 * @generated
	 */
	FunctionBlockPointer createFunctionBlockPointer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PousPackage getPousPackage();

} //PousFactory
