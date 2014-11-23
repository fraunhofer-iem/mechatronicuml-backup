package de.uni_paderborn.fujaba.muml.ontology.edit.properties.dialog;

import java.util.HashSet;

import javax.xml.ws.FaultAction;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.semanticweb.owlapi.model.OWLClass;

import com.clarkparsia.owlapi.explanation.util.OntologyUtils;

import de.uni_paderborn.fujaba.common.Messages;
import de.uni_paderborn.fujaba.common.ui.FileSelector;
import de.uni_paderborn.fujaba.muml.ontology.edit.properties.parser.OWLOntologyUtil;

public class OntologyDialog extends TitleAreaDialog {

	private static final String OWL_FILE_EXTENSION = "owl";
	private static final String IMPORT_ONTOLOGY_DIALOG_DESCRIPTION = "Select the OWL resource that should be imported.";
	private static final String IMPORT_ONTOLOGY_BUTTON_TEXT = "Import Ontology...";
	private static final String IMPORT_ONTOLOGY_DIALOG_LABEL_CONTENT = "Select OWL Resource";
	// private static final String DESCRIPTION =
	// "Right click on an Ontology Entity to see the information";

	private String title;
	private String description;
	private OWLOntologyUtil ontologyUtils;
	private TreeViewer viewer;
	
	private OWLClass ontologyClass;

	protected AdapterFactoryEditingDomain domain;

	private Button editButton;
	private Button removeButton;
	private Button infoButton;

	private Button showallCheckbox;
	
	private String projectName;

	public OntologyDialog(Shell parentShell, final String projectName) {
		super(parentShell);
		this.title = "Select an Ontology Entity";
		this.ontologyUtils = new OWLOntologyUtil();
		this.projectName = projectName;

	}

	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite area = (Composite) super.createDialogArea(parent);

