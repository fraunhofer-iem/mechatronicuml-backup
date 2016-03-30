package org.muml.storydiagram.verification.sdd.basicsdd.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.custom.util.SdmUtility;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableNameEditPart;

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
