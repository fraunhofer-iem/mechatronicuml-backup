/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.simulink.msglib.CommunicationSwitch;
import org.muml.simulink.msglib.LinkLayer;
import org.muml.simulink.msglib.MsglibFactory;
import org.muml.simulink.msglib.MsglibPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MsglibFactoryImpl extends EFactoryImpl implements MsglibFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MsglibFactory init() {
		try {
			MsglibFactory theMsglibFactory = (MsglibFactory)EPackage.Registry.INSTANCE.getEFactory(MsglibPackage.eNS_URI);
			if (theMsglibFactory != null) {
				return theMsglibFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MsglibFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsglibFactoryImpl() {
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
			case MsglibPackage.COMMUNICATION_SWITCH: return (EObject)createCommunicationSwitch();
			case MsglibPackage.LINK_LAYER: return (EObject)createLinkLayer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSwitch createCommunicationSwitch() {
		CommunicationSwitchImpl communicationSwitch = new CommunicationSwitchImpl();
		return communicationSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkLayer createLinkLayer() {
		LinkLayerImpl linkLayer = new LinkLayerImpl();
		return linkLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsglibPackage getMsglibPackage() {
		return (MsglibPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MsglibPackage getPackage() {
		return MsglibPackage.eINSTANCE;
	}

} //MsglibFactoryImpl
