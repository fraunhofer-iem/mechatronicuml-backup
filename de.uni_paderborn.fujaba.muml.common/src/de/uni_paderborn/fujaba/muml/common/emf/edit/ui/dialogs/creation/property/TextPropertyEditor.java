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


public class TextPropertyEditor extends AbstractPropertyEditor {

	protected StyledText styledText;

	public TextPropertyEditor(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public TextPropertyEditor(AdapterFactory adapterFactory, boolean extendVertically) {
		super(adapterFactory, extendVertically);
	}

	@Override
	protected Control createControl(Composite parent) {
		styledText = new StyledText(parent, SWT.BORDER | SWT.SINGLE);
		styledText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				revalidate();
			}

		});

		// Return the control
		return styledText;
	}

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
	}

	@Override
	protected Object doGetValue() {
		return styledText.getText();
	}

	@Override
	public void setDefaultValue() {
		styledText.setText("");
	}
}
