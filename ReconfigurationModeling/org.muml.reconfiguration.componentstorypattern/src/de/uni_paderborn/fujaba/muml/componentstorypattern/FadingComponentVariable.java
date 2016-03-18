/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import de.uni_paderborn.fujaba.muml.reconfiguration.FadingComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.FadingFunction;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentVariable#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentVariable#getAppliedFadingFunction <em>Applied Fading Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getFadingComponentVariable()
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
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getFadingComponentVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	FadingComponent getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentVariable#getType <em>Type</em>}' reference.
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
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getFadingComponentVariable_AppliedFadingFunction()
	 * @model
	 * @generated
	 */
	FadingFunction getAppliedFadingFunction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentVariable#getAppliedFadingFunction <em>Applied Fading Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Fading Function</em>' reference.
	 * @see #getAppliedFadingFunction()
	 * @generated
	 */
	void setAppliedFadingFunction(FadingFunction value);

} // FadingComponentVariable
