package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.ActivityEdge;
import org.storydriven.storydiagrams.activities.EdgeGuard;
import org.storydriven.storydiagrams.patterns.BindingOperator;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPatternVariable;

public class CsdmUtility {

	private static final String EMPTY = ""; //$NON-NLS-1$
	private static final String STEREOTYPE_PREFIX = "\u00ab"; //$NON-NLS-1$
	private static final String STEREOTYPE_SUFFIX = "\u00bb"; //$NON-NLS-1$

	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);

	private CsdmUtility() {
		// hide constructor
	}

	public static String adaptComponentStoryPatternVariableText(
			IGraphicalEditPart editPart) {
		ComponentStoryPatternVariable cspVar = (ComponentStoryPatternVariable) ((View) editPart
				.getModel()).getElement();

		switch (cspVar.getBindingOperator()) {
		case CREATE: {
			return STEREOTYPE_PREFIX + "create" + STEREOTYPE_SUFFIX;
		}
		case DESTROY: {
			return STEREOTYPE_PREFIX + "destroy" + STEREOTYPE_SUFFIX;
		}
		default: {
			return EMPTY;
		}
		}
	}

	public static void adaptColor(IGraphicalEditPart editPart) {
		adaptColor((View) editPart.getModel());
	}

	public static void adaptColor(View view) {
		ComponentStoryPatternVariable cspVar = (ComponentStoryPatternVariable) view
				.getElement();
		org.eclipse.swt.graphics.RGB lineRGB;

		switch (cspVar.getBindingOperator()) {
		case CREATE:
			lineRGB = RGB_CREATE;
			break;
		case DESTROY:
			lineRGB = RGB_DESTROY;
			break;
		default:
		case CHECK_ONLY:
			lineRGB = RGB_CHECK;
			break;
		}

		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						view,
						org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE
								.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));

	}

	public static void adaptColor(IFigure figure, BindingOperator spMod) {
		switch (spMod) {
		case CREATE:
			figure.setForegroundColor(DiagramColorRegistry.getInstance()
					.getColor(RGB_CREATE));
			break;
		case DESTROY:
			figure.setForegroundColor(DiagramColorRegistry.getInstance()
					.getColor(RGB_DESTROY));
			break;
		case CHECK_ONLY:
			figure.setForegroundColor(DiagramColorRegistry.getInstance()
					.getColor(RGB_CHECK));
			break;
		default:
			figure.setForegroundColor(DiagramColorRegistry.getInstance()
					.getColor(RGB_CHECK));
			break;
		}
	}

	public static String getText(ActivityEdge activityEdge) {
		EdgeGuard edgeGuard = activityEdge.getGuard();
		if (edgeGuard != null && !EdgeGuard.NONE.equals(edgeGuard)) {
			StringBuilder builder = new StringBuilder();

			builder.append('[');
			builder.append(' ');
			if (EdgeGuard.BOOL.equals(edgeGuard)) {
				append(builder, activityEdge.getGuardExpression());
			} else {
				builder.append(edgeGuard);
			}
			builder.append(' ');
			builder.append(']');

			return builder.toString();
		}
		return null;
	}

	private static void append(StringBuilder builder, Expression expression) {
		TextUtil.append(builder, expression);
	}

	public static String getSignature(ComponentStoryRule componentStoryRule) {

		Component component = componentStoryRule.getReconfiguredComponent();
		
		String constructor = "";
		if(componentStoryRule.isConstructor())
			constructor = "Constructor: ";

		String type = "";
		String name = "";
		String parameters = "";
		String resultParameters = "";

		Port tmpPort = null;
		ComponentPart tmpPart = null;
		Component tmpComponent = null;

		// build list of Return Parameters and build String to Display
		if (componentStoryRule.getSignature() == null) {
			resultParameters = "";
		} else {
			for (Parameter returnParameter : componentStoryRule.getSignature()
					.getReturnParameters()) {
				if (returnParameter.getDataType() instanceof Port) {
					tmpPort = ((Port) returnParameter.getDataType());
					resultParameters = resultParameters
							.concat(tmpPort.getName() + " "
									+ returnParameter.getName() + ", ");
				} else if (returnParameter.getDataType() instanceof ComponentPart) {
					tmpPart = ((ComponentPart) returnParameter.getDataType());
					tmpComponent = ((Component) tmpPart.getComponentType());
					resultParameters = resultParameters.concat(returnParameter
							.getName()
							+ " / "
							+ tmpPart.getName()
							+ " : "
							+ tmpComponent.getName() + ", ");
				} else {
					resultParameters = resultParameters.concat(returnParameter
							.getDataType().getName()
							+ " "
							+ returnParameter.getName() + ", ");
				}
			}
		}

		if (resultParameters != "") {
			resultParameters = resultParameters.substring(0,
					resultParameters.length() - 2);
		}

		// build list of Input Parameters and build String to Display
		if (componentStoryRule.getSignature() == null) {
			parameters = "";
		} else {
			for (Parameter parameter : componentStoryRule.getSignature()
					.getParameters()) {
				if (parameter.getDataType() instanceof Port) {
					tmpPort = ((Port) parameter.getDataType());
					parameters = parameters.concat(parameter.getName() + " / "
							+ tmpPort.getName() /*
												 * + " : " +
												 * tmpPortType.getName()
												 */
							+ ", ");
				} else if (parameter.getDataType() instanceof ComponentPart) {
					tmpPart = ((ComponentPart) parameter.getDataType());
					tmpComponent = ((Component) tmpPart.getComponentType());
					parameters = parameters.concat(parameter.getName() + " / "
							+ tmpPart.getName() + " : "
							+ tmpComponent.getName() + ", ");
				} else {
					parameters = parameters.concat(parameter.getDataType()
							.getName() + " " + parameter.getName() + ", ");
				}
			}
		}

		if (parameters != "") {
			parameters = parameters.substring(0, parameters.length() - 2);
		}

		if (componentStoryRule.getName() != null) {
			name = componentStoryRule.getName();
		}

		if (component != null) {
			if (component.getName() != null) {
				type = component.getName();
			}
		}

		return constructor + type + "::" + name + "(" + parameters + ") : ("
				+ resultParameters + ")";
	}

}
