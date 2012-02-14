/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hybrid port which acts as a bridge between continuous
 * controllers and discrete software. A hybrid port emits or receives a signal value 
 * which has a data type and a concrete value at all points in time. Then, the
 * hybrid port discretizes the signal value in given time intervals and provides the
 * value as variable to its Real-Time Statechart. The hybrid port does not define message
 * interfaces.
 * \todosd{Add attributes and references in future releases.}
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getHybridPort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LowerBoundMustBeZeroOrOne UpperBoundMustBeOne'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL LowerBoundMustBeZeroOrOne='-- This Constraint is fulfilled, if no Cardinality exists.\n-- But that is okay, as then another Problem-Marker is shown,\n-- because Cardinality.lowerBound is 1..1\nself.cardinality.oclIsUndefined() or (\n\tif self.cardinality.lowerBound.oclIsUndefined() then\n\t\tfalse\n\telse\n\t\tself.cardinality.lowerBound.value = 0 or self.cardinality.lowerBound.value = 1\n\tendif\n)' UpperBoundMustBeOne='-- This Constraint is fulfilled, if no Cardinality exists.\n-- But that is okay, as then another Problem-Marker is shown,\n-- because Cardinality.upperBound is 1..1\nself.cardinality.oclIsUndefined() or (\n\tif self.cardinality.upperBound.oclIsUndefined() then\n\t\tfalse\n\telse\n\t\tself.cardinality.upperBound.value = 1\n\tendif\n)'"
 * @generated
 */
public interface HybridPort extends DiscretePort, ContinuousPort {
} // HybridPort
