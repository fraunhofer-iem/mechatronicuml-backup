package de.uni_paderborn.fujaba.muml.ontology.edit.properties.dialog;

import java.util.HashSet;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;

public class OntologyClassTreeContentProvider extends ArrayContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getChildren(Object parentElement) {
		// TODO Auto-generated method stub
		if(parentElement instanceof OWLOntology){
			return ((OWLOntology) parentElement).getClassesInSignature().toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
//		if(element instanceof OWLClass){
//			return ((OWLClass) element).
//		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// TODO Auto-generated method stub
		if(element instanceof OWLOntology){
			return ((OWLOntology) element).getClassesInSignature().size()>1;
		}
		return false;
	}

	


}
