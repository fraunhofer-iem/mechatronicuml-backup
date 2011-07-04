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

				if (validationStatus != null
						&& validationStatus.getInvalidRanges() != null) {
					returnedErrorRanges.addAll(validationStatus
							.getInvalidRanges());
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
//		parameter.setLowerBound(1);
//		parameter.setUpperBound(1);
//		parameter.setUnique(true);
//		parameter.setOrdered(true);
		parameter.setEType(type);
	}

}
