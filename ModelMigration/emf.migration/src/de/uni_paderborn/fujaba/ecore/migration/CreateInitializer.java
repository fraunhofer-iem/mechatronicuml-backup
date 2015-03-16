/**
 */
package de.uni_paderborn.fujaba.ecore.migration;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getCreateInitializer()
 * @model
 * @generated
 */
public interface CreateInitializer extends CreateClass, FeatureInitializer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Mapping mapping = getMapping();\nif (mapping != null) {\n\treturn mapping.getSourceClass();\n}\nreturn null;'"
	 * @generated
	 */
	EClass getSourceClass();

} // CreateInitializer
