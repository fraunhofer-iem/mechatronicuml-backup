/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.simulink.adapter.corrmodel.*;
import org.muml.simulink.adapter.corrmodel.AssemblyInst2Line;
import org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys;
import org.muml.simulink.adapter.corrmodel.CompInst2LibRef;
import org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys;
import org.muml.simulink.adapter.corrmodel.Del2Line;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkFactory;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.InstConfig2SimMod;
import org.muml.simulink.adapter.corrmodel.ModElCat2SimLib;
import org.muml.simulink.adapter.corrmodel.Port2Ports;
import org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer;
import org.muml.simulink.adapter.corrmodel.StructComp2SubSys;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fujaba2simulinkFactoryImpl extends EFactoryImpl implements Fujaba2simulinkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fujaba2simulinkFactory init() {
		try {
			Fujaba2simulinkFactory theFujaba2simulinkFactory = (Fujaba2simulinkFactory)EPackage.Registry.INSTANCE.getEFactory(Fujaba2simulinkPackage.eNS_URI);
			if (theFujaba2simulinkFactory != null) {
				return theFujaba2simulinkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Fujaba2simulinkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fujaba2simulinkFactoryImpl() {
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
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER: return createRootNode2SimulinkContainer();
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB: return createModElCat2SimLib();
			case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS: return createCompInstConfig2SubSys();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD: return createInstConfig2SimMod();
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS: return createAtomComp2AtomSys();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS: return createStructComp2SubSys();
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF: return createCompInst2LibRef();
			case Fujaba2simulinkPackage.PORT2_PORTS: return createPort2Ports();
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE: return createAssemblyInst2Line();
			case Fujaba2simulinkPackage.DEL2_LINE: return createDel2Line();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootNode2SimulinkContainer createRootNode2SimulinkContainer() {
		RootNode2SimulinkContainerImpl rootNode2SimulinkContainer = new RootNode2SimulinkContainerImpl();
		return rootNode2SimulinkContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModElCat2SimLib createModElCat2SimLib() {
		ModElCat2SimLibImpl modElCat2SimLib = new ModElCat2SimLibImpl();
		return modElCat2SimLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompInstConfig2SubSys createCompInstConfig2SubSys() {
		CompInstConfig2SubSysImpl compInstConfig2SubSys = new CompInstConfig2SubSysImpl();
		return compInstConfig2SubSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstConfig2SimMod createInstConfig2SimMod() {
		InstConfig2SimModImpl instConfig2SimMod = new InstConfig2SimModImpl();
		return instConfig2SimMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomComp2AtomSys createAtomComp2AtomSys() {
		AtomComp2AtomSysImpl atomComp2AtomSys = new AtomComp2AtomSysImpl();
		return atomComp2AtomSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructComp2SubSys createStructComp2SubSys() {
		StructComp2SubSysImpl structComp2SubSys = new StructComp2SubSysImpl();
		return structComp2SubSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompInst2LibRef createCompInst2LibRef() {
		CompInst2LibRefImpl compInst2LibRef = new CompInst2LibRefImpl();
		return compInst2LibRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port2Ports createPort2Ports() {
		Port2PortsImpl port2Ports = new Port2PortsImpl();
		return port2Ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInst2Line createAssemblyInst2Line() {
		AssemblyInst2LineImpl assemblyInst2Line = new AssemblyInst2LineImpl();
		return assemblyInst2Line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Del2Line createDel2Line() {
		Del2LineImpl del2Line = new Del2LineImpl();
		return del2Line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fujaba2simulinkPackage getFujaba2simulinkPackage() {
		return (Fujaba2simulinkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Fujaba2simulinkPackage getPackage() {
		return Fujaba2simulinkPackage.eINSTANCE;
	}

} //Fujaba2simulinkFactoryImpl
