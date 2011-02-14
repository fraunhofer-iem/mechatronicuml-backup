/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patterneditor;

import de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint;

import de.uni_paderborn.fujaba.umlrt.model.modelstructure.Diagram;

import de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;
import de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link patterneditor.PatternDiagram#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 *   <li>{@link patterneditor.PatternDiagram#getRoles <em>Roles</em>}</li>
 *   <li>{@link patterneditor.PatternDiagram#getRoleConnectors <em>Role Connectors</em>}</li>
 *   <li>{@link patterneditor.PatternDiagram#getTextualConstraints <em>Textual Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see patterneditor.PatterneditorPackage#getPatternDiagram()
 * @model
 * @generated
 */
public interface PatternDiagram extends Diagram {
	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' containment reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see patterneditor.PatterneditorPackage#getPatternDiagram_CoordinationPattern()
	 * @model containment="true"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link patterneditor.PatternDiagram#getCoordinationPattern <em>Coordination Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' containment reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see patterneditor.PatterneditorPackage#getPatternDiagram_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Role Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Connectors</em>' containment reference list.
	 * @see patterneditor.PatterneditorPackage#getPatternDiagram_RoleConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleConnector> getRoleConnectors();

	/**
	 * Returns the value of the '<em><b>Textual Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textual Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textual Constraints</em>' containment reference list.
	 * @see patterneditor.PatterneditorPackage#getPatternDiagram_TextualConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextualConstraint> getTextualConstraints();

} // PatternDiagram
