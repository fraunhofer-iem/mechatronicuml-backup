package org.muml.uppaal.adapter.job.graphviz.html;



public class GraphvizHTMLTableRow extends AbstractGraphvizHTMLElement{
	
	public GraphvizHTMLTableRow(){
		this("TR");
	}

	private GraphvizHTMLTableRow(String tag) {
		super(tag);
	}

	public void addTableCell(GraphvizHTMLTableCell cell){
		getChildren().add(cell);
	}
	
	public void addTableCell(int index, GraphvizHTMLTableCell cell){
		getChildren().add(index, cell);
	}

	@Override
	public void markChanged() {
		// TODO Auto-generated method stub
	}
}
