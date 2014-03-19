/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents a PlatformPart. 
 * PlatformParts are used to specify the inner structure of a HWPlatform.
 * A PlatformPart can be a HWPlatformPart or a ResourceInstancePart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getParentHWPlatform <em>Parent HW Platform</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getPlatformPart()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CardinalityLowerBoundSet CardinalityUpperBoundSet'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CardinalityLowerBoundSet='self.cardinality.lowerBound->notEmpty()' CardinalityUpperBoundSet='self.cardinality.upperBound->notEmpty()'"
 * @generated
 */
public interface PlatformPart extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent HW Platform</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatform, this PlatformPart belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent HW Platform</em>' container reference.
	 * @see #setParentHWPlatform(HWPlatform)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getPlatformPart_ParentHWPlatform()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getEmbeddedPlatformParts
	 * @model opposite="embeddedPlatformParts" required="true" transient="false"
	 * @generated
	 */
	HWPlatform getParentHWPlatform();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getParentHWPlatform <em>Parent HW Platform</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent HW Platform</em>' container reference.
	 * @see #getParentHWPlatform()
	 * @generated
	 */
	void setParentHWPlatform(HWPlatform value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of a PlatformPart determines how many instances are allowed to exist in the associated HWPlatformInstance at instance level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getPlatformPart_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // PlatformPart
