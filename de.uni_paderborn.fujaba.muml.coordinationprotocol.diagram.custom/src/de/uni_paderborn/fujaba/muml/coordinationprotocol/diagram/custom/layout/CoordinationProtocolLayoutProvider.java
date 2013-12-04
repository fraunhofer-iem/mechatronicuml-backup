package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.layout;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutNodeProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNodeOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

public class CoordinationProtocolLayoutProvider extends AbstractLayoutNodeProvider {

	public boolean provides(IOperation operation) {
		if (operation instanceof ILayoutNodeOperation) {
			Iterator<?> nodes = ((ILayoutNodeOperation) operation)
					.getLayoutNodes().listIterator();
			if (nodes.hasNext()) {
				View node = ((ILayoutNode) nodes.next()).getNode();
				Diagram container = node.getDiagram();
				if (container == null
						|| !(container.getType().equals("Coordination Protocol"))) //$NON-NLS-1$
					return false;
			}
		} else {
			return false;
		}
		IAdaptable layoutHint = ((ILayoutNodeOperation) operation)
				.getLayoutHint();
		String layoutType = (String) layoutHint.getAdapter(String.class);
		return LayoutType.DEFAULT.equals(layoutType);
	}
	
	
	// See http://pic.dhe.ibm.com/infocenter/rsarthlp/v7r5m1/index.jsp?topic=%2Fcom.ibm.xtools.modeler.doc.isv%2Fprog-guide%2Fcust-layouts.html
	 /**
     * Layout nodes in a pyramid shape
     *    o
     *   o o
     *  o o o
     * Last row may not be completely filled, depending on number
     * of nodes to arrange.
     */
    @SuppressWarnings("rawtypes")
	public Runnable layoutLayoutNodes(final List layoutNodes,
            final boolean offsetFromBoundingBox, final IAdaptable layoutHint) {

        return new Runnable() {
            public void run() {
                // calculate the grid size
                int gridWidth = 0;
                int gridHeight = 0;
				ListIterator li = layoutNodes.listIterator();
                while (li.hasNext()) {
                    ILayoutNode lnode = (ILayoutNode)li.next();
                    if (lnode.getWidth() > gridWidth)
                        gridWidth = lnode.getWidth();
                    if (lnode.getHeight() > gridHeight)
                        gridHeight = lnode.getHeight();
                }
                
                // add a small buffer in HiMetric units
                gridWidth += 25;
                gridHeight += 50;
                
                // determine number of rows
                int rowsize = (int)Math.floor(Math.sqrt(layoutNodes.size() * 2));
                
                int boxXOffset = 0;
                int boxYOffset = 0;
                
                // set node bounds
                li = layoutNodes.listIterator();
                for (int i = 1; i <= rowsize; ++i) {
                    int xoffset = (rowsize - i) * gridWidth + boxYOffset;
                    int yoffset = (i - 1) * gridHeight + boxXOffset;
                    for (int j = 1; j <= i && li.hasNext(); ++j, xoffset += (gridWidth * 2)) {
                        ILayoutNode lnode = (ILayoutNode)li.next();
                        Bounds bounds = (Bounds)lnode.getNode().getLayoutConstraint();
                        bounds.setX(xoffset);
                        bounds.setY(yoffset);
                        lnode.getNode().setLayoutConstraint(bounds);
                    }
                }
            }
        };
    }
}
