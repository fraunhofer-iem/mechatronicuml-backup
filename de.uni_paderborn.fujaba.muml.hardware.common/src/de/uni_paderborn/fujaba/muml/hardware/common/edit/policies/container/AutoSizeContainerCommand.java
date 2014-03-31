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
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class AutoSizeContainerCommand extends AbstractTransactionalCommand  {

	IGraphicalEditPart host;
	
	public AutoSizeContainerCommand(TransactionalEditingDomain domain, String label,
			List affectedFiles,IGraphicalEditPart host) {
		super(domain, label, affectedFiles);
		this.host=host;
		// TODO Auto-generated constructor stub
	}

	// Space between the border of the container and the moved figure
	public static final int SPACEING = 25;
	

	public Command resizeContainerCommand() {
		CompoundCommand result = new CompoundCommand();

		IGraphicalEditPart parent = getParentEditPart(host);
		Rectangle feedbackBounds = parent.getFigure().getBounds().getCopy();
		parent.getFigure().getParent().translateToAbsolute(feedbackBounds);
		feedbackBounds = calculateFeedbackBounds(feedbackBounds, 5,
				parent.getFigure());
		parent.getFigure().translateToRelative(feedbackBounds);
		SetBoundsCommand cmd = new SetBoundsCommand(getEditingDomain(),
				DiagramUIMessages.SetLocationCommand_Label_Resize,
				new EObjectAdapter(parent.getNotationView()), feedbackBounds);
		result.add(new ICommandProxy(cmd));
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

	private Rectangle calculateFeedbackBounds(Rectangle feedbackBounds,
			int level, IFigure containerFigure) {
		Dimension preferredSize = containerFigure.getPreferredSize().getCopy();
		ShapeCompartmentEditPart compartmentEditPart = (ShapeCompartmentEditPart) host;

		Rectangle result = feedbackBounds.getCopy();
		// containerFigure.translateToAbsolute(feedbackBounds);
		List<IGraphicalEditPart> childEditParts = compartmentEditPart
				.getChildren();
		for (IGraphicalEditPart chidEditPart : childEditParts) {
			if (chidEditPart != host) {
				Rectangle bound = new Rectangle(chidEditPart.getFigure()
						.getBounds());
				chidEditPart.getFigure().translateToAbsolute(bound);
				bound.expand(SPACEING, SPACEING);
				chidEditPart.getFigure().translateToAbsolute(preferredSize);
				// chidEditPart.getFigure().translateToAbsolute(bound);
				/*
				 * AutoEnlargeContainerRequest request = new
				 * AutoEnlargeContainerRequest(chidEditPart); Command
				 * cmd=chidEditPart.getCommand(request); cmd.execute();
				 */
				result.union(bound);

			}
		}

		Dimension max = Dimension.max(result.getSize(), preferredSize);

		result.setSize(max);
		return result;

	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		

		IGraphicalEditPart parent = getParentEditPart(host);
		Rectangle feedbackBounds = parent.getFigure().getBounds().getCopy();
		parent.getFigure().getParent().translateToAbsolute(feedbackBounds);
		feedbackBounds = calculateFeedbackBounds(feedbackBounds, 5,
				parent.getFigure());
		parent.getFigure().translateToRelative(feedbackBounds);
		SetBoundsCommand cmd = new SetBoundsCommand(getEditingDomain(),
				DiagramUIMessages.SetLocationCommand_Label_Resize,
				new EObjectAdapter(parent.getNotationView()), feedbackBounds);
		
		IStatus status=cmd.execute(monitor, info);
	        cleanup();
		return status.getSeverity()==IStatus.OK ? CommandResult.newOKCommandResult() : CommandResult.newErrorCommandResult("Resize went Wrong!");
	}


	
}
