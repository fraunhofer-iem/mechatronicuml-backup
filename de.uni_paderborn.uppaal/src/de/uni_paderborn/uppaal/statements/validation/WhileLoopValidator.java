/**
 *
 * $Id$
 */
package de.uni_paderborn.uppaal.statements.validation;

import de.uni_paderborn.uppaal.expressions.Expression;

import de.uni_paderborn.uppaal.statements.Statement;

/**
 * A sample validator interface for {@link de.uni_paderborn.uppaal.statements.WhileLoop}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WhileLoopValidator {
	boolean validate();

	boolean validateExpression(Expression value);
	boolean validateStatement(Statement value);
}
