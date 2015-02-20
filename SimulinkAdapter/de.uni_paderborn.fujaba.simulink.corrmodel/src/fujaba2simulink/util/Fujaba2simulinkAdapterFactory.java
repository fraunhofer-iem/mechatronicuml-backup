/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fujaba2simulink.AbstractContainerCorrespondenceNode;
import fujaba2simulink.AssemblyInst2Line;
import fujaba2simulink.AtomComp2AtomSys;
import fujaba2simulink.CompInst2LibRef;
import fujaba2simulink.CompInstConfig2SubSys;
import fujaba2simulink.Del2Line;
import fujaba2simulink.Fujaba2simulinkPackage;
import fujaba2simulink.InstConfig2SimMod;
import fujaba2simulink.ModElCat2SimLib;
import fujaba2simulink.Port2Ports;
import fujaba2simulink.RootNode2SimulinkContainer;
import fujaba2simulink.StructComp2SubSys;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fujaba2simulink.Fujaba2simulinkPackage
 * @generated
 */
public class Fujaba2simulinkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fujaba2simulinkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fujaba2simulinkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Fujaba2simulinkPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fujaba2simulinkSwitch<Adapter> modelSwitch =
		new Fujaba2simulinkSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractContainerCorrespondenceNode(AbstractContainerCorrespondenceNode object) {
				return createAbstractContainerCorrespondenceNodeAdapter();
			}
			@Override
			public Adapter caseRootNode2SimulinkContainer(RootNode2SimulinkContainer object) {
				return createRootNode2SimulinkContainerAdapter();
			}
			@Override
			public Adapter caseModElCat2SimLib(ModElCat2SimLib object) {
				return createModElCat2SimLibAdapter();
			}
			@Override
			public Adapter caseCompInstConfig2SubSys(CompInstConfig2SubSys object) {
				return createCompInstConfig2SubSysAdapter();
			}
			@Override
			public Adapter caseInstConfig2SimMod(InstConfig2SimMod object) {
				return createInstConfig2SimModAdapter();
			}
			@Override
			public Adapter caseAtomComp2AtomSys(AtomComp2AtomSys object) {
				return createAtomComp2AtomSysAdapter();
			}
			@Override
			public Adapter caseStructComp2SubSys(StructComp2SubSys object) {
				return createStructComp2SubSysAdapter();
			}
			@Override
			public Adapter caseCompInst2LibRef(CompInst2LibRef object) {
				return createCompInst2LibRefAdapter();
			}
			@Override
			public Adapter casePort2Ports(Port2Ports object) {
				return createPort2PortsAdapter();
			}
			@Override
			public Adapter caseAssemblyInst2Line(AssemblyInst2Line object) {
				return createAssemblyInst2LineAdapter();
			}
			@Override
			public Adapter caseDel2Line(Del2Line object) {
				return createDel2LineAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.AbstractContainerCorrespondenceNode <em>Abstract Container Correspondence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.AbstractContainerCorrespondenceNode
	 * @generated
	 */
	public Adapter createAbstractContainerCorrespondenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.RootNode2SimulinkContainer <em>Root Node2 Simulink Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.RootNode2SimulinkContainer
	 * @generated
	 */
	public Adapter createRootNode2SimulinkContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.ModElCat2SimLib <em>Mod El Cat2 Sim Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.ModElCat2SimLib
	 * @generated
	 */
	public Adapter createModElCat2SimLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.CompInstConfig2SubSys <em>Comp Inst Config2 Sub Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.CompInstConfig2SubSys
	 * @generated
	 */
	public Adapter createCompInstConfig2SubSysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.InstConfig2SimMod <em>Inst Config2 Sim Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.InstConfig2SimMod
	 * @generated
	 */
	public Adapter createInstConfig2SimModAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.AtomComp2AtomSys <em>Atom Comp2 Atom Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.AtomComp2AtomSys
	 * @generated
	 */
	public Adapter createAtomComp2AtomSysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.StructComp2SubSys <em>Struct Comp2 Sub Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.StructComp2SubSys
	 * @generated
	 */
	public Adapter createStructComp2SubSysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.CompInst2LibRef <em>Comp Inst2 Lib Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.CompInst2LibRef
	 * @generated
	 */
	public Adapter createCompInst2LibRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.Port2Ports <em>Port2 Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.Port2Ports
	 * @generated
	 */
	public Adapter createPort2PortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.AssemblyInst2Line <em>Assembly Inst2 Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.AssemblyInst2Line
	 * @generated
	 */
	public Adapter createAssemblyInst2LineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fujaba2simulink.Del2Line <em>Del2 Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fujaba2simulink.Del2Line
	 * @generated
	 */
	public Adapter createDel2LineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Fujaba2simulinkAdapterFactory
