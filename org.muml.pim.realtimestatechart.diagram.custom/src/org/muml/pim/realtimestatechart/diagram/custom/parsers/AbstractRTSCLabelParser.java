package org.muml.pim.realtimestatechart.diagram.custom.parsers;

import java.util.function.Function;
import java.util.stream.Collectors;

import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.behavior.Variable;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

public abstract class AbstractRTSCLabelParser {
	
	
	

	public static String getStringForVariablesOperationsClocks(RealtimeStatechart statechart) {

		StringBuilder label = new StringBuilder();
		
		// Variables
		if (!statechart.getVariables().isEmpty()) {
			label.append("variable: ");
			label.append(statechart.getVariables().stream().map(new Function<Variable, String>() {
				public String apply(Variable v) {
					return
						// constant
						(v.isConstant() ? "const " : "") +
						// datatype
						(v.getDataType() != null ? (v.getDataType().getName() + " ") : "") +
						// name
						v.getName() + 
						// initialize expression
						(v.getInitializeExpression() == null ? "" : (" :=" + ParserUtilities.serializeExpression(v.getInitializeExpression(), v)));
				}
			}).collect(Collectors.joining(", ")));
			label.append(";\n");
		}
		
		// Operations
		if (!statechart.getOperations().isEmpty()) {
			label.append("operation: ");
			label.append(statechart.getOperations().stream().map(new Function<Operation, String>() {
				public String apply(Operation operation) {
					return
						// return type
						(operation.getReturnType() == null ? "" : (operation.getReturnType().getName()) + " ") +
						// name
						operation.getName() +
						// parameter list
						"(" + operation.getParameters().stream().map(new Function<Parameter, String>() {
							public String apply(Parameter parameter) {
								return parameter.getName();
							} }).collect(Collectors.joining(", ")) +
						")";
				}
				
			}).collect(Collectors.joining(", ")));
			label.append(";\n");
		}

		// Clocks
		if (!statechart.getClocks().isEmpty()) {
			label.append("clock: ");
			label.append(statechart.getClocks().stream().map(new Function<Clock, String>() {
				public String apply(Clock e) {
					return e.getName();
				}
			}).collect(Collectors.joining(", ")));
			label.append(";\n");
		}
		

		// Subrole specific Variables
		if (!statechart.getSubRoleSpecificVariables().isEmpty()) {
			label.append("subrole-specific variable: ");
			label.append(statechart.getSubRoleSpecificVariables().stream().map(new Function<Variable, String>() {
				public String apply(Variable v) {
					return
						// constant
						(v.isConstant() ? "const " : "") +
						// datatype
						(v.getDataType() != null ? (v.getDataType().getName() + " ") : "") +
						// name
						v.getName() + 
						// initialize expression
						(v.getInitializeExpression() == null ? "" : (" :=" + ParserUtilities.serializeExpression(v.getInitializeExpression(), v)));
				}
			}).collect(Collectors.joining(", ")));
			label.append(";\n");
		}
		
		// Subrole specific Operations
		if (!statechart.getSubRoleSpecificOperations().isEmpty()) {
			label.append("subrole-specific operation: ");
			label.append(statechart.getSubRoleSpecificOperations().stream().map(new Function<Operation, String>() {
				public String apply(Operation operation) {
					return
						// return type
						(operation.getReturnType() == null ? "" : (operation.getReturnType().getName()) + " ") +
						// name
						operation.getName() +
						// parameter list
						"(" + operation.getParameters().stream().map(new Function<Parameter, String>() {
							public String apply(Parameter parameter) {
								return parameter.getName();
							} }).collect(Collectors.joining(", ")) +
						")";
				}
				
			}).collect(Collectors.joining(", ")));
			label.append(";\n");
		}

		// Subrole specific Clocks
		if (!statechart.getSubRoleSpecificClocks().isEmpty()) {
			label.append("subrole-specific clock: ");
			label.append(statechart.getSubRoleSpecificClocks().stream().map(new Function<Clock, String>() {
				public String apply(Clock e) {
					return e.getName();
				}
			}).collect(Collectors.joining(", ")));
			label.append(";\n");
		}
		
		return label.toString();
	}

}
