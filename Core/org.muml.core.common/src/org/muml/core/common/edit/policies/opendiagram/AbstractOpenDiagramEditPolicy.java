package org.muml.core.common.edit.policies.opendiagram;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.muml.core.common.FujabaCommonPlugin;

public abstract class AbstractOpenDiagramEditPolicy extends OpenEditPolicy {

	protected Command getOpenCommand(Request request) {
		EditPart targetEditPart = getTargetEditPart(request);
		if (false == targetEditPart.getModel() instanceof View) {
			return null;
		}
		final View view = (View) targetEditPart.getModel();

		final EObject diagramDomainElement = getDiagramDomainElement(view);
		if (diagramDomainElement == null) {
			return null;
		}

		CompoundCommand compoundCommand = new CompoundCommand();

		Diagram diagram = getDiagramToOpen(view);

		// If diagram is in external resource, make sure that we get the correct
		// editing domain for that resource.
		TransactionalEditingDomain diagramEditingDomain = TransactionUtil
				.getEditingDomain(view);

		if (diagram == null) {
			// Ask the user, if he wants to reference an existing diagram and
			// set "diagram" accordingly

			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getShell();

			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace()
					.getRoot();

			// Deactivated this question, see discussion in muml bug #484
			// MessageBox messageBox = new MessageBox(shell, SWT.ICON_QUESTION |
			// SWT.YES | SWT.NO| SWT.CANCEL);
			// messageBox.setText("Create new Subdiagram");
			// messageBox.setMessage("Do you want to create a new Subdiagram?");
			// int buttonID = messageBox.open();
			// if (buttonID == SWT.CANCEL) {
			// return null;
			//
			// } else if (buttonID == SWT.NO) {
			URI myUri = view.eResource().getURI();
			IFile myFile = workspaceRoot.getFile(new Path(myUri
					.toPlatformString(true)));

			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
					shell, new WorkbenchLabelProvider(),
					new BaseWorkbenchContentProvider()) {
				protected TreeViewer createTreeViewer(Composite parent) {
					TreeViewer treeViewer = super.createTreeViewer(parent);
					// #484: DEACTIVATED expandAll() because it made problems (diagram could not be saved anymore etc.)
					// treeViewer.expandAll();
					return treeViewer;
				}
			};
			// elementSelector.addFilter(new ExtensionViewerFilter(filter));
			dialog.setInput(workspaceRoot);
			dialog.setTitle("Connect to existing diagram");
			dialog.setMessage("Please connect a diagram that you want to open.");
			dialog.setAllowMultiple(false);
			dialog.addFilter(new DiagramFileViewerFilter(diagramDomainElement));
			dialog.addFilter(new ViewerFilter() {

				@Override
				public boolean select(Viewer viewer, Object parentElement,
						Object element) {
					if (element instanceof IResource) {
						return !((IResource) element).getName().startsWith(".");
					}
					return true;
				}

			});

			dialog.setValidator(new ISelectionStatusValidator() {

				public final IStatus errorNoFileSelected = new Status(
						IStatus.ERROR, FujabaCommonPlugin.ID,
						"No diagram file selected.");

				@Override
				public IStatus validate(Object[] selection) {
					for (Object element : selection) {
						if (false == element instanceof IFile) {
							return errorNoFileSelected;
						}
					}
					return Status.OK_STATUS;
				}

			});
			// dialog.setImage(image);

			dialog.setInitialSelection(myFile.getParent());

			int exitCode = dialog.open();
			if (exitCode != Window.OK) {
				// Cancel opening diagram
				return null;
			}

			IFile file = null;
			if (dialog.getResult() instanceof Object[]) {
				Object[] result = (Object[]) dialog.getResult();
				if (result.length > 0) {
					Object first = result[0];
					if (first instanceof IFile) {
						file = (IFile) first;
					}
				}
			}

			if (file != null) {
				// TODO: Find existing editing domain to reuse for
				// resourceSet and diagramEditingDomain!
				URI uri = URI.createPlatformResourceURI(file.getFullPath()
						.toString(), true);
				ResourceSet resourceSet = diagramDomainElement.eResource().getResourceSet();
				Resource resource = resourceSet.createResource(uri);
				try {
					resource.load(Collections.emptyMap());
				} catch (IOException e) {
				}
				if (resource != null && !resource.getContents().isEmpty()) {
					EObject root = resource.getContents().get(0);
					if (root instanceof Diagram) {
						diagram = (Diagram) root;
					}
				}

			}

			// Reference existing diagram file
			compoundCommand.add(new ICommandProxy(new ReferenceDiagramCommand(
					diagramEditingDomain, view, diagram)));

			// Deactivated as we decided that we do not want diagrams within
			// diagrams,
			// see discussion in muml bug #484
			// } else {
			//
			// // Create diagram within our diagram file (new root element)
			// compoundCommand.add(new ICommandProxy(new
			// CreateDiagramCommand(view, diagramDomainElement)));
			// }

		}

