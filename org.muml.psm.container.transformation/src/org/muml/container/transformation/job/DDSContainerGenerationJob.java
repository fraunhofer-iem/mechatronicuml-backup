package org.muml.container.transformation.job;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.StringBufferLog;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.muml.container.transformation.ui.Activator;
import org.muml.core.common.DiagramEditorUtil;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.muml.psm.muml_container.DeploymentConfiguration;

public class DDSContainerGenerationJob extends Job {

	private DeploymentConfiguration systemConfiguration;

	private URI destinationURI;

	private EditingDomain editingDomain;

	public DDSContainerGenerationJob(DeploymentConfiguration allocation, URI directoryPath, EditingDomain editingDomain) {
		super("DDS-Container C-Transformation");
		this.systemConfiguration = allocation;
		this.editingDomain = editingDomain;
		this.destinationURI = directoryPath;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		Diagnostic diagnostic;
		IStatus status;

		try {

			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);

			subMonitor.worked(30);

			subMonitor.setWorkRemaining(30);

			subMonitor.subTask("Execute DDS-Container  Transformation");
			String transformationPath = "/org.muml.psm.container.transformation/transforms/MUML_DDS_Transformation.qvto";

			URI transformationURI = URI.createPlatformPluginURI(transformationPath, true);

			// create executor and execution context
			TransformationExecutor transformationExecutor = new TransformationExecutor(transformationURI);
			BasicModelExtent inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { systemConfiguration }));
			final BasicModelExtent outputExtent = new BasicModelExtent();

			transformationExecutor.loadTransformation();
			List<ModelExtent> extentList = new ArrayList<ModelExtent>();
			extentList.add(inputExtent);
			extentList.add(outputExtent);
			ExecutionContextImpl im=new ExecutionContextImpl();
		//	OutputStreamWriter outStream = new OutputStreamWriter(System.out);
		//	Log log = new WriterLog(outStream);
			StringBufferLog log = new StringBufferLog();
			im.setLog(log);
			ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(transformationExecutor,
					extentList, im);
			if (command.canExecute()) {
				editingDomain.getCommandStack().execute(command);
			}
			// Diagnostic diagnostic = transformationExecutor.

			String fileExtension = "opendds"; // convention by ingo budde ;P
			String hint = "MUML_DDS";

			IPath dirPath = new Path(destinationURI.toPlatformString(true));

			// Get a unique filename for the new file
			String fileName = DiagramEditorUtil.getUniqueFileName(dirPath, hint, fileExtension);

			// Create the new file
			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createPlatformResourceURI(dirPath.append(fileName).toString(), true);
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().addAll(outputExtent.getContents());
			Resource resource2 = systemConfiguration.eResource();

			HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
			saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
			try {
				resource.save(saveOptions);
				resource2.save(Collections.EMPTY_MAP);
				String tempString = log.getContents();
				int startIndex = tempString.indexOf("Time for create DDS Model of MUML:");
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

}
