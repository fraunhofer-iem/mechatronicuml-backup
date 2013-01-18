/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EntyPoint is an intermediate pseudostate which makes it possible to chain transitions between different hierarchy levels. An  EntryPoint is used to activate a dedicated inner state of an embedded statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint#getStateEntryPoint <em>State Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneOutgoingTransition EntryPointAndTargetSameStatechart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OneOutgoingTransition='self.outgoingTransitions->size() = 1' EntryPointAndTargetSameStatechart='self.outgoingTransitions->size() = 1 implies\n\t(not self.outgoingTransitions->at(1).target.oclIsUndefined()\n\t and self.outgoingTransitions->at(1).target.statechart = self.statechart\n\t)'"
 * @generated
 */
public interface EntryPoint extends Vertex {

	/**
	 * Returns the value of the '<em><b>State Entry Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint#getEntryPoints <em>Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced StateEntryPoint of embedding statechart. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Entry Point</em>' reference.
	 * @see #setStateEntryPoint(StateEntryPoint)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryPoint_StateEntryPoint()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint#getEntryPoints
	 * @model opposite="entryPoints" required="true"
	 * @generated
	 */
	StateEntryPoint getStateEntryPoint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint#getStateEntryPoint <em>State Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Entry Point</em>' reference.
	 * @see #getStateEntryPoint()
	 * @generated
	 */
	void setStateEntryPoint(StateEntryPoint value);
} // EntryPoint
