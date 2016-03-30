/**
 */
package org.muml.modelica.transform;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.modelica.transform.Map#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.modelica.transform.TransformPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.modelica.transform.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.muml.modelica.transform.TransformPackage#getMap_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let res : OrderedSet(muml::realtimestatechart::RealtimeStatechart) = entries->select(key = instance)->collect(value.oclAsType(muml::realtimestatechart::RealtimeStatechart))->asOrderedSet()\nin\nif res->isEmpty() then\n\tnull\nelse\n\tres->first()\nendif'"
	 * @generated
	 */
	RealtimeStatechart get(EObject instance);

} // Map
