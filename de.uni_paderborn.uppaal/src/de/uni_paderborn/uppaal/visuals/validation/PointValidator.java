/**
 *
 * $Id$
 */
package de.uni_paderborn.uppaal.visuals.validation;


/**
 * A sample validator interface for {@link de.uni_paderborn.uppaal.visuals.Point}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PointValidator {
	boolean validate();

	boolean validateX(int value);
	boolean validateY(int value);
}
