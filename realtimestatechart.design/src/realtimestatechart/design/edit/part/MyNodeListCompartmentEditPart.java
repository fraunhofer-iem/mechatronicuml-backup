package realtimestatechart.design.edit.part;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.part.Messages;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.DStylizable;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.LabelStyle;
import org.eclipse.sirius.viewpoint.Style;
import org.eclipse.sirius.viewpoint.description.DocumentedElement;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

/**
 * @was-generated
 */
public class MyNodeListCompartmentEditPart extends CompartmentEditPart {

    /**
     * @was-generated
     */
    public static final int VISUAL_ID = 7003;

    /**
     * @was-generated
     */
    public MyNodeListCompartmentEditPart(View view) {
        super(view);
    }

    /**
     * @was-generated
     */
    public String getCompartmentName() {
        return Messages.DNodeListViewNodeListCompartmentEditPart_title;
    }
   
    @Override
    public IFigure createFigure() {
    	IFigure figure = new NodeFigure();
    	
    	// Get label alignment
    	LabelAlignment alignment = LabelAlignment.CENTER;
    	View view = (View) getModel();
    	if (view.getElement() instanceof DStylizable) {
    		Style style = ((DStylizable) view.getElement()).getStyle();
    		if (style instanceof LabelStyle) {
    			LabelStyle labelStyle = (LabelStyle) style;
    			alignment = labelStyle.getLabelAlignment();
    		}
    	}
    	
    	// Get semantic element
    	EObject semanticElement = null;
    	if (view.getElement() instanceof DSemanticDecorator) {
    		semanticElement = ((DSemanticDecorator) view.getElement()).getTarget();
    	}
    	
    	
    	FlowLayout layout = new FlowLayout();

    	boolean horizontal = false;
		if (view.getElement() instanceof DRepresentationElement) {
			DRepresentationElement dre = (DRepresentationElement) view.getElement();
			if (dre.getMapping() instanceof DocumentedElement) {
				String hint = ((DocumentedElement) dre.getMapping()).getDocumentation();
				if (hint.contains("@listorientation=horizontal")) {
					horizontal = true;
				}
			}
		}
    	layout.setHorizontal(horizontal);
    	
    	if (alignment == LabelAlignment.LEFT) {
    		layout.setMajorAlignment(OrderedLayout.ALIGN_TOPLEFT);
    	} else if (alignment == LabelAlignment.CENTER) {
    		layout.setMajorAlignment(OrderedLayout.ALIGN_CENTER);
    	} else if (alignment == LabelAlignment.RIGHT) {
    		layout.setMajorAlignment(OrderedLayout.ALIGN_BOTTOMRIGHT);
    	}
    	layout.setMinorAlignment(OrderedLayout.ALIGN_CENTER);

    	figure.setLayoutManager(layout);
    	return figure;
//
//    	IFigure figure = super.createFigure();
//    	ResizableCompartmentFigure res = (ResizableCompartmentFigure) figure;
//    	ConstrainedToolbarLayout layout = (ConstrainedToolbarLayout) res.getContentPane().getLayoutManager();
//    	layout.setHorizontal(true);
//    	layout.setStretchMajorAxis(false);
//    	layout.setMinorAlignment(ConstrainedToolbarLayout.ALIGN_TOPLEFT);
//    	ScrollPane scrollPane = res.getScrollPane();
//    	scrollPane.setVerticalScrollBarVisibility(ScrollPane.NEVER);
//        scrollPane.setHorizontalScrollBarVisibility(ScrollPane.NEVER);
//        res.setHorizontal(true);
//        res.setTitleVisibility(false);
//        Object o = res.getLayoutManager();
//       
//        
////    	res.setTitleVisibility(true);
////    	res.setTitle("clock:");
//    	return figure;
    }

}
