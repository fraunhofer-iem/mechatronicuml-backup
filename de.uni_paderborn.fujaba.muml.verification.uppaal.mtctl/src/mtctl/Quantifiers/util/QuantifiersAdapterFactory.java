/**
 */
package mtctl.Quantifiers.util;

import de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint;

import mtctl.Expression;
import mtctl.Property;

import mtctl.Quantifiers.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mtctl.Quantifiers.QuantifiersPackage
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
			public Adapter caseTimeIntervalExpr(TimeIntervalExpr object) {
				return createTimeIntervalExprAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseTemporalLogicConstraint(TemporalLogicConstraint object) {
				return createTemporalLogicConstraintAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.AFExpr <em>AF Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.AFExpr
	 * @generated
	 */
	public Adapter createAFExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.AGExpr <em>AG Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.AGExpr
	 * @generated
	 */
	public Adapter createAGExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.EFExpr <em>EF Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.EFExpr
	 * @generated
	 */
	public Adapter createEFExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.EGExpr <em>EG Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.EGExpr
	 * @generated
	 */
	public Adapter createEGExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.ExistenceQuantExpr <em>Existence Quant Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.ExistenceQuantExpr
	 * @generated
	 */
	public Adapter createExistenceQuantExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.QuantifierExpr <em>Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.QuantifierExpr
	 * @generated
	 */
	public Adapter createQuantifierExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.BoundVariable <em>Bound Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.BoundVariable
	 * @generated
	 */
	public Adapter createBoundVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.TemporalQuantifierExpr <em>Temporal Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.TemporalQuantifierExpr
	 * @generated
	 */
	public Adapter createTemporalQuantifierExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.UniversalQuantExpr <em>Universal Quant Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.UniversalQuantExpr
	 * @generated
	 */
	public Adapter createUniversalQuantExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.LeadsToExpr <em>Leads To Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.LeadsToExpr
	 * @generated
	 */
	public Adapter createLeadsToExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Quantifiers.TimeIntervalExpr <em>Time Interval Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Quantifiers.TimeIntervalExpr
	 * @generated
	 */
	public Adapter createTimeIntervalExprAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint <em>Temporal Logic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint
	 * @generated
	 */
	public Adapter createTemporalLogicConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Expression
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
