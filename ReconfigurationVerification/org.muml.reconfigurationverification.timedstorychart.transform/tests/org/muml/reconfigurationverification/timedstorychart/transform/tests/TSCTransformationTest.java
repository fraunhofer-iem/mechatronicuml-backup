package org.muml.reconfigurationverification.timedstorychart.transform.tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;
import org.muml.reconfigurationverification.timedstorychart.transform.TSCTransformationRunner;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;

public class TSCTransformationTest extends TSCTransformationTestCase {


	private static final boolean SAVE_OUTPUT = true;

	@Test
	public void test() {
		TSCTransformationRunner runner = new TSCTransformationRunner();
		runner.execute(coordinationProtocol.getRoleConnector());
		TimedGraphTransformationSystem tgts = runner.getTgts();
		assertTrue(tgts != null);
		if(SAVE_OUTPUT)
			saveTimedGTS(tgts, "testModels/OutputTGTS.timedstorydiagram");
	}

	@Override
	protected void setTransformationPath() {
		// not needed here, since the TSCTransformationRunner is used
		transformation_path = "";
	}

	public void saveTimedGTS(TimedGraphTransformationSystem tgts,String modelName) {
	    ResourceSet rs = new ResourceSetImpl();    

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;	    
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("timedstorydiagram", new XMIResourceFactoryImpl());

	    Resource r = rs.createResource(URI.createFileURI(modelName));
	   
	    r.getContents().add(tgts);

	    try {
			r.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
