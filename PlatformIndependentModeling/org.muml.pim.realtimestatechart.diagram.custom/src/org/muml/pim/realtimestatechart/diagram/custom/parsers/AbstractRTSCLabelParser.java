package org.muml.pim.realtimestatechart.diagram.custom.parsers;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.behavior.Variable;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

public abstract class AbstractRTSCLabelParser {
	
	
	

	public static String getStringForVariablesOperationsClocks(RealtimeStatechart stateChart) {

		EList<Variable> variableList = stateChart.getVariables();
		EList<Operation> operationList = stateChart.getOperations();
		EList<Clock> clockList = stateChart.getClocks();

		StringBuilder sbVariables = new StringBuilder();
		for (Variable var : variableList) {

			if (sbVariables.length() != 0) {
				sbVariables.append(", ");
			}
			
			if (var.isConstant()) {
				sbVariables.append("const ");
			}
			
			if (var.getDataType() != null) {
				sbVariables.append(var.getDataType().getName());
				sbVariables.append(' ');
			}
			if (var.getName() != null) {
				sbVariables.append(var.getName());
			}
			if (var.getInitializeExpression() != null) {
				sbVariables.append(":=");
				sbVariables.append(ParserUtilities.serializeExpression(
						var.getInitializeExpression(), var));
			}

		}

		StringBuilder sbOperations = new StringBuilder();
		for (Operation op : operationList) {
			if (sbOperations.length() != 0) {
				sbOperations.append(", ");
			}
			if (op.getReturnType() != null) {
				sbOperations.append(op.getReturnType().getName());
				sbOperations.append(' ');
			}
			sbOperations.append(op.getName());
			sbOperations.append("(");
			EList<Parameter> parameterList = op.getParameters();
			StringBuilder sbParameter = new StringBuilder();
			for (Parameter par : parameterList) {
				if (sbParameter.length() != 0) {
					sbParameter.append(", ");
				}
				if (par.getDataType() != null) {
					sbParameter.append(par.getDataType().getName());
					sbParameter.append(' ');
				}
				sbParameter.append(par.getName());
			}
			sbOperations.append(sbParameter.toString());
			sbOperations.append(")");

		}

		StringBuilder sbClocks = new StringBuilder();
		for (Clock c : clockList) {
			if (sbClocks.length() != 0) {
				sbClocks.append(", ");
			}
			sbClocks.append(c.getName());
		}

		StringBuilder sbFinalString = new StringBuilder();
		if (sbVariables.length() != 0) {
			sbFinalString.append("variable: ");
			sbFinalString.append(sbVariables.toString());
			sbFinalString.append(";\n");
		}
		if (sbOperations.length() != 0) {
			sbFinalString.append("operation: ");
			sbFinalString.append(sbOperations.toString());
			sbFinalString.append(";\n");
		}

		if (sbClocks.length() != 0) {
			sbFinalString.append("clock: ");
			sbFinalString.append(sbClocks.toString());
			sbFinalString.append(";\n");
		}
		return sbFinalString.toString();
	}

}
