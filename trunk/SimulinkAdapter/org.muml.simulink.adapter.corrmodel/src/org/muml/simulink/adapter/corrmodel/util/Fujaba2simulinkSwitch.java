/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.simulink.adapter.corrmodel.*;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.adapter.corrmodel.AssemblyInst2Line;
import org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys;
import org.muml.simulink.adapter.corrmodel.CompInst2LibRef;
import org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys;
import org.muml.simulink.adapter.corrmodel.Del2Line;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.InstConfig2SimMod;
import org.muml.simulink.adapter.corrmodel.ModElCat2SimLib;
import org.muml.simulink.adapter.corrmodel.Port2Ports;
import org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer;
import org.muml.simulink.adapter.corrmodel.StructComp2SubSys;

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
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage
 * @generated
 */
public class Fujaba2simulinkSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fujaba2simulinkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fujaba2simulinkSwitch() {
		if (modelPackage == null) {
			modelPackage = Fujaba2simulinkPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE: {
				AbstractContainerCorrespondenceNode abstractContainerCorrespondenceNode = (AbstractContainerCorrespondenceNode)theEObject;
				T result = caseAbstractContainerCorrespondenceNode(abstractContainerCorrespondenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER: {
				RootNode2SimulinkContainer rootNode2SimulinkContainer = (RootNode2SimulinkContainer)theEObject;
				T result = caseRootNode2SimulinkContainer(rootNode2SimulinkContainer);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(rootNode2SimulinkContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB: {
				ModElCat2SimLib modElCat2SimLib = (ModElCat2SimLib)theEObject;
				T result = caseModElCat2SimLib(modElCat2SimLib);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(modElCat2SimLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS: {
				CompInstConfig2SubSys compInstConfig2SubSys = (CompInstConfig2SubSys)theEObject;
				T result = caseCompInstConfig2SubSys(compInstConfig2SubSys);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(compInstConfig2SubSys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD: {
				InstConfig2SimMod instConfig2SimMod = (InstConfig2SimMod)theEObject;
				T result = caseInstConfig2SimMod(instConfig2SimMod);
				if (result == null) result = caseCompInstConfig2SubSys(instConfig2SimMod);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(instConfig2SimMod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS: {
				AtomComp2AtomSys atomComp2AtomSys = (AtomComp2AtomSys)theEObject;
				T result = caseAtomComp2AtomSys(atomComp2AtomSys);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(atomComp2AtomSys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS: {
				StructComp2SubSys structComp2SubSys = (StructComp2SubSys)theEObject;
				T result = caseStructComp2SubSys(structComp2SubSys);
				if (result == null) result = caseCompInstConfig2SubSys(structComp2SubSys);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(structComp2SubSys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF: {
				CompInst2LibRef compInst2LibRef = (CompInst2LibRef)theEObject;
				T result = caseCompInst2LibRef(compInst2LibRef);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(compInst2LibRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.PORT2_PORTS: {
				Port2Ports port2Ports = (Port2Ports)theEObject;
				T result = casePort2Ports(port2Ports);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(port2Ports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE: {
				AssemblyInst2Line assemblyInst2Line = (AssemblyInst2Line)theEObject;
				T result = caseAssemblyInst2Line(assemblyInst2Line);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(assemblyInst2Line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fujaba2simulinkPackage.DEL2_LINE: {
				Del2Line del2Line = (Del2Line)theEObject;
				T result = caseDel2Line(del2Line);
				if (result == null) result = caseAbstractContainerCorrespondenceNode(del2Line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Container Correspondence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Container Correspondence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContainerCorrespondenceNode(AbstractContainerCorrespondenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Node2 Simulink Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Node2 Simulink Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootNode2SimulinkContainer(RootNode2SimulinkContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mod El Cat2 Sim Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mod El Cat2 Sim Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModElCat2SimLib(ModElCat2SimLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Inst Config2 Sub Sys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Inst Config2 Sub Sys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompInstConfig2SubSys(CompInstConfig2SubSys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inst Config2 Sim Mod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inst Config2 Sim Mod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstConfig2SimMod(InstConfig2SimMod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom Comp2 Atom Sys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom Comp2 Atom Sys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomComp2AtomSys(AtomComp2AtomSys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Comp2 Sub Sys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Comp2 Sub Sys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructComp2SubSys(StructComp2SubSys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Inst2 Lib Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Inst2 Lib Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompInst2LibRef(CompInst2LibRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port2 Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port2 Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort2Ports(Port2Ports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Inst2 Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Inst2 Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyInst2Line(AssemblyInst2Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Del2 Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Del2 Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDel2Line(Del2Line object) {
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

} //Fujaba2simulinkSwitch
