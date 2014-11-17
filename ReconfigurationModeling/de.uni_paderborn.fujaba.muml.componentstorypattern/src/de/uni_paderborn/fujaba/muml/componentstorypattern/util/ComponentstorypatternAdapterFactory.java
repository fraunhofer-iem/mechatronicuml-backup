/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.util;

import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement;
import de.uni_paderborn.fujaba.muml.componentstorypattern.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression;
import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage
 * @generated
 */
public class ComponentstorypatternAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentstorypatternPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorypatternAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentstorypatternPackage.eINSTANCE;
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
	protected ComponentstorypatternSwitch<Adapter> modelSwitch =
		new ComponentstorypatternSwitch<Adapter>() {
			@Override
			public Adapter caseComponentStoryPattern(ComponentStoryPattern object) {
				return createComponentStoryPatternAdapter();
			}
			@Override
			public Adapter caseComponentStoryPatternVariable(ComponentStoryPatternVariable object) {
				return createComponentStoryPatternVariableAdapter();
			}
			@Override
			public Adapter caseComponentVariable(ComponentVariable object) {
				return createComponentVariableAdapter();
			}
			@Override
			public Adapter casePortVariable(PortVariable object) {
				return createPortVariableAdapter();
			}
			@Override
			public Adapter casePartVariable(PartVariable object) {
				return createPartVariableAdapter();
			}
			@Override
			public Adapter caseConnectorVariable(ConnectorVariable object) {
				return createConnectorVariableAdapter();
			}
			@Override
			public Adapter caseAssemblyVariable(AssemblyVariable object) {
				return createAssemblyVariableAdapter();
			}
			@Override
			public Adapter caseDelegationVariable(DelegationVariable object) {
				return createDelegationVariableAdapter();
			}
			@Override
			public Adapter caseSinglePortVariable(SinglePortVariable object) {
				return createSinglePortVariableAdapter();
			}
			@Override
			public Adapter caseMultiPortVariable(MultiPortVariable object) {
				return createMultiPortVariableAdapter();
			}
			@Override
			public Adapter caseTriggerEmbeddedComponentExpression(TriggerEmbeddedComponentExpression object) {
				return createTriggerEmbeddedComponentExpressionAdapter();
			}
			@Override
			public Adapter caseFadingComponentPartVariable(FadingComponentPartVariable object) {
				return createFadingComponentPartVariableAdapter();
			}
			@Override
			public Adapter caseComponentPartVariable(ComponentPartVariable object) {
				return createComponentPartVariableAdapter();
			}
			@Override
			public Adapter caseMultiPortOrderConstraint(MultiPortOrderConstraint object) {
				return createMultiPortOrderConstraintAdapter();
			}
			@Override
			public Adapter caseMultiPortPositionConstraint(MultiPortPositionConstraint object) {
				return createMultiPortPositionConstraintAdapter();
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
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseConnectorEndpoint(ConnectorEndpoint object) {
				return createConnectorEndpointAdapter();
			}
			@Override
			public Adapter caseTypedNamedElement(TypedNamedElement object) {
				return createTypedNamedElementAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern <em>Component Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern
	 * @generated
	 */
	public Adapter createComponentStoryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable <em>Component Story Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable
	 * @generated
	 */
	public Adapter createComponentStoryPatternVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable <em>Component Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable
	 * @generated
	 */
	public Adapter createComponentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable <em>Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable
	 * @generated
	 */
	public Adapter createPortVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable <em>Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable
	 * @generated
	 */
	public Adapter createPartVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable <em>Connector Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable
	 * @generated
	 */
	public Adapter createConnectorVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable <em>Assembly Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable
	 * @generated
	 */
	public Adapter createAssemblyVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable <em>Delegation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable
	 * @generated
	 */
	public Adapter createDelegationVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable <em>Single Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable
	 * @generated
	 */
	public Adapter createSinglePortVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable
	 * @generated
	 */
	public Adapter createMultiPortVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression <em>Trigger Embedded Component Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression
	 * @generated
	 */
	public Adapter createTriggerEmbeddedComponentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable <em>Fading Component Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable
	 * @generated
	 */
	public Adapter createFadingComponentPartVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable <em>Component Part Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable
	 * @generated
	 */
	public Adapter createComponentPartVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint <em>Multi Port Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint
	 * @generated
	 */
	public Adapter createMultiPortOrderConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint <em>Multi Port Position Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint
	 * @generated
	 */
	public Adapter createMultiPortPositionConstraintAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint
	 * @generated
	 */
	public Adapter createConnectorEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement <em>Typed Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement
	 * @generated
	 */
	public Adapter createTypedNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.connector.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.connector.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.expressions.Expression
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

} //ComponentstorypatternAdapterFactory
