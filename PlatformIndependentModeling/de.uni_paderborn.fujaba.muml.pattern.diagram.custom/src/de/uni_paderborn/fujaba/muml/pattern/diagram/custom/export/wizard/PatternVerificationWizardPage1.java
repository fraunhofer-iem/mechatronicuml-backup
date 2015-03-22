package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
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

import de.uni_paderborn.fujaba.export.providers.GreyedAdapterFactoryLabelProvider;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration;

public class PatternVerificationWizardPage1 extends
		AbstractPatternVerificationWizardPage {

	public PatternVerificationWizardPage1(String pageName, String pageTitle,
			String pageDescription, CoordinationPattern pattern,
			FormToolkit toolkit,ICheckStateListener treeViewerListener) {
		super(pageName, pageTitle, pageDescription, pattern, toolkit);
		// TODO Auto-generated constructor stub
		this.treeViewerListener = treeViewerListener;
	}

	

	CheckboxTreeViewer treeViewer;
	ICheckStateListener treeViewerListener;

	
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT
				| Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Choose Legal Configuration:");

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
				return object instanceof LegalConfiguration;
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
		treeViewer.addCheckStateListener(treeViewerListener);

		treeViewer.setInput(pattern);
		treeViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				// TODO Auto-generated method stub
				return element instanceof LegalConfiguration;
			}
		});
		this.setControl(section);
	}

}
