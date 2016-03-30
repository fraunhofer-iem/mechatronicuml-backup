package org.muml.storydiagram.verification.sdd.basicsdd.diagram.custom.util;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.ObjectVariable;


public class SdmUtility {
	
	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);

	public static void adaptColor(IFigure figure, BindingOperator spMod)
	{

		switch (spMod)
		{
			case CREATE:
			{
				figure.setForegroundColor(DiagramColorRegistry.getInstance().getColor(RGB_CREATE));
				break;
			}
			case DESTROY:
			{
				figure.setForegroundColor(DiagramColorRegistry.getInstance().getColor(RGB_DESTROY));
				break;
			}
			case CHECK_ONLY:
			{
				figure.setForegroundColor(DiagramColorRegistry.getInstance().getColor(RGB_CHECK));
				break;
			}
			default:
			{
				figure.setForegroundColor(DiagramColorRegistry.getInstance().getColor(RGB_CHECK));
				break;
			}
		}
	}

	public static String adaptObjectVariableModifierText(IGraphicalEditPart editPart)
	{
		ObjectVariable ov = (ObjectVariable) ((View) editPart.getModel()).getElement();

		switch (ov.getBindingOperator())
		{
			case CREATE:
			{
				return "<<create>>";
			}
			case DESTROY:
			{
				return "<<destroy>>";
			}
			default:
			{
				return "";
			}
		}

	}

	public static EdgeGuard String2Guard(String text) {
		return EdgeGuard.valueOf(text.replaceAll(" ", "_").toUpperCase());
	}

	public static String Guard2String(EdgeGuard guard) {
		return guard.toString().toLowerCase().replaceAll("_", " ");
	}
	
}
