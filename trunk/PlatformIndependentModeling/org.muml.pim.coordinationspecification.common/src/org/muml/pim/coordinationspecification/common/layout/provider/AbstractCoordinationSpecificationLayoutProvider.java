package org.muml.pim.coordinationspecification.common.layout.provider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutNodeProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNodeOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.Role;

public class AbstractCoordinationSpecificationLayoutProvider extends
		AbstractLayoutNodeProvider {

	public boolean provides(IOperation operation) {
		if (operation instanceof ILayoutNodeOperation) {
			Iterator<?> nodes = ((ILayoutNodeOperation) operation)
					.getLayoutNodes().listIterator();
			if (nodes.hasNext()) {
				View node = ((ILayoutNode) nodes.next()).getNode();
				Diagram container = node.getDiagram();
				if (container == null
						|| !(node.getElement() instanceof AbstractCoordinationSpecification)) //$NON-NLS-1$
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

	// See
	// http://pic.dhe.ibm.com/infocenter/rsarthlp/v7r5m1/index.jsp?topic=%2Fcom.ibm.xtools.modeler.doc.isv%2Fprog-guide%2Fcust-layouts.html
	/**
	 * Layout nodes in a pyramid shape o o o o o o Last row may not be
	 * completely filled, depending on number of nodes to arrange.
	 */
	@SuppressWarnings("rawtypes")
	public Runnable layoutLayoutNodes(final List layoutNodes,
			final boolean offsetFromBoundingBox, final IAdaptable layoutHint) {

		return new Runnable() {
			public void run() {

				ListIterator li = layoutNodes.listIterator();

				ArrayList<ILayoutNode> nodes = new ArrayList<ILayoutNode>();

				int roleCount = 1;
				// filter Nodes with respect to the semantic element
				ArrayList<ILayoutNode> rightMessageBuffer = new ArrayList<ILayoutNode>();
				ArrayList<ILayoutNode> leftMessageBuffer = new ArrayList<ILayoutNode>();
				ILayoutNode quosaNode = null;
				while (li.hasNext()) {
					ILayoutNode lnode = (ILayoutNode) li.next();
					EObject semanticElement = lnode.getNode().getElement();
					if (semanticElement instanceof AbstractCoordinationSpecification) {
						nodes.add(0, lnode);
					}
					if (semanticElement instanceof Role) {
						nodes.add(roleCount, lnode);
						roleCount++;
					}
					if (semanticElement instanceof MessageBuffer) {
						MessageBuffer mb = (MessageBuffer) semanticElement;
						if (mb.getDiscreteInteractionEndpoint() == nodes.get(1)
								.getNode().getElement()) {
							leftMessageBuffer.add(lnode);
						} else if (mb.getDiscreteInteractionEndpoint() == nodes
								.get(2).getNode().getElement()) {
							rightMessageBuffer.add(lnode);
						}
					}
					if (semanticElement instanceof ConnectorQualityOfServiceAssumptions) {
						quosaNode = lnode;
					}
				}
				// calculate the grid size
				int gridWidth = 0;
				int gridHeight = 0;
				li = layoutNodes.listIterator();
				while (li.hasNext()) {
					ILayoutNode lnode = (ILayoutNode) li.next();
					if (lnode.getWidth() > gridWidth)
						gridWidth = lnode.getWidth();
					if (lnode.getHeight() > gridHeight)
						gridHeight = lnode.getHeight();
				}

				// add a small buffer in HiMetric units
				gridWidth += 25;
				gridHeight += 50;

				// determine number of rows
				int rowsize = (int) Math
						.floor(Math.sqrt(layoutNodes.size() * 2));

				int boxXOffset = 0;
				int boxYOffset = 0;

				// set node bounds
				int[] x = new int[2];
				int[] y = new int[2];

				li = nodes.listIterator();
				for (int i = 1; i <= rowsize; ++i) {
					int xoffset = (rowsize - i) * gridWidth + boxYOffset;
					int yoffset = (i - 1) * gridHeight + boxXOffset;

					for (int j = 1; j <= i && li.hasNext(); ++j, xoffset += (gridWidth * 2)) {

						if (i == 2) {
							x[j - 1] = xoffset;
							y[j - 1] = yoffset;
						}
						ILayoutNode lnode = (ILayoutNode) li.next();
						Bounds bounds = (Bounds) lnode.getNode()
								.getLayoutConstraint();
						bounds.setX(xoffset);
						bounds.setY(yoffset);
						lnode.getNode().setLayoutConstraint(bounds);
					}
				}
				if (quosaNode != null) {
					Bounds bounds = (Bounds) quosaNode.getNode()
							.getLayoutConstraint();
					bounds.setX((x[0] + x[1] - quosaNode.getWidth()) / 2);
					bounds.setY(y[0] + quosaNode.getHeight() / 2);
					quosaNode.getNode().setLayoutConstraint(bounds);
				}
				int currentWidthOffset = 0;
				int heightOffset = 30;
				for (ILayoutNode lNode : leftMessageBuffer) {
					Bounds bounds = (Bounds) lNode.getNode()
							.getLayoutConstraint();
					bounds.setX(x[0] - lNode.getWidth() / 2
							- currentWidthOffset);
					bounds.setY(y[0] + heightOffset);
					lNode.getNode().setLayoutConstraint(bounds);
					currentWidthOffset += lNode.getWidth();
				}
				currentWidthOffset = 0;
				for (ILayoutNode lNode : rightMessageBuffer) {
					Bounds bounds = (Bounds) lNode.getNode()
							.getLayoutConstraint();
					bounds.setX(x[1] - lNode.getWidth() / 2
							+ currentWidthOffset);
					bounds.setY(y[1] + heightOffset);
					lNode.getNode().setLayoutConstraint(bounds);
					currentWidthOffset += lNode.getWidth();
				}
			}
		};
	}
}
