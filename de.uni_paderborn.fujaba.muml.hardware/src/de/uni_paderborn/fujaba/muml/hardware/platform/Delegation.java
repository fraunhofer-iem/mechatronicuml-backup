/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a delegation.
 *  A delegation connects a hwport of a StructuredResourceInstance and a port of 
 * HWPlatform that contains the StructuredResourceInstance.
 * A delegation has no behavior.
 * At runtime level, the port of the HWPlatform and the port of the StructuredResourceInstance will be the same. 
 * It is used as a technique for encapsulation of a HWPlatform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortInstance <em>Hw Port Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortPart <em>Hw Port Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getDelegation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL HWPortInstanceToDelegationPort='self.hwPortInstance.isDelegationPort'"
 * @generated
 */
public interface Delegation extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Hw Port Instance</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstances that are connected via this delegation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hw Port Instance</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getDelegation_HwPortInstance()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getDelegation
	 * @model opposite="delegation" required="true" upper="2"
	 * @generated
	 */
	EList<HWPortInstance> getHwPortInstance();

	/**
	 * Returns the value of the '<em><b>Hw Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Port Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortPart to which this delegation is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hw Port Part</em>' reference.
	 * @see #setHwPortPart(HWPortPart)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getDelegation_HwPortPart()
	 * @model required="true"
	 * @generated
	 */
	HWPortPart getHwPortPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortPart <em>Hw Port Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Port Part</em>' reference.
	 * @see #getHwPortPart()
	 * @generated
	 */
	void setHwPortPart(HWPortPart value);

} // Delegation
