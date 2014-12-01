package de.uni_paderborn.fujaba.muml.ontology.edit.properties.dialog;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import de.uni_paderborn.fujaba.common.ui.FileSelector;
import de.uni_paderborn.fujaba.muml.ontology.edit.properties.parser.OWLOntologyUtil;

public class OntologyClassDialog extends OntologyDialog {

	private static final String OWL_FILE_EXTENSION = "owl";
	private static final String IMPORT_ONTOLOGY_DIALOG_DESCRIPTION = "Select the OWL resource that should be imported.";
	private static final String IMPORT_ONTOLOGY_BUTTON_TEXT = "Import Ontology...";

	public OntologyClassDialog(Shell parentShell,
			OWLOntologyUtil owlOntologyUtil, IContentProvider contentProvider,
			Object input) {
		super(parentShell, owlOntologyUtil, contentProvider, input);
		// TODO Auto-generated constructor stub
	}

	public void createEnhancedButtons(final Composite parent) {
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
				} else {
					getOntologyUtils().addOntologyFile(
							URI.createPlatformResourceURI(
									file.getFullPath().toString(), true)
									.toString());
					getViewer().refresh();
				}
			}
		});
	}

}
