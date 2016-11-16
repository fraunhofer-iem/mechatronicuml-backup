package org.muml.uppaal.adapter.job.graphviz.html;




public class GraphvizHTMLTable extends AbstractGraphvizHTMLAttributedElement{
	
	public GraphvizHTMLTable(){
		this("TABLE");
	}
	
	private GraphvizHTMLTable(String tag) {
		super(tag);
	}

	public void addTableRow(GraphvizHTMLTableRow row){
		getChildren().add(row);
	}
	
	public void addTableRow(int index, GraphvizHTMLTableRow row){
		getChildren().add(index, row);
	}
	
	@Override
	public void markChanged() {
		addBGColor("red");
	}
	
	/////////
	// Attributes
	/////////
	public void addCellBorder(String value){
		String attribute = "CELLBORDER=\""+value+"\"";
		getAttributes().put("cellBorder", attribute);
	}
	
	public void removeCellBorder(){
		getAttributes().remove("cellBorder");
	}

	
}
