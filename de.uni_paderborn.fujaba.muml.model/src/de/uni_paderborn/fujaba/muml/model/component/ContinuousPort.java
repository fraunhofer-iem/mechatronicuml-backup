/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a concrete port specification which provides the continuous functionality of a port.
 * \todosd{Add attributes and references in future releases.}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort()
 * @model
 * @generated
 */
public interface ContinuousPort extends Port {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.component.ContinousPortDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decides the direction of a continous port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinousPortDirectionKind
	 * @see #setKind(ContinousPortDirectionKind)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort_Kind()
	 * @model required="true"
	 * @generated
	 */
	ContinousPortDirectionKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinousPortDirectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ContinousPortDirectionKind value);
} // ContinuousPort
