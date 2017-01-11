package org.muml.core.export.pages;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardDataTransferPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.muml.core.export.ExportPlugin;

public abstract class AbstractFujabaExportTargetPage extends WizardDataTransferPage implements IActivatableWizardPage {
	protected Button buttonOverwrite;
	protected FormToolkit toolkit;
	protected TreeViewer treeViewer;
	protected Text destinationText;

	protected IResource destination;

	public static String OVERWRITE_KEY = "overwrite";

	public AbstractFujabaExportTargetPage(String name, FormToolkit toolkit) {
		super(name);
		this.toolkit = toolkit;
		setTitle("Select Transformation Target");
		setDescription("Target");
	}

	public void restoreWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null && buttonOverwrite != null) {
			buttonOverwrite.setSelection(settings.getBoolean(OVERWRITE_KEY));
		}
	}

	@Override
	public void saveWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null && buttonOverwrite != null) {
			settings.put(OVERWRITE_KEY, buttonOverwrite.getSelection());
		}
	}

	/**
	 * Answer a boolean indicating whether the receivers destination
	 * specification widgets currently all contain valid values.
	 */
	protected boolean validateDestinationGroup() {
		String destinationValue = getDestinationValue();
		if (destinationValue.length() == 0) {
			setMessage(destinationEmptyMessage());
			return false;
		}

		setMessage(null);
		return true;
	}

	private String getDestinationValue() {
		return destinationText.getText();
	}

	/**
	 * Get the message used to denote an empty destination.
	 */
	protected String destinationEmptyMessage() {

		return "Please enter an export destination."; // XXX NLS
	}
	//
	// /**
	// * Returns the name of a container with a location that encompasses
	// targetDirectory.
	// * Returns null if there is no conflict.
	// *
	// * @param targetDirectory the path of the directory to check.
	// * @return the conflicting container name or <code>null</code>
	// */
	// protected String getConflictingContainerNameFor(String targetDirectory) {
	//
	// IPath rootPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
	// IPath testPath = new Path(targetDirectory);
	// // cannot export into workspace root
	// if(testPath.equals(rootPath))
	// return rootPath.lastSegment();
	//
	// //Are they the same?
	// if(testPath.matchingFirstSegments(rootPath) == rootPath.segmentCount()){
	// String firstSegment =
	// testPath.removeFirstSegments(rootPath.segmentCount()).segment(0);
	// if(!Character.isLetterOrDigit(firstSegment.charAt(0)))
	// return firstSegment;
	// }
	//
	// return null;
	//
	// }

	public void validatePage() {
		URI uri = getDestinationURI();

		// Decide if the destination is valid...
		// We support file system and platform URIs.
		boolean validDestination = false;
		if (uri != null && uri.isFile()) {
			File file = new File(uri.toFileString());
			if (file != null && file.exists()) {
				validDestination = true;
			}
		} else if (uri != null && uri.isPlatformResource()) {
			String platformString = uri.toPlatformString(true);
			IResource iResource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
			if (iResource != null && iResource.exists()) {
				validDestination = true;
			}
		}

		// Display error in case destination is invalid.
		String error = null;
		if (!validDestination) {
			error = "Specified destination does not exist.";
		}
		setErrorMessage(error);
		setPageComplete(error == null);
	}

	@Override
	public void createControl(final Composite parent) {

		initializeDialogUnits(parent);

		int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT | Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Target Properties");
		Composite composite = toolkit.createComposite(section);
		section.setClient(composite);
		final Button createFolderButton = toolkit.createButton(section, null, SWT.PUSH);
		createFolderButton.setImage(
				ExportPlugin.imageDescriptorFromPlugin(ExportPlugin.PLUGIN_ID, "images/new_folder.png").createImage());
		createFolderButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if (treeViewer.getSelection() instanceof StructuredSelection) {
					Object firstElement = ((StructuredSelection) treeViewer.getSelection()).getFirstElement();
					if (firstElement instanceof IContainer) {
						IContainer container = (IContainer) firstElement;

						String uniqueName = "unnamed";
						for (int i = 1;; i++) {
							if (container.findMember(uniqueName) == null) {
								break;
							}
							uniqueName = "unnamed" + i;
						}
						try {
							IFolder folder = container.getFolder(new Path(uniqueName));
							folder.create(true, true, new NullProgressMonitor());
							treeViewer.refresh(true);
							treeViewer.setSelection(new StructuredSelection(folder));
							treeViewer.getTree().setFocus();
							treeViewer.editElement(folder, 0);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		section.setTextClient(createFolderButton);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		composite.setFont(parent.getFont());

		Tree tree = toolkit.createTree(composite, SWT.BORDER);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		tree.setLayoutData(gridData);

		final ILabelProvider labelProvider = new WorkbenchLabelProvider();
		treeViewer = new TreeViewer(tree);
		treeViewer.setContentProvider(new WorkbenchContentProvider());
		treeViewer.setLabelProvider(labelProvider);
		treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());

		// treeViewer.expandAll();
		treeViewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				if (treeViewer.getSelection() instanceof StructuredSelection) {
					Object firstElement = ((StructuredSelection) treeViewer.getSelection()).getFirstElement();
					if (firstElement instanceof IResource && event.keyCode == SWT.DEL) {
						IResource resource = (IResource) firstElement;
						String message = String.format("Are you sure you want to delete resource '%s'?",
								resource.getName());
						if (MessageDialog.openQuestion(parent.getShell(), "Delete", message)) {
							try {
								resource.delete(true, new NullProgressMonitor());
							} catch (CoreException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		});
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof StructuredSelection) {
					Object firstElement = ((StructuredSelection) event.getSelection()).getFirstElement();
					createFolderButton.setEnabled(firstElement instanceof IContainer);
				}
			}
		});

		ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(treeViewer) {
			protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
				return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
						|| event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
						|| (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.F2)
						|| (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.CR)
						|| event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC;
			}
		};

		TreeViewerFocusCellManager focusCellManager = new TreeViewerFocusCellManager(treeViewer,
				new FocusCellOwnerDrawHighlighter(treeViewer));

		TreeViewerEditor.create(treeViewer, focusCellManager, actSupport,
				ColumnViewerEditor.TABBING_HORIZONTAL | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
						| ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);

		final TextCellEditor textCellEditor = new TextCellEditor(treeViewer.getTree());

		TreeViewerColumn column = new TreeViewerColumn(treeViewer, SWT.MULTI);
		column.getColumn().setWidth(600);
		column.getColumn().setMoveable(true);
		// column.getColumn().setText("Name");
		column.setLabelProvider(new CellLabelProvider() {

			@Override
			public void update(ViewerCell cell) {
				cell.setText(labelProvider.getText(cell.getElement()));
				cell.setImage(labelProvider.getImage(cell.getElement()));
			}

		});
		column.setEditingSupport(new EditingSupport(treeViewer) {
			protected boolean canEdit(Object element) {
				return true;
			}

			protected CellEditor getCellEditor(Object element) {
				return textCellEditor;
			}

			protected Object getValue(Object element) {
				if (element instanceof IResource) {
					return ((IResource) element).getName();
				}
				return element.toString();
			}

			protected void setValue(Object element, Object value) {
				if (element instanceof IResource) {
					try {
						((IResource) element).move(
								((IResource) element).getFullPath().removeLastSegments(1).append(value.toString()),
								true, new NullProgressMonitor());
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
				treeViewer.update(element, null);
			}
		});

		// Hide files if destination must be a directory
		if (wizardPageDirectoryDestination()) {
			treeViewer.addFilter(new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return !(element instanceof IFile);
				}
			});
		}

		// Hide dot files and closed resources
		treeViewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IProject && !((IProject) element).isOpen()) {
					return false;
				}
				if (((IResource) element).getName().startsWith(".")) {
					return false;
				}
				return true;
			}
		});
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				String destinationString = "";
				if (treeViewer.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
					if (!selection.isEmpty() && selection.getFirstElement() instanceof IResource) {
						IResource resource = (IResource) selection.getFirstElement();
						destination = resource;
						URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
						destinationString = uri.toString();
					}
				}
				// destinationText.setText(destination);
				destinationText.setText(destinationString);
				validatePage();
			}

		});
		Composite destinationComposite = toolkit.createComposite(composite);
		destinationComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout destinationLayout = new GridLayout(2, false);
		destinationLayout.marginWidth = 0;
		destinationLayout.marginLeft = destinationLayout.marginRight = 0;
		destinationComposite.setLayout(destinationLayout);
		destinationText = toolkit.createText(destinationComposite, "", SWT.BORDER);
		destinationText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		destinationText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				validatePage();
			}

		});

		if (wizardPageSupportsFilesystem()) {
			Button browse = toolkit.createButton(destinationComposite, "Filesystem...", SWT.FLAT);
			browse.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
			browse.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					FileDialog fd = new FileDialog(getShell(), SWT.OPEN);
					fd.setText("Select target");
					String fileName = fd.open();
					if (fileName == null) {
						return;
					}
					treeViewer.setSelection(new StructuredSelection());
					destinationText.setText(URI.createFileURI(fileName).toString());
					destinationText.setFocus();
					destinationText.setSelection(destinationText.getText().length());
					validatePage();
				}
			});
		}

		if (shouldDisplayOptions()) {
			// Options
			sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT | Section.EXPANDED | Section.TWISTIE;
			Section optionsSection = toolkit.createSection(composite, sectionStyle);
			optionsSection.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
			optionsSection.setText("Options");
			Composite optionsComposite = toolkit.createComposite(optionsSection);
			optionsSection.setClient(optionsComposite);

			optionsComposite.setLayout(new GridLayout());
			optionsComposite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
			optionsComposite.setFont(parent.getFont());
			createOptions(optionsComposite);
		}

		// restoreResourceSpecificationWidgetValues(); // ie.- local
		restoreWidgetValues(); // ie.- subclass hook
		// if (initialResourceSelection != null) {
		// setupBasedOnInitialSelections();
		// }

		updateWidgetEnablements();
		setPageComplete(determinePageCompletion());
		setErrorMessage(null); // should not initially have error message

		setControl(section);

		applyInitialSelection();
	}

	protected void applyInitialSelection() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IResource) {
				IResource resource = (IResource) ((IAdaptable) firstElement).getAdapter(IResource.class);
				while (resource != null && (isFiltered(resource) || resource instanceof IFile)) {
					resource = resource.getParent();
				}
				if (resource != null) {
					treeViewer.setSelection(null);
					treeViewer.setSelection(new StructuredSelection(resource));
					treeViewer.setExpandedState(resource, true);
				}
			}
		}
	}

	private boolean isFiltered(Object object) {
		for (ViewerFilter filter : treeViewer.getFilters()) {
			if (!filter.select(treeViewer, null, object)) {
				return true;
			}
		}
		return false;
	}

	public void createOptions(Composite parent) {
		buttonOverwrite = toolkit.createButton(parent, "Overwrite existing resources", SWT.CHECK);
	}

	protected boolean shouldDisplayOptions() {
		return wizardPageSupportsOverwriteOption();
	}

	@Override
	protected boolean allowNewContainerName() {
		return true;
	}

	@Override
	public void handleEvent(Event event) {
	}

	public abstract boolean wizardPageSupportsOverwriteOption();

	public abstract boolean wizardPageDirectoryDestination();

	public boolean wizardPageSupportsFilesystem() {
		return true;
	}

	public IResource getDestinationResource() {
		return destination;
	}

	public URI getDestinationURI() {
		return URI.createURI(getDestinationValue());
	}

	@Override
	public void activate() {
		treeViewer.getTree().setFocus();
		treeViewer.getTree().forceFocus();
	}

	@Override
	public void deactivate() {
		// default implementation: do nothing.
	}
}
