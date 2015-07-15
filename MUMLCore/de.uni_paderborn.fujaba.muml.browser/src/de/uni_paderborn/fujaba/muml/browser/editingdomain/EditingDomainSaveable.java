package de.uni_paderborn.fujaba.muml.browser.editingdomain;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
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
		URI uri = domain.getURI();
		final IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))); 
		return iFile.getName();
	}

	@Override
	public String getToolTipText() {
		URI uri = domain.getURI();
		final IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))); 
		return iFile.getFullPath().removeLastSegments(1).toString();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public void doSave(IProgressMonitor monitor) throws CoreException {
		try {
			domain.save();
		} catch (IOException e) {
			e.printStackTrace();
		}
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