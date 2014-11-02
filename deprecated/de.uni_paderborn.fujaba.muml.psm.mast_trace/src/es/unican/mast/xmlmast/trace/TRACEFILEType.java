/**
 */
package es.unican.mast.xmlmast.trace;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRACEFILE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getMsgTypeList <em>Msg Type List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getSrcList <em>Src List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getMsgList <em>Msg List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getEndTime <em>End Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationDate <em>Generation Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationProfile <em>Generation Profile</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationTool <em>Generation Tool</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getModelDate <em>Model Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getStartTime <em>Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType()
 * @model extendedMetaData="name='TRACE_FILE_._type' kind='elementOnly'"
 * @generated
 */
public interface TRACEFILEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Msg Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Type List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Type List</em>' containment reference.
	 * @see #setMsgTypeList(MsgTypeList)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_MsgTypeList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Msg_Type_List' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgTypeList getMsgTypeList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getMsgTypeList <em>Msg Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Type List</em>' containment reference.
	 * @see #getMsgTypeList()
	 * @generated
	 */
	void setMsgTypeList(MsgTypeList value);

	/**
	 * Returns the value of the '<em><b>Src List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src List</em>' containment reference.
	 * @see #setSrcList(SrcList)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_SrcList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Src_List' namespace='##targetNamespace'"
	 * @generated
	 */
	SrcList getSrcList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getSrcList <em>Src List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src List</em>' containment reference.
	 * @see #getSrcList()
	 * @generated
	 */
	void setSrcList(SrcList value);

	/**
	 * Returns the value of the '<em><b>Msg List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg List</em>' containment reference.
	 * @see #setMsgList(MsgList)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_MsgList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Msg_List' namespace='##targetNamespace'"
	 * @generated
	 */
	MsgList getMsgList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getMsgList <em>Msg List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg List</em>' containment reference.
	 * @see #getMsgList()
	 * @generated
	 */
	void setMsgList(MsgList value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #isSetEndTime()
	 * @see #unsetEndTime()
	 * @see #setEndTime(float)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_EndTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.trace.Time" required="true"
	 *        extendedMetaData="kind='attribute' name='End_Time'"
	 * @generated
	 */
	float getEndTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #isSetEndTime()
	 * @see #unsetEndTime()
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndTime()
	 * @see #getEndTime()
	 * @see #setEndTime(float)
	 * @generated
	 */
	void unsetEndTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getEndTime <em>End Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Time</em>' attribute is set.
	 * @see #unsetEndTime()
	 * @see #getEndTime()
	 * @see #setEndTime(float)
	 * @generated
	 */
	boolean isSetEndTime();

	/**
	 * Returns the value of the '<em><b>Generation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Date</em>' attribute.
	 * @see #setGenerationDate(XMLGregorianCalendar)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_GenerationDate()
	 * @model dataType="es.unican.mast.xmlmast.trace.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='Generation_Date'"
	 * @generated
	 */
	XMLGregorianCalendar getGenerationDate();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationDate <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Date</em>' attribute.
	 * @see #getGenerationDate()
	 * @generated
	 */
	void setGenerationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Generation Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Profile</em>' attribute.
	 * @see #setGenerationProfile(String)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_GenerationProfile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Generation_Profile'"
	 * @generated
	 */
	String getGenerationProfile();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationProfile <em>Generation Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Profile</em>' attribute.
	 * @see #getGenerationProfile()
	 * @generated
	 */
	void setGenerationProfile(String value);

	/**
	 * Returns the value of the '<em><b>Generation Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Tool</em>' attribute.
	 * @see #setGenerationTool(String)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_GenerationTool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Generation_Tool'"
	 * @generated
	 */
	String getGenerationTool();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getGenerationTool <em>Generation Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Tool</em>' attribute.
	 * @see #getGenerationTool()
	 * @generated
	 */
	void setGenerationTool(String value);

	/**
	 * Returns the value of the '<em><b>Model Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Date</em>' attribute.
	 * @see #setModelDate(XMLGregorianCalendar)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_ModelDate()
	 * @model dataType="es.unican.mast.xmlmast.trace.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='Model_Date'"
	 * @generated
	 */
	XMLGregorianCalendar getModelDate();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getModelDate <em>Model Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Date</em>' attribute.
	 * @see #getModelDate()
	 * @generated
	 */
	void setModelDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_ModelName()
	 * @model dataType="es.unican.mast.xmlmast.trace.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Model_Name'"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #isSetStartTime()
	 * @see #unsetStartTime()
	 * @see #setStartTime(float)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getTRACEFILEType_StartTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.trace.Time" required="true"
	 *        extendedMetaData="kind='attribute' name='Start_Time'"
	 * @generated
	 */
	float getStartTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #isSetStartTime()
	 * @see #unsetStartTime()
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartTime()
	 * @see #getStartTime()
	 * @see #setStartTime(float)
	 * @generated
	 */
	void unsetStartTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.trace.TRACEFILEType#getStartTime <em>Start Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Time</em>' attribute is set.
	 * @see #unsetStartTime()
	 * @see #getStartTime()
	 * @see #setStartTime(float)
	 * @generated
	 */
	boolean isSetStartTime();

} // TRACEFILEType
