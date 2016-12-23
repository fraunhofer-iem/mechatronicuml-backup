package org.muml.core.browser.actions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.muml.common.editingdomain.registry.MumlEditingDomainRegistry;

import org.muml.core.browser.ModelBrowserPlugin;

public class OpenDiagramActionProvider extends CommonActionProvider {
	private boolean contribute;
	private OpenDiagramAction openDiagramAction;

	public OpenDiagramActionProvider() {
		
	}
	
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		if (aSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			contribute = true;
			makeActions((ICommonViewerWorkbenchSite) aSite.getViewSite());
		} else {
			contribute = false;
		}
	}

	private void makeActions(ICommonViewerWorkbenchSite viewerSite) {
		openDiagramAction = new OpenDiagramAction(viewerSite);
	}

	public void fillActionBars(IActionBars actionBars) {
		if (!contribute) {
			return;
		}
		IStructuredSelection selection = (IStructuredSelection) getContext()
				.getSelection();
		openDiagramAction.selectionChanged(selection);
		if (openDiagramAction.isDefaultOpenHandler()) {
			actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN,
					openDiagramAction);
		}
	}
	
	public void fillContextMenu(IMenuManager menu) {
		menu.appendToGroup("group.open", openDiagramAction);
	}

	private static class OpenDiagramAction extends Action {

		private Set<URI> diagrams;
		
		private boolean containerSelected;
		
		private ICommonViewerWorkbenchSite viewerSite;

		public OpenDiagramAction(ICommonViewerWorkbenchSite viewerSite) {
			this.viewerSite = viewerSite;
		}

		public boolean isDefaultOpenHandler() {
			return !containerSelected && isEnabled();
		}

		public void selectionChanged(IStructuredSelection selection) {
			setText("Open Diagram");
			setEnabled(false);
			diagrams = new HashSet<URI>();
			containerSelected = false;
			Iterator<?> it = selection.iterator();
			while (it.hasNext()) {
				Object object = it.next();
				if (object instanceof IContainer) {
					containerSelected = true;
				}
				try {
					findDiagramsForObject(diagrams, object);
				} catch (CoreException e) {
					ModelBrowserPlugin.log(e);
				}
			}
			if (diagrams.size() > 1) {
				setText("Open multiple Diagrams");
			}
			setEnabled(!diagrams.isEmpty());
		}
		private void findDiagramsForView(Set<URI> diagrams, View view) {
			if (view != null && view.eResource() != null) {
				diagrams.add(view.eResource().getURI());
			}
		}
		
		private void findDiagramsForIResource(final Set<URI> diagrams, IResource resource) throws CoreException { 
			if (!resource.isAccessible()) {
				return;
			}
			resource.accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource iResource) throws CoreException {
					if (iResource.getType() == IResource.FILE) {
						URI uri = URI.createPlatformResourceURI(iResource.getFullPath().toString(), true);
						TransactionalEditingDomain editingDomain = MumlEditingDomainRegistry.INSTANCE.getEditingDomain(uri, false);
						if (editingDomain != null) {
							Resource directResource = editingDomain.getResourceSet().getResource(uri, false);
							if (!findDiagramsForResource(diagrams, directResource)) {
								for (Resource resource : editingDomain.getResourceSet().getResources()) {
									findDiagramsForResource(diagrams, resource);
								}
							}
						}
					}
					return true;
				}

			
			});
		}
		private boolean findDiagramsForResource(Set<URI> diagrams, Resource resource) {
			if (resource == null) {
				return false;
			}
			for (EObject contents : resource.getContents()) {
				if (contents instanceof Diagram) {
					diagrams.add(resource.getURI());
					return true;
				}
			}
			return false;
		}
		private void findDiagramsForObject(Set<URI> diagrams, Object object) throws CoreException {
			if (object instanceof IAdaptable) {
				findDiagramsForView(diagrams, (View) ((IAdaptable) object).getAdapter(View.class));
				findDiagramsForIResource(diagrams, (IResource) ((IAdaptable) object).getAdapter(IResource.class));
			} else if (object instanceof IResource) {
				findDiagramsForIResource(diagrams, (IResource) object);
			} else if (object instanceof View) {
				findDiagramsForView(diagrams, (View) object);
			} else if (object instanceof Diagram) {
				if (((Diagram) object).eResource() != null) {
					diagrams.add(((Diagram) object).eResource().getURI());
				}
			} else if (object instanceof EObject) {
				EObject element = (EObject) object;
				if (element.eResource() != null && element.eResource().getResourceSet() != null) {
					for (Resource resource : element.eResource().getResourceSet().getResources()) {
						for (Object contents : resource.getContents()) {
							if (contents instanceof Diagram) {
								Diagram diagram = (Diagram) contents;
								EObject diagramElement = (EObject) diagram.eGet(NotationPackage.Literals.VIEW__ELEMENT, false); // non resolving
								if (diagramElement == element && diagramElement.eResource() != null) {
									diagrams.add(diagramElement.eResource().getURI());
								}
							}
						}
					}
				}
			}
		}

		public void run() {
			for (URI uri : diagrams) {
				IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))); 
				IWorkbenchPage page = viewerSite.getPage();
				try {
	                IDE.openEditor(page, iFile);
				} catch (PartInitException e) {
					ModelBrowserPlugin.log(e, "Exception while opening diagram"); //$NON-NLS-1$
				}
			}
		}
	}

}
