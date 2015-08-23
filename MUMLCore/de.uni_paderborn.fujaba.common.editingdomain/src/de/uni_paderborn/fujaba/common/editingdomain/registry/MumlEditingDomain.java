package de.uni_paderborn.fujaba.common.editingdomain.registry;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.emf.workspace.IResourceUndoContextPolicy;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.emf.workspace.impl.WorkspaceCommandStackImpl;
import org.eclipse.ui.Saveable;

public class MumlEditingDomain extends TransactionalEditingDomainImpl {

	public static MumlEditingDomain create(URI uri) {
		WorkspaceCommandStackImpl stack = new WorkspaceCommandStackImpl(OperationHistoryFactory.getOperationHistory());
//		IUndoContext undoContext = 
//			    (IUndoContext) ResourcesPlugin.getWorkspace().getAdapter(IUndoContext.class);
		stack.setResourceUndoContextPolicy(IResourceUndoContextPolicy.DEFAULT);
		
		MumlEditingDomain editingDomain = new MumlEditingDomain(new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE), stack, uri);
		
		WorkspaceEditingDomainFactory.INSTANCE.mapResourceSet(editingDomain);
		
		editingDomain.getResourceSet().getLoadOptions().put(XMIResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.FALSE);
		
		return editingDomain;
	}
	
	protected URI uri;
	
	protected Saveable saveable = null;
	
	protected MumlEditingDomain(AdapterFactory adapterFactory, TransactionalCommandStack stack, URI uri) {
		super(adapterFactory, stack);
		this.uri = uri;
	}
	
	public Saveable getSaveable() {
		if (saveable == null) {
			saveable = new MumlEditingDomainSaveable(this);
		}
		return saveable;
	}
	
	public URI getURI() {
		return uri;
	}
	
	public void save() throws IOException {
		Resource writeResource = getWriteResource();
		writeResource.save(Collections.emptyMap());
	}

	public Resource getWriteResource() {
		return getResourceSet().getResource(uri, false);
	}
	
}
