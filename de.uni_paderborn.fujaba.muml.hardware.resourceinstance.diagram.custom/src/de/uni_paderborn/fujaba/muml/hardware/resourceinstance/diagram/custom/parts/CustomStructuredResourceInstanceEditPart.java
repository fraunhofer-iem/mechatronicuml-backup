package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.common.figures.CustomIconFigure.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.edit.commands.CreateInstancesCommand;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart;

/**
 * A customized EditPart for {@link StructuredResourceInstance}. A customized
 * Figure will be used, which underlines the text.
 * 
 * @author adann
 * 
 */
public class CustomStructuredResourceInstanceEditPart extends
		StructuredResourceInstanceEditPart {

	public CustomStructuredResourceInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * The execution of the transformation keeps this instance and its type in
	 * synch.
	 * 
	 * @author adann
	 */
	@Override
	public void activate() {
		super.activate();
		executeTransformation();
	}

	@Override
	protected IFigure createNodeShape() {
		primaryShape = new StructuredResourceFigure();
		((StructuredResourceFigure) primaryShape)
				.getFigureStructuredResourceNameFigure().setTextUnderline(true);
		((StructuredResourceFigure) primaryShape)
				.getFigureStructuredResourceKindFigure().setTextUnderline(true);
		((StructuredResourceFigure) primaryShape)
				.getFigureCustomStructuredIconFigure().setIcon(
						ResourceType.STRUCTURED);
		return primaryShape;
	}

	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();
		if (PlatformPackage.Literals.RESOURCE_INSTANCE__RESOURCE_TYPE
				.equals(feature)) {

			executeTransformation();

		}

		super.handleNotificationEvent(notification);

	}

	private void executeTransformation() {

		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			ResourceInstance resourceInstance = (ResourceInstance) getNotationView()
					.getElement();
			CreateInstancesCommand command = new CreateInstancesCommand(
					resourceInstance);
			editingDomain.getCommandStack().execute(command);
		}
	}

}
