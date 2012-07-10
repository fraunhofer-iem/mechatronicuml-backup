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
 * The base package for all expressions which can be used for modeling actions, guards, invariants... . 
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguageFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.fujaba.de/muml/actionlanguage/0.2.0";

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TextualExpressionImpl <em>Textual Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TextualExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getTextualExpression()
	 * @generated
	 */
	int TEXTUAL_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Expression Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__EXPRESSION_TEXT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__LANGUAGE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__LANGUAGE_VERSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Textual Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LiteralExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__VALUE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.UnaryExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__UNARY_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__UNARY_OPERATOR = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BinaryExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ComparisonExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getComparisonExpression()
	 * @generated
	 */
	int COMPARISON_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__EXTENSION = BINARY_EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__COMMENT = BINARY_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ArithmeticExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__EXTENSION = BINARY_EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__COMMENT = BINARY_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BinaryLogicExpressionImpl <em>Binary Logic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BinaryLogicExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getBinaryLogicExpression()
	 * @generated
	 */
	int BINARY_LOGIC_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_EXPRESSION__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_EXPRESSION__EXTENSION = BINARY_EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_EXPRESSION__COMMENT = BINARY_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_EXPRESSION__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_EXPRESSION__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Logic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BlockImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 7;

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
	int LOOP = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BLOCK = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_TEST = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.WhileLoopImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getWhileLoop()
	 * @generated
	 */
	int WHILE_LOOP = 9;

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
	int DO_WHILE_LOOP = 10;

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
	int ASSIGNMENT = 11;

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
	 * The feature id for the '<em><b>Assign Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGN_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increment Decrement Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ATTRIBUTE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

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
	int FOR_LOOP = 12;

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
	 * The feature id for the '<em><b>Initalize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__INITALIZE_EXPRESSION = LOOP_FEATURE_COUNT + 0;

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
	int IF_STATEMENT = 13;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AttributeExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getAttributeExpression()
	 * @generated
	 */
	int ATTRIBUTE_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__ATTRIBUTE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.OperationCallImpl
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 15;

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
	 * The feature id for the '<em><b>Parameter Values For Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__PARAMETER_VALUES_FOR_BINDING = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator <em>Logic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getLogicOperator()
	 * @generated
	 */
	int LOGIC_OPERATOR = 16;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparingOperator <em>Comparing Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparingOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getComparingOperator()
	 * @generated
	 */
	int COMPARING_OPERATOR = 17;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 18;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator <em>Assign Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getAssignOperator()
	 * @generated
	 */
	int ASSIGN_OPERATOR = 19;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator <em>Increment Decrement Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getIncrementDecrementOperator()
	 * @generated
	 */
	int INCREMENT_DECREMENT_OPERATOR = 20;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 21;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 22;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression <em>Textual Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression
	 * @generated
	 */
	EClass getTextualExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Text</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getExpressionText()
	 * @see #getTextualExpression()
	 * @generated
	 */
	EAttribute getTextualExpression_ExpressionText();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getLanguage()
	 * @see #getTextualExpression()
	 * @generated
	 */
	EAttribute getTextualExpression_Language();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getLanguageVersion <em>Language Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Version</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getLanguageVersion()
	 * @see #getTextualExpression()
	 * @generated
	 */
	EAttribute getTextualExpression_LanguageVersion();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LiteralExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LiteralExpression#getValue()
	 * @see #getLiteralExpression()
	 * @generated
	 */
	EAttribute getLiteralExpression_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getUnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unary Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getUnaryExpression()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_UnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getUnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unary Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getUnaryOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_UnaryOperator();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryExpression#getLeftExpression <em>Left Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryExpression#getLeftExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryExpression#getRightExpression <em>Right Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryExpression#getRightExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightExpression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonExpression <em>Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonExpression
	 * @generated
	 */
	EClass getComparisonExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonExpression#getOperator()
	 * @see #getComparisonExpression()
	 * @generated
	 */
	EAttribute getComparisonExpression_Operator();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticExpression#getOperator()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Operator();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryLogicExpression <em>Binary Logic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Logic Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryLogicExpression
	 * @generated
	 */
	EClass getBinaryLogicExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryLogicExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.BinaryLogicExpression#getOperator()
	 * @see #getBinaryLogicExpression()
	 * @generated
	 */
	EAttribute getBinaryLogicExpression_Operator();

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
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignExpression <em>Assign Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assign Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_AssignExpression();

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
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAttribute()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Attribute();

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
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getInitalizeExpression <em>Initalize Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initalize Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getInitalizeExpression()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_InitalizeExpression();

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AttributeExpression <em>Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AttributeExpression
	 * @generated
	 */
	EClass getAttributeExpression();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AttributeExpression#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AttributeExpression#getAttribute()
	 * @see #getAttributeExpression()
	 * @generated
	 */
	EReference getAttributeExpression_Attribute();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getParameterValuesForBinding <em>Parameter Values For Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values For Binding</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getParameterValuesForBinding()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_ParameterValuesForBinding();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator <em>Logic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator
	 * @generated
	 */
	EEnum getLogicOperator();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparingOperator <em>Comparing Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparing Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparingOperator
	 * @generated
	 */
	EEnum getComparingOperator();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

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
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TextualExpressionImpl <em>Textual Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TextualExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getTextualExpression()
		 * @generated
		 */
		EClass TEXTUAL_EXPRESSION = eINSTANCE.getTextualExpression();

		/**
		 * The meta object literal for the '<em><b>Expression Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_EXPRESSION__EXPRESSION_TEXT = eINSTANCE.getTextualExpression_ExpressionText();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_EXPRESSION__LANGUAGE = eINSTANCE.getTextualExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Language Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_EXPRESSION__LANGUAGE_VERSION = eINSTANCE.getTextualExpression_LanguageVersion();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LiteralExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_EXPRESSION__VALUE = eINSTANCE.getLiteralExpression_Value();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.UnaryExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Unary Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__UNARY_EXPRESSION = eINSTANCE.getUnaryExpression_UnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Unary Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__UNARY_OPERATOR = eINSTANCE.getUnaryExpression_UnaryOperator();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BinaryExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_EXPRESSION = eINSTANCE.getBinaryExpression_LeftExpression();

		/**
		 * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_EXPRESSION = eINSTANCE.getBinaryExpression_RightExpression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ComparisonExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getComparisonExpression()
		 * @generated
		 */
		EClass COMPARISON_EXPRESSION = eINSTANCE.getComparisonExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_EXPRESSION__OPERATOR = eINSTANCE.getComparisonExpression_Operator();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ArithmeticExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getArithmeticExpression_Operator();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BinaryLogicExpressionImpl <em>Binary Logic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.BinaryLogicExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getBinaryLogicExpression()
		 * @generated
		 */
		EClass BINARY_LOGIC_EXPRESSION = eINSTANCE.getBinaryLogicExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_LOGIC_EXPRESSION__OPERATOR = eINSTANCE.getBinaryLogicExpression_Operator();

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
		 * The meta object literal for the '<em><b>Assign Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ASSIGN_EXPRESSION = eINSTANCE.getAssignment_AssignExpression();

		/**
		 * The meta object literal for the '<em><b>Increment Decrement Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR = eINSTANCE.getAssignment_IncrementDecrementOperator();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAssignment_Attribute();

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
		 * The meta object literal for the '<em><b>Initalize Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__INITALIZE_EXPRESSION = eINSTANCE.getForLoop_InitalizeExpression();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AttributeExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getAttributeExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_EXPRESSION = eINSTANCE.getAttributeExpression();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_EXPRESSION__ATTRIBUTE = eINSTANCE.getAttributeExpression_Attribute();

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
		 * The meta object literal for the '<em><b>Parameter Values For Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__PARAMETER_VALUES_FOR_BINDING = eINSTANCE.getOperationCall_ParameterValuesForBinding();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator <em>Logic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.LogicOperator
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getLogicOperator()
		 * @generated
		 */
		EEnum LOGIC_OPERATOR = eINSTANCE.getLogicOperator();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparingOperator <em>Comparing Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparingOperator
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getComparingOperator()
		 * @generated
		 */
		EEnum COMPARING_OPERATOR = eINSTANCE.getComparingOperator();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ComparisonOperator
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator
		 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ActionLanguagePackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

	}

} //ActionLanguagePackage
