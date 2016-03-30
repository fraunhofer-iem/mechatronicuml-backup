package org.muml.core.common.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

public class MumlValidator extends EObjectValidator {
	
	public static final int MAXIMUM_LINE_LENGTH = 80;
	
	public static final String META_TAG = "@";
	
	protected void reportConstraintDelegateViolation(EClass eClass,
			EObject eObject, DiagnosticChain diagnostics,
			Map<Object, Object> context, String constraint, int severity,
			String source, int code) {

		// Try to create message by using the comment in the OCL.
		String ocl = getOCL(eClass, constraint);

		// To test the warning behavior:
		//ocl = "-- @warning\n" + ocl;

		String[] metainfos = getMetainfos(ocl);
		String message = getErrorMessage(ocl);
		
		// If we have no message, create one by using the constraint name.
		if (message.length() == 0) {
			StringBuilder builder = new StringBuilder();
			String lowerCaseName = constraint.toLowerCase();
			for (int i = 0; i < lowerCaseName.length(); i++) {
				if (constraint.charAt(i) != lowerCaseName.charAt(i)) {
					builder.append(' ');
				}
				builder.append(constraint.charAt(i));
			}
			message = builder.toString();
		}
		
		// MUML #1322: If message text gets too long, add manual line break.
		StringBuffer buffer = new StringBuffer();
		int lastSpace = -1;
		int l = 0;
		int newlines = 0;
		for (int p = 0; p < message.length(); p++) {
			char c = message.charAt(p);
			if (l > MAXIMUM_LINE_LENGTH) {
				if (lastSpace == -1) {
					buffer.append('\n');
				} else {
					buffer.insert(lastSpace + 1, '\n');
				}
				lastSpace = -1;
				newlines++;
				l = 0;
			}
			if (c == ' ') {
				lastSpace = p + newlines;
			} else if (c == '\n') {
				l = 0;
				lastSpace = -1;
			} else {
				l++;
			}
			
			buffer.append(c);
		}
		message = buffer.toString();
		
		for (String metainfo : metainfos) {
			if (metainfo.toLowerCase().equals("warning")) {
				severity = Diagnostic.WARNING;
			}
		}

		diagnostics.add(new BasicDiagnostic(severity, source, code,
				message.trim(), new Object[] { eObject }));
		
//		super.reportConstraintDelegateViolation(eClass, eObject, diagnostics,
//				context, constraint, severity, source, code);
	}

	/**
	 * Finds the error message that is provided as comment in the ocl code.
	 * @param ocl The ocl code.
	 * @return The error message, or an empty string; never null.
	 */
	public static String getErrorMessage(String ocl) {
		String message = "";

		if (ocl != null) {
			ocl = ocl.trim();

			StringBuilder builder = new StringBuilder();
			for (String line : ocl.split("\n")) {
				line = line.trim();
				if (line.startsWith("--")) {
					line = line.substring(2).trim();
					if (line.length() > 0) {
						if (getMetainfo(line) != null) {
							continue;
						}
						builder.append(line);
						builder.append('\n');
					}
				}
				break;
			}
			message = builder.toString();
		}
		return message;
	}
	
	protected String[] getMetainfos(String ocl) {
		List<String> metainfos = new ArrayList<String>();

		if (ocl != null) {
			ocl = ocl.trim();

			for (String line : ocl.split("\n")) {
				line = line.trim();
				if (line.startsWith("--")) {
					line = line.substring(2).trim();
					String metainfo = getMetainfo(line);
					if (line.length() > 0 && metainfo != null) {
						metainfos.add(metainfo);
					}
				}
			}
		}
		return metainfos.toArray(new String[] {});
	}

	protected static String getMetainfo(String line) {
		if (line.startsWith(META_TAG)) {
			return line.substring(META_TAG.length()).trim();
		}
		return null;
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
