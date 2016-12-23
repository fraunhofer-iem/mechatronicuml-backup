package org.muml.simulink.adapter.m2t.graphviz;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.test.TestBase;

public class GraphVizTestBase extends TestBase
{
	protected String loadDotFile(String name) throws IOException
	{
		final String filePrefix = "";
		URL fileURL = this.getClass().getResource( filePrefix + name);
		if(fileURL == null)
			throw new FileNotFoundException(filePrefix + name);
		File file = new File(fileURL.getFile());
		
		StringBuilder content = new StringBuilder();
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while((line = reader.readLine()) != null)
		{
			content.append(line);
			content.append("\n");
		}
		return content.toString();
	}
	
	protected StateflowMachine loadStateflowMachine(String fileName)
	{
		//Init model
		SimulinkPackage.eINSTANCE.eClass();
		
		//Register xmi factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());		
		try
		{
			Resource res = new ResourceSetImpl().getResource(URI.createURI(fileName), true);
			SimulinkContainer container = (SimulinkContainer)res.getContents().get(0);
			
			//Validate Model
			assertModelIsValid(container);

			return container.getModels().get(0).getStateflowMachine();
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			return null;
		}
	}	
}
