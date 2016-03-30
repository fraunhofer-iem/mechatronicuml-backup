package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.verification.sdd.LeafNode;


public class CustomLeafNodeEditPart extends org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart {

	
	public CustomLeafNodeEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomLeafNodeFigure();
	}
	
	
	private void updateFigure() {
		
		LeafNode node = ((LeafNode) ((View) getModel()).getElement());
		
		if (node != null) {
			
			CustomLeafNodeFigure figure = (CustomLeafNodeFigure) primaryShape;
			if (node.isValue() == true) {
				figure.fFigureLeafNodeValueFigure.getParent().setForegroundColor(ColorConstants.green);
				for(Object c : figure.fFigureLeafNodeValueFigure.getChildren()) {
					if (c instanceof Figure) {
						((Figure) c).setForegroundColor(ColorConstants.green);
					}	
				}
				figure.fFigureLeafNodeValueFigure.setText("1");
			}
			else {
				figure.fFigureLeafNodeValueFigure.getParent().setForegroundColor(ColorConstants.red);
				for(Object c : figure.fFigureLeafNodeValueFigure.getChildren()) {
					if (c instanceof Figure) {
						((Figure) c).setForegroundColor(ColorConstants.red);
					}	
				}
				figure.fFigureLeafNodeValueFigure.setText("0");					
			}
			
		}
	
	}
		
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		updateFigure();
		refreshVisuals();
	}

	
	@Override 
	public void refresh() {
		super.refresh();
		updateFigure();
	}


	
	public class CustomLeafNodeFigure extends Ellipse {

		private WrappingLabel fFigureLeafNodeValueFigure;


		public CustomLeafNodeFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setForegroundColor(ColorConstants.green);
			createContents();
		}

		private void createContents() {

			fFigureLeafNodeValueFigure = new WrappingLabel();
			fFigureLeafNodeValueFigure.setText("1");

			GridData constraintFFigureLeafNodeValueFigure = new GridData();
			constraintFFigureLeafNodeValueFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureLeafNodeValueFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureLeafNodeValueFigure.horizontalIndent = 0;
			constraintFFigureLeafNodeValueFigure.horizontalSpan = 1;
			constraintFFigureLeafNodeValueFigure.verticalSpan = 1;
			constraintFFigureLeafNodeValueFigure.grabExcessHorizontalSpace = true;
			constraintFFigureLeafNodeValueFigure.grabExcessVerticalSpace = true;
			this.add(fFigureLeafNodeValueFigure,
					constraintFFigureLeafNodeValueFigure);

		}

		public WrappingLabel getFigureLeafNodeValueFigure() {
			return fFigureLeafNodeValueFigure;
		}

	}

}
