/**
 */
package gmfext;

import de.uni_paderborn.fujaba.properties.PropertyGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Muml GMF Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gmfext.MumlGMFExtension#getPropertyGenerator <em>Property Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see gmfext.GmfextPackage#getMumlGMFExtension()
 * @model
 * @generated
 */
public interface MumlGMFExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Generator</em>' reference.
	 * @see #setPropertyGenerator(PropertyGenerator)
	 * @see gmfext.GmfextPackage#getMumlGMFExtension_PropertyGenerator()
	 * @model required="true"
	 * @generated
	 */
	PropertyGenerator getPropertyGenerator();

	/**
	 * Sets the value of the '{@link gmfext.MumlGMFExtension#getPropertyGenerator <em>Property Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Generator</em>' reference.
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	void setPropertyGenerator(PropertyGenerator value);

} // MumlGMFExtension
