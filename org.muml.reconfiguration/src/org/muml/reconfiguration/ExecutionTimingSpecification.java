/**
 */
package org.muml.reconfiguration;

import org.muml.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Timing Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class serves as the abstract super class for all execution 
 * timing specifications. The execution timing specification specifies the duration that a component 
 * needs to execute a reconfiguration that has been requested by the parent 
 * component. The time to execute a reconfiguration, in turn, depends on the 
 * concrete execution procedure. Currently, we support single-phase and 
 * three-phase execution.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getExecutionTimingSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionTimingSpecification extends ExtendableElement {
} // ExecutionTimingSpecification
