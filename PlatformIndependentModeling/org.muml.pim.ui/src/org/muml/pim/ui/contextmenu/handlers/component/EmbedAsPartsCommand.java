package org.muml.pim.ui.contextmenu.handlers.component;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.muml.core.common.edit.commands.StoringExecuteQvtoTransformationCommand;
import org.muml.pim.component.Component;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.ui.Activator;

public class EmbedAsPartsCommand extends ChangeCommand {

	public static final String EMBED_TRANSFORMATION = "/org.muml.pim.ui/transforms/component/EmbedAsParts.qvto";

	private EditingDomain editingDomain;

	private List<Component> components;

	private StructuredComponent newCreatedStructuredComponent = null;

	public EmbedAsPartsCommand(EditingDomain editingDomain,
			List<Component> components) {
		super(new ArrayList<Notifier>(components));
		this.components = components;
		this.editingDomain = editingDomain;

	}

	public StructuredComponent getNewCreatedStructuredComponent() {
		return newCreatedStructuredComponent;
	}

	@Override
	protected void doExecute() {
		newCreatedStructuredComponent = null;

		ModelExtent inputExtent = new BasicModelExtent(components);

		ModelExtent outputExtent = new BasicModelExtent();

		final TransformationExecutor transformationExecutor = Activator
				.getInstance().getTransformationExecutor(EMBED_TRANSFORMATION,
						false);

		StoringExecuteQvtoTransformationCommand command = new StoringExecuteQvtoTransformationCommand(
				transformationExecutor, inputExtent, outputExtent);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		// Get created object from output extent
		EObject createdObject = null;
		if (!outputExtent.getContents().isEmpty()) {
			createdObject = outputExtent.getContents().get(0);
		}

		// Return StructuredComponent
		if (createdObject instanceof StructuredComponent) {
			newCreatedStructuredComponent = (StructuredComponent) createdObject;
		}

	}

}