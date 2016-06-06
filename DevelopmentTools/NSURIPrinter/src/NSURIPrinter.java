import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class NSURIPrinter {
	List<String> files = new ArrayList<String>();
	Map<String, List<String>> oldP = new HashMap<String, List<String>>();
	Map<String, List<String>> newP = new HashMap<String, List<String>>();
	
	Map<String, String> fileRenamings = new HashMap<String, String>();
	
	public NSURIPrinter() {
		fileRenamings.put("muml.ecore", "pim.ecore");
		fileRenamings.put("properties.ecore", "ape.ecore");
		fileRenamings.put("migration.ecore", "emm.ecore");
	}

	public static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		NSURIPrinter printer = new NSURIPrinter();
		printer.find(new File("."));
		printer.print();
	}

	private void print() {
		for (String file : files) {
			if (!fileRenamings.containsKey(file) && !fileRenamings.containsValue(file)) {
				if (oldP.containsKey(file) && newP.containsKey(file)) {
					System.out.print(file + ": ");
					for (String old : oldP.get(file)) {
						System.out.print(old  + " ");
					}
					System.out.print("-> ");
					for (String n : newP.get(file)) {
						System.out.print(n + " ");
					}
					System.out.println("");
				}
			}
		}
		for (Map.Entry<String, String> entry : fileRenamings.entrySet()) {
			System.out.print(entry.getKey() + " -> " + entry.getValue() + ": ");
			if (oldP.containsKey(entry.getKey())) {
				for (String old : oldP.get(entry.getKey())) {
					System.out.print(old  + " ");
				}
			}
			System.out.print("-> ");
			if (newP.containsKey(entry.getValue())) {
				for (String n : newP.get(entry.getValue())) {
					System.out.print(n + " ");
				}
			}
			System.out.println("");
		}
	}

	private void find(File dir) {
		for (File file : dir.listFiles()) {
			if (file.isDirectory()) {
				find(file);
			} else {
				handle(file);
			}
		}
	}

	private void handle(File file) {
		if (file.getName().endsWith(".ecore") && !file.getAbsolutePath().contains("/bin/") && !file.getName().endsWith("Ecore.ecore") && !file.getName().endsWith("GenModel.ecore")) {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
			if (resource != null) {
				for (EObject element : resource.getContents()) {
					if (element instanceof EPackage) {
						String canonical = "";
						try {
							canonical = file.getCanonicalPath();
						} catch (IOException e) {
							e.printStackTrace();
						}
						if (canonical.startsWith("/local_ssd/bingo/SHK-GMF/mechatronicuml/")) {
							handlePackage(file.getName(), (EPackage)element, oldP);	
						} else {
							handlePackage(file.getName(), (EPackage)element, newP);
						}
					}
				}
			}
		}
	}

	private void handlePackage(String filename, EPackage p, Map<String, List<String>> map) {
		if (!files.contains(filename)) {
			files.add(filename);
		}
		if (!map.containsKey(filename)) {
			map.put(filename, new ArrayList<String>());
		}
		map.get(filename).add(p.getNsURI());
		for (EPackage subpackage : p.getESubpackages()) {
			handlePackage(filename, subpackage, map);
		}
	}

}

