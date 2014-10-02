package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.patterns.ObjectVariable;

import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.custom.util.SdmUtility;
import de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableNameEditPart;

public class CustomObjectVariableNameLabelEditPart extends
		ObjectVariableNameEditPart {

		public CustomObjectVariableNameLabelEditPart(View view)
		{
			super(view);
		}

		@Override
		protected void handleNotificationEvent(Notification event)
		{
			if (event.getNotifier() instanceof ObjectVariable)
			{
				SdmUtility.adaptColor(getFigure(), ((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());
			}

			super.handleNotificationEvent(event);
			
		
		}

		@Override
		protected void refreshVisuals()
		{
			super.refreshVisuals();
			SdmUtility.adaptColor(getFigure(), ((ObjectVariable) ((View) this.getModel()).getElement()).getBindingOperator());
			
			((WrappingLabel) getFigure()).setTextUnderline(true);
		}

}
