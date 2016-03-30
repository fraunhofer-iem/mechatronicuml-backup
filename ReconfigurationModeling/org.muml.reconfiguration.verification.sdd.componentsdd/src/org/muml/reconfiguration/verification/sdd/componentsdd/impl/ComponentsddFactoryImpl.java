/**
 */
package org.muml.reconfiguration.verification.sdd.componentsdd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.reconfiguration.verification.sdd.componentsdd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsddFactoryImpl extends EFactoryImpl implements ComponentsddFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentsddFactory init() {
		try {
			ComponentsddFactory theComponentsddFactory = (ComponentsddFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentsddPackage.eNS_URI);
			if (theComponentsddFactory != null) {
				return theComponentsddFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentsddFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsddFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM: return createComponentStoryDecisionDiagram();
			case ComponentsddPackage.COMPONENT_STORY_PATTERN_NODE: return createComponentStoryPatternNode();
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION: return createEvaluateComponentSDDExpression();
			case ComponentsddPackage.INITIAL_NODE: return createInitialNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryDecisionDiagram createComponentStoryDecisionDiagram() {
		ComponentStoryDecisionDiagramImpl componentStoryDecisionDiagram = new ComponentStoryDecisionDiagramImpl();
		return componentStoryDecisionDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryPatternNode createComponentStoryPatternNode() {
		ComponentStoryPatternNodeImpl componentStoryPatternNode = new ComponentStoryPatternNodeImpl();
		return componentStoryPatternNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateComponentSDDExpression createEvaluateComponentSDDExpression() {
		EvaluateComponentSDDExpressionImpl evaluateComponentSDDExpression = new EvaluateComponentSDDExpressionImpl();
		return evaluateComponentSDDExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsddPackage getComponentsddPackage() {
		return (ComponentsddPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentsddPackage getPackage() {
		return ComponentsddPackage.eINSTANCE;
	}

} //ComponentsddFactoryImpl
