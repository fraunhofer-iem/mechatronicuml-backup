/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import de.uni_paderborn.fujaba.muml.model.core.TimeValue;


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
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridInPort <em>Is Hybrid In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridOutPort <em>Is Hybrid Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#getSamplingInterval <em>Sampling Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getHybridPort()
 * @model
 * @generated
 */
public interface HybridPort extends DirectedTypedPort {

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- derive from superclass ContinuousPort\r\nself.isContinuousInPort'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- derive from superclass ContinuousPort\r\nself.isContinuousOutPort'"
	 * @generated
	 */
	boolean isIsHybridOutPort();

	/**
	 * Returns the value of the '<em><b>Sampling Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sampling interval defines the time between two updates of the continuous signal which is received or send by this hybrid port. If the port is an IN-port, the sampling interval defines how often the continuous signal is read and stored internally. If the hybrid port in an OUT-port, the sampling interval defines how often a new value is send via this port. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sampling Interval</em>' containment reference.
	 * @see #setSamplingInterval(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getHybridPort_SamplingInterval()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getSamplingInterval();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#getSamplingInterval <em>Sampling Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Interval</em>' containment reference.
	 * @see #getSamplingInterval()
	 * @generated
	 */
	void setSamplingInterval(TimeValue value);
} // HybridPort
