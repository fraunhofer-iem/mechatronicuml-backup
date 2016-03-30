/**
 */
package org.muml.storydiagram.verification.sdd.basicsdd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.storydiagram.verification.sdd.basicsdd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicSDDFactoryImpl extends EFactoryImpl implements BasicSDDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicSDDFactory init() {
		try {
			BasicSDDFactory theBasicSDDFactory = (BasicSDDFactory)EPackage.Registry.INSTANCE.getEFactory(BasicSDDPackage.eNS_URI);
			if (theBasicSDDFactory != null) {
				return theBasicSDDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicSDDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSDDFactoryImpl() {
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
			case BasicSDDPackage.STORY_DECISION_DIAGRAM: return createStoryDecisionDiagram();
			case BasicSDDPackage.STORY_PATTERN_NODE: return createStoryPatternNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryDecisionDiagram createStoryDecisionDiagram() {
		StoryDecisionDiagramImpl storyDecisionDiagram = new StoryDecisionDiagramImpl();
		return storyDecisionDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternNode createStoryPatternNode() {
		StoryPatternNodeImpl storyPatternNode = new StoryPatternNodeImpl();
		return storyPatternNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSDDPackage getBasicSDDPackage() {
		return (BasicSDDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicSDDPackage getPackage() {
		return BasicSDDPackage.eINSTANCE;
	}

} //BasicSDDFactoryImpl
