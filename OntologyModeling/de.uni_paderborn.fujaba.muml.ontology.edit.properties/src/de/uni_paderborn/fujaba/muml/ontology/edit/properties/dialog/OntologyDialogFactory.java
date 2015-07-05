package de.uni_paderborn.fujaba.muml.ontology.edit.properties.dialog;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.views.properties.NewPropertySheetHandler;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;

import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.ontology.OntologyExtension;
import de.uni_paderborn.fujaba.muml.ontology.OntologyPackage;
import de.uni_paderborn.fujaba.muml.ontology.edit.properties.parser.OWLOntologyUtil;
import de.uni_paderborn.fujaba.muml.ontology.edit.properties.providers.OntologyClassPropertyContentProvider;
import de.uni_paderborn.fujaba.muml.ontology.edit.properties.providers.OntologyClassTreeContentProvider;

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
			return new OntologyClassDialog(shell, ontologyUtils,
					new OntologyClassTreeContentProvider(),
					ontologyUtils.getloadedOntologies());
		if (element instanceof Port)
			return new OntologyClassDialog(shell, ontologyUtils,
					new OntologyClassTreeContentProvider(),
					ontologyUtils.getloadedOntologies());
		if (element instanceof ComponentPart)
			return new OntologyClassDialog(shell, ontologyUtils,
					new OntologyClassTreeContentProvider(),
					ontologyUtils.getloadedOntologies());
		if (element instanceof PortPart)
			return new OntologyClassDialog(shell, ontologyUtils,
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
