/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorFactory
 * @model kind="package"
 * @generated
 */
public interface MessageinterfaceeditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "messageinterfaceeditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/messageinterfaceeditor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "messageinterfaceeditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessageinterfaceeditorPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageinterfaceeditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageInterfaceDiagramImpl <em>Message Interface Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageInterfaceDiagramImpl
	 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageinterfaceeditorPackageImpl#getMessageInterfaceDiagram()
	 * @generated
	 */
	int MESSAGE_INTERFACE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Message Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE_DIAGRAM__MESSAGE_INTERFACES = 0;

	/**
	 * The number of structural features of the '<em>Message Interface Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INTERFACE_DIAGRAM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram <em>Message Interface Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Interface Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram
	 * @generated
	 */
	EClass getMessageInterfaceDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram#getMessageInterfaces <em>Message Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Interfaces</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram#getMessageInterfaces()
	 * @see #getMessageInterfaceDiagram()
	 * @generated
	 */
	EReference getMessageInterfaceDiagram_MessageInterfaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MessageinterfaceeditorFactory getMessageinterfaceeditorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageInterfaceDiagramImpl <em>Message Interface Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageInterfaceDiagramImpl
		 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageinterfaceeditorPackageImpl#getMessageInterfaceDiagram()
		 * @generated
		 */
		EClass MESSAGE_INTERFACE_DIAGRAM = eINSTANCE.getMessageInterfaceDiagram();

		/**
		 * The meta object literal for the '<em><b>Message Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_INTERFACE_DIAGRAM__MESSAGE_INTERFACES = eINSTANCE.getMessageInterfaceDiagram_MessageInterfaces();

	}

} //MessageinterfaceeditorPackage
