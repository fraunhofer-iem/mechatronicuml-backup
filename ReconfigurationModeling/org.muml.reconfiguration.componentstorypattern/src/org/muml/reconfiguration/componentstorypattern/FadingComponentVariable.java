/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.muml.reconfiguration.FadingComponent;
import org.muml.reconfiguration.FadingFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fading Component Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FadingComponentVariable refers to a FadingComponent and enables to 
 * specify a FadingFunction that needs to be carried out as part of the reconfiguration.
 * FadingComponentVariables may only be contained in ControllerExchangeNodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.FadingComponentVariable#getType <em>Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.FadingComponentVariable#getAppliedFadingFunction <em>Applied Fading Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getFadingComponentVariable()
 * @model
 * @generated
 */
public interface FadingComponentVariable extends ComponentStoryPatternVariable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(FadingComponent)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getFadingComponentVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	FadingComponent getType();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.FadingComponentVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(FadingComponent value);

	/**
	 * Returns the value of the '<em><b>Applied Fading Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Fading Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Fading Function</em>' reference.
	 * @see #setAppliedFadingFunction(FadingFunction)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getFadingComponentVariable_AppliedFadingFunction()
	 * @model
	 * @generated
	 */
	FadingFunction getAppliedFadingFunction();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.FadingComponentVariable#getAppliedFadingFunction <em>Applied Fading Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Fading Function</em>' reference.
	 * @see #getAppliedFadingFunction()
	 * @generated
	 */
	void setAppliedFadingFunction(FadingFunction value);

} // FadingComponentVariable
