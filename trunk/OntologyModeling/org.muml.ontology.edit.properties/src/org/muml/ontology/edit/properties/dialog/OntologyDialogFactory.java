package org.muml.ontology.edit.properties.dialog;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.muml.ontology.edit.properties.parser.OWLOntologyUtil;
import org.muml.ontology.edit.properties.providers.OntologyClassTreeContentProvider;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortPart;

/**
 * Factory Pattern to create different Ontology Dialogs
 * 
 * @author ralle
 *
 */
public class OntologyDialogFactory {
	private static OntologyDialogFactory instance = null;

	private OntologyDialogFactory() {

	}

	public static OntologyDialogFactory getInstance() {
		if (instance == null) {
			instance = new OntologyDialogFactory();
		}
		return instance;
	}
 
	// TODO: Handle each element in its own way
	public OntologyDialog createOntologyDialog(Shell shell, EObject element) {
		String projectName = element.eResource().getURI().segment(1);
		OWLOntologyUtil ontologyUtils = new OWLOntologyUtil(projectName);
		if (element instanceof Component)
			return new OntologyDialog(shell, ontologyUtils,
					new OntologyClassTreeContentProvider(),
					ontologyUtils.getloadedOntologies());
		if (element instanceof Port)
			return new OntologyDialog(shell, ontologyUtils,
					new OntologyClassTreeContentProvider(),
					ontologyUtils.getloadedOntologies());
		if (element instanceof ComponentPart)
			return new OntologyDialog(shell, ontologyUtils,
					new OntologyClassTreeContentProvider(),
					ontologyUtils.getloadedOntologies());
		if (element instanceof PortPart)
			return new OntologyDialog(shell, ontologyUtils,
					new OntologyClassTreeContentProvider(),
					ontologyUtils.getloadedOntologies());
		/*if (element instanceof Port) {
			Component component = ((Port) element).getComponent();
			OntologyExtension extension = (OntologyExtension) component
					.getExtension(OntologyPackage.Literals.ONTOLOGY_EXTENSION);
			Object input = null;
			if (extension != null) {
				OWLDataFactory factory = ontologyUtils.getOntologyManager()
						.getOWLDataFactory();
				OWLClass owlClass = factory.getOWLClass(IRI.create(extension
						.getOntologyReference()));
				input = owlClass;
			}
			return new OntologyPropertiesDialog(shell, ontologyUtils,
					new OntologyClassPropertyContentProvider(),
					new Object[] { input });
		} */
		return null;

	}

}
