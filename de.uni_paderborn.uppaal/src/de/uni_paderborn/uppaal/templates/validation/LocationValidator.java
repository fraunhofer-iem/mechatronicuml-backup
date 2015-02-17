/**
 *
 * $Id$
 */
package de.uni_paderborn.uppaal.templates.validation;

import de.uni_paderborn.uppaal.expressions.Expression;

import de.uni_paderborn.uppaal.templates.LocationKind;
import de.uni_paderborn.uppaal.templates.Template;

/**
 * A sample validator interface for {@link de.uni_paderborn.uppaal.templates.Location}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LocationValidator {
	boolean validate();

	boolean validateParentTemplate(Template value);
	boolean validateInvariant(Expression value);
	boolean validateLocationTimeKind(LocationKind value);
}
