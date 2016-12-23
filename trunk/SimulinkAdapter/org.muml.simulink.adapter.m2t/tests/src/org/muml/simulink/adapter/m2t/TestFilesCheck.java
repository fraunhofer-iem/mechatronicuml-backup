package org.muml.simulink.adapter.m2t;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.test.TestBase;

@RunWith(Parameterized.class)
public class TestFilesCheck extends TestBase
{
	 @Parameters
	 public static Collection<Object[]> data() 
	 {
		 final List<String> exceptions = new LinkedList<String>();
		 exceptions.add("LibraryBadLink.xmi");

		 FilenameFilter xmiFilter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".xmi") && !exceptions.contains(name);
			}};
			
		LinkedList<File> files = new LinkedList<File>();
		
		//Simulink folder
		URL simulinkURL = TestFilesCheck.class.getResource("/Simulink/");		 
		File simulinkDir = new File(simulinkURL.getPath());		 
		files.addAll(Arrays.asList(simulinkDir.listFiles(xmiFilter)));
		
		//Stateflow folder
		URL stateflowURL = TestFilesCheck.class.getResource("/Stateflow/");		 
		File stateflowDir = new File(stateflowURL.getPath());		 
		files.addAll(Arrays.asList(stateflowDir.listFiles(xmiFilter)));		
		 
		Object[][] data = new Object[files.size()][1];		
		for(int i= 0; i < files.size(); i++)
			data[i][0] = files.get(i).getAbsolutePath();
	   return Arrays.asList(data);
	 }	
	
	private String fileName = "";
	
	public TestFilesCheck(String fileName)
	{
		this.fileName = fileName;
	}
	
	@Test
	public void checkModelisValid()
	{
		this.loadModel(this.fileName);
	}
	
	protected SimulinkContainer loadModel(String fileName)
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

			return container;
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			return null;
		}
	}	

}
