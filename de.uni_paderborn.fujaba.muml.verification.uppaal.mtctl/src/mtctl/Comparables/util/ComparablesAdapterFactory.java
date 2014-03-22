/**
 */
package mtctl.Comparables.util;

import de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint;
import mtctl.Comparables.*;

import mtctl.Expression;
import mtctl.Property;

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
 * @see mtctl.Comparables.ComparablesPackage
 * @generated
 */
public class ComparablesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComparablesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparablesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComparablesPackage.eINSTANCE;
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
	protected ComparablesSwitch<Adapter> modelSwitch =
		new ComparablesSwitch<Adapter>() {
			@Override
			public Adapter caseBufferMsgCountExpr(BufferMsgCountExpr object) {
				return createBufferMsgCountExprAdapter();
			}
			@Override
			public Adapter caseConstExpr(ConstExpr object) {
				return createConstExprAdapter();
			}
			@Override
			public Adapter caseMapExpr(MapExpr object) {
				return createMapExprAdapter();
			}
			@Override
			public Adapter casePrimitiveVariableExpr(PrimitiveVariableExpr object) {
				return createPrimitiveVariableExprAdapter();
			}
			@Override
			public Adapter caseStaticMapExpr(StaticMapExpr object) {
				return createStaticMapExprAdapter();
			}
			@Override
			public Adapter caseDynamicMapExpr(DynamicMapExpr object) {
				return createDynamicMapExprAdapter();
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
	 * Creates a new adapter for an object of class '{@link mtctl.Comparables.BufferMsgCountExpr <em>Buffer Msg Count Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Comparables.BufferMsgCountExpr
	 * @generated
	 */
	public Adapter createBufferMsgCountExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Comparables.ConstExpr <em>Const Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Comparables.ConstExpr
	 * @generated
	 */
	public Adapter createConstExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Comparables.MapExpr <em>Map Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Comparables.MapExpr
	 * @generated
	 */
	public Adapter createMapExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Comparables.PrimitiveVariableExpr <em>Primitive Variable Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Comparables.PrimitiveVariableExpr
	 * @generated
	 */
	public Adapter createPrimitiveVariableExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Comparables.StaticMapExpr <em>Static Map Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Comparables.StaticMapExpr
	 * @generated
	 */
	public Adapter createStaticMapExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Comparables.DynamicMapExpr <em>Dynamic Map Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Comparables.DynamicMapExpr
	 * @generated
	 */
	public Adapter createDynamicMapExprAdapter() {
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

} //ComparablesAdapterFactory
