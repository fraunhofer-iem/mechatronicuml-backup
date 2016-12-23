package org.muml.testlanguage.diagram.custom.sheet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.internal.qvt.oml.common.ui.controls.BrowseInterpretedTransformationDialog;
import org.eclipse.m2m.internal.qvt.oml.common.ui.controls.UniSelectTransformationControl;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformationRegistry;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

@SuppressWarnings("restriction")
public class ChooseTransformationPropertyDescriptor extends PropertyDescriptor {

	public ChooseTransformationPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		return new ExtendedDialogCellEditor(composite, getLabelProvider()) {
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				UniSelectTransformationControl.IResourceFilter resourceFilter = new UniSelectTransformationControl.IResourceFilter() {
					public boolean accept(IResource resource) {
						return resource instanceof IFile
								&& MDAConstants.QVTO_FILE_EXTENSION
										.equalsIgnoreCase(resource
												.getFileExtension());
					}
				};

				UniSelectTransformationControl.ISelectionListener selectionListener = new UniSelectTransformationControl.ISelectionListener() {
					public IStatus selectionChanged(URI selectedUri) {
						return Status.OK_STATUS;
					}

					@Override
					public boolean accept(URI uri) {
						// TODO Auto-generated method stub
						return true;
					}

					@Override
					public TreeAction getTreeAction(URI uri) {
						// TODO Auto-generated method stub
						return null;
					}
				};

				BrowseInterpretedTransformationDialog dialog = new BrowseInterpretedTransformationDialog(
						Display.getDefault().getActiveShell(), resourceFilter,
						QvtTransformationRegistry.getInstance(), null,
						selectionListener);
				dialog.create();
				dialog.open();
				{
					URI selectedUri = dialog.getSelectedUri();
					System.out.println(selectedUri);
					if (selectedUri != null) {
						return selectedUri.toString();
					}
				}
				return null;
			}
		};
	}

}
