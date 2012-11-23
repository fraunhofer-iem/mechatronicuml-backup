/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.msgiface.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageTypeRepository;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifaceFactory;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MsgifaceFactoryImpl extends EFactoryImpl implements MsgifaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MsgifaceFactory init() {
		try {
			MsgifaceFactory theMsgifaceFactory = (MsgifaceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/model/msgiface/0.3.2"); 
			if (theMsgifaceFactory != null) {
				return theMsgifaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MsgifaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgifaceFactoryImpl() {
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
			case MsgifacePackage.MESSAGE_TYPE: return createMessageType();
			case MsgifacePackage.MESSAGE_TYPE_REPOSITORY: return createMessageTypeRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeRepository createMessageTypeRepository() {
		MessageTypeRepositoryImpl messageTypeRepository = new MessageTypeRepositoryImpl();
		return messageTypeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgifacePackage getMsgifacePackage() {
		return (MsgifacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MsgifacePackage getPackage() {
		return MsgifacePackage.eINSTANCE;
	}

} //MsgifaceFactoryImpl
