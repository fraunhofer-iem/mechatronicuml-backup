/**
 */
package de.uni_paderborn.fujaba.modelica.m2t.transform;

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
 *   <li>{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Map#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.TransformPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.modelica.m2t.transform.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.TransformPackage#getMap_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let res : OrderedSet(realtimestatechart::RealtimeStatechart) = entries->select(key = instance)->collect(value.oclAsType(realtimestatechart::RealtimeStatechart))->asOrderedSet()\nin\nif res->isEmpty() then\n\tnull\nelse\n\tres->first()\nendif'"
	 * @generated
	 */
	RealtimeStatechart get(EObject instance);

} // Map
