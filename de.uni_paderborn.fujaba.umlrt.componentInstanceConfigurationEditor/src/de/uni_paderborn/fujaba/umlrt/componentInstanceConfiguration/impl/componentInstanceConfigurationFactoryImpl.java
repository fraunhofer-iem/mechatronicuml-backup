/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.impl;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.*;

import org.eclipse.emf.ecore.EClass;
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
public class componentInstanceConfigurationFactoryImpl extends EFactoryImpl implements componentInstanceConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static componentInstanceConfigurationFactory init() {
		try {
			componentInstanceConfigurationFactory thecomponentInstanceConfigurationFactory = (componentInstanceConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://de/uni_paderborn/fujaba/umlrt/componentInstanceConfiguration"); 
			if (thecomponentInstanceConfigurationFactory != null) {
				return thecomponentInstanceConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new componentInstanceConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentInstanceConfigurationFactoryImpl() {
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
			case componentInstanceConfigurationPackage.COMPONENT_INSTANCE_CONFIGURATION: return createComponentInstanceConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration createComponentInstanceConfiguration() {
		ComponentInstanceConfigurationImpl componentInstanceConfiguration = new ComponentInstanceConfigurationImpl();
		return componentInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentInstanceConfigurationPackage getcomponentInstanceConfigurationPackage() {
		return (componentInstanceConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static componentInstanceConfigurationPackage getPackage() {
		return componentInstanceConfigurationPackage.eINSTANCE;
	}

} //componentInstanceConfigurationFactoryImpl
