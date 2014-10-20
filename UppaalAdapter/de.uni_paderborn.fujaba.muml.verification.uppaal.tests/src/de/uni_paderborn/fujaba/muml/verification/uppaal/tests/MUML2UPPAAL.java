package de.uni_paderborn.fujaba.muml.verification.uppaal.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import javax.security.auth.login.FailedLoginException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import  org.junit.*;
import static org.junit.Assert.assertTrue;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.Muml2UppaalJob;

@RunWith(value = Parameterized.class)
public class MUML2UPPAAL extends Model2Model {
	
	public MUML2UPPAAL(String source, String reference) {
		super(source,reference);
	}
	
	@Override
	protected EObject getTarget() {
		
		 EObject sourceObject = getSource();
		    
//		 Muml2UppaalJob m2m = new Muml2UppaalJob((CoordinationProtocol) sourceObject);
//		 
//		 IStatus status = m2m.execute(new NullProgressMonitor());
//		 
//		 assertTrue(status.getMessage(), status.isOK());
//		 
//		 return m2m.getNTA();
		 Assert.fail("FIX ME");
		 return null;
		    	
	}
	
	@Parameters
	public static Collection<Object[]> overtakingData() {
		
		Object[][] data = new Object[][] {
				
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking0/overtaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking0/Overtaking.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking1/overtaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking1/Overtaking.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking2/overtaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking2/Overtaking.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking3/overtaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking3/Overtaking.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking4/overtaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking4/Overtaking.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking5/overtaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking5/Overtaking.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking6/overtaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking6/Overtaking.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.example.blindOvertaking/model/overtaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking7/Overtaking.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.example.sectionEntry/model/SectionEntry.fujaba#//@categories.1/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/sectionEntry/EnterSection.uppaal" }
			
		};
		
		return Arrays.asList(data);
	}
	
	@Before
	public void setUp() throws Exception {
		 
	    // Register the XMI resource factory for the .fujaba and .uppaal extensions

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("fujaba", new XMIResourceFactoryImpl());
	    m.put("uppaal", new XMIResourceFactoryImpl());
		
	}

}
