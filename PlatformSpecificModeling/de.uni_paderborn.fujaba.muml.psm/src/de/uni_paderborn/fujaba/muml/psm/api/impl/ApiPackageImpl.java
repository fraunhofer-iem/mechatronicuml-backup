/**
 */
package de.uni_paderborn.fujaba.muml.psm.api.impl;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;

import de.uni_paderborn.fujaba.muml.psm.PsmPackage;

import de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage;

import de.uni_paderborn.fujaba.muml.psm.allocation.impl.AllocationPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.api.ApiFactory;
import de.uni_paderborn.fujaba.muml.psm.api.ApiPackage;

import de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.ApiexpressionsPackage;

import de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.impl.ApiexpressionsPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.api.portapimapping.PortapimappingPackage;

import de.uni_paderborn.fujaba.muml.psm.api.portapimapping.impl.PortapimappingPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.impl.PsmPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.psm.instance.impl.InstancePackageImpl;

import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage;

import de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.impl.RealtimestatechartPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.swplatform.SwplatformPackage;

import de.uni_paderborn.fujaba.muml.psm.swplatform.impl.SwplatformPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiPackageImpl extends EPackageImpl implements ApiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apitestEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.psm.api.ApiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApiPackageImpl() {
		super(eNS_URI, ApiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApiPackage init() {
		if (isInited) return (ApiPackage)EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI);

		// Obtain or create and register package
		ApiPackageImpl theApiPackage = (ApiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionlanguagePackage.eINSTANCE.eClass();
		HwplatformPackage.eINSTANCE.eClass();
		HwvaluetypePackage.eINSTANCE.eClass();
		HwplatforminstancePackage.eINSTANCE.eClass();
		HwresourcePackage.eINSTANCE.eClass();
		HwresourceinstancePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) instanceof PsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) : PsmPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) : PropertiesPackage.eINSTANCE);
		SwplatformPackageImpl theSwplatformPackage = (SwplatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SwplatformPackage.eNS_URI) instanceof SwplatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SwplatformPackage.eNS_URI) : SwplatformPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		RealtimestatechartparameterPackageImpl theRealtimestatechartparameterPackage = (RealtimestatechartparameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) instanceof RealtimestatechartparameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) : RealtimestatechartparameterPackage.eINSTANCE);
		RealtimestatechartparameterbindingPackageImpl theRealtimestatechartparameterbindingPackage = (RealtimestatechartparameterbindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) instanceof RealtimestatechartparameterbindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) : RealtimestatechartparameterbindingPackage.eINSTANCE);
		PortapimappingPackageImpl thePortapimappingPackage = (PortapimappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) instanceof PortapimappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) : PortapimappingPackage.eINSTANCE);
		ApiexpressionsPackageImpl theApiexpressionsPackage = (ApiexpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) instanceof ApiexpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) : ApiexpressionsPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);

		// Create package meta-data objects
		theApiPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		theSwplatformPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theRealtimestatechartparameterPackage.createPackageContents();
		theRealtimestatechartparameterbindingPackage.createPackageContents();
		thePortapimappingPackage.createPackageContents();
		theApiexpressionsPackage.createPackageContents();
		theInstancePackage.createPackageContents();

		// Initialize created meta-data
		theApiPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		theSwplatformPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theRealtimestatechartparameterPackage.initializePackageContents();
		theRealtimestatechartparameterbindingPackage.initializePackageContents();
		thePortapimappingPackage.initializePackageContents();
		theApiexpressionsPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApiPackage.eNS_URI, theApiPackage);
		return theApiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPITEST() {
		return apitestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiFactory getApiFactory() {
		return (ApiFactory)getEFactoryInstance();
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
		apitestEClass = createEClass(APITEST);
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
		PortapimappingPackage thePortapimappingPackage = (PortapimappingPackage)EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI);
		ApiexpressionsPackage theApiexpressionsPackage = (ApiexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePortapimappingPackage);
		getESubpackages().add(theApiexpressionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
	}

} //ApiPackageImpl