		final Composite composite = new Composite(area, SWT.NONE);
		GridLayoutFactory.fillDefaults().margins(6, 6).numColumns(2)
				.applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);
		this.createTreeViewer(composite);

		final Composite controlsComposite = createControls(composite);
		createButtons(composite, controlsComposite);
		createSeparator(area);
		refreshMetaDataInformation();
		// disableButtons();
		
		return area;
	}

	private Composite createControls(final Composite composite) {
		final Composite controlsComposite = new Composite(composite, SWT.NONE);
		GridLayoutFactory.fillDefaults().applyTo(controlsComposite);
		GridDataFactory.fillDefaults().grab(false, true)
				.align(SWT.FILL, SWT.BEGINNING).applyTo(controlsComposite);
		return controlsComposite;
	}

	private void createButtons(final Composite composite,
			final Composite controlsComposite) {
		this.createControlButtons(controlsComposite);

		this.createEnhancedButtons(composite);
		
	}

	private void createSeparator(final Composite area) {
		final Label separator = new Label(area, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(separator);
	}

	private void createControlButtons(final Composite parent) {
		// edit button
		this.editButton = new Button(parent, SWT.PUSH);
		// this.editButton.setImage(CoreImages.get(CoreImages.EDIT));
		// this.editButton.setToolTipText("Edit Selected "
		// + this.getOntologyEntityTypeName());
		this.editButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				// final Object element = ((IStructuredSelection)
				// AbstractOwlOntologyClassImporterDialog.this.viewer
				// .getSelection()).getFirstElement();
				//
				// if (element instanceof OntologyEntity) {
				// AbstractOwlOntologyClassImporterDialog.this
				// .editOntologyEntity((OntologyEntity) element);
				// }
			}
		});

		// remove button
		this.removeButton = new Button(parent, SWT.PUSH);
		// this.removeButton.setImage(CoreImages.get(CoreImages.REMOVE));
		// this.removeButton.setToolTipText("Remove Selected "
		// + this.getOntologyEntityTypeName());
		this.removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				// final Collection<OntologyEntity> toRemove = new
				// ArrayList<OntologyEntity>();
				//
				// for (TreeItem item : viewer.getTree().getSelection()) {
				// Object selected = item.getData();
				// if (selected instanceof OntologyEntity) {
				// toRemove.add((OntologyEntity) selected);
				// } else if (selected instanceof URI) {
				//
				// for (TreeItem ontItem : item.getItems()) {
				// toRemove.add((OntologyEntity) ontItem.getData());
				// }
				// }
				// }
				//
				// // create command
				// final Command command = DeleteCommand.create(
				// AbstractOwlOntologyClassImporterDialog.this
				// .getEditingDomain(), toRemove);
				// AbstractOwlOntologyClassImporterDialog.this.getEditingDomain()
				// .getCommandStack().execute(command);
				//
				// // refresh viewer
				// AbstractOwlOntologyClassImporterDialog.this.viewer.refresh();
				//
				// if (AbstractOwlOntologyClassImporterDialog.this.currentOwner
				// != null) {
				// AbstractOwlOntologyClassImporterDialog.this.viewer
				// .setSelection(
				// new StructuredSelection(
				// OntologyDialog.this.currentOwner),
				// true);
				// }
			}
		});

		// info button
		this.infoButton = new Button(parent, SWT.PUSH);
		// this.infoButton.setImage(CoreImages.get(CoreImages.STATE_INFORMATION));
		// this.infoButton.setToolTipText("Show Info for "
		// + this.getOntologyEntityTypeName());
		this.infoButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final Object element = ((IStructuredSelection) OntologyDialog.this.viewer
						.getSelection()).getFirstElement();

				// if (element instanceof OntologyEntity) {
				// openSelectOntologyEntityInfoWindow((OntologyEntity) element);
				// }
			}
		});

		// showall checkbox
		this.showallCheckbox = new Button(parent, SWT.CHECK);
		this.showallCheckbox.setText("Show all");
		this.showallCheckbox
				.setToolTipText("Show every sub-/superclass in infowindow (even doubles, triples etc.)");
		// this.showallCheckbox.setSelection(Activator.get().getPreferenceStore()
		// .getBoolean("SHOW_ALL"));
		// this.showallCheckbox.addSelectionListener(new SelectionAdapter() {
		// @Override
		// public void widgetSelected(final SelectionEvent e) {
		// if (showallCheckbox.getSelection()) {
		// Activator.get().getPreferenceStore()
		// .setValue("SHOW_ALL", true);
		// } else {
		// Activator.get().getPreferenceStore()
		// .setValue("SHOW_ALL", false);
		// }
		// }
		// });
	}

	private void createEnhancedButtons(final Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(composite);
		GridDataFactory.fillDefaults().applyTo(composite);

		final Button importButton = new Button(composite, SWT.PUSH);
		importButton.setText(IMPORT_ONTOLOGY_BUTTON_TEXT);
		importButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {

				IFile file = FileSelector.selectFile(getShell(),
						IMPORT_ONTOLOGY_DIALOG_DESCRIPTION, null, null,
						OWL_FILE_EXTENSION);
				if (file == null) {
					return;
				}
			}
		});
	}

	public void setWindowTitle(final String title) {
		this.title = title;
	}

	private void refreshMetaDataInformation() {
		this.setTitle(this.title);
		this.setMessage(this.description);
	}

	private void createTreeViewer(final Composite parent) {
		final Text filterText = new Text(parent, SWT.BOTTOM | SWT.SEARCH);
		filterText.setText("Filtertext");
		final GridData filterGrid = new GridData(GridData.GRAB_HORIZONTAL
				| GridData.HORIZONTAL_ALIGN_FILL);
		filterGrid.horizontalSpan = 2;
		filterText.setLayoutData(filterGrid);

		final Tree tree = new Tree(parent, SWT.BORDER | SWT.MULTI);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(tree);

		this.viewer = new TreeViewer(tree);
		this.viewer.setAutoExpandLevel(3);
		this.viewer.setContentProvider(new OntologyClassTreeContentProvider());

		this.viewer.setLabelProvider(new OntologyLabelProvider());

		this.viewer.setInput(ontologyUtils.getloadedOntologies());
        this.viewer.addSelectionChangedListener(new TreeViewerSelectionChangedListener());
        
       /**
        * FIXME: move this into ontology loader
        */
        ontologyUtils.getProjectPrefernces(projectName);
        

		// this.viewer.setComparator(new
		// SelectOntologyEntityViewerComparator());
		// this.viewer.addFilter(new OntologyEntityViewerFilter());
		//
		// addTreeViewerListeners();
		//
		// filterText.addKeyListener(new TreeViewerKeyAdapter(filterText));
	}
	
	
	
	@Override
	protected Control createButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		Control buttonBar = super.createButtonBar(parent);
		this.getButton(IDialogConstants.OK_ID).setEnabled(false);
		return buttonBar;
	}

	protected void checkStatus(final IStructuredSelection selection) {
        boolean editEnabled = false;
        boolean removeEnabled = false;
        boolean infoEnabled = false;
        boolean okEnabled = false;

        // check selection
        if (selection.isEmpty()) {
            this.ontologyClass = null;
        } else if (selection.size() == 1) {
            final Object selected = selection.getFirstElement();

            // store data type + repository
            if (selected instanceof OWLClass) {
                this.ontologyClass = (OWLClass) selected;

                editEnabled = true;
                removeEnabled = true;
                infoEnabled = true;
                okEnabled = true;
            } 
        } 

        this.editButton.setEnabled(editEnabled);
        this.removeButton.setEnabled(removeEnabled);
        this.infoButton.setEnabled(infoEnabled);
        this.showallCheckbox.setEnabled(true);
        this.getButton(OK).setEnabled(okEnabled);
    }
	
	public OWLClass getResult(){
		return this.ontologyClass;
	}
	
	private final class TreeViewerSelectionChangedListener implements ISelectionChangedListener {
        @Override
        public void selectionChanged(final SelectionChangedEvent event) {
        	OntologyDialog.this.checkStatus((IStructuredSelection) OntologyDialog.this.viewer
                            .getSelection());
        }
    }
	
	
	

}
