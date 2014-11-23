package de.uni_paderborn.fujaba.muml.ontology.edit.properties.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class OWLOntologyUtil {

	public static final String PREFERENCE_NODE_ONTOLOGY = "de.uni_paderborn.fujaba.ontology";
	public static final String PREFERENCE_LOADED_ONTOLOGY = "LOADED_ONT";

	public static final String PREFERENCE_DELIMITER = ";";
	OWLOntologyManager ontologyManager = OWLManager.createOWLOntologyManager();

	private Set<String> loadedOntologiesPaths;

	public HashSet<OWLOntology> getloadedOntologies(final String projectName) {

		HashSet<OWLOntology> set = new HashSet<OWLOntology>();
		getProjectPrefernces(projectName);

		ontologyManager = OWLManager.createOWLOntologyManager();
		if (loadedOntologiesPaths != null && !loadedOntologiesPaths.isEmpty()) {
			for (String path : loadedOntologiesPaths) {
				try {
					OWLOntology ontology = ontologyManager
							.loadOntologyFromOntologyDocument(new File(path));
					set.add(ontology);

				} catch (OWLOntologyCreationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return set;

	}

	public void getProjectPrefernces(final String projectName) {
		final IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		IProject project = myWorkspaceRoot.getProject(projectName);

		IScopeContext projectScope = new ProjectScope(project);
		Preferences projectNode = projectScope
				.getNode(PREFERENCE_NODE_ONTOLOGY);

		if (projectNode != null) {

			// read array of Strings
			String[] onts = convert(projectNode.get(PREFERENCE_LOADED_ONTOLOGY,
					""));
			loadedOntologiesPaths = new HashSet<String>(Arrays.asList(onts));

		}

	}

	/**
	 * FIXME: needs more love
	 */
	public void saveProjectPrefernces(String projectName) {
		final IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		IProject project = myWorkspaceRoot.getProject(projectName);

		IScopeContext projectScope = new ProjectScope(project);
		Preferences projectNode = projectScope
				.getNode(PREFERENCE_NODE_ONTOLOGY);

		if (projectNode != null) {
			// projectNode.g("MyPreference", "true");
			// do something with the value.

			String st1 = "/home/ralle/runtime-EclipseApplication-sfb/sse_example_universityManagement/ontologies/university.owl";
			String st2 = "/home/ralle/runtime-EclipseApplication-sfb/sse_example_universityManagement/ontologies/payment.owl";
			String[] stra = { st1, st2 };
			projectNode.put(PREFERENCE_LOADED_ONTOLOGY, convert(stra));
			try {
				projectNode.sync();
			} catch (BackingStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

	private String[] convert(String preferenceValue) {
		StringTokenizer tokenizer = new StringTokenizer(preferenceValue,
				PREFERENCE_DELIMITER);
		int tokenCount = tokenizer.countTokens();
		String[] elements = new String[tokenCount];
		for (int i = 0; i < tokenCount; i++) {
			elements[i] = tokenizer.nextToken();
		}

		return elements;
	}

	public String convert(String[] elements) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < elements.length; i++) {
			buffer.append(elements[i]);
			buffer.append(PREFERENCE_DELIMITER);
		}
		return buffer.toString();
	}

}
