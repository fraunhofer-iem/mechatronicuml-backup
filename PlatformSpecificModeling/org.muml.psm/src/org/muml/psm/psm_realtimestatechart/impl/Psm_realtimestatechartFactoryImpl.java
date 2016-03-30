/**
 */
package org.muml.psm.psm_realtimestatechart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.psm.psm_realtimestatechart.APICall;
import org.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartFactory;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Psm_realtimestatechartFactoryImpl extends EFactoryImpl implements Psm_realtimestatechartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Psm_realtimestatechartFactory init() {
		try {
			Psm_realtimestatechartFactory thePsm_realtimestatechartFactory = (Psm_realtimestatechartFactory)EPackage.Registry.INSTANCE.getEFactory(Psm_realtimestatechartPackage.eNS_URI);
			if (thePsm_realtimestatechartFactory != null) {
				return thePsm_realtimestatechartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Psm_realtimestatechartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psm_realtimestatechartFactoryImpl() {
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
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART: return createParameterizedRealtimeStatechart();
			case Psm_realtimestatechartPackage.API_CALL: return createAPICall();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedRealtimeStatechart createParameterizedRealtimeStatechart() {
		ParameterizedRealtimeStatechartImpl parameterizedRealtimeStatechart = new ParameterizedRealtimeStatechartImpl();
		return parameterizedRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICall createAPICall() {
		APICallImpl apiCall = new APICallImpl();
		return apiCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psm_realtimestatechartPackage getPsm_realtimestatechartPackage() {
		return (Psm_realtimestatechartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Psm_realtimestatechartPackage getPackage() {
		return Psm_realtimestatechartPackage.eINSTANCE;
	}

} //Psm_realtimestatechartFactoryImpl
