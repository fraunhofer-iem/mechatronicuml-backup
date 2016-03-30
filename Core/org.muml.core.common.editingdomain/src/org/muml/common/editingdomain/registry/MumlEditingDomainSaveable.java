package org.muml.common.editingdomain.registry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.Saveable;

public class MumlEditingDomainSaveable extends Saveable {
	
	public static interface Listener {
		void saveableDirtyChanged(MumlEditingDomainSaveable saveable);
	}
	
	private MumlEditingDomain domain;
	private List<Listener> listeners = new ArrayList<Listener>();

	public MumlEditingDomainSaveable(MumlEditingDomain domain) {
		this.domain = domain;
	}
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
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
			((BasicCommandStack)domain.getCommandStack()).saveIsDone();
			for (Listener listener : listeners) {
				listener.saveableDirtyChanged(this);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isDirty() {
		return ((BasicCommandStack)domain.getCommandStack()).isSaveNeeded();
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
