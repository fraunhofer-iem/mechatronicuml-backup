package de.uni_paderborn.fujaba.muml.reachanalysis.rtsc.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.junit.Before;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscFactory;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeFactory;
import de.uni_paderborn.fujaba.udbm.Federation;
import de.uni_paderborn.fujaba.udbm.FederationFactory;
import de.uni_paderborn.fujaba.udbm.UDBMClock;
import de.uni_paderborn.fujaba.udbm.java.JavaFederationFactory;
import de.uni_paderborn.fujaba.udbm.ruby.RubyFederationFactory;


public class TestIsIsomorphic {

	private RuntimeFactory runtimefactory;
	private RealtimestatechartFactory rtscFactory;
	private RtscFactory rtscReachFactory;
	private FederationFactory fedFactory;
//	private ClockConstraint cConstraint;
	
	private RealtimeStatechart rtsc1;
//	private RealtimeStatechart rtsc2;
	private State state1;
	private State state2;
//	private State state3;
	
	private RealtimeStatechartInstance rtscInstance1;
	private RealtimeStatechartInstance rtscInstance2;
	
	private ZoneGraphState zone1, zone2;
	
	private Federation fed1, fed2;
	
	private TestableRTSCReachabilityComputation reachComputation;
	
	private HashSet<RealtimeStatechart> rtscs;
	
	private HashSet<UDBMClock> udbmClocks1;
	private HashSet<UDBMClock> udbmClocks2;
	
	private UDBMClock cu1, cu2;
	
	
	
	@Before
	public void setUp(){
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLValidationDelegateFactory.Global());
		//set up factories
		runtimefactory = RuntimeFactory.eINSTANCE;
		rtscFactory = RealtimestatechartFactory.eINSTANCE;
		rtscReachFactory = RtscFactory.eINSTANCE;
		
		//set up rtsc objects
		rtsc1 = rtscFactory.createRealtimeStatechart();
		state1 = rtscFactory.createState();
		state1.setParentStatechart(rtsc1);
		state2 = rtscFactory.createState();
		state2.setParentStatechart(rtsc1);
		
		
		rtscs = new HashSet<RealtimeStatechart>();
		rtscs.add(rtsc1);
//		rtscs.add(rtsc2);
		
		
		
		
		//set up runtime objects
		rtscInstance1 = runtimefactory.createRealtimeStatechartInstance();
		rtscInstance2 = runtimefactory.createRealtimeStatechartInstance();
		
		//set up reach objects
		zone1 = rtscReachFactory.createZoneGraphState();
		zone2 = rtscReachFactory.createZoneGraphState();
		
		cu1 = new UDBMClock("c1", "c1");
		cu2 = new UDBMClock("c2", "c2");
		
		udbmClocks1 = new HashSet<UDBMClock>();
		udbmClocks2 = new HashSet<UDBMClock>();
		
		
	}
	
	@Test
	public void testNullFedTrue(){
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);
		
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		
		assertTrue(reachComputation.isIsomorphic(zone1, zone2));
		
		
	}
	
	@Test
	public void testNullFedFalse(){
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state2);
		
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		
		assertFalse(reachComputation.isIsomorphic(zone1, zone2));
		
		
	}
	
	@Test
	public void testZeroRubyFedTrue(){
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);
		
		//set up hash sets with udbm clocks
		udbmClocks1.add(cu1);
		udbmClocks1.add(cu2);
		
		//set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks1);
		fed2 = (Federation)fed1.clone();
	//	fed2 = fedFactory.createZeroFederation(udbmClocks2);
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		zone1.setFederation(fed1);
		zone2.setFederation(fed2);
		
		assertTrue(reachComputation.isIsomorphic(zone1, zone2));
		
		
	}
	
	@Test
	public void testZeroJavaFedTrue(){
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);
		
		//set up hash sets with udbm clocks
		udbmClocks1.add(cu1);
		udbmClocks2.add(cu1);
		
		//set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks1);
		fed2 = (Federation)fed1.clone();
	//	fed2 = fedFactory.createZeroFederation(udbmClocks2);
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		zone1.setFederation(fed1);
		zone2.setFederation(fed2);
		
		assertTrue(reachComputation.isIsomorphic(zone1, zone2));
		
		
	}
	
	@Test
	public void testFalseRubyFed(){
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);
		
		//set up hash sets with udbm clocks
		udbmClocks1.add(cu1);
		udbmClocks1.add(cu2);
		
		//set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks1);
		fed2 = (Federation)fed1.clone();
		fed2.up();
	//	fed2 = fedFactory.createZeroFederation(udbmClocks2);
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		zone1.setFederation(fed1);
		zone2.setFederation(fed2);
		
		assertFalse(reachComputation.isIsomorphic(zone1, zone2));
		
		
	}
	
	@Test
	public void testFalseJavaFed(){
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);
		
		//set up hash sets with udbm clocks
		udbmClocks1.add(cu1);
		udbmClocks1.add(cu2);
		
		//set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks1);
		fed2 = (Federation)fed1.clone();
		fed2.up();
	//	fed2 = fedFactory.createZeroFederation(udbmClocks2);
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		zone1.setFederation(fed1);
		zone2.setFederation(fed2);
		
		assertFalse(reachComputation.isIsomorphic(zone1, zone2));
		
		
	}
	
	@Test
	public void testFalseStateRubyFed(){
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		state2.setParentStatechart(rtsc1);
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state2);
		
		//set up hash sets with udbm clocks
		udbmClocks1.add(cu1);
		udbmClocks1.add(cu2);
		
		//set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks1);
		fed2 = (Federation)fed1.clone();
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		zone1.setFederation(fed1);
		zone2.setFederation(fed2);
		
		assertFalse(reachComputation.isIsomorphic(zone1, zone2));
	}
	
	@Test
	public void testStatesWithSameNamesRuby(){
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		state1.setName("state");
		
		state2.setParentStatechart(rtsc1);
		state2.setName("state");
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state2);
		
		//set up hash sets with udbm clocks
		udbmClocks1.add(cu1);
		udbmClocks1.add(cu2);
		
		//set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks1);
		fed2 = (Federation)fed1.clone();
	//	fed2 = fedFactory.createZeroFederation(udbmClocks2);
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		zone1.setFederation(fed1);
		zone2.setFederation(fed2);
		
		assertFalse(reachComputation.isIsomorphic(zone1, zone2));
		
	}
	
	
	@Test
	public void testStatesWithSameNamesJava(){
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		
		//set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);
		
		state1.setName("state");
		
		state2.setParentStatechart(rtsc1);
		state2.setName("state");
		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state2);
		
		//set up hash sets with udbm clocks
		udbmClocks1.add(cu1);
		udbmClocks1.add(cu2);
		
		//set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks1);
		fed2 = (Federation)fed1.clone();
	//	fed2 = fedFactory.createZeroFederation(udbmClocks2);
		
		//set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone2.getLocations().add(rtscInstance2);
		
		zone1.setFederation(fed1);
		zone2.setFederation(fed2);
		
		assertFalse(reachComputation.isIsomorphic(zone1, zone2));
		
	}
}