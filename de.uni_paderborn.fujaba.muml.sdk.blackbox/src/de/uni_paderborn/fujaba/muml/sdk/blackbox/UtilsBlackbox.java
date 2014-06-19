package de.uni_paderborn.fujaba.muml.sdk.blackbox;

import java.util.Collection;

import org.eclipse.gmf.codegen.gmfgen.GenCustomGeneratorExtension;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;


public class UtilsBlackbox {

	public void logConsole(Object object) {
		if (object instanceof GenEditorGenerator) {
			GenEditorGenerator generator = (GenEditorGenerator) object;
			for (GenCustomGeneratorExtension ex : generator.getExtensions()) {
				ex.toString();
			}
			generator.toString();
			
		}
		if (object == null) {
			object = "null";
		}
		System.out.println(object.toString());
	}
	
	public void logConsole(Collection o) {
		System.out.println(o.toString());
	}
}