		compoundCommand.add(new ICommandProxy(new OpenDiagramCommand(
				diagramEditingDomain, view)));

		return compoundCommand;
	}

	protected Diagram getDiagramToOpen(View view) {
		HintedDiagramLinkStyle facet = getDiagramFacet(view);
		if (facet != null) {
			return facet.getDiagramLink();
		}
		return null;
	}

	private HintedDiagramLinkStyle getDiagramFacet(View view, boolean create) {
		HintedDiagramLinkStyle style = getDiagramFacet(view);
		if (style == null && create) {
			style = (HintedDiagramLinkStyle) view
					.createStyle(NotationPackage.eINSTANCE
							.getHintedDiagramLinkStyle());
		}
		return style;
	}

	private HintedDiagramLinkStyle getDiagramFacet(View view) {
		Style link = view.getStyle(NotationPackage.eINSTANCE
				.getHintedDiagramLinkStyle());
		if (link instanceof HintedDiagramLinkStyle) {
			return (HintedDiagramLinkStyle) link;
		}
		return null;
	}

	// Copied from editor utils
	public Map<?, ?> getSaveOptions() {
		HashMap<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		return saveOptions;
	}

	protected EObject getDiagramDomainElement(View view) {
		// default: use same element as associated with EP
		return view.getElement();
	}

	protected PreferencesHint getPreferencesHint() {
		return new PreferencesHint(getPluginID());
	}

	protected abstract String getDiagramKind();

	protected abstract String getPluginID();

	protected abstract String getEditorID();

	protected abstract String getDiagramFileExtension();

	protected class OpenDiagramCommand extends AbstractTransactionalCommand {

		protected final View view;

		public OpenDiagramCommand(TransactionalEditingDomain editingDomain,
				View view) {
			super(editingDomain, "Open Diagram", null);
			this.view = view;
		}

		// FIXME canExecute if !(readOnly && getDiagramToOpen == null), i.e.
		// open works on ro diagrams only when there's associated diagram
		// already

		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			Diagram diagram = getDiagramToOpen(view);
			if (diagram == null) {
				return CommandResult
						.newErrorCommandResult("Cannot open non-existing diagram.");
			}
			try {
				URI uri = EcoreUtil.getURI(diagram);
				String editorName = uri.lastSegment() + '#'
						+ diagram.eResource().getContents().indexOf(diagram);
				IEditorInput editorInput = new URIEditorInput(uri, editorName);
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				page.openEditor(editorInput, getEditorID());
				return CommandResult.newOKCommandResult();
			} catch (Exception ex) {
				throw new ExecutionException("Can't open diagram", ex);
			}
		}

	}

	protected class ReferenceDiagramCommand extends
			AbstractReferenceDiagramCommand {

		protected final Diagram diagram;

		public ReferenceDiagramCommand(
				TransactionalEditingDomain editingDomain, View view,
				Diagram diagram) {
			super(editingDomain, view);
			this.diagram = diagram;
		}

		@Override
		protected Diagram getDiagram() throws ExecutionException {
			return diagram;
		}
	}

	protected abstract class AbstractReferenceDiagramCommand extends
			AbstractTransactionalCommand {

		protected final View view;

		public AbstractReferenceDiagramCommand(
				TransactionalEditingDomain editingDomain, View view) {
			super(editingDomain, "Reference Diagram", null);
			this.view = view;
		}

		protected abstract Diagram getDiagram() throws ExecutionException;

		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			referenceDiagram(getDiagram());
			return CommandResult.newOKCommandResult(view);
		}

		protected void referenceDiagram(Diagram diagram)
				throws ExecutionException {
			final HintedDiagramLinkStyle diagramFacet = getDiagramFacet(view,
					true);
			diagramFacet.setDiagramLink(diagram);

			EObject container = diagramFacet.eContainer();
			while (container instanceof View) {
				((View) container).persist();
				container = container.eContainer();
			}
			try {
				new WorkspaceModifyOperation() {
					protected void execute(IProgressMonitor monitor)
							throws CoreException, InvocationTargetException,
							InterruptedException {
						try {
							for (Resource nextResource : diagramFacet.eResource()
									.getResourceSet().getResources()) {
								if (nextResource.isLoaded() && !getEditingDomain().isReadOnly(nextResource)) {
									nextResource.save(getSaveOptions());
								}
							}
						} catch (IOException ex) {
							throw new InvocationTargetException(ex,
									"Save operation failed");
						}
					}
				}.run(null);
			} catch (InvocationTargetException e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);
			} catch (InterruptedException e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);
			}
		}
	}

	protected class CreateDiagramCommand extends
			AbstractReferenceDiagramCommand {

		/**
		 * Lazily created diagram.
		 */
		protected Diagram diagram;

		/**
		 * View that references the newly created diagram.
		 */
		protected final View view;

		/**
		 * Domain element for the new diagram.
		 */
		protected EObject diagramDomainElement;

		public CreateDiagramCommand(View view, EObject diagramDomainElement) {
			super(TransactionUtil.getEditingDomain(view), view);
			this.view = view;
			this.diagramDomainElement = diagramDomainElement;
			setLabel("Create Diagram");
		}

		@Override
		protected Diagram getDiagram() throws ExecutionException {
			if (diagram == null) {
				diagram = createNewDiagram();
			}
			return diagram;
		}

		protected Diagram createNewDiagram() throws ExecutionException {
			if (diagramDomainElement == null) {
				return null;
			}
			Diagram d = ViewService.createDiagram(diagramDomainElement,
					getDiagramKind(), getPreferencesHint());
			if (d == null) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind");
			}
			final HintedDiagramLinkStyle diagramFacet = getDiagramFacet(view,
					true);
			assert diagramFacet.eResource() != null;
			diagramFacet.eResource().getContents().add(d);
			return d;
		}

	}

	public class DiagramFileViewerFilter extends ViewerFilter {
		protected final EObject diagramDomainElement;

		public DiagramFileViewerFilter(EObject diagramDomainElement) {
			this.diagramDomainElement = diagramDomainElement;
		}

		@Override
		public boolean select(Viewer viewer, Object parentElement,
				Object element) {
			boolean selected = true;
			if (element instanceof IFile) {
				selected = false;

				IFile file = (IFile) element;

				URI uri = URI.createPlatformResourceURI(file.getFullPath()
						.toString(), true);
				ResourceSet resourceSet = diagramDomainElement.eResource().getResourceSet();
				Resource resource = resourceSet.createResource(uri);
				try {
					resource.load(Collections.emptyMap());
				} catch (IOException e) {
				}
				if (resource != null && !resource.getContents().isEmpty()) {
					EObject root = resource.getContents().get(0);
					if (root instanceof Diagram) {
						Diagram diagram = (Diagram) root;
						if (diagram.getElement() == diagramDomainElement) {
							selected = true;
						} else {
							TreeIterator<EObject> it = diagram.eAllContents();
							while (it.hasNext()) {
								EObject view = it.next();
								if (view instanceof View) {
									if (((View) view).getElement() == diagramDomainElement) {
										selected = true;
									}
								}
							}
						}

					}
				}
				resourceSet.getResources().remove(resource);
			}
			return selected;
		}

	}

}
