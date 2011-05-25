/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl;

import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorFactory;
import de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageinterfaceeditorFactoryImpl extends EFactoryImpl implements MessageinterfaceeditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageinterfaceeditorFactory init() {
		try {
			MessageinterfaceeditorFactory theMessageinterfaceeditorFactory = (MessageinterfaceeditorFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/umlrt/messageinterfaceeditor"); 
			if (theMessageinterfaceeditorFactory != null) {
				return theMessageinterfaceeditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MessageinterfaceeditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageinterfaceeditorFactoryImpl() {
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
			case MessageinterfaceeditorPackage.MESSAGE_INTERFACE_DIAGRAM: return createMessageInterfaceDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterfaceDiagram createMessageInterfaceDiagram() {
		MessageInterfaceDiagramImpl messageInterfaceDiagram = new MessageInterfaceDiagramImpl();
		return messageInterfaceDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageinterfaceeditorPackage getMessageinterfaceeditorPackage() {
		return (MessageinterfaceeditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MessageinterfaceeditorPackage getPackage() {
		return MessageinterfaceeditorPackage.eINSTANCE;
	}

} //MessageinterfaceeditorFactoryImpl
