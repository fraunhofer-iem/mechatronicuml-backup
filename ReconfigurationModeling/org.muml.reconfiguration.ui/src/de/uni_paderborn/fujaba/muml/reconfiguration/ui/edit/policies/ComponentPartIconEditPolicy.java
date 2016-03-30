package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.muml.common.edit.policies.NotifyingGraphicalEditPolicy;

import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.parts.CustomComponentPartEditPart;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.ComponentMultiFigure;
import de.uni_paderborn.fujaba.muml.reconfiguration.FadingComponent;

public class ComponentPartIconEditPolicy extends NotifyingGraphicalEditPolicy {

	@Override
	public void handleNotificationEvent(Notification notification) {
		RectangleFigure iconFigure = ((ComponentMultiFigure) ((CustomComponentPartEditPart) getHost())
				.getPrimaryShape()).getFigureComponentIconRectangle();

		Shape view = (Shape) ((CustomComponentPartEditPart) getHost())
				.getModel();
		ComponentPart semanticModelElement = (ComponentPart) view.getElement();

		if (semanticModelElement.getComponentType() != null
				&& semanticModelElement.getComponentType() instanceof FadingComponent)
			setFadingComponentIcon(iconFigure);

		else
			setNormalComponentIcon(iconFigure);

	}

	@Override
	public void activate() {
		super.activate();
		RectangleFigure iconFigure = ((ComponentMultiFigure) ((CustomComponentPartEditPart) getHost())
				.getPrimaryShape()).getFigureComponentIconRectangle();

		Shape view = (Shape) ((CustomComponentPartEditPart) getHost())
				.getModel();
		ComponentPart semanticModelElement = (ComponentPart) view.getElement();

		if (semanticModelElement.getComponentType() != null
				&& semanticModelElement.getComponentType() instanceof FadingComponent)
			setFadingComponentIcon(iconFigure);
	}

	@Override
	public void deactivate() {
		super.deactivate();
		RectangleFigure iconFigure = ((ComponentMultiFigure) ((CustomComponentPartEditPart) getHost())
				.getPrimaryShape()).getFigureComponentIconRectangle();
		setNormalComponentIcon(iconFigure);

	}

