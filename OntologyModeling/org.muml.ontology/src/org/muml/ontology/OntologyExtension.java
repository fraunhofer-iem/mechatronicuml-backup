/**
 * <copyright>
 * Copyright (c) 2014 Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT - initial API and implementation
 * </copyright>
 */
package org.muml.ontology;

import org.muml.mumlcore.Extension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ontology.OntologyExtension#getOntologyReference <em>Ontology Reference</em>}</li>
 * </ul>
 *
 * @see org.muml.ontology.OntologyPackage#getOntologyExtension()
 * @model
 * @generated
 */
public interface OntologyExtension extends Extension {
	/**
	 * Returns the value of the '<em><b>Ontology Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology Reference</em>' attribute.
	 * @see #setOntologyReference(String)
	 * @see org.muml.ontology.OntologyPackage#getOntologyExtension_OntologyReference()
	 * @model required="true"
	 * @generated
	 */
	String getOntologyReference();

	/**
	 * Sets the value of the '{@link org.muml.ontology.OntologyExtension#getOntologyReference <em>Ontology Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology Reference</em>' attribute.
	 * @see #getOntologyReference()
	 * @generated
	 */
	void setOntologyReference(String value);

} // OntologyExtension
