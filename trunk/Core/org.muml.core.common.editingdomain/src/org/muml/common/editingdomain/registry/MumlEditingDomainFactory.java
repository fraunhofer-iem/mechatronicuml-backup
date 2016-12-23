package org.muml.common.editingdomain.registry;

import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.workspace.IResourceUndoContextPolicy;
import org.eclipse.emf.workspace.impl.WorkspaceCommandStackImpl;
import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;

public class MumlEditingDomainFactory extends DiagramEditingDomainFactory{
	
	public static MumlEditingDomainFactory INSTANCE = new MumlEditingDomainFactory();

    public MumlEditingDomain createMumlEditingDomain(URI uri) {
    	WorkspaceCommandStackImpl stack = new WorkspaceCommandStackImpl(OperationHistoryFactory.getOperationHistory());
//    	IUndoContext undoContext = 
//    		    (IUndoContext) ResourcesPlugin.getWorkspace().getAdapter(IUndoContext.class);
    	stack.setResourceUndoContextPolicy(IResourceUndoContextPolicy.DEFAULT);
    	
    	MumlEditingDomain editingDomain = new MumlEditingDomain(new ComposedAdapterFactory(
    			ComposedAdapterFactory.Descriptor.Registry.INSTANCE), stack, uri);
    	
		mapResourceSet(editingDomain);
		
		configure(editingDomain);
		
		final NotificationFilter diagramResourceModifiedFilter = NotificationFilter
				.createNotifierFilter(editingDomain.getResourceSet())
				.and(NotificationFilter.createEventTypeFilter(Notification.ADD))
				.and(NotificationFilter.createFeatureFilter(ResourceSet.class, ResourceSet.RESOURCE_SET__RESOURCES));
		editingDomain.getResourceSet().eAdapters().add(new Adapter() {

			private Notifier myTarger;

			public Notifier getTarget() {
				return myTarger;
			}

			public boolean isAdapterForType(Object type) {
				return false;
			}

			public void notifyChanged(Notification notification) {
				if (diagramResourceModifiedFilter.matches(notification)) {
					Object value = notification.getNewValue();
					if (value instanceof Resource) {
						((Resource) value).setTrackingModification(true);
					}
				}
			}

			public void setTarget(Notifier newTarget) {
				myTarger = newTarget;
			}

		});

		editingDomain.getResourceSet().getLoadOptions().put(XMIResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.FALSE);

		return editingDomain;
    }
    
}