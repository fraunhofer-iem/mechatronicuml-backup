/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.constraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The package constraint provides abstract super classes for modeling different
 * kinds of constraints that may be attached to ConstrainableElements of the
 * MechatronicUML meta-model. 
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.constraint.ConstraintFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ConstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/model/constraint/0.3.13";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "constraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CORRECTNESS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BACKGROUND = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINABLE_ELEMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CORRECT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ModelingConstraintImpl <em>Modeling Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ModelingConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getModelingConstraint()
	 * @generated
	 */
	int MODELING_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__ANNOTATION = CONSTRAINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__EXTENSION = CONSTRAINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__CORRECTNESS = CONSTRAINT__CORRECTNESS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__BACKGROUND = CONSTRAINT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__CONSTRAINABLE_ELEMENT = CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__CORRECT = CONSTRAINT__CORRECT;

	/**
	 * The number of structural features of the '<em>Modeling Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.VerifiableConstraintImpl <em>Verifiable Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.VerifiableConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getVerifiableConstraint()
	 * @generated
	 */
	int VERIFIABLE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__ANNOTATION = CONSTRAINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__EXTENSION = CONSTRAINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__CORRECTNESS = CONSTRAINT__CORRECTNESS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__BACKGROUND = CONSTRAINT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__CONSTRAINABLE_ELEMENT = CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__CORRECT = CONSTRAINT__CORRECT;

	/**
	 * The number of structural features of the '<em>Verifiable Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.TextualConstraintImpl <em>Textual Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.TextualConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getTextualConstraint()
	 * @generated
	 */
	int TEXTUAL_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__ANNOTATION = VERIFIABLE_CONSTRAINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__EXTENSION = VERIFIABLE_CONSTRAINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__CORRECTNESS = VERIFIABLE_CONSTRAINT__CORRECTNESS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__BACKGROUND = VERIFIABLE_CONSTRAINT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__CONSTRAINABLE_ELEMENT = VERIFIABLE_CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__CORRECT = VERIFIABLE_CONSTRAINT__CORRECT;

	/**
	 * The feature id for the '<em><b>Textual Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION = VERIFIABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT_FEATURE_COUNT = VERIFIABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstrainableElementImpl
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getConstrainableElement()
	 * @generated
	 */
	int CONSTRAINABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constrainable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.Correctness <em>Correctness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.Correctness
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getCorrectness()
	 * @generated
	 */
	int CORRECTNESS = 5;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.constraint.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.constraint.Constraint#getCorrectness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correctness</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.Constraint#getCorrectness()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Correctness();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.constraint.Constraint#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.Constraint#isBackground()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Background();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.constraint.Constraint#getConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Constrainable Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.Constraint#getConstrainableElement()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainableElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.constraint.Constraint#isCorrect <em>Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.Constraint#isCorrect()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Correct();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.constraint.ModelingConstraint <em>Modeling Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.ModelingConstraint
	 * @generated
	 */
	EClass getModelingConstraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.constraint.VerifiableConstraint <em>Verifiable Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiable Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.VerifiableConstraint
	 * @generated
	 */
	EClass getVerifiableConstraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint <em>Textual Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint
	 * @generated
	 */
	EClass getTextualConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint#getTextualExpression <em>Textual Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textual Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint#getTextualExpression()
	 * @see #getTextualConstraint()
	 * @generated
	 */
	EReference getTextualConstraint_TextualExpression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.constraint.ConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrainable Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.ConstrainableElement
	 * @generated
	 */
	EClass getConstrainableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.constraint.ConstrainableElement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.ConstrainableElement#getConstraint()
	 * @see #getConstrainableElement()
	 * @generated
	 */
	EReference getConstrainableElement_Constraint();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.constraint.Correctness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Correctness</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.Correctness
	 * @generated
	 */
	EEnum getCorrectness();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintFactory getConstraintFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Correctness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CORRECTNESS = eINSTANCE.getConstraint_Correctness();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__BACKGROUND = eINSTANCE.getConstraint_Background();

		/**
		 * The meta object literal for the '<em><b>Constrainable Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINABLE_ELEMENT = eINSTANCE.getConstraint_ConstrainableElement();

		/**
		 * The meta object literal for the '<em><b>Correct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CORRECT = eINSTANCE.getConstraint_Correct();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ModelingConstraintImpl <em>Modeling Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ModelingConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getModelingConstraint()
		 * @generated
		 */
		EClass MODELING_CONSTRAINT = eINSTANCE.getModelingConstraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.VerifiableConstraintImpl <em>Verifiable Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.VerifiableConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getVerifiableConstraint()
		 * @generated
		 */
		EClass VERIFIABLE_CONSTRAINT = eINSTANCE.getVerifiableConstraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.TextualConstraintImpl <em>Textual Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.TextualConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getTextualConstraint()
		 * @generated
		 */
		EClass TEXTUAL_CONSTRAINT = eINSTANCE.getTextualConstraint();

		/**
		 * The meta object literal for the '<em><b>Textual Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION = eINSTANCE.getTextualConstraint_TextualExpression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstrainableElementImpl <em>Constrainable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstrainableElementImpl
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getConstrainableElement()
		 * @generated
		 */
		EClass CONSTRAINABLE_ELEMENT = eINSTANCE.getConstrainableElement();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINABLE_ELEMENT__CONSTRAINT = eINSTANCE.getConstrainableElement_Constraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.constraint.Correctness <em>Correctness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.Correctness
		 * @see de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl#getCorrectness()
		 * @generated
		 */
		EEnum CORRECTNESS = eINSTANCE.getCorrectness();

	}

} //ConstraintPackage
