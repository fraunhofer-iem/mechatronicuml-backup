package org.muml.core.browser.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.navigator.SaveablesProvider;
import org.muml.common.editingdomain.registry.MumlEditingDomain;
import org.muml.common.editingdomain.registry.MumlEditingDomainRegistry;
import org.muml.common.editingdomain.registry.MumlEditingDomainSaveable;

public class ModelBrowserSaveablesProvider extends SaveablesProvider implements MumlEditingDomainRegistry.Listener, MumlEditingDomainSaveable.Listener {

	public static ModelBrowserSaveablesProvider INSTANCE = new ModelBrowserSaveablesProvider();

	
	public ModelBrowserSaveablesProvider() {
		MumlEditingDomainRegistry.INSTANCE.addListener(this);
	}

	@Override
	public Saveable[] getSaveables() {
		List<Saveable> saveables = new ArrayList<Saveable>();
		for (MumlEditingDomain domain : MumlEditingDomainRegistry.INSTANCE.getEditingDomains()) {
			Saveable saveable = domain.getSaveable();
			if (saveable != null) {
				saveables.add(saveable);
			}
		}
		return saveables.toArray(new Saveable[] {});
	}

	@Override
	public Object[] getElements(Saveable saveable) {
		List<Object> elements = new ArrayList<Object>();
		for (MumlEditingDomain domain : MumlEditingDomainRegistry.INSTANCE.getEditingDomains()) {
			if (saveable == domain.getSaveable()) {
				URI uri = domain.getURI();
				final IFile iFile = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(uri.toPlatformString(true)));
				if (iFile != null) {
					elements.add(iFile);
				}
			}
		}
		return elements.toArray();
	}

	@Override
	public Saveable getSaveable(Object element) {
		URI uri = null;
		if (element instanceof EObject) {
			uri = ((EObject) element).eResource().getURI();
		}
		if (element instanceof Resource) {
			uri = ((Resource) element).getURI();
		}
		if (element instanceof IFile) {
			IFile iFile = (IFile) element;
			uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
		}
		if (uri != null) {
			MumlEditingDomain domain = MumlEditingDomainRegistry.INSTANCE.getEditingDomain(uri, false);
			if (domain != null) {
				return domain.getSaveable();
			}
		}
		return null;
	}

	public void dirtyChanged(Saveable saveable) {
		fireSaveablesDirtyChanged(new Saveable[] { saveable });
	}

	public void saveableAdded(Saveable saveable) {
	}

	@Override
	public void editingDomainCreated(MumlEditingDomain domain) {
		try {
			if (domain.getSaveable() != null) {
				if (domain.getSaveable() instanceof MumlEditingDomainSaveable) {
					MumlEditingDomainSaveable saveable = (MumlEditingDomainSaveable) domain.getSaveable();
					saveable.addListener(this);
				}
				fireSaveablesOpened(new Saveable[] { domain.getSaveable() });
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveableDirtyChanged(MumlEditingDomainSaveable saveable) {
		dirtyChanged(saveable);
	}

};
