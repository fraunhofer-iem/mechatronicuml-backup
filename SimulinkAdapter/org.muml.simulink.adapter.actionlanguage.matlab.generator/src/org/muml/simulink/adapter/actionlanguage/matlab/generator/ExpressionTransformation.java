package org.muml.simulink.adapter.actionlanguage.matlab.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.muml.core.ExtendableElement;
import org.muml.pim.actionlanguage.ActionlanguagePackage;


/**
 * Replaces class ExpressionAnnotator
 *
 */
public class ExpressionTransformation {
		
	public String generate(EObject source)
	{
		File file;
		try {
			file = File.createTempFile("ExpressionTransformation", "txt");
		} catch (IOException e1) {
			e1.printStackTrace();
			return e1.getLocalizedMessage();
		}
		
		XpandFacade facade = initXpand(file);
		facade.evaluate("template::Template::main", source);		
		
		//Read output
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));		
			StringBuffer buffer = new StringBuffer();
			
			String line;
			while ((line = reader.readLine()) != null) {				
				buffer.append(line);				
			}
							
			reader.close();	
			return buffer.toString();
		} 
		catch(Exception e)
		{
			e.printStackTrace();			
			return e.getLocalizedMessage();
		}		
		
	}
	
	public List<String> generateAll(List<ExtendableElement> sources)
	{
		List<String> retval = new ArrayList<String>(sources.size());
	
		if(sources.size() == 0)
			return retval;
		
		File file;
		try {
			file = File.createTempFile("ExpressionTransformation", "txt");
		} catch (IOException e1) {
			e1.printStackTrace();
			return retval;
		}
		
		XpandFacade facade = initXpand(file);
		facade.evaluate("template::Template::main", sources);		
		
		//Read output
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));		
			StringBuffer buffer = new StringBuffer();
			
			String line;
			while ((line = reader.readLine()) != null) {
				if(line.startsWith("»»"))
				{
					retval.add(buffer.toString().trim());
					buffer.delete(0, buffer.length());
				}
				else
				{
					buffer.append(line);
				}
			}
			retval.add(buffer.toString());	
			reader.close();	
		} 
		catch(Exception e)
		{
			e.printStackTrace();			
			return retval;
		}
		return retval;
	}	

	private XpandFacade initXpand(File file) {
		//Init XPand
		Output output = new OutputImpl();
		Outlet outlet = new Outlet();

		outlet.setOverwrite(true);
		outlet.setPath(file.getParent());
		output.addOutlet(outlet);
		
		HashMap<String, Variable> globalVars = new HashMap<String, Variable>();
		globalVars.put("output", new Variable("output", file.getName()));
		
		XpandExecutionContextImpl exeContext = new XpandExecutionContextImpl(output, null, globalVars, null, null);
	
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
				packages[packages.length-1] = ActionlanguagePackage.eINSTANCE;
				return packages;				
			}
		};
		exeContext.registerMetaModel(metaModel);		
		
		//Start XPand
		XpandFacade facade = XpandFacade.create(exeContext);
		return facade;
	}
	


}
