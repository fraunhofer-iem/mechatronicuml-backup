/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.util;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Expression;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage
 * @generated
 */
public class SetsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SetsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SetsPackage.eINSTANCE;
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
	protected SetsSwitch<Adapter> modelSwitch =
		new SetsSwitch<Adapter>() {
			@Override
			public Adapter caseSetExpr(SetExpr object) {
				return createSetExprAdapter();
			}
			@Override
			public Adapter caseClockSetExpr(ClockSetExpr object) {
				return createClockSetExprAdapter();
			}
			@Override
			public Adapter caseIntervalSetExpr(IntervalSetExpr object) {
				return createIntervalSetExprAdapter();
			}
			@Override
			public Adapter caseMessageSetExpr(MessageSetExpr object) {
				return createMessageSetExprAdapter();
			}
			@Override
			public Adapter caseStateSetExpr(StateSetExpr object) {
				return createStateSetExprAdapter();
			}
			@Override
			public Adapter caseTransitionSetExpr(TransitionSetExpr object) {
				return createTransitionSetExprAdapter();
			}
			@Override
			public Adapter caseBufferSetExpr(BufferSetExpr object) {
				return createBufferSetExprAdapter();
			}
			@Override
			public Adapter caseConnectorEndpointInstanceSetExpr(ConnectorEndpointInstanceSetExpr object) {
				return createConnectorEndpointInstanceSetExprAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetExpr <em>Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetExpr
	 * @generated
	 */
	public Adapter createSetExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr <em>Clock Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr
	 * @generated
	 */
	public Adapter createClockSetExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr <em>Interval Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr
	 * @generated
	 */
	public Adapter createIntervalSetExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr <em>Message Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr
	 * @generated
	 */
	public Adapter createMessageSetExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr <em>State Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr
	 * @generated
	 */
	public Adapter createStateSetExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr <em>Transition Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr
	 * @generated
	 */
	public Adapter createTransitionSetExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr <em>Buffer Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr
	 * @generated
	 */
	public Adapter createBufferSetExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ConnectorEndpointInstanceSetExpr <em>Connector Endpoint Instance Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ConnectorEndpointInstanceSetExpr
	 * @generated
	 */
	public Adapter createConnectorEndpointInstanceSetExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
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

} //SetsAdapterFactory
