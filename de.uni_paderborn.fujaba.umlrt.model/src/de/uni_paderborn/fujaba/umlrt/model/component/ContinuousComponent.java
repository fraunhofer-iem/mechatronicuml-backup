/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a continuous component on the modeling level. Its purpose is to store a XML file which is created by the CAMEL tool and describes the continuous behavior of the component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ContinuousComponent#getXMLFileName <em>XML File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getContinuousComponent()
 * @model
 * @generated
 */
public interface ContinuousComponent extends Component {
	/**
	 * Returns the value of the '<em><b>XML File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The XML file describing the continuous behavior of this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XML File Name</em>' attribute.
	 * @see #setXMLFileName(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getContinuousComponent_XMLFileName()
	 * @model
	 * @generated
	 */
	String getXMLFileName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ContinuousComponent#getXMLFileName <em>XML File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XML File Name</em>' attribute.
	 * @see #getXMLFileName()
	 * @generated
	 */
	void setXMLFileName(String value);

} // ContinuousComponent
