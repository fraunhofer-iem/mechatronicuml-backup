package org.muml.pim.pattern.diagram.custom.export.wizard;

import java.util.ArrayList;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.VerifiedConfiguration;

/**
 * First page of the export wizard for the Pattern-To-Protocol transformation.
 * Shows a list of patterns from the .muml file.
 * 
 * @author sthiele2
 *
 */
public class PatternToProtocolExportWizardPage1 extends
		AbstractFujabaExportSourcePage {

	public PatternToProtocolExportWizardPage1(String pageId,
			FormToolkit toolkit, ResourceSet resourceSet, ISelection selection) {
		super(pageId, toolkit, resourceSet, selection);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void addExtensions() {
		ElementSelectionMode elementSelectionMode = wizardPageGetSupportedSelectionMode();
		if (elementSelectionMode.supportsElementSelection()) {
			domainElementExtension = new ModifiedDomainElementPageExtension();
			addExtension("add", domainElementExtension); //$NON-NLS-1$		
		}	
	}

	public AbstractCoordinationPattern getSelectedPattern() {
		for (Object element : domainElementExtension.getCheckedElements()) {
			if (element instanceof AbstractCoordinationPattern)
				return (AbstractCoordinationPattern) element;
		}
		return null;
	}

	public VerifiedConfiguration getSelectedVerifiedConfiguration() {
		for (Object element : domainElementExtension.getCheckedElements()) {
			if (element instanceof VerifiedConfiguration)
				return (VerifiedConfiguration) element;
		}
		return null;
	}

	/*
	 * @Override protected void resourceChanged() { super.resourceChanged();
	 * //initialize();
	 * org.muml.pim.pattern.diagram.custom.export
	 * .wizard.ExportWizardPatternToProtocol2 myWizard=
	 * (ExportWizardPatternToProtocol2)this.getWizard(); if(myWizard != null) {
	 * myWizard.getNextPage(this).createControl(parent);
	 * myWizard.getNextPage(this).getControl().redraw(); }* }
	 */
	Composite parent;

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		super.createControl(parent);
		this.parent = parent;
	}

	public Resource getSelectedResource() {
		return domainElementExtension.getResource();
	}

	@Override
	public String wizardPageGetSourceFileExtension() {
		return "muml";
	}

	@Override
	public boolean wizardPageSupportsSourceModelElement(EObject element) {
		
		
		return element instanceof AbstractCoordinationPattern || element instanceof VerifiedConfiguration;
//				
//				element.getClass().getName().contains("CoordinationPattern")
//				|| element.getClass().getName().contains("VerifiedConfiguration");
	}

	@Override
	public void validatePage() {
		super.validatePage();
		if (this.isPageComplete()) {
			ElementSelectionMode elementSelectionMode = wizardPageGetSupportedSelectionMode();
			Assert.isNotNull(
					elementSelectionMode,
					"Please implement 'wizardGetSupportedSelectionMode()' to provide a non-null selection mode that your fujaba export wizard supports.");

			String errorMessage = null;
			ArrayList<VerifiedConfiguration> selectedVerifiedConfigurations = new ArrayList<VerifiedConfiguration>();
			ArrayList<AbstractCoordinationPattern> selectedPatterns = new ArrayList<AbstractCoordinationPattern>();
			ArrayList<AbstractCoordinationPattern> referencedPatterns = new ArrayList<AbstractCoordinationPattern>();
			for (Object element : domainElementExtension.getCheckedElements()) {
				if (!wizardPageSupportsSourceModelElement((EObject) element)) {
					errorMessage = "Selection contains unsupported elements.";
					break;
				}
				if (element instanceof VerifiedConfiguration) {
					selectedVerifiedConfigurations
							.add((VerifiedConfiguration) element);
					if (!referencedPatterns
							.contains(((VerifiedConfiguration) element)
									.getCoordinationPattern()))
						referencedPatterns.add(((VerifiedConfiguration) element)
								.getCoordinationPattern());
					else {
						errorMessage = "Only one verified configuration may be selected for the transformation.";
						break;
					}
				}
				if (element instanceof AbstractCoordinationPattern)
					selectedPatterns.add((AbstractCoordinationPattern) element);
			}
			if (errorMessage == null) {
				if (selectedPatterns.size() != 1)
					errorMessage = "Choose exactly one CoordinationPattern.";
				if (errorMessage == null
						&& selectedVerifiedConfigurations.size() > 1)
					errorMessage = "Choose at most one VerifiedConfiguration.";
			}
			if (errorMessage == null) {
				for (VerifiedConfiguration config : selectedVerifiedConfigurations) {
					boolean corrspondentPatternSelected = selectedPatterns
							.contains(config.getCoordinationPattern());
					if (!corrspondentPatternSelected) {
						errorMessage = "Selecting a VerifiedConfiguration requires the selection of the correspondent CoordinationPattern or CoordinationPatternVariant.";
						break;
					}
				}
			}

			setErrorMessage(errorMessage);
			setPageComplete(errorMessage == null);
		}
	}

	@Override
	protected void resourceChanged() {
		super.resourceChanged();
//		treeViewer.addFilter(new ViewerFilter() {
//			@Override
//			public boolean select(Viewer viewer,
//					Object parentElement, Object element) {
//				// TODO Auto-generated method stub
//				if (element instanceof AbstractCoordinationPattern
//						|| element instanceof VerifiedConfiguration
//						|| element instanceof RootNode
//						|| (element instanceof ModelElementCategory && ((ModelElementCategory) element)
//								.getName().contains("pattern")))
//					return true;
//				return false;
//			}
//		});
	}
	@Override
	public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
		return ElementSelectionMode.ELEMENT_SELECTION_MODE_MULTI;
	}
	
	class ModifiedDomainElementPageExtension extends DomainElementPageExtension
	{
		@Override public void setResource(Resource resource)
		{
			super.setResource(resource);
			
		}
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}


}
