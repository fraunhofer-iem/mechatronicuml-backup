/**
 */
package org.muml.modelica.transform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.modelica.transform.Entry;
import org.muml.modelica.transform.Map;
import org.muml.modelica.transform.PositionExtension;
import org.muml.modelica.transform.RealtimeStatechartTransformationRootObject;
import org.muml.modelica.transform.RegionInstance;
import org.muml.modelica.transform.Root;
import org.muml.modelica.transform.TransformFactory;
import org.muml.modelica.transform.TransformPackage;
import org.muml.modelica.transform.TransformationRootObject;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformPackageImpl extends EPackageImpl implements TransformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationRootObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeStatechartTransformationRootObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionExtensionEClass = null;

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
	 * @see org.muml.modelica.transform.TransformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransformPackageImpl() {
		super(eNS_URI, TransformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransformPackage init() {
		if (isInited) return (TransformPackage)EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI);

		// Obtain or create and register package
		TransformPackageImpl theTransformPackage = (TransformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TransformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TransformPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PimPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTransformPackage.createPackageContents();

		// Initialize created meta-data
		theTransformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransformPackage.eNS_URI, theTransformPackage);
		return theTransformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Entries() {
		return (EReference)mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMap__Get__EObject() {
		return mapEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Maps() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_Key() {
		return (EReference)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_Value() {
		return (EReference)entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionInstance() {
		return regionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionInstance_InstanceOf() {
		return (EReference)regionInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionInstance_EmbedsSinglePortStatechart() {
		return (EAttribute)regionInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionInstance_EmbedsMultiPortStatechart() {
		return (EAttribute)regionInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationRootObject() {
		return transformationRootObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationRootObject_EObject() {
		return (EReference)transformationRootObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeStatechartTransformationRootObject() {
		return realtimeStatechartTransformationRootObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionExtension() {
		return positionExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformFactory getTransformFactory() {
		return (TransformFactory)getEFactoryInstance();
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
		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__ENTRIES);
		createEOperation(mapEClass, MAP___GET__EOBJECT);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__MAPS);

		entryEClass = createEClass(ENTRY);
		createEReference(entryEClass, ENTRY__KEY);
		createEReference(entryEClass, ENTRY__VALUE);

		regionInstanceEClass = createEClass(REGION_INSTANCE);
		createEReference(regionInstanceEClass, REGION_INSTANCE__INSTANCE_OF);
		createEAttribute(regionInstanceEClass, REGION_INSTANCE__EMBEDS_SINGLE_PORT_STATECHART);
		createEAttribute(regionInstanceEClass, REGION_INSTANCE__EMBEDS_MULTI_PORT_STATECHART);

		transformationRootObjectEClass = createEClass(TRANSFORMATION_ROOT_OBJECT);
		createEReference(transformationRootObjectEClass, TRANSFORMATION_ROOT_OBJECT__EOBJECT);

		realtimeStatechartTransformationRootObjectEClass = createEClass(REALTIME_STATECHART_TRANSFORMATION_ROOT_OBJECT);

		positionExtensionEClass = createEClass(POSITION_EXTENSION);
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
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter transformationRootObjectEClass_T = addETypeParameter(transformationRootObjectEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		regionInstanceEClass.getESuperTypes().add(theRealtimestatechartPackage.getRegion());
		EGenericType g1 = createEGenericType(this.getTransformationRootObject());
		EGenericType g2 = createEGenericType(theRealtimestatechartPackage.getRealtimeStatechart());
		g1.getETypeArguments().add(g2);
		realtimeStatechartTransformationRootObjectEClass.getEGenericSuperTypes().add(g1);
		positionExtensionEClass.getESuperTypes().add(theCorePackage.getExtension());
		positionExtensionEClass.getESuperTypes().add(ecorePackage.getEAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Entries(), this.getEntry(), null, "entries", null, 0, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMap__Get__EObject(), theRealtimestatechartPackage.getRealtimeStatechart(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "instance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Maps(), this.getMap(), null, "maps", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntry_Key(), ecorePackage.getEObject(), null, "key", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntry_Value(), theRealtimestatechartPackage.getRealtimeStatechart(), null, "value", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionInstanceEClass, RegionInstance.class, "RegionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegionInstance_InstanceOf(), theRealtimestatechartPackage.getRegion(), null, "instanceOf", null, 1, 1, RegionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionInstance_EmbedsSinglePortStatechart(), ecorePackage.getEBoolean(), "embedsSinglePortStatechart", null, 0, 1, RegionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionInstance_EmbedsMultiPortStatechart(), ecorePackage.getEBoolean(), "embedsMultiPortStatechart", null, 0, 1, RegionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(transformationRootObjectEClass, TransformationRootObject.class, "TransformationRootObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(transformationRootObjectEClass_T);
		initEReference(getTransformationRootObject_EObject(), g1, null, "eObject", null, 1, 1, TransformationRootObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimeStatechartTransformationRootObjectEClass, RealtimeStatechartTransformationRootObject.class, "RealtimeStatechartTransformationRootObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionExtensionEClass, PositionExtension.class, "PositionExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (getMap__Get__EObject(), 
		   source, 
		   new String[] {
			 "body", "let res : OrderedSet(pim::realtimestatechart::RealtimeStatechart) = entries->select(key = instance)->collect(value.oclAsType(pim::realtimestatechart::RealtimeStatechart))->asOrderedSet()\nin\nif res->isEmpty() then\n\tnull\nelse\n\tres->first()\nendif"
		   });	
		addAnnotation
		  (getRegionInstance_EmbedsSinglePortStatechart(), 
		   source, 
		   new String[] {
			 "derivation", "let behavioralElement : behavior::BehavioralElement\n=\n\tinstanceOf.embeddedStatechart.behavioralElement\nin\nnot behavioralElement.oclIsUndefined() and behavioralElement.oclIsKindOf(component::DiscretePort)"
		   });	
		addAnnotation
		  (getRegionInstance_EmbedsMultiPortStatechart(), 
		   source, 
		   new String[] {
			 "derivation", "instanceOf.embeddedStatechart.behavioralElement.oclIsUndefined()\nand\nlet r : pim::realtimestatechart::Region =\n\tinstanceOf.embeddedStatechart.states->any(true).embeddedRegions->any(embeddedStatechart.behavioralElement.oclIsTypeOf(component::DiscretePort))\nin\nnot r.oclIsUndefined()\nand not r.embeddedStatechart.behavioralElement.oclIsUndefined()\nand r.embeddedStatechart.behavioralElement.oclIsTypeOf(component::DiscretePort)\nand r.embeddedStatechart.behavioralElement.oclAsType(component::DiscretePort).multiPort"
		   });
	}

} //TransformPackageImpl
