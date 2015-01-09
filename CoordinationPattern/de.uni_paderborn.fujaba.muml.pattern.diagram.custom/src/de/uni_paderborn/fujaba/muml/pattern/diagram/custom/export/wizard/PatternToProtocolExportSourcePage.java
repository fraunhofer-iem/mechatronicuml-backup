package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.forms.widgets.FormToolkit;

import pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;

public class PatternToProtocolExportSourcePage extends
		AbstractFujabaExportSourcePage {

	public PatternToProtocolExportSourcePage(String pageId,
			FormToolkit toolkit, ResourceSet resourceSet, ISelection selection) {
		super(pageId, toolkit, resourceSet, selection);
		// TODO Auto-generated constructor stub

	}

	@Override
	public boolean canFlipToNextPage() {
		// TODO Auto-generated method stub
		boolean complete = super.canFlipToNextPage();
		return this.getSourceElements() != null && complete
				&& this.getSourceElements().length == 1;
	}

	public CoordinationPattern getSelectedPattern() {
		if (this.getSourceElements() == null
				|| this.getSourceElements().length == 0)
			return null;
		return (CoordinationPattern) this.getSourceElements()[0];
	}

	@Override
	public String wizardPageGetSourceFileExtension() {
		return "muml";
	}

	@Override
	public boolean wizardPageSupportsSourceModelElement(EObject element) {

		return element instanceof CoordinationPattern;
	}

	@Override
	public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
		return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
	}

}
