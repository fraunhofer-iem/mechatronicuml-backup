package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;

public class PatternVerificationWizard extends AbstractFujabaExportWizard {

	
	CoordinationPattern selectedPattern;
	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		// TODO Auto-generated method stub
		super.init(workbench, currentSelection);
		selectedPattern = (CoordinationPattern)((View)((EditPart)currentSelection.iterator().next()).getModel()).getElement();
	}
	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard.PatternVerificationWizard";
	}
	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		PatternVerificationWizardPage1 p1 = new PatternVerificationWizardPage1("Test", toolkit);
		this.addPage(p1);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// TODO Auto-generated method stub
		return null;
	}

}
