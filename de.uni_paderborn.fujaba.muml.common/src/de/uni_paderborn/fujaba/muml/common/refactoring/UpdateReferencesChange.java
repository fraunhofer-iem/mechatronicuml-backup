package de.uni_paderborn.fujaba.muml.common.refactoring;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

public class UpdateReferencesChange extends Change {

	private URI diagramFile = null;
	private IResource target = null;
	
	HashMap<String, URI> uriMap = new HashMap<String, URI>();
	
	public UpdateReferencesChange(IContainer source, IContainer target, String fileName, HashMap<String, URI> uriMap)
	{
		this.uriMap = uriMap;
		this.diagramFile = URI.createURI(target.getLocationURI() + "/" + fileName);
		this.target = target;
	}

	@Override
	public String getName() {
		return "Update references to Fujaba file";
	}

	@Override
	public void initializeValidationData(IProgressMonitor pm) {
	}

	@Override
	public RefactoringStatus isValid(IProgressMonitor pm) throws CoreException,
			OperationCanceledException {		
		return new RefactoringStatus();
	}

	@Override
	public Change perform(IProgressMonitor pm) throws CoreException {
		ResourceSet resSet = new ResourceSetImpl();
	    Resource resource = resSet.getResource(this.diagramFile, true);		
	    
	    //Replace eProxyURI
	    for(Entry<String, URI> e:this.uriMap.entrySet())
	    {
	    	EObject o = resource.getEObject(e.getKey());
	    	if(o == null)
	    		throw new CoreException(new Status(Status.ERROR, "", "Could not find object " +e.getKey() + " in resource"));
	    	
	    	View v = (View) o;
	    	InternalEObject me = (InternalEObject) v.getElement();	
	    	URI sourceURI = e.getValue();
	    	URI relativeURI = sourceURI.deresolve(resource.getURI());	
	    	me.eSetProxyURI(relativeURI);
	    }
		
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new CoreException(new Status(Status.ERROR,"",e.getMessage(),e));
		}
		
		this.target.refreshLocal(IResource.DEPTH_ONE, pm);		
		return null;
	}

	@Override
	public Object getModifiedElement() {
		return this.diagramFile;
	}

}
