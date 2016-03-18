package de.uni_paderborn.fujaba.muml.testlanguage.custom.validation;

import java.io.PrintStream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.ValidationEvent;

import de.uni_paderborn.fujaba.muml.testlanguage.Input;
import de.uni_paderborn.fujaba.muml.testlanguage.Node;
import de.uni_paderborn.fujaba.muml.testlanguage.Output;
import de.uni_paderborn.fujaba.muml.testlanguage.Port;

public class ValidationLog {

	private static boolean STARTED = false;

	public static void startValidation() {
		if (STARTED == true) {
			return;
		}
		STARTED = true;

		println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		println("+++ STARTING VALIDATION +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		println();
	}

	public static void endValidation(ValidationEvent event) {
		STARTED = false;

		String outcome = (event.matches(IStatus.ERROR)) ? "FAILED +++"
				: "SUCCESSFUL";

		println("+++ VALIDATION "
				+ outcome
				+ " +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		if (event.matches(IStatus.ERROR)) {
			for (IConstraintStatus constraint : event.getValidationResults()) {
				println(formatLabel(constraint.getTarget()) + ": "
						+ constraint.getMessage());
			}
		}

		println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	public static void startNode(Node node) {
		startValidation();
		println("--- VALIDATE NODE ---------------------------------------------------------------------");
		println("--- " + node.getLabel() + " (@"
				+ Integer.toHexString(node.hashCode()) + ")");
		println();
	}

	public static void endNode(Node node, IStatus status) {
		String outcome = (status.matches(IStatus.ERROR)) ? "FAILED ---"
				: "SUCCESSFUL";
		println("--- VALIDATION "
				+ outcome
				+ " ---------------------------------------------------------------");

		if (status.getSeverity() == IStatus.ERROR) {
			println(status.getMessage());
		}

		println("---------------------------------------------------------------------------------------");
		println();
	}

	public static void exception(Exception e) {
		e.printStackTrace();
		println();
	}

	public static void message(String message) {
		println(message);
	}

	private static void println(String message) {
		getPrintStream().println(message);
		getPrintStream().flush();
	}

	private static void println() {
		getPrintStream().println();
		getPrintStream().flush();
	}

	@SuppressWarnings("unused")
	private static void print(String message) {
		getPrintStream().print(message);
		getPrintStream().flush();
	}

	private static PrintStream getPrintStream() {
		return System.out;
	}

	private static String formatLabel(EObject object) {
		if (object instanceof Node) {
			return formatLabel((Node) object);
		} else if (object instanceof Port) {
			return formatLabel((Port) object);
		} else {
			return object.toString();
		}
	}

	private static String formatLabel(Node node) {
		return node.getLabel();
	}

	private static String formatLabel(Port port) {
		String out = "";
		if (port instanceof Input) {
			out += "Input ";
		} else if (port instanceof Output) {
			out += "Output ";
		}
		out += '"' + port.getName() + '"';
		return out;
	}
}
