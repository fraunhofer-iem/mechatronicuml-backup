/**
 */
package de.uni_paderborn.uppaal.parsable.templates_parsable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.uppaal.parsable.templates_parsable.TemplatesParsablePackage
 * @generated
 */
public interface TemplatesParsableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemplatesParsableFactory eINSTANCE = de.uni_paderborn.uppaal.parsable.templates_parsable.impl.TemplatesParsableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Identifiable Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifiable Location</em>'.
	 * @generated
	 */
	IdentifiableLocation createIdentifiableLocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TemplatesParsablePackage getTemplatesParsablePackage();

} //TemplatesParsableFactory
