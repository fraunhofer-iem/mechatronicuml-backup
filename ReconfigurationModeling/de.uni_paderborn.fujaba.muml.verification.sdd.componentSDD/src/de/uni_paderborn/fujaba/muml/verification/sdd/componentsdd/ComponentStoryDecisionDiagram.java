/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd;

import de.uni_paderborn.fujaba.muml.reconfiguration.StructuralCondition;
import de.uni_paderborn.fujaba.muml.verification.sdd.AbstractStoryDecisionDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Decision Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram#isInvariantSDD <em>Invariant SDD</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage#getComponentStoryDecisionDiagram()
 * @model
 * @generated
 */
public interface ComponentStoryDecisionDiagram extends AbstractStoryDecisionDiagram, StructuralCondition {

	/**
	 * Returns the value of the '<em><b>Invariant SDD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether this ComponentStoryDecisionDiagram must hold invariantly for all instances of a ReconfigurableComponent. If invariantSDD is false, then this ComponentStoryDecisionDiagram may evaluate to false for some instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariant SDD</em>' attribute.
	 * @see #setInvariantSDD(boolean)
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage#getComponentStoryDecisionDiagram_InvariantSDD()
	 * @model
	 * @generated
	 */
	boolean isInvariantSDD();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram#isInvariantSDD <em>Invariant SDD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant SDD</em>' attribute.
	 * @see #isInvariantSDD()
	 * @generated
	 */
	void setInvariantSDD(boolean value);
} // ComponentStoryDecisionDiagram
