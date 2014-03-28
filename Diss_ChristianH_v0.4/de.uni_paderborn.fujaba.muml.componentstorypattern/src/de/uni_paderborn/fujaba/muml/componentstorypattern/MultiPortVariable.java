/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Port Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getSubPortVariables <em>Sub Port Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getGmfSubPortVariables <em>Gmf Sub Port Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortVariable()
 * @model
 * @generated
 */
public interface MultiPortVariable extends PortVariable {
	/**
	 * Returns the value of the '<em><b>Sub Port Variables</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all sub-portVariables of the multi-portVariable. The sub-portVariables are represented by SinglePortVariables. \todosd{Why is this not a containment reference?}"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Port Variables</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortVariable_SubPortVariables()
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable#getMultiPortVariable
	 * @model opposite="multiPortVariable"
	 * @generated
	 */
	EList<SinglePortVariable> getSubPortVariables();

	/**
	 * Returns the value of the '<em><b>Gmf Sub Port Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference just derives the values of "subPortVariables" and specifies a containment. This containment reference is needed by the GMF tooling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Sub Port Variables</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortVariable_GmfSubPortVariables()
	 * @model containment="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.subPortVariables'"
	 * @generated
	 */
	EList<SinglePortVariable> getGmfSubPortVariables();

} // MultiPortVariable
