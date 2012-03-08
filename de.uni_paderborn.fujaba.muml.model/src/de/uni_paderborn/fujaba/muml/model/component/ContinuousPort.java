/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import de.uni_paderborn.fujaba.muml.model.core.DataType;
import org.eclipse.emf.ecore.EDataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a concrete port specification which provides the 
 * continuous functionality of a port. A continuous port emits a signal value.
 * A signal value has a data type and it has concrete values at all points in time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousInPort <em>Is Continuous In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousOutPort <em>Is Continuous Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LowerBoundMustBeZeroOrOne UpperBoundMustBeOne'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL LowerBoundMustBeZeroOrOne='-- This Constraint is fulfilled, if no Cardinality exists.\n-- But that is okay, as then another Problem-Marker is shown,\n-- because Cardinality.lowerBound is 1..1\nself.cardinality.oclIsUndefined() or (\n\tif self.cardinality.lowerBound.oclIsUndefined() then\n\t\tfalse\n\telse\n\t\tself.cardinality.lowerBound.value = 0 or self.cardinality.lowerBound.value = 1\n\tendif\n)' UpperBoundMustBeOne='-- This Constraint is fulfilled, if no Cardinality exists.\n-- But that is okay, as then another Problem-Marker is shown,\n-- because Cardinality.upperBound is 1..1\nself.cardinality.oclIsUndefined() or (\n\tif self.cardinality.upperBound.oclIsUndefined() then\n\t\tfalse\n\telse\n\t\tself.cardinality.upperBound.value = 1\n\tendif\n)'"
 * @generated
 */
public interface ContinuousPort extends Port {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decides the direction of a continous port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind
	 * @see #setKind(ContinuousPortDirectionKind)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort_Kind()
	 * @model required="true"
	 * @generated
	 */
	ContinuousPortDirectionKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ContinuousPortDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Is Continuous In Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the continuous port is an IN port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Continuous In Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort_IsContinuousInPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.kind = component::ContinuousPortDirectionKind::IN'"
	 * @generated
	 */
	boolean isIsContinuousInPort();

	/**
	 * Returns the value of the '<em><b>Is Continuous Out Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the continuous port is an OUT port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Continuous Out Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getContinuousPort_IsContinuousOutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.kind = component::ContinuousPortDirectionKind::OUT'"
	 * @generated
	 */
	boolean isIsContinuousOutPort();
} // ContinuousPort
