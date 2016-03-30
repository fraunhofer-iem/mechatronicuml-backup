/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.GenComponentInstance#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.GenComponentInstance#getInitCommands <em>Init Commands</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.GenComponentInstance#getGenPortInstances <em>Gen Port Instances</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenComponentInstance()
 * @model
 * @generated
 */
public interface GenComponentInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenComponentInstance_ComponentInstance()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.GenComponentInstance#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Init Commands</b></em>' reference list.
	 * The list contents are of type {@link org.muml.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Commands</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenComponentInstance_InitCommands()
	 * @model
	 * @generated
	 */
	EList<Expression> getInitCommands();

	/**
	 * Returns the value of the '<em><b>Gen Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.codegen.GenPortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Port Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Port Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenComponentInstance_GenPortInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenPortInstance> getGenPortInstances();

} // GenComponentInstance
