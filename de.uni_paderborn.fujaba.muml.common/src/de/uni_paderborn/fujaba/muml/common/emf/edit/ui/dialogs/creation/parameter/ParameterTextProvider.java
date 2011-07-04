package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.parameter;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.ILabelProvider;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.ITextProvider;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property.Range;

/**
 * A text provider, which generates a text for a set of parameters (for example
 * "p1 : EString, p2 : EInt").
 * 
 * @author bingo
 * 
 */
public class ParameterTextProvider implements ITextProvider {
	/**
	 * The LabelProvider to use for a single parameter.
	 */
	private ILabelProvider parameterLabelProvider;

	/**
	 * Constructs this ParameterTextParserAndProvider.
	 * 
	 * @param parameterLabelProvider
	 *            The LabelProvider for one single Parameter.
	 */
	public ParameterTextProvider(ILabelProvider parameterLabelProvider) {
		this.parameterLabelProvider = parameterLabelProvider;
	}

	@Override
	public String getText(List<EObject> objects,
			Map<EObject, Range> returnedTextSelections) {

		String completeText = "";
		boolean first = true;
		for (Object object : objects) {
			EParameter parameter = (EParameter) object;
			String text = parameterLabelProvider.getText(parameter);

			if (!first) {
				completeText += ", ";
			} else {
				first = false;
			}

			returnedTextSelections.put(parameter,
					new Range(completeText.length(), text.length()));

			completeText += text;

		}
		return completeText;
	}
}
