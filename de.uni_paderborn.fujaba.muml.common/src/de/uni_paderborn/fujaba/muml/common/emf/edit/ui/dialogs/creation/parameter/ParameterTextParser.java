package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.parameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.ITextParser;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.IValidator;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.Range;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.TextValidationStatus;

/**
 * 
 * @author bingo
 * 
 */
public class ParameterTextParser implements ITextParser {
	private List<EClassifier> typeChoices;
	private IValidator nameValidator;

	public ParameterTextParser(List<EClassifier> typeChoices,
			IValidator nameValidator) {
		this.typeChoices = typeChoices;
		this.nameValidator = nameValidator;
	}

	@Override
	public List<EObject> createObjects(String text,
			Map<EObject, Range> returnedSelectionRanges,
			List<Range> returnedErrorRanges) {
		List<EObject> returnedParameters = new ArrayList<EObject>();
		int pos = 0;
		for (String s : text.split(",")) {
			if (!s.isEmpty()) {
				String[] parts = s.split("\\:");
				int leadingWhitespacesName = s.length()
						- s.concat("A").trim().length() + 1;
				int startName = pos + leadingWhitespacesName;

				EClassifier type = null;
				if (parts.length > 1) {
					int leadingWhitespacesType = parts[1].length()
							- parts[1].concat("A").trim().length() + 1;
					int startType = pos + parts[0].length()
							+ leadingWhitespacesType + 1; // Add one for the
															// colon
					type = getTypeClassifierByName(parts[1].trim(), true);
					if (type == null && !parts[1].trim().isEmpty()) {
						if (returnedErrorRanges != null) {
							returnedErrorRanges.add(new Range(startType,
									parts[1].trim().length()));
						}
					}
				}

				TextValidationStatus validationStatus = (TextValidationStatus) nameValidator
						.validate(parts[0].trim());

				if (validationStatus != null && validationStatus.getInvalidRanges() != null) {
					returnedErrorRanges.addAll(validationStatus.getInvalidRanges());
				} else {
					EParameter parameter = EcoreFactory.eINSTANCE
							.createEParameter();
					configureParameter(parameter, parts[0].trim(), type);
					returnedParameters.add(parameter);

					Range selectionRange = new Range(pos, s.length());
					if (returnedSelectionRanges != null) {
						returnedSelectionRanges.put(parameter, selectionRange);
					}
				}
			}
			pos += s.length() + 1; // Add one for the comma-delimiter.
		}
		return returnedParameters;
	}

	/**
	 * Returns the Classifier for the parameter type entered in the passed
	 * StyledText between positions "start" and "end". Additionally it marks an
	 * unrecognized type as syntax error.
	 * 
	 * @param styledText
	 *            The StyledText control to parse and validate.
	 * @param start
	 *            The beginning index of the substring to handle.
	 * @param end
	 *            The ending index of the substring to handle.
	 * @return The classifier for the parameter type, or <code>null</code> if
	 *         none was found.
	 */
	// private EClassifier getValidatedParameterType(String strType, int start,
	// int end) {
	// String strType = styledText.getText().substring(start, end);
	//
	// // Find the Classifier ignoring uppercase/lowercase.
	// EClassifier type = getTypeClassifierByName(strType, true);
	//
	// // Allow entering no Classifier, when only whitespaces are entered.
	// if (type == null && !strType.trim().isEmpty()) {
	// StyleRange errorStyle = new StyleRange();
	// errorStyle.start = start;
	// errorStyle.length = end - start;
	// errorStyle.underline = true;
	// errorStyle.fontStyle = SWT.BOLD;
	// errorStyle.underlineStyle = SWT.UNDERLINE_ERROR;
	// styledText.setStyleRange(errorStyle);
	// }
	// return type;
	// }

	/**
	 * Finds the parameter type Classifier using the passed name.
	 * 
	 * @param name
	 *            The name of the Classifier to find.
	 * @param ignoreCase
	 *            Specifies, if the search should ignore upper-case /
	 *            lower-case.
	 * @return The Classifier, or <code>null</code> if none was found.
	 */
	protected EClassifier getTypeClassifierByName(String name,
			boolean ignoreCase) {
		for (EClassifier typeChoice : typeChoices) {
			String text = typeChoice.getName();
			if (text != null) {
				if (ignoreCase && text.equalsIgnoreCase(name)
						|| text.equals(name)) {
					return typeChoice;
				}
			}
		}
		return null;
	}

	/**
	 * Initializes the parameter using the passed values and default values.
	 * 
	 * @param parameter
	 *            The parameter to set features for.
	 * @param name
	 *            The name to set.
	 * @param type
	 *            The EType to set.
	 */
	private void configureParameter(EParameter parameter, String name,
			EClassifier type) {
		parameter.setName(name);
		parameter.setLowerBound(1);
		parameter.setUpperBound(1);
		parameter.setUnique(true);
		parameter.setOrdered(true);
		parameter.setEType(type);
	}

}
