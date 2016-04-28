/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.NamedElement;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.BindingState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Pattern Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingState <em>Binding State</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPatternVariable()
 * @model
 * @generated
 */
public interface ComponentStoryPatternVariable extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
	 * The default value is <code>"MANDATORY"</code>.
	 * The literals are from the enumeration {@link org.muml.storydiagram.patterns.BindingSemantics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingSemantics
	 * @see #setBindingSemantics(BindingSemantics)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPatternVariable_BindingSemantics()
	 * @model default="MANDATORY"
	 * @generated
	 */
	BindingSemantics getBindingSemantics();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingSemantics
	 * @see #getBindingSemantics()
	 * @generated
	 */
	void setBindingSemantics(BindingSemantics value);

	/**
	 * Returns the value of the '<em><b>Binding Operator</b></em>' attribute.
	 * The default value is <code>"CHECK_ONLY"</code>.
	 * The literals are from the enumeration {@link org.muml.storydiagram.patterns.BindingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Operator</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingOperator
	 * @see #setBindingOperator(BindingOperator)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPatternVariable_BindingOperator()
	 * @model default="CHECK_ONLY"
	 * @generated
	 */
	BindingOperator getBindingOperator();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Operator</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingOperator
	 * @see #getBindingOperator()
	 * @generated
	 */
	void setBindingOperator(BindingOperator value);

	/**
	 * Returns the value of the '<em><b>Binding State</b></em>' attribute.
	 * The default value is <code>"UNBOUND"</code>.
	 * The literals are from the enumeration {@link org.muml.storydiagram.patterns.BindingState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding State</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingState
	 * @see #setBindingState(BindingState)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPatternVariable_BindingState()
	 * @model default="UNBOUND"
	 * @generated
	 */
	BindingState getBindingState();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPatternVariable#getBindingState <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding State</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingState
	 * @see #getBindingState()
	 * @generated
	 */
	void setBindingState(BindingState value);

} // ComponentStoryPatternVariable
