package de.uni_paderborn.fujaba.muml.browser.providers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;

public class OpenDiagramNavigatorActionProvider extends CommonActionProvider {
	private boolean contribute;
	private OpenDiagramAction openDiagramAction;

	public OpenDiagramNavigatorActionProvider() {
		
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
		if (openDiagramAction.isEnabled()) {
			actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN,
					openDiagramAction);
		}
	}
	
	public void fillContextMenu(IMenuManager menu) {
		menu.appendToGroup("group.open", openDiagramAction);
	}

	private static class OpenDiagramAction extends Action {

		private List<Diagram> diagrams;

		private ICommonViewerWorkbenchSite viewerSite;

		public OpenDiagramAction(ICommonViewerWorkbenchSite viewerSite) {
			super("Open Diagram");
			this.viewerSite = viewerSite;
		}

		public void selectionChanged(IStructuredSelection selection) {
			diagrams = new ArrayList<Diagram>();
			Iterator<?> it = selection.iterator();
			while (it.hasNext()) {
				Object object = it.next();
				try {
					findDiagramsForObject(diagrams, object);
				} catch (CoreException e) {
					ModelBrowserPlugin.log(e);
				}
			}
			setEnabled(!diagrams.isEmpty());
			
		}
		private void findDiagramsForView(List<Diagram> diagrams, View view) {
			Diagram diagram = null;
			if (view instanceof Diagram) {
				diagram = (Diagram) diagram;
			} else if (view != null) {
				diagram = view.getDiagram();
			}

			if (diagram != null) {
				diagrams.add(diagram);
			}
		}
		
		private void findDiagramsForResource(final List<Diagram> diagrams, IResource resource) throws CoreException { 
			resource.accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource iResource) throws CoreException {
					if (iResource.getType() == IResource.FILE) {
						URI uri = URI.createPlatformResourceURI(iResource.getFullPath().toString(), true);
						TransactionalEditingDomain editingDomain = ModelBrowserPlugin.getEditingDomain(uri, false);
						if (editingDomain != null) {
							for (Resource resource : editingDomain.getResourceSet().getResources()) {
								for (Object contents : resource.getContents()) {
									if (contents instanceof Diagram) {
										diagrams.add((Diagram) contents);
									}
								}
							}
						}
					}
					return true;
				}
			});
		}

		private void findDiagramsForObject(List<Diagram> diagrams, Object object) throws CoreException {
			if (object instanceof IAdaptable) {
				findDiagramsForView(diagrams, (View) ((IAdaptable) object).getAdapter(View.class));
				findDiagramsForResource(diagrams, (IResource) ((IAdaptable) object).getAdapter(IResource.class));
			} else if (object instanceof IResource) {
				findDiagramsForResource(diagrams, (IResource) object);
			} else if (object instanceof View) {
				findDiagramsForView(diagrams, (View) object);
			} else if (object instanceof Diagram) {
				diagrams.add((Diagram) object);
			} else if (object instanceof EObject) {
				EObject element = (EObject) object;
				if (element.eResource() != null) {
					for (Resource resource : element.eResource().getResourceSet().getResources()) {
						for (Object contents : resource.getContents()) {
							if (contents instanceof Diagram) {
								Diagram diagram = (Diagram) contents;
								if (diagram.getElement() == element) {
									diagrams.add(diagram);
								}
							}
						}
					}
				}
			}
		}

		public void run() {
			for (Diagram diagram : diagrams) {
				if (diagram.eResource() == null) {
					continue;
				}
				URI uri = diagram.eResource().getURI();
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
