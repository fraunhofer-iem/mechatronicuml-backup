/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.DiscreteInteractionEndpointInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;

import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ControllerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ExecutorInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.InternalReconfigurationCommunicationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ManagerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableAtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableStructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationControllerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationExecutionPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationMessagePortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage
 * @generated
 */
public class ReconfInstanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReconfInstancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfInstanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReconfInstancePackage.eINSTANCE;
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
	protected ReconfInstanceSwitch<Adapter> modelSwitch =
		new ReconfInstanceSwitch<Adapter>() {
			@Override
			public Adapter caseReconfigurableComponentInstance(ReconfigurableComponentInstance object) {
				return createReconfigurableComponentInstanceAdapter();
			}
			@Override
			public Adapter caseReconfigurationPortInstance(ReconfigurationPortInstance object) {
				return createReconfigurationPortInstanceAdapter();
			}
			@Override
			public Adapter caseReconfigurationMessagePortInstance(ReconfigurationMessagePortInstance object) {
				return createReconfigurationMessagePortInstanceAdapter();
			}
			@Override
			public Adapter caseReconfigurationExecutionPortInstance(ReconfigurationExecutionPortInstance object) {
				return createReconfigurationExecutionPortInstanceAdapter();
			}
			@Override
			public Adapter caseInternalReconfigurationCommunicationPortInstance(InternalReconfigurationCommunicationPortInstance object) {
				return createInternalReconfigurationCommunicationPortInstanceAdapter();
			}
			@Override
			public Adapter caseReconfigurationControllerInstance(ReconfigurationControllerInstance object) {
				return createReconfigurationControllerInstanceAdapter();
			}
			@Override
			public Adapter caseControllerInstance(ControllerInstance object) {
				return createControllerInstanceAdapter();
			}
			@Override
			public Adapter caseRuleBasedReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance object) {
				return createRuleBasedReconfigurationControllerInstanceAdapter();
			}
			@Override
			public Adapter caseManagerInstance(ManagerInstance object) {
				return createManagerInstanceAdapter();
			}
			@Override
			public Adapter caseExecutorInstance(ExecutorInstance object) {
				return createExecutorInstanceAdapter();
			}
			@Override
			public Adapter caseReconfigurableAtomicComponentInstance(ReconfigurableAtomicComponentInstance object) {
				return createReconfigurableAtomicComponentInstanceAdapter();
			}
			@Override
			public Adapter caseReconfigurableStructuredComponentInstance(ReconfigurableStructuredComponentInstance object) {
				return createReconfigurableStructuredComponentInstanceAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseConnectorEndpointInstance(ConnectorEndpointInstance object) {
				return createConnectorEndpointInstanceAdapter();
			}
			@Override
			public Adapter casePortInstance(PortInstance object) {
				return createPortInstanceAdapter();
			}
			@Override
			public Adapter caseDiscreteInteractionEndpointInstance(DiscreteInteractionEndpointInstance object) {
				return createDiscreteInteractionEndpointInstanceAdapter();
			}
			@Override
			public Adapter caseAtomicComponentInstance(AtomicComponentInstance object) {
				return createAtomicComponentInstanceAdapter();
			}
			@Override
			public Adapter caseStructuredComponentInstance(StructuredComponentInstance object) {
				return createStructuredComponentInstanceAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableComponentInstance <em>Reconfigurable Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableComponentInstance
	 * @generated
	 */
	public Adapter createReconfigurableComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationPortInstance <em>Reconfiguration Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationPortInstance
	 * @generated
	 */
	public Adapter createReconfigurationPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationMessagePortInstance <em>Reconfiguration Message Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationMessagePortInstance
	 * @generated
	 */
	public Adapter createReconfigurationMessagePortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationExecutionPortInstance <em>Reconfiguration Execution Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationExecutionPortInstance
	 * @generated
	 */
	public Adapter createReconfigurationExecutionPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.InternalReconfigurationCommunicationPortInstance <em>Internal Reconfiguration Communication Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.InternalReconfigurationCommunicationPortInstance
	 * @generated
	 */
	public Adapter createInternalReconfigurationCommunicationPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationControllerInstance
	 * @generated
	 */
	public Adapter createReconfigurationControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ControllerInstance <em>Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ControllerInstance
	 * @generated
	 */
	public Adapter createControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance <em>Rule Based Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance
	 * @generated
	 */
	public Adapter createRuleBasedReconfigurationControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ManagerInstance <em>Manager Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ManagerInstance
	 * @generated
	 */
	public Adapter createManagerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ExecutorInstance <em>Executor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ExecutorInstance
	 * @generated
	 */
	public Adapter createExecutorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableAtomicComponentInstance <em>Reconfigurable Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableAtomicComponentInstance
	 * @generated
	 */
	public Adapter createReconfigurableAtomicComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableStructuredComponentInstance <em>Reconfigurable Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableStructuredComponentInstance
	 * @generated
	 */
	public Adapter createReconfigurableStructuredComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.instance.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.connector.ConnectorEndpointInstance <em>Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.connector.ConnectorEndpointInstance
	 * @generated
	 */
	public Adapter createConnectorEndpointInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.instance.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.instance.PortInstance
	 * @generated
	 */
	public Adapter createPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.connector.DiscreteInteractionEndpointInstance <em>Discrete Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpointInstance
	 * @generated
	 */
	public Adapter createDiscreteInteractionEndpointInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.instance.AtomicComponentInstance <em>Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.instance.AtomicComponentInstance
	 * @generated
	 */
	public Adapter createAtomicComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.instance.StructuredComponentInstance <em>Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.instance.StructuredComponentInstance
	 * @generated
	 */
	public Adapter createStructuredComponentInstanceAdapter() {
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

} //ReconfInstanceAdapterFactory
