/**
 */
package org.muml.psm.properties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.psm.properties.CANMessageFrame;
import org.muml.psm.properties.MessageFrame;
import org.muml.psm.properties.PropertiesFactory;
import org.muml.psm.properties.PropertiesPackage;
import org.muml.psm.properties.RequiredMemory;
import org.muml.psm.properties.Scheduling;
import org.muml.psm.properties.WCET;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesFactoryImpl extends EFactoryImpl implements PropertiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertiesFactory init() {
		try {
			PropertiesFactory thePropertiesFactory = (PropertiesFactory)EPackage.Registry.INSTANCE.getEFactory(PropertiesPackage.eNS_URI);
			if (thePropertiesFactory != null) {
				return thePropertiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PropertiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesFactoryImpl() {
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
			case PropertiesPackage.WCET: return createWCET();
			case PropertiesPackage.REQUIRED_MEMORY: return createRequiredMemory();
			case PropertiesPackage.SCHEDULING: return createScheduling();
			case PropertiesPackage.MESSAGE_FRAME: return createMessageFrame();
			case PropertiesPackage.CAN_MESSAGE_FRAME: return createCANMessageFrame();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WCET createWCET() {
		WCETImpl wcet = new WCETImpl();
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredMemory createRequiredMemory() {
		RequiredMemoryImpl requiredMemory = new RequiredMemoryImpl();
		return requiredMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduling createScheduling() {
		SchedulingImpl scheduling = new SchedulingImpl();
		return scheduling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFrame createMessageFrame() {
		MessageFrameImpl messageFrame = new MessageFrameImpl();
		return messageFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CANMessageFrame createCANMessageFrame() {
		CANMessageFrameImpl canMessageFrame = new CANMessageFrameImpl();
		return canMessageFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesPackage getPropertiesPackage() {
		return (PropertiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PropertiesPackage getPackage() {
		return PropertiesPackage.eINSTANCE;
	}

} //PropertiesFactoryImpl
