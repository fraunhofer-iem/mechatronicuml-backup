/**
 */
package org.muml.reconfiguration.instance.util;

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
import org.muml.reconfiguration.instance.ControllerInstance;
import org.muml.reconfiguration.instance.ExecutorInstance;
import org.muml.reconfiguration.instance.InstancePackage;
import org.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance;
import org.muml.reconfiguration.instance.ManagerInstance;
import org.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance;
import org.muml.reconfiguration.instance.ReconfigurableComponentInstance;
import org.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance;
import org.muml.reconfiguration.instance.ReconfigurationControllerInstance;
import org.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance;
import org.muml.reconfiguration.instance.ReconfigurationMessagePortInstance;
import org.muml.reconfiguration.instance.ReconfigurationPortInstance;
import org.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfiguration.instance.InstancePackage
 * @generated
 */
public class InstanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InstancePackage.eINSTANCE;
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
	protected InstanceSwitch<Adapter> modelSwitch =
		new InstanceSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ReconfigurableComponentInstance <em>Reconfigurable Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ReconfigurableComponentInstance
	 * @generated
	 */
	public Adapter createReconfigurableComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ReconfigurationPortInstance <em>Reconfiguration Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ReconfigurationPortInstance
	 * @generated
	 */
	public Adapter createReconfigurationPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ReconfigurationMessagePortInstance <em>Reconfiguration Message Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ReconfigurationMessagePortInstance
	 * @generated
	 */
	public Adapter createReconfigurationMessagePortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance <em>Reconfiguration Execution Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance
	 * @generated
	 */
	public Adapter createReconfigurationExecutionPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance <em>Internal Reconfiguration Communication Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance
	 * @generated
	 */
	public Adapter createInternalReconfigurationCommunicationPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ReconfigurationControllerInstance
	 * @generated
	 */
	public Adapter createReconfigurationControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ControllerInstance <em>Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ControllerInstance
	 * @generated
	 */
	public Adapter createControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance <em>Rule Based Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance
	 * @generated
	 */
	public Adapter createRuleBasedReconfigurationControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ManagerInstance <em>Manager Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ManagerInstance
	 * @generated
	 */
	public Adapter createManagerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ExecutorInstance <em>Executor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ExecutorInstance
	 * @generated
	 */
	public Adapter createExecutorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance <em>Reconfigurable Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance
	 * @generated
	 */
	public Adapter createReconfigurableAtomicComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance <em>Reconfigurable Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance
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

} //InstanceAdapterFactory
