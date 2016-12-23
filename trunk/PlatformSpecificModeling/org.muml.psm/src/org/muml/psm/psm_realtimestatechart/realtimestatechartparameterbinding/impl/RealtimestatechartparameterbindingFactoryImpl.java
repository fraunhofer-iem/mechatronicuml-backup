/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingFactory;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartparameterbindingFactoryImpl extends EFactoryImpl implements RealtimestatechartparameterbindingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RealtimestatechartparameterbindingFactory init() {
		try {
			RealtimestatechartparameterbindingFactory theRealtimestatechartparameterbindingFactory = (RealtimestatechartparameterbindingFactory)EPackage.Registry.INSTANCE.getEFactory(RealtimestatechartparameterbindingPackage.eNS_URI);
			if (theRealtimestatechartparameterbindingFactory != null) {
				return theRealtimestatechartparameterbindingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RealtimestatechartparameterbindingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartparameterbindingFactoryImpl() {
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
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING: return createAPICallParameterBinding();
			case RealtimestatechartparameterbindingPackage.TIME_PARAMETER_BINDING: return createTimeParameterBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICallParameterBinding createAPICallParameterBinding() {
		APICallParameterBindingImpl apiCallParameterBinding = new APICallParameterBindingImpl();
		return apiCallParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeParameterBinding createTimeParameterBinding() {
		TimeParameterBindingImpl timeParameterBinding = new TimeParameterBindingImpl();
		return timeParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartparameterbindingPackage getRealtimestatechartparameterbindingPackage() {
		return (RealtimestatechartparameterbindingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RealtimestatechartparameterbindingPackage getPackage() {
		return RealtimestatechartparameterbindingPackage.eINSTANCE;
	}

} //RealtimestatechartparameterbindingFactoryImpl
