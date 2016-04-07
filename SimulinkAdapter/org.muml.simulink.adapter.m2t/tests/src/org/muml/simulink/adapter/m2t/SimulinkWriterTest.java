package org.muml.simulink.adapter.m2t;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.adapter.parser.SimulinkBuilder;
import org.muml.simulink.adapter.parser.SimulinkBuilderException;
import org.muml.simulink.test.TestBase;


public class SimulinkWriterTest extends TestBase
{
	private SimulinkBuilder builder = null;
	private SimulinkWriter writer = null;
	
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();
	
	@Before
	public void setUp()
	{
		this.builder = new SimulinkBuilder();
		this.writer = new SimulinkWriter();
	}
	
	@After
	public void tearDown()
	{
		this.builder = null;
		this.writer = null;
	}
	
	/**
	 * Check if model is still valid - e.g. after changing the meta model 
	 * @throws IOException
	 * @throws SimulinkBuilderException
	 */
	@Test
	public void simple_xmi() throws IOException, SimulinkBuilderException
	{
		SimulinkContainer sourceContainer = this.loadModel("data/Simulink/Simple.xmi");
		File containerFile = this.tmpFolder.newFile("Simple.mdl");
		this.writer.setModel(sourceContainer);
		this.writer.writeToFile(containerFile.toString());
		
		SimulinkContainer generatedContainer = this.builder.buildFromFile(containerFile.toString());
		assertModelIsValid(generatedContainer);
		
		assertEquals(sourceContainer.getModels().size(), generatedContainer.getModels().size());
		assertEquals(sourceContainer.getLibraries().size(), generatedContainer.getLibraries().size());

	}
	
	/**
	 * Only check if model is still valid
	 */
	@Test 
	public void simpleLibraryUsage_xmi()
	{
		this.loadModel("data/Simulink/SimpleLibraryUsage.xmi");
	}
	
	/**
	 * Only check if model is still valid
	 */
	@Test 
	public void simpleStateflow_xmi()
	{
		this.loadModel("data/Stateflow/SimpleStateflow.xmi");
	}	
	
	/**
	 * Only check if model is still valid
	 */
	@Test 
	public void simpleSubSystem_xmi()
	{
		this.loadModel("data/Simulink/SimpleSubSystem.xmi");
	}	
	
	/**
	 * Only check if model is still valid
	 */
	@Test 
	public void emptyStateflow_xmi()
	{
		this.loadModel("data/Stateflow/EmptyStateflow.xmi");
	}	
	
	/**
	 * Only check if model is still valid
	 */
	@Test 
	public void junctionsNoParameters_xmi()
	{
		this.loadModel("data/Stateflow/JunctionsNoParameters.xmi");
	}		
	
	/**
	 * Only check if model is still valid
	 */
	@Test 
	public void busCreatorBusSelector_xmi()
	{
		this.loadModel("data/Simulink/BusCreatorBusSelector.xmi");
	}		
	
	/**
	 * It is not good to have a reference to an empty subsystem. Looks like
	 * Simulink does not handle this correctly. So do not allow this in the model.
	 */
	@Test(expected=java.lang.AssertionError.class)
	public void Simulink_LibraryBadLink_xmi()
	{
		this.loadModel("data/Simulink/LibraryBadLink.xmi");
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
