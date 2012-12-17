/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of a pattern occurence. It specifies the behavior of discrete (single/multi) port instances that are connected with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance#getProtocolOccurrence <em>Protocol Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getCoordinationProtocolInstance()
 * @model
 * @generated
 */
public interface CoordinationProtocolInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instance that uses this pattern instance.
	 * 
	 * \todosd{I suggest to change this reference so that it references a DiscretePortInstance.}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getCoordinationProtocolInstance_PortInstances()
	 * @model required="true"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Protocol Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PatternOccurence of that instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Occurrence</em>' reference.
	 * @see #setProtocolOccurrence(CoordinationProtocolOccurrence)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getCoordinationProtocolInstance_ProtocolOccurrence()
	 * @model required="true"
	 * @generated
	 */
	CoordinationProtocolOccurrence getProtocolOccurrence();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance#getProtocolOccurrence <em>Protocol Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Occurrence</em>' reference.
	 * @see #getProtocolOccurrence()
	 * @generated
	 */
	void setProtocolOccurrence(CoordinationProtocolOccurrence value);

} // CoordinationProtocolInstance
