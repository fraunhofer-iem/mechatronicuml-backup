/**
 *
 * $Id$
 */
package de.uni_paderborn.uppaal.declarations.global.validation;

import de.uni_paderborn.uppaal.declarations.global.PriorityItem;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.uni_paderborn.uppaal.declarations.global.ChannelPriorityGroup}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ChannelPriorityGroupValidator {
	boolean validate();

	boolean validateItems(EList<PriorityItem> value);
}
