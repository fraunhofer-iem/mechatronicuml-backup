package org.muml.simulink.adapter.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

import org.eclipse.emf.ecore.EObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.Block;
import org.muml.simulink.Bus;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusSelector;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.Constant;
import org.muml.simulink.DataType;
import org.muml.simulink.DigitalClock;
import org.muml.simulink.EmbeddedMatlabFunction;
import org.muml.simulink.EnablePort;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.LibraryReference;
import org.muml.simulink.Line;
import org.muml.simulink.MiscBlock;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.Parameter;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkFile;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SubSystem;
import org.muml.simulink.TriggerEvent;
import org.muml.simulink.TriggerPort;
import org.muml.simulink.UnitDelay;
import org.muml.simulink.ZeroOrderHold;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.test.TestBase;

import edu.tum.cs.commons.logging.SimpleLogger;
import edu.tum.cs.simulink.builder.SimulinkModelBuilder;


public class SimulinkBuilderTest extends TestBase
{
	private SimulinkBuilder builder = null;
	
	@Before
	public void setUp()
	{
		
		this.builder = new SimulinkBuilder();
	}
	
	@After
	public void tearDown()
	{
		this.builder = null;		
	}
	
	@Test
	public void usage() throws SimulinkBuilderException
	{
		SimulinkBuilder sb = new SimulinkBuilder();
		SimulinkModel model = sb.buildModel(new edu.tum.cs.simulink.model.SimulinkModel(new File("not existing"), true));
		assertNotNull(model);
	}
	
	@Test
	public void buildModel() throws SimulinkBuilderException
	{
		edu.tum.cs.simulink.model.SimulinkModel sourceModel = this.createExamleSourceModel(); 
		
		SimulinkModel targetModel = this.builder.buildModel(sourceModel); 
		
		assertEquals(2, targetModel.getBlocks().size());
	}
	
	@Test
	public void buildBlock() throws SimulinkBuilderException
	{
		edu.tum.cs.simulink.model.SimulinkBlock sourceBlock = new edu.tum.cs.simulink.model.SimulinkBlock();
		sourceBlock.setParameter("BlockType", "Constant");
		Block block = this.builder.buildBlock(sourceBlock);
		assertNotNull(block);
	}
	
	@Test
	public void buildLine() throws SimulinkBuilderException
	{
		edu.tum.cs.simulink.model.SimulinkModel sourceModel = this.readSourceModel("tests/data/Simulink/Simple.mdl");
		SimulinkModel targetModel = this.builder.buildModel(sourceModel);
		
		assertEquals(1,targetModel.getLines().size());
		
		Line line = targetModel.getLines().get(0);
		
		assertNull("Line should not have simulink parameter SrcPort",line.getParameter("SrcPort"));
		assertNull("Line should not have simulink parameter SrcBlock",line.getParameter("SrcBlock"));
		assertNull("Line should not have simulink parameter DstPort",line.getParameter("DstPort"));
		assertNull("Line should not have simulink parameter DstBlock",line.getParameter("DstBlock"));
		
		assertNotNull("Line should have a source port", line.getSourcePort());
		assertNotNull("Line should have a source block", line.getSourceBlock());
		assertNotNull("Line should have a target port" ,line.getTargetPort());
		assertNotNull("Line should have a target block" ,line.getTargetBlock());
	}
	
	@Test
	public void copyBlockParameters() throws SimulinkBuilderException
	{
		final String paramValue = "SomeParameterValue";
		final String paramName = "SomeParameterName";
		edu.tum.cs.simulink.model.SimulinkBlock sourceBlock = new edu.tum.cs.simulink.model.SimulinkBlock();
		sourceBlock.setParameter("BlockType", "Constant");
		sourceBlock.setParameter(paramName, paramValue);
		Block targetBlock = this.builder.buildBlock(sourceBlock);
		
		assertEquals(paramValue, targetBlock.getParameter(paramName));
	}
	
