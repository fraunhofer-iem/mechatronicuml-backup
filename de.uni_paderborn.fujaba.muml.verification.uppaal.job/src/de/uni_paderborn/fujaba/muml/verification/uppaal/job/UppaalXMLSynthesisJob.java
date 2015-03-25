package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;

import de.uni_paderborn.fujaba.muml.verification.uppaal.job.layout.Layouter;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;
import de.uni_paderborn.uppaal.serialization.UppaalPropertySerialization;
import de.uni_paderborn.uppaal.serialization.UppaalSerialization;
import de.uni_paderborn.uppaal.templates.Template;

public class UppaalXMLSynthesisJob extends SynchronousJob {

	private NTA nta;
	private PropertyRepository properties;

	private IPath targetPath;
	private IResource resource;
	
	private boolean layout = false;

	public UppaalXMLSynthesisJob(NTA nta, PropertyRepository properties, IPath targetPath, boolean layout) {
		super("UPPAAL XML Synthesis");

		this.nta = nta;
		this.properties = properties;
		this.targetPath = targetPath;
		this.layout = layout;
	}

	public UppaalXMLSynthesisJob(NTA nta, PropertyRepository properties, IResource resource, boolean layout) {
		this(nta, properties, resource.getLocation(), layout);
		this.resource = resource;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		try {

			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			subMonitor.beginTask(this.getName(), 100);

			// if no resource is available, we reduce the total amount of work
			// since we have no option to refresh the workspace after the export
			if (resource == null) {
				subMonitor.setWorkRemaining(90);
			}


			if (layout) {
				try {
					Layouter layouter = new Layouter();
					subMonitor.subTask("Layouting Uppaal NTAs");
					for (Template template : nta.getTemplate()) {
						layouter.layoutTemplate(template);
					}
				} catch (Error e) {
					System.out.println("Could not layout Uppaal graph ("+e.getMessage()+")");
					layout = false;
				} catch (Exception e) {
					System.out.println("Could not layout Uppaal graph ("+e.getMessage()+")");
					layout = false;
				}
			}

			subMonitor.subTask("Execute Model-to-Text Transformation");
			// generate Uppaal xml
			{
				UppaalSerialization serializer = new UppaalSerialization();
				/*if (layout)
					serializer.setMoveEdgeLabelsAway(true);*/
				BufferedWriter writer = null;
				File file = null;
				try {
					file = targetPath.toFile();
					if (file.isDirectory())
						file = targetPath.append(nta.getName()+".xml").toFile();
					writer = new BufferedWriter(new FileWriter(file));
					writer.write(serializer.main(nta).toString()); //write m2t result to file
				} catch (IOException e) {
					e.printStackTrace();
					return Status.CANCEL_STATUS;
				} finally {
					if (writer != null)
						try {
							writer.close();
						} catch (IOException e) {
							e.printStackTrace();
							return Status.CANCEL_STATUS;
						}
				}
			}
			
			//generate Uppaal .q (queries) file
			{
				UppaalPropertySerialization serializer = new UppaalPropertySerialization();
				BufferedWriter writer = null;
				File file = null;
				try {
					file = targetPath.toFile();
					if (file.isDirectory())
						file = targetPath.append(nta.getName()+".q").toFile();
					writer = new BufferedWriter(new FileWriter(file));
					writer.write(serializer.serializePropertyRepository(properties).toString()); //write m2t result to file
				} catch (IOException e) {
					e.printStackTrace();
					return Status.CANCEL_STATUS;
				} finally {
					if (writer != null)
						try {
							writer.close();
						} catch (IOException e) {
							e.printStackTrace();
							return Status.CANCEL_STATUS;
						}
				}
			}
			
			if (resource != null) { //refresh resource
				try {
					resource.refreshLocal(IResource.DEPTH_INFINITE,
							subMonitor.newChild(10));
				} catch (CoreException e) {
					return e.getStatus();
				}
			}
			

			subMonitor.worked(100);

			return Status.OK_STATUS;

		} finally {
			monitor.done();
		}

	};

}
