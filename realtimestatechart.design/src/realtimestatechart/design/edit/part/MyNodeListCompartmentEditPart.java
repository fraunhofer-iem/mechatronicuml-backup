package realtimestatechart.design.edit.part;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.part.Messages;

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
    public void activate() {
    	super.activate();
    	
    }
    @Override
    protected void refreshVisuals() {
    	// TODO Auto-generated method stub
    	super.refreshVisuals();
    }
    @Override
    public IFigure createFigure() {
    	IFigure figure = new NodeFigure();
    	FlowLayout layout = new FlowLayout();
    	layout.setHorizontal(true);
    	layout.setMajorAlignment(OrderedLayout.ALIGN_BOTTOMRIGHT);
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
