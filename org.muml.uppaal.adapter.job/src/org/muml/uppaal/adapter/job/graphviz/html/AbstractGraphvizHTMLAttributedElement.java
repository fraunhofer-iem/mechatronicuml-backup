package org.muml.uppaal.adapter.job.graphviz.html;

import java.util.HashMap;

abstract public class AbstractGraphvizHTMLAttributedElement extends AbstractGraphvizHTMLElement {
	
	public AbstractGraphvizHTMLAttributedElement(String tag) {
		super(tag);
	}


	private HashMap<String, String> attributes;
	
		public HashMap<String, String> getAttributes(){
			if(attributes == null)
				attributes = new HashMap<String, String>();
			return attributes;
		}
	
		//see http://www.graphviz.org/content/node-shapes for fields
		//currently only used ones are implemented
		public void addAlign(String value){
			if(attributes == null)
				attributes = new HashMap<String, String>();
		}
		
		public void removeAlign(){
			if(attributes != null)
				attributes.remove("align");
		}
		
		public void addBGColor(String color){
			if(attributes == null)
				attributes = new HashMap<String, String>();
			String attribute = "BGCOLOR=\""+color+"\"";
			attributes.put("bgColor", attribute);
		}
		
		public void removeBGColor(){
			if(attributes != null)
				attributes.remove("bgColor");
		}
		
		
		public void addBorder(String value){
			if(attributes == null)
				attributes = new HashMap<String, String>();
			String attribute = "BORDER=\""+value+"\"";
			attributes.put("border", attribute);
		}
		
		public void removeBorder(){
			if(attributes != null)
				attributes.remove("border");
		}
		
		
		protected String getAttributesString(){
			if(attributes == null)
				return "";
			
			StringBuffer result = new StringBuffer();
			result.append(" ");
			for(String attribute: getAttributes().values()){
				result.append(attribute);
				result.append(" ");
			}
				
			return result.toString();
		}
		
		@Override
		protected String getStartTag(){
			return "<"+getTag()+getAttributesString()+">";
		}
}
