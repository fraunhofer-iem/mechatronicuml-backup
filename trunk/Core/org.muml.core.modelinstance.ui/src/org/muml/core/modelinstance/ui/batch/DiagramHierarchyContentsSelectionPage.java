package org.muml.core.modelinstance.ui.batch;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.muml.core.modelinstance.ui.diagrams.IDiagramElementValidator;
import org.muml.core.modelinstance.ui.diagrams.pages.DiagramContentsSelectionPage;

public class DiagramHierarchyContentsSelectionPage extends
		DiagramContentsSelectionPage {

	protected HierarchyCheckedTreeViewer hierarchyTreeViewer;
	
	protected boolean overwriteDiagrams;

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
		Group group = new Group(plate, SWT.BORDER);
		group.setText("Options");
		group.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		group.setLayout(new GridLayout(1, true));

		{
			final Button useHierarchyButton = new Button(group, SWT.CHECK);
			useHierarchyButton.setText("&Create diagrams for contained objects");
			useHierarchyButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					hierarchyTreeViewer.setUseHierarchy(useHierarchyButton.getSelection());
				}
			});
		}
		
		{
			final Button overwriteDiagramsButton = new Button(group, SWT.CHECK);
			overwriteDiagramsButton.setText("&Overwrite existing diagrams");
			overwriteDiagramsButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					DiagramHierarchyContentsSelectionPage.this.overwriteDiagrams = overwriteDiagramsButton.getSelection();
				}
			});
		}
	}
	
	public boolean isOverwriteDiagrams() {
		return overwriteDiagrams;
	}
}
