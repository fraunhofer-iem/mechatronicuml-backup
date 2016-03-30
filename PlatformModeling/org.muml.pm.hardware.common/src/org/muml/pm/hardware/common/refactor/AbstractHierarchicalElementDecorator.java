/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.muml.pm.hardware.common.refactor;

import java.util.Collection;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget.Direction;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.EcoreUtil2;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public abstract class AbstractHierarchicalElementDecorator<T extends EObject> extends InteractiveDecorator {

	public AbstractHierarchicalElementDecorator(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget);
	}

	protected abstract Class<T> getTClass();

	protected abstract Image getDecorationImageElement(T element);

	protected abstract EObject getEmbeddedElement(T element);

	protected Diagram getTooltipDiagramToRenderElement(T element) {
		IGraphicalEditPart adapter = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
		BooleanValueStyle style = GMFNotationUtil.getBooleanValueStyle(adapter.getNotationView(),
				DiagramPartitioningUtil.INLINE_STYLE);
		if (style != null && !style.isBooleanValue()) {
			return getDiagramForSemanticElement(element);
		}
		return null;
	}

	private Diagram getDiagramForSemanticElement(T element) {
		IGraphicalEditPart adapter = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
		View view = adapter.getNotationView();
		Collection<Diagram> diagrams = EcoreUtil2.getObjectsByType(view.eResource().getContents(),
				NotationPackage.Literals.DIAGRAM);
		for (Diagram diagram : diagrams) {
			if (EcoreUtil.equals(diagram.getElement(), getEmbeddedElement(element))) {
				return diagram;
			}
		}
		return null;
	}

	@Override
	public boolean shouldDecorate(EObject element) {
		return true;

	}

	@Override
	public Image getDecorationImage(EObject element) {
		return (getTClass().isInstance(element)) ? getDecorationImageElement((T) element) : null;
	}

	@Override
	protected IFigure getToolTipFigure(EObject element) {
		if (getTClass().isInstance(element)) {
			Diagram diagram = getTooltipDiagramToRenderElement((T) element);
			if (diagram != null) {
				Image renderImage = renderImage(diagram);
				return new ImageFigure(renderImage);

			}
		}
		return null;
	}

	protected Image renderImage(Diagram diagram) {
		Assert.isNotNull(diagram);
		Image renderImage = CustomRenderingHelper.renderToSWTImage(diagram);
		Image resize = resize(renderImage, (int) (0.7071 * renderImage.getBounds().width),
				(int) (0.7071 * renderImage.getBounds().height));
		return resize;
	}

	@Override
	protected Direction getDecoratorPosition() {
		return IDecoratorTarget.Direction.SOUTH_EAST;
	}

	@Override
	protected void mousePressed(Decoration decoration, EObject semanticElement) {

		IGraphicalEditPart adapter = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
		BooleanValueStyle style = GMFNotationUtil.getBooleanValueStyle(adapter.getNotationView(),
				DiagramPartitioningUtil.INLINE_STYLE);
		if (style == null || style.isBooleanValue()) {
			getExtractClass().execute();
		}
	}

	protected abstract AbstractExtractSubdiagramRefactoring<T> getExtractClass();
}
