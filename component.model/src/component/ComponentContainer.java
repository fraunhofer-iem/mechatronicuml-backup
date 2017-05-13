/**
 */
package component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.ComponentContainer#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see component.ComponentPackage#getComponentContainer()
 * @model
 * @generated
 */
public interface ComponentContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link component.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see component.ComponentPackage#getComponentContainer_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // ComponentContainer
