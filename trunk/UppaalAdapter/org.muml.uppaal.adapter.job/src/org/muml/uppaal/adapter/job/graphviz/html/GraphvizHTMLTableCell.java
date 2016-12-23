package org.muml.uppaal.adapter.job.graphviz.html;

public class GraphvizHTMLTableCell extends
		AbstractGraphvizHTMLAttributedElement {
	private String label;

	public GraphvizHTMLTableCell() {
		this("TD");
	}

	private GraphvizHTMLTableCell(String tag) {
		super(tag);
	}

	/**
	 * Adds a label and removes the contained table
	 * 
	 * @param label
	 */
	public void addLabel(String label) {
		this.label = label;
		getChildren().clear();
	}
	
	public String getLabel(){
		return label;
	}

	/**
	 * Adds a child table and remove the contained table
	 * 
	 * @param table
	 */
	public void addTable(GraphvizHTMLTable table) {
		label = null;
		getChildren().clear();
		getChildren().add(table);
	}

	@Override
	public String toGraphVizHTMLString() {
		StringBuffer result = new StringBuffer();
		result.append("\n");
		result.append(getStartTag());
		// TODO implement
		for (AbstractGraphvizHTMLElement child : getChildren()) {
			result.append(child.toGraphVizHTMLString());
		}
		if (label != null) {
			result.append(label);
		}
		result.append(getEndTag());
		result.append("\n");
		return result.toString();
	}

	@Override
	public void markChanged() {
		if(label != null)
			label = "<FONT COLOR = \"red\">"+label+"</FONT>";
	}

	// ///////
	// Attributes
	// ///////
	public void addColspan(String value) {
		String attribute = "COLSPAN=\"" + value + "\"";
		getAttributes().put("colspan", attribute);
	}

	public void removeCellBorder() {
		getAttributes().remove("colspan");
	}
}
