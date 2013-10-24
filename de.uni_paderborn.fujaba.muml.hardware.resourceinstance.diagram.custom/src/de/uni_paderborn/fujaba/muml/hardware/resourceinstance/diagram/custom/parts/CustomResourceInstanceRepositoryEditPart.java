package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.edit.commands.CreateRepositoryInstancesCommand;
import de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository;


/**
 * A customized EditPart for {@link ResourceInstanceRepository}. 
 * When the referenced {@link ResourceTypeRepository} is set all {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType}s
 * are instantiated in this ResourceInstanceRepository by executing a qvt-o transformation.
 * 
 * @author adann
 * 
 */
public class CustomResourceInstanceRepositoryEditPart extends
		ResourceInstanceRepositoryEditPart {

	public CustomResourceInstanceRepositoryEditPart(View view) {
		super(view);
	}

	@Override
	public void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();

		if (PlatformPackage.Literals.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_TYPE_REPOSITORY
				.equals(feature)) {

			EditingDomain editingDomain = getEditingDomain();
			if (editingDomain != null) {
				ResourceInstanceRepository resourceInstanceRepo = (ResourceInstanceRepository) getNotationView()
						.getElement();
				CreateRepositoryInstancesCommand command = new CreateRepositoryInstancesCommand(
						resourceInstanceRepo);
				editingDomain.getCommandStack().execute(command);

				// refresh connections
				View view = getNotationView();
				while (view != null) {
					List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
							.getRegisteredEditPolicies(view.getElement());
					for (Iterator<CanonicalEditPolicy> it = editPolicies
							.iterator(); it.hasNext();) {
						CanonicalEditPolicy nextEditPolicy = it.next();
						nextEditPolicy.refresh();
					}
					view = (View) view.eContainer();
				}
			}

		}

		super.handleNotificationEvent(notification);

	}

}
