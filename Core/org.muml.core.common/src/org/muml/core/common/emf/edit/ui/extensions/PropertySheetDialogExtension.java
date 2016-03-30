package org.muml.core.common.emf.edit.ui.extensions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.muml.core.common.emf.edit.ui.ExtensibleCreationDialog;

public class PropertySheetDialogExtension extends AbstractDialogExtension {

	/**
	 * The PropertySheetPage.
	 */
	protected PropertySheetPage page;

	protected EObject initialObject;

	private IPropertySourceProvider propertySourceProvider;

	public PropertySheetDialogExtension(
			IPropertySourceProvider propertySourceProvider,
			ExtensibleCreationDialog creationDialog) {
		super(creationDialog);
		this.propertySourceProvider = propertySourceProvider;
	}
	
	public void setInitialObject(EObject initialObject) {
		this.initialObject = initialObject;
	}

	@Override
	public void initialize() {

	}

	@Override
	public void createMainArea(Composite parent) {
		super.createMainArea(parent);
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		// see AdvancedPropertySection.createControls();
		TabbedPropertySheetWidgetFactory factory = new TabbedPropertySheetWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		FormLayout layout = (FormLayout) composite.getLayout(); 
		layout.marginWidth = 3;
		layout.marginHeight = 3;

		composite.setLayout(layout);		
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		
		page = createPropertySheetPage();
		page.setPropertySourceProvider(propertySourceProvider);
		page.createControl(composite);
	
        FormData data = null;
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 0);
		data.bottom = new FormAttachment(100, 0);
		data.height = 200;
		data.width = 200;
		page.getControl().setLayoutData(data);
		Tree tree = (Tree) page.getControl();

		setInput(new StructuredSelection(new Object[] { initialObject }));
		
		tree.getColumn(0).setWidth(200);
		tree.getColumn(1).setWidth(40);
	}

	protected PropertySheetPage createPropertySheetPage() {
		// By default we create a normal PropertySheetPage; can be overriden to support own implementations.
		return new PropertySheetPage();
	}

	public void setInput(ISelection selection) {
		if (page != null && !page.getControl().isDisposed()) {
			page.selectionChanged(null, selection);
			getCreationDialog().getShell().layout(
					new Control[] { page.getControl() });
		}
	}

	@Override
	public void close() {

	}

}
