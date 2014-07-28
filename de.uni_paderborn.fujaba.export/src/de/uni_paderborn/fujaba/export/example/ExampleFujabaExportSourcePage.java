package de.uni_paderborn.fujaba.export.example;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.common.ui.ResourceLocationProvider;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;

public class ExampleFujabaExportSourcePage extends de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage {

	public ExampleFujabaExportSourcePage(String pageId, FormToolkit toolkit,
			ResourceLocationProvider resourceLocationProvider,
			ResourceSet resourceSet) {
		super(pageId, toolkit, resourceLocationProvider, resourceSet);
	}

	
	@Override
	public String wizardPageGetSourceFileExtension() {
		return "fujaba";
	}


	@Override
	public boolean wizardPageSupportsSourceModelElement(EObject element) {
		return !element.getClass().getName().contains("RootNode");
	}

	@Override
	public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
		return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
	}
	
}
