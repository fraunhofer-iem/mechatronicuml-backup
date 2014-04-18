/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the super class of all resource types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource#getHwports <em>Hwports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hwports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParentResource <em>Parent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPort of this ResourceType.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getResource_Hwports()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParentResource
	 * @model opposite="parentResource" containment="true"
	 * @generated
	 */
	EList<HWPort> getHwports();

} // Resource
