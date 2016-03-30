/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.APICallParameter;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterFactory;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.TimeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartparameterFactoryImpl extends EFactoryImpl implements RealtimestatechartparameterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RealtimestatechartparameterFactory init() {
		try {
			RealtimestatechartparameterFactory theRealtimestatechartparameterFactory = (RealtimestatechartparameterFactory)EPackage.Registry.INSTANCE.getEFactory(RealtimestatechartparameterPackage.eNS_URI);
			if (theRealtimestatechartparameterFactory != null) {
				return theRealtimestatechartparameterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RealtimestatechartparameterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartparameterFactoryImpl() {
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
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER: return createAPICallParameter();
			case RealtimestatechartparameterPackage.TIME_PARAMETER: return createTimeParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICallParameter createAPICallParameter() {
		APICallParameterImpl apiCallParameter = new APICallParameterImpl();
		return apiCallParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeParameter createTimeParameter() {
		TimeParameterImpl timeParameter = new TimeParameterImpl();
		return timeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartparameterPackage getRealtimestatechartparameterPackage() {
		return (RealtimestatechartparameterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RealtimestatechartparameterPackage getPackage() {
		return RealtimestatechartparameterPackage.eINSTANCE;
	}

} //RealtimestatechartparameterFactoryImpl
