/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.*;

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
public class ComponentinstanceconfigurationFactoryImpl extends EFactoryImpl implements ComponentinstanceconfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentinstanceconfigurationFactory init() {
		try {
			ComponentinstanceconfigurationFactory theComponentinstanceconfigurationFactory = (ComponentinstanceconfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/umlrt/componentinstanceconfiguration"); 
			if (theComponentinstanceconfigurationFactory != null) {
				return theComponentinstanceconfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentinstanceconfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentinstanceconfigurationFactoryImpl() {
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
			case ComponentinstanceconfigurationPackage.COMPONENT_INSTANCE_CONFIGURATION: return createComponentInstanceConfiguration();
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
	public ComponentinstanceconfigurationPackage getComponentinstanceconfigurationPackage() {
		return (ComponentinstanceconfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentinstanceconfigurationPackage getPackage() {
		return ComponentinstanceconfigurationPackage.eINSTANCE;
	}

} //ComponentinstanceconfigurationFactoryImpl
