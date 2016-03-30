package org.muml.uppaal.adapter.job.graphviz.html;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

abstract class AbstractGraphvizHTMLElement {
	private List<AbstractGraphvizHTMLElement> children;
	private String tag;
	
	public AbstractGraphvizHTMLElement(String tag){
		this.tag = tag;
	}
	
	abstract public void markChanged();
	
	public String toGraphVizHTMLString(){
		StringBuffer result = new StringBuffer();
		result.append("\n");
		result.append(getStartTag());
		for(AbstractGraphvizHTMLElement child: getChildren()){
			result.append(child.toGraphVizHTMLString());
		}
		result.append(getEndTag());
		result.append("\n");
		return result.toString();
	}
	
	protected List<AbstractGraphvizHTMLElement> getChildren(){
		if(children == null)
			children = new BasicEList<AbstractGraphvizHTMLElement>();
		return children;
	}
	
	protected String getChildrenString(){
		StringBuffer result = new StringBuffer();
		for(AbstractGraphvizHTMLElement child : getChildren())
			result.append(child.toGraphVizHTMLString());
		return result.toString();
	}

	protected String getTag(){
		return tag;
	}
	
	protected String getStartTag(){
		return "<"+tag+">";
	}
	
	protected String getEndTag(){
		return "</"+tag+">";
	}
	

}
