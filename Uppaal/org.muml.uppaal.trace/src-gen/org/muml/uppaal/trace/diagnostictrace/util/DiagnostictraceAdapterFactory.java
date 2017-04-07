/**
 */
package org.muml.uppaal.trace.diagnostictrace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.muml.uppaal.trace.diagnostictrace.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.trace.diagnostictrace.DiagnostictracePackage
 * @generated
 */
public class DiagnostictraceAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static DiagnostictracePackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DiagnostictraceAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = DiagnostictracePackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
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
  protected DiagnostictraceSwitch<Adapter> modelSwitch =
    new DiagnostictraceSwitch<Adapter>() {
			@Override
			public Adapter caseTraceRepository(TraceRepository object) {
				return createTraceRepositoryAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseProcessIdentifier(ProcessIdentifier object) {
				return createProcessIdentifierAdapter();
			}
			@Override
			public Adapter caseLocationActivity(LocationActivity object) {
				return createLocationActivityAdapter();
			}
			@Override
			public Adapter caseVariableValue(VariableValue object) {
				return createVariableValueAdapter();
			}
			@Override
			public Adapter caseSingleNamedElementReference(SingleNamedElementReference object) {
				return createSingleNamedElementReferenceAdapter();
			}
			@Override
			public Adapter caseNamedElementReference(NamedElementReference object) {
				return createNamedElementReferenceAdapter();
			}
			@Override
			public Adapter caseTraceItem(TraceItem object) {
				return createTraceItemAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseEdgeActivity(EdgeActivity object) {
				return createEdgeActivityAdapter();
			}
			@Override
			public Adapter caseSynchronization(Synchronization object) {
				return createSynchronizationAdapter();
			}
			@Override
			public Adapter caseChannelSynchronization(ChannelSynchronization object) {
				return createChannelSynchronizationAdapter();
			}
			@Override
			public Adapter caseDelayTransition(DelayTransition object) {
				return createDelayTransitionAdapter();
			}
			@Override
			public Adapter caseActionTransition(ActionTransition object) {
				return createActionTransitionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
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
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.TraceRepository <em>Trace Repository</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.TraceRepository
	 * @generated
	 */
  public Adapter createTraceRepositoryAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.Trace
	 * @generated
	 */
  public Adapter createTraceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.ProcessIdentifier <em>Process Identifier</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.ProcessIdentifier
	 * @generated
	 */
  public Adapter createProcessIdentifierAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.LocationActivity <em>Location Activity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.LocationActivity
	 * @generated
	 */
  public Adapter createLocationActivityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.VariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.VariableValue
	 * @generated
	 */
  public Adapter createVariableValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference <em>Single Named Element Reference</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference
	 * @generated
	 */
  public Adapter createSingleNamedElementReferenceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.NamedElementReference <em>Named Element Reference</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.NamedElementReference
	 * @generated
	 */
  public Adapter createNamedElementReferenceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.TraceItem <em>Trace Item</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.TraceItem
	 * @generated
	 */
  public Adapter createTraceItemAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.State
	 * @generated
	 */
  public Adapter createStateAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.EdgeActivity <em>Edge Activity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.EdgeActivity
	 * @generated
	 */
  public Adapter createEdgeActivityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.Synchronization
	 * @generated
	 */
  public Adapter createSynchronizationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.ChannelSynchronization <em>Channel Synchronization</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.ChannelSynchronization
	 * @generated
	 */
  public Adapter createChannelSynchronizationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.DelayTransition <em>Delay Transition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.DelayTransition
	 * @generated
	 */
  public Adapter createDelayTransitionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.ActionTransition <em>Action Transition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.ActionTransition
	 * @generated
	 */
  public Adapter createActionTransitionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.trace.diagnostictrace.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.trace.diagnostictrace.Transition
	 * @generated
	 */
  public Adapter createTransitionAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //DiagnostictraceAdapterFactory
