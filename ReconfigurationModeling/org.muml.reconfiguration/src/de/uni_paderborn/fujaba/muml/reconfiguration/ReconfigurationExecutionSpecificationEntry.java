/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each ReconfigurationExecutionSpecificationEntry defines which reconfiguration should be executed upon the reception of a reconfiguration message and which guards to respect when deciding whether the reconfiguration is executable or not.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getMessage <em>Message</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getHybridPortMappings <em>Hybrid Port Mappings</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionSpecificationEntry()
 * @model
 * @generated
 */
public interface ReconfigurationExecutionSpecificationEntry extends DataType {
	/**
	 * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionSpecificationEntry_Guards()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReconfigurationConstraint> getGuards();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionSpecificationEntry_Message()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #setReconfigurationRule(ReconfigurationRule)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionSpecificationEntry_ReconfigurationRule()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurationRule getReconfigurationRule();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	void setReconfigurationRule(ReconfigurationRule value);

	/**
	 * Returns the value of the '<em><b>Hybrid Port Mappings</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.HybridPortMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hybrid Port Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hybrid Port Mappings</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionSpecificationEntry_HybridPortMappings()
	 * @model
	 * @generated
	 */
	EList<HybridPortMapping> getHybridPortMappings();

} // ReconfigurationExecutionSpecificationEntry
