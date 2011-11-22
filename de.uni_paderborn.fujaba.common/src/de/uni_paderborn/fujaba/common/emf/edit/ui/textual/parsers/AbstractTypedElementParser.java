package de.uni_paderborn.fujaba.common.emf.edit.ui.textual.parsers;

import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypedElement;

import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.Range;
import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.validator.IValidator;
import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.validator.TextValidationStatus;

/**
 * A text parser, which can create a typed element from a textual representation
 * (for example: "p1 : EString").
 * 
 * @author bingo
 * 
 */
public abstract class AbstractTypedElementParser implements ITextParser {
	/**
	 * The valid types for the typed element.
	 */
	private List<EClassifier> typeChoices;

	/**
	 * The validator for the identifier name.
	 */
	private IValidator nameValidator;

	/**
	 * Constructs this AbstractTypedElementParser.
	 * 
	 * @param typeChoices
	 *            The valid types for the typed element.
	 * @param nameValidator
	 *            The validator for the identifier name.
	 */
	public AbstractTypedElementParser(List<EClassifier> typeChoices,
			IValidator nameValidator) {
		this.typeChoices = typeChoices;
		this.nameValidator = nameValidator;
	}

	/**
	 * Creates a new concrete typed element.
	 * 
	 * @return The created element.
	 */
	protected abstract ETypedElement doCreateObject();

	@Override
	public ETypedElement createObject(char[] text, Range range,
			List<Range> returnedErrorRanges) {
		String string = new String(text, range.getStart(), range.getLength());

		// Split the string at the colon. The first part is the name, the second
		// part it the type.
		String[] parts = string.split("\\:");

		// Assume default bounds of 0..1 for the type
		int[] bounds = new int[] { 0, 1 };

		// Parse the type (parts[1])
		EClassifier type = null;
		if (parts.length > 1) {
			int leadingWhitespacesType = parts[1].length()
					- parts[1].concat("A").trim().length() + 1;

			// Add one for the colon
			int startType = range.getStart() + parts[0].length()
					+ leadingWhitespacesType + 1;

			String typeString = parts[1].trim();
			typeString = parseBounds(typeString, bounds);
			type = getTypeClassifierByName(typeString, true);
			if (type == null && !parts[1].trim().isEmpty()) {
				if (returnedErrorRanges != null) {
					returnedErrorRanges.add(new Range(startType, parts[1]
							.trim().length()));
				}
			}
		}

		// Parse the name (parts[0]).
		TextValidationStatus validationStatus = (TextValidationStatus) nameValidator
				.validate(parts[0].trim());
		if (validationStatus != null
				&& validationStatus.getInvalidRanges() != null) {

			int leadingWhitespacesName = parts[0].length()
					- parts[0].concat("A").trim().length() + 1;

			int rangeOffset = range.getStart() + leadingWhitespacesName;
			for (Range invalidRange : validationStatus.getInvalidRanges()) {
				returnedErrorRanges.add(invalidRange.getMoved(rangeOffset));
			}
		} else {
			ETypedElement typedElement = doCreateObject();
			typedElement.setName(parts[0].trim());
			typedElement.setEType(type);
			typedElement.setLowerBound(bounds[0]);
			typedElement.setUpperBound(bounds[1]);
			typedElement.setOrdered(true);
			// typedElement.setUnique(true);
			return typedElement;
		}
		return null;
	}

	/**
	 * Convenience method to cut the bounds from the type and parse the bounds.
	 * 
	 * @param typeString
	 *            The type including bounds, e.g. EString[4].
	 * @param returnedBounds
	 *            An int[2] array to put the bounds into.
	 * @return The type excluding bounds, e.g. EString.
	 */
	private String parseBounds(String typeString, int[] returnedBounds) {

		int openingBracket = typeString.indexOf('[');
		int closingBracket = typeString.indexOf(']', openingBracket);
		if (openingBracket != -1 && closingBracket != -1
				&& closingBracket - openingBracket > 1
				&& closingBracket == typeString.length() - 1) {
			String cardinality = typeString.substring(openingBracket + 1,
					closingBracket);

			// Commented out the following. It was necessary for a syntax like
			// EInt[1..2], which is not desired currently.

			// int dots = cardinality.indexOf("..");
			// if (dots != -1) {
			// bounds[0] = parseCardinality(cardinality.substring(0, dots));
			//
			// bounds[1] = parseCardinality(cardinality.substring(dots + 2,
			// cardinality.length()));
			// } else {
			// bounds[0] = bounds[1] = parseCardinality(cardinality);
			// }
			returnedBounds[1] = parseCardinality(cardinality);
			return typeString.substring(0, openingBracket);
		}
		return typeString;
	}

	/**
	 * Returns the Integer representation of the given cardinality.
	 * 
	 * @param string
	 *            The cardinality to parse.
	 * @return The integer representation.
	 */
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

}
