/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.*;

import org.eclipse.emf.ecore.EClass;
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
public class ReconfFactoryImpl extends EFactoryImpl implements ReconfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReconfFactory init() {
		try {
			ReconfFactory theReconfFactory = (ReconfFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/umlrt/emf/model/realtimestatechart.reconf"); 
			if (theReconfFactory != null) {
				return theReconfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReconfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfFactoryImpl() {
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
			case ReconfPackage.ASSEMBLY_RECONF: return createAssemblyReconf();
			case ReconfPackage.COMPONENT_INSTANCE_RECONF: return createComponentInstanceReconf();
			case ReconfPackage.DELEGATION_RECONF: return createDelegationReconf();
			case ReconfPackage.PORT_INSTANCE_RECONF: return createPortInstanceReconf();
			case ReconfPackage.PORT_RECONF: return createPortReconf();
			case ReconfPackage.RECONF_DIAGRAM: return createReconfDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyReconf createAssemblyReconf() {
		AssemblyReconfImpl assemblyReconf = new AssemblyReconfImpl();
		return assemblyReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceReconf createComponentInstanceReconf() {
		ComponentInstanceReconfImpl componentInstanceReconf = new ComponentInstanceReconfImpl();
		return componentInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationReconf createDelegationReconf() {
		DelegationReconfImpl delegationReconf = new DelegationReconfImpl();
		return delegationReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceReconf createPortInstanceReconf() {
		PortInstanceReconfImpl portInstanceReconf = new PortInstanceReconfImpl();
		return portInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortReconf createPortReconf() {
		PortReconfImpl portReconf = new PortReconfImpl();
		return portReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfDiagram createReconfDiagram() {
		ReconfDiagramImpl reconfDiagram = new ReconfDiagramImpl();
		return reconfDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfPackage getReconfPackage() {
		return (ReconfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReconfPackage getPackage() {
		return ReconfPackage.eINSTANCE;
	}

} //ReconfFactoryImpl
