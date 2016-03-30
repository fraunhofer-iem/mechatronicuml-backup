/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import de.uni_paderborn.fujaba.muml.component.HybridPort;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A HybridPortMapping maps a hybrid port to a function expressing the approximated development of the signal it receives
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.HybridPortMapping#getHybridPort <em>Hybrid Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.HybridPortMapping#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getHybridPortMapping()
 * @model
 * @generated
 */
public interface HybridPortMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hybrid Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hybrid Port</em>' reference.
	 * @see #setHybridPort(HybridPort)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getHybridPortMapping_HybridPort()
	 * @model required="true"
	 * @generated
	 */
	HybridPort getHybridPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.HybridPortMapping#getHybridPort <em>Hybrid Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hybrid Port</em>' reference.
	 * @see #getHybridPort()
	 * @generated
	 */
	void setHybridPort(HybridPort value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Expression)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getHybridPortMapping_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFunction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.HybridPortMapping#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Expression value);

} // HybridPortMapping
