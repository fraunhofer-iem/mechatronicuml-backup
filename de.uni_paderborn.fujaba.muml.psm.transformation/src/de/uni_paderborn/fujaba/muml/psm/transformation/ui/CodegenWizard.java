package de.uni_paderborn.fujaba.muml.psm.transformation.ui;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportTargetPage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.APICall;

public class CodegenWizard extends AbstractFujabaExportWizard{
	private AbstractFujabaExportSourcePage sourcePage;
	private AbstractFujabaExportSourcePage apiMappingPage;

	private AbstractFujabaExportTargetPage targetPage;

	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "de.uni_paderborn.fujaba.muml.psm.codegen.CodegenWizard";
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void addPages() {
		// Source page
		sourcePage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element.getClass().getName().contains("ComponentInstanceConfiguration");
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}
			
		};
		addPage(sourcePage);
		
		apiMappingPage = new AbstractFujabaExportSourcePage("source", toolkit, getResourceSet(), initialSelection) {

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "apimapping";
			}
			

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return true;
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_NONE;
			}
			
		};
		apiMappingPage.setTitle("Select a API-Mapping file");
		addPage(apiMappingPage);
		
		
		targetPage = new AbstractFujabaExportTargetPage("target", toolkit) {

			@Override
			public boolean wizardPageSupportsOverwriteOption() {
				return true;
			}

			@Override
			public boolean wizardPageDirectoryDestination() {
				return true;
			}
			
		};
		addPage(targetPage);
		
	}

}
