package de.uni_paderborn.fujaba.muml.common.refactoring;

import java.util.HashMap;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;

public class DiagramMoveParticipant extends MoveParticipant {

	private IContainer source = null;
	private IContainer target = null;
	private String fileName = null;
	private Resource resource = null;

	
	@Override
	protected boolean initialize(Object element)
	{
		if(!(element instanceof IFile))
			return false;
		
		this.fileName = ((IFile) element).getName();
		this.source = ((IFile) element).getParent();		
		this.target = (IContainer) this.getArguments().getDestination();
		return true;
	}

	@Override
	public String getName() {
		return "Move MUML Diagram Files";
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm,
			CheckConditionsContext context) throws OperationCanceledException {
		
		ResourceSet resSet = new ResourceSetImpl();
	    resource = resSet.getResource(URI.createURI(this.source.findMember(fileName).getLocationURI().toString()), true);		
		
	    if(resource.getContents().size() == 0)
	    	return RefactoringStatus.createFatalErrorStatus("No diagram given");
	    if(!(resource.getContents().get(0) instanceof Diagram))
	    	return RefactoringStatus.createFatalErrorStatus("No diagram given");	
	    
		return new RefactoringStatus();
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException,
			OperationCanceledException {		
		TreeIterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
		
		HashMap<String, URI> uriMap = new HashMap<String, URI>();
		
		//Collect all eProxyURI
		while(iter.hasNext())
		{			
			EObject object = iter.next();
			
			if(object instanceof View)
			{				
				InternalEObject elem = (InternalEObject) ((InternalEObject)object).eGet(NotationPackage.VIEW__ELEMENT,false,false);
				
				if(elem != null)
				{
					if(elem.eProxyURI() == null)
						continue;
					
					uriMap.put(resource.getURIFragment(object), elem.eProxyURI());
				}					
			}		
		}
		return new UpdateReferencesChange(this.source, this.target, this.fileName, uriMap);
	}

}
