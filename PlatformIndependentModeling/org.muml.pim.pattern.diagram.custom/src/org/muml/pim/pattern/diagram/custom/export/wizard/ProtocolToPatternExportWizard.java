package org.muml.pim.pattern.diagram.custom.export.wizard;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.pim.behavior.Variable;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.protocol.CoordinationProtocol;

public class ProtocolToPatternExportWizard extends AbstractFujabaExportWizard{

	ProtocolToPatternExportWizardPage1 page1;
	ProtocolToPatternExportWizardPage2 page2;
	
	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "org.muml.pim.pattern.diagram.custom.ExportWizardProtocolToPattern";
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
		page2 = new ProtocolToPatternExportWizardPage2("SelectVariablesThatShouldBeTransformedToParameters", toolkit, page1);
		this.addPage(page1);
		this.addPage(page2);
		
		
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
			
			
			PatternToProtocolTransformation.createDiagrams(this.getShell(), newPattern);
			
			return true;
		}
		return false;
	}


}
