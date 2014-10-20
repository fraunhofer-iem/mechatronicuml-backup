package de.uni_paderborn.fujaba.muml.verification.uppaal.tests;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
//import de.uni_paderborn.fujaba.muml.verification.uppaal.job.Muml2MumlJob;

@RunWith(value = Parameterized.class)
public class MUML2MUML extends Model2Model {

	private String transformation;
	List<Object[]> configurationPropertyBindings;

	public MUML2MUML(String source, String reference, String transformation, List<Object[]> configurationPropertyBindings) {
		super(source, reference);
		this.transformation = transformation;
		this.configurationPropertyBindings = configurationPropertyBindings;

	}

	// TODO add Unit Test Examples here
	@Parameters
	public static Collection<Object[]> overtakingData() {
		
		LinkedList<Object[]> protocol2CICBindingsOne2One = new LinkedList<Object[]>();
		Object[] nameOfProtocol= {"nameOfProtocolToVerify", "proto"};
		protocol2CICBindingsOne2One.add(nameOfProtocol);
		Object[] multiplicityOfMultiRole1 = {"multiplicityOfMultiRole", 1};
		protocol2CICBindingsOne2One.add(multiplicityOfMultiRole1);
		
		LinkedList<Object[]> protocol2CICBindingsOne2Many = new LinkedList<Object[]>();
		protocol2CICBindingsOne2Many.add(nameOfProtocol);
		Object[] multiplicityOfMultiRole3 = {"multiplicityOfMultiRole", 3};
		protocol2CICBindingsOne2Many.add(multiplicityOfMultiRole3);
	
		Object[][] data = new Object[][] {

				//XXX: used for testing Muml2Muml library, please do not remove at the moment
//				 {
//				 "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Muml2Muml/EntryExitInput.fujaba",
//				 "platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Muml2Muml/EntryExitInput.fujaba",
//				 "/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/Muml2MumlTest.qvto",
//				 null
//				 }
//				 ,
				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Protocol2CIC/example1/One2OneInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Protocol2CIC/example1/One2OneExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/cic/Protocol2CIC.qvto",
						protocol2CICBindingsOne2One},

				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Protocol2CIC/example2/One2ManyInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Protocol2CIC/example2/One2ManyExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/cic/Protocol2CIC.qvto",
						protocol2CICBindingsOne2Many},

				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/EntryExit/example1/EntryExitInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/EntryExit/example1/EntryExitExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/RTSCEntryExitEventNormalization.qvto",
						null},

				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/EntryExit/example2/EntryExitInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/EntryExit/example2/EntryExitExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/RTSCEntryExitEventNormalization.qvto",
						null},

				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/TimeValueScaling/example1/TimeValueScalingInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/TimeValueScaling/example1/TimeValueScalingExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/RTSCScaleTimeValuesNormalization.qvto",
						null},

				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Do/example1/DoInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Do/example1/DoExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/RTSCDoEventNormalization.qvto",
						null},

				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Do/example2/DoInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Do/example2/DoExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/RTSCDoEventNormalization.qvto",
						null},

				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Do/example3/DoInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Do/example3/DoExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/RTSCDoEventNormalization.qvto",
						null},

				{
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Urgency/example1/UrgencyInput.fujaba",
						"platform:/plugin/de.uni_paderborn.fujaba.muml.verification.uppaal.tests/resources/unit/Urgency/example1/UrgencyExpected.fujaba",
						"/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/RTSCUrgencyNormalization.qvto",
						null},

		};

		return Arrays.asList(data);
	}

	@Override
	protected EObject getTarget() {

		EObject sourceObject = getSource();
		Assert.fail("FIX ME");
		return null;

//		Muml2MumlJob m2m = new Muml2MumlJob((RootNode) sourceObject,
//				transformation, configurationPropertyBindings);
//
//		IStatus status = m2m.execute(new NullProgressMonitor());
//
//		assertTrue(status.getMessage(), status.isOK());
//
//		return m2m.getNormalizedRootNode();

	}

	@Before
	public void setUp() throws Exception {

		// Register the XMI resource factory for the .fujaba extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("fujaba", new XMIResourceFactoryImpl());

	}

}
