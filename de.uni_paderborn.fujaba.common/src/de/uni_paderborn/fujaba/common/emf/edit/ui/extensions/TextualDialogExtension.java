package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.Range;
import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.labelproviders.IMultiLabelProvider;
import de.uni_paderborn.fujaba.common.emf.edit.ui.textual.parsers.IMultiTextParser;

public class TextualDialogExtension extends AbstractDialogExtension {

	private ObjectsListDialogExtension objectsListDialogExtension;

	/**
	 * The areas in the Parameter-Line Textfield that contain certain
	 * Parameters.
	 */
	private Map<Object, Range> textRanges;

	/**
	 * A ModifyListener, which is notified when the Parameter-Line Text was
	 * edited by the user.
	 */
	private ModifyListener txtTextualStringModifyListener;

	/**
	 * A CaretListener, which is notified when the user changes the
	 * Caret-Position in the Parameter-Line Textfield.
	 */
	private CaretListener txtTextualStringCaretListener;

	/**
	 * The textual Parameter-Line Textfield.
	 */
	private StyledText txtTextualString;

	/**
	 * The text parser for the structural feature. It can parse a String to
	 * create new objects.
	 */
	private IMultiTextParser textParser;

	/**
	 * The text provider for the structural feature. It can and provide a text
	 * for a set of existing objects.
	 */
	private IMultiLabelProvider textProvider;

	public TextualDialogExtension(ExtensibleCreationDialog creationDialog,
			IMultiTextParser textParser, IMultiLabelProvider textProvider) {
		super(creationDialog);
		this.textParser = textParser;
		this.textProvider = textProvider;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void createMainArea(Composite parent) {
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		if (this.textProvider != null) {
			Label lblParameters = new Label(parent, SWT.NONE);
			GridData gdLblParameters = new GridData(SWT.LEFT, SWT.CENTER,
					false, false, 1, 1);
			gdLblParameters.verticalIndent = 5;
			lblParameters.setLayoutData(gdLblParameters);
			lblParameters.setText("&Textual representation:");
			new Label(parent, SWT.NONE);

			txtTextualString = new StyledText(parent, SWT.BORDER | SWT.SINGLE);
			txtTextualString.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, false, 1, 1));
			txtTextualString.setEnabled(this.textParser != null);

			new Label(parent, SWT.NONE);
		}

		if (txtTextualString != null) {
			// Create CaretListener for txtTextualString to update
			// list-selection accordingly.
			txtTextualStringCaretListener = new CaretListener() {
				@Override
				public void caretMoved(CaretEvent event) {
					onTextualStringCaretMoved(event.caretOffset);
				}
			};
			txtTextualString.addCaretListener(txtTextualStringCaretListener);

			// Create ModifyListener for txtTextualString to recreate all
			// parameters.
			txtTextualStringModifyListener = new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					textRanges = null;

					String text = txtTextualString.getText();

					Map<Object, Range> newRanges = new HashMap<Object, Range>();
					java.util.List<Range> newErrorRanges = new ArrayList<Range>();
					java.util.List<Object> newObjects = textParser
							.createObjects(text.toCharArray(), newRanges,
									newErrorRanges);

					clearTextStyle(txtTextualString);
					markErrors(txtTextualString, newErrorRanges);

					textRanges = newRanges;
					objectsListDialogExtension.getCurrentListItems().clear();
					objectsListDialogExtension.getCurrentListItems().addAll(
							newObjects);
					objectsListDialogExtension.getTableViewer().refresh();

					onTextualStringCaretMoved(txtTextualString.getCaretOffset());
				}
			};
			txtTextualString.addModifyListener(txtTextualStringModifyListener);
			txtTextualString.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					rebuildTextualString();

					// Make sure, the selection for txtTextualString will be
					// set.
					objectsListDialogExtension.getTableViewer().setSelection(
							objectsListDialogExtension.getTableViewer()
									.getSelection());
				}
			});

			// Initialize Textual String
			rebuildTextualString();
		}
	}

	@Override
	public void createButtonArea(Composite parent) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fills the textual Parameter-Line with the existing parameters and updates
	 * the parameterRanges hash-map to store the new substring-positions.
	 */
	public void rebuildTextualString() {
		if (textProvider != null) {
			textRanges = new HashMap<Object, Range>();

			String text = textProvider.getText(
					objectsListDialogExtension.getCurrentListItems(),
					textRanges);

			setTextualString(text);
		}
	}

	/**
	 * Selects the substring representing the passed parameter.
	 * 
	 * @param selectedObject
	 *            The parameter to select.
	 */
	public void setTextRange(EObject selectedObject) {
		if (txtTextualString != null && textRanges != null) {
			Range textSelection = textRanges.get(selectedObject);
			if (textSelection != null) {
				int start = textSelection.getStart();
				int end = start + textSelection.getLength();
				txtTextualString.setSelection(start, end);
			}
		}
	}

	/**
	 * Sets the text of the Parameter-Line Control without firing notifications,
	 * which are only useful, if the user enters a value.
	 * 
	 * @param textualStringString
	 *            The string to set.
	 */
	private void setTextualString(String textualStringString) {
		if (txtTextualString != null) {
			txtTextualString.removeCaretListener(txtTextualStringCaretListener);
			txtTextualString
					.removeModifyListener(txtTextualStringModifyListener);
			txtTextualString.setText(textualStringString);
			txtTextualString.addModifyListener(txtTextualStringModifyListener);
			txtTextualString.addCaretListener(txtTextualStringCaretListener);
		}
	}

	/**
	 * Clears the TextStyle of the passed StyledText control.
	 * 
	 * @param styledText
	 *            The StyledText Control to clear the style for.
	 */
	private void clearTextStyle(StyledText styledText) {
		StyleRange styleRange = new StyleRange();
		styleRange.start = 0;
		styleRange.length = styledText.getCharCount();
		styledText.setStyleRange(styleRange);
	}

	/**
	 * Updates the Parameter-List selection based on the caret position in the
	 * Parameter-Line Textfield.
	 * 
	 * @param caretOffset
	 *            The new caret offset.
	 */
	protected void onTextualStringCaretMoved(int caretOffset) {
		if (textRanges != null) {
			Object selectedObject = null;
			for (Object object : objectsListDialogExtension
					.getCurrentListItems()) {
				selectedObject = object;
				Range textSelection = textRanges.get(object);
				int start = textSelection.getStart();
				int end = start + textSelection.getLength();
				if (end >= caretOffset) {
					break;
				}
			}
			if (selectedObject != null) {
				ISelection listSelection = new StructuredSelection(
						new Object[] { selectedObject });
				objectsListDialogExtension.setListSelection(listSelection);
			}
		}
	}

	/**
	 * Marks errors in the given StyledText-Control.
	 * 
	 * @param styledText
	 *            The control to mark errors in.
	 * @param errorRanges
	 *            The list of error ranges.
	 */
	protected void markErrors(StyledText styledText,
			java.util.List<Range> errorRanges) {
		for (Range range : errorRanges) {
			StyleRange errorStyle = new StyleRange();
			errorStyle.start = range.getStart();
			errorStyle.length = range.getLength();
			errorStyle.underline = true;
			errorStyle.fontStyle = SWT.BOLD;
			errorStyle.underlineStyle = SWT.UNDERLINE_ERROR;
			styledText.setStyleRange(errorStyle);
		}
	}

	@Override
	public void okPressed() {
		// TODO Auto-generated method stub

	}

	public void setObjectsListDialogExtension(
			ObjectsListDialogExtension objectsListDialogExtension) {
		this.objectsListDialogExtension = objectsListDialogExtension;
	}

}
