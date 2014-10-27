/**
 */
package pattern;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * \todosd{document!}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.LegalConfiguration#getParameterBindings <em>Parameter Bindings</em>}</li>
 *   <li>{@link pattern.LegalConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.PatternPackage#getLegalConfiguration()
 * @model
 * @generated
 */
public interface LegalConfiguration extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see pattern.PatternPackage#getLegalConfiguration_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pattern.CoordinationPattern#getLegalConfigurations <em>Legal Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reverse reference to coordination pattern is required because it is easier for developing the dialogs and wizards. However, deriving it by finding out the parent is also a valid solution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see pattern.PatternPackage#getLegalConfiguration_CoordinationPattern()
	 * @see pattern.CoordinationPattern#getLegalConfigurations
	 * @model opposite="legalConfigurations" required="true" transient="false"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link pattern.LegalConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

} // LegalConfiguration
