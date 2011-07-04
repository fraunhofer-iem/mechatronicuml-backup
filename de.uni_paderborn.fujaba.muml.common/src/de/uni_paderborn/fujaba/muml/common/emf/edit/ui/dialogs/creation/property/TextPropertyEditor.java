package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

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
	 * Constructs this TextPropertyEditor.
	 * 
	 * @param adapterFactory
	 *            The AdapterFactory to use to create ItemPropertyDescriptors.
	 */
	public TextPropertyEditor(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * Constructs this TextPropertyEditor.
	 * 
	 * @param adapterFactory
	 *            The AdapterFactory to use to create ItemPropertyDescriptors.
	 * 
	 * @param multiLine
	 *            The multiLine attribute for the StyledText.
	 */
	public TextPropertyEditor(AdapterFactory adapterFactory, boolean multiLine) {
		super(adapterFactory);
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
		super(adapterFactory, extendVertically);
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
		return styledText.getText();
	}

	/**
	 * Sets an empty string as text for the text field.
	 */
	@Override
	public void setDefaultValue() {
		styledText.setText("");
	}
}
