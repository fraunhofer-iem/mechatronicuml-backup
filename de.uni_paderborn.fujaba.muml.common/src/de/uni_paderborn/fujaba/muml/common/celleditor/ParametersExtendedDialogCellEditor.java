package de.uni_paderborn.fujaba.muml.common.celleditor;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;



public class ParametersExtendedDialogCellEditor extends
		ExtendedDialogCellEditor {

	private EObject object;
	private EStructuralFeature structuralFeature;
	private List<EClassifier> typeClassifiers;

	public ParametersExtendedDialogCellEditor(Composite composite,
			ILabelProvider labelProvider, EObject object,
			EStructuralFeature structuralFeature, List<EClassifier> typeClassifiers) {
		super(composite, labelProvider);
		this.object = object;
		this.structuralFeature = structuralFeature;
		this.typeClassifiers = typeClassifiers;
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		// Dialog creation
		ParameterListSelectionDialog dialog = new ParameterListSelectionDialog(
				PlatformUI.getWorkbench().getDisplay().getActiveShell(),
				labelProvider, object, structuralFeature, typeClassifiers);

		// Open the dialog and retrieve the user selection
		int result = dialog.open();
		labelProvider.dispose();
		return result == Window.OK ? dialog.getResult() : null;
	}

}
