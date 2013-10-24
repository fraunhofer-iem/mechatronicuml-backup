/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a link port at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance#getConnectedLink <em>Connected Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getLinkPortInstance()
 * @model
 * @generated
 */
public interface LinkPortInstance extends HWPortInstance {
	/**
	 * Returns the value of the '<em><b>Connected Link</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Link that is connected to this LinkPortInstance.
	 * It is derived from the reference connectedMedia of the super class HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Link</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getLinkPortInstance_ConnectedLink()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectedMedia->select(m|m.oclIsTypeOf(platform::Link)).oclAsType(platform::Link)->asOrderedSet()'"
	 * @generated
	 */
	EList<Link> getConnectedLink();

} // LinkPortInstance
