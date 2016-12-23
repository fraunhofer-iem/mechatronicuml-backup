/**
 */
package org.muml.uppaal.adapter.mtctl.quantifiers.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.quantifiers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage
 * @generated
 */
public class QuantifiersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuantifiersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuantifiersPackage.eINSTANCE;
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
	protected QuantifiersSwitch<Adapter> modelSwitch =
		new QuantifiersSwitch<Adapter>() {
			@Override
			public Adapter caseAFExpr(AFExpr object) {
				return createAFExprAdapter();
			}
			@Override
			public Adapter caseAGExpr(AGExpr object) {
				return createAGExprAdapter();
			}
			@Override
			public Adapter caseEFExpr(EFExpr object) {
				return createEFExprAdapter();
			}
			@Override
			public Adapter caseEGExpr(EGExpr object) {
				return createEGExprAdapter();
			}
			@Override
			public Adapter caseExistenceQuantExpr(ExistenceQuantExpr object) {
				return createExistenceQuantExprAdapter();
			}
			@Override
			public Adapter caseQuantifierExpr(QuantifierExpr object) {
				return createQuantifierExprAdapter();
			}
			@Override
			public Adapter caseBoundVariable(BoundVariable object) {
				return createBoundVariableAdapter();
			}
			@Override
			public Adapter caseTemporalQuantifierExpr(TemporalQuantifierExpr object) {
				return createTemporalQuantifierExprAdapter();
			}
			@Override
			public Adapter caseUniversalQuantExpr(UniversalQuantExpr object) {
				return createUniversalQuantExprAdapter();
			}
			@Override
			public Adapter caseLeadsToExpr(LeadsToExpr object) {
				return createLeadsToExprAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.AFExpr <em>AF Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.AFExpr
	 * @generated
	 */
	public Adapter createAFExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.AGExpr <em>AG Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.AGExpr
	 * @generated
	 */
	public Adapter createAGExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.EFExpr <em>EF Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.EFExpr
	 * @generated
	 */
	public Adapter createEFExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.EGExpr <em>EG Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.EGExpr
	 * @generated
	 */
	public Adapter createEGExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.ExistenceQuantExpr <em>Existence Quant Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.ExistenceQuantExpr
	 * @generated
	 */
	public Adapter createExistenceQuantExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.QuantifierExpr <em>Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifierExpr
	 * @generated
	 */
	public Adapter createQuantifierExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable <em>Bound Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable
	 * @generated
	 */
	public Adapter createBoundVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.TemporalQuantifierExpr <em>Temporal Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.TemporalQuantifierExpr
	 * @generated
	 */
	public Adapter createTemporalQuantifierExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.UniversalQuantExpr <em>Universal Quant Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.UniversalQuantExpr
	 * @generated
	 */
	public Adapter createUniversalQuantExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.quantifiers.LeadsToExpr <em>Leads To Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.LeadsToExpr
	 * @generated
	 */
	public Adapter createLeadsToExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.Expression
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

} //QuantifiersAdapterFactory
