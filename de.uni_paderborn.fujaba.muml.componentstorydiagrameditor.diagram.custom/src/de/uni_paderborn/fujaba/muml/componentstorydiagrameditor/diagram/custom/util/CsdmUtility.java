package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.model.core.Parameter;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.PortDataType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule;

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
		ComponentStoryPatternVariable cspVar = (ComponentStoryPatternVariable) ((View) editPart
				.getModel()).getElement();
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
						(View) editPart.getModel(),
						org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE
								.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));

	}
	
	public static String getSignature(ReconfigurationRule reconfigurationRule){
		String type = "";
		String name = "";
		String parameters = "";
		String resultParameters = "";

		PortDataType tmpPortType = null;
		PartDataType tmpPartType = null;

		Port tmpPort = null;
		ComponentPart tmpPart = null;

		List<Parameter> returnParameterList = new ArrayList<Parameter>();

		// build list of Return Parameters and build String to Display
		for (Parameter returnParameter : reconfigurationRule
				.getReturnParameters()) {
			returnParameterList.add(returnParameter);
			if (returnParameter.getType() instanceof PortDataType) {
				tmpPortType = ((PortDataType) returnParameter.getType());
				tmpPort = ((Port) tmpPortType.getPort());
				resultParameters = resultParameters.concat(returnParameter
						.getName()
						+ " / "
						+ tmpPort.getName()
						+ " : "
						+ tmpPortType.getName() + ", ");
			} else if (returnParameter.getType() instanceof PartDataType) {
				tmpPartType = ((PartDataType) returnParameter.getType());
				tmpPart = ((ComponentPart) tmpPartType.getComponentPart());
				resultParameters = resultParameters.concat(returnParameter
						.getName()
						+ " / "
						+ tmpPart.getName()
						+ " : "
						+ tmpPartType.getName() + ", ");
			}
		}

		if (resultParameters != "") {
			resultParameters = resultParameters.substring(0,
					resultParameters.length() - 2);
		}

		// only Parameters not in ReturnParameters need to be displayed
		for (Parameter parameter : reconfigurationRule.getParameters()) {
			if (!returnParameterList.contains(parameter)) {
				if (parameter.getType() instanceof PortDataType) {
					tmpPortType = ((PortDataType) parameter.getType());
					tmpPort = ((Port) tmpPortType.getPort());
					parameters = parameters.concat(parameter.getName()
							+ " / " + tmpPort.getName() + " : "
							+ tmpPortType.getName() + ", ");
				} else if (parameter.getType() instanceof PartDataType) {
					tmpPartType = ((PartDataType) parameter.getType());
					tmpPart = ((ComponentPart) tmpPartType
							.getComponentPart());
					parameters = parameters.concat(parameter.getName()
							+ " / " + tmpPart.getName() + " : "
							+ tmpPartType.getName() + ", ");
				}
			}
		}

		if (parameters != "") {
			parameters = parameters.substring(0, parameters.length() - 2);
		}

		if (reconfigurationRule.getName() != null) {
			name = reconfigurationRule.getName();
			type = reconfigurationRule.getName();
		}
		
		return type + "::" + name + "(" + parameters
				+ ") : (" + resultParameters + ")";
	}

}
