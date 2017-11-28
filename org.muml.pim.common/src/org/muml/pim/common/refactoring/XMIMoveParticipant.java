package org.muml.pim.common.refactoring;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;

public class XMIMoveParticipant extends MoveParticipant {

	private IFile source = null;
	private IFile target = null;
	private Resource resource = null;
	private ResourceSet resourceSet = new ResourceSetImpl();

	
	@Override
	protected boolean initialize(Object element)
	{
		if(!(element instanceof IFile))
			return false;
		
		this.source = (IFile) element;
		
		IContainer targetContainer = (IContainer) this.getArguments().getDestination();
		this.target = targetContainer.getFile(new Path(source.getName()));

		resource = XMIProxyChange.loadResource(resourceSet, this.source);

		return resource != null;
	}

	@Override
	public String getName() {
		return "Move XMI Files";
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm,
			CheckConditionsContext context) throws OperationCanceledException {

		return new RefactoringStatus();
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException,
			OperationCanceledException {
		return new XMIProxyChange(resourceSet, source, target, resource);
	}
	


}
