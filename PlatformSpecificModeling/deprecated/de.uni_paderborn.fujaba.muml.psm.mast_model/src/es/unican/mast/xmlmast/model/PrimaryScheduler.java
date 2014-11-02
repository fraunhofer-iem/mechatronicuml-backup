/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getFixedPriorityScheduler <em>Fixed Priority Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getEDFScheduler <em>EDF Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getFPPacketBasedScheduler <em>FP Packet Based Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getHost <em>Host</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getPrimaryScheduler()
 * @model extendedMetaData="name='Primary_Scheduler' kind='elementOnly'"
 * @generated
 */
public interface PrimaryScheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed Priority Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Priority Scheduler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Priority Scheduler</em>' containment reference.
	 * @see #setFixedPriorityScheduler(FixedPriorityScheduler)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPrimaryScheduler_FixedPriorityScheduler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fixed_Priority_Scheduler' namespace='##targetNamespace'"
	 * @generated
	 */
	FixedPriorityScheduler getFixedPriorityScheduler();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getFixedPriorityScheduler <em>Fixed Priority Scheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Priority Scheduler</em>' containment reference.
	 * @see #getFixedPriorityScheduler()
	 * @generated
	 */
	void setFixedPriorityScheduler(FixedPriorityScheduler value);

	/**
	 * Returns the value of the '<em><b>EDF Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDF Scheduler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDF Scheduler</em>' containment reference.
	 * @see #setEDFScheduler(EDFScheduler)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPrimaryScheduler_EDFScheduler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EDF_Scheduler' namespace='##targetNamespace'"
	 * @generated
	 */
	EDFScheduler getEDFScheduler();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getEDFScheduler <em>EDF Scheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDF Scheduler</em>' containment reference.
	 * @see #getEDFScheduler()
	 * @generated
	 */
	void setEDFScheduler(EDFScheduler value);

	/**
	 * Returns the value of the '<em><b>FP Packet Based Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FP Packet Based Scheduler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FP Packet Based Scheduler</em>' containment reference.
	 * @see #setFPPacketBasedScheduler(FPPacketBasedScheduler)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPrimaryScheduler_FPPacketBasedScheduler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FP_Packet_Based_Scheduler' namespace='##targetNamespace'"
	 * @generated
	 */
	FPPacketBasedScheduler getFPPacketBasedScheduler();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getFPPacketBasedScheduler <em>FP Packet Based Scheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FP Packet Based Scheduler</em>' containment reference.
	 * @see #getFPPacketBasedScheduler()
	 * @generated
	 */
	void setFPPacketBasedScheduler(FPPacketBasedScheduler value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPrimaryScheduler_Host()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Host'"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPrimaryScheduler_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PrimaryScheduler
