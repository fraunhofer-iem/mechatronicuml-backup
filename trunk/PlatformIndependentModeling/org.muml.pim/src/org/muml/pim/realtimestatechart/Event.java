/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents all kinds of events that may occur in a statechart.
 * A event can either be a trigger event or a raise event.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.Event#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pim.realtimestatechart.EventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decides the kind: Is this a raise event or a trigger event?
	 * 
	 * A event may either be a trigger event or a raise event. A trigger event triggers 
	 * some action within the statechart, a raise event is generated by the statechart 
	 * and will be processed by another statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.muml.pim.realtimestatechart.EventKind
	 * @see #setKind(EventKind)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getEvent_Kind()
	 * @model
	 * @generated
	 */
	EventKind getKind();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Event#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.muml.pim.realtimestatechart.EventKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EventKind value);

} // Event
