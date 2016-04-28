/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package railcab;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railcab.SectionControl#getRailcabs <em>Railcabs</em>}</li>
 * </ul>
 *
 * @see railcab.RailcabPackage#getSectionControl()
 * @model
 * @generated
 */
public interface SectionControl extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Railcabs</b></em>' reference list.
	 * The list contents are of type {@link railcab.RailCab}.
	 * It is bidirectional and its opposite is '{@link railcab.RailCab#getSectionControl <em>Section Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Railcabs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Railcabs</em>' reference list.
	 * @see railcab.RailcabPackage#getSectionControl_Railcabs()
	 * @see railcab.RailCab#getSectionControl
	 * @model opposite="sectionControl"
	 * @generated
	 */
	EList<RailCab> getRailcabs();

} // SectionControl