	@Test
	public void copyModelParameters() throws SimulinkBuilderException
	{
		final String paramValue = "SomeValue";
		final String paramName = "SomeParameter";
		edu.tum.cs.simulink.model.SimulinkModel sourceModel = new edu.tum.cs.simulink.model.SimulinkModel(new File("not existing"), false);
		sourceModel.setParameter(paramName, paramValue);
		SimulinkModel targetModel = this.builder.buildModel(sourceModel);
		
		assertEquals(paramValue, targetModel.getParameter(paramName));
	}	
	
//	@Test - Not a real test
	public void buildModelAndSaveToFile() throws IOException, SimulinkBuilderException
	{
		this.builder.buildModelAndSaveToFile(this.createExamleSourceModel(), "example.xmi");
	}
	
	/**
	 * The Name-Parameter of a block should be transfered to the name attribute
	 * @throws SimulinkBuilderException 
	 */
	@Test
	public void mapNameParameterToAttribute() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/Simple.mdl").getModels().get(0);
		
		assertEquals("Simple", model.getName());
		assertEquals(null,model.getParameter("Name"));
		
		
		Block constant = model.getBlockByName("Constant");
		assertNotNull("Block named 'Constant' not found",constant);
		assertEquals("Constant", constant.getName());
		assertEquals(null, constant.getParameter("Name"));		
	}
	
	/**
	 * The BlockType parameter should be mapped to the type parameter in the MiscBlock
	 * @throws SimulinkBuilderException
	 */
	@Test
	public void mapBlocktypeParameterToAttribute() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/Simple.mdl").getModels().get(0);
		
		MiscBlock terminator = (MiscBlock)model.getBlockByName("Terminator");
		assertNotNull("Block named Terminator is not available",terminator);

		assertNull("MiscBlock has a BlockType parameter",terminator.getParameter("BlockType"));
		assertNotNull("MiscBlock does not have a type attribute set", terminator.getType());
	}
	
	@Test
	public void simple_mdl() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/Simple.mdl").getModels().get(0); 
		
		assertModelIsValid(model);
		
		assertEquals(2, model.getBlocks().size());
		
		assertEquals(1, model.getLines().size());
		
		assertEquals("Simple", model.getName());
	}
	
	@Test
	public void simpleSubSystem_mdl() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/SimpleSubSystem.mdl").getModels().get(0);
		
		assertModelIsValid(model);
		
		assertEquals(3, model.getBlocks().size());
		assertEquals(1, model.getSubSystems().size());
		assertEquals(2, model.getLines().size());
		
		SubSystem subSystem = (SubSystem)model.getBlockByName("SubSystem");		
		assertNotNull("Block SubSystem not found",subSystem);
		
		assertEquals(3, subSystem.getAllBlocks().size());
		assertEquals(1, subSystem.getSubSystems().size());
		assertEquals(2, subSystem.getLines().size());
		
		SubSystem subSubSystem = (SubSystem) subSystem.getBlockByName("SubSubSystem");		
		assertNotNull("Block SubSubSystem not found",subSubSystem);
		
		assertEquals(2, subSubSystem.getAllBlocks().size());
		assertEquals(1, subSubSystem.getLines().size());
		
		assertEquals(1, subSubSystem.getInPorts().size());
		assertEquals(1, subSubSystem.getOutPorts().size());
	}
	
	@Test
	public void emptyStateflow_mdl() throws SimulinkBuilderException
	{
		SimulinkModel targetModel = this.builder.buildFromFile("tests/data/Stateflow/EmptyStateflow.mdl").getModels().get(0);
		
		assertModelIsValid(targetModel);
		
		assertNotNull("Model is missing a StateflowMachine", targetModel.getStateflowMachine());
		assertEquals("EmptyStateflow", targetModel.getStateflowMachine().getParameter("name"));
	}
	
	@Test
	public void simpleLibrary_mdl() throws SimulinkBuilderException
	{
		SimulinkContainer simRoot = this.builder.buildFromFile("tests/data/Simulink/SimpleLibrary.mdl");
		assertModelIsValid(simRoot);
		
		assertEquals(0, simRoot.getModels().size());
		assertEquals(1, simRoot.getLibraries().size());
	}
	
	@Test
	public void simpleLibraryUsage_mdl() throws SimulinkBuilderException
	{
		SimulinkContainer simRoot = this.builder.buildFromFile("tests/data/Simulink/SimpleLibraryUsage.mdl");
		assertModelIsValid(simRoot);
		assertEquals(1, simRoot.getModels().size());
		assertEquals(1, simRoot.getLibraries().size());
	}	
	
	@Test 
	public void lineBranch_mdl() throws SimulinkBuilderException
	{
		SimulinkModel targetModel = this.builder.buildFromFile("tests/data/Simulink/LineBranch.mdl").getModels().get(0);
		assertModelIsValid(targetModel);
		assertEquals(2, targetModel.getLines().size());
		
		Block constantBlock = targetModel.getBlockByName("Constant");
		assertNotNull(constantBlock);
		Block scope = targetModel.getBlockByName("Scope");
		assertNotNull(scope);
		Block scope1 = targetModel.getBlockByName("Scope1");
		assertNotNull(scope1);
		
		assertEquals("Line does not target scope", constantBlock, scope.getIncomingLines().get(0).getSourceBlock());
		assertEquals("Line does not target scope1", constantBlock, scope1.getIncomingLines().get(0).getSourceBlock());
	}
	
	@Test
	public void ports_mdl() throws SimulinkBuilderException
	{
		SimulinkModel targetModel = this.builder.buildFromFile("tests/data/Simulink/Ports.mdl").getModels().get(0);
		assertModelIsValid(targetModel);
		
		InPortBlock parentIn1 = (InPortBlock) targetModel.getBlockByName("ParentIn1");
		assertNotNull("ParentIn1 should be a block", parentIn1);
		OutPortBlock parentOut1 = (OutPortBlock) targetModel.getBlockByName("ParentOut1");
		assertNotNull("ParentOut1 should be a block", parentOut1);
		
		SubSystem subSystem = targetModel.getSubSystems().get(0);
		assertNotNull("Model should contain a subsystem");
		
		assertNotNull("SubSystem should contain a InPortBlock", subSystem.getBlockByName("SubIn1"));
		assertNotNull("SubSystem should contain a OutPortBlock", subSystem.getBlockByName("SubOut1"));
		assertEquals(1, subSystem.getInPorts().size());
		assertEquals(1, subSystem.getOutPorts().size());
				
	}
	
	
	/**
	 * A simple model that contains only a subsystem with two out ports and
	 * a Scope with a single Inport 
	 * @throws SimulinkBuilderException 
	 */
	@Test
	public void plainPorts_mdl() throws SimulinkBuilderException
	{
		SimulinkModel genModel = this.builder.buildFromFile("tests/data/Simulink/PlainPorts.mdl").getModels().get(0);
		assertModelIsValid(genModel);
		
		assertEquals(2, genModel.getBlocks().size());
		assertEquals(0, genModel.getInPorts().size());
		assertEquals(0, genModel.getOutPorts().size());
		
		SubSystem genSubSystem = genModel.getSubSystems().get(0);
		
		assertEquals(0, genSubSystem.getInPorts().size());
		assertEquals(2, genSubSystem.getOutPorts().size());
		assertEquals("Out1", genSubSystem.getOutPorts().get(0).getName());
		assertEquals("Out2", genSubSystem.getOutPorts().get(1).getName());
		assertEquals(DataType.UINT8, genSubSystem.getOutPorts().get(0).getType());
		
		assertEquals(0, genSubSystem.getBlocks().size());
		assertEquals(2, genSubSystem.getAllBlocks().size());
		
		//Scope		
		MiscBlock scope = (MiscBlock) genModel.getBlockByName("Scope");
		assertNotNull("Block named 'Scope' not found");
		
		assertEquals(1,scope.getInPorts().size());				
	}
	
	
	@Test
	public void multiPort_mdl() throws SimulinkBuilderException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/Simulink/MultiPort.mdl");
		assertModelIsValid(container);
		
		assertEquals(1, container.getModels().size());
		SimulinkModel model = container.getModels().get(0);
		
		assertEquals(2,model.getLines().size());
		
		SubSystem subSystem = (SubSystem) model.getBlockByName("Subsystem");
		assertNotNull("Model should contain a SubSystem named Subsystem", subSystem);
		
		assertEquals(2, subSystem.getOutPorts().size());
		assertEquals(0, subSystem.getInPorts().size());
		
		
		
		//First line connects SubSystem/Out1 (1. Port) and Out1 (1. Port)
		assertEquals(model.getOutPorts().get(0).getIncomingLines().get(0).getSourcePort(), subSystem.getOutPorts().get(0));
		
		//Second line connects SubSystem/Out2 (2. Port) and Out2 (2. Port)
		assertEquals(model.getOutPorts().get(1).getIncomingLines().get(0).getSourcePort(), subSystem.getOutPorts().get(1));
	}	
	
	/**
	 * Simulink saves a chart in a subsysstem with 4 blocks: Ground->SFunction->Demux->Terminator
	 * We want to merge them into a single block.
	 * @throws SimulinkBuilderException
	 */
	@Test
	public void mergeBlocksToChartBlock() throws SimulinkBuilderException
	{
		SimulinkModel genModel = this.builder.buildFromFile("tests/data/Stateflow/EmptyStateflow.mdl").getModels().get(0);
		assertModelIsValid(genModel);
		
		assertEquals(1, genModel.getAllBlocks().size());
		assertNotNull("Model does not contain a StateflowMachine", genModel.getStateflowMachine());
		
		Block chartBlock = genModel.getAllBlocks().get(0);
		
		assertTrue("Model does not contain a ChartBlock", chartBlock instanceof ChartBlock);
		assertEquals("Chart", chartBlock.getName());
		
		assertNotNull("ChartBlock does not reference a chart", ((ChartBlock)chartBlock).getChart());
	}
	
	@Test
	public void twoCharts_mdl() throws SimulinkBuilderException
	{
		SimulinkModel genModel = this.builder.buildFromFile("tests/data/Stateflow/TwoCharts.mdl").getModels().get(0);
		assertModelIsValid(genModel);
		
		assertEquals(2, genModel.getAllBlocks().size());
		
		final String chartOneName = "ChartOne";
		ChartBlock chartOne = (ChartBlock) genModel.getBlockByName(chartOneName);
		assertNotNull("Model does not contain ChartBlock ChartOne", chartOne);
		assertNotNull("ChartOne does not reference a chart", chartOne.getChart());
		
		final String chartTwoName = "ChartTwo";
		ChartBlock chartTwo = (ChartBlock) genModel.getBlockByName(chartTwoName);
		assertNotNull("Model does not contain ChartBlock ChartTwo", chartTwo);
		assertNotNull("ChartTwo does not reference a chart", chartTwo.getChart());
		
		assertEquals(chartOneName, chartOne.getChart().getName());
		assertEquals(chartTwoName, chartTwo.getChart().getName());		
	}
	
	/**
	 * Ref1 -> Ref2 -> Ref3
	 * @throws SimulinkBuilderException
	 */
	@Test
	public void ultimateReferenceTest_mdl() throws SimulinkBuilderException
	{
		SimulinkContainer genContainer = this.builder.buildFromFile("tests/data/Simulink/UltimateReferenceTest.mdl");
		assertModelIsValid(genContainer);
				
		SimulinkModel genModel = genContainer.getModels().get(0);
		
		Block genRef1 = genModel.getBlockByName("Ref1");
		assertNotNull("Model should contain block named Ref1", genRef1);
		Block genRef2 = genModel.getBlockByName("Ref2");
		assertNotNull("Model should contain block named Ref2", genRef2);
		Block genRef3 = genModel.getBlockByName("Ref3");
		assertNotNull("Model should contain block named Ref3", genRef3);
		
		//There is a line connection Ref1 -> Ref2
		assertEquals(genRef2, genRef1.getOutgoingLines().get(0).getTargetBlock());

		//There is a line connection Ref2 -> Ref3
		assertEquals(genRef3, genRef2.getOutgoingLines().get(0).getTargetBlock());
		
		assertEquals(2, genModel.getLines().size());
	}
	
	/**
	 * A LibraryReference references an Block that is in the same file.
	 */
	@Test
	public void LibrarySelfReference_mdl() throws SimulinkBuilderException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/Simulink/LibSelfReference.mdl");
		assertModelIsValid(container);
		
		SimulinkLibrary library = container.getLibraries().get(0);
		
		SubSystem referencedSystem = (SubSystem) library.getBlockByName("ReferencedSystem");
		assertNotNull(referencedSystem);
		
		SubSystem systemWithReference = (SubSystem) library.getBlockByName("SystemWithReference");
		assertNotNull(systemWithReference);
		
		LibraryReference reference = (LibraryReference) systemWithReference.getBlockByName("ReferencedSystem");
		assertNotNull(reference);
		
		assertEquals(referencedSystem, reference.getSourceBlock());
	}
	
	@Test
	public void bus() throws SimulinkBuilderException, FileNotFoundException, IOException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/Simulink/Bus.mdl");		
		assertModelIsValid(container);
		
		SimulinkModel model = container.getModels().get(0);
		assertEquals(3, model.getLines().size());
		
		assertEquals(1, model.getBuses().size());		
		Bus bus = model.getBuses().get(0);
		assertEquals("Bus", bus.getName());		
		
		SubSystem busConsumer = (SubSystem) model.getBlockByName("BusConsumer");
		assertEquals(bus, busConsumer.getIncomingLines().get(0).getBus());
		
		BusCreator busCreator = (BusCreator) busConsumer.getIncomingLines().get(0).getSourceBlock();
		assertNotNull("BusCreator not available", busCreator);
		assertEquals(bus, busCreator.getBus());		
	}
	
	@Test
	public void busCreatorBusSelector() throws SimulinkBuilderException, FileNotFoundException, IOException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/Simulink/BusCreatorBusSelector.mdl");		
		assertModelIsValid(container);
		
		assertEquals(1, container.getModels().get(0).getBuses().size());
		Bus bus = container.getModels().get(0).getBuses().get(0);
		
		SubSystem busProducer = (SubSystem) container.getModels().get(0).getBlockByName("BusProducer");
		assertNotNull("BusProducer not available", busProducer);
		SubSystem busConsumer = (SubSystem) container.getModels().get(0).getBlockByName("BusConsumer");
		assertNotNull("BusConsumer not available", busConsumer);
		
		BusCreator busCreator = (BusCreator) busProducer.getOutgoingLines().get(0).getTargetBlock();
		assertNotNull("BusCreator not available", busCreator);
		BusSelector busSelector = (BusSelector) busConsumer.getIncomingLines().get(0).getSourceBlock();
		assertNotNull("BusSelector not available", busSelector);
		
		assertEquals(bus, busCreator.getBus());
		assertEquals(bus, busSelector.getBus());
	}
	
	@Test
	public void busDirectPorts() throws SimulinkBuilderException, FileNotFoundException, IOException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/Simulink/BusDirectPorts.mdl");		
		assertModelIsValid(container);
		
		assertEquals(1, container.getModels().get(0).getBuses().size());
		Bus bus = container.getModels().get(0).getBuses().get(0);
		
		Line busLine = container.getModels().get(0).getLines().get(0);
		
		assertEquals(bus, busLine.getBus());
	}
	
	@Test
	public void id() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/SimpleSubSystem.mdl").getModels().get(0);
		
		assertModelIsValid(model);
		
		SubSystem subSystem = (SubSystem)model.getBlockByName("SubSystem");		
		assertNotNull("Block SubSystem not found",subSystem);
		assertEquals("_SUBSYSTEMTESTIDgVdmhug",subSystem.getId());
					
		SubSystem subSubSystem = (SubSystem) subSystem.getBlockByName("SubSubSystem");		
		assertNotNull("Block SubSubSystem not found",subSubSystem);
		assertEquals("_SUBSUBSYSTEMTESTIDgVdm", subSubSystem.getId());
	}
	
	@Test
	public void idPattern()
	{
		assertTrue(SimulinkBuilder.ID_PATTERN.matcher("id=_NWvG0ASGEeGr2ONgVdmhug").matches());
		assertTrue(SimulinkBuilder.ID_PATTERN.matcher("id=_cvwp0ASHEeGLSI55IOv8mA").matches());
		assertTrue(SimulinkBuilder.ID_PATTERN.matcher("id=_xOqMQAh_EeG2_Ibj11BAyw").matches());
		assertTrue(SimulinkBuilder.ID_PATTERN.matcher("id=_-qiikAh_EeGMBvZA9pTcDQ").matches());
		
		//too short
		assertFalse(SimulinkBuilder.ID_PATTERN.matcher("id=cvwp0ASHEeGLSI55IOv8mA").matches());
		
		//extract id
		Matcher stateflowTagMatcher = SimulinkBuilder.ID_PATTERN.matcher("100 T\\\"id=_pb5y4AiFEeGC-uEDbqF2Vw\\\"");
		assertTrue(stateflowTagMatcher.find());
		assertEquals("_pb5y4AiFEeGC-uEDbqF2Vw",stateflowTagMatcher.group(1));
		
	}

	@Test
	public void embeddedMatlabFunction() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/EmbeddedMatlabFunction.mdl").getModels().get(0);		
		assertModelIsValid(model);		
		
		//In Simulink EMF are modeled as charts. We don't want to have this
		// in our model.
		assertEquals(2, model.getBlocks().size());
		assertNull(model.getStateflowMachine());
		
		EmbeddedMatlabFunction emf = (EmbeddedMatlabFunction) model.getBlocks().get(0);
		
		assertTrue(emf.getCode().contains("y = u"));
		
		assertEquals(1, emf.getInPorts().size());
		assertEquals(1, emf.getOutPorts().size());
		
		assertNotNull(emf.getInPorts().get(0).getType());
		assertEquals(DataType.UINT8, emf.getInPorts().get(0).getType());
		
		assertNotNull(emf.getOutPorts().get(0).getType());
		assertEquals(DataType.UINT8, emf.getOutPorts().get(0).getType());
	}
	
	@Test
	public void unitDelay() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/UnitDelay.mdl").getModels().get(0);		
		assertModelIsValid(model);		
		
		assertEquals(1, model.getBlocks().size());
		assertTrue(model.getBlocks().get(0) instanceof UnitDelay);
		
		UnitDelay unitDelay = (UnitDelay) model.getBlocks().get(0);
		assertEquals("Unit Delay", unitDelay.getName());
		assertEquals(1, unitDelay.getInPorts().size());
		assertEquals(1, unitDelay.getOutPorts().size());
	}	
	
	@Test
	public void linkLayer() throws SimulinkBuilderException
	{
		SimulinkContainer container = this.builder.buildFromFile("tests/data/MUML/LinkLayer.mdl");		
		assertModelIsValid(container);
		
		SimulinkFile model = container.getLibraries().get(0);
		
		assertEquals(1, model.getBlocks().size());
		
		SubSystem linkLayer = (SubSystem) model.getBlockByName("Link Layer");
		assertNotNull(linkLayer);
		
		BusCreator busCreator = (BusCreator) linkLayer.getBlockByName("Bus\\nCreator");
		assertNotNull(busCreator);
		assertNotNull(busCreator.getBus());
		
		BusSelector busSelector = (BusSelector) linkLayer.getBlockByName("Bus\\nSelector");
		assertNotNull(busSelector);
		
		Line lineSelector = busSelector.getIncomingLines().get(0);
		assertNotNull(lineSelector);
		assertNotNull(lineSelector.getBus());
		
		assertNotNull(busSelector.getBus());
	}
	
	@Test
	public void digitalClock() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/DigitalClock.mdl").getModels().get(0);		
		assertModelIsValid(model);		
		
		assertTrue("Element is not of type DigitalClock",model.getBlockByName("Digital Clock") instanceof DigitalClock);
		DigitalClock clock = (DigitalClock) model.getBlockByName("Digital Clock");
		assertEquals(1, clock.getSampleTime(), 0.1);
	}
	
	@Test
	public void constant() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/Constant.mdl").getModels().get(0);		
		assertModelIsValid(model);		
		
		assertEquals(1, model.getBlocks().size());
		assertTrue(model.getBlocks().get(0) instanceof Constant);
		
		Constant constant = (Constant) model.getBlocks().get(0);
		assertEquals("Constant", constant.getName());
		assertEquals(0, constant.getInPorts().size());
		assertEquals(1, constant.getOutPorts().size());
		assertEquals(DataType.UINT16, constant.getType());
		assertEquals("42", constant.getValue());
	}
	
	@Test
	public void portDimensions() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/PortDimensions.mdl").getModels().get(0);		
		assertModelIsValid(model);	
		
		SubSystem subSystem = (SubSystem) model.getBlocks().get(0);
		assertEquals("5",subSystem.getInPorts().get(0).getDimensions());
		assertEquals("5",subSystem.getOutPorts().get(0).getDimensions());
	}
	
	@Test
	public void portOrderInChartBlocks() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/NestedChartBlock.mdl").getModels().get(0);
		SubSystem subSystem = (SubSystem) model.getBlocks().get(0);
		ChartBlock chartBlock = (ChartBlock) subSystem.getBlocks().get(0);
		assertEquals("in1", chartBlock.getInPorts().get(0).getName());
		assertEquals("in2", chartBlock.getInPorts().get(1).getName());
		assertEquals("out1", chartBlock.getOutPorts().get(0).getName());
		assertEquals("out2", chartBlock.getOutPorts().get(1).getName());
	}
	
	@Test
	public void portOrderInEMF() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/NestedEMF.mdl").getModels().get(0);
		SubSystem subSystem = (SubSystem) model.getBlocks().get(0);
		EmbeddedMatlabFunction emf = (EmbeddedMatlabFunction) subSystem.getBlocks().get(0);
		assertEquals("in1", emf.getInPorts().get(0).getName());
		assertEquals("in2", emf.getInPorts().get(1).getName());
		assertEquals("out1", emf.getOutPorts().get(0).getName());
		assertEquals("out2", emf.getOutPorts().get(1).getName());
	}	
	
	@Test
	public void nestedChartBlock_mdl() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/NestedChartBlock.mdl").getModels().get(0);
		assertModelIsValid(model);
		Chart chart = model.getStateflowMachine().getCharts().get(0);
		
		for(Data in: chart.getInput())
		{
			assertEquals(DataType.INHERIT, in.getType());
		}
		
		for(Data out: chart.getOutput())
		{
			assertEquals(DataType.DOUBLE, out.getType());
		}		
		
		for(OutPortBlock outPort: chart.getBlock().getOutPorts())
		{
			assertEquals(DataType.INHERIT, outPort.getType());
		}

	}		
	
	@Test
	public void busWoObject_mdl() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/BusWoObject.mdl").getModels().get(0);
		assertModelIsValid(model);
		
		BusCreator busCreator = (BusCreator) model.getBlockByName("Bus\\nCreator");
		assertNotNull("Bus\\nCreator not found", busCreator);
		assertEquals(1, busCreator.getOutPorts().size());
		assertEquals("ab", busCreator.getOutPorts().get(0).getName());
		assertEquals(2, busCreator.getInPorts().size());
		assertEquals("a", busCreator.getInPorts().get(0).getName());
		assertEquals("b", busCreator.getInPorts().get(1).getName());
		
		BusCreator busCreator1 = (BusCreator) model.getBlockByName("Bus\\nCreator1");
		assertNotNull("Bus\\nCreator1 not found", busCreator);
		assertEquals(1, busCreator1.getOutPorts().size());
		assertNull(busCreator1.getOutPorts().get(0).getName());
		assertEquals(2, busCreator1.getInPorts().size());
		assertEquals("ab", busCreator1.getInPorts().get(0).getName());
		assertNull(busCreator1.getInPorts().get(1).getName());		
		
		BusSelector busSelector = (BusSelector) model.getBlockByName("Bus\\nSelector");
		assertNotNull("Bus\\nSelector not found", busSelector);
		assertEquals(1, busSelector.getInPorts().size());
		assertEquals(null, busSelector.getInPorts().get(0).getName());
		assertEquals(2, busSelector.getOutPorts().size());
		assertEquals("ab", busSelector.getOutPorts().get(0).getName());
		assertEquals("ab.b", busSelector.getOutPorts().get(1).getName());
		
		BusSelector busSelector1 = (BusSelector) model.getBlockByName("Bus\\nSelector1");
		assertNotNull("Bus\\nSelector1 not found", busSelector1);
		assertEquals(1, busSelector1.getInPorts().size());
		assertEquals(null, busSelector1.getInPorts().get(0).getName());
		assertEquals(2, busSelector1.getOutPorts().size());
		assertEquals("a", busSelector1.getOutPorts().get(0).getName());
		assertEquals("b", busSelector1.getOutPorts().get(1).getName());		
	}
	
	@Test
	public void enabledSubSystem() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/EnabledSubSystem.mdl").getModels().get(0);
		assertModelIsValid(model);
		
		SubSystem enabledSubSystem = (SubSystem) model.getBlockByName("Enabled\\nSubsystem");
		assertNotNull("EnabledSubSystem not found", enabledSubSystem);
		
		assertEquals(0, enabledSubSystem.getBlocks().size());		
		assertEquals(2, enabledSubSystem.getInPorts().size());
		
		EnablePort enablePort = null;
		for(InPortBlock inPort: enabledSubSystem.getInPorts())
			if(inPort instanceof EnablePort)
				enablePort = (EnablePort) inPort;
		assertNotNull("No EnablePort found", enablePort);
		
		assertNotNull(enablePort.getParameter("Position"));
		
		assertEquals("In1", model.getBlockByName("Constant").getOutgoingLines().get(0).getTargetPort().getName());
	}
	
	@Test
	public void triggeredSubSystem() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/TriggeredSubSystem.mdl").getModels().get(0);
		assertModelIsValid(model);
		
		SubSystem triggeredSubSystem = (SubSystem) model.getBlockByName("Triggered\\nSubsystem");
		assertNotNull("TriggeredSubSystem not found", triggeredSubSystem);
		
		assertEquals(0, triggeredSubSystem.getBlocks().size());
		assertEquals(2, triggeredSubSystem.getInPorts().size());
		
		TriggerPort triggerPort = null;
		for(InPortBlock inPort: triggeredSubSystem.getInPorts())
			if(inPort instanceof TriggerPort)
				triggerPort = (TriggerPort) inPort;
		assertNotNull("No TriggerPort found", triggerPort);
		
		assertEquals(TriggerEvent.EITHER, triggerPort.getTriggerInput());
		assertNotNull(triggerPort.getParameter("Position"));
	}	
	
	@Test
	public void zeroOrderHold() throws SimulinkBuilderException
	{
		SimulinkModel model = this.builder.buildFromFile("tests/data/Simulink/ZeroOrderHold.mdl").getModels().get(0);
		assertModelIsValid(model);
		
		ZeroOrderHold zeroOrderHold = (ZeroOrderHold) model.getBlockByName("Zero-Order\\nHold");
		assertNotNull("ZeroOrderHold not found", zeroOrderHold);
		
		assertEquals("1000.0", zeroOrderHold.getSampleTime());
	}
			
	
	@Test
	public void parameterWhitelist() throws SimulinkBuilderException
	{
		final Set<String> whitelist = new HashSet<String>();
		whitelist.add("Position");
		whitelist.add("System.location");
		this.builder.setParameterWhitelist(whitelist);
		SimulinkContainer container = this.builder.buildFromFile("tests/data/Simulink/Simple.mdl");
		
		this.visit(container, whitelist);
	}
	
	private void visit(EObject object, Set<String> whitelist)
	{
		if(object instanceof Parameter)
		{
			String name = ((Parameter)object).getName();			
			assertTrue("Parameter not in whitelist: " + name, whitelist.contains(name));
		}		
		for(EObject next: object.eContents())
			this.visit(next, whitelist);
	}
	
	protected edu.tum.cs.simulink.model.SimulinkModel createExamleSourceModel()
	{
		edu.tum.cs.simulink.model.SimulinkModel sourceModel = new edu.tum.cs.simulink.model.SimulinkModel(new File("not existing"), true);
		edu.tum.cs.simulink.model.SimulinkBlock sourceBlockOne = new edu.tum.cs.simulink.model.SimulinkBlock();
		sourceBlockOne.setParameter("Name", "sourceBlockOne");
		sourceModel.addSubBlock(sourceBlockOne);
		edu.tum.cs.simulink.model.SimulinkBlock sourceBlockTwo = new edu.tum.cs.simulink.model.SimulinkBlock();
		sourceBlockTwo.setParameter("Name", "sourceBlockTwo");
		sourceModel.addSubBlock(sourceBlockTwo);
		
		return sourceModel;
	}
		
	protected edu.tum.cs.simulink.model.SimulinkModel readSourceModel(String fileName)
	{
		SimulinkModelBuilder smb = new SimulinkModelBuilder(new File(fileName), new SimpleLogger());		
		try 
		{
			return smb.buildModel();
		} 
		catch (Exception e) 
		{
			fail(e.toString());
			return null;
		}
	}

}

