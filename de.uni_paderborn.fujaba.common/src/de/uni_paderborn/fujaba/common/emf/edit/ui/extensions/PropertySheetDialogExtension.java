package de.uni_paderborn.fujaba.common.emf.edit.ui.extensions;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import de.uni_paderborn.fujaba.common.emf.edit.ui.ExtensibleCreationDialog;

public class PropertySheetDialogExtension extends AbstractDialogExtension {

	/**
	 * The PropertySheetPage.
	 */
	protected PropertySheetPage page;

	private IPropertySourceProvider propertySourceProvider;

	public PropertySheetDialogExtension(
			IPropertySourceProvider propertySourceProvider,
			ExtensibleCreationDialog creationDialog) {
		super(creationDialog);
		this.propertySourceProvider = propertySourceProvider;

	}

	@Override
	public void initialize() {

	}

	@Override
	public void createMainArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout gridLayout = new GridLayout(1, true);
		gridLayout.verticalSpacing = 0;
		gridLayout.horizontalSpacing = 0;
		gridLayout.marginTop = 0;
		gridLayout.marginLeft = 0;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		composite.setLayout(gridLayout);

		page = new PropertySheetPage();
		page.setPropertySourceProvider(propertySourceProvider);
		page.createControl(composite);
		page.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	public void setInput(ISelection selection) {
		if (page != null && !page.getControl().isDisposed()) {
			page.selectionChanged(null, selection);
			getCreationDialog().getShell().layout(
					new Control[] { page.getControl() });
		}
	}

	@Override
	public void createButtonArea(Composite composite) {
		// no buttons
	}

	@Override
	public void okPressed() {

	}

}
