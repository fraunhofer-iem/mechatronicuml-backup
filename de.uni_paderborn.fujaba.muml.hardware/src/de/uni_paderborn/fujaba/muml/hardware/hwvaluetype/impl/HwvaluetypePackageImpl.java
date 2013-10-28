/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstancePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwvaluetypePackageImpl extends EPackageImpl implements HwvaluetypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSizeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frequencyUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataRateUnitEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HwvaluetypePackageImpl() {
		super(eNS_URI, HwvaluetypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HwvaluetypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HwvaluetypePackage init() {
		if (isInited) return (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);

		// Obtain or create and register package
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HwvaluetypePackageImpl());

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
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) : ResourcetypePackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		PlatforminstancePackageImpl thePlatforminstancePackage = (PlatforminstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatforminstancePackage.eNS_URI) instanceof PlatforminstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatforminstancePackage.eNS_URI) : PlatforminstancePackage.eINSTANCE);

		// Create package meta-data objects
		theHwvaluetypePackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		thePlatforminstancePackage.createPackageContents();

		// Initialize created meta-data
		theHwvaluetypePackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		thePlatforminstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHwvaluetypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HwvaluetypePackage.eNS_URI, theHwvaluetypePackage);
		return theHwvaluetypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSize() {
		return dataSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSize_Value() {
		return (EAttribute)dataSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSize_Unit() {
		return (EAttribute)dataSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequency() {
		return frequencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequency_Value() {
		return (EAttribute)frequencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequency_Unit() {
		return (EAttribute)frequencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRate() {
		return dataRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRate_Value() {
		return (EAttribute)dataRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRate_Unit() {
		return (EAttribute)dataRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInterval_Unit() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSizeUnit() {
		return dataSizeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrequencyUnit() {
		return frequencyUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataRateUnit() {
		return dataRateUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwvaluetypeFactory getHwvaluetypeFactory() {
		return (HwvaluetypeFactory)getEFactoryInstance();
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
		dataSizeEClass = createEClass(DATA_SIZE);
		createEAttribute(dataSizeEClass, DATA_SIZE__VALUE);
		createEAttribute(dataSizeEClass, DATA_SIZE__UNIT);

		frequencyEClass = createEClass(FREQUENCY);
		createEAttribute(frequencyEClass, FREQUENCY__VALUE);
		createEAttribute(frequencyEClass, FREQUENCY__UNIT);

		dataRateEClass = createEClass(DATA_RATE);
		createEAttribute(dataRateEClass, DATA_RATE__VALUE);
		createEAttribute(dataRateEClass, DATA_RATE__UNIT);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__UNIT);

		// Create enums
		dataSizeUnitEEnum = createEEnum(DATA_SIZE_UNIT);
		frequencyUnitEEnum = createEEnum(FREQUENCY_UNIT);
		dataRateUnitEEnum = createEEnum(DATA_RATE_UNIT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timeIntervalEClass.getESuperTypes().add(theValuetypePackage.getRange());

		// Initialize classes and features; add operations and parameters
		initEClass(dataSizeEClass, DataSize.class, "DataSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSize_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSize_Unit(), this.getDataSizeUnit(), "unit", null, 1, 1, DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dataSizeEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSizeEClass, ecorePackage.getEDouble(), "getInByte", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(frequencyEClass, Frequency.class, "Frequency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequency_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequency_Unit(), this.getFrequencyUnit(), "unit", null, 0, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(frequencyEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(frequencyEClass, ecorePackage.getEDouble(), "getInHz", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataRateEClass, DataRate.class, "DataRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataRate_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataRate_Unit(), this.getDataRateUnit(), "unit", null, 0, 1, DataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dataRateEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataRateEClass, ecorePackage.getEDouble(), "getInBpS", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeInterval_Unit(), theValuetypePackage.getTimeUnit(), "unit", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataSizeUnitEEnum, DataSizeUnit.class, "DataSizeUnit");
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.BYTE);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.KBYTE);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.MBYTE);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.GBYTE);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.BIT);

		initEEnum(frequencyUnitEEnum, FrequencyUnit.class, "FrequencyUnit");
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.HZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.KHZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.MHZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.GHZ);

		initEEnum(dataRateUnitEEnum, DataRateUnit.class, "DataRateUnit");
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.BS);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.KBS);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.MBS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "This package defines the basic data types needed to characterize resources\n(i.e. DataSize, Frequency)."
		   });			
		addAnnotation
		  (dataSizeEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents the data size of an element or the size of a memory resource."
		   });		
		addAnnotation
		  (dataSizeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "// Return value concatenated with unit\nStringBuffer sb = new StringBuffer();\nsb.append(String.valueOf(value));\n\tif (unit != null) {\n\t\tsb.append(\' \');\n\t\tsb.append(unit.toString());\n\t\t}\nreturn sb.toString();"
		   });		
		addAnnotation
		  (dataSizeEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "double inByte=0;\n\t\tif(unit!=null){\n\t\tinByte=value*Math.pow(2, unit.getValue());\t\n\t\t}\nreturn inByte;"
		   });		
		addAnnotation
		  (getDataSize_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The value of this DataSize."
		   });		
		addAnnotation
		  (getDataSize_Unit(), 
		   source, 
		   new String[] {
			 "documentation", "The unit of the value."
		   });		
		addAnnotation
		  (dataSizeUnitEEnum, 
		   source, 
		   new String[] {
			 "documentation", "The base unit is Byte. The value of the literal is the conversion factor.\nFor example 3 KByte (value=10) = 3*2^(value) Byte."
		   });		
		addAnnotation
		  (frequencyEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents the frequency of a computing resource."
		   });		
		addAnnotation
		  (frequencyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "// Return value concatenated with unit\nStringBuffer sb = new StringBuffer();\nsb.append(String.valueOf(value));\n\tif (unit != null) {\n\t\tsb.append(\' \');\n\t\tsb.append(unit.toString());\n\t\t}\nreturn sb.toString();"
		   });		
		addAnnotation
		  (frequencyEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "double inHz=0;\n\t\tif(unit!=null){\n\t\tinHz=value*Math.pow(10, unit.getValue());\t\n\t\t}\nreturn inHz;"
		   });		
		addAnnotation
		  (getFrequency_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The value of the frequency."
		   });		
		addAnnotation
		  (getFrequency_Unit(), 
		   source, 
		   new String[] {
			 "documentation", "The unit of this value (i.e. Hz, MHz,etc)."
		   });		
		addAnnotation
		  (frequencyUnitEEnum, 
		   source, 
		   new String[] {
			 "documentation", "The base unit is Hz. The value of the literal is the conversion factor.\nFor example 2.5 KHz (value=3) =2.5*10^(value) Hz."
		   });		
		addAnnotation
		  (dataRateUnitEEnum, 
		   source, 
		   new String[] {
			 "documentation", "The base unit is bit/s. The value of the literal is the conversion factor.\nFor example 2.5 Kbit/s (value=20) = 2.5*2^(value) bit/s."
		   });		
		addAnnotation
		  (dataRateEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents the data rate of a resource (i.e. the bandwidth of a bus)."
		   });		
		addAnnotation
		  (dataRateEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "// Return value concatenated with unit\nStringBuffer sb = new StringBuffer();\nsb.append(String.valueOf(value));\n\tif (unit != null) {\n\t\tsb.append(\' \');\n\t\tsb.append(unit.toString());\n\t\t}\nreturn sb.toString();"
		   });		
		addAnnotation
		  (dataRateEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "double inBpS=0;\n\t\tif(unit!=null){\n\t\tinBpS=value*Math.pow(2, unit.getValue());\t\n\t\t}\nreturn inBpS;"
		   });		
		addAnnotation
		  (getDataRate_Value(), 
		   source, 
		   new String[] {
			 "documentation", "The value of this DataRate."
		   });		
		addAnnotation
		  (getDataRate_Unit(), 
		   source, 
		   new String[] {
			 "documentation", "The unit of the value (i.e. b/s, Kb/s)."
		   });		
		addAnnotation
		  (timeIntervalEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an interval to specify time bounds."
		   });		
		addAnnotation
		  (getTimeInterval_Unit(), 
		   source, 
		   new String[] {
			 "documentation", "The unit for this TimeInterval."
		   });
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

} //HwvaluetypePackageImpl
