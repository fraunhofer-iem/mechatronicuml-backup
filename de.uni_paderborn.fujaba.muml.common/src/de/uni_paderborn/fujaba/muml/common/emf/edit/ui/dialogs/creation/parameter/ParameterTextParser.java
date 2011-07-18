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
 * A text parser, which can create Parameters from a textual representation
 * describing multiple parameters (for example: "p1 : EString, p2 : EInt").
 * 
 * @author bingo
 * 
 */
public class ParameterTextParser implements ITextParser {
	/**
	 * The valid types for parameters.
	 */
	private List<EClassifier> typeChoices;

	/**
	 * The validator for the Parameter name.
	 */
	private IValidator nameValidator;

	/**
	 * Constructs this ParameterTextParser.
	 * 
	 * @param typeChoices
	 *            The valid types for parameters.
	 * @param nameValidator
	 *            The validator for the Parameter name.F
	 */
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
				EClassifier type = null;
				int bounds[] = new int[] { 1, 1 };
				if (parts.length > 1) {
					int leadingWhitespacesType = parts[1].length()
							- parts[1].concat("A").trim().length() + 1;
					int startType = pos + parts[0].length()
							+ leadingWhitespacesType + 1; // Add one for the
															// colon

					String typeString = parts[1].trim();

					typeString = parseParameterType(typeString, bounds);

					type = getTypeClassifierByName(typeString, true);
					if (type == null && !parts[1].trim().isEmpty()) {
						if (returnedErrorRanges != null) {
							returnedErrorRanges.add(new Range(startType,
									parts[1].trim().length()));
						}
					}
				}

				TextValidationStatus validationStatus = (TextValidationStatus) nameValidator
						.validate(parts[0].trim());

				if (validationStatus != null
						&& validationStatus.getInvalidRanges() != null) {
					returnedErrorRanges.addAll(validationStatus
							.getInvalidRanges());
				} else {
					EParameter parameter = EcoreFactory.eINSTANCE
							.createEParameter();
					configureParameter(parameter, parts[0].trim(), type,
							bounds[0], bounds[1]);
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

	private String parseParameterType(String typeString, int bounds[]) {

		int openingBracket = typeString.indexOf('[');
		int closingBracket = typeString.indexOf(']', openingBracket);
		if (openingBracket != -1 && closingBracket != -1
				&& closingBracket - openingBracket > 1) {

			String cardinality = typeString.substring(openingBracket + 1,
					closingBracket);

			int dots = cardinality.indexOf("..");
			if (dots != -1) {
				bounds[0] = parseCardinality(cardinality.substring(0, dots));

				bounds[1] = parseCardinality(cardinality.substring(dots + 2,
						cardinality.length()));
			} else {
				bounds[0] = bounds[1] = parseCardinality(cardinality);
			}
			return typeString.substring(0, openingBracket);
		}
		return typeString;
	}

	private int parseCardinality(String string) {
		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

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
	 * @param cardinality
	 * @param upperBound
	 */
	private void configureParameter(EParameter parameter, String name,
			EClassifier type, int lowerBound, int upperBound) {
		parameter.setName(name);
		parameter.setLowerBound(lowerBound);
		parameter.setUpperBound(upperBound);
		// parameter.setUnique(true);
		parameter.setOrdered(true);
		parameter.setEType(type);
	}

}
