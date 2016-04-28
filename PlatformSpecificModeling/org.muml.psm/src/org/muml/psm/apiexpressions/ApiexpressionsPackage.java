/**
 */
package org.muml.psm.apiexpressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.expressions.ExpressionsPackage;

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
 * This package contains all expressions, which are used to model a call of an api-command with actual parameters.
 * <!-- end-model-doc -->
 * @see org.muml.psm.apiexpressions.ApiexpressionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ApiexpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apiexpressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/apiexpressions/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apiexpressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApiexpressionsPackage eINSTANCE = org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.apiexpressions.impl.APICallExpressionImpl <em>API Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.apiexpressions.impl.APICallExpressionImpl
	 * @see org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl#getAPICallExpression()
	 * @generated
	 */
	int API_CALL_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_EXPRESSION__EXTENSIONS = ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Api Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_EXPRESSION__API_COMMAND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_EXPRESSION__PARAMETER_BINDINGS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>API Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_EXPRESSION___GET_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>API Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.apiexpressions.impl.EnumerationValueExpressionImpl <em>Enumeration Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.apiexpressions.impl.EnumerationValueExpressionImpl
	 * @see org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl#getEnumerationValueExpression()
	 * @generated
	 */
	int ENUMERATION_VALUE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_EXPRESSION__EXTENSIONS = ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_EXPRESSION__ENUM_VALUE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_EXPRESSION___GET_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Enumeration Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.apiexpressions.impl.ContinuousPortExpressionImpl <em>Continuous Port Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.apiexpressions.impl.ContinuousPortExpressionImpl
	 * @see org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl#getContinuousPortExpression()
	 * @generated
	 */
	int CONTINUOUS_PORT_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_EXPRESSION__EXTENSIONS = ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continuous Port Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_EXPRESSION___GET_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Continuous Port Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.apiexpressions.APICallExpression <em>API Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Call Expression</em>'.
	 * @see org.muml.psm.apiexpressions.APICallExpression
	 * @generated
	 */
	EClass getAPICallExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.apiexpressions.APICallExpression#getApiCommand <em>Api Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Api Command</em>'.
	 * @see org.muml.psm.apiexpressions.APICallExpression#getApiCommand()
	 * @see #getAPICallExpression()
	 * @generated
	 */
	EReference getAPICallExpression_ApiCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.apiexpressions.APICallExpression#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see org.muml.psm.apiexpressions.APICallExpression#getParameterBindings()
	 * @see #getAPICallExpression()
	 * @generated
	 */
	EReference getAPICallExpression_ParameterBindings();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.apiexpressions.EnumerationValueExpression <em>Enumeration Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Value Expression</em>'.
	 * @see org.muml.psm.apiexpressions.EnumerationValueExpression
	 * @generated
	 */
	EClass getEnumerationValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.apiexpressions.EnumerationValueExpression#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Value</em>'.
	 * @see org.muml.psm.apiexpressions.EnumerationValueExpression#getEnumValue()
	 * @see #getEnumerationValueExpression()
	 * @generated
	 */
	EReference getEnumerationValueExpression_EnumValue();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.apiexpressions.ContinuousPortExpression <em>Continuous Port Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Port Expression</em>'.
	 * @see org.muml.psm.apiexpressions.ContinuousPortExpression
	 * @generated
	 */
	EClass getContinuousPortExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.apiexpressions.ContinuousPortExpression#getContinuousPort <em>Continuous Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continuous Port</em>'.
	 * @see org.muml.psm.apiexpressions.ContinuousPortExpression#getContinuousPort()
	 * @see #getContinuousPortExpression()
	 * @generated
	 */
	EReference getContinuousPortExpression_ContinuousPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApiexpressionsFactory getApiexpressionsFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.apiexpressions.impl.APICallExpressionImpl <em>API Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.apiexpressions.impl.APICallExpressionImpl
		 * @see org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl#getAPICallExpression()
		 * @generated
		 */
		EClass API_CALL_EXPRESSION = eINSTANCE.getAPICallExpression();

		/**
		 * The meta object literal for the '<em><b>Api Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_CALL_EXPRESSION__API_COMMAND = eINSTANCE.getAPICallExpression_ApiCommand();

		/**
		 * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_CALL_EXPRESSION__PARAMETER_BINDINGS = eINSTANCE.getAPICallExpression_ParameterBindings();

		/**
		 * The meta object literal for the '{@link org.muml.psm.apiexpressions.impl.EnumerationValueExpressionImpl <em>Enumeration Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.apiexpressions.impl.EnumerationValueExpressionImpl
		 * @see org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl#getEnumerationValueExpression()
		 * @generated
		 */
		EClass ENUMERATION_VALUE_EXPRESSION = eINSTANCE.getEnumerationValueExpression();

		/**
		 * The meta object literal for the '<em><b>Enum Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_VALUE_EXPRESSION__ENUM_VALUE = eINSTANCE.getEnumerationValueExpression_EnumValue();

		/**
		 * The meta object literal for the '{@link org.muml.psm.apiexpressions.impl.ContinuousPortExpressionImpl <em>Continuous Port Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.apiexpressions.impl.ContinuousPortExpressionImpl
		 * @see org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl#getContinuousPortExpression()
		 * @generated
		 */
		EClass CONTINUOUS_PORT_EXPRESSION = eINSTANCE.getContinuousPortExpression();

		/**
		 * The meta object literal for the '<em><b>Continuous Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT = eINSTANCE.getContinuousPortExpression_ContinuousPort();

	}

} //ApiexpressionsPackage
