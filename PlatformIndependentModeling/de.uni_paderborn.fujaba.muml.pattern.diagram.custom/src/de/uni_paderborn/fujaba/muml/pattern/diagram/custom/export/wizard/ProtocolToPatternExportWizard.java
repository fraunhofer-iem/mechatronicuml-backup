package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.Assert;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

public class ProtocolToPatternExportWizard extends AbstractFujabaExportWizard{

	ProtocolToPatternExportWizardPage1 page1;
	ProtocolToPatternExportWizardPage2 page2;
	
	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "de.uni_paderborn.fujaba.muml.pattern.diagram.custom.ExportWizardProtocolToPattern";
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		page1 = new ProtocolToPatternExportWizardPage1("SelectProtocol", toolkit, this.getResourceSet(), this.initialSelection);
		page2 = new ProtocolToPatternExportWizardPage2("SelectVariablesThatShouldBeTransformedToParameters", toolkit);
		this.addPage(page1);
		this.addPage(page2);
		page1.addResourceChangeListener(page2);
	}
	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("Transform CoordinationProtocol to CoordinationPattern");
		setDefaultPageImageDescriptor(IDEWorkbenchPlugin
				.getIDEImageDescriptor("wizban/exportzip_wiz.png"));//$NON-NLS-1$
	}
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		CoordinationProtocol protocol = (CoordinationProtocol)page1.getSourceElements()[0];
		
		Object[] checkedElements = page2.getCheckedVariables();
		Variable[] variables = new Variable[checkedElements.length];		
		int i= 0;
		for(Object element : checkedElements)
		{
			variables[i] = (Variable)element;		
			i++;
		}
		
		CoordinationPattern newPattern = PatternToProtocolTransformation.transformProtocolToPattern(protocol, variables, editingDomain);
		if(newPattern!= null)
		{
			Resource resource = newPattern.eResource();
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			PatternToProtocolTransformation.createDiagrams(getShell(), newPattern);
			return true;
		}
		return false;
	}


		
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		// TODO Auto-generated method stub
		IWizardPage next = super.getNextPage(page);
		CoordinationProtocol selectedElement = (CoordinationProtocol)page1.getSourceElements()[0];
		if (next == page2)
			page2.refresh(selectedElement);
		return next;
	}
}
