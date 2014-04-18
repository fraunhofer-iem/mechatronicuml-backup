/**
 */
package de.uni_paderborn.fujaba.muml.hardware.impl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;

import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.muml.hardware.HardwareFactory;
import de.uni_paderborn.fujaba.muml.hardware.HardwarePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.HwresourcePackageImpl;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;

import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;

import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.types.TypesPackage;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwarePackageImpl extends EPackageImpl implements HardwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEstEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_paderborn.fujaba.muml.hardware.HardwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HardwarePackageImpl() {
		super(eNS_URI, HardwareFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HardwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HardwarePackage init() {
		if (isInited) return (HardwarePackage)EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI);

		// Obtain or create and register package
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HardwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		HwplatformPackageImpl theHwplatformPackage = (HwplatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI) instanceof HwplatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI) : HwplatformPackage.eINSTANCE);
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) : HwvaluetypePackage.eINSTANCE);
		HwplatforminstancePackageImpl theHwplatforminstancePackage = (HwplatforminstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI) instanceof HwplatforminstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI) : HwplatforminstancePackage.eINSTANCE);
		HwresourcePackageImpl theHwresourcePackage = (HwresourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) instanceof HwresourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) : HwresourcePackage.eINSTANCE);
		HwresourceinstancePackageImpl theHwresourceinstancePackage = (HwresourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) instanceof HwresourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) : HwresourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theHardwarePackage.createPackageContents();
		theHwplatformPackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();
		theHwplatforminstancePackage.createPackageContents();
		theHwresourcePackage.createPackageContents();
		theHwresourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theHardwarePackage.initializePackageContents();
		theHwplatformPackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();
		theHwplatforminstancePackage.initializePackageContents();
		theHwresourcePackage.initializePackageContents();
		theHwresourceinstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHardwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HardwarePackage.eNS_URI, theHardwarePackage);
		return theHardwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEst() {
		return tEstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareFactory getHardwareFactory() {
		return (HardwareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tEstEClass = createEClass(TEST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		HwplatformPackage theHwplatformPackage = (HwplatformPackage)EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);
		HwplatforminstancePackage theHwplatforminstancePackage = (HwplatforminstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI);
		HwresourcePackage theHwresourcePackage = (HwresourcePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI);
		HwresourceinstancePackage theHwresourceinstancePackage = (HwresourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theHwplatformPackage);
		getESubpackages().add(theHwvaluetypePackage);
		getESubpackages().add(theHwplatforminstancePackage);
		getESubpackages().add(theHwresourcePackage);
		getESubpackages().add(theHwresourceinstancePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters

		// Create resource
		createResource(eNS_URI);
	}

} //HardwarePackageImpl
