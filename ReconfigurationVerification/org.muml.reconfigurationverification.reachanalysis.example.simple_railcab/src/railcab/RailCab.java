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
 * A representation of the model object '<em><b>Rail Cab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railcab.RailCab#getMember <em>Member</em>}</li>
 *   <li>{@link railcab.RailCab#getSectionControl <em>Section Control</em>}</li>
 *   <li>{@link railcab.RailCab#isIsLeader <em>Is Leader</em>}</li>
 *   <li>{@link railcab.RailCab#getLeader <em>Leader</em>}</li>
 * </ul>
 *
 * @see railcab.RailcabPackage#getRailCab()
 * @model
 * @generated
 */
public interface RailCab extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link railcab.RailCab}.
	 * It is bidirectional and its opposite is '{@link railcab.RailCab#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see railcab.RailcabPackage#getRailCab_Member()
	 * @see railcab.RailCab#getLeader
	 * @model opposite="leader"
	 * @generated
	 */
	EList<RailCab> getMember();

	/**
	 * Returns the value of the '<em><b>Section Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link railcab.SectionControl#getRailcabs <em>Railcabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Control</em>' reference.
	 * @see #setSectionControl(SectionControl)
	 * @see railcab.RailcabPackage#getRailCab_SectionControl()
	 * @see railcab.SectionControl#getRailcabs
	 * @model opposite="railcabs"
	 * @generated
	 */
	SectionControl getSectionControl();

	/**
	 * Sets the value of the '{@link railcab.RailCab#getSectionControl <em>Section Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Control</em>' reference.
	 * @see #getSectionControl()
	 * @generated
	 */
	void setSectionControl(SectionControl value);

	/**
	 * Returns the value of the '<em><b>Is Leader</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Leader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Leader</em>' attribute.
	 * @see #setIsLeader(boolean)
	 * @see railcab.RailcabPackage#getRailCab_IsLeader()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsLeader();

	/**
	 * Sets the value of the '{@link railcab.RailCab#isIsLeader <em>Is Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leader</em>' attribute.
	 * @see #isIsLeader()
	 * @generated
	 */
	void setIsLeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link railcab.RailCab#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' reference.
	 * @see #setLeader(RailCab)
	 * @see railcab.RailcabPackage#getRailCab_Leader()
	 * @see railcab.RailCab#getMember
	 * @model opposite="member"
	 * @generated
	 */
	RailCab getLeader();

	/**
	 * Sets the value of the '{@link railcab.RailCab#getLeader <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' reference.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(RailCab value);

} // RailCab
