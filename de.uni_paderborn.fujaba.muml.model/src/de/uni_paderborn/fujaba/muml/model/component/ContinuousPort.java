/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a concrete port specification which provides the 
 * continuous functionality of a port. A continuous port emits a signal value.
 * A signal value has a data type and it has concrete values at all points in time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousInPort <em>Is Continuous In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousOutPort <em>Is Continuous Out Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort()
 * @model
 * @generated
 */
public interface ContinuousPort extends DirectedTypedPort {

	/**
	 * Returns the value of the '<em><b>Is Continuous In Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the continuous port is an IN port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Continuous In Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort_IsContinuousInPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.kind = component::ContinuousPortDirectionKind::IN'"
	 * @generated
	 */
	boolean isIsContinuousInPort();

	/**
	 * Returns the value of the '<em><b>Is Continuous Out Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the continuous port is an OUT port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Continuous Out Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort_IsContinuousOutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.kind = component::ContinuousPortDirectionKind::OUT'"
	 * @generated
	 */
	boolean isIsContinuousOutPort();
} // ContinuousPort
