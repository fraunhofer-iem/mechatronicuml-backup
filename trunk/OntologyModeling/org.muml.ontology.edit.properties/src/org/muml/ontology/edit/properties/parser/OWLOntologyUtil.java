package org.muml.ontology.edit.properties.parser;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class OWLOntologyUtil {

	public static final String PREFERENCE_NODE_ONTOLOGY = "org.muml.ontology";
	public static final String PREFERENCE_LOADED_ONTOLOGY = "LOADED_ONT";

	public static final String PREFERENCE_DELIMITER = ";";
	OWLOntologyManager ontologyManager = OWLManager.createOWLOntologyManager();

	private Set<String> ontologiesPaths;
	private Set<OWLOntology> loadedOntologies;
	private IProject project;
	IScopeContext projectScope;

	public OWLOntologyUtil(String projectName) {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		project = myWorkspaceRoot.getProject(projectName);
		projectScope = new ProjectScope(project);
		ontologiesPaths = new HashSet<String>();
	}

	public OWLOntologyManager getOntologyManager() {
		return ontologyManager;
	}

	public Set<OWLOntology> getloadedOntologies() {
		if (loadedOntologies == null) {
			loadAllOntologies();
		}
		return loadedOntologies;
	}

	public void addOntologyFile(String filePath) {
		if (loadedOntologies == null) {
			loadedOntologies = new HashSet<OWLOntology>();
		}
		try {
			loadOntology(filePath);
			ontologiesPaths.add(filePath);
			saveProjectPrefernces();
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void loadOntology(String filePath)
			throws OWLOntologyCreationException, URISyntaxException {
		OWLOntology ontology;
		File file;

		if (filePath.startsWith("platform:")) {
			URI uri = URIUtil.fromString(filePath);
			IRI iri = IRI.create(uri);
			ontology = ontologyManager.loadOntologyFromOntologyDocument(iri);

		} else {
			file = new File(filePath);
			ontology = ontologyManager.loadOntologyFromOntologyDocument(file);

		}

		loadedOntologies.add(ontology);

	}

	private void loadAllOntologies() {

		loadProjectPrefernces();
		loadedOntologies = new HashSet<OWLOntology>();

		ontologyManager = OWLManager.createOWLOntologyManager();
		if (ontologiesPaths != null && !ontologiesPaths.isEmpty()) {
			for (String path : ontologiesPaths) {
				try {
					loadOntology(path);
				} catch (OWLOntologyCreationException e) {
					// TODO Maybe remove the non valid ontology
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	private void loadProjectPrefernces() {

		Preferences projectNode = projectScope
				.getNode(PREFERENCE_NODE_ONTOLOGY);
		
		if (projectNode != null) {

			// read array of Strings
			String[] ontPaths = convert(projectNode.get(
					PREFERENCE_LOADED_ONTOLOGY, ""));
			ontologiesPaths = new HashSet<String>(Arrays.asList(ontPaths));

		}

	}

	/**
	 * FIXME: needs more love
	 */
	private void saveProjectPrefernces() {

		Preferences projectNode = projectScope
				.getNode(PREFERENCE_NODE_ONTOLOGY);

		if (projectNode != null) {
			String[] paths = ontologiesPaths.toArray(new String[0]);
			projectNode.put(PREFERENCE_LOADED_ONTOLOGY, convert(paths));
			try {
				projectNode.flush();
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

	private String convert(String[] elements) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < elements.length; i++) {
			buffer.append(elements[i]);
			buffer.append(PREFERENCE_DELIMITER);
		}
		return buffer.toString();
	}

}
