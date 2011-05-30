package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.HistoryStateImpl;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart;

/**
 * A customized PortEditPart. It is responsible for ports around
 * StructuredComponents and ComponentParts.
 * 
 * @author braund
 * 
 */
public class CustomHistoryStateEditPart extends HistoryStateEditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomHistoryStateEditPart(View view) {
		super(view);

	}
	
	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		
		Object feature = notification.getFeature();
		if (feature instanceof EAttribute) {
			EAttribute reference = (EAttribute) feature;
			if (reference.getContainerClass() == HistoryState.class) {
				int featureID = notification.getFeatureID(HistoryStateImpl.class);
				if (featureID == RealtimestatechartPackage.HISTORY_STATE__KIND) {
					HistoryState hS = (HistoryState) getNotationView().getElement();
					CustomHistoryFigure cHF = (CustomHistoryFigure) primaryShape;
					if(HistoryKind.DEEP_VALUE==hS.getKind().getValue()){
						cHF.historyLabel0.setText("H*");
					}else{
						cHF.historyLabel0.setText("H");
					}				
				} 
			}
		}

		super.handleNotificationEvent(notification);
	}
	
	/**
	 * @generated
	 */
	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomHistoryFigure();
	}

	public class CustomHistoryFigure extends Ellipse {

		WrappingLabel historyLabel0;
		
		public CustomHistoryFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setLineWidth(3);
			createContents();
		}

		private void createContents() {

			historyLabel0 = new WrappingLabel();
			historyLabel0.setText("H*");

			GridData constraintHistoryLabel0 = new GridData();
			constraintHistoryLabel0.verticalAlignment = GridData.CENTER;
			constraintHistoryLabel0.horizontalAlignment = GridData.CENTER;
			constraintHistoryLabel0.horizontalIndent = 0;
			constraintHistoryLabel0.horizontalSpan = 1;
			constraintHistoryLabel0.verticalSpan = 1;
			constraintHistoryLabel0.grabExcessHorizontalSpace = true;
			constraintHistoryLabel0.grabExcessVerticalSpace = true;
			this.add(historyLabel0, constraintHistoryLabel0);

		}

	}
}
