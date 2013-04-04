/**
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentstorydiagramFactoryImpl extends EFactoryImpl implements ComponentstorydiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentstorydiagramFactory init() {
		try {
			ComponentstorydiagramFactory theComponentstorydiagramFactory = (ComponentstorydiagramFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/componentstorydiagram/0.3.1"); 
			if (theComponentstorydiagramFactory != null) {
				return theComponentstorydiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentstorydiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorydiagramFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorydiagramPackage getComponentstorydiagramPackage() {
		return (ComponentstorydiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentstorydiagramPackage getPackage() {
		return ComponentstorydiagramPackage.eINSTANCE;
	}

} //ComponentstorydiagramFactoryImpl
