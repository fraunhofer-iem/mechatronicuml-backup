/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.types.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.behavior.impl.BehaviorPackageImpl;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.impl.ComponentPackageImpl;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.msgtype.impl.MsgtypePackageImpl;
import de.uni_paderborn.fujaba.muml.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.impl.ProtocolPackageImpl;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl;
import de.uni_paderborn.fujaba.muml.types.ArrayDataType;
import de.uni_paderborn.fujaba.muml.types.Attribute;
import de.uni_paderborn.fujaba.muml.types.DataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveTypes;
import de.uni_paderborn.fujaba.muml.types.RangedPrimitiveDataType;
import de.uni_paderborn.fujaba.muml.types.StructureDataType;
import de.uni_paderborn.fujaba.muml.types.TypesFactory;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.types.util.TypesValidator;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.uni_paderborn.fujaba.muml.valuetype.impl.ValuetypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangedPrimitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypesEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelinstancePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		One_to_n_schemataPackageImpl theOne_to_n_schemataPackage = (One_to_n_schemataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) instanceof One_to_n_schemataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) : One_to_n_schemataPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theOne_to_n_schemataPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		thePatternPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theOne_to_n_schemataPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTypesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TypesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDataType() {
		return arrayDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDataType_Type() {
		return (EReference)arrayDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDataType_Cardinality() {
		return (EReference)arrayDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDataType_PrimitiveType() {
		return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangedPrimitiveDataType() {
		return rangedPrimitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangedPrimitiveDataType_RangedType() {
		return (EReference)rangedPrimitiveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangedPrimitiveDataType_Range() {
		return (EReference)rangedPrimitiveDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDataType() {
		return structureDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDataType_Attributes() {
		return (EReference)structureDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveTypes() {
		return primitiveTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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
		arrayDataTypeEClass = createEClass(ARRAY_DATA_TYPE);
		createEReference(arrayDataTypeEClass, ARRAY_DATA_TYPE__TYPE);
		createEReference(arrayDataTypeEClass, ARRAY_DATA_TYPE__CARDINALITY);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
		createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__PRIMITIVE_TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);

		rangedPrimitiveDataTypeEClass = createEClass(RANGED_PRIMITIVE_DATA_TYPE);
		createEReference(rangedPrimitiveDataTypeEClass, RANGED_PRIMITIVE_DATA_TYPE__RANGED_TYPE);
		createEReference(rangedPrimitiveDataTypeEClass, RANGED_PRIMITIVE_DATA_TYPE__RANGE);

		structureDataTypeEClass = createEClass(STRUCTURE_DATA_TYPE);
		createEReference(structureDataTypeEClass, STRUCTURE_DATA_TYPE__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);

		// Create enums
		primitiveTypesEEnum = createEEnum(PRIMITIVE_TYPES);
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
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arrayDataTypeEClass.getESuperTypes().add(this.getDataType());
		primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
		dataTypeEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		dataTypeEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		rangedPrimitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
		structureDataTypeEClass.getESuperTypes().add(this.getDataType());
		attributeEClass.getESuperTypes().add(theBehaviorPackage.getTypedNamedElement());
		attributeEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(arrayDataTypeEClass, ArrayDataType.class, "ArrayDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayDataType_Type(), this.getDataType(), null, "type", null, 1, 1, ArrayDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayDataType_Cardinality(), theValuetypePackage.getNaturalNumber(), null, "cardinality", null, 1, 1, ArrayDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDataType_PrimitiveType(), this.getPrimitiveTypes(), "primitiveType", "VOID", 1, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangedPrimitiveDataTypeEClass, RangedPrimitiveDataType.class, "RangedPrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangedPrimitiveDataType_RangedType(), this.getPrimitiveDataType(), null, "rangedType", null, 1, 1, RangedPrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangedPrimitiveDataType_Range(), theValuetypePackage.getRange(), null, "range", null, 1, 1, RangedPrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureDataTypeEClass, StructureDataType.class, "StructureDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureDataType_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, StructureDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(primitiveTypesEEnum, PrimitiveTypes.class, "PrimitiveTypes");
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.VOID);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.BOOLEAN);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.INT8);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.INT16);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.INT32);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.INT64);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.DOUBLE);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.UINT8);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.UINT16);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.UINT32);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.UINT64);

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
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidAttributeDataType"
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
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "ValidAttributeDataType", "-- An attribute may only use a Primtive Data Type, a Ranged Primitive Data Type, an Array Data Type, or a Structure Data Type\r\nself.dataType.oclIsTypeOf(PrimitiveDataType) or self.dataType.oclIsTypeOf(RangedPrimitiveDataType) or self.dataType.oclIsTypeOf(ArrayDataType) or self.dataType.oclIsTypeOf(StructureDataType)\r\n-- author: chris227"
		   });
	}

} //TypesPackageImpl
