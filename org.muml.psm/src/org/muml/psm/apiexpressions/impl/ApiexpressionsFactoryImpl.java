/**
 */
package org.muml.psm.apiexpressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.psm.apiexpressions.APICallExpression;
import org.muml.psm.apiexpressions.ApiexpressionsFactory;
import org.muml.psm.apiexpressions.ApiexpressionsPackage;
import org.muml.psm.apiexpressions.ContinuousPortExpression;
import org.muml.psm.apiexpressions.EnumerationValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiexpressionsFactoryImpl extends EFactoryImpl implements ApiexpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApiexpressionsFactory init() {
		try {
			ApiexpressionsFactory theApiexpressionsFactory = (ApiexpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(ApiexpressionsPackage.eNS_URI);
			if (theApiexpressionsFactory != null) {
				return theApiexpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApiexpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiexpressionsFactoryImpl() {
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
			case ApiexpressionsPackage.API_CALL_EXPRESSION: return createAPICallExpression();
			case ApiexpressionsPackage.ENUMERATION_VALUE_EXPRESSION: return createEnumerationValueExpression();
			case ApiexpressionsPackage.CONTINUOUS_PORT_EXPRESSION: return createContinuousPortExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICallExpression createAPICallExpression() {
		APICallExpressionImpl apiCallExpression = new APICallExpressionImpl();
		return apiCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValueExpression createEnumerationValueExpression() {
		EnumerationValueExpressionImpl enumerationValueExpression = new EnumerationValueExpressionImpl();
		return enumerationValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPortExpression createContinuousPortExpression() {
		ContinuousPortExpressionImpl continuousPortExpression = new ContinuousPortExpressionImpl();
		return continuousPortExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiexpressionsPackage getApiexpressionsPackage() {
		return (ApiexpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApiexpressionsPackage getPackage() {
		return ApiexpressionsPackage.eINSTANCE;
	}

} //ApiexpressionsFactoryImpl
