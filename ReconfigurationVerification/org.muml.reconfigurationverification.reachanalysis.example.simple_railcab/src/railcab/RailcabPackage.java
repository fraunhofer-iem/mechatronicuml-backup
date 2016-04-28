/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package railcab;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see railcab.RailcabFactory
 * @model kind="package"
 * @generated
 */
public interface RailcabPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "railcab";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/example/railcab/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "railcab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailcabPackage eINSTANCE = railcab.impl.RailcabPackageImpl.init();

	/**
	 * The meta object id for the '{@link railcab.impl.RailCabImpl <em>Rail Cab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railcab.impl.RailCabImpl
	 * @see railcab.impl.RailcabPackageImpl#getRailCab()
	 * @generated
	 */
	int RAIL_CAB = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_CAB__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_CAB__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_CAB__MEMBER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Section Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_CAB__SECTION_CONTROL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Leader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_CAB__IS_LEADER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_CAB__LEADER = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rail Cab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_CAB_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link railcab.impl.SectionControlImpl <em>Section Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railcab.impl.SectionControlImpl
	 * @see railcab.impl.RailcabPackageImpl#getSectionControl()
	 * @generated
	 */
	int SECTION_CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_CONTROL__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_CONTROL__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Railcabs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_CONTROL__RAILCABS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_CONTROL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link railcab.RailCab <em>Rail Cab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail Cab</em>'.
	 * @see railcab.RailCab
	 * @generated
	 */
	EClass getRailCab();

	/**
	 * Returns the meta object for the reference list '{@link railcab.RailCab#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see railcab.RailCab#getMember()
	 * @see #getRailCab()
	 * @generated
	 */
	EReference getRailCab_Member();

	/**
	 * Returns the meta object for the reference '{@link railcab.RailCab#getSectionControl <em>Section Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section Control</em>'.
	 * @see railcab.RailCab#getSectionControl()
	 * @see #getRailCab()
	 * @generated
	 */
	EReference getRailCab_SectionControl();

	/**
	 * Returns the meta object for the attribute '{@link railcab.RailCab#isIsLeader <em>Is Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leader</em>'.
	 * @see railcab.RailCab#isIsLeader()
	 * @see #getRailCab()
	 * @generated
	 */
	EAttribute getRailCab_IsLeader();

	/**
	 * Returns the meta object for the reference '{@link railcab.RailCab#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leader</em>'.
	 * @see railcab.RailCab#getLeader()
	 * @see #getRailCab()
	 * @generated
	 */
	EReference getRailCab_Leader();

	/**
	 * Returns the meta object for class '{@link railcab.SectionControl <em>Section Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Control</em>'.
	 * @see railcab.SectionControl
	 * @generated
	 */
	EClass getSectionControl();

	/**
	 * Returns the meta object for the reference list '{@link railcab.SectionControl#getRailcabs <em>Railcabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Railcabs</em>'.
	 * @see railcab.SectionControl#getRailcabs()
	 * @see #getSectionControl()
	 * @generated
	 */
	EReference getSectionControl_Railcabs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RailcabFactory getRailcabFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link railcab.impl.RailCabImpl <em>Rail Cab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railcab.impl.RailCabImpl
		 * @see railcab.impl.RailcabPackageImpl#getRailCab()
		 * @generated
		 */
		EClass RAIL_CAB = eINSTANCE.getRailCab();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_CAB__MEMBER = eINSTANCE.getRailCab_Member();

		/**
		 * The meta object literal for the '<em><b>Section Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_CAB__SECTION_CONTROL = eINSTANCE.getRailCab_SectionControl();

		/**
		 * The meta object literal for the '<em><b>Is Leader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAIL_CAB__IS_LEADER = eINSTANCE.getRailCab_IsLeader();

		/**
		 * The meta object literal for the '<em><b>Leader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_CAB__LEADER = eINSTANCE.getRailCab_Leader();

		/**
		 * The meta object literal for the '{@link railcab.impl.SectionControlImpl <em>Section Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railcab.impl.SectionControlImpl
		 * @see railcab.impl.RailcabPackageImpl#getSectionControl()
		 * @generated
		 */
		EClass SECTION_CONTROL = eINSTANCE.getSectionControl();

		/**
		 * The meta object literal for the '<em><b>Railcabs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_CONTROL__RAILCABS = eINSTANCE.getSectionControl_Railcabs();

	}

} //RailcabPackage