	private void setFadingComponentIcon(RectangleFigure iconFigure) {
		iconFigure.getChildren().clear();

		RectangleFigure componentIconFigure1 = new RectangleFigure();

		componentIconFigure1.setFill(false);
		componentIconFigure1.setOutline(false);
		componentIconFigure1.setPreferredSize(new Dimension(getMapMode()
				.DPtoLP(35), getMapMode().DPtoLP(20)));

		GridData constraintComponentIconFigure1 = new GridData();
		constraintComponentIconFigure1.verticalAlignment = GridData.BEGINNING;
		constraintComponentIconFigure1.horizontalAlignment = GridData.END;
		constraintComponentIconFigure1.horizontalIndent = 0;
		constraintComponentIconFigure1.horizontalSpan = 1;
		constraintComponentIconFigure1.verticalSpan = 1;
		constraintComponentIconFigure1.grabExcessHorizontalSpace = true;
		constraintComponentIconFigure1.grabExcessVerticalSpace = false;
		iconFigure.add(componentIconFigure1, constraintComponentIconFigure1);

		componentIconFigure1.setLayoutManager(new StackLayout());

		RectangleFigure componentIconOuter2 = new RectangleFigure();

		componentIconOuter2.setFill(false);
		componentIconOuter2.setOutline(false);

		componentIconFigure1.add(componentIconOuter2);
		componentIconOuter2.setLayoutManager(new XYLayout());

		RectangleFigure b13 = new RectangleFigure();

		componentIconOuter2.add(b13, new Rectangle(getMapMode().DPtoLP(4),
				getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode()
						.DPtoLP(20)));

		RectangleFigure componentIconInner12 = new RectangleFigure();

		componentIconInner12.setFill(false);
		componentIconInner12.setOutline(false);

		componentIconFigure1.add(componentIconInner12);
		componentIconInner12.setLayoutManager(new XYLayout());

		RectangleFigure c13 = new RectangleFigure();

		componentIconInner12.add(c13, new Rectangle(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(2), getMapMode().DPtoLP(12), getMapMode()
						.DPtoLP(6)));

		RectangleFigure componentIconInner22 = new RectangleFigure();

		componentIconInner22.setFill(false);
		componentIconInner22.setOutline(false);

		componentIconFigure1.add(componentIconInner22);
		componentIconInner22.setLayoutManager(new XYLayout());

		RectangleFigure d13 = new RectangleFigure();

		componentIconInner22.add(d13, new Rectangle(getMapMode().DPtoLP(0),
				getMapMode().DPtoLP(10), getMapMode().DPtoLP(12), getMapMode()
						.DPtoLP(6)));

		Color green = new Color(Display.getCurrent(), 0, 150, 0);
		RectangleFigure plusFigure = new RectangleFigure();

		plusFigure.setFill(false);
		plusFigure.setOutline(true);
		plusFigure.setForegroundColor(green);

		plusFigure.setLayoutManager(new XYLayout());
		WrappingLabel plus = new WrappingLabel();

		plus.setText("+");
		plus.setAlignment(PositionConstants.CENTER);

		plus.setForegroundColor(green);

		plus.setFont(new Font(Display.getCurrent(), Display.getDefault()
				.getSystemFont().getFontData()[0].getName(), 7, SWT.NORMAL));

		plusFigure.add(plus, new Rectangle(getMapMode().DPtoLP(0), getMapMode()
				.DPtoLP(-1), getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));

		componentIconOuter2.add(plusFigure,
				new Rectangle(getMapMode().DPtoLP(13), getMapMode().DPtoLP(5),
						getMapMode().DPtoLP(9), getMapMode().DPtoLP(10)));

		Color red = new Color(Display.getCurrent(), 150, 0, 0);
		RectangleFigure minusFigure = new RectangleFigure();

		minusFigure.setFill(false);
		minusFigure.setOutline(true);
		minusFigure.setForegroundColor(red);

		minusFigure.setLayoutManager(new XYLayout());

		WrappingLabel minus = new WrappingLabel();
		minus.setText("-");
		minus.setAlignment(PositionConstants.TOP);
		minus.setForegroundColor(red);
		minus.setFont(new Font(Display.getCurrent(), Display.getDefault()
				.getSystemFont().getFontData()[0].getName(), 7, SWT.NORMAL));

		minusFigure.add(minus, new Rectangle(getMapMode().DPtoLP(-1),
				getMapMode().DPtoLP(-2), getMapMode().DPtoLP(10), getMapMode()
						.DPtoLP(10)));

		componentIconOuter2.add(minusFigure,
				new Rectangle(getMapMode().DPtoLP(23), getMapMode().DPtoLP(5),
						getMapMode().DPtoLP(9), getMapMode().DPtoLP(10)));
	}

	private void setNormalComponentIcon(RectangleFigure iconFigure) {
		iconFigure.getChildren().clear();
		ComponentMultiFigure componentFigure = ((ComponentPartEditPart) getHost()).new ComponentMultiFigure();
		IFigure iconContainer = componentFigure
				.getFigureComponentIconRectangle();

		IFigure icon = (IFigure) iconContainer.getChildren().get(0);

		GridData constraintComponentIconFigure3 = new GridData();
		constraintComponentIconFigure3.verticalAlignment = GridData.BEGINNING;
		constraintComponentIconFigure3.horizontalAlignment = GridData.END;
		constraintComponentIconFigure3.horizontalIndent = 0;
		constraintComponentIconFigure3.horizontalSpan = 1;
		constraintComponentIconFigure3.verticalSpan = 1;
		constraintComponentIconFigure3.grabExcessHorizontalSpace = true;
		constraintComponentIconFigure3.grabExcessVerticalSpace = false;

		iconFigure.add((IFigure) icon, constraintComponentIconFigure3);
	}

	protected IMapMode getMapMode() {
		RootEditPart root = getHost().getRoot();
		if (root instanceof DiagramRootEditPart) {
			DiagramRootEditPart dgrmRoot = (DiagramRootEditPart) root;
			return dgrmRoot.getMapMode();
		}

		return MapModeUtil.getMapMode();
	}

}
