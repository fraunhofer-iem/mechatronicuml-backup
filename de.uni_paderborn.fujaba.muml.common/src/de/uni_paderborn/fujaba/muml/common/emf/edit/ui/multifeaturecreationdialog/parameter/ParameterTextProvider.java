package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.multifeaturecreationdialog.parameter;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.ILabelProvider;

import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.multifeaturecreationdialog.ITextProvider;
import de.uni_paderborn.fujaba.muml.common.emf.edit.ui.multifeaturecreationdialog.Range;

/**
 * 
 * 
 * @author bingo
 * 
 */
public class ParameterTextProvider implements ITextProvider {
	/**
	 * 
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
