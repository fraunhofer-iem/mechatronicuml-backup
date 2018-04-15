package org.muml.core.siriusbrowser.actions;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.muml.pim.types.blackbox.TypesBlackbox;

/**
 * This SessionManagerListener is notified whenever a ModelingProject is opened.
 * 
 * It makes sure that the MUML Predefined Types are added as semantic resource.
 * 
 * Note: This is rather invasive, as we do this for every Sirius Modeling Project,
 *       not only for MUML projects.
 *       Currently we have no MUML specific project type, so we do not know if it
 *       is a MUML project. Thats why we currently do it for every Modeling Project. 
 * 
 * @author ingo
 *
 */
public class RegisterPrimitiveTypesSessionManagerListener implements SessionManagerListener {

	public RegisterPrimitiveTypesSessionManagerListener() {
	}

	@Override
	public void notifyAddSession(Session newSession) {
		if (!hasSemanticResource(newSession, TypesBlackbox.PREDEFINED_TYPES_URI)) {
			addSemanticResource(newSession, TypesBlackbox.PREDEFINED_TYPES_URI);
		}
	}

	private void addSemanticResource(Session newSession, URI uri) {
		newSession.getTransactionalEditingDomain().getCommandStack()
				.execute(new AddSemanticResourceCommand(newSession, uri, new NullProgressMonitor()));
	}

	private boolean hasSemanticResource(Session newSession, URI uri) {
		for (Resource semanticResource : newSession.getSemanticResources()) {
			if (semanticResource.getURI().equals(uri)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void notifyRemoveSession(Session removedSession) {
	}

	@Override
	public void viewpointSelected(Viewpoint selectedSirius) {
	}

	@Override
	public void viewpointDeselected(Viewpoint deselectedSirius) {
	}

	@Override
	public void notify(Session updated, int notification) {
	}

}
