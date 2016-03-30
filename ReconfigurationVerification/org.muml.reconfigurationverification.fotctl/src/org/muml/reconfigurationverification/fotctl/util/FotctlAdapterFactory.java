/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.reconfigurationverification.fotctl.*;
import org.muml.reconfigurationverification.tctl.AtomicFormula;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.TCTLFormula;
import org.muml.reconfigurationverification.tctl.Term;
import org.muml.reconfigurationverification.tctl.UnaryFormula;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage
 * @generated
 */
public class FotctlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FotctlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FotctlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FotctlPackage.eINSTANCE;
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
	protected FotctlSwitch<Adapter> modelSwitch =
		new FotctlSwitch<Adapter>() {
			@Override
			public Adapter caseFoTCTLSpec(FoTCTLSpec object) {
				return createFoTCTLSpecAdapter();
			}
			@Override
			public Adapter caseFoTCTLFormula(FoTCTLFormula object) {
				return createFoTCTLFormulaAdapter();
			}
			@Override
			public Adapter caseNodeLabelPredicateDecl(NodeLabelPredicateDecl object) {
				return createNodeLabelPredicateDeclAdapter();
			}
			@Override
			public Adapter caseEdgeLabelPredicateDecl(EdgeLabelPredicateDecl object) {
				return createEdgeLabelPredicateDeclAdapter();
			}
			@Override
			public Adapter caseConstantSymbolDecl(ConstantSymbolDecl object) {
				return createConstantSymbolDeclAdapter();
			}
			@Override
			public Adapter caseQuantifiedFormula(QuantifiedFormula object) {
				return createQuantifiedFormulaAdapter();
			}
			@Override
			public Adapter caseNodeLabelPredicate(NodeLabelPredicate object) {
				return createNodeLabelPredicateAdapter();
			}
			@Override
			public Adapter caseEdgeLabelPredicate(EdgeLabelPredicate object) {
				return createEdgeLabelPredicateAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
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
			public Adapter caseTCTLFormula(TCTLFormula object) {
				return createTCTLFormulaAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseFormulaDefinition(FormulaDefinition object) {
				return createFormulaDefinitionAdapter();
			}
			@Override
			public Adapter caseUnaryFormula(UnaryFormula object) {
				return createUnaryFormulaAdapter();
			}
			@Override
			public Adapter caseAtomicFormula(AtomicFormula object) {
				return createAtomicFormulaAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec <em>Fo TCTL Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.FoTCTLSpec
	 * @generated
	 */
	public Adapter createFoTCTLSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.FoTCTLFormula <em>Fo TCTL Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.FoTCTLFormula
	 * @generated
	 */
	public Adapter createFoTCTLFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.NodeLabelPredicateDecl <em>Node Label Predicate Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.NodeLabelPredicateDecl
	 * @generated
	 */
	public Adapter createNodeLabelPredicateDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl <em>Edge Label Predicate Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl
	 * @generated
	 */
	public Adapter createEdgeLabelPredicateDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl <em>Constant Symbol Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl
	 * @generated
	 */
	public Adapter createConstantSymbolDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.QuantifiedFormula <em>Quantified Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.QuantifiedFormula
	 * @generated
	 */
	public Adapter createQuantifiedFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.NodeLabelPredicate <em>Node Label Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.NodeLabelPredicate
	 * @generated
	 */
	public Adapter createNodeLabelPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate <em>Edge Label Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate
	 * @generated
	 */
	public Adapter createEdgeLabelPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.fotctl.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.fotctl.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.TCTLFormula <em>TCTL Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.TCTLFormula
	 * @generated
	 */
	public Adapter createTCTLFormulaAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.FormulaDefinition <em>Formula Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.FormulaDefinition
	 * @generated
	 */
	public Adapter createFormulaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.UnaryFormula <em>Unary Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.UnaryFormula
	 * @generated
	 */
	public Adapter createUnaryFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.AtomicFormula <em>Atomic Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.AtomicFormula
	 * @generated
	 */
	public Adapter createAtomicFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
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

} //FotctlAdapterFactory
