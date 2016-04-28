/**
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.NamedElement;
import org.muml.pm.hardware.hwplatform.HWPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware platform at instance level. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts <em>Delegation Ports</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getEmbeddedHPIC <em>Embedded HPIC</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getParentHPIC <em>Parent HPIC</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance()
 * @model
 * @generated
 */
public interface HWPlatformInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hwplatform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatform type of which this instance is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Type</em>' reference.
	 * @see #setHwplatformType(HWPlatform)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_HwplatformType()
	 * @model required="true"
	 * @generated
	 */
	HWPlatform getHwplatformType();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwplatform Type</em>' reference.
	 * @see #getHwplatformType()
	 * @generated
	 */
	void setHwplatformType(HWPlatform value);

	/**
	 * Returns the value of the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegation ports of this HWPlatformInstance. They are derived from the HWPlatform type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Ports</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_DelegationPorts()
	 * @see org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance
	 * @model opposite="parentHWPlatformInstance" containment="true"
	 * @generated
	 */
	EList<DelegationHWPortInstance> getDelegationPorts();

	/**
	 * Returns the value of the '<em><b>Embedded HPIC</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded HPIC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The embedded Hardware Platform Instance Configuration.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded HPIC</em>' containment reference.
	 * @see #setEmbeddedHPIC(HWPlatformInstanceConfiguration)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_EmbeddedHPIC()
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getParentHWPlatformInstance
	 * @model opposite="parentHWPlatformInstance" containment="true" required="true"
	 * @generated
	 */
	HWPlatformInstanceConfiguration getEmbeddedHPIC();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getEmbeddedHPIC <em>Embedded HPIC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded HPIC</em>' containment reference.
	 * @see #getEmbeddedHPIC()
	 * @generated
	 */
	void setEmbeddedHPIC(HWPlatformInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Parent HPIC</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances <em>Hwplatform Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent HPIC</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Hardware Platform Instance Configuration in which this HWPlatformInstance is embedded.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent HPIC</em>' container reference.
	 * @see #setParentHPIC(HWPlatformInstanceConfiguration)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_ParentHPIC()
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances
	 * @model opposite="hwplatformInstances" required="true" transient="false"
	 * @generated
	 */
	HWPlatformInstanceConfiguration getParentHPIC();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getParentHPIC <em>Parent HPIC</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent HPIC</em>' container reference.
	 * @see #getParentHPIC()
	 * @generated
	 */
	void setParentHPIC(HWPlatformInstanceConfiguration value);

} // HWPlatformInstance
