package de.uni_paderborn.fujaba.common.emf.edit.ui.property;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import de.uni_paderborn.fujaba.common.emf.edit.ui.validator.IValidationStatus;

/**
 * A PropertyEditor using a TextField to create Strings.
 * 
 * @author bingo
 * 
 */
public class TextPropertyEditor extends AbstractPropertyEditor {

	/**
	 * The StyledText control.
	 */
	protected StyledText styledText;

	/**
	 * The multiLine attribute for the StyledText.
	 */
	protected boolean multiLine;

	/**
	 * The default value for the property.
	 */
	protected String defaultValue = "";

	/**
	 * Constructs this TextPropertyEditor.
	 */
	public TextPropertyEditor() {
	}

	/**
	 * Constructs this TextPropertyEditor.
	 * 
	 * @param multiLine
	 *            The multiLine attribute for the StyledText.
	 */
	public TextPropertyEditor(boolean multiLine) {
		this.multiLine = multiLine;
	}

	/**
	 * Constructs this TextPropertyEditor.
	 * 
	 * @param adapterFactory
	 *            The AdapterFactory to use to create ItemPropertyDescriptors.
	 * @param extendVertically
	 *            <code>true</code>, if the control should extend vertically and
	 *            take more place.
	 * @param multiLine
	 *            The multiLine attribute for the StyledText.
	 */
	public TextPropertyEditor(AdapterFactory adapterFactory,
			boolean extendVertically, boolean multiLine) {
		super(extendVertically);
		this.multiLine = multiLine;
	}

	/**
	 * Creates the StyledText control.
	 * 
	 * @param parent
	 *            the parent control.
	 * @return The ComboBox control.
	 */
	@Override
	protected Control createControl(Composite parent) {
		int style = SWT.BORDER;
		if (multiLine) {
			style |= SWT.MULTI;
		} else {
			style |= SWT.SINGLE;
		}
		styledText = new StyledText(parent, style);
		styledText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				revalidate();
			}

		});

		// Return the control
		return styledText;
	}

	/**
	 * Applies the validation status. We use it to mark errors in the text
	 * field.
	 * 
	 * @param validationStatus
	 *            The validation status to apply.
	 */
	@Override
	protected void applyValidationStatus(IValidationStatus validationStatus) {
		if (validationStatus instanceof TextValidationStatus) {
			List<Range> invalidRanges = ((TextValidationStatus) validationStatus)
					.getInvalidRanges();
			if (invalidRanges != null) {
				for (Range range : invalidRanges) {
					StyleRange errorStyle = new StyleRange();
					errorStyle.start = range.getStart();
					errorStyle.length = range.getLength();
					errorStyle.underline = true;
					errorStyle.fontStyle = SWT.BOLD;
					errorStyle.underlineStyle = SWT.UNDERLINE_ERROR;
					styledText.setStyleRange(errorStyle);
				}
			}
		}
		super.applyValidationStatus(validationStatus);
	}

	/**
	 * Gets the current text in the text field.
	 * 
	 * @return The current text.
	 */
	@Override
	protected Object doGetValue() {
		EClassifier type = property.getFeature().getEType();
		String text = styledText.getText();

		try {
			// TODO: Implement this in a more generic way.
			if (int.class.isAssignableFrom(type.getInstanceClass())) {
				return Integer.parseInt(text);
			} else if (float.class.isAssignableFrom(type.getInstanceClass())) {
				return Float.parseFloat(text);
			} else if (double.class.isAssignableFrom(type.getInstanceClass())) {
				return Double.parseDouble(text);
			}
		} catch (NumberFormatException nfe) {
			return -1;
		}
		// if (type.getInstanceClass())
		return text;
	}

	/**
	 * Sets an empty string as text for the text field.
	 */
	@Override
	public void applyDefaultValue() {
		styledText.setText(defaultValue);
	}

	/**
	 * Sets the default value for this text property editor. It will be used,
	 * when initializing the text control.
	 * 
	 * @param newDefaultValue
	 *            The new default value.
	 */
	public void setDefaultValue(String newDefaultValue) {
		this.defaultValue = newDefaultValue;
	}

	/**
	 * Gets the default value for this text property editor.
	 * 
	 * @return The default value.
	 */
	public String getDefaultValue() {
		return defaultValue;
	}
}
