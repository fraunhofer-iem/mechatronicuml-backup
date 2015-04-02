/**
 */
package de.fraunhofer.iem.m4a.IEC61131.impl;

import de.fraunhofer.iem.m4a.IEC61131.*;

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
public class IEC61131FactoryImpl extends EFactoryImpl implements IEC61131Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IEC61131Factory init() {
		try {
			IEC61131Factory theIEC61131Factory = (IEC61131Factory)EPackage.Registry.INSTANCE.getEFactory(IEC61131Package.eNS_URI);
			if (theIEC61131Factory != null) {
				return theIEC61131Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IEC61131FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61131FactoryImpl() {
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
			case IEC61131Package.IEC61131: return createIEC61131();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61131 createIEC61131() {
		IEC61131Impl iec61131 = new IEC61131Impl();
		return iec61131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61131Package getIEC61131Package() {
		return (IEC61131Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IEC61131Package getPackage() {
		return IEC61131Package.eINSTANCE;
	}

} //IEC61131FactoryImpl
