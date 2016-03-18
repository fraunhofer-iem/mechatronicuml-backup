/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.instance.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ControllerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationControllerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationMessagePortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableComponentInstance <em>Reconfigurable Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableComponentInstance
	 * @generated
	 */
	public Adapter createReconfigurableComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationPortInstance <em>Reconfiguration Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationPortInstance
	 * @generated
	 */
	public Adapter createReconfigurationPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationMessagePortInstance <em>Reconfiguration Message Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationMessagePortInstance
	 * @generated
	 */
	public Adapter createReconfigurationMessagePortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance <em>Reconfiguration Execution Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance
	 * @generated
	 */
	public Adapter createReconfigurationExecutionPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance <em>Internal Reconfiguration Communication Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance
	 * @generated
	 */
	public Adapter createInternalReconfigurationCommunicationPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationControllerInstance
	 * @generated
	 */
	public Adapter createReconfigurationControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ControllerInstance <em>Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ControllerInstance
	 * @generated
	 */
	public Adapter createControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance <em>Rule Based Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance
	 * @generated
	 */
	public Adapter createRuleBasedReconfigurationControllerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance <em>Manager Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance
	 * @generated
	 */
	public Adapter createManagerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance <em>Executor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance
	 * @generated
	 */
	public Adapter createExecutorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance <em>Reconfigurable Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance
	 * @generated
	 */
	public Adapter createReconfigurableAtomicComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance <em>Reconfigurable Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance
	 * @generated
	 */
	public Adapter createReconfigurableStructuredComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance <em>Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance
	 * @generated
	 */
	public Adapter createConnectorEndpointInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance
	 * @generated
	 */
	public Adapter createPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpointInstance <em>Discrete Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpointInstance
	 * @generated
	 */
	public Adapter createDiscreteInteractionEndpointInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance <em>Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance
	 * @generated
	 */
	public Adapter createAtomicComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance <em>Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance
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
