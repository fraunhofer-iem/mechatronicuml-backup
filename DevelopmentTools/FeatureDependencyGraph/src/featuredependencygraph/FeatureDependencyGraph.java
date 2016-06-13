package featuredependencygraph;


import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.muml.graphviz.dot.DirectedDotEdge;
import org.muml.graphviz.dot.DotFactory;
import org.muml.graphviz.dot.DotGraph;
import org.muml.graphviz.dot.DotNode;
import org.muml.graphviz.dot.Setting;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import featuredependencygraph.dot.Layouter;


// run me as JUnit Plugin Test
public class FeatureDependencyGraph {
	
	public static final String WORKSPACE_LOC = "/local_ssd/bingo/SHK-GMF";
	public static final String SYMBOLIC_NAME = "Bundle-SymbolicName: ";
	public static final String REQUIRE_BUNDLE = "Require-Bundle: ";

	private List<File> featureXmls = new ArrayList<File>();
	private List<File> manifests = new ArrayList<File>();
	private Map<String, Plugin> plugins = new HashMap<String, Plugin>();
	private Set<Plugin> features = new HashSet<Plugin>();

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		new FeatureDependencyGraph().run();
		
	}

	@Test
	public void run() throws ParserConfigurationException, SAXException, IOException {
		File dir = new File(WORKSPACE_LOC).getAbsoluteFile();
		List<File> projects = new ArrayList<File>();
		for (File project : dir.listFiles()) {
			if (project.isDirectory()) {
				projects.add(project);
				for (File project2 : project.listFiles()) {
					if (project2.isDirectory()) {
						projects.add(project2);
					}
				}
			}
		}
		for (File project : projects) {
			if (project.isDirectory()) {
				for (File file : project.listFiles()) {
					if (file.isFile() && "feature.xml".equals(file.getName())) {
						featureXmls.add(file);
					}
					if (file.isDirectory() && "META-INF".equals(file.getName())) {
						for (File child : file.listFiles()) {
							if (child.isFile() && "MANIFEST.MF".equals(child.getName())) {
								manifests.add(child);
							}
						}
					}
				}
			}
		}
		for (File manifest : manifests) {
			handleManifest(manifest);
		}
		for (File featureXml : featureXmls) {
			handleFeature(featureXml);
		}
		
		for (Plugin feature : features) {
			for (Plugin included : feature.includedPlugins) {
				included.includedBy.add(feature);
			}
		}
		

		for (Plugin feature : features) {
			feature.node = DotFactory.eINSTANCE.createDotNode();
			feature.node.setName(makeName(feature.name));
		}	
		
		for (Plugin feature : features) {
			for (Plugin dep : feature.getAllDependencies()) {
				for (Plugin depFeature : dep.includedBy) {
					if (depFeature != feature) {
						feature.analyzedForwardFeatureDependencies.add(depFeature);
						depFeature.analyzedBackwardFeatureDependencies.add(feature);
					}
				}
			}
		}
		
		// Create images: Forward dependencies
		for (Plugin feature : features) {
			DotGraph graph = createDotGraph();
			graph.getNodes().add(feature.node);

			for (Plugin depFeature : feature.analyzedForwardFeatureDependencies) {
				DirectedDotEdge edge = DotFactory.eINSTANCE.createDirectedDotEdge();
				edge.setSource(feature.node);
				edge.setTarget(depFeature.node);
				graph.getEdges().add(edge);
				graph.getNodes().add(depFeature.node);
				
				if (!feature.declaredFeatureDependencies.contains(depFeature)) {
					Setting setting =DotFactory.eINSTANCE.createSetting();
					setting.setAttribute("color");
					setting.setValue("\"#FF0000\"");
					edge.getSettings().add(setting);
				}
			}

			Layouter layouter = new Layouter(feature.name + "_forward", "svg");
			layouter.layout(graph);
		}
		
		// Create images: Backward dependencies
		for (Plugin depFeature : features) {
			DotGraph graph = createDotGraph();
			graph.getNodes().add(depFeature.node);

			for (Plugin feature : depFeature.analyzedBackwardFeatureDependencies) {
				DirectedDotEdge edge = DotFactory.eINSTANCE.createDirectedDotEdge();
				edge.setSource(feature.node);
				edge.setTarget(depFeature.node);
				graph.getEdges().add(edge);
				graph.getNodes().add(feature.node);
				
				
				if (!feature.declaredFeatureDependencies.contains(depFeature)) {
					Setting setting =DotFactory.eINSTANCE.createSetting();
					setting.setAttribute("color");
					setting.setValue("\"#FF0000\"");
					edge.getSettings().add(setting);
				}
			}

			Layouter layouter = new Layouter(depFeature.name + "_backward", "svg");
			layouter.layout(graph);
		}
		
		
		String problems = "";
		for (Plugin feature : features) {
			for (Plugin depFeature : feature.analyzedForwardFeatureDependencies) {
				if (!feature.declaredFeatureDependencies.contains(depFeature)) {
					problems += feature.name + " -> " + depFeature.name + "\n";
				}
			}
		}
		if (!problems.isEmpty()) {
			fail("Missing feature dependencies:\n" + problems);
		}
		
	}

	private DotGraph createDotGraph() {
		DotGraph graph = DotFactory.eINSTANCE.createDotGraph();
		graph.setDirectedGraph(true);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.createResource(URI.createURI("dummy")).getContents().add(graph);
		return graph;
	}

	private String makeName(String name) {
		return name.replace("org.muml.", "").replace(".feature", "").replace(".", "_");
	}

	private void handleFeature(File file) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();

		String featureId = doc.getDocumentElement().getAttribute("id");
		if (featureId.endsWith(".buckminster")) {
			return;
		}
		if (featureId.endsWith(".sdk.feature")) {
			return;
		}
		if (featureId.endsWith(".sdk")) {
			return;
		}
		Plugin plugin = getPlugin(featureId);
		features.add(plugin);
		
