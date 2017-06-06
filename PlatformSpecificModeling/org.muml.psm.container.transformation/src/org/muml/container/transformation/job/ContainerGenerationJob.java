package org.muml.container.transformation.job;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.StringBufferLog;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.muml.container.transformation.ui.Activator;
import org.muml.core.common.DiagramEditorUtil;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.muml.psm.allocation.SystemAllocation;

public class ContainerGenerationJob extends Job {

	private SystemAllocation allocation;

	private URI destinationURI;


	private URI createdFile;
	
	private EditingDomain editingDomain;


	private IStatus loadStatus;

	public ContainerGenerationJob(SystemAllocation allocation,  URI directoryPath, EditingDomain editingDomain) {
		super("Container Generation");
		this.allocation = allocation;
		this.destinationURI = directoryPath;
		this.editingDomain=editingDomain;
		this.createdFile = URI.createURI("");
	}



	
	@Override
	protected IStatus run(IProgressMonitor monitor) {

	

		try {

			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			
			String transformationPath = "/org.muml.psm.container.transformation/transforms/Initial_Container_Transformation.qvto";

			URI transformationURI = URI.createPlatformPluginURI(transformationPath, true);

			// create executor and execution context
			TransformationExecutor transformationExecutor = new TransformationExecutor(transformationURI);
			BasicModelExtent inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { allocation }));
			BasicModelExtent outputExtent = new BasicModelExtent();

			transformationExecutor.loadTransformation();
			List<ModelExtent> extentList = new ArrayList<ModelExtent>();
			extentList.add(inputExtent);
			extentList.add(outputExtent);
			//Log log = new WriterLog(new OutputStreamWriter(System.out));
			StringBufferLog log = new StringBufferLog();
			
			ExecutionContextImpl context = new ExecutionContextImpl();
			context.setLog(log);
			ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(transformationExecutor,
					extentList,context);
			if (command.canExecute()) {
				editingDomain.getCommandStack().execute(command);
			}
			// Diagnostic diagnostic = transformationExecutor.

			String fileExtension = "muml_container"; // convention by ingo budde ;P
			String hint = "MUML_Container";

			IPath dirPath = new Path(destinationURI.toPlatformString(true));

			// Get a unique filename for the new file
			String fileName = DiagramEditorUtil.getUniqueFileName(dirPath, hint, fileExtension);

			// Create the new file
			ResourceSet resourceSet = new ResourceSetImpl();
			createdFile = URI.createPlatformResourceURI(dirPath.append(fileName).toString(), true);
			Resource resource = resourceSet.createResource(createdFile);
			resource.getContents().addAll(outputExtent.getContents());
			
			try {
	
				resource.save(Collections.EMPTY_MAP);
				String tempString = log.getContents();
				int startIndex = tempString.indexOf("Time for create Deployment Configuration:");
				int endIndex = tempString.lastIndexOf("seconds");
				tempString = tempString.substring(startIndex, endIndex);
				Status logTransformationTime = new Status(Status.INFO,Activator.PLUGIN_ID,tempString+" seconds");
				// writes log into the .log file within the .metadata folder of the workspace
				Activator.getDefault().getLog().log(logTransformationTime);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return Status.OK_STATUS;

		} finally {
			monitor.done();
		}

	};
	
	public URI getCreatedFile() {
		return createdFile;
	}


}
