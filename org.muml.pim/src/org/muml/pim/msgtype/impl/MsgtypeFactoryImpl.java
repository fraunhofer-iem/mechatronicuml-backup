/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.msgtype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.msgtype.MsgtypeFactory;
import org.muml.pim.msgtype.MsgtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MsgtypeFactoryImpl extends EFactoryImpl implements MsgtypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MsgtypeFactory init() {
		try {
			MsgtypeFactory theMsgtypeFactory = (MsgtypeFactory)EPackage.Registry.INSTANCE.getEFactory(MsgtypePackage.eNS_URI);
			if (theMsgtypeFactory != null) {
				return theMsgtypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MsgtypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgtypeFactoryImpl() {
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
			case MsgtypePackage.MESSAGE_TYPE: return createMessageType();
			case MsgtypePackage.MESSAGE_TYPE_REPOSITORY: return createMessageTypeRepository();
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
	public MsgtypePackage getMsgtypePackage() {
		return (MsgtypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MsgtypePackage getPackage() {
		return MsgtypePackage.eINSTANCE;
	}

} //MsgtypeFactoryImpl
