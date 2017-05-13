/**
 */
package instance;

import component.Component;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.ComponentInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link instance.ComponentInstance#getSubComponentInstances <em>Sub Component Instances</em>}</li>
 *   <li>{@link instance.ComponentInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_PortInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Sub Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Component Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Component Instances</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_SubComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getSubComponentInstances();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see instance.InstancePackage#getComponentInstance_Type()
	 * @model
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link instance.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

} // ComponentInstance
