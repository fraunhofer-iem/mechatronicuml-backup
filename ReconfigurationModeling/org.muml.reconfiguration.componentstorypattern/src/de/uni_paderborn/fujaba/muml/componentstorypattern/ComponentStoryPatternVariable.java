/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;
import org.storydriven.storydiagrams.patterns.BindingState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Pattern Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingState <em>Binding State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPatternVariable()
 * @model
 * @generated
 */
public interface ComponentStoryPatternVariable extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
	 * The default value is <code>"MANDATORY"</code>.
	 * The literals are from the enumeration {@link org.storydriven.storydiagrams.patterns.BindingSemantics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingSemantics
	 * @see #setBindingSemantics(BindingSemantics)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPatternVariable_BindingSemantics()
	 * @model default="MANDATORY"
	 * @generated
	 */
	BindingSemantics getBindingSemantics();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingSemantics
	 * @see #getBindingSemantics()
	 * @generated
	 */
	void setBindingSemantics(BindingSemantics value);

	/**
	 * Returns the value of the '<em><b>Binding Operator</b></em>' attribute.
	 * The default value is <code>"CHECK_ONLY"</code>.
	 * The literals are from the enumeration {@link org.storydriven.storydiagrams.patterns.BindingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Operator</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingOperator
	 * @see #setBindingOperator(BindingOperator)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPatternVariable_BindingOperator()
	 * @model default="CHECK_ONLY"
	 * @generated
	 */
	BindingOperator getBindingOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Operator</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingOperator
	 * @see #getBindingOperator()
	 * @generated
	 */
	void setBindingOperator(BindingOperator value);

	/**
	 * Returns the value of the '<em><b>Binding State</b></em>' attribute.
	 * The default value is <code>"UNBOUND"</code>.
	 * The literals are from the enumeration {@link org.storydriven.storydiagrams.patterns.BindingState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding State</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingState
	 * @see #setBindingState(BindingState)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPatternVariable_BindingState()
	 * @model default="UNBOUND"
	 * @generated
	 */
	BindingState getBindingState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable#getBindingState <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding State</em>' attribute.
	 * @see org.storydriven.storydiagrams.patterns.BindingState
	 * @see #getBindingState()
	 * @generated
	 */
	void setBindingState(BindingState value);

} // ComponentStoryPatternVariable
