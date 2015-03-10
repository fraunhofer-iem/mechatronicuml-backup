package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;

public class TransformationJob extends SynchronousJob {
	
	protected URI uri;
	protected ModelExtent params[] = null;
	protected Map<String, Object> configProperties = null;
	
	//private static IProgressMonitor currentMonitor = null;
	private static Map<URI, TransformationExecutor> executors = new HashMap<URI, TransformationExecutor>(); //maps a transformation URI to its executor
	//private static Map<URI, IStatus> loadStatus = new HashMap<URI, IStatus>(); //maps a transformation URI to the load status (null if not yet loaded)
	
	/**
	 * 
	 * @param title what the job should show that it does
	 * @param uri the uri of the transformation to run
	 */
	public TransformationJob(String title, URI uri) {
		super(title);
		this.uri = uri;
	}
	
	public void setTransformationParameters(ModelExtent... params) {
		this.params = params;
	}
	
	public void setTransformationConfigProperties(Map<String, Object> configProperties) {
		this.configProperties = configProperties;
	}
	
	private static final boolean CACHING = !Activator.getDefault().isDebugging();
	
	/**
	 * Loads and caches a transformation executor (may take some time)
	 * @param uri
	 * @return result of loading
	 */
	protected static IStatus loadTransformation(URI uri, IProgressMonitor monitor) {
		
		TransformationExecutor executor = getTransformationExecutor(uri);
		
		try {			
			IStatus status = BasicDiagnostic.toIStatus(executor.loadTransformation(monitor));		
			//loadStatus.put(uri, status);
		
			return status;	
		} 
		finally {
			monitor.done();
		}
	}
	
	private static TransformationExecutor getTransformationExecutor(URI uri) {
		
		TransformationExecutor executor;
		
		if (executors.containsKey(uri)) {
			return executor = executors.get(uri);
		}
		else {
			executor = new TransformationExecutor(uri);
			
			if (CACHING) {
				executors.put(uri, executor);
			}
		}
		
		return executor;
	}
	
	/**
	 * Removes transformation from executors cache so that it will be reloaded next time
	 * @param uri
	 */
	protected static void forgetTransformation(URI uri) {
		executors.remove(uri);
		//loadStatus.remove(uri);
	}
	
	/**
	 * Returns the progress monitor of the currently running transformation
	 */
//	public static IProgressMonitor getProgressMonitor() {
//		return currentMonitor;
//	}
		
	@Override
	protected IStatus run(IProgressMonitor monitor) {
				
		ExecutionContextImpl context;
		Diagnostic diagnostic;
		IStatus status;
		
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 120);
			//currentMonitor = subMonitor;
						
			if (executors.get(uri) == null) {
				subMonitor.subTask("Load Model-to-Model Transformation");
				IProgressMonitor loadMonitor = subMonitor.newChild(20);
				status = loadTransformation(uri, loadMonitor); //(statically) load appropriate transformation
								
				if(!status.isOK()) {
					// re-initialize the transformation executor when the compilation fails
					// this ensures a new compilation and allows bugfixes to be considered
					forgetTransformation(uri);
					return status;
				}
				
				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}
			};
			
			subMonitor.setWorkRemaining(100);
			subMonitor.subTask("Execute Model-to-Model Transformation");
			
			IProgressMonitor executeMonitor = subMonitor.newChild(90);
			
			//Set up
			context = new ExecutionContextImpl();
			context.setLog(new WriterLog(new OutputStreamWriter(System.out)));
			context.setProgressMonitor(executeMonitor);
			
			if (configProperties != null)
				for (Map.Entry<String, Object> entry : configProperties.entrySet())
					context.setConfigProperty(entry.getKey(), entry.getValue());
			
			//Execute
			diagnostic = getTransformationExecutor(uri).execute(context, params);
			//subMonitor.worked(90);
			
			//Validate
			status = BasicDiagnostic.toIStatus(diagnostic);
			if(!status.isOK())
				return status;
			
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			};
			
			
			//Validate models
			subMonitor.subTask("Validate Models");
			int i=0;
			if (params != null)
				for (ModelExtent extent : params) {
					i++;
					for (EObject obj : extent.getContents()) {
						diagnostic = Diagnostician.INSTANCE.validate(obj);
						status = BasicDiagnostic.toIStatus(diagnostic);
						if(!status.isOK()) {
							System.err.println("Validation failed for parameter model #"+i+" in "+uri.toString());
							return status;
						}
					}
				}
					
			subMonitor.worked(10);
			
			return Status.OK_STATUS;
		
		}
		finally {
			monitor.done();
			//currentMonitor = null;
		}
			
	};	
}
