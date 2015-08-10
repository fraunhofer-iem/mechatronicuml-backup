/**
 */
package de.uni_paderborn.fujaba.muml.psm.psm_instance.impl;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;

import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.psm.PsmPackage;

import de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage;

import de.uni_paderborn.fujaba.muml.psm.allocation.impl.AllocationPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.apiexpressions.ApiexpressionsPackage;

import de.uni_paderborn.fujaba.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage;

import de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.impl.PsmPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.portapimapping.PortapimappingPackage;

import de.uni_paderborn.fujaba.muml.psm.portapimapping.impl.PortapimappingPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage;

import de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.psm.psm_instance.Psm_instanceFactory;
import de.uni_paderborn.fujaba.muml.psm.psm_instance.Psm_instancePackage;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl;

import de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Psm_instancePackageImpl extends EPackageImpl implements Psm_instancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterisableDiscreteSinglePortInstanceEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_instance.Psm_instancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Psm_instancePackageImpl() {
		super(eNS_URI, Psm_instanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Psm_instancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Psm_instancePackage init() {
		if (isInited) return (Psm_instancePackage)EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI);

		// Obtain or create and register package
		Psm_instancePackageImpl thePsm_instancePackage = (Psm_instancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Psm_instancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Psm_instancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionlanguagePackage.eINSTANCE.eClass();
		HwplatformPackage.eINSTANCE.eClass();
		HwvaluetypePackage.eINSTANCE.eClass();
		HwplatforminstancePackage.eINSTANCE.eClass();
		HwresourcePackage.eINSTANCE.eClass();
		HwresourceinstancePackage.eINSTANCE.eClass();
		SwplatformPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) instanceof PsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) : PsmPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) : PropertiesPackage.eINSTANCE);
		Psm_realtimestatechartPackageImpl thePsm_realtimestatechartPackage = (Psm_realtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) instanceof Psm_realtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) : Psm_realtimestatechartPackage.eINSTANCE);
		RealtimestatechartparameterPackageImpl theRealtimestatechartparameterPackage = (RealtimestatechartparameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) instanceof RealtimestatechartparameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) : RealtimestatechartparameterPackage.eINSTANCE);
		RealtimestatechartparameterbindingPackageImpl theRealtimestatechartparameterbindingPackage = (RealtimestatechartparameterbindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) instanceof RealtimestatechartparameterbindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) : RealtimestatechartparameterbindingPackage.eINSTANCE);
		PortapimappingPackageImpl thePortapimappingPackage = (PortapimappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) instanceof PortapimappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) : PortapimappingPackage.eINSTANCE);
		ApiexpressionsPackageImpl theApiexpressionsPackage = (ApiexpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) instanceof ApiexpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) : ApiexpressionsPackage.eINSTANCE);
		CodegenPackageImpl theCodegenPackage = (CodegenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) instanceof CodegenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) : CodegenPackage.eINSTANCE);

		// Create package meta-data objects
		thePsm_instancePackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		thePsm_realtimestatechartPackage.createPackageContents();
		theRealtimestatechartparameterPackage.createPackageContents();
		theRealtimestatechartparameterbindingPackage.createPackageContents();
		thePortapimappingPackage.createPackageContents();
		theApiexpressionsPackage.createPackageContents();
		theCodegenPackage.createPackageContents();

		// Initialize created meta-data
		thePsm_instancePackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		thePsm_realtimestatechartPackage.initializePackageContents();
		theRealtimestatechartparameterPackage.initializePackageContents();
		theRealtimestatechartparameterbindingPackage.initializePackageContents();
		thePortapimappingPackage.initializePackageContents();
		theApiexpressionsPackage.initializePackageContents();
		theCodegenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePsm_instancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Psm_instancePackage.eNS_URI, thePsm_instancePackage);
		return thePsm_instancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterisableDiscreteSinglePortInstance() {
		return parameterisableDiscreteSinglePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterisableDiscreteSinglePortInstance_Bindings() {
		return (EReference)parameterisableDiscreteSinglePortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psm_instanceFactory getPsm_instanceFactory() {
		return (Psm_instanceFactory)getEFactoryInstance();
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
		parameterisableDiscreteSinglePortInstanceEClass = createEClass(PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE);
		createEReference(parameterisableDiscreteSinglePortInstanceEClass, PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS);
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
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		RealtimestatechartparameterbindingPackage theRealtimestatechartparameterbindingPackage = (RealtimestatechartparameterbindingPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterisableDiscreteSinglePortInstanceEClass.getESuperTypes().add(theInstancePackage.getDiscreteSinglePortInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(parameterisableDiscreteSinglePortInstanceEClass, ParameterisableDiscreteSinglePortInstance.class, "ParameterisableDiscreteSinglePortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterisableDiscreteSinglePortInstance_Bindings(), theRealtimestatechartparameterbindingPackage.getRealtimeStatechartParameterBinding(), theRealtimestatechartparameterbindingPackage.getRealtimeStatechartParameterBinding_PortInstance(), "bindings", null, 0, -1, ParameterisableDiscreteSinglePortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //Psm_instancePackageImpl
