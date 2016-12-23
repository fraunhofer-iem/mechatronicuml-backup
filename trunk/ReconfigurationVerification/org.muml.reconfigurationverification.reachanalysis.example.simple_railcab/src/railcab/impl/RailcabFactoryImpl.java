/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package railcab.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import railcab.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailcabFactoryImpl extends EFactoryImpl implements RailcabFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RailcabFactory init() {
		try {
			RailcabFactory theRailcabFactory = (RailcabFactory)EPackage.Registry.INSTANCE.getEFactory(RailcabPackage.eNS_URI);
			if (theRailcabFactory != null) {
				return theRailcabFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RailcabFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailcabFactoryImpl() {
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
			case RailcabPackage.RAIL_CAB: return createRailCab();
			case RailcabPackage.SECTION_CONTROL: return createSectionControl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailCab createRailCab() {
		RailCabImpl railCab = new RailCabImpl();
		return railCab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionControl createSectionControl() {
		SectionControlImpl sectionControl = new SectionControlImpl();
		return sectionControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailcabPackage getRailcabPackage() {
		return (RailcabPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RailcabPackage getPackage() {
		return RailcabPackage.eINSTANCE;
	}

} //RailcabFactoryImpl
