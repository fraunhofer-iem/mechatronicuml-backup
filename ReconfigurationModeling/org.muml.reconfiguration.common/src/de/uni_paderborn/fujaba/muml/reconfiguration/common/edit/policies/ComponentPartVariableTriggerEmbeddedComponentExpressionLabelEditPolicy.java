package de.uni_paderborn.fujaba.muml.reconfiguration.common.edit.policies;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.muml.core.common.edit.policies.NotifyingGraphicalEditPolicy;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.component.Component;
import org.muml.pim.component.Port;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.SendReconfigurationMessageExpression;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression;

public class ComponentPartVariableTriggerEmbeddedComponentExpressionLabelEditPolicy
		extends NotifyingGraphicalEditPolicy {

	@Override
	public void activate() {
		super.activate();
		TriggerEmbeddedComponentExpression exp = ((ComponentPartVariable) getSemanticElement())
				.getTriggerEmbeddedComponentExpressions();

		addNotificationListener(exp);
		if (exp != null) {
			if (exp instanceof SendReconfigurationMessageExpression) {

				for (ParameterBinding curBinding : ((SendReconfigurationMessageExpression) exp)
						.getParameterBindings())
					addNotificationListener(curBinding);
				updateText(((SendReconfigurationMessageExpression) exp));
			} else if (exp instanceof EvaluateComponentSDDExpression) {

				for (ParameterBinding curBinding : ((EvaluateComponentSDDExpression) exp)
						.getParameterBindings())
					addNotificationListener(curBinding);
				updateText(((EvaluateComponentSDDExpression) exp));
			}
		}

	}

	@Override
	public void deactivate() {
		super.deactivate();
		getLabel().setText("");
		removeListeners();
	}

	@Override
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);

		TriggerEmbeddedComponentExpression exp = ((ComponentPartVariable) getSemanticElement())
				.getTriggerEmbeddedComponentExpressions();

		getLabel().setText("");

		// update Listeners
		removeListeners();
		addListeners();

		if (exp != null) {
			addNotificationListener(exp);

			if (exp instanceof SendReconfigurationMessageExpression) {
				for (ParameterBinding curBinding : ((SendReconfigurationMessageExpression) exp)
						.getParameterBindings())
					addNotificationListener(curBinding);
			} else if (exp instanceof EvaluateComponentSDDExpression) {
				for (ParameterBinding curBinding : ((EvaluateComponentSDDExpression) exp)
						.getParameterBindings())
					addNotificationListener(curBinding);
			}
		}

		// update text
		if (exp instanceof SendReconfigurationMessageExpression)
			updateText(((SendReconfigurationMessageExpression) exp));
		else if (exp instanceof EvaluateComponentSDDExpression)
			updateText(((EvaluateComponentSDDExpression) exp));

	}

	private void updateText(SendReconfigurationMessageExpression exp) {
		WrappingLabel label = getLabel();

		StringBuilder builder = new StringBuilder();

		builder.append(getReturnParametersString(exp));
		if(exp.getReconfigurationMessageType() != null)
			builder.append(exp.getReconfigurationMessageType().getName());
		builder.append(getParameterBindingsString(exp.getParameterBindings()));

		label.setText(builder.toString());

	}

	private void updateText(EvaluateComponentSDDExpression exp) {
		WrappingLabel label = getLabel();

		StringBuilder builder = new StringBuilder();
		builder.append("[");
		if(exp.getComponentSDD() != null)
			builder.append(exp.getComponentSDD().getName());
		builder.append(getParameterBindingsString(exp.getParameterBindings()));
		builder.append("]");

		label.setText(builder.toString());
	}

	private String getReturnParametersString(
			SendReconfigurationMessageExpression exp) {
		Component component = ((PartVariable) getSemanticElement())
				.getComponentPartType().getComponentType();
		ReconfigurationExecutionPort rePort = null;

		for (Port port : component.getPorts()) {
			if (port instanceof ReconfigurationExecutionPort
					&& port.getName().equals("reconfExec")) {
				rePort = (ReconfigurationExecutionPort) port;
				break;
			}
		}

		if (rePort == null)
			return "";

		ReconfigurationExecutionPortInterfaceEntry interfaceEntry = null;

		for (ReconfigurationExecutionPortInterfaceEntry curInterfaceEntry : rePort
				.getInterfaceEntries()) {
			if (curInterfaceEntry.getMessageType().equals(
					exp.getReconfigurationMessageType())) {
				interfaceEntry = curInterfaceEntry;
				break;
			}
		}

		if (interfaceEntry == null)
			return "";

		return createReturnParametersString(interfaceEntry.getReturnValues());
	}

	private String createReturnParametersString(EList<Parameter> parameters) {
		if (parameters.isEmpty())
			return "";

		StringBuilder builder = new StringBuilder();
		builder.append("(");

		for (Parameter curParameter : parameters) {
			builder.append(curParameter.getName());
			if (parameters.indexOf(curParameter) < parameters.size() - 1)
				builder.append(", ");
		}

		builder.append("):=");

		return builder.toString();
	}

	private String getParameterBindingsString(
			EList<ParameterBinding> paramBindings) {
		if (paramBindings.isEmpty())
			return "()";

		StringBuilder builder = new StringBuilder();
		builder.append("(");

		for (ParameterBinding curBinding : paramBindings) {
			if (curBinding.getParameter() != null
					&& curBinding.getValue() != null) {
				builder.append(curBinding.getParameter().getName() + ":=");
				builder.append(LanguageResource.serializeEObject(
						curBinding.getValue(), curBinding.eContainer()));
				if (paramBindings.indexOf(curBinding) < paramBindings.size() - 1)
					builder.append(", ");
			}
		}

		builder.append(")");

		return builder.toString();
	}

	private WrappingLabel getLabel() {
		GraphicalEditPart hostPart = (GraphicalEditPart) getHost();
		IFigure parentFigure = hostPart.getContentPane();
		Class[] parameter = null;
		Method getLabel = null;
		try {
			getLabel = parentFigure.getClass().getMethod(
					"getFigureTriggerEmbeddedComponentExpressionFigure",
					parameter);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		if (getLabel != null) {
			Object[] argument = null;
			try {
				return (WrappingLabel) getLabel.invoke(parentFigure, argument);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
