/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Scheduling Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getNonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getFixedPriorityPolicy <em>Fixed Priority Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getInterruptFPPolicy <em>Interrupt FP Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getPollingPolicy <em>Polling Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getSporadicServerPolicy <em>Sporadic Server Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getEDFPolicy <em>EDF Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getSRPParameters <em>SRP Parameters</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer()
 * @model extendedMetaData="name='Regular_Scheduling_Server' kind='elementOnly'"
 * @generated
 */
public interface RegularSchedulingServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Non Preemptible FP Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Preemptible FP Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Preemptible FP Policy</em>' containment reference.
	 * @see #setNonPreemptibleFPPolicy(NonPreemptibleFPPolicy)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_NonPreemptibleFPPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Non_Preemptible_FP_Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	NonPreemptibleFPPolicy getNonPreemptibleFPPolicy();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getNonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Preemptible FP Policy</em>' containment reference.
	 * @see #getNonPreemptibleFPPolicy()
	 * @generated
	 */
	void setNonPreemptibleFPPolicy(NonPreemptibleFPPolicy value);

	/**
	 * Returns the value of the '<em><b>Fixed Priority Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Priority Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Priority Policy</em>' containment reference.
	 * @see #setFixedPriorityPolicy(FixedPriorityPolicy)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_FixedPriorityPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fixed_Priority_Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	FixedPriorityPolicy getFixedPriorityPolicy();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getFixedPriorityPolicy <em>Fixed Priority Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Priority Policy</em>' containment reference.
	 * @see #getFixedPriorityPolicy()
	 * @generated
	 */
	void setFixedPriorityPolicy(FixedPriorityPolicy value);

	/**
	 * Returns the value of the '<em><b>Interrupt FP Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupt FP Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt FP Policy</em>' containment reference.
	 * @see #setInterruptFPPolicy(InterruptFPPolicy)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_InterruptFPPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interrupt_FP_Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	InterruptFPPolicy getInterruptFPPolicy();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getInterruptFPPolicy <em>Interrupt FP Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt FP Policy</em>' containment reference.
	 * @see #getInterruptFPPolicy()
	 * @generated
	 */
	void setInterruptFPPolicy(InterruptFPPolicy value);

	/**
	 * Returns the value of the '<em><b>Polling Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Policy</em>' containment reference.
	 * @see #setPollingPolicy(PollingPolicy)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_PollingPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Polling_Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	PollingPolicy getPollingPolicy();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getPollingPolicy <em>Polling Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Policy</em>' containment reference.
	 * @see #getPollingPolicy()
	 * @generated
	 */
	void setPollingPolicy(PollingPolicy value);

	/**
	 * Returns the value of the '<em><b>Sporadic Server Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sporadic Server Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sporadic Server Policy</em>' containment reference.
	 * @see #setSporadicServerPolicy(SporadicServerPolicy)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_SporadicServerPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sporadic_Server_Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	SporadicServerPolicy getSporadicServerPolicy();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getSporadicServerPolicy <em>Sporadic Server Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sporadic Server Policy</em>' containment reference.
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	void setSporadicServerPolicy(SporadicServerPolicy value);

	/**
	 * Returns the value of the '<em><b>EDF Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDF Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDF Policy</em>' containment reference.
	 * @see #setEDFPolicy(EDFPolicy)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_EDFPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EDF_Policy' namespace='##targetNamespace'"
	 * @generated
	 */
	EDFPolicy getEDFPolicy();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getEDFPolicy <em>EDF Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDF Policy</em>' containment reference.
	 * @see #getEDFPolicy()
	 * @generated
	 */
	void setEDFPolicy(EDFPolicy value);

	/**
	 * Returns the value of the '<em><b>SRP Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SRP Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SRP Parameters</em>' containment reference.
	 * @see #setSRPParameters(SRPParameters)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_SRPParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SRP_Parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	SRPParameters getSRPParameters();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getSRPParameters <em>SRP Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRP Parameters</em>' containment reference.
	 * @see #getSRPParameters()
	 * @generated
	 */
	void setSRPParameters(SRPParameters value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' attribute.
	 * @see #setScheduler(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularSchedulingServer_Scheduler()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Scheduler'"
	 * @generated
	 */
	String getScheduler();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getScheduler <em>Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' attribute.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(String value);

} // RegularSchedulingServer
