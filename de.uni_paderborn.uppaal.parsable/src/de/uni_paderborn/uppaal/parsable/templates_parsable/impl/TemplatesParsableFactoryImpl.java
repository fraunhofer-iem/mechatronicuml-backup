/**
 */
package de.uni_paderborn.uppaal.parsable.templates_parsable.impl;

import de.uni_paderborn.uppaal.parsable.templates_parsable.*;

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
public class TemplatesParsableFactoryImpl extends EFactoryImpl implements TemplatesParsableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemplatesParsableFactory init() {
		try {
			TemplatesParsableFactory theTemplatesParsableFactory = (TemplatesParsableFactory)EPackage.Registry.INSTANCE.getEFactory(TemplatesParsablePackage.eNS_URI);
			if (theTemplatesParsableFactory != null) {
				return theTemplatesParsableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TemplatesParsableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplatesParsableFactoryImpl() {
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
			case TemplatesParsablePackage.IDENTIFIABLE_LOCATION: return createIdentifiableLocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableLocation createIdentifiableLocation() {
		IdentifiableLocationImpl identifiableLocation = new IdentifiableLocationImpl();
		return identifiableLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplatesParsablePackage getTemplatesParsablePackage() {
		return (TemplatesParsablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TemplatesParsablePackage getPackage() {
		return TemplatesParsablePackage.eINSTANCE;
	}

} //TemplatesParsableFactoryImpl
