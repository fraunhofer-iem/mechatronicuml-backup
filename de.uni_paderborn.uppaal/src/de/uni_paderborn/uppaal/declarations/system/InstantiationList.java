/**
 */
package de.uni_paderborn.uppaal.declarations.system;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.uppaal.templates.AbstractTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a list of templates to be instantiated using a common priority.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.declarations.system.InstantiationList#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.declarations.system.SystemPackage#getInstantiationList()
 * @model
 * @generated
 */
public interface InstantiationList extends EObject {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.uppaal.templates.AbstractTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of instantiations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' reference list.
	 * @see de.uni_paderborn.uppaal.declarations.system.SystemPackage#getInstantiationList_Template()
	 * @model required="true"
	 * @generated
	 */
	EList<AbstractTemplate> getTemplate();

} // InstantiationList
