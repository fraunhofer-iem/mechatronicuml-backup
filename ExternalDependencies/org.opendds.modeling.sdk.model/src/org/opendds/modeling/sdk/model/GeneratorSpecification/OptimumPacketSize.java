/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimum Packet Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getOptimumPacketSize()
 * @model
 * @generated
 */
public interface OptimumPacketSize extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"4096"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getOptimumPacketSize_Value()
	 * @model default="4096"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // OptimumPacketSize
