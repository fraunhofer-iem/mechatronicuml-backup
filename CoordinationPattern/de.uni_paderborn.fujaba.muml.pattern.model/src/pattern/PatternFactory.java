/**
 */
package pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternFactory eINSTANCE = pattern.impl.PatternFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adapted From Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapted From Coordination Pattern</em>'.
	 * @generated
	 */
	AdaptedFromCoordinationPattern createAdaptedFromCoordinationPattern();

	/**
	 * Returns a new object of class '<em>Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Pattern</em>'.
	 * @generated
	 */
	CoordinationPattern createCoordinationPattern();

	/**
	 * Returns a new object of class '<em>Plain Textual Description Aspects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Textual Description Aspects</em>'.
	 * @generated
	 */
	PlainTextualDescriptionAspects createPlainTextualDescriptionAspects();

	/**
	 * Returns a new object of class '<em>Legal Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Configuration</em>'.
	 * @generated
	 */
	LegalConfiguration createLegalConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternPackage getPatternPackage();

} //PatternFactory
