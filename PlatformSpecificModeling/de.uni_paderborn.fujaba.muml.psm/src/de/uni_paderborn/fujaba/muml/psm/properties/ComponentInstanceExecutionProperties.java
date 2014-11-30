/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance Execution Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getWcet <em>Wcet</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getCodeMem <em>Code Mem</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getRamMem <em>Ram Mem</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getComponentInstanceExecutionProperties()
 * @model
 * @generated
 */
public interface ComponentInstanceExecutionProperties extends EObject {
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
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getComponentInstanceExecutionProperties_ComponentInstance()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.properties.WCETpair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wcet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getComponentInstanceExecutionProperties_Wcet()
	 * @model containment="true"
	 * @generated
	 */
	EList<WCETpair> getWcet();

	/**
	 * Returns the value of the '<em><b>Code Mem</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Mem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Mem</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getComponentInstanceExecutionProperties_CodeMem()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryPair> getCodeMem();

	/**
	 * Returns the value of the '<em><b>Ram Mem</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Mem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Mem</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getComponentInstanceExecutionProperties_RamMem()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryPair> getRamMem();

} // ComponentInstanceExecutionProperties
