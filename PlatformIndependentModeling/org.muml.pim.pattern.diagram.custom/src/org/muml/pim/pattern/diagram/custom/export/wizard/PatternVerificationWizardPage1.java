package org.muml.pim.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.muml.core.export.providers.GreyedAdapterFactoryLabelProvider;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.VerifiedConfiguration;


public class PatternVerificationWizardPage1 extends
		AbstractPatternVerificationWizardPage {

	

	

	public PatternVerificationWizardPage1(String pageName, String pageTitle, String pageDescription,
			AbstractCoordinationPattern pattern, FormToolkit toolkit) {
		super(pageName, pageTitle, pageDescription, pattern, toolkit);
		// TODO Auto-generated constructor stub
	}




	CheckboxTreeViewer treeViewer;
	
	public VerifiedConfiguration getSelectedVerifiedConfiguration() {
		
		for (Object element : treeViewer.getCheckedElements()) {
			if (element instanceof VerifiedConfiguration)
				return (VerifiedConfiguration) element;
		}
		return null;
	}
	
	
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT
				| Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Choose Verified Configuration:");

		Composite composite = toolkit.createComposite(section);
		section.setClient(composite);
		composite.setLayout(new GridLayout());

		setControl(section);
		Tree tree = toolkit.createTree(composite, SWT.BORDER | SWT.CHECK);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.minimumHeight = 200;
		tree.setLayoutData(gridData);
		treeViewer = new CheckboxTreeViewer(tree);

		AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) ((PatternVerificationWizard) this
				.getWizard()).getEditingDomain();
		AdapterFactory adapterFactory = editingDomain.getAdapterFactory();

		treeViewer.setContentProvider(new AdapterFactoryContentProvider(
				adapterFactory));
		treeViewer.setLabelProvider(new GreyedAdapterFactoryLabelProvider(
				adapterFactory) {
			@Override
			public boolean isEnabled(Object object) {
				return object instanceof VerifiedConfiguration;
			}
		});

		treeViewer.setSelection(new ISelection() {

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return true;
			}
		});
		treeViewer.setCheckedElements(new Object[] {});
		

		treeViewer.setInput(pattern);
		treeViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				// TODO Auto-generated method stub
				return element instanceof VerifiedConfiguration;
			}
		});
		this.setControl(section);
	}



}
