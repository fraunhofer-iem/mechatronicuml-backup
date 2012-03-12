package de.uni_paderborn.fujaba.muml.utilities.ui.pages;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.fujaba.newwizard.diagrams.IDiagramElementValidator;
import de.fujaba.newwizard.diagrams.pages.DiagramContentsSelectionPage;
import de.uni_paderborn.fujaba.muml.utilities.ui.HierarchyCheckedTreeViewer;

public class DiagramHierarchyContentsSelectionPage extends
		DiagramContentsSelectionPage {

	protected HierarchyCheckedTreeViewer hierarchyTreeViewer;

	public DiagramHierarchyContentsSelectionPage(String pageId,
			IDiagramElementValidator validator, String modelElementCategoryKey, AdapterFactory adapterFactory) {
		super(pageId, validator, modelElementCategoryKey, adapterFactory);
	}

	@Override
	protected CheckboxTreeViewer createTreeViewer(Composite plate) {
		hierarchyTreeViewer = new HierarchyCheckedTreeViewer(plate, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		return hierarchyTreeViewer;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		Composite plate = (Composite) getControl();
		final Button useHierarchy = new Button(plate, SWT.CHECK);
		useHierarchy.setText("Create diagrams for contained objects");
		useHierarchy.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				hierarchyTreeViewer.setUseHierarchy(useHierarchy.getSelection());
			}
		});
	}
}
