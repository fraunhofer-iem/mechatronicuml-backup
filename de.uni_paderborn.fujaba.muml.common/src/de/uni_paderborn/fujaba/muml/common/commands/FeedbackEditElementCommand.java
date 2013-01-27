package de.uni_paderborn.fujaba.muml.common.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

public abstract class FeedbackEditElementCommand extends EditElementCommand {

	protected FeedbackEditElementCommand(String label, EObject elementToEdit,
			IEditCommandRequest request) {
		super(label, elementToEdit, request);
	}

}
