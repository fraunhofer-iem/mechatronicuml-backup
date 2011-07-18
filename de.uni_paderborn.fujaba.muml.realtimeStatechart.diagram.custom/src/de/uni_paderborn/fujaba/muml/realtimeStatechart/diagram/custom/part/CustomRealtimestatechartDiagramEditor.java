package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.part;

import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.ScalableLayeredPane;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramGraphicalViewer;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditor;

public class CustomRealtimestatechartDiagramEditor extends
		RealtimestatechartDiagramEditor {

	@Override
	protected ScrollingGraphicalViewer createScrollingGraphicalViewer() {
		return new DiagramGraphicalViewer() {

			
			/**
			 * Creates the default root editpart. Called during construction.
			 * Modified.
			 */
			protected void createDefaultRoot() {
				setRootEditPart(new ScalableRootEditPart() {
//
//					@Override
//					protected void createLayers(LayeredPane layeredPane) {
//						getScaledLayers();					}
//
//					@Override
//					protected LayeredPane createPrintableLayers() {
//						// TODO Auto-generated method stub
//						return new LayeredPane();
//					}
//
//					@Override
//					protected ScalableLayeredPane createScaledLayers() {
//						getPrintableLayers();
//						ScalableLayeredPane layers = new ScalableLayeredPane();
//						
//						return layers;
//					}
					
					
//						layeredPane.add(new Layer() {
//							public Dimension getPreferredSize(int wHint, int hHint) {
//								return new Dimension();
//							}
//						}, "TOPBAR_LAYER");
//						super.createLayers(layeredPane);
					

				});
			}
		};
	}

}
