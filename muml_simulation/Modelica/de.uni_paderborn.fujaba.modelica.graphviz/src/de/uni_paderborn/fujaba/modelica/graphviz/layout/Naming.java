package de.uni_paderborn.fujaba.modelica.graphviz.layout;


public class Naming {
	
	public static String getQuotedName(String name) {
		return "\"" + name + "\"";
	}
	
	public static String getUnquotedName(String name) {
		return name.replaceAll("\"", "");
	}
	
}
