/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hybrid port which acts as a bridge between continuous
 * controllers and discrete software. A hybrid port emits or receives a signal value 
 * which has a data type and a concrete value at all points in time. Then, the
 * hybrid port discretizes the signal value in given time intervals and provides the
 * value as variable to its Real-Time Statechart. The hybrid port does not define message
 * interfaces.
 * \todosd{Add attributes and references in future releases.}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridInPort <em>Is Hybrid In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridOutPort <em>Is Hybrid Out Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getHybridPort()
 * @model
 * @generated
 */
public interface HybridPort extends DiscretePort, ContinuousPort {

	/**
	 * Returns the value of the '<em><b>Is Hybrid In Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the hybrid port is an IN port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Hybrid In Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getHybridPort_IsHybridInPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- XXX: is this the definition of an IN port?\nself.isContinuousInPort'"
	 * @generated
	 */
	boolean isIsHybridInPort();

	/**
	 * Returns the value of the '<em><b>Is Hybrid Out Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the hybrid port is an OUT port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Hybrid Out Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getHybridPort_IsHybridOutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- XXX: is this the definition of an OUT port?\nself.isContinuousOutPort'"
	 * @generated
	 */
	boolean isIsHybridOutPort();
} // HybridPort
