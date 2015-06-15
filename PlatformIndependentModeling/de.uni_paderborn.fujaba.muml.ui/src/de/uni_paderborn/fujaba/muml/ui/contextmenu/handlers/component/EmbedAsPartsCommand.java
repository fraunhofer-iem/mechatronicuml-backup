package de.uni_paderborn.fujaba.muml.ui.contextmenu.handlers.component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.ui.Activator;

public class EmbedAsPartsCommand extends ChangeCommand {

	public static final String EMBED_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.ui/transforms/component/EmbedAsParts.qvto";

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
		newCreatedStructuredComponent = createStructuredComponentWithEmbeddedParts(editingDomain,components);

		if (newCreatedStructuredComponent == null) {
			return;
		}

		// Add new StructuredComponent to ModelElementCategory
		if (!components.isEmpty()) {
			EObject container = components.get(0).eContainer();
			if (container instanceof ModelElementCategory) {
				((ModelElementCategory) container).getModelElements().add(
						newCreatedStructuredComponent);
			}
		}

	}
	
	public  StructuredComponent createStructuredComponentWithEmbeddedParts(EditingDomain editingDomain, List<Component> components) {
		ModelExtent inputExtent = new BasicModelExtent(components);

		ModelExtent outputExtent = new BasicModelExtent();

		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] {
				inputExtent, outputExtent });

		final TransformationExecutor transformationExecutor = Activator
				.getInstance()
				.getTransformationExecutor(EMBED_TRANSFORMATION, false);		

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if(command.canExecute()){
			editingDomain.getCommandStack().execute(command);
		}

		// Get created object from output extent
		EObject createdObject = null;
		if (!outputExtent.getContents().isEmpty()) {
			createdObject = outputExtent.getContents().get(0);
		}

		// Return StructuredComponent
		if (createdObject instanceof StructuredComponent) {
			return (StructuredComponent) createdObject;
		}
		return null;
	}

}