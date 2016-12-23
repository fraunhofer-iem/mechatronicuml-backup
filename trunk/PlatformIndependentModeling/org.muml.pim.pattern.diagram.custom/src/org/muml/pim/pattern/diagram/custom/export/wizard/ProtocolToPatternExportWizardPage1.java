package org.muml.pim.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.pim.protocol.CoordinationProtocol;

public class ProtocolToPatternExportWizardPage1 extends
		AbstractFujabaExportSourcePage {
	
	

	public ProtocolToPatternExportWizardPage1(String pageId,
			FormToolkit toolkit, ResourceSet resourceSet, ISelection selection) {
		super(pageId, toolkit, resourceSet, selection);		
		
	}

	@Override
	public String wizardPageGetSourceFileExtension() {
		// TODO Auto-generated method stub
		return "muml";
	}

	@Override
	public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
		// TODO Auto-generated method stub
		return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
	}

	@Override
	public boolean wizardPageSupportsSourceModelElement(EObject element) {
		// TODO Auto-generated method stub
		return element.getClass().getName().contains("CoordinationProtocol");
	}	 
	
		
	public CoordinationProtocol getSelectedProtocol() {
		for (Object element : domainElementExtension.getCheckedElements()) {
			if (element instanceof CoordinationProtocol)
				return (CoordinationProtocol) element;
		}
		return null;
	}


	
}
