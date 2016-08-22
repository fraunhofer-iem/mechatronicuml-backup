/**
 */
package org.muml.core.expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;

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
 * <!-- begin-model-doc -->
 * The base package for all expressions that can be used for modeling activities and patterns.
 * <!-- end-model-doc -->
 * @see org.muml.core.expressions.ExpressionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/core/expressions/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = org.muml.core.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.core.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.expressions.impl.ExpressionImpl
	 * @see org.muml.core.expressions.impl.ExpressionsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ECLASS = CorePackage.COMMENTABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EIS_PROXY = CorePackage.COMMENTABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ERESOURCE = CorePackage.COMMENTABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ECONTAINER = CorePackage.COMMENTABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ECONTAINING_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ECONTAINMENT_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ECONTENTS = CorePackage.COMMENTABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EALL_CONTENTS = CorePackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ECROSS_REFERENCES = CorePackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EGET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EUNSET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EINVOKE__EOPERATION_ELIST = CorePackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.core.expressions.impl.TextualExpressionImpl <em>Textual Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.expressions.impl.TextualExpressionImpl
	 * @see org.muml.core.expressions.impl.ExpressionsPackageImpl#getTextualExpression()
	 * @generated
	 */
	int TEXTUAL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__EXTENSIONS = EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Expression Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__EXPRESSION_TEXT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__LANGUAGE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION__LANGUAGE_VERSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Textual Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___ECLASS = EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___EIS_PROXY = EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___ERESOURCE = EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___ECONTAINER = EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___ECONTAINING_FEATURE = EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___ECONTAINMENT_FEATURE = EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___ECONTENTS = EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___EALL_CONTENTS = EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___ECROSS_REFERENCES = EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___EGET__ESTRUCTURALFEATURE = EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___EINVOKE__EOPERATION_ELIST = EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION___GET_EXTENSION__ECLASS = EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Textual Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.core.expressions.impl.ExpressionTextImpl <em>Expression Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.expressions.impl.ExpressionTextImpl
	 * @see org.muml.core.expressions.impl.ExpressionsPackageImpl#getExpressionText()
	 * @generated
	 */
	int EXPRESSION_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEXT__GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEXT__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEXT__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Expression Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Expression Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TEXT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.core.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.muml.core.expressions.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.core.expressions.TextualExpression <em>Textual Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Expression</em>'.
	 * @see org.muml.core.expressions.TextualExpression
	 * @generated
	 */
	EClass getTextualExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.expressions.TextualExpression#getExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Text</em>'.
	 * @see org.muml.core.expressions.TextualExpression#getExpressionText()
	 * @see #getTextualExpression()
	 * @generated
	 */
	EAttribute getTextualExpression_ExpressionText();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.expressions.TextualExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.muml.core.expressions.TextualExpression#getLanguage()
	 * @see #getTextualExpression()
	 * @generated
	 */
	EAttribute getTextualExpression_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.expressions.TextualExpression#getLanguageVersion <em>Language Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Version</em>'.
	 * @see org.muml.core.expressions.TextualExpression#getLanguageVersion()
	 * @see #getTextualExpression()
	 * @generated
	 */
	EAttribute getTextualExpression_LanguageVersion();

	/**
	 * Returns the meta object for class '{@link org.muml.core.expressions.ExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Text</em>'.
	 * @see org.muml.core.expressions.ExpressionText
	 * @generated
	 */
	EClass getExpressionText();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.expressions.ExpressionText#getGrammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grammar</em>'.
	 * @see org.muml.core.expressions.ExpressionText#getGrammar()
	 * @see #getExpressionText()
	 * @generated
	 */
	EAttribute getExpressionText_Grammar();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.expressions.ExpressionText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.muml.core.expressions.ExpressionText#getText()
	 * @see #getExpressionText()
	 * @generated
	 */
	EAttribute getExpressionText_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.core.expressions.ExpressionText#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.muml.core.expressions.ExpressionText#getExpression()
	 * @see #getExpressionText()
	 * @generated
	 */
	EReference getExpressionText_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

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
		 * The meta object literal for the '{@link org.muml.core.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.expressions.impl.ExpressionImpl
		 * @see org.muml.core.expressions.impl.ExpressionsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.muml.core.expressions.impl.TextualExpressionImpl <em>Textual Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.expressions.impl.TextualExpressionImpl
		 * @see org.muml.core.expressions.impl.ExpressionsPackageImpl#getTextualExpression()
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
		 * The meta object literal for the '{@link org.muml.core.expressions.impl.ExpressionTextImpl <em>Expression Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.expressions.impl.ExpressionTextImpl
		 * @see org.muml.core.expressions.impl.ExpressionsPackageImpl#getExpressionText()
		 * @generated
		 */
		EClass EXPRESSION_TEXT = eINSTANCE.getExpressionText();

		/**
		 * The meta object literal for the '<em><b>Grammar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_TEXT__GRAMMAR = eINSTANCE.getExpressionText_Grammar();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_TEXT__TEXT = eINSTANCE.getExpressionText_Text();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TEXT__EXPRESSION = eINSTANCE.getExpressionText_Expression();

	}

} //ExpressionsPackage
