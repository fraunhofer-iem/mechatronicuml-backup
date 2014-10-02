/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model.msglib.buffer.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.simulink.model.Element;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferFunction;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferPackage;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.CheckQueue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.Dequeue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.Enqueue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedCheckQueue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedDequeue;
import de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedEnqueue;
import de.uni_paderborn.fujaba.simulink.model.stateflow.EmbeddedFunction;
import de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferPackage
 * @generated
 */
public class BufferAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BufferPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BufferPackage.eINSTANCE;
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
	protected BufferSwitch<Adapter> modelSwitch =
		new BufferSwitch<Adapter>() {
			@Override
			public Adapter caseEnqueue(Enqueue object) {
				return createEnqueueAdapter();
			}
			@Override
			public Adapter caseDequeue(Dequeue object) {
				return createDequeueAdapter();
			}
			@Override
			public Adapter caseCheckQueue(CheckQueue object) {
				return createCheckQueueAdapter();
			}
			@Override
			public Adapter caseSharedEnqueue(SharedEnqueue object) {
				return createSharedEnqueueAdapter();
			}
			@Override
			public Adapter caseSharedDequeue(SharedDequeue object) {
				return createSharedDequeueAdapter();
			}
			@Override
			public Adapter caseSharedCheckQueue(SharedCheckQueue object) {
				return createSharedCheckQueueAdapter();
			}
			@Override
			public Adapter caseBufferFunction(BufferFunction object) {
				return createBufferFunctionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseStateflowElement(StateflowElement object) {
				return createStateflowElementAdapter();
			}
			@Override
			public Adapter caseEmbeddedFunction(EmbeddedFunction object) {
				return createEmbeddedFunctionAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.Enqueue <em>Enqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.Enqueue
	 * @generated
	 */
	public Adapter createEnqueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.Dequeue <em>Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.Dequeue
	 * @generated
	 */
	public Adapter createDequeueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.CheckQueue <em>Check Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.CheckQueue
	 * @generated
	 */
	public Adapter createCheckQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedEnqueue <em>Shared Enqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedEnqueue
	 * @generated
	 */
	public Adapter createSharedEnqueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedDequeue <em>Shared Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedDequeue
	 * @generated
	 */
	public Adapter createSharedDequeueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedCheckQueue <em>Shared Check Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.SharedCheckQueue
	 * @generated
	 */
	public Adapter createSharedCheckQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferFunction
	 * @generated
	 */
	public Adapter createBufferFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowElement
	 * @generated
	 */
	public Adapter createStateflowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.EmbeddedFunction <em>Embedded Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.EmbeddedFunction
	 * @generated
	 */
	public Adapter createEmbeddedFunctionAdapter() {
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

} //BufferAdapterFactory
