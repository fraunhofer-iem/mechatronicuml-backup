/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.util;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage
 * @generated
 */
public class ReconfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReconfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReconfPackage.eINSTANCE;
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
	protected ReconfSwitch<Adapter> modelSwitch =
		new ReconfSwitch<Adapter>() {
			@Override
			public Adapter caseAssemblyReconf(AssemblyReconf object) {
				return createAssemblyReconfAdapter();
			}
			@Override
			public Adapter caseComponentInstanceReconf(ComponentInstanceReconf object) {
				return createComponentInstanceReconfAdapter();
			}
			@Override
			public Adapter caseDelegationReconf(DelegationReconf object) {
				return createDelegationReconfAdapter();
			}
			@Override
			public Adapter casePortInstanceReconf(PortInstanceReconf object) {
				return createPortInstanceReconfAdapter();
			}
			@Override
			public Adapter casePortReconf(PortReconf object) {
				return createPortReconfAdapter();
			}
			@Override
			public Adapter caseReconfDiagram(ReconfDiagram object) {
				return createReconfDiagramAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf <em>Assembly Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf
	 * @generated
	 */
	public Adapter createAssemblyReconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf <em>Component Instance Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf
	 * @generated
	 */
	public Adapter createComponentInstanceReconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf <em>Delegation Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf
	 * @generated
	 */
	public Adapter createDelegationReconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf <em>Port Instance Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf
	 * @generated
	 */
	public Adapter createPortInstanceReconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf <em>Port Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf
	 * @generated
	 */
	public Adapter createPortReconfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram
	 * @generated
	 */
	public Adapter createReconfDiagramAdapter() {
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

} //ReconfAdapterFactory
