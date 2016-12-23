package org.muml.simulink;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.simulink.test.TestBase;

public class ParameterizedElementTest extends TestBase
{
	SimulinkFactory factory = null;
		
	@Before
	public void setUp()
	{		
		this.factory = SimulinkFactory.eINSTANCE;
	}
	
	@After
	public void tearDown()
	{
		this.factory = null;
	}
	
	@Test
	public void getParameterDefined()
	{
		Element elem = this.factory.createMiscBlock();
		
		Parameter param = this.factory.createParameter();
		param.setName("Name");
		param.setValue("value");
		
		elem.getParameters().add(param);
		
		assertEquals("value", elem.getParameter("Name"));		
	}
	
	@Test
	public void getParameterUndefined()
	{
		Element elem = this.factory.createMiscBlock();
		
		assertNull("Undefined parameters should return a null value",elem.getParameter("Name"));
	}
	
	@Test
	public void defineBooleanParameter()
	{
		Parameter param = this.factory.createParameter();
		param.setName("TestBoolean");
		param.setValue("true");
		param.setType(boolean.class);
		
		assertEquals(boolean.class, param.getType());
		assertEquals(true,  Boolean.parseBoolean(param.getValue()));
	}
	
	@Test
	public void autoGenerateId()
	{
		Element elem = this.factory.createMiscBlock();
		
		assertNotNull(elem.getId());
	}
	
}
