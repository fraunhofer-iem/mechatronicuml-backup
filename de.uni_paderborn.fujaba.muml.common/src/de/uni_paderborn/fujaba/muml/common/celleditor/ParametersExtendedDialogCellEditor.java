package de.uni_paderborn.fujaba.muml.common.celleditor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class ParametersExtendedDialogCellEditor extends
		ExtendedDialogCellEditor {

	private EObject object;
	private EStructuralFeature structuralFeature;

	public ParametersExtendedDialogCellEditor(Composite composite,
			ILabelProvider labelProvider, EObject object, EStructuralFeature structuralFeature) {
		super(composite, labelProvider);
		this.object = object;
		this.structuralFeature = structuralFeature;
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		// Dialog creation
		ParameterElementListSelectionDialog dialog = new ParameterElementListSelectionDialog(
				PlatformUI.getWorkbench().getDisplay().getActiveShell(),
				labelProvider, object, structuralFeature, "MOIN");
		// dialog.setElements(new Object[] {});
		// dialog.setInitialSelections(existingParameters);
		// dialog.setTitle("Available friends list");
		// dialog.setMessage("Select the friends of 'Ingo'");
		// dialog.setMultipleSelection(many);

		// Open the dialog and retrieve the user selection
		int result = dialog.open();
		labelProvider.dispose();
		return result == Window.OK ? Arrays.asList(dialog.getResult()) : null;
	}

	class ParameterElementListSelectionDialog extends Dialog {

		protected ILabelProvider labelProvider;
		protected IContentProvider contentProvider;
		protected Object object;
		protected EClassifier eClassifier;
		protected String displayName;
		protected ItemProvider values;
		protected List<?> choiceOfValues;
		protected EList<?> result;

		protected boolean multiLine;
		protected boolean unique;

		/**
		 * @since 2.6
		 */
		public ParameterElementListSelectionDialog(Shell parent, ILabelProvider labelProvider,
				Object object, EClassifier eClassifier, List<?> currentValues,
				String displayName, boolean multiLine,
				boolean sortChoices, boolean unique) {
			super(parent);
			setShellStyle(getShellStyle() | SWT.RESIZE | SWT.MAX);
			this.labelProvider = labelProvider;
			this.object = object;
			this.eClassifier = eClassifier;
			this.displayName = displayName;
			this.multiLine = multiLine;
			this.unique = unique;

			AdapterFactory adapterFactory = new ComposedAdapterFactory(
					Collections.<AdapterFactory> emptyList());
			values = new ItemProvider(adapterFactory, currentValues);
			contentProvider = new AdapterFactoryContentProvider(adapterFactory);
			if (sortChoices && choiceOfValues != null) {
				this.choiceOfValues = new ArrayList<Object>(choiceOfValues);
				ExtendedComboBoxCellEditor.createItems(this.choiceOfValues,
						labelProvider, true);
			}
		}

		public ParameterElementListSelectionDialog(Shell parent, ILabelProvider labelProvider,
				EObject eObject, EStructuralFeature eStructuralFeature,
				String displayName) {
			this(parent, labelProvider, eObject, eStructuralFeature.getEType(),
					(List<?>) eObject.eGet(eStructuralFeature), displayName,
					false, false, eStructuralFeature.isUnique());
		}

		@Override
		protected void configureShell(Shell shell) {
			super.configureShell(shell);
			shell.setText(EMFEditUIPlugin.INSTANCE.getString(
					"_UI_FeatureEditorDialog_title", new Object[] {
							displayName, labelProvider.getText(object) }));
			shell.setImage(labelProvider.getImage(object));
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite contents = (Composite) super.createDialogArea(parent);

			return contents;
		}

		@Override
		protected void okPressed() {
			result = new BasicEList<Object>(values.getChildren());
			super.okPressed();
		}

		@Override
		public boolean close() {
			contentProvider.dispose();
			return super.close();
		}

		public EList<?> getResult() {
			return result;
		}
	}

}
