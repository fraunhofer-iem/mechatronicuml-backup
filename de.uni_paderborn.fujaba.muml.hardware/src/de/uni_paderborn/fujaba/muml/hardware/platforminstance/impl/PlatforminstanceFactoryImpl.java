/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstanceFactory;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatforminstanceFactoryImpl extends EFactoryImpl implements PlatforminstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatforminstanceFactory init() {
		try {
			PlatforminstanceFactory thePlatforminstanceFactory = (PlatforminstanceFactory)EPackage.Registry.INSTANCE.getEFactory(PlatforminstancePackage.eNS_URI);
			if (thePlatforminstanceFactory != null) {
				return thePlatforminstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatforminstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatforminstanceFactoryImpl() {
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
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE: return createHWPlatformInstance();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION: return createHWPlatformInstanceConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstance createHWPlatformInstance() {
		HWPlatformInstanceImpl hwPlatformInstance = new HWPlatformInstanceImpl();
		return hwPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration createHWPlatformInstanceConfiguration() {
		HWPlatformInstanceConfigurationImpl hwPlatformInstanceConfiguration = new HWPlatformInstanceConfigurationImpl();
		return hwPlatformInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatforminstancePackage getPlatforminstancePackage() {
		return (PlatforminstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatforminstancePackage getPackage() {
		return PlatforminstancePackage.eINSTANCE;
	}

} //PlatforminstanceFactoryImpl
