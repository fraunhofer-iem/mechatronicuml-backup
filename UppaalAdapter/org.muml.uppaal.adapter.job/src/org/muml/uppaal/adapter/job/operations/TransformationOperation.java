package org.muml.uppaal.adapter.job.operations;

import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
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
import org.muml.uppaal.adapter.job.Activator;

public class TransformationOperation implements IWorkspaceRunnable {
	
	public static String CONFIG_STORE_INTERMEDIATE_MODELS = "STORE_INTERMEDIATE_MODELS";
	
	
	protected URI uri;
	protected ModelExtent params[] = null;
	protected Map<String, Object> configProperties = null;
	
	private String title;
	
	private static Map<URI, TransformationExecutor> executors = new HashMap<URI, TransformationExecutor>(); //maps a transformation URI to its executor
	
	/**
	 * 
	 * @param title what the job should show that it does
	 * @param uri the uri of the transformation to run
	 */
	public TransformationOperation(String title, URI uri) {
		this.title = title;
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
	}
			
	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
				
		ExecutionContextImpl context;
		Diagnostic diagnostic;
		IStatus status;
		
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, title, 120);
						
			if (executors.get(uri) == null) {
				subMonitor.subTask("Load Model-to-Model Transformation");
				IProgressMonitor loadMonitor = subMonitor.newChild(20);
				status = loadTransformation(uri, loadMonitor); //(statically) load appropriate transformation
								
				if(!status.isOK()) {
					// re-initialize the transformation executor when the compilation fails
					// this ensures a new compilation and allows bugfixes to be considered
					forgetTransformation(uri);
					throw new CoreException(status);
				}
				
				if (monitor.isCanceled()) {
					throw new OperationCanceledException();
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
			
			//Validate
			status = BasicDiagnostic.toIStatus(diagnostic);
			if(!status.isOK())
				throw new CoreException(status);
			
			if (monitor.isCanceled()) {
				throw new OperationCanceledException();
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
						if(!(status.isOK() || status.getSeverity() ==  IStatus.WARNING)) {
							System.err.println("Validation failed for parameter model #"+i+" in "+uri.toString());
							throw new CoreException(status);
						}
					}
				}
					
			subMonitor.worked(10);
					
		}
		finally {
			monitor.done();
		}
			
	};	
}
