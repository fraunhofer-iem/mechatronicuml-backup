package org.muml.uppaal.adapter.job;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.uppaal.NTA;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.operations.Muml2UppaalOperation;
import org.muml.uppaal.requirements.PropertyRepository;

public class Muml2UppaalModelJob extends Job {
	
	public Muml2UppaalModelJob(VerifiableElement verifiableElement, URI uri, URI propertyUri, VerificationOptionsProvider optionsProvider) {
		super("UPPAAL Network of Timed Automata Model Export");
		
		setUser(true);
		
		this.verifiableElement = verifiableElement;
		this.uri = uri;
		this.propertyUri = propertyUri;
		this.optionsProvider = optionsProvider;
	}
		
	private VerifiableElement verifiableElement;
	private VerificationOptionsProvider optionsProvider;
	private URI uri;
	private URI propertyUri;
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);

			Muml2UppaalOperation m2m = new Muml2UppaalOperation(verifiableElement, optionsProvider);
			try {
				m2m.run(subMonitor.newChild(70));
			}
			catch(CoreException e) {
				return e.getStatus();
			}
			
			if (subMonitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			};
			
			NTA nta = m2m.getNTA();
			PropertyRepository properties = m2m.getPropertyRepository();
			
						
			{
				subMonitor.subTask("Save NTA");
			
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			    Map<String, Object> m = reg.getExtensionToFactoryMap();
			    m.put("uppaal", new XMIResourceFactoryImpl());
		
			    // Obtain a new resource set
			    ResourceSet resSet = new ResourceSetImpl();
			    		    
			    // Create a resource
			    Resource resource = resSet.createResource(uri);
			    // Get the first model element and cast it to the right type, in my
			    // example everything is hierarchical included in this first node
			    resource.getContents().add(nta);
		
			    // Now save the content.
			    try {
			    	resource.save(Collections.EMPTY_MAP);
			    } catch (IOException e) {
			    	return BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e));
			    }
			    
			    subMonitor.worked(15);
			}
		    
			{
			    subMonitor.subTask("Save Properties");
				
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			    Map<String, Object> m = reg.getExtensionToFactoryMap();
			    m.put("requirements", new XMIResourceFactoryImpl());
		
			    // Obtain a new resource set
			    ResourceSet resSet = new ResourceSetImpl();
			    		    
			    // Create a resource
			    Resource resource = resSet.createResource(propertyUri);
			    // Get the first model element and cast it to the right type, in my
			    // example everything is hierarchical included in this first node
			    resource.getContents().add(properties);
		
			    // Now save the content.
			    try {
			    	resource.save(Collections.EMPTY_MAP);
			    } catch (IOException e) {
			    	return BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e));
			    }
			    
			    subMonitor.worked(15);
			}
		    
		    return Status.OK_STATUS;
	    
		} finally {
			monitor.done();
		}
		
		
	}

}
