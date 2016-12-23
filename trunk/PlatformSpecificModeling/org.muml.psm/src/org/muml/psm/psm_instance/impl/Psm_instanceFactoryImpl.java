/**
 */
package org.muml.psm.psm_instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance;
import org.muml.psm.psm_instance.Psm_instanceFactory;
import org.muml.psm.psm_instance.Psm_instancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Psm_instanceFactoryImpl extends EFactoryImpl implements Psm_instanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Psm_instanceFactory init() {
		try {
			Psm_instanceFactory thePsm_instanceFactory = (Psm_instanceFactory)EPackage.Registry.INSTANCE.getEFactory(Psm_instancePackage.eNS_URI);
			if (thePsm_instanceFactory != null) {
				return thePsm_instanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Psm_instanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psm_instanceFactoryImpl() {
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
			case Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE: return createParameterisableDiscreteSinglePortInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterisableDiscreteSinglePortInstance createParameterisableDiscreteSinglePortInstance() {
		ParameterisableDiscreteSinglePortInstanceImpl parameterisableDiscreteSinglePortInstance = new ParameterisableDiscreteSinglePortInstanceImpl();
		return parameterisableDiscreteSinglePortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psm_instancePackage getPsm_instancePackage() {
		return (Psm_instancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Psm_instancePackage getPackage() {
		return Psm_instancePackage.eINSTANCE;
	}

} //Psm_instanceFactoryImpl
