/**
 *
 * $Id$
 */
package de.uni_paderborn.uppaal.templates.validation;

import de.uni_paderborn.uppaal.declarations.system.TemplateDeclaration;

import de.uni_paderborn.uppaal.templates.AbstractTemplate;

/**
 * A sample validator interface for {@link de.uni_paderborn.uppaal.templates.RedefinedTemplate}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RedefinedTemplateValidator {
	boolean validate();

	boolean validateReferredTemplate(AbstractTemplate value);
	boolean validateDeclaration(TemplateDeclaration value);
}
