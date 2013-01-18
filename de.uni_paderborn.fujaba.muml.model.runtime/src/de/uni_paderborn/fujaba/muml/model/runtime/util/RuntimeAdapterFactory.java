/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.*;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;
import de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeComponentInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeDiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePortInstanceAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage
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
			public Adapter caseAttributeBinding(AttributeBinding object) {
				return createAttributeBindingAdapter();
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
			public Adapter caseRuntimeRoleAssembly(RuntimeRoleAssembly object) {
				return createRuntimeRoleAssemblyAdapter();
			}
			@Override
			public Adapter caseRuntimeAssemblyInstance(RuntimeAssemblyInstance object) {
				return createRuntimeAssemblyInstanceAdapter();
			}
			@Override
			public Adapter caseRuntimePortInstanceAssembly(RuntimePortInstanceAssembly object) {
				return createRuntimePortInstanceAssemblyAdapter();
			}
			@Override
			public Adapter caseMessageOnAssembly(MessageOnAssembly object) {
				return createMessageOnAssemblyAdapter();
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
			public Adapter casePortInstance(PortInstance object) {
				return createPortInstanceAdapter();
			}
			@Override
			public Adapter caseDiscretePortInstance(DiscretePortInstance object) {
				return createDiscretePortInstanceAdapter();
			}
			@Override
			public Adapter caseConnectorInstance(ConnectorInstance object) {
				return createConnectorInstanceAdapter();
			}
			@Override
			public Adapter caseAssemblyInstance(AssemblyInstance object) {
				return createAssemblyInstanceAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeComponentInstance
	 * @generated
	 */
	public Adapter createRuntimeComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeDiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeDiscretePortInstance
	 * @generated
	 */
	public Adapter createRuntimeDiscretePortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance
	 * @generated
	 */
	public Adapter createRoleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer
	 * @generated
	 */
	public Adapter createMessageBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance <em>Realtime Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance
	 * @generated
	 */
	public Adapter createRealtimeStatechartInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage
	 * @generated
	 */
	public Adapter createRuntimeMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter
	 * @generated
	 */
	public Adapter createRuntimeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding <em>Attribute Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding
	 * @generated
	 */
	public Adapter createAttributeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement
	 * @generated
	 */
	public Adapter createRuntimeBehavioralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance <em>Single Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance
	 * @generated
	 */
	public Adapter createSingleRoleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance <em>Multi Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance
	 * @generated
	 */
	public Adapter createMultiRoleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly <em>Role Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly
	 * @generated
	 */
	public Adapter createRuntimeRoleAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance <em>Assembly Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance
	 * @generated
	 */
	public Adapter createRuntimeAssemblyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimePortInstanceAssembly <em>Port Instance Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePortInstanceAssembly
	 * @generated
	 */
	public Adapter createRuntimePortInstanceAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly <em>Message On Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly
	 * @generated
	 */
	public Adapter createMessageOnAssemblyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance
	 * @generated
	 */
	public Adapter createPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance <em>Discrete Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance
	 * @generated
	 */
	public Adapter createDiscretePortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance <em>Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance
	 * @generated
	 */
	public Adapter createConnectorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance <em>Assembly Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance
	 * @generated
	 */
	public Adapter createAssemblyInstanceAdapter() {
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
