/**
 */
package es.unican.mast.xmlmast.trace.impl;

import es.unican.mast.xmlmast.trace.DocumentRoot;
import es.unican.mast.xmlmast.trace.Message;
import es.unican.mast.xmlmast.trace.MessageType;
import es.unican.mast.xmlmast.trace.MsgList;
import es.unican.mast.xmlmast.trace.MsgTypeList;
import es.unican.mast.xmlmast.trace.Source;
import es.unican.mast.xmlmast.trace.SrcList;
import es.unican.mast.xmlmast.trace.TRACEFILEType;
import es.unican.mast.xmlmast.trace.TraceFactory;
import es.unican.mast.xmlmast.trace.TracePackage;

import es.unican.mast.xmlmast.trace.util.TraceValidator;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracePackageImpl extends EPackageImpl implements TracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msgListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msgTypeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracefileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType externalReferenceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sourceIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sourceIdentifierObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeObjectEDataType = null;

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
	 * @see es.unican.mast.xmlmast.trace.TracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracePackageImpl() {
		super(eNS_URI, TraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracePackage init() {
		if (isInited) return (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);

		// Obtain or create and register package
		TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTracePackage.createPackageContents();

		// Initialize created meta-data
		theTracePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTracePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TraceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI, theTracePackage);
		return theTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TRACEFILE() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_M() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_S() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_T() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageType() {
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_Mid() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_Type() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMsgList() {
		return msgListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMsgList_Msg() {
		return (EReference)msgListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMsgTypeList() {
		return msgTypeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMsgTypeList_MsgType() {
		return (EReference)msgTypeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Name() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Sid() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Type() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcList() {
		return srcListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcList_Src() {
		return (EReference)srcListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRACEFILEType() {
		return tracefileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRACEFILEType_MsgTypeList() {
		return (EReference)tracefileTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRACEFILEType_SrcList() {
		return (EReference)tracefileTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRACEFILEType_MsgList() {
		return (EReference)tracefileTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRACEFILEType_EndTime() {
		return (EAttribute)tracefileTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRACEFILEType_GenerationDate() {
		return (EAttribute)tracefileTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRACEFILEType_GenerationProfile() {
		return (EAttribute)tracefileTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRACEFILEType_GenerationTool() {
		return (EAttribute)tracefileTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRACEFILEType_ModelDate() {
		return (EAttribute)tracefileTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRACEFILEType_ModelName() {
		return (EAttribute)tracefileTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRACEFILEType_StartTime() {
		return (EAttribute)tracefileTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExternalReference() {
		return externalReferenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifier() {
		return identifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageIdentifier() {
		return messageIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSourceIdentifier() {
		return sourceIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSourceIdentifierObject() {
		return sourceIdentifierObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTime() {
		return timeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeObject() {
		return timeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFactory getTraceFactory() {
		return (TraceFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRACEFILE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__M);
		createEAttribute(messageEClass, MESSAGE__S);
		createEAttribute(messageEClass, MESSAGE__T);

		messageTypeEClass = createEClass(MESSAGE_TYPE);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__MID);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__TYPE);

		msgListEClass = createEClass(MSG_LIST);
		createEReference(msgListEClass, MSG_LIST__MSG);

		msgTypeListEClass = createEClass(MSG_TYPE_LIST);
		createEReference(msgTypeListEClass, MSG_TYPE_LIST__MSG_TYPE);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__NAME);
		createEAttribute(sourceEClass, SOURCE__SID);
		createEAttribute(sourceEClass, SOURCE__TYPE);

		srcListEClass = createEClass(SRC_LIST);
		createEReference(srcListEClass, SRC_LIST__SRC);

		tracefileTypeEClass = createEClass(TRACEFILE_TYPE);
		createEReference(tracefileTypeEClass, TRACEFILE_TYPE__MSG_TYPE_LIST);
		createEReference(tracefileTypeEClass, TRACEFILE_TYPE__SRC_LIST);
		createEReference(tracefileTypeEClass, TRACEFILE_TYPE__MSG_LIST);
		createEAttribute(tracefileTypeEClass, TRACEFILE_TYPE__END_TIME);
		createEAttribute(tracefileTypeEClass, TRACEFILE_TYPE__GENERATION_DATE);
		createEAttribute(tracefileTypeEClass, TRACEFILE_TYPE__GENERATION_PROFILE);
		createEAttribute(tracefileTypeEClass, TRACEFILE_TYPE__GENERATION_TOOL);
		createEAttribute(tracefileTypeEClass, TRACEFILE_TYPE__MODEL_DATE);
		createEAttribute(tracefileTypeEClass, TRACEFILE_TYPE__MODEL_NAME);
		createEAttribute(tracefileTypeEClass, TRACEFILE_TYPE__START_TIME);

		// Create data types
		dateTimeEDataType = createEDataType(DATE_TIME);
		externalReferenceEDataType = createEDataType(EXTERNAL_REFERENCE);
		identifierEDataType = createEDataType(IDENTIFIER);
		messageIdentifierEDataType = createEDataType(MESSAGE_IDENTIFIER);
		sourceIdentifierEDataType = createEDataType(SOURCE_IDENTIFIER);
		sourceIdentifierObjectEDataType = createEDataType(SOURCE_IDENTIFIER_OBJECT);
		timeEDataType = createEDataType(TIME);
		timeObjectEDataType = createEDataType(TIME_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TRACEFILE(), this.getTRACEFILEType(), null, "tRACEFILE", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_M(), this.getMessageIdentifier(), "m", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_S(), this.getSourceIdentifier(), "s", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_T(), this.getTime(), "t", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageType_Mid(), this.getMessageIdentifier(), "mid", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msgListEClass, MsgList.class, "MsgList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMsgList_Msg(), this.getMessage(), null, "msg", null, 1, -1, MsgList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msgTypeListEClass, MsgTypeList.class, "MsgTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMsgTypeList_MsgType(), this.getMessageType(), null, "msgType", null, 1, -1, MsgTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_Name(), this.getExternalReference(), "name", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Sid(), this.getSourceIdentifier(), "sid", null, 1, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcListEClass, SrcList.class, "SrcList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcList_Src(), this.getSource(), null, "src", null, 1, -1, SrcList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracefileTypeEClass, TRACEFILEType.class, "TRACEFILEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRACEFILEType_MsgTypeList(), this.getMsgTypeList(), null, "msgTypeList", null, 0, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRACEFILEType_SrcList(), this.getSrcList(), null, "srcList", null, 0, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRACEFILEType_MsgList(), this.getMsgList(), null, "msgList", null, 1, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRACEFILEType_EndTime(), this.getTime(), "endTime", null, 1, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRACEFILEType_GenerationDate(), this.getDateTime(), "generationDate", null, 1, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRACEFILEType_GenerationProfile(), theXMLTypePackage.getString(), "generationProfile", null, 0, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRACEFILEType_GenerationTool(), theXMLTypePackage.getString(), "generationTool", null, 1, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRACEFILEType_ModelDate(), this.getDateTime(), "modelDate", null, 1, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRACEFILEType_ModelName(), this.getIdentifier(), "modelName", null, 1, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRACEFILEType_StartTime(), this.getTime(), "startTime", null, 1, 1, TRACEFILEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(dateTimeEDataType, XMLGregorianCalendar.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(externalReferenceEDataType, String.class, "ExternalReference", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageIdentifierEDataType, BigInteger.class, "MessageIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sourceIdentifierEDataType, int.class, "SourceIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sourceIdentifierObjectEDataType, Integer.class, "SourceIdentifierObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeEDataType, float.class, "Time", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeObjectEDataType, Float.class, "TimeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (dateTimeEDataType, 
		   source, 
		   new String[] {
			 "name", "Date_Time",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_TRACEFILE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TRACE_FILE",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (externalReferenceEDataType, 
		   source, 
		   new String[] {
			 "name", "External_Reference",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NCName",
			 "pattern", "([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*"
		   });	
		addAnnotation
		  (identifierEDataType, 
		   source, 
		   new String[] {
			 "name", "Identifier",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NCName",
			 "pattern", "([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*"
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "name", "Message",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMessage_M(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "M"
		   });	
		addAnnotation
		  (getMessage_S(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "S"
		   });	
		addAnnotation
		  (getMessage_T(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "T"
		   });	
		addAnnotation
		  (messageIdentifierEDataType, 
		   source, 
		   new String[] {
			 "name", "Message_Identifier",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
		   });	
		addAnnotation
		  (messageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Message_Type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMessageType_Mid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Mid"
		   });	
		addAnnotation
		  (getMessageType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (msgListEClass, 
		   source, 
		   new String[] {
			 "name", "Msg_List",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMsgList_Msg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Msg",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (msgTypeListEClass, 
		   source, 
		   new String[] {
			 "name", "Msg_Type_List",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMsgTypeList_MsgType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Msg_Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (sourceEClass, 
		   source, 
		   new String[] {
			 "name", "Source",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSource_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getSource_Sid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Sid"
		   });	
		addAnnotation
		  (getSource_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (sourceIdentifierEDataType, 
		   source, 
		   new String[] {
			 "name", "Source_Identifier",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int"
		   });	
		addAnnotation
		  (sourceIdentifierObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Source_Identifier:Object",
			 "baseType", "Source_Identifier"
		   });	
		addAnnotation
		  (srcListEClass, 
		   source, 
		   new String[] {
			 "name", "Src_List",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSrcList_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Src",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (timeEDataType, 
		   source, 
		   new String[] {
			 "name", "Time",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0.0"
		   });	
		addAnnotation
		  (timeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Time:Object",
			 "baseType", "Time"
		   });	
		addAnnotation
		  (tracefileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TRACE_FILE_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTRACEFILEType_MsgTypeList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Msg_Type_List",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTRACEFILEType_SrcList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Src_List",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTRACEFILEType_MsgList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Msg_List",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTRACEFILEType_EndTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "End_Time"
		   });	
		addAnnotation
		  (getTRACEFILEType_GenerationDate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Generation_Date"
		   });	
		addAnnotation
		  (getTRACEFILEType_GenerationProfile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Generation_Profile"
		   });	
		addAnnotation
		  (getTRACEFILEType_GenerationTool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Generation_Tool"
		   });	
		addAnnotation
		  (getTRACEFILEType_ModelDate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Model_Date"
		   });	
		addAnnotation
		  (getTRACEFILEType_ModelName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Model_Name"
		   });	
		addAnnotation
		  (getTRACEFILEType_StartTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Start_Time"
		   });
	}

} //TracePackageImpl
