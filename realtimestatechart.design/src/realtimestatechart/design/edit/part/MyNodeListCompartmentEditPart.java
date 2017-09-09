package realtimestatechart.design.edit.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.part.Messages;

/**
 * @was-generated
 */
public class MyNodeListCompartmentEditPart extends AbstractDNodeListCompartmentEditPart {

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
    public IFigure createFigure() {
    	IFigure figure = super.createFigure();
    	ResizableCompartmentFigure res = (ResizableCompartmentFigure) figure;
    	ConstrainedToolbarLayout layout = (ConstrainedToolbarLayout) res.getContentPane().getLayoutManager();
    	layout.setHorizontal(true);
    	layout.setStretchMajorAxis(false);
    	layout.setMinorAlignment(ConstrainedToolbarLayout.ALIGN_TOPLEFT);
    	ScrollPane scrollPane = res.getScrollPane();
    	scrollPane.setVerticalScrollBarVisibility(ScrollPane.NEVER);
        scrollPane.setHorizontalScrollBarVisibility(ScrollPane.NEVER);
        res.setHorizontal(true);
        res.setTitleVisibility(false);
        Object o = res.getLayoutManager();
       
        
//    	res.setTitleVisibility(true);
//    	res.setTitle("clock:");
    	return figure;
    }
    @Override
    protected void refreshRatio() {

        setRatio(0.1);
    }

}
