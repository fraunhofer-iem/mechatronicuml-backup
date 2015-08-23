package de.uni_paderborn.fujaba.common.editingdomain.registry;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.ui.Saveable;

public class MumlEditingDomain extends TransactionalEditingDomainImpl {

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
