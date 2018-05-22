package org.muml.eloquent.adapter.muml.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.ui.wizard.AbstractAllocationWizard;
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationComputationOperation;
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationComputationStrategyConfigurationWizardPage;
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationComputationStrategyWizardPage;
import org.muml.psm.allocation.algorithm.ui.wizard.IAllocationOperation;
import org.muml.psm.allocation.algorithm.ui.wizard.PageContext;
import org.muml.eloquent.adapter.muml.oclcontext.OCLContext;
import org.muml.eloquent.adapter.muml.oclcontext.OclcontextFactory;
import org.muml.psm.allocation.language.cs.SpecificationCS;

/* needs more love... */
public class MUMLAllocationWizardPageProvider extends AbstractAllocationWizard.DefaultAllocationWizardPageProvider {
	
	private static final String targetPageExpected = "Wizard has no target page";
	private static final String mumlFileExtension = "muml";
	
	private FormToolkit toolkit;
	private AbstractFujabaExportSourcePage cicSourcePage;
	private AbstractFujabaExportSourcePage hpicSourcePage;
	private AbstractFujabaExportSourcePage allocationSpecificationSourcePage;
	private AbstractFujabaExportSourcePage targetPage;
	private AllocationComputationStrategyWizardPage strategyPage;
	private EditingDomain editingDomain = WorkspaceEditingDomainFactory
			.INSTANCE.createEditingDomain();

	@Override
	public boolean isProviderFor(IStructuredSelection ssel) {
		if (ssel.size() != 1) {
			return false;
		}
		IFile file = Adapters.adapt(ssel.getFirstElement(), IFile.class);
		return file != null && mumlFileExtension.equals(file.getFileExtension());
	}

	@Override
	public List<IWizardPage> providePages(PageContext pageContext, IWorkbench workbench,
			IStructuredSelection selection) {
		toolkit = new FormToolkit(workbench.getDisplay());
		List<IWizardPage> wizardPageList = new ArrayList<IWizardPage>();
		// cic source page
		cicSourcePage = new AbstractFujabaExportSourcePage("CicSP", toolkit, editingDomain.getResourceSet(), selection) {
			{
				setTitle("Select Component Instance Configuration");
				setDescription("Select Component Instance Configuration, whose component instances should be allocated");
			}

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "muml";
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof ComponentInstanceConfiguration;
			}

		};
		wizardPageList.add(cicSourcePage);	
		// hpic source page
		hpicSourcePage = new AbstractFujabaExportSourcePage("HpicSP", toolkit, editingDomain.getResourceSet(), selection) {
			{
				setTitle("Select HW Platform Instance Configuration");
				setDescription("The HW Platform Instance Configuration provides the ECUs");
			}

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "muml";
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof HWPlatformInstanceConfiguration;
			}

		};
		wizardPageList.add(hpicSourcePage);	
		if (pageContext == PageContext.AllocationComputation) {
			// allocation specification source page
			allocationSpecificationSourcePage = new AbstractFujabaExportSourcePage("AllocSpecSP", toolkit, editingDomain.getResourceSet(), selection) {

				{
					setTitle("Select Allocation Specification");
					setDescription("The Allocation Specification specifies the constraints and objective function");
				}

				@Override
				public String wizardPageGetSourceFileExtension() {
					return "allocation_specification";
				}

				@Override
				public boolean wizardPageSupportsSourceModelElement(EObject element) {
					return element instanceof SpecificationCS;
				}

				@Override
				public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
					return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
				}
			};
			wizardPageList.add(allocationSpecificationSourcePage);
	        // target page
			targetPage = createTargetPage(toolkit,
					editingDomain.getResourceSet(), selection);
        	wizardPageList.add(targetPage);
        	AllocationComputationStrategyConfigurationWizardPage configPage = new AllocationComputationStrategyConfigurationWizardPage();
        	strategyPage = new AllocationComputationStrategyWizardPage(pageContext, configPage);
        	wizardPageList.add(strategyPage);
        	wizardPageList.add(configPage);
		}
        return wizardPageList;
	}
	
	protected AbstractFujabaExportSourcePage createTargetPage(@NonNull FormToolkit toolkit, @NonNull ResourceSet resSet,
			@NonNull IStructuredSelection initialSelection) {
		return new AbstractFujabaExportSourcePage("targetSP", toolkit, resSet, initialSelection) {

			{
				setTitle("Select the target System Allocation");
				setDescription("By default a new System Allocation is created");
			}

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "muml";
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof ModelElementCategory || element instanceof RootNode || element instanceof SystemAllocation;
			}
		};

	}

	@Override
	public EObject getOCLContext() {
		OCLContext oclContext = OclcontextFactory.eINSTANCE.createOCLContext();
    	oclContext.setComponentInstanceConfiguration(
    			(ComponentInstanceConfiguration) cicSourcePage.getSourceElements()[0]);
    	oclContext.setHardwarePlatformInstanceConfiguration(
    			(HWPlatformInstanceConfiguration) hpicSourcePage.getSourceElements()[0]);
    	return oclContext;
	}

	@Override
	protected IAllocationOperation createAllocationComputationOperation() {
		if (targetPage == null) {
			// should not happen (this would imply pageContext != PageContext.AllocationComputation)
			throw new IllegalStateException(targetPageExpected);
		}
		return new MUMLAllocationComputationOperation(editingDomain,
				(SpecificationCS) allocationSpecificationSourcePage.getSourceElements()[0],
				getOCLContext(), targetPage.getSourceElements()[0],
				(IAllocationComputationStrategy<SystemAllocation, ?>) strategyPage.getAllocationComputationStrategy());
	}

}
