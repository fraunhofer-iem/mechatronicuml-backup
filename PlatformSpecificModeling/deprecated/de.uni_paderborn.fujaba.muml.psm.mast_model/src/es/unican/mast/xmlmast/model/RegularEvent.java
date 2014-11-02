/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getMaxOutputJitterReq <em>Max Output Jitter Req</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getHardGlobalDeadline <em>Hard Global Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getSoftGlobalDeadline <em>Soft Global Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getGlobalMaxMissRatio <em>Global Max Miss Ratio</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getHardLocalDeadline <em>Hard Local Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getSoftLocalDeadline <em>Soft Local Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getLocalMaxMissRatio <em>Local Max Miss Ratio</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getCompositeTimingRequirement <em>Composite Timing Requirement</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularEvent#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent()
 * @model extendedMetaData="name='Regular_Event' kind='elementOnly'"
 * @generated
 */
public interface RegularEvent extends EObject {
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Max Output Jitter Req</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.MaxOutputJitterReq}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Output Jitter Req</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Output Jitter Req</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_MaxOutputJitterReq()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Max_Output_Jitter_Req' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MaxOutputJitterReq> getMaxOutputJitterReq();

	/**
	 * Returns the value of the '<em><b>Hard Global Deadline</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.HardGlobalDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hard Global Deadline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hard Global Deadline</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_HardGlobalDeadline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Hard_Global_Deadline' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<HardGlobalDeadline> getHardGlobalDeadline();

	/**
	 * Returns the value of the '<em><b>Soft Global Deadline</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.SoftGlobalDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Global Deadline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Global Deadline</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_SoftGlobalDeadline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Soft_Global_Deadline' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SoftGlobalDeadline> getSoftGlobalDeadline();

	/**
	 * Returns the value of the '<em><b>Global Max Miss Ratio</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Max Miss Ratio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Max Miss Ratio</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_GlobalMaxMissRatio()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Global_Max_Miss_Ratio' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalMaxMissRatio> getGlobalMaxMissRatio();

	/**
	 * Returns the value of the '<em><b>Hard Local Deadline</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.HardLocalDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hard Local Deadline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hard Local Deadline</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_HardLocalDeadline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Hard_Local_Deadline' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<HardLocalDeadline> getHardLocalDeadline();

	/**
	 * Returns the value of the '<em><b>Soft Local Deadline</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.SoftLocalDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Local Deadline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Local Deadline</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_SoftLocalDeadline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Soft_Local_Deadline' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SoftLocalDeadline> getSoftLocalDeadline();

	/**
	 * Returns the value of the '<em><b>Local Max Miss Ratio</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.LocalMaxMissRatio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Max Miss Ratio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Max Miss Ratio</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_LocalMaxMissRatio()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Local_Max_Miss_Ratio' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LocalMaxMissRatio> getLocalMaxMissRatio();

	/**
	 * Returns the value of the '<em><b>Composite Timing Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.CompositeTimingRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Timing Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Timing Requirement</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_CompositeTimingRequirement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Composite_Timing_Requirement' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CompositeTimingRequirement> getCompositeTimingRequirement();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularEvent_Event()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Event'"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularEvent#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // RegularEvent
