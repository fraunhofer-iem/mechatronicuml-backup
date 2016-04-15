package org.muml.ontology.edit.properties.providers;

import org.eclipse.jface.viewers.LabelProvider;

public class OntologyLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof OWLOntology) {
			return ((OWLOntology) element).getOntologyID().getOntologyIRI()
					.get().toString();

		}

		if (element instanceof OWLEntity) {

			return ((OWLEntity) element).getIRI().getShortForm();
		}
		return super.getText(element);
	}

}
