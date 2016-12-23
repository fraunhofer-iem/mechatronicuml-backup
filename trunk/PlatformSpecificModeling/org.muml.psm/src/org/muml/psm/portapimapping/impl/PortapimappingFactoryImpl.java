/**
 */
package org.muml.psm.portapimapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.psm.portapimapping.MappingRepository;
import org.muml.psm.portapimapping.PortApiMapping;
import org.muml.psm.portapimapping.PortapimappingFactory;
import org.muml.psm.portapimapping.PortapimappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortapimappingFactoryImpl extends EFactoryImpl implements PortapimappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortapimappingFactory init() {
		try {
			PortapimappingFactory thePortapimappingFactory = (PortapimappingFactory)EPackage.Registry.INSTANCE.getEFactory(PortapimappingPackage.eNS_URI);
			if (thePortapimappingFactory != null) {
				return thePortapimappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PortapimappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortapimappingFactoryImpl() {
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
			case PortapimappingPackage.PORT_API_MAPPING: return createPortApiMapping();
			case PortapimappingPackage.MAPPING_REPOSITORY: return createMappingRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortApiMapping createPortApiMapping() {
		PortApiMappingImpl portApiMapping = new PortApiMappingImpl();
		return portApiMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRepository createMappingRepository() {
		MappingRepositoryImpl mappingRepository = new MappingRepositoryImpl();
		return mappingRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortapimappingPackage getPortapimappingPackage() {
		return (PortapimappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PortapimappingPackage getPackage() {
		return PortapimappingPackage.eINSTANCE;
	}

} //PortapimappingFactoryImpl
