package org.muml.pim.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.dialogs.WizardDataTransferPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.muml.core.export.pages.IActivatableWizardPage;
import org.muml.core.export.providers.GreyedAdapterFactoryLabelProvider;
import org.muml.core.export.providers.NullContentProvider;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.behavior.Variable;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;

public class ProtocolToPatternExportWizardPage2 extends WizardDataTransferPage implements IActivatableWizardPage {

	CheckboxTreeViewer treeViewer;
	FormToolkit toolkit;
	Resource currentResource;
	ProtocolToPatternExportWizardPage1 page1;

	protected ProtocolToPatternExportWizardPage2(String pageName, FormToolkit toolkit,
			ProtocolToPatternExportWizardPage1 page1) {
		super(pageName);
		this.toolkit = toolkit;
		// TODO Auto-generated constructor stub
		setTitle("Variable Selection");
		setDescription(
				"Select the variables that should become parameters of the generated CoordinationPattern. This step is optional.");
		this.page1 = page1;
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT | Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Select Variables that should become Parameters");

		section.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		Composite composite = toolkit.createComposite(section);
		composite.setLayout(new GridLayout(1, false));

		section.setClient(composite);
		Tree tree = toolkit.createTree(composite, SWT.BORDER | SWT.CHECK);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.minimumHeight = 200;
		tree.setLayoutData(gridData);
		// tree.addListener(SWT.EraseItem, new Listener() {
		// public void handleEvent(Event event) {
		// if ((event.detail & SWT.SELECTED) != 0 && true) {
		// // event.detail &= ~SWT.SELECTED;
		// }
		// }
		// });

		parent.layout(true, true);

		treeViewer = new CheckboxTreeViewer(tree);
		treeViewer.addCheckStateListener(new ICheckStateListener() {

			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				// TODO Auto-generated method stub

				validatePage();
			}
		});
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO Auto-generated method stub

				validatePage();
			}
		});
		this.setControl(section);
	}

	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean allowNewContainerName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void activate() {
		currentResource = page1.getResource();
		this.refresh(currentResource, page1.getSelectedProtocol());
	}

	public void refresh(Resource currentResource, CoordinationProtocol protocol) {

		AdapterFactory adapterFactory = null;
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(protocol);
		if (editingDomain instanceof AdapterFactoryEditingDomain) {
			adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
		}
		final CoordinationProtocol protocol2 = protocol;
		if (adapterFactory != null) {
			treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
			treeViewer.setLabelProvider(new GreyedAdapterFactoryLabelProvider(adapterFactory) {
				@Override
				public boolean isEnabled(Object object) {
					// TODO Auto-generated method stub
					return object instanceof Variable;
				}
			});

			treeViewer.setInput(currentResource);

			treeViewer.setFilters(new ViewerFilter[] { new ViewerFilter() {

				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					// TODO Auto-generated method stub
					if (element instanceof RootNode)
						return true;
					if (element instanceof ModelElementCategory
							&& ((ModelElementCategory) element).getKey().contains("realtime"))
						return true;
					if (element instanceof RealtimeStatechart) {
						RealtimeStatechart rtsc = (RealtimeStatechart) element;
						BehavioralElement behaviorialElement = rtsc.getPortOrRoleStatechart().getBehavioralElement();
						return (behaviorialElement != null && behaviorialElement instanceof Role
								&& ((Role) behaviorialElement).getCoordinationProtocol() != null
								&& ((Role) behaviorialElement).getCoordinationProtocol().equals(protocol2));
					}
					if (element instanceof Variable || element instanceof Region
							|| element instanceof State && !((State) element).isSimple())
						return true;

					return false;
				}
			} });

		}

		else {
			treeViewer.setContentProvider(NullContentProvider.DEFAULT);
			treeViewer.setInput(null);
		}
	}

	public Object[] getCheckedVariables() {
		return treeViewer.getCheckedElements();
	}

	public void validatePage() {

		String errorMessage = null;
		for (Object element : treeViewer.getCheckedElements()) {
			if (!(element instanceof Variable))
				errorMessage = "Select only Variables!";
		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
	}

	@Override
	public boolean isPageComplete() {
		// TODO Auto-generated method stub
		return super.isPageComplete() && this.isCurrentPage();
	}

	@Override
	public void deactivate() {

	}
}
