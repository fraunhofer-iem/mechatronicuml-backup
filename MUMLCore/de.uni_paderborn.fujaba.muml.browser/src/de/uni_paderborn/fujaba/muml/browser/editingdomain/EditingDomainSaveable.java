package de.uni_paderborn.fujaba.muml.browser.editingdomain;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.Saveable;

public class EditingDomainSaveable extends Saveable {
	
	private MumlEditingDomain domain;

	public EditingDomainSaveable(MumlEditingDomain domain) {
		this.domain = domain;
	}
	
	@Override
	public String getName() {
		return domain.getURI().toFileString();
	}

	@Override
	public String getToolTipText() {
		return getName();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public void doSave(IProgressMonitor monitor) throws CoreException {
	}

	@Override
	public boolean isDirty() {
		return true;
	}

	@Override
	public boolean equals(Object object) {
		return object == this;
	}

	@Override
	public int hashCode() {
		return domain.hashCode();
	}
	
}