/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			ControlflowFactory theControlflowFactory = (ControlflowFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/componentstorydiagram/controlflow/0.3.0"); 
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ControlflowPackage.CONTROLLER_EXCHANGE_STRATEGY:
				return createControllerExchangeStrategyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ControlflowPackage.CONTROLLER_EXCHANGE_STRATEGY:
				return convertControllerExchangeStrategyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public ControllerExchangeStrategy createControllerExchangeStrategyFromString(EDataType eDataType, String initialValue) {
		ControllerExchangeStrategy result = ControllerExchangeStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControllerExchangeStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
