/**
 */
package de.uni_paderborn.fujaba.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.PropertyTab#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.PropertyTab#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.PropertyTab#getAfterTab <em>After Tab</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getPropertyTab()
 * @model
 * @generated
 */
public interface PropertyTab extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getPropertyTab_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.PropertyTab#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getPropertyTab_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.PropertyTab#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>After Tab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Tab</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Tab</em>' attribute.
	 * @see #setAfterTab(String)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getPropertyTab_AfterTab()
	 * @model
	 * @generated
	 */
	String getAfterTab();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.PropertyTab#getAfterTab <em>After Tab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Tab</em>' attribute.
	 * @see #getAfterTab()
	 * @generated
	 */
	void setAfterTab(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='generator.genModel.modelPluginId.concat(\'.\').concat(id)'"
	 * @generated
	 */
	String getQualifiedId();

} // PropertyTab
