package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.kronos.generator;


import java.io.File;
import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitorAdapter;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage;

public class KronosAutomatonWriter 
{
	private GtAutomaton model = null;
	
	public void setModel(GtAutomaton model)
	{
		this.model = model;
	}
	
	public GtAutomaton getModel()
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
		
		
		XpandExecutionContextImpl exeContext = new XpandExecutionContextImpl(output, null);
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
				packages[packages.length-1] = GtautomatonPackage.eINSTANCE;
				return packages;				
			}
		};
		exeContext.registerMetaModel(metaModel);		
		
		//Start XPand
		XpandFacade facade = XpandFacade.create(exeContext);
		
		facade.evaluate("src::templates::Root::Automaton", this.model, fileName);
	}


}
