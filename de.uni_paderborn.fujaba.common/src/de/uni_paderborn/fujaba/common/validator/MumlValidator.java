package de.uni_paderborn.fujaba.common.validator;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

public class MumlValidator extends EObjectValidator {
	protected void reportConstraintDelegateViolation(EClass eClass,
			EObject eObject, DiagnosticChain diagnostics,
			Map<Object, Object> context, String constraint, int severity,
			String source, int code) {

		String ocl = getOCL(eClass, constraint);
		if (ocl != null) {
			ocl = ocl.trim();

			StringBuilder builder = new StringBuilder();
			for (String line : ocl.split("\n")) {
				line = line.trim();
				if (line.startsWith("--")) {
					line = line.substring(2).trim();
					if (line.length() > 0) {
						builder.append(line);
						builder.append('\n');
					}
				}
			}
			String message = builder.toString().trim();

			if (message.length() > 0) {
				diagnostics.add(new BasicDiagnostic(severity, source, code,
						message, new Object[] { eObject }));
				return;
			}

		}

		super.reportConstraintDelegateViolation(eClass, eObject, diagnostics,
				context, constraint, severity, source, code);
	}

	private static String getOCL(EClass eClass, String name) {
		if (name == null || eClass == null) {
			return null;
		}
		for (EObject child : eClass.eContents()) {
			if (child instanceof EAnnotation) {
				EAnnotation annotation = (EAnnotation) child;
				String source = (String) child
						.eGet(EcorePackage.Literals.EANNOTATION__SOURCE);
				if ("http://www.eclipse.org/emf/2002/Ecore/OCL".equals(source)) {
					return annotation.getDetails().get(name);
				}
			}
		}
		return null;
	}

}