//		// Imported plugins & features
//		{
//			{
//				NodeList nList = doc.getElementsByTagName("import");
//				for (int temp = 0; temp < nList.getLength(); temp++) {
//					org.w3c.dom.Node nNode = nList.item(temp);
//					if (nNode.getParentNode().getNodeName().equals("requires")) {
//						org.w3c.dom.Node pluginNode = nNode.getAttributes().getNamedItem("plugin");
//						if (pluginNode != null) {
//							plugin.dependencies.add(getPlugin(pluginNode.getNodeValue()));
//						}
//						org.w3c.dom.Node featureNode = nNode.getAttributes().getNamedItem("feature");
//						if (featureNode != null) {
//							plugin.dependencies.add(getPlugin(featureNode.getNodeValue()));
//						}
//					}
//				}
//			}
//		}
		
		// Included features
		{
			NodeList nList = doc.getElementsByTagName("includes");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				org.w3c.dom.Node nNode = nList.item(temp);
				String include = nNode.getAttributes().getNamedItem("id").getNodeValue();
				if (!include.isEmpty()) {
					plugin.includedPlugins.add(getPlugin(include));
				}
			}
		}
		
		// Included plugins
		{
			NodeList nList = doc.getElementsByTagName("plugin");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				org.w3c.dom.Node nNode = nList.item(temp);
				String include = nNode.getAttributes().getNamedItem("id").getNodeValue();
				if (!include.isEmpty()) {
					plugin.includedPlugins.add(getPlugin(include));
				}
			}
		}
		
		// Import feature
		{
			NodeList nList = doc.getElementsByTagName("import");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				org.w3c.dom.Node nNode = nList.item(temp);
				if (nNode.getParentNode() != null && nNode.getParentNode().getNodeName().equals("requires")) {
					org.w3c.dom.Node feature = nNode.getAttributes().getNamedItem("feature");
					if (feature != null) {
						String featureName = feature.getNodeValue();
						if (!featureName.isEmpty()) {
							plugin.declaredFeatureDependencies.add(getPlugin(featureName));
						
						}
					}	
				}
			}
		}
	}

	private Plugin getPlugin(String name) {
		if (!plugins.containsKey(name)) {
			Plugin plugin = new Plugin();
			plugin.name = name;
			plugins.put(name, plugin);
			return plugin;
		}
		return plugins.get(name);
	}
	
	private void handleManifest(File file) throws IOException {
		Plugin plugin = null;
		List<String> dependencies = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		try {
			List<String> lines = new ArrayList<String>();
			{
				String line;
				while (null != (line = br.readLine())) {
					if (!line.isEmpty()) {
						if (!line.startsWith(" ")) {
							lines.add(line);
						} else {
							int lastIndex = lines.size() - 1;
							lines.set(lastIndex, lines.get(lastIndex) + line.trim());
						}
					}
				}
			}
			for (String line : lines) {
				if (line.startsWith(SYMBOLIC_NAME)) {
					String pluginName = line.substring(SYMBOLIC_NAME.length());
					int semicolon = pluginName.lastIndexOf(';');
					if (semicolon > -1) {
						pluginName = pluginName.substring(0, semicolon);
					}
					plugin = getPlugin(pluginName);
				} else if (line.startsWith(REQUIRE_BUNDLE)) {
					// remove ""
					boolean yesno = true;
					String withoutStrings = "";
					for (String s : line.substring(REQUIRE_BUNDLE.length()).split("\"")) {
						if (yesno) {
							withoutStrings += s;
						}
						yesno = !yesno;
					}
					for (String dependency : withoutStrings.split(",")) {
						int semicolon = dependency.indexOf(';');
						if (semicolon > -1) {
							dependency = dependency.substring(0, semicolon);
						}
						dependency = dependency.trim();
						if (!dependency.isEmpty()) {
							dependencies.add(dependency);
						}
					}
				}
			}

			if (plugin != null) {
				for (String dependency : dependencies) {
					plugin.dependencies.add(getPlugin(dependency));
				}
			}

		} finally {
			br.close();
		}
		// Bundle-Name: %pluginName
		// Bundle-Vendor: %providerName
		// Bundle-Version: 0.5.0.qualifier
		// Bundle-SymbolicName:
		// org.muml.cbs.dependencylanguage.xtext;singleton:=true
		// Bundle-ActivationPolicy: lazy
		// Require-Bundle: org.eclipse.xtext;visibility:=reexport,
		// org.eclipse.xtext.xbase;resolution:=optional;visibility:=reexport,
		// org.eclipse.xtext.generator;resolution:=optional,
		// org.apache.commons.logging;bundle-version="1.0.4";resolution:=optional,
		// org.eclipse.emf.codegen.ecore;resolution:=optional,
		// org.eclipse.emf.mwe.utils;resolution:=optional,
		// org.eclipse.emf.mwe2.launch;resolution:=optional,
		// org.muml.cbs.dependencylanguage,
		// org.muml.pim.actionlanguage.xtext;bundle-version="0.4.0",
		// org.muml.core,
		// org.eclipse.xtext.util,
		// org.antlr.runtime;bundle-version="3.2.0",
		// org.eclipse.xtext.common.types,
		// org.eclipse.xtext.xbase.lib,
		// org.objectweb.asm;bundle-version="[5.0.1,6.0.0)";resolution:=optional
	}

	private class Plugin {
		public String name;
		public DotNode node;
		private Set<Plugin> allDependencies = null; // lazy calculation
		private Set<Plugin> dependenciesAndIncluded; // lazy calculation
		public Set<Plugin> dependencies = new HashSet<Plugin>();
		public Set<Plugin> includedBy = new HashSet<Plugin>();
		
		// makes only sense for features
		public Set<Plugin> includedPlugins = new HashSet<Plugin>();
		public Set<Plugin> declaredFeatureDependencies = new HashSet<Plugin>();
		public Set<Plugin> analyzedForwardFeatureDependencies = new HashSet<Plugin>();
		public Set<Plugin> analyzedBackwardFeatureDependencies = new HashSet<Plugin>();
		
		
		public String toString() {
			return name;
		}
		public Set<Plugin> getDependenciesAndIncluded() {
			if (dependenciesAndIncluded == null) {
				dependenciesAndIncluded = new HashSet<Plugin>();
				dependenciesAndIncluded.addAll(dependencies);
				dependenciesAndIncluded.addAll(includedPlugins);
			}
			return dependenciesAndIncluded;
		}
		
		public Set<Plugin> getAllDependencies() {
			if (allDependencies == null) {
				allDependencies = new HashSet<Plugin>();
				for (Plugin dependency : getDependenciesAndIncluded()) {
					allDependencies.addAll(dependency.getAllDependencies());
					allDependencies.add(dependency);
				}
			}
			return allDependencies;
		}
	}
}
