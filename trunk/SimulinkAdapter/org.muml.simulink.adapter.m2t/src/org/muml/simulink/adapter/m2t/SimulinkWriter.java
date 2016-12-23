package org.muml.simulink.adapter.m2t;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitorAdapter;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkPackage;

public class SimulinkWriter 
{
	protected SimulinkContainer model = null;
	protected Map<String, Variable> globalVars = new HashMap<String, Variable>();
	
	public void setModel(SimulinkContainer model)
	{
		this.model = model;
	}
	
	public SimulinkContainer getModel()
	{
		return this.model;
	}
	
	public void writeToFile(String fileName)
	{
		this.writeToFile(fileName, new NullProgressMonitor());
		
	}
	
	public void writeToFile(String fileName, IProgressMonitor monitor)
	{
		assert(this.model != null);
		
		File file = new File(fileName);
				
		//Init XPand
		Output output = new OutputImpl();
		Outlet outlet = new Outlet();

		outlet.setOverwrite(true);
		outlet.setPath(file.getParent());
		output.addOutlet(outlet);
		
		
		XpandExecutionContextImpl exeContext = new XpandExecutionContextImpl(output, null, this.globalVars, null, null);
		//if(monitor != null)
			exeContext.setMonitor(new ProgressMonitorAdapter(monitor));
	
		//Register Meta-Model
		EmfRegistryMetaModel metaModel = new EmfRegistryMetaModel() 
		{
			@Override
			protected EPackage[] allPackages()
			{
				//Add our own package
				EPackage[] parentPackages = super.allPackages();
				EPackage[] packages = new EPackage[parentPackages.length+1];
				for(int i =0; i < parentPackages.length; i++)
					packages[i] = parentPackages[i];
				packages[packages.length-1] = SimulinkPackage.eINSTANCE;
				return packages;				
			}
		};
		exeContext.registerMetaModel(metaModel);
		
		//Start XPand
		XpandFacade facade = XpandFacade.create(exeContext);
		
		facade.evaluate("src::templates::SimulinkContainer::main", this.model,file.getName().replace(".mdl" , ""));
	}
	
	public void copyFile(URL source, URL target)
	{
		try {
			InputStream input = source.openStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(input));
			File targetFile = new File(target.toURI());
			targetFile.createNewFile();
			OutputStream output = new FileOutputStream(targetFile);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(output));
			char[] buffer = new char[0xFFFF];
			int len;
			while( (len = in.read(buffer)) != -1)
		        out.write( buffer, 0, len );		      
			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public void setGlobalVar(String name, Object value)
	{
		this.globalVars.put(name, new Variable(name, value));
	}

}
