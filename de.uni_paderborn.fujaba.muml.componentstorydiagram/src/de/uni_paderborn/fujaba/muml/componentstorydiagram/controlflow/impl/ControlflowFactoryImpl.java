/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControlflowFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControlflowPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControllerExchangeNode;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlflowFactoryImpl extends EFactoryImpl implements ControlflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlflowFactory init() {
		try {
			ControlflowFactory theControlflowFactory = (ControlflowFactory)EPackage.Registry.INSTANCE.getEFactory(ControlflowPackage.eNS_URI);
			if (theControlflowFactory != null) {
				return theControlflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControlflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowFactoryImpl() {
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
			case ControlflowPackage.COMPONENT_STORY_RULE: return createComponentStoryRule();
			case ControlflowPackage.COMPONENT_STORY_NODE: return createComponentStoryNode();
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE: return createControllerExchangeNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryRule createComponentStoryRule() {
		ComponentStoryRuleImpl componentStoryRule = new ComponentStoryRuleImpl();
		return componentStoryRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryNode createComponentStoryNode() {
		ComponentStoryNodeImpl componentStoryNode = new ComponentStoryNodeImpl();
		return componentStoryNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerExchangeNode createControllerExchangeNode() {
		ControllerExchangeNodeImpl controllerExchangeNode = new ControllerExchangeNodeImpl();
		return controllerExchangeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowPackage getControlflowPackage() {
		return (ControlflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ControlflowPackage getPackage() {
		return ControlflowPackage.eINSTANCE;
	}

} //ControlflowFactoryImpl
