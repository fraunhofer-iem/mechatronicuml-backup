package de.uni_paderborn.fujaba.muml.hardware.common.edit.policies.container;

/** 
 * modified by adann
 * 
 */

/**
 * * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *      committers of YAKINDU - initial API and implementation
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class EnlargeContainerEditPolicy extends AbstractEditPolicy {

	// Space between the border of the container and the moved figure
	public static final int SPACEING = 25;

	private Map<IFigure, Rectangle> boundsCache = new HashMap<IFigure, Rectangle>();

	private List<IGraphicalEditPart> containerHierachy;

	@Override
	public Command getCommand(Request request) {
		
		if (RequestConstants.REQ_RESIZE.equals(request.getType())
				|| RequestConstants.REQ_MOVE.equals(request.getType())) {
			return resizeContainerCommand(request);
		}
		else {
			
			return null;
		}
	}

	public Command resizeContainerCommand(Request request) {
		ChangeBoundsRequest cbr = (ChangeBoundsRequest) request;
		CompoundCommand result = new CompoundCommand();

		// Update Bounds of the container hierachy
		for (IGraphicalEditPart currentContainer : containerHierachy) {
			IFigure figure = currentContainer.getFigure();
			SetBoundsCommand boundsCommand = new SetBoundsCommand(getHost()
					.getEditingDomain(),
					DiagramUIMessages.SetLocationCommand_Label_Resize,
					new EObjectAdapter(currentContainer.getNotationView()),
					figure.getBounds());
			result.add(new ICommandProxy(boundsCommand));

			// Update child bounds of elements that stand in the way...
			List<IGraphicalEditPart> children = currentContainer.getParent()
					.getChildren();
			for (IGraphicalEditPart childPart : children) {
				if (cbr.getEditParts().contains(childPart))
					continue;
				IFigure childFigure = childPart.getFigure();
				if (childPart == currentContainer)
					continue;
				SetBoundsCommand childBoundsCommand = new SetBoundsCommand(
						getHost().getEditingDomain(),
						DiagramUIMessages.SetLocationCommand_Label_Resize,
						new EObjectAdapter(childPart.getNotationView()),
						childFigure.getBounds());
				result.add(new ICommandProxy(childBoundsCommand));
			}
		}
		return result;
	}

	@Override
	public IGraphicalEditPart getHost() {
		return (IGraphicalEditPart) super.getHost();
	}

	@Override
	public void showSourceFeedback(Request request) {
		if (containerHierachy == null) {
			containerHierachy = collectContainerHierachy();
		}
		if (!RequestConstants.REQ_RESIZE.equals(request.getType())
				&& !RequestConstants.REQ_MOVE.equals(request.getType())) {
			return;

		} else {
			showContainerFeedback((ChangeBoundsRequest) request);
		}
	}

	@Override
	public void eraseSourceFeedback(Request request) {
		boundsCache.clear();
		containerHierachy = null;
		super.eraseSourceFeedback(request);
	}

	protected void showContainerFeedback(ChangeBoundsRequest request) {
		for (int level = 1; level <= containerHierachy.size(); level++) {
			IGraphicalEditPart containerEditPart = containerHierachy
					.get(level - 1);
			IFigure containerFigure = containerEditPart.getFigure();
			Rectangle feedbackBounds = getOriginalBounds(containerFigure);
			containerFigure.getParent().translateToAbsolute(feedbackBounds);
			feedbackBounds = calculateFeedbackBounds(request, feedbackBounds,
					level, containerFigure);
			showChildrenFeedback(containerEditPart, containerFigure,
					feedbackBounds, request);
			containerFigure.translateToRelative(feedbackBounds);
			setBounds(containerFigure, feedbackBounds);
		}
	}

	protected List<IGraphicalEditPart> collectContainerHierachy() {
		List<IGraphicalEditPart> result = new ArrayList<IGraphicalEditPart>();
		IGraphicalEditPart containerEditPart = (IGraphicalEditPart) getHost();
		while (containerEditPart != null) {
			containerEditPart = getParentEditPart(containerEditPart);
			if (containerEditPart != null)
				result.add(containerEditPart);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	/**
	 * containerFeedbackBounds as absolute
	 *
	 * @param containerEditPart
	 * @param containerFigure
	 * @param containerFeedbackBounds
	 */
	protected void showChildrenFeedback(
			final IGraphicalEditPart containerEditPart,
			final IFigure containerFigure,
			final Rectangle containerFeedbackBounds, ChangeBoundsRequest request) {
		Rectangle originalBounds = getOriginalBounds(containerFigure);

		Point moveDelta = new Point(containerFeedbackBounds.width
				- originalBounds.width, containerFeedbackBounds.height
				- originalBounds.height);

		List<IGraphicalEditPart> children = containerEditPart.getParent()
				.getChildren();

		for (IGraphicalEditPart childPart : children) {
			if (request.getEditParts().contains(childPart)) {
				continue;
			}
			if (childPart == containerEditPart) {
				continue;
			}
			showChildFeedback(childPart, moveDelta, containerFeedbackBounds);
		}
	}

	protected void showChildFeedback(IGraphicalEditPart childPart,
			Point moveDelta, Rectangle containerFeedbackBounds) {

		IFigure childFigure = childPart.getFigure();
		Rectangle originalChildBounds = getOriginalBounds(childFigure);
		childFigure.getParent().translateToAbsolute(originalChildBounds);

		boolean horizontalAffected = isHorizontalAffected(
				containerFeedbackBounds, moveDelta, originalChildBounds);
		boolean verticalAffected = isVerticalAffected(containerFeedbackBounds,
				moveDelta, originalChildBounds);
		if (!(horizontalAffected || verticalAffected)) {
			return;
		}
		if (horizontalAffected) {
			originalChildBounds.x += moveDelta.x;
		}
		if (verticalAffected) {
			originalChildBounds.y += moveDelta.y;
		}
		childFigure.getParent().translateToRelative(originalChildBounds);
		setBounds(childFigure, originalChildBounds);
	}

	/**
	 * Return a copy of the bounds from the cache
	 * 
	 * @param figure
	 * @return
	 */
	private Rectangle getOriginalBounds(IFigure figure) {
		Rectangle originalContainerBounds = boundsCache.get(figure);
		if (originalContainerBounds == null) {
			originalContainerBounds = figure.getBounds().getCopy();
			boundsCache.put(figure, originalContainerBounds);
		}
		return boundsCache.get(figure).getCopy();
	}


	private boolean isVerticalAffected(Rectangle newBounds, Point moveDelta,
			Rectangle bounds) {
		boolean verticalAffected = (bounds.x > newBounds.x || bounds.x
				+ bounds.width > newBounds.x)
				&& bounds.x < newBounds.x + newBounds.width
				|| bounds.x + bounds.width < newBounds.x + newBounds.width;
		if (verticalAffected) {
			verticalAffected = bounds.y + moveDelta.y > newBounds.y
					+ newBounds.height;
		}
		return verticalAffected;
	}

	private boolean isHorizontalAffected(Rectangle newBounds, Point moveDelta,
			Rectangle bounds) {
		boolean horizontalAffected = (bounds.y > newBounds.y || bounds.y
				+ bounds.height > newBounds.y)
				&& bounds.y < newBounds.y + newBounds.height
				|| bounds.y + bounds.height < newBounds.y + newBounds.height;
		if (horizontalAffected) {
			horizontalAffected = bounds.x + moveDelta.x > newBounds.x
					+ newBounds.width;
		}
		return horizontalAffected;
	}

	protected void setBounds(IFigure figure, Rectangle bounds) {
		figure.setBounds(bounds);
		figure.getParent().setConstraint(figure, bounds);
	}

	// here i have to calculate the resizing
	@SuppressWarnings({ "unchecked" })
	private Rectangle calculateFeedbackBounds(ChangeBoundsRequest request,
			Rectangle feedbackBounds, int level, IFigure containerFigure) {
		Rectangle result = feedbackBounds.getCopy();
		List<IGraphicalEditPart> editParts = request.getEditParts();
		for (IGraphicalEditPart editPart : editParts) {
			PrecisionRectangle transformedRect = new PrecisionRectangle(
					editPart.getFigure().getBounds());
			editPart.getFigure().translateToAbsolute(transformedRect);
			transformedRect.translate(request.getMoveDelta());
			transformedRect.resize(request.getSizeDelta());
			transformedRect.expand(SPACEING * level, SPACEING * level);
			Dimension preferredSize = containerFigure.getPreferredSize()
					.getCopy();
			editPart.getFigure().translateToAbsolute(preferredSize);
/*deactivated automatical minimizing of container
			if (request.getSizeDelta().height() < 0
					|| request.getSizeDelta().width < 0
					|| request.getMoveDelta().x < 0
					|| request.getMoveDelta().y < 0) {
				// FIXME:Remove Debug Output
				// TODO :TEST
				System.out.println("If pfad");
				result.resize(request.getSizeDelta());
				result.resize(request.getMoveDelta().x,
						request.getMoveDelta().y);

				ShapeCompartmentEditPart compartmentEditPart = null;
				if (editPart.getParent() instanceof ShapeCompartmentEditPart) {
					PrecisionRectangle transformedChildRect = null;
					compartmentEditPart = (ShapeCompartmentEditPart) editPart
							.getParent();
					List<IGraphicalEditPart> childEditParts = compartmentEditPart
							.getChildren();
					for (IGraphicalEditPart chidEditPart : childEditParts) {
						if (chidEditPart != editPart) {
							transformedChildRect = new PrecisionRectangle(
									chidEditPart.getFigure().getBounds());
							transformedChildRect.expand(SPACEING * level,
									SPACEING * level);
							chidEditPart.getFigure().translateToAbsolute(
									transformedChildRect);
							result.union(transformedChildRect);
						}
					}
				}

				Dimension max = Dimension.max(result.getSize(), containerFigure
						.getMinimumSize().getCopy());

				result.setSize(max);

			} else { */
				result.union(transformedRect);
				// FIXME:REMOVE DEBUG output
				System.out.println("else teil");
				Dimension max = Dimension.max(result.getSize(), preferredSize);

				result.setSize(max);
		}
		return result;
	}

	protected IGraphicalEditPart getParentEditPart(EditPart part) {
		part = part.getParent();
		while (!(part instanceof ShapeNodeEditPart)) {
			part = part.getParent();
			if (part == null)
				return null;
		}
		return (IGraphicalEditPart) part;
	}

}
