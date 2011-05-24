/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.patterneditor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint;
import de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;
import de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram#getRoleConnectors <em>Role Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram#getTextualConstraints <em>Textual Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage#getPatternDiagram()
 * @model
 * @generated
 */
public interface PatternDiagram extends EObject {
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
	 * @see de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage#getPatternDiagram_CoordinationPattern()
	 * @model containment="true"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram#getCoordinationPattern <em>Coordination Pattern</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage#getPatternDiagram_Roles()
	 * @model containment="true" upper="2"
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
	 * @see de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage#getPatternDiagram_RoleConnectors()
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
	 * @see de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage#getPatternDiagram_TextualConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextualConstraint> getTextualConstraints();

} // PatternDiagram
