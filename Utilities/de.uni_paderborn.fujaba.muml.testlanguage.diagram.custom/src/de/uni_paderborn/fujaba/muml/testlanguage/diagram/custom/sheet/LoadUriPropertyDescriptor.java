package de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.sheet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ui.choosers.ChooserDialogAdapter;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ui.choosers.ResourceSourceChooser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

@SuppressWarnings("restriction")
public class LoadUriPropertyDescriptor extends PropertyDescriptor {

	public LoadUriPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		return new ExtendedDialogCellEditor(composite, getLabelProvider()) {
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {

				// TODO Make sure it is okay to use the internal chooser.
				ResourceSourceChooser chooser = new ResourceSourceChooser(true,
						null);

				try {
					EAttribute feature = (EAttribute) LoadUriPropertyDescriptor.this.itemPropertyDescriptor
							.getFeature(LoadUriPropertyDescriptor.this.object);
					EObject obj = (EObject) LoadUriPropertyDescriptor.this.object;
					if (obj.eGet(feature) != null) {
						chooser.setInitialSelection(obj.eGet(feature)
								.toString());
					}
				} catch (Exception e) {
					// Getting the original URI did not work. Not that horrible.
					e.printStackTrace();
				}

				ChooserDialogAdapter dialog = new ChooserDialogAdapter(Display
						.getDefault().getActiveShell(), chooser);
				if (dialog.open() == Window.OK) {
					return chooser.getUriString();
				}
				
				return null;
			}
		};
	}

}
