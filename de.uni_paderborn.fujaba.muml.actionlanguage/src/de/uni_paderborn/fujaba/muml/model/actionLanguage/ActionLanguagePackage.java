/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.expressions.ExpressionsPackage;

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
 * The base package for the muml action language. It is an extension to the core.ecore expression package.
 * The action language contains block definition, control structures like conditional statements and loops, assignments, and variable and operation call expressions. 
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguageFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/edapt historyURI='../../de.uni_paderborn.fujaba.muml.model/model/muml.history'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ActionLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "actionLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/actionlanguage/0.3.16";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "actionLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionLanguagePackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BlockImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__EXPRESSIONS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LoopImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ANNOTATION = BLOCK__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__EXTENSION = BLOCK__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__COMMENT = BLOCK__COMMENT;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__EXPRESSIONS = BLOCK__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BLOCK = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_TEST = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.WhileLoopImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getWhileLoop()
	 * @generated
	 */
	int WHILE_LOOP = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__ANNOTATION = LOOP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__EXTENSION = LOOP__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__COMMENT = LOOP__COMMENT;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__EXPRESSIONS = LOOP__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__BLOCK = LOOP__BLOCK;

	/**
	 * The feature id for the '<em><b>Loop Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__LOOP_TEST = LOOP__LOOP_TEST;

	/**
	 * The number of structural features of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DoWhileLoopImpl <em>Do While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DoWhileLoopImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getDoWhileLoop()
	 * @generated
	 */
	int DO_WHILE_LOOP = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_LOOP__ANNOTATION = LOOP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_LOOP__EXTENSION = LOOP__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_LOOP__COMMENT = LOOP__COMMENT;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_LOOP__EXPRESSIONS = LOOP__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_LOOP__BLOCK = LOOP__BLOCK;

	/**
	 * The feature id for the '<em><b>Loop Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_LOOP__LOOP_TEST = LOOP__LOOP_TEST;

	/**
	 * The number of structural features of the '<em>Do While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Assign Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGN_OPERATOR = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs assign Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__RHS_ASSIGN_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increment Decrement Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lhs typed Named Element Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ForLoopImpl <em>For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ForLoopImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getForLoop()
	 * @generated
	 */
	int FOR_LOOP = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__ANNOTATION = LOOP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__EXTENSION = LOOP__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__COMMENT = LOOP__COMMENT;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__EXPRESSIONS = LOOP__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__BLOCK = LOOP__BLOCK;

	/**
	 * The feature id for the '<em><b>Loop Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__LOOP_TEST = LOOP__LOOP_TEST;

	/**
	 * The feature id for the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__INITIALIZE_EXPRESSION = LOOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counting Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__COUNTING_EXPRESSION = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__IF_CONDITION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__IF_BLOCK = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else If Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_IF_CONDITIONS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else If Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_IF_BLOCKS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_BLOCK = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TypedNamedElementExpressionImpl <em>Typed Named Element Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TypedNamedElementExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getTypedNamedElementExpression()
	 * @generated
	 */
	int TYPED_NAMED_ELEMENT_EXPRESSION = 13;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.OperationCallImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__OPERATION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__PARAMETER_BINDING = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ReturnStatementImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TriggerMessageExpressionImpl <em>Trigger Message Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TriggerMessageExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getTriggerMessageExpression()
	 * @generated
	 */
	int TRIGGER_MESSAGE_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_EXPRESSION__MESSAGE_TYPE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_EXPRESSION__PARAMETER = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger Message Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DiscreteInteractionEndpointReferenceImpl <em>Discrete Interaction Endpoint Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DiscreteInteractionEndpointReferenceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getDiscreteInteractionEndpointReference()
	 * @generated
	 */
	int DISCRETE_INTERACTION_ENDPOINT_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_REFERENCE__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_REFERENCE__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_REFERENCE__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Typed Named Element Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Interaction Endpoint Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_REFERENCE_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.PositionSelectorImpl <em>Position Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.PositionSelectorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getPositionSelector()
	 * @generated
	 */
	int POSITION_SELECTOR = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SELECTOR__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SELECTOR__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SELECTOR__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SELECTOR__KIND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SELECTOR__SUCCESSOR = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SELECTOR_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LocalVariableDeclarationStatementImpl <em>Local Variable Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LocalVariableDeclarationStatementImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getLocalVariableDeclarationStatement()
	 * @generated
	 */
	int LOCAL_VARIABLE_DECLARATION_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_STATEMENT__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_STATEMENT__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_STATEMENT__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Surrounding Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_STATEMENT__ALL_SURROUNDING_BLOCKS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Local Variable Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_DECLARATION_STATEMENT_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_ELEMENT_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_ELEMENT_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_ELEMENT_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Typed Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_ELEMENT_EXPRESSION__INDICES = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Named Element Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_ELEMENT_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator <em>Assign Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getAssignOperator()
	 * @generated
	 */
	int ASSIGN_OPERATOR = 14;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator <em>Increment Decrement Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getIncrementDecrementOperator()
	 * @generated
	 */
	int INCREMENT_DECREMENT_OPERATOR = 15;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelectorKind <em>Position Selector Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelectorKind
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getPositionSelectorKind()
	 * @generated
	 */
	int POSITION_SELECTOR_KIND = 16;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Block#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Block#getExpressions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Expressions();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Loop#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Loop#getBlock()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Block();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Loop#getLoopTest <em>Loop Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Test</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Loop#getLoopTest()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_LoopTest();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Loop</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.WhileLoop
	 * @generated
	 */
	EClass getWhileLoop();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DoWhileLoop <em>Do While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do While Loop</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.DoWhileLoop
	 * @generated
	 */
	EClass getDoWhileLoop();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignOperator <em>Assign Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignOperator()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_AssignOperator();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getRhs_assignExpression <em>Rhs assign Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs assign Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getRhs_assignExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Rhs_assignExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment Decrement Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getIncrementDecrementOperator()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_IncrementDecrementOperator();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getLhs_typedNamedElementExpression <em>Lhs typed Named Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs typed Named Element Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getLhs_typedNamedElementExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Lhs_typedNamedElementExpression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop
	 * @generated
	 */
	EClass getForLoop();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getInitializeExpression <em>Initialize Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialize Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getInitializeExpression()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_InitializeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getCountingExpression <em>Counting Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counting Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getCountingExpression()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_CountingExpression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Condition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getIfCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_IfCondition();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Block</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getIfBlock()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_IfBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getElseIfConditions <em>Else If Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else If Conditions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getElseIfConditions()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseIfConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getElseIfBlocks <em>Else If Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else If Blocks</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getElseIfBlocks()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseIfBlocks();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement#getElseBlock()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseBlock();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getOperation()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Binding</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getParameterBinding()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_ParameterBinding();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ReturnStatement#getExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression <em>Trigger Message Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Message Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression
	 * @generated
	 */
	EClass getTriggerMessageExpression();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression#getMessageType()
	 * @see #getTriggerMessageExpression()
	 * @generated
	 */
	EReference getTriggerMessageExpression_MessageType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression#getParameter()
	 * @see #getTriggerMessageExpression()
	 * @generated
	 */
	EReference getTriggerMessageExpression_Parameter();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference <em>Discrete Interaction Endpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Interaction Endpoint Reference</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference
	 * @generated
	 */
	EClass getDiscreteInteractionEndpointReference();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference#getTypedNamedElementExpression <em>Typed Named Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typed Named Element Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference#getTypedNamedElementExpression()
	 * @see #getDiscreteInteractionEndpointReference()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpointReference_TypedNamedElementExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference#getPosition()
	 * @see #getDiscreteInteractionEndpointReference()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpointReference_Position();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector <em>Position Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Selector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector
	 * @generated
	 */
	EClass getPositionSelector();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector#getKind()
	 * @see #getPositionSelector()
	 * @generated
	 */
	EAttribute getPositionSelector_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Successor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector#getSuccessor()
	 * @see #getPositionSelector()
	 * @generated
	 */
	EReference getPositionSelector_Successor();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement <em>Local Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable Declaration Statement</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement
	 * @generated
	 */
	EClass getLocalVariableDeclarationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement#getVariable()
	 * @see #getLocalVariableDeclarationStatement()
	 * @generated
	 */
	EReference getLocalVariableDeclarationStatement_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement#getInitializeExpression <em>Initialize Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialize Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement#getInitializeExpression()
	 * @see #getLocalVariableDeclarationStatement()
	 * @generated
	 */
	EReference getLocalVariableDeclarationStatement_InitializeExpression();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement#getAllSurroundingBlocks <em>All Surrounding Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Surrounding Blocks</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement#getAllSurroundingBlocks()
	 * @see #getLocalVariableDeclarationStatement()
	 * @generated
	 */
	EReference getLocalVariableDeclarationStatement_AllSurroundingBlocks();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression <em>Typed Named Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Named Element Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression
	 * @generated
	 */
	EClass getTypedNamedElementExpression();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression#getTypedNamedElement <em>Typed Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typed Named Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression#getTypedNamedElement()
	 * @see #getTypedNamedElementExpression()
	 * @generated
	 */
	EReference getTypedNamedElementExpression_TypedNamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indices</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression#getIndices()
	 * @see #getTypedNamedElementExpression()
	 * @generated
	 */
	EReference getTypedNamedElementExpression_Indices();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator <em>Assign Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assign Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator
	 * @generated
	 */
	EEnum getAssignOperator();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator <em>Increment Decrement Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Increment Decrement Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator
	 * @generated
	 */
	EEnum getIncrementDecrementOperator();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelectorKind <em>Position Selector Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Selector Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelectorKind
	 * @generated
	 */
	EEnum getPositionSelectorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionLanguageFactory getActionLanguageFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BlockImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__EXPRESSIONS = eINSTANCE.getBlock_Expressions();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LoopImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BLOCK = eINSTANCE.getLoop_Block();

		/**
		 * The meta object literal for the '<em><b>Loop Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP_TEST = eINSTANCE.getLoop_LoopTest();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.WhileLoopImpl <em>While Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.WhileLoopImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getWhileLoop()
		 * @generated
		 */
		EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DoWhileLoopImpl <em>Do While Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DoWhileLoopImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getDoWhileLoop()
		 * @generated
		 */
		EClass DO_WHILE_LOOP = eINSTANCE.getDoWhileLoop();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Assign Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__ASSIGN_OPERATOR = eINSTANCE.getAssignment_AssignOperator();

		/**
		 * The meta object literal for the '<em><b>Rhs assign Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__RHS_ASSIGN_EXPRESSION = eINSTANCE.getAssignment_Rhs_assignExpression();

		/**
		 * The meta object literal for the '<em><b>Increment Decrement Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR = eINSTANCE.getAssignment_IncrementDecrementOperator();

		/**
		 * The meta object literal for the '<em><b>Lhs typed Named Element Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION = eINSTANCE.getAssignment_Lhs_typedNamedElementExpression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ForLoopImpl <em>For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ForLoopImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getForLoop()
		 * @generated
		 */
		EClass FOR_LOOP = eINSTANCE.getForLoop();

		/**
		 * The meta object literal for the '<em><b>Initialize Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__INITIALIZE_EXPRESSION = eINSTANCE.getForLoop_InitializeExpression();

		/**
		 * The meta object literal for the '<em><b>Counting Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__COUNTING_EXPRESSION = eINSTANCE.getForLoop_CountingExpression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>If Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__IF_CONDITION = eINSTANCE.getIfStatement_IfCondition();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__IF_BLOCK = eINSTANCE.getIfStatement_IfBlock();

		/**
		 * The meta object literal for the '<em><b>Else If Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_IF_CONDITIONS = eINSTANCE.getIfStatement_ElseIfConditions();

		/**
		 * The meta object literal for the '<em><b>Else If Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_IF_BLOCKS = eINSTANCE.getIfStatement_ElseIfBlocks();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_BLOCK = eINSTANCE.getIfStatement_ElseBlock();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.OperationCallImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getOperationCall()
		 * @generated
		 */
		EClass OPERATION_CALL = eINSTANCE.getOperationCall();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__OPERATION = eINSTANCE.getOperationCall_Operation();

		/**
		 * The meta object literal for the '<em><b>Parameter Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__PARAMETER_BINDING = eINSTANCE.getOperationCall_ParameterBinding();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ReturnStatementImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TriggerMessageExpressionImpl <em>Trigger Message Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TriggerMessageExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getTriggerMessageExpression()
		 * @generated
		 */
		EClass TRIGGER_MESSAGE_EXPRESSION = eINSTANCE.getTriggerMessageExpression();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_MESSAGE_EXPRESSION__MESSAGE_TYPE = eINSTANCE.getTriggerMessageExpression_MessageType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_MESSAGE_EXPRESSION__PARAMETER = eINSTANCE.getTriggerMessageExpression_Parameter();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DiscreteInteractionEndpointReferenceImpl <em>Discrete Interaction Endpoint Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.DiscreteInteractionEndpointReferenceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getDiscreteInteractionEndpointReference()
		 * @generated
		 */
		EClass DISCRETE_INTERACTION_ENDPOINT_REFERENCE = eINSTANCE.getDiscreteInteractionEndpointReference();

		/**
		 * The meta object literal for the '<em><b>Typed Named Element Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION = eINSTANCE.getDiscreteInteractionEndpointReference_TypedNamedElementExpression();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION = eINSTANCE.getDiscreteInteractionEndpointReference_Position();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.PositionSelectorImpl <em>Position Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.PositionSelectorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getPositionSelector()
		 * @generated
		 */
		EClass POSITION_SELECTOR = eINSTANCE.getPositionSelector();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_SELECTOR__KIND = eINSTANCE.getPositionSelector_Kind();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_SELECTOR__SUCCESSOR = eINSTANCE.getPositionSelector_Successor();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LocalVariableDeclarationStatementImpl <em>Local Variable Declaration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LocalVariableDeclarationStatementImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getLocalVariableDeclarationStatement()
		 * @generated
		 */
		EClass LOCAL_VARIABLE_DECLARATION_STATEMENT = eINSTANCE.getLocalVariableDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE = eINSTANCE.getLocalVariableDeclarationStatement_Variable();

		/**
		 * The meta object literal for the '<em><b>Initialize Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION = eINSTANCE.getLocalVariableDeclarationStatement_InitializeExpression();

		/**
		 * The meta object literal for the '<em><b>All Surrounding Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE_DECLARATION_STATEMENT__ALL_SURROUNDING_BLOCKS = eINSTANCE.getLocalVariableDeclarationStatement_AllSurroundingBlocks();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TypedNamedElementExpressionImpl <em>Typed Named Element Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TypedNamedElementExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getTypedNamedElementExpression()
		 * @generated
		 */
		EClass TYPED_NAMED_ELEMENT_EXPRESSION = eINSTANCE.getTypedNamedElementExpression();

		/**
		 * The meta object literal for the '<em><b>Typed Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT = eINSTANCE.getTypedNamedElementExpression_TypedNamedElement();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_NAMED_ELEMENT_EXPRESSION__INDICES = eINSTANCE.getTypedNamedElementExpression_Indices();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator <em>Assign Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getAssignOperator()
		 * @generated
		 */
		EEnum ASSIGN_OPERATOR = eINSTANCE.getAssignOperator();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator <em>Increment Decrement Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getIncrementDecrementOperator()
		 * @generated
		 */
		EEnum INCREMENT_DECREMENT_OPERATOR = eINSTANCE.getIncrementDecrementOperator();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelectorKind <em>Position Selector Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelectorKind
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getPositionSelectorKind()
		 * @generated
		 */
		EEnum POSITION_SELECTOR_KIND = eINSTANCE.getPositionSelectorKind();

	}

} //ActionLanguagePackage
