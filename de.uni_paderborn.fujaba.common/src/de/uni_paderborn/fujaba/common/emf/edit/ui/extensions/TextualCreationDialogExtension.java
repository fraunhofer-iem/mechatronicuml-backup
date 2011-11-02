package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
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
import org.eclipse.swt.widgets.List;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;
import de.uni_paderborn.fujaba.common.emf.edit.ui.labelproviders.IMultiLabelProvider;
import de.uni_paderborn.fujaba.common.emf.edit.ui.parsers.IMultiTextParser;
import de.uni_paderborn.fujaba.common.emf.edit.ui.property.Range;

public class TextualCreationDialogExtension extends
		AbstractCreationDialogExtension {
	
	private ObjectsListCreationDialogExtension objectsListCreationDialogExtension;

	/**
	 * The areas in the Parameter-Line Textfield that contain certain
	 * Parameters.
	 */
	private Map<Object, Range> textRanges;
	
	/**
	 * A SelectionChangedListener, which is notified about selection changes in
	 * the Parameter List and updates the Parameter-Line Textfield selection
	 * accordingly.
	 */
	private ISelectionChangedListener objectsSelectionToRangeListener;

	/**
	 * A SelectionChangedListener, which is notified about selection changes in
	 * the Parameter List and updates the enable-status of the Buttons "Up",
	 * "Down" and "Modify" accordingly.
	 */
	private ISelectionChangedListener parameterSelectionToButtonEnablementListener;

	
	/**
	 * A ModifyListener, which is notified when the Parameter-Line Text was
	 * edited by the user.
	 */
	private ModifyListener txtParameterLineModifyListener;

	/**
	 * A CaretListener, which is notified when the user changes the
	 * Caret-Position in the Parameter-Line Textfield.
	 */
	private CaretListener txtParameterLineCaretListener;

	/**
	 * The textual Parameter-Line Textfield.
	 */
	private StyledText txtParameterLine;

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

	public TextualCreationDialogExtension(
			ExtensibleCreationDialog creationDialog,
			IMultiTextParser textParser, IMultiLabelProvider textProvider) {
		super(creationDialog);
		this.textParser = textParser;
		this.textProvider = textProvider;
	}

	public void setObjectsListCreationDialogExtension(ObjectsListCreationDialogExtension objectsListCreationDialogExtension) {
		this.objectsListCreationDialogExtension = objectsListCreationDialogExtension;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void createMainArea(Composite parent) {
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,
				1, 1));
		if (this.textProvider != null) {
			Label lblParameters = new Label(parent, SWT.NONE);
			GridData gdLblParameters = new GridData(SWT.LEFT, SWT.CENTER,
					false, false, 1, 1);
			gdLblParameters.verticalIndent = 5;
			lblParameters.setLayoutData(gdLblParameters);
			lblParameters.setText("&Textual representation:");
			new Label(parent, SWT.NONE);

			txtParameterLine = new StyledText(parent, SWT.BORDER | SWT.SINGLE);
			txtParameterLine.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, false, 1, 1));
			txtParameterLine.setEnabled(this.textParser != null);

			new Label(parent, SWT.NONE);
		}
		
		if (txtParameterLine != null) {
			// Create CaretListener for txtParameterLine to update
			// Parameter-List
			// selection accordingly.
			txtParameterLineCaretListener = new CaretListener() {
				@Override
				public void caretMoved(CaretEvent event) {
					onParameterLineCaretMoved(event.caretOffset);
				}
			};
			txtParameterLine.addCaretListener(txtParameterLineCaretListener);

			// Create ModifyListener for txtParameterLine to recreate all
			// parameters.
			txtParameterLineModifyListener = new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					textRanges = null;

					String text = txtParameterLine.getText();

					Map<Object, Range> newRanges = new HashMap<Object, Range>();
					java.util.List<Range> newErrorRanges = new ArrayList<Range>();
					java.util.List<Object> newObjects = textParser.createObjects(
							text.toCharArray(), newRanges, newErrorRanges);

					clearTextStyle(txtParameterLine);
					markErrors(txtParameterLine, newErrorRanges);

					textRanges = newRanges;
					objectsListCreationDialogExtension.getCurrentListItems().clear();
					objectsListCreationDialogExtension.getCurrentListItems().addAll(newObjects);
					objectsListCreationDialogExtension.getTableViewer().refresh();

					onParameterLineCaretMoved(txtParameterLine.getCaretOffset());
				}
			};
			txtParameterLine.addModifyListener(txtParameterLineModifyListener);
			txtParameterLine.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					rebuildTextualParameterLine();

					// Make sure, the selection for txtParameterLine will be
					// set.
					objectsListCreationDialogExtension.getTableViewer().setSelection(objectsListCreationDialogExtension.getTableViewer()
							.getSelection());
				}
			});

			// Initialize Textual Parameter Line
			rebuildTextualParameterLine();
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
	public void rebuildTextualParameterLine() {
		if (textProvider != null) {
			textRanges = new HashMap<Object, Range>();

			String text = textProvider
					.getText(objectsListCreationDialogExtension.getCurrentListItems(), textRanges);

			setParameterLine(text);
		}
	}
	

	/**
	 * Selects the substring representing the passed parameter.
	 * 
	 * @param selectedObject
	 *            The parameter to select.
	 */
	public void setTextRange(EObject selectedObject) {
		if (txtParameterLine != null && textRanges != null) {
			Range textSelection = textRanges.get(selectedObject);
			if (textSelection != null) {
				int start = textSelection.getStart();
				int end = start + textSelection.getLength();
				txtParameterLine.setSelection(start, end);
			}
		}
	}

	/**
	 * Sets the text of the Parameter-Line Control without firing notifications,
	 * which are only useful, if the user enters a value.
	 * 
	 * @param parameterLineString
	 *            The string to set.
	 */
	private void setParameterLine(String parameterLineString) {
		if (txtParameterLine != null) {
			txtParameterLine.removeCaretListener(txtParameterLineCaretListener);
			txtParameterLine
					.removeModifyListener(txtParameterLineModifyListener);
			txtParameterLine.setText(parameterLineString);
			txtParameterLine.addModifyListener(txtParameterLineModifyListener);
			txtParameterLine.addCaretListener(txtParameterLineCaretListener);
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
	protected void onParameterLineCaretMoved(int caretOffset) {
		if (textRanges != null) {
			Object selectedObject = null;
			for (Object object : objectsListCreationDialogExtension.getCurrentListItems()) {
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
				objectsListCreationDialogExtension.setListSelection(listSelection);
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
	protected void markErrors(StyledText styledText, java.util.List<Range> errorRanges) {
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

}
