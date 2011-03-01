/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.constraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintFactory
 * @model kind="package"
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
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/model/constraint";

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
	ConstraintPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CORRECTNESS = 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BACKGROUND = 1;

	/**
	 * The feature id for the '<em><b>Internal Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__INTERNAL_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Extend Automatically</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXTEND_AUTOMATICALLY = 3;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINABLE_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Text As Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_TEXT_AS_COMMENT = 0;

	/**
	 * The operation id for the '<em>Is Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___IS_CORRECT = 1;

	/**
	 * The operation id for the '<em>Get Correctness As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_CORRECTNESS_AS_STRING = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ModelingConstraintImpl <em>Modeling Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ModelingConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getModelingConstraint()
	 * @generated
	 */
	int MODELING_CONSTRAINT = 1;

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
	 * The feature id for the '<em><b>Internal Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__INTERNAL_CONSTRAINT = CONSTRAINT__INTERNAL_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Extend Automatically</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__EXTEND_AUTOMATICALLY = CONSTRAINT__EXTEND_AUTOMATICALLY;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT__CONSTRAINABLE_ELEMENT = CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Modeling Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Text As Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___GET_TEXT_AS_COMMENT = CONSTRAINT___GET_TEXT_AS_COMMENT;

	/**
	 * The operation id for the '<em>Is Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___IS_CORRECT = CONSTRAINT___IS_CORRECT;

	/**
	 * The operation id for the '<em>Get Correctness As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT___GET_CORRECTNESS_AS_STRING = CONSTRAINT___GET_CORRECTNESS_AS_STRING;

	/**
	 * The number of operations of the '<em>Modeling Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.VerifiableConstraintImpl <em>Verifiable Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.VerifiableConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getVerifiableConstraint()
	 * @generated
	 */
	int VERIFIABLE_CONSTRAINT = 2;

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
	 * The feature id for the '<em><b>Internal Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__INTERNAL_CONSTRAINT = CONSTRAINT__INTERNAL_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Extend Automatically</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__EXTEND_AUTOMATICALLY = CONSTRAINT__EXTEND_AUTOMATICALLY;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT__CONSTRAINABLE_ELEMENT = CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Verifiable Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Text As Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___GET_TEXT_AS_COMMENT = CONSTRAINT___GET_TEXT_AS_COMMENT;

	/**
	 * The operation id for the '<em>Is Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___IS_CORRECT = CONSTRAINT___IS_CORRECT;

	/**
	 * The operation id for the '<em>Get Correctness As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT___GET_CORRECTNESS_AS_STRING = CONSTRAINT___GET_CORRECTNESS_AS_STRING;

	/**
	 * The number of operations of the '<em>Verifiable Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl <em>Textual Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getTextualConstraint()
	 * @generated
	 */
	int TEXTUAL_CONSTRAINT = 3;

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
	 * The feature id for the '<em><b>Internal Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__INTERNAL_CONSTRAINT = VERIFIABLE_CONSTRAINT__INTERNAL_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Extend Automatically</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__EXTEND_AUTOMATICALLY = VERIFIABLE_CONSTRAINT__EXTEND_AUTOMATICALLY;

	/**
	 * The feature id for the '<em><b>Constrainable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT__CONSTRAINABLE_ELEMENT = VERIFIABLE_CONSTRAINT__CONSTRAINABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Textual Expression</b></em>' reference.
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
	 * The operation id for the '<em>Get Text As Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___GET_TEXT_AS_COMMENT = VERIFIABLE_CONSTRAINT___GET_TEXT_AS_COMMENT;

	/**
	 * The operation id for the '<em>Is Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___IS_CORRECT = VERIFIABLE_CONSTRAINT___IS_CORRECT;

	/**
	 * The operation id for the '<em>Get Correctness As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT___GET_CORRECTNESS_AS_STRING = VERIFIABLE_CONSTRAINT___GET_CORRECTNESS_AS_STRING;

	/**
	 * The number of operations of the '<em>Textual Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONSTRAINT_OPERATION_COUNT = VERIFIABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness <em>Correctness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getCorrectness()
	 * @generated
	 */
	int CORRECTNESS = 4;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getCorrectness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correctness</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getCorrectness()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Correctness();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isBackground()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Background();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isInternalConstraint <em>Internal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isInternalConstraint()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_InternalConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isExtendAutomatically <em>Extend Automatically</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extend Automatically</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isExtendAutomatically()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ExtendAutomatically();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrainable Element</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getConstrainableElement()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainableElement();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getTextAsComment() <em>Get Text As Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text As Comment</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getTextAsComment()
	 * @generated
	 */
	EOperation getConstraint__GetTextAsComment();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isCorrect() <em>Is Correct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Correct</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isCorrect()
	 * @generated
	 */
	EOperation getConstraint__IsCorrect();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getCorrectnessAsString() <em>Get Correctness As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Correctness As String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getCorrectnessAsString()
	 * @generated
	 */
	EOperation getConstraint__GetCorrectnessAsString();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.ModelingConstraint <em>Modeling Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ModelingConstraint
	 * @generated
	 */
	EClass getModelingConstraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.VerifiableConstraint <em>Verifiable Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiable Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.VerifiableConstraint
	 * @generated
	 */
	EClass getVerifiableConstraint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint <em>Textual Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint
	 * @generated
	 */
	EClass getTextualConstraint();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint#getTextualExpression <em>Textual Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Textual Expression</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint#getTextualExpression()
	 * @see #getTextualConstraint()
	 * @generated
	 */
	EReference getTextualConstraint_TextualExpression();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Correctness</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness
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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getConstraint()
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
		 * The meta object literal for the '<em><b>Internal Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__INTERNAL_CONSTRAINT = eINSTANCE.getConstraint_InternalConstraint();

		/**
		 * The meta object literal for the '<em><b>Extend Automatically</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EXTEND_AUTOMATICALLY = eINSTANCE.getConstraint_ExtendAutomatically();

		/**
		 * The meta object literal for the '<em><b>Constrainable Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINABLE_ELEMENT = eINSTANCE.getConstraint_ConstrainableElement();

		/**
		 * The meta object literal for the '<em><b>Get Text As Comment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT___GET_TEXT_AS_COMMENT = eINSTANCE.getConstraint__GetTextAsComment();

		/**
		 * The meta object literal for the '<em><b>Is Correct</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT___IS_CORRECT = eINSTANCE.getConstraint__IsCorrect();

		/**
		 * The meta object literal for the '<em><b>Get Correctness As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT___GET_CORRECTNESS_AS_STRING = eINSTANCE.getConstraint__GetCorrectnessAsString();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ModelingConstraintImpl <em>Modeling Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ModelingConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getModelingConstraint()
		 * @generated
		 */
		EClass MODELING_CONSTRAINT = eINSTANCE.getModelingConstraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.VerifiableConstraintImpl <em>Verifiable Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.VerifiableConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getVerifiableConstraint()
		 * @generated
		 */
		EClass VERIFIABLE_CONSTRAINT = eINSTANCE.getVerifiableConstraint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl <em>Textual Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getTextualConstraint()
		 * @generated
		 */
		EClass TEXTUAL_CONSTRAINT = eINSTANCE.getTextualConstraint();

		/**
		 * The meta object literal for the '<em><b>Textual Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION = eINSTANCE.getTextualConstraint_TextualExpression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness <em>Correctness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness
		 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintPackageImpl#getCorrectness()
		 * @generated
		 */
		EEnum CORRECTNESS = eINSTANCE.getCorrectness();

	}

} //ConstraintPackage
