package org.muml.pm.hardware.common.edit.policies.container;

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
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class AutoSizeContainerCommand extends AbstractTransactionalCommand {

	IGraphicalEditPart host;

	public AutoSizeContainerCommand(TransactionalEditingDomain domain, String label, List affectedFiles,
			IGraphicalEditPart host) {
		super(domain, label, affectedFiles);
		this.host = host;
	}

	// Space between the border of the container and the moved figure
	public int V_SPACEING = 25;
	public int H_SPACEING = 25;

	protected IGraphicalEditPart getParentEditPart(EditPart part) {
		EditPart parentPart = part.getParent();
		while (!(parentPart instanceof ShapeNodeEditPart)) {
			parentPart = parentPart.getParent();
			if (parentPart == null)
				return null;
		}
		return (IGraphicalEditPart) parentPart;
	}

	private Rectangle calculateFeedbackBounds(Rectangle feedbackBounds, IFigure containerFigure) {
		Dimension preferredSize = containerFigure.getPreferredSize().getCopy();
		ResizableCompartmentEditPart compartmentEditPart = (ResizableCompartmentEditPart) host;
		if (host instanceof ListCompartmentEditPart) {
			H_SPACEING = 0;
			V_SPACEING = 50;
		} else {
			H_SPACEING = 25;
		}

		Rectangle result = feedbackBounds.getCopy();
		List<IGraphicalEditPart> childEditParts = compartmentEditPart.getChildren();
		for (IGraphicalEditPart chidEditPart : childEditParts) {
			if (chidEditPart != host) {
				Rectangle bound = new Rectangle(chidEditPart.getFigure().getBounds());
				chidEditPart.getFigure().translateToAbsolute(bound);
				bound.expand(H_SPACEING, V_SPACEING);
				chidEditPart.getFigure().translateToAbsolute(preferredSize);
				result.union(bound);

			}
		}

		Dimension max = Dimension.max(result.getSize(), preferredSize);

		result.setSize(max);
		return result;

	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

		IGraphicalEditPart parent = getParentEditPart(host);
		Rectangle feedbackBounds = parent.getFigure().getBounds().getCopy();
		parent.getFigure().getParent().translateToAbsolute(feedbackBounds);
		feedbackBounds = calculateFeedbackBounds(feedbackBounds, parent.getFigure());
		parent.getFigure().translateToRelative(feedbackBounds);
		SetBoundsCommand cmd = new SetBoundsCommand(getEditingDomain(),
				DiagramUIMessages.SetLocationCommand_Label_Resize, new EObjectAdapter(parent.getNotationView()),
				feedbackBounds);

		IStatus status = cmd.execute(monitor, info);
		cleanup();
		return status.getSeverity() == IStatus.OK ? CommandResult.newOKCommandResult()
				: CommandResult.newErrorCommandResult("Resize went Wrong!");

	}

}
