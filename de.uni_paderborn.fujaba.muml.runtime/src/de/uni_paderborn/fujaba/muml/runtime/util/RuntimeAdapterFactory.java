/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.runtime.MessageBuffer;
import de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector;
import de.uni_paderborn.fujaba.muml.runtime.MultiRoleInstance;
import de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.runtime.RoleInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeAssemblyConnectorInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeComponentInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeConnectorInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscretePortInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage;
import de.uni_paderborn.fujaba.muml.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeRoleConnectorInstance;
import de.uni_paderborn.fujaba.muml.runtime.SingleRoleInstance;
import de.uni_paderborn.fujaba.muml.runtime.VariableBinding;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage
 * @generated
 */
public class RuntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
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
	protected RuntimeSwitch<Adapter> modelSwitch =
		new RuntimeSwitch<Adapter>() {
			@Override
			public Adapter caseRuntimeComponentInstance(RuntimeComponentInstance object) {
				return createRuntimeComponentInstanceAdapter();
			}
			@Override
			public Adapter caseRuntimeDiscretePortInstance(RuntimeDiscretePortInstance object) {
				return createRuntimeDiscretePortInstanceAdapter();
			}
			@Override
			public Adapter caseRoleInstance(RoleInstance object) {
				return createRoleInstanceAdapter();
			}
			@Override
			public Adapter caseMessageBuffer(MessageBuffer object) {
				return createMessageBufferAdapter();
			}
			@Override
			public Adapter caseRealtimeStatechartInstance(RealtimeStatechartInstance object) {
				return createRealtimeStatechartInstanceAdapter();
			}
			@Override
			public Adapter caseRuntimeMessage(RuntimeMessage object) {
				return createRuntimeMessageAdapter();
			}
			@Override
			public Adapter caseRuntimeParameter(RuntimeParameter object) {
				return createRuntimeParameterAdapter();
			}
			@Override
			public Adapter caseVariableBinding(VariableBinding object) {
				return createVariableBindingAdapter();
			}
			@Override
			public Adapter caseRuntimeBehavioralElement(RuntimeBehavioralElement object) {
				return createRuntimeBehavioralElementAdapter();
			}
			@Override
			public Adapter caseSingleRoleInstance(SingleRoleInstance object) {
				return createSingleRoleInstanceAdapter();
			}
			@Override
			public Adapter caseMultiRoleInstance(MultiRoleInstance object) {
				return createMultiRoleInstanceAdapter();
			}
			@Override
			public Adapter caseRuntimeRoleConnectorInstance(RuntimeRoleConnectorInstance object) {
				return createRuntimeRoleConnectorInstanceAdapter();
			}
			@Override
			public Adapter caseRuntimeConnectorInstance(RuntimeConnectorInstance object) {
				return createRuntimeConnectorInstanceAdapter();
			}
			@Override
			public Adapter caseRuntimeAssemblyConnectorInstance(RuntimeAssemblyConnectorInstance object) {
				return createRuntimeAssemblyConnectorInstanceAdapter();
			}
			@Override
			public Adapter caseMessageOnConnector(MessageOnConnector object) {
				return createMessageOnConnectorAdapter();
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
			public Adapter caseDiscretePortInstance(DiscretePortInstance object) {
				return createDiscretePortInstanceAdapter();
			}
			@Override
			public Adapter caseDiscreteSingleInteractionEndpointInstance(DiscreteSingleInteractionEndpointInstance object) {
				return createDiscreteSingleInteractionEndpointInstanceAdapter();
			}
			@Override
			public Adapter caseDiscreteMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance object) {
				return createDiscreteMultiInteractionEndpointInstanceAdapter();
			}
			@Override
			public Adapter caseConnectorInstance(ConnectorInstance object) {
				return createConnectorInstanceAdapter();
			}
			@Override
			public Adapter casePortConnectorInstance(PortConnectorInstance object) {
				return createPortConnectorInstanceAdapter();
			}
			@Override
			public Adapter caseAssemblyConnectorInstance(AssemblyConnectorInstance object) {
				return createAssemblyConnectorInstanceAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeComponentInstance
	 * @generated
	 */
	public Adapter createRuntimeComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscretePortInstance
	 * @generated
	 */
	public Adapter createRuntimeDiscretePortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RoleInstance
	 * @generated
	 */
	public Adapter createRoleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.MessageBuffer
	 * @generated
	 */
	public Adapter createMessageBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance <em>Realtime Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance
	 * @generated
	 */
	public Adapter createRealtimeStatechartInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage
	 * @generated
	 */
	public Adapter createRuntimeMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter
	 * @generated
	 */
	public Adapter createRuntimeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.VariableBinding <em>Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.VariableBinding
	 * @generated
	 */
	public Adapter createVariableBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement
	 * @generated
	 */
	public Adapter createRuntimeBehavioralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.SingleRoleInstance <em>Single Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.SingleRoleInstance
	 * @generated
	 */
	public Adapter createSingleRoleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.MultiRoleInstance <em>Multi Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.MultiRoleInstance
	 * @generated
	 */
	public Adapter createMultiRoleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeRoleConnectorInstance <em>Role Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeRoleConnectorInstance
	 * @generated
	 */
	public Adapter createRuntimeRoleConnectorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeConnectorInstance <em>Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeConnectorInstance
	 * @generated
	 */
	public Adapter createRuntimeConnectorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeAssemblyConnectorInstance <em>Assembly Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeAssemblyConnectorInstance
	 * @generated
	 */
	public Adapter createRuntimeAssemblyConnectorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector <em>Message On Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector
	 * @generated
	 */
	public Adapter createMessageOnConnectorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance
	 * @generated
	 */
	public Adapter createDiscretePortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance <em>Discrete Single Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance
	 * @generated
	 */
	public Adapter createDiscreteSingleInteractionEndpointInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance <em>Discrete Multi Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance
	 * @generated
	 */
	public Adapter createDiscreteMultiInteractionEndpointInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorInstance
	 * @generated
	 */
	public Adapter createConnectorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance <em>Port Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance
	 * @generated
	 */
	public Adapter createPortConnectorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance <em>Assembly Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance
	 * @generated
	 */
	public Adapter createAssemblyConnectorInstanceAdapter() {
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

} //RuntimeAdapterFactory
