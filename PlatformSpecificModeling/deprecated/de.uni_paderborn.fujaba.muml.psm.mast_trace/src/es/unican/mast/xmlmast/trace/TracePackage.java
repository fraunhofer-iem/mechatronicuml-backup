/**
 */
package es.unican.mast.xmlmast.trace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mast.unican.es/xmlmast/trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracePackage eINSTANCE = es.unican.mast.xmlmast.trace.impl.TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.trace.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.DocumentRootImpl
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>TRACEFILE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRACEFILE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.trace.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.MessageImpl
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__M = 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__S = 1;

	/**
	 * The feature id for the '<em><b>T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__T = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.trace.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.MessageTypeImpl
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__MID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.trace.impl.MsgListImpl <em>Msg List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.MsgListImpl
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMsgList()
	 * @generated
	 */
	int MSG_LIST = 3;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_LIST__MSG = 0;

	/**
	 * The number of structural features of the '<em>Msg List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Msg List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.trace.impl.MsgTypeListImpl <em>Msg Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.MsgTypeListImpl
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMsgTypeList()
	 * @generated
	 */
	int MSG_TYPE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Msg Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_TYPE_LIST__MSG_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Msg Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_TYPE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Msg Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_TYPE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.trace.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.SourceImpl
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.trace.impl.SrcListImpl <em>Src List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.SrcListImpl
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getSrcList()
	 * @generated
	 */
	int SRC_LIST = 6;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LIST__SRC = 0;

	/**
	 * The number of structural features of the '<em>Src List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl <em>TRACEFILE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getTRACEFILEType()
	 * @generated
	 */
	int TRACEFILE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Msg Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__MSG_TYPE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Src List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__SRC_LIST = 1;

	/**
	 * The feature id for the '<em><b>Msg List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__MSG_LIST = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Generation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__GENERATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Generation Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__GENERATION_PROFILE = 5;

	/**
	 * The feature id for the '<em><b>Generation Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__GENERATION_TOOL = 6;

	/**
	 * The feature id for the '<em><b>Model Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__MODEL_DATE = 7;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__MODEL_NAME = 8;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE__START_TIME = 9;

	/**
	 * The number of structural features of the '<em>TRACEFILE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>TRACEFILE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEFILE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 8;

	/**
	 * The meta object id for the '<em>External Reference</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 9;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 10;

	/**
	 * The meta object id for the '<em>Message Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMessageIdentifier()
	 * @generated
	 */
	int MESSAGE_IDENTIFIER = 11;

	/**
	 * The meta object id for the '<em>Source Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getSourceIdentifier()
	 * @generated
	 */
	int SOURCE_IDENTIFIER = 12;

	/**
	 * The meta object id for the '<em>Source Identifier Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getSourceIdentifierObject()
	 * @generated
	 */
	int SOURCE_IDENTIFIER_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 14;

	/**
	 * The meta object id for the '<em>Time Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getTimeObject()
	 * @generated
	 */
	int TIME_OBJECT = 15;


	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.trace.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.unican.mast.xmlmast.trace.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.trace.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.unican.mast.xmlmast.trace.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.unican.mast.xmlmast.trace.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.unican.mast.xmlmast.trace.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.unican.mast.xmlmast.trace.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.unican.mast.xmlmast.trace.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.trace.DocumentRoot#getTRACEFILE <em>TRACEFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TRACEFILE</em>'.
	 * @see es.unican.mast.xmlmast.trace.DocumentRoot#getTRACEFILE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TRACEFILE();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.trace.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see es.unican.mast.xmlmast.trace.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.Message#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see es.unican.mast.xmlmast.trace.Message#getM()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_M();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.Message#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see es.unican.mast.xmlmast.trace.Message#getS()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_S();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.Message#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>T</em>'.
	 * @see es.unican.mast.xmlmast.trace.Message#getT()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_T();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.trace.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see es.unican.mast.xmlmast.trace.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.MessageType#getMid <em>Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid</em>'.
	 * @see es.unican.mast.xmlmast.trace.MessageType#getMid()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_Mid();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.MessageType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.unican.mast.xmlmast.trace.MessageType#getType()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_Type();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.trace.MsgList <em>Msg List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg List</em>'.
	 * @see es.unican.mast.xmlmast.trace.MsgList
	 * @generated
	 */
	EClass getMsgList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.trace.MsgList#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg</em>'.
	 * @see es.unican.mast.xmlmast.trace.MsgList#getMsg()
	 * @see #getMsgList()
	 * @generated
	 */
	EReference getMsgList_Msg();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.trace.MsgTypeList <em>Msg Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Type List</em>'.
	 * @see es.unican.mast.xmlmast.trace.MsgTypeList
	 * @generated
	 */
	EClass getMsgTypeList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.trace.MsgTypeList#getMsgType <em>Msg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg Type</em>'.
	 * @see es.unican.mast.xmlmast.trace.MsgTypeList#getMsgType()
	 * @see #getMsgTypeList()
	 * @generated
	 */
	EReference getMsgTypeList_MsgType();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.trace.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see es.unican.mast.xmlmast.trace.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.Source#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.trace.Source#getName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.Source#getSid <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see es.unican.mast.xmlmast.trace.Source#getSid()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Sid();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.Source#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.unican.mast.xmlmast.trace.Source#getType()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Type();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.trace.SrcList <em>Src List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src List</em>'.
	 * @see es.unican.mast.xmlmast.trace.SrcList
	 * @generated
	 */
	EClass getSrcList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.trace.SrcList#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Src</em>'.
	 * @see es.unican.mast.xmlmast.trace.SrcList#getSrc()
	 * @see #getSrcList()
	 * @generated
	 */
	EReference getSrcList_Src();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.trace.TRACEFILEType <em>TRACEFILE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRACEFILE Type</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType
	 * @generated
	 */
	EClass getTRACEFILEType();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getMsgTypeList <em>Msg Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Msg Type List</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getMsgTypeList()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EReference getTRACEFILEType_MsgTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getSrcList <em>Src List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src List</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getSrcList()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EReference getTRACEFILEType_SrcList();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getMsgList <em>Msg List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Msg List</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getMsgList()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EReference getTRACEFILEType_MsgList();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getEndTime()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EAttribute getTRACEFILEType_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationDate <em>Generation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Date</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationDate()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EAttribute getTRACEFILEType_GenerationDate();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationProfile <em>Generation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Profile</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationProfile()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EAttribute getTRACEFILEType_GenerationProfile();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationTool <em>Generation Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Tool</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationTool()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EAttribute getTRACEFILEType_GenerationTool();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getModelDate <em>Model Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Date</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getModelDate()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EAttribute getTRACEFILEType_ModelDate();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getModelName()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EAttribute getTRACEFILEType_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see es.unican.mast.xmlmast.trace.TRACEFILEType#getStartTime()
	 * @see #getTRACEFILEType()
	 * @generated
	 */
	EAttribute getTRACEFILEType_StartTime();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='Date_Time' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>External Reference</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='External_Reference' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' pattern='([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*'"
	 * @generated
	 */
	EDataType getExternalReference();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Identifier' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' pattern='([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*'"
	 * @generated
	 */
	EDataType getIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Message Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Identifier</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Message_Identifier' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getMessageIdentifier();

	/**
	 * Returns the meta object for data type '<em>Source Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Source Identifier</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='Source_Identifier' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getSourceIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Source Identifier Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Source Identifier Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='Source_Identifier:Object' baseType='Source_Identifier'"
	 * @generated
	 */
	EDataType getSourceIdentifierObject();

	/**
	 * Returns the meta object for data type '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Time' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Time Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Time:Object' baseType='Time'"
	 * @generated
	 */
	EDataType getTimeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceFactory getTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.trace.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.DocumentRootImpl
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>TRACEFILE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRACEFILE = eINSTANCE.getDocumentRoot_TRACEFILE();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.trace.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.MessageImpl
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__M = eINSTANCE.getMessage_M();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__S = eINSTANCE.getMessage_S();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__T = eINSTANCE.getMessage_T();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.trace.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.MessageTypeImpl
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '<em><b>Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TYPE__MID = eINSTANCE.getMessageType_Mid();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TYPE__TYPE = eINSTANCE.getMessageType_Type();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.trace.impl.MsgListImpl <em>Msg List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.MsgListImpl
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMsgList()
		 * @generated
		 */
		EClass MSG_LIST = eINSTANCE.getMsgList();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_LIST__MSG = eINSTANCE.getMsgList_Msg();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.trace.impl.MsgTypeListImpl <em>Msg Type List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.MsgTypeListImpl
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMsgTypeList()
		 * @generated
		 */
		EClass MSG_TYPE_LIST = eINSTANCE.getMsgTypeList();

		/**
		 * The meta object literal for the '<em><b>Msg Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_TYPE_LIST__MSG_TYPE = eINSTANCE.getMsgTypeList_MsgType();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.trace.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.SourceImpl
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SID = eINSTANCE.getSource_Sid();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__TYPE = eINSTANCE.getSource_Type();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.trace.impl.SrcListImpl <em>Src List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.SrcListImpl
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getSrcList()
		 * @generated
		 */
		EClass SRC_LIST = eINSTANCE.getSrcList();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_LIST__SRC = eINSTANCE.getSrcList_Src();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl <em>TRACEFILE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getTRACEFILEType()
		 * @generated
		 */
		EClass TRACEFILE_TYPE = eINSTANCE.getTRACEFILEType();

		/**
		 * The meta object literal for the '<em><b>Msg Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEFILE_TYPE__MSG_TYPE_LIST = eINSTANCE.getTRACEFILEType_MsgTypeList();

		/**
		 * The meta object literal for the '<em><b>Src List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEFILE_TYPE__SRC_LIST = eINSTANCE.getTRACEFILEType_SrcList();

		/**
		 * The meta object literal for the '<em><b>Msg List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEFILE_TYPE__MSG_LIST = eINSTANCE.getTRACEFILEType_MsgList();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEFILE_TYPE__END_TIME = eINSTANCE.getTRACEFILEType_EndTime();

		/**
		 * The meta object literal for the '<em><b>Generation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEFILE_TYPE__GENERATION_DATE = eINSTANCE.getTRACEFILEType_GenerationDate();

		/**
		 * The meta object literal for the '<em><b>Generation Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEFILE_TYPE__GENERATION_PROFILE = eINSTANCE.getTRACEFILEType_GenerationProfile();

		/**
		 * The meta object literal for the '<em><b>Generation Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEFILE_TYPE__GENERATION_TOOL = eINSTANCE.getTRACEFILEType_GenerationTool();

		/**
		 * The meta object literal for the '<em><b>Model Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEFILE_TYPE__MODEL_DATE = eINSTANCE.getTRACEFILEType_ModelDate();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEFILE_TYPE__MODEL_NAME = eINSTANCE.getTRACEFILEType_ModelName();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEFILE_TYPE__START_TIME = eINSTANCE.getTRACEFILEType_StartTime();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>External Reference</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getExternalReference()
		 * @generated
		 */
		EDataType EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Message Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getMessageIdentifier()
		 * @generated
		 */
		EDataType MESSAGE_IDENTIFIER = eINSTANCE.getMessageIdentifier();

		/**
		 * The meta object literal for the '<em>Source Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getSourceIdentifier()
		 * @generated
		 */
		EDataType SOURCE_IDENTIFIER = eINSTANCE.getSourceIdentifier();

		/**
		 * The meta object literal for the '<em>Source Identifier Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getSourceIdentifierObject()
		 * @generated
		 */
		EDataType SOURCE_IDENTIFIER_OBJECT = eINSTANCE.getSourceIdentifierObject();

		/**
		 * The meta object literal for the '<em>Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getTime()
		 * @generated
		 */
		EDataType TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em>Time Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.trace.impl.TracePackageImpl#getTimeObject()
		 * @generated
		 */
		EDataType TIME_OBJECT = eINSTANCE.getTimeObject();

	}

} //TracePackage
