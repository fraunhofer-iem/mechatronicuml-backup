/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls;

import org.eclipse.emf.ecore.EParameter;
import org.muml.storydiagram.SDMExtension;
import org.muml.storydiagram.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an EParameter and adds functionality to it, especially beiing subtype of Variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.ParameterExtension#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.calls.CallsPackage#getParameterExtension()
 * @model
 * @generated
 */
public interface ParameterExtension extends Variable, SDMExtension {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see org.muml.storydiagram.calls.CallsPackage#getParameterExtension_Parameter()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.getModelBase() <> null and self.getModelBase().oclIsKindOf(ecore::EParameter)) then self.getModelBase().oclAsType(ecore::EParameter) else null endif'"
	 * @generated
	 */
	EParameter getParameter();

} // ParameterExtension
