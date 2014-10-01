/**
 */
package es.unican.mast.xmlmast.model;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MASTMODEL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getRegularProcessor <em>Regular Processor</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getPacketBasedNetwork <em>Packet Based Network</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getRegularSchedulingServer <em>Regular Scheduling Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getImmediateCeilingResource <em>Immediate Ceiling Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getPriorityInheritanceResource <em>Priority Inheritance Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getSRPResource <em>SRP Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getSimpleOperation <em>Simple Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getMessageTransmission <em>Message Transmission</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getCompositeOperation <em>Composite Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getEnclosingOperation <em>Enclosing Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getRegularTransaction <em>Regular Transaction</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getPrimaryScheduler <em>Primary Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getSecondaryScheduler <em>Secondary Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getModelDate <em>Model Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MASTMODELType#getSystemPiPBehaviour <em>System Pi PBehaviour</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType()
 * @model extendedMetaData="name='MAST_MODEL_._type' kind='elementOnly'"
 * @generated
 */
public interface MASTMODELType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Regular Processor</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.RegularProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Processor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Processor</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_RegularProcessor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Regular_Processor' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RegularProcessor> getRegularProcessor();

	/**
	 * Returns the value of the '<em><b>Packet Based Network</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.PacketBasedNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Based Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Based Network</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_PacketBasedNetwork()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Packet_Based_Network' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PacketBasedNetwork> getPacketBasedNetwork();

	/**
	 * Returns the value of the '<em><b>Regular Scheduling Server</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.RegularSchedulingServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Scheduling Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Scheduling Server</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_RegularSchedulingServer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Regular_Scheduling_Server' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RegularSchedulingServer> getRegularSchedulingServer();

	/**
	 * Returns the value of the '<em><b>Immediate Ceiling Resource</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.ImmediateCeilingResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate Ceiling Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Ceiling Resource</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_ImmediateCeilingResource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Immediate_Ceiling_Resource' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ImmediateCeilingResource> getImmediateCeilingResource();

	/**
	 * Returns the value of the '<em><b>Priority Inheritance Resource</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.PriorityInheritanceResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Inheritance Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Inheritance Resource</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_PriorityInheritanceResource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Priority_Inheritance_Resource' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PriorityInheritanceResource> getPriorityInheritanceResource();

	/**
	 * Returns the value of the '<em><b>SRP Resource</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.SRPResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SRP Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SRP Resource</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_SRPResource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SRP_Resource' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SRPResource> getSRPResource();

	/**
	 * Returns the value of the '<em><b>Simple Operation</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.SimpleOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Operation</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_SimpleOperation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Simple_Operation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SimpleOperation> getSimpleOperation();

	/**
	 * Returns the value of the '<em><b>Message Transmission</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.MessageTransmission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Transmission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Transmission</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_MessageTransmission()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Message_Transmission' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MessageTransmission> getMessageTransmission();

	/**
	 * Returns the value of the '<em><b>Composite Operation</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.CompositeOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Operation</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_CompositeOperation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Composite_Operation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CompositeOperation> getCompositeOperation();

	/**
	 * Returns the value of the '<em><b>Enclosing Operation</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.EnclosingOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Operation</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_EnclosingOperation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Enclosing_Operation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EnclosingOperation> getEnclosingOperation();

	/**
	 * Returns the value of the '<em><b>Regular Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.RegularTransaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Transaction</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_RegularTransaction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Regular_Transaction' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RegularTransaction> getRegularTransaction();

	/**
	 * Returns the value of the '<em><b>Primary Scheduler</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.PrimaryScheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Scheduler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Scheduler</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_PrimaryScheduler()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Primary_Scheduler' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PrimaryScheduler> getPrimaryScheduler();

	/**
	 * Returns the value of the '<em><b>Secondary Scheduler</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.SecondaryScheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Scheduler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Scheduler</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_SecondaryScheduler()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Secondary_Scheduler' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SecondaryScheduler> getSecondaryScheduler();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_ModelDate()
	 * @model dataType="es.unican.mast.xmlmast.model.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='Model_Date'"
	 * @generated
	 */
	XMLGregorianCalendar getModelDate();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MASTMODELType#getModelDate <em>Model Date</em>}' attribute.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_ModelName()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Model_Name'"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MASTMODELType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>System Pi PBehaviour</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.PriorityInheritanceProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Pi PBehaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Pi PBehaviour</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceProtocol
	 * @see #isSetSystemPiPBehaviour()
	 * @see #unsetSystemPiPBehaviour()
	 * @see #setSystemPiPBehaviour(PriorityInheritanceProtocol)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMASTMODELType_SystemPiPBehaviour()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='System_PiP_Behaviour'"
	 * @generated
	 */
	PriorityInheritanceProtocol getSystemPiPBehaviour();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MASTMODELType#getSystemPiPBehaviour <em>System Pi PBehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Pi PBehaviour</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceProtocol
	 * @see #isSetSystemPiPBehaviour()
	 * @see #unsetSystemPiPBehaviour()
	 * @see #getSystemPiPBehaviour()
	 * @generated
	 */
	void setSystemPiPBehaviour(PriorityInheritanceProtocol value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.MASTMODELType#getSystemPiPBehaviour <em>System Pi PBehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSystemPiPBehaviour()
	 * @see #getSystemPiPBehaviour()
	 * @see #setSystemPiPBehaviour(PriorityInheritanceProtocol)
	 * @generated
	 */
	void unsetSystemPiPBehaviour();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.MASTMODELType#getSystemPiPBehaviour <em>System Pi PBehaviour</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>System Pi PBehaviour</em>' attribute is set.
	 * @see #unsetSystemPiPBehaviour()
	 * @see #getSystemPiPBehaviour()
	 * @see #setSystemPiPBehaviour(PriorityInheritanceProtocol)
	 * @generated
	 */
	boolean isSetSystemPiPBehaviour();

} // MASTMODELType
