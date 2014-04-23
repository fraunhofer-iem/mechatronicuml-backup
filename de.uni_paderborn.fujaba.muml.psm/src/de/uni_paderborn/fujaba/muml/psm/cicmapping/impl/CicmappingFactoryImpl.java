/**
 */
package de.uni_paderborn.fujaba.muml.psm.cicmapping.impl;

import de.uni_paderborn.fujaba.muml.psm.cicmapping.*;

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
public class CicmappingFactoryImpl extends EFactoryImpl implements CicmappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CicmappingFactory init() {
		try {
			CicmappingFactory theCicmappingFactory = (CicmappingFactory)EPackage.Registry.INSTANCE.getEFactory(CicmappingPackage.eNS_URI);
			if (theCicmappingFactory != null) {
				return theCicmappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CicmappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CicmappingFactoryImpl() {
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
			case CicmappingPackage.CIC_SYSTEM_MAPPING: return createCICSystemMapping();
			case CicmappingPackage.CIC_MAPPING: return createCICMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICSystemMapping createCICSystemMapping() {
		CICSystemMappingImpl cicSystemMapping = new CICSystemMappingImpl();
		return cicSystemMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICMapping createCICMapping() {
		CICMappingImpl cicMapping = new CICMappingImpl();
		return cicMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CicmappingPackage getCicmappingPackage() {
		return (CicmappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CicmappingPackage getPackage() {
		return CicmappingPackage.eINSTANCE;
	}

} //CicmappingFactoryImpl
