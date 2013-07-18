package de.uni_paderborn.fujaba.muml.verification.uppaal.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.verification.uppaal.UppaalPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.MUML2UPPAALJob;

@RunWith(value = Parameterized.class)
public class MUML2UPPAAL extends Model2Model {
	
	public MUML2UPPAAL(String source, String reference) {
		super(source,reference);
	}
	
	protected EObject getTarget() {
		
		 EObject sourceObject = getSource();
		    
		 MUML2UPPAALJob m2m = new MUML2UPPAALJob((CoordinationProtocol) sourceObject);
		 m2m.schedule();
		    
		 return m2m.getNTA();
		    	
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		
		Object[][] data = new Object[][] {
				
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking0/blindOvertaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking0/NTA.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking1/blindOvertaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking1/NTA.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking2/blindOvertaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking2/NTA.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking3/blindOvertaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking3/NTA.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking4/blindOvertaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking4/NTA.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking5/blindOvertaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking5/NTA.uppaal" },
			{ "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking6/blindOvertaking.fujaba#//@categories.2/@modelElements.0", "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/overtaking6/NTA.uppaal" },
		
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
