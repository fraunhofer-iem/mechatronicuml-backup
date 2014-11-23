package de.uni_paderborn.fujaba.muml.ontology.edit.properties.parser;

import java.io.File;
import java.util.HashSet;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class OWLOntologyUtil {
	
	OWLOntologyManager m = OWLManager.createOWLOntologyManager();

	public  HashSet<OWLOntology> getloadedOntologies() {
		HashSet<OWLOntology> set = new HashSet<OWLOntology>();
		File test = new File(
				"/home/ralle/runtime-EclipseApplication-sfb/sse_example_universityManagement/ontologies/university.owl");

		File test2 = new File(
				"/home/ralle/runtime-EclipseApplication-sfb/sse_example_universityManagement/ontologies/payment.owl");
		 m = OWLManager.createOWLOntologyManager();
		try {
			OWLOntology ontology = m.loadOntologyFromOntologyDocument(test);
			set.add(ontology);
			
			OWLOntology ontology2 = m.loadOntologyFromOntologyDocument(test2);
			set.add(ontology2);
			
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return set;

	}

}
