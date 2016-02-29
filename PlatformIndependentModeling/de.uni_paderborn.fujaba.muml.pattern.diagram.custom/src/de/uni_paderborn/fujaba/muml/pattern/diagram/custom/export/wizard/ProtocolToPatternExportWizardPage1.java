package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

public class ProtocolToPatternExportWizardPage1 extends
		AbstractFujabaExportSourcePage {
	
	ProtocolToPatternExportWizardPage2 page2  ;

	public ProtocolToPatternExportWizardPage1(String pageId,
			FormToolkit toolkit, ResourceSet resourceSet, ISelection selection, ProtocolToPatternExportWizardPage2 page2) {
		super(pageId, toolkit, resourceSet, selection);
		this.page2 = page2;
		
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
	
	@Override
	public void addExtensions() {
		ElementSelectionMode elementSelectionMode = wizardPageGetSupportedSelectionMode();
		if (elementSelectionMode.supportsElementSelection()) {
			domainElementExtension = new ModifiedDomainElementPageExtension();
			addExtension("add", domainElementExtension); //$NON-NLS-1$		
		}	
	}
	
//	@Override
//	protected void resourceChanged() {
//		// TODO Auto-generated method stub
//		page2.handleResourceChange(getResource());
//		super.resourceChanged();
//	}
	
	class ModifiedDomainElementPageExtension extends DomainElementPageExtension
	{
		
		@Override
		public void createControl(Composite parent) {
			super.createControl(parent);	
		
			treeViewer.addCheckStateListener(new ICheckStateListener() {				
				@Override
				public void checkStateChanged(CheckStateChangedEvent event) {
					// TODO Auto-generated method stub					
					if(event.getElement() instanceof CoordinationProtocol) {
						page2.refresh(
								getResource(),
								(CoordinationProtocol)event.getElement());	
					}
				}			
			});			
			
			treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					// TODO Auto-generated method stub
					IStructuredSelection selection = (IStructuredSelection) event.getSelection();
					for(Object element : selection.toArray()) {
						if(element instanceof CoordinationProtocol) {
							page2.refresh(
									getResource(),
									(CoordinationProtocol)element);	
						}
					}
				}
			});
		}		
		
	}	
	
}
