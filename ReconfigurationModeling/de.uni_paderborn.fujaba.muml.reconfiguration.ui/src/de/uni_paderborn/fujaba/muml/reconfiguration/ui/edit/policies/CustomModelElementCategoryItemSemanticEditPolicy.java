package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.uni_paderborn.fujaba.muml.component.diagram.edit.policies.ModelElementCategoryItemSemanticEditPolicy;

public class CustomModelElementCategoryItemSemanticEditPolicy extends ModelElementCategoryItemSemanticEditPolicy{
	
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurableAtomicComponent_2078== req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.commands.ReconfigurableAtomicComponentCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.ReconfigurableStructuredComponent_2076== req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.commands.ReconfigurableStructuredComponentCreateCommand(
					req));
		}
		
		if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.FadingComponent_2079== req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.commands.FadingComponentCreateCommand(
					req));
		}

		return super.getCreateCommand(req);
	}

}
