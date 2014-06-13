package de.uni_paderborn.fujaba.muml.hardware.common.refactor;

import org.eclipse.gmf.runtime.diagram.ui.OffscreenEditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramImageGenerator;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.swt.widgets.Shell;

public class CustomRenderingHelper {
	
	public static org.eclipse.swt.graphics.Image renderToSWTImage(
			Diagram diagram) {
		if (null == diagram) {
			throw new NullPointerException("Argument 'diagram' is null"); //$NON-NLS-1$
		}

        Shell shell = new Shell();
        try {
    		DiagramEditPart diagramEP = OffscreenEditPartFactory.getInstance()
    			.createDiagramEditPart(diagram, shell);
    		/*  DiagramEditDomain editDomain = new DiagramEditDomain(null);
    	        editDomain.setCommandStack(
    	            new DiagramCommandStack(editDomain));
    	        
    		for(Object view:diagram.getChildren()){
    			if(!(((View)view).getElement() instanceof ComponentInstanceConfiguration )){
    				((View)view).setVisible(false);
    			}
    		} */
    		DiagramImageGenerator imageGenerator = new DiagramImageGenerator(
    			diagramEP);

    		return imageGenerator.createSWTImageDescriptorForDiagram()
    			.createImage();
        } finally {
            shell.dispose();
        }
            
	}
	
	
	
	

}


