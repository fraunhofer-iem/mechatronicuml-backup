package org.muml.ontology.edit.properties.providers;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.semanticweb.owlapi.model.OWLClass;

public class OntologyClassPropertyContentProvider extends ArrayContentProvider
		implements ITreeContentProvider {

	@Override
	public Object[] getChildren(Object parentElement) {
		// TODO Auto-generated method stub
		if (parentElement instanceof OWLClass) {
			return ((OWLClass) parentElement).getObjectPropertiesInSignature()
					.toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		// if(element instanceof OWLClass){
		// return ((OWLClass) element).
		// }
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// TODO Auto-generated method stub
		if (element instanceof OWLClass) {
			return ((OWLClass) element).getDataPropertiesInSignature().size() > 1;
		}
		return false;
	}

}
