/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package de.uni_paderborn.fujaba.muml.model.gen.c.ui.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.Bundle;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ActuatorInstanceImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.SensorInstanceImpl;
import de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance;


/**
 * Main entry point of the 'C' generation module.
 */
public class GenerateAll {

	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;

	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll(URI modelURI, IContainer targetFolder, List<? extends Object> arguments) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}
		monitor.subTask("Loading...");
		de.uni_paderborn.fujaba.muml.model.gen.c.main.Main gen0 = new de.uni_paderborn.fujaba.muml.model.gen.c.main.Main(modelURI, targetFolder.getLocation().toFile(), arguments);
		monitor.worked(1);
		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("de.uni_paderborn.fujaba.muml.model.gen.c", "de.uni_paderborn.fujaba.muml.model.gen.c.main.Main", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
		gen0.setGenerationID(generationID);
		gen0.doGenerate(BasicMonitor.toMonitor(monitor));
		monitor.worked(2);
		
		//TODO: Add to monitor
		
		//copy of needed files and command executions:
		monitor.subTask("Copying library files and generating messages...");
		try {
			//copy lib-folder
	        //URL source_url = new URL("platform:/plugin/de.uni_paderborn.fujaba.muml.model.gen.c/resources/");		
	        URL source_url = FileLocator.toFileURL(Platform.getBundle(de.uni_paderborn.fujaba.muml.model.gen.c.Activator.PLUGIN_ID).getEntry("resources"));
	        //File source = new File((FileLocator.resolve(source_url)).toURI().toString().substring(5)); // remove "file:"

			File source = new File(source_url.toURI());  
	        
		        //for every ecu
				for (HWPlatformInstance hpi : getCodeGenmodel(modelURI).getHpic().getHwplatformInstances()) {	
					for(ResourceInstance ri : hpi.getEmbeddedHPIC().getResources()){
						if (!(ri instanceof ActuatorInstanceImpl)&& !(ri instanceof SensorInstanceImpl)) { // TODO: This is bad, but DeviceInstace doesn't work...
							RefinedStructuredResourceInstance rsri = (RefinedStructuredResourceInstance) ri;
							
							File target = new File(targetFolder.getLocationURI().toString().substring(5) + File.separator + rsri.getName());
							
					        copyFolder(source, target);
					        
					        //run protobuf-message-gen
							String command = "java -jar " + target + File.separator + "messages" + File.separator + "protoc-1.0M4.jar -I=" + target + File.separator + "messages" + " --c_out=" + target + File.separator + "messages" + File.separator + " Messages.proto"; 
							
							String output = executeCommand(command);
							System.out.println(output);
							}
						}
					}
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		monitor.worked(3);
    }
	
	   public static CodGenAllocation getCodeGenmodel(URI model)
	    {
	    	ResourceSet resSet = new ResourceSetImpl();
	    	Resource resource = resSet.getResource(model, true);
	    	    // Get the first model element and cast it to the right type, in my
	    	    // example everything is hierarchical included in this first node
	    	CodGenAllocation cg = (CodGenAllocation) resource.getContents().get(0);
	        return cg;
	      }
	    
	    public static void copyFolder(File src, File dest)
	        	throws IOException{
	     
	        	if(src.isDirectory()){
	        		
	        		//ignore svn-folder...
	        		if(src.getName().equals(".svn")){
	        			return;
	        		}
	     
	        		//if directories not exists, create it
	        		if(!dest.exists()){
	        		   dest.mkdirs();
	        		}
	     
	        		//list all the directory contents
	        		String files[] = src.list();
	     
	        		for (String file : files) {
	        		   //construct the src and dest file structure
	        		   File srcFile = new File(src, file);
	        		   File destFile = new File(dest, file);
	        		   //recursive copy
	        		   copyFolder(srcFile,destFile);
	        		}
	     
	        	}else{        		   
	        		//if file, then copy it
	        		
	        		//needs java 7, so commented out :(
	        		//Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        		
	    	        byte[] buffer = new byte[1024];
	    	        int x;
	    	        InputStream input = new FileInputStream(src);
	    	        OutputStream output = new FileOutputStream(dest);
	    	        
	    	        while ((x = input.read(buffer)) > 0) 
	    	        {
	    	            output.write(buffer, 0, x);
	    	        }
	    	        input.close();
	    	        output.close();
	        	}
	        }
	    
		private String executeCommand(String command) {
			 
			StringBuffer output = new StringBuffer();
	 
			Process p;
			try {
				p = Runtime.getRuntime().exec(command);
				p.waitFor();
				BufferedReader reader = 
	                            new BufferedReader(new InputStreamReader(p.getInputStream()));
	 
	                        String line = "";			
				while ((line = reader.readLine())!= null) {
					output.append(line + "\n");
				}
	 
			} catch (Exception e) {
				e.printStackTrace();
			}
	 
			return output.toString();
	 
		}
	
	/**
	 * Finds the template in the plug-in. Returns the template plug-in URI.
	 * 
	 * @param bundleID
	 *            is the plug-in ID
	 * @param relativePath
	 *            is the relative path of the template in the plug-in
	 * @return the template URI
	 * @throws IOException
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private URI getTemplateURI(String bundleID, IPath relativePath) throws IOException {
		Bundle bundle = Platform.getBundle(bundleID);
		if (bundle == null) {
			// no need to go any further
			return URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		URL url = bundle.getEntry(relativePath.toString());
		if (url == null && relativePath.segmentCount() > 1) {
			Enumeration<URL> entries = bundle.findEntries("/", "*.emtl", true);
			if (entries != null) {
				String[] segmentsRelativePath = relativePath.segments();
				while (url == null && entries.hasMoreElements()) {
					URL entry = entries.nextElement();
					IPath path = new Path(entry.getPath());
					if (path.segmentCount() > relativePath.segmentCount()) {
						path = path.removeFirstSegments(path.segmentCount() - relativePath.segmentCount());
					}
					String[] segmentsPath = path.segments();
					boolean equals = segmentsPath.length == segmentsRelativePath.length;
					for (int i = 0; equals && i < segmentsPath.length; i++) {
						equals = segmentsPath[i].equals(segmentsRelativePath[i]);
					}
					if (equals) {
						url = bundle.getEntry(entry.getPath());
					}
				}
			}
		}
		URI result;
		if (url != null) {
			result = URI.createPlatformPluginURI(new Path(bundleID).append(new Path(url.getPath())).toString(), false);
		} else {
			result = URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		return result;
	}

}
