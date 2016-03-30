package org.muml.common.editingdomain.registry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;

public class MumlEditingDomain extends TransactionalEditingDomainImpl {

	protected List<IDocument> connectedDocuments = new ArrayList<IDocument>();
	
	protected URI uri;
	
	protected MumlEditingDomainSaveable saveable = null;
	
	protected MumlEditingDomain(AdapterFactory adapterFactory, TransactionalCommandStack stack, URI uri) {
		super(adapterFactory, stack);
		this.uri = uri;
	}
	
	
	public MumlEditingDomainSaveable getSaveable() {
		if (connectedDocuments.isEmpty()) {
			return null; // When no editor is connected, save directly!
		}
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
	
	public void addConnectedDocument(IDocument connectedDocument) {
		this.connectedDocuments.add(connectedDocument);
	}
	
	public void removeConnectedDocument(IDocument connectedDocument) {
		this.connectedDocuments.remove(connectedDocument);
	}
}
