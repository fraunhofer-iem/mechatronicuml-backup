/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage
 * @generated
 */
public interface Fujaba2simulinkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fujaba2simulinkFactory eINSTANCE = org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Node2 Simulink Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Node2 Simulink Container</em>'.
	 * @generated
	 */
	RootNode2SimulinkContainer createRootNode2SimulinkContainer();

	/**
	 * Returns a new object of class '<em>Mod El Cat2 Sim Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mod El Cat2 Sim Lib</em>'.
	 * @generated
	 */
	ModElCat2SimLib createModElCat2SimLib();

	/**
	 * Returns a new object of class '<em>Comp Inst Config2 Sub Sys</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Inst Config2 Sub Sys</em>'.
	 * @generated
	 */
	CompInstConfig2SubSys createCompInstConfig2SubSys();

	/**
	 * Returns a new object of class '<em>Inst Config2 Sim Mod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inst Config2 Sim Mod</em>'.
	 * @generated
	 */
	InstConfig2SimMod createInstConfig2SimMod();

	/**
	 * Returns a new object of class '<em>Atom Comp2 Atom Sys</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atom Comp2 Atom Sys</em>'.
	 * @generated
	 */
	AtomComp2AtomSys createAtomComp2AtomSys();

	/**
	 * Returns a new object of class '<em>Struct Comp2 Sub Sys</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Comp2 Sub Sys</em>'.
	 * @generated
	 */
	StructComp2SubSys createStructComp2SubSys();

	/**
	 * Returns a new object of class '<em>Comp Inst2 Lib Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Inst2 Lib Ref</em>'.
	 * @generated
	 */
	CompInst2LibRef createCompInst2LibRef();

	/**
	 * Returns a new object of class '<em>Port2 Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port2 Ports</em>'.
	 * @generated
	 */
	Port2Ports createPort2Ports();

	/**
	 * Returns a new object of class '<em>Assembly Inst2 Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Inst2 Line</em>'.
	 * @generated
	 */
	AssemblyInst2Line createAssemblyInst2Line();

	/**
	 * Returns a new object of class '<em>Del2 Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Del2 Line</em>'.
	 * @generated
	 */
	Del2Line createDel2Line();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fujaba2simulinkPackage getFujaba2simulinkPackage();

} //Fujaba2simulinkFactory
