package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.util.ArrayList;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage.DomainElementPageExtension;
import de.uni_paderborn.fujaba.export.providers.GreyedAdapterFactoryLabelProvider;
import de.uni_paderborn.fujaba.export.providers.NullContentProvider;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration;

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

	public CoordinationPattern getSelectedPattern() {
		for (Object element : domainElementExtension.getCheckedElements()) {
			if (element instanceof CoordinationPattern)
				return (CoordinationPattern) element;
		}
		return null;
	}

	public LegalConfiguration getSelectedLegalConfiguration() {
		for (Object element : domainElementExtension.getCheckedElements()) {
			if (element instanceof LegalConfiguration)
				return (LegalConfiguration) element;
		}
		return null;
	}

	/*
	 * @Override protected void resourceChanged() { super.resourceChanged();
	 * //initialize();
	 * de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export
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
		return element.getClass().getName().contains("CoordinationPattern")
				|| element.getClass().getName().contains("LegalConfiguration");
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
			ArrayList<LegalConfiguration> selectedLegalConfigurations = new ArrayList<LegalConfiguration>();
			ArrayList<CoordinationPattern> selectedPatterns = new ArrayList<CoordinationPattern>();
			ArrayList<CoordinationPattern> referencedPatterns = new ArrayList<CoordinationPattern>();
			for (Object element : domainElementExtension.getCheckedElements()) {
				if (!wizardPageSupportsSourceModelElement((EObject) element)) {
					errorMessage = "Selection contains unsupported elements.";
					break;
				}
				if (element instanceof LegalConfiguration) {
					selectedLegalConfigurations
							.add((LegalConfiguration) element);
					if (!referencedPatterns
							.contains(((LegalConfiguration) element)
									.getCoordinationPattern()))
						referencedPatterns.add(((LegalConfiguration) element)
								.getCoordinationPattern());
					else {
						errorMessage = "Only one legal configuration may be selected for the transformation.";
						break;
					}
				}
				if (element instanceof CoordinationPattern)
					selectedPatterns.add((CoordinationPattern) element);
			}
			if (errorMessage == null) {
				if (selectedPatterns.size() != 1)
					errorMessage = "Choose exactly one CoordinationPattern.";
				if (errorMessage == null
						&& selectedLegalConfigurations.size() > 1)
					errorMessage = "Choose at most one LegalConfiguration.";
			}
			if (errorMessage == null) {
				for (LegalConfiguration config : selectedLegalConfigurations) {
					boolean corrspondentPatternSelected = selectedPatterns
							.contains(config.getCoordinationPattern());
					if (!corrspondentPatternSelected) {
						errorMessage = "Selecting a LegalConfiguration requires the selection of the correspondent CoordinationPattern.";
						break;
					}
				}
			}

			setErrorMessage(errorMessage);
			setPageComplete(errorMessage == null);
		}
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
			treeViewer.addFilter(new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer,
						Object parentElement, Object element) {
					// TODO Auto-generated method stub
					if (element instanceof CoordinationPattern
							|| element instanceof LegalConfiguration
							|| element instanceof RootNode
							|| (element instanceof ModelElementCategory && ((ModelElementCategory) element)
									.getName().contains("pattern")))
						return true;
					return false;
				}
			});
		}
	}


}
