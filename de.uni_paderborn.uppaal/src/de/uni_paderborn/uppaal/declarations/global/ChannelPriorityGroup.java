/**
 */
package de.uni_paderborn.uppaal.declarations.global;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Priority Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A list of synchronization channel variables, used to assign these channels a common priority.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.declarations.global.ChannelPriorityGroup#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.declarations.global.GlobalPackage#getChannelPriorityGroup()
 * @model
 * @generated
 */
public interface ChannelPriorityGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.uppaal.declarations.global.PriorityItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.uni_paderborn.uppaal.declarations.global.GlobalPackage#getChannelPriorityGroup_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PriorityItem> getItems();

} // ChannelPriorityGroup
