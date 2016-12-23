package org.muml.ontology.edit.properties.dialog;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.muml.core.common.ui.FileSelector;
import org.muml.ontology.edit.properties.parser.OWLOntologyUtil;
import org.muml.ontology.edit.properties.providers.OntologyLabelProvider;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;

public class OntologyDialog extends TitleAreaDialog {

	private static final String OWL_FILE_EXTENSION = "owl";
	private static final String IMPORT_ONTOLOGY_DIALOG_DESCRIPTION = "Select the OWL resource that should be imported.";
	private static final String IMPORT_ONTOLOGY_BUTTON_TEXT = "Import Ontology...";

	private String title;
	private String description;
	private OWLOntologyUtil ontologyUtils;
	private TreeViewer viewer;
	private OWLEntity ontologyClass;
	protected AdapterFactoryEditingDomain domain;
	private IContentProvider contentProvider;
	private Set<OWLOntology> input;
	private IRI defaultIRI;

	public OntologyDialog(Shell parentShell, OWLOntologyUtil owlOntologyUtil, IContentProvider contentProvider, Set<OWLOntology> input) {
		super(parentShell);
		this.title = "Select an Ontology Entity";
		this.ontologyUtils = owlOntologyUtil;
		this.contentProvider = contentProvider;
		this.input = input;
	}

	public OWLOntologyUtil getOntologyUtils() {
		return ontologyUtils;
	}

	public TreeViewer getViewer() {
		return viewer;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite area = (Composite) super.createDialogArea(parent);

		final Composite composite = new Composite(area, SWT.NONE);
		GridLayoutFactory.fillDefaults().margins(6, 6).numColumns(2).applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);
		this.createTreeViewer(composite);

		final Composite controlsComposite = createControls(composite);
		createButtons(composite, controlsComposite);
		createSeparator(area);
		refreshMetaDataInformation();
		// disableButtons();
		

		return area;
	}
	
	@Override
	protected Control createContents(Composite parent) {
		Control control = super.createContents(parent);
		setDefaultIRI(defaultIRI);
		viewer.getControl().setFocus();
		return control;
	}

	private Composite createControls(final Composite composite) {
		final Composite controlsComposite = new Composite(composite, SWT.NONE);
		GridLayoutFactory.fillDefaults().applyTo(controlsComposite);
		GridDataFactory.fillDefaults().grab(false, true).align(SWT.FILL, SWT.BEGINNING).applyTo(controlsComposite);
		return controlsComposite;
	}

	private void createButtons(final Composite parent, final Composite controlsComposite) {
		final Composite composite = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(composite);
		GridDataFactory.fillDefaults().applyTo(composite);

		final Button importButton = new Button(composite, SWT.PUSH);
		importButton.setText(IMPORT_ONTOLOGY_BUTTON_TEXT);
		importButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {

				IFile file = FileSelector.selectFile(getShell(), IMPORT_ONTOLOGY_DIALOG_DESCRIPTION, null, null,
						OWL_FILE_EXTENSION);
				if (file == null) {
					return;
				} else {
					getOntologyUtils().addOntologyFile(
							URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString());
					getViewer().refresh();
				}
			}
		});
	}

	private void createSeparator(final Composite area) {
		final Label separator = new Label(area, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(separator);
	}

	public void setWindowTitle(final String title) {
		this.title = title;
	}

	private void refreshMetaDataInformation() {
		this.setTitle(this.title);
		this.setMessage(this.description);
	}

	private void createTreeViewer(final Composite parent) {
		//final Text filterText = new Text(parent, SWT.BOTTOM | SWT.SEARCH);
		//filterText.setText("Filtertext");
		//final GridData filterGrid = new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL);
		//filterGrid.horizontalSpan = 2;
		//filterText.setLayoutData(filterGrid);

		final Tree tree = new Tree(parent, SWT.BORDER | SWT.MULTI);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(tree);

		this.viewer = new TreeViewer(tree);
		this.viewer.setAutoExpandLevel(3);
		this.viewer.setContentProvider(this.contentProvider);

		this.viewer.setLabelProvider(new OntologyLabelProvider());

		this.viewer.setInput(this.input);
		this.viewer.addSelectionChangedListener(new TreeViewerSelectionChangedListener());

	}

	@Override
	protected Control createButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		Control buttonBar = super.createButtonBar(parent);
		this.getButton(IDialogConstants.OK_ID).setEnabled(false);
		return buttonBar;
	}

	protected void checkStatus(final IStructuredSelection selection) {

		// check selection
		if (selection.isEmpty()) {
			this.ontologyClass = null;
		} else if (selection.size() == 1) {
			final Object selected = selection.getFirstElement();

			// store data type + repository
			if (selected instanceof OWLClass) {
				this.ontologyClass = (OWLClass) selected;
			}
		}
		
		// Update button enablement
		Button button = this.getButton(IDialogConstants.OK_ID);
		if (button != null && !button.isDisposed()) {
			this.getButton(IDialogConstants.OK_ID).setEnabled(this.ontologyClass != null);
		}
	}

	public OWLEntity getResult() {
		return this.ontologyClass;
	}

	private final class TreeViewerSelectionChangedListener implements ISelectionChangedListener {
		@Override
		public void selectionChanged(final SelectionChangedEvent event) {
			OntologyDialog.this.checkStatus((IStructuredSelection) OntologyDialog.this.viewer.getSelection());
		}
	}


	public void setDefaultIRI(IRI iri) {
		this.defaultIRI = iri;
		if (viewer == null) {
			return;
		}
		for (OWLOntology ontology : input) {
			Set<OWLEntity> entities = ontology.getEntitiesInSignature(iri);
			if (!entities.isEmpty()) {
				IStructuredSelection selection = new StructuredSelection(entities.toArray());
				viewer.setSelection(selection);
			}
		}
	}
	
	
	@Override
	protected boolean isResizable() {
		return true;
	}

}
