package org.muml.pim.common.refactoring;

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
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;

public class XMIRenameParticipant extends RenameParticipant {

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
		String targetName = this.getArguments().getNewName();
		this.target = source.getParent().getFile(new Path(targetName));

		resource = XMIProxyChange.loadResource(resourceSet, this.source);

		return resource != null;
	}

	@Override
	public String getName() {
		return "Rename XMI Files";
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
