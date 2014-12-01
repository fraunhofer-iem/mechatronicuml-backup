package de.uni_paderborn.fujaba.muml.ontology.edit.properties.dialog;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import de.uni_paderborn.fujaba.muml.ontology.edit.properties.parser.OWLOntologyUtil;

public class OntologyPropertiesDialog extends OntologyDialog {

	public OntologyPropertiesDialog(Shell parentShell,
			OWLOntologyUtil owlOntologyUtil, IContentProvider contentProvider,
			Object input) {
		super(parentShell, owlOntologyUtil, contentProvider, input);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createEnhancedButtons(Composite parent) {
		// TODO Auto-generated method stub
	}

}
