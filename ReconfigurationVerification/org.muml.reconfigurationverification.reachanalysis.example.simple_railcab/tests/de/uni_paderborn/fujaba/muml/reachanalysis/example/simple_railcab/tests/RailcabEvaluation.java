package de.uni_paderborn.fujaba.muml.reachanalysis.example.simple_railcab.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import railcab.RailCab;
import railcab.RailcabFactory;
import railcab.SectionControl;
import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.reachanalysis.gtautomaton.GtAutomatonComputation;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtAutomaton;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtStepGraph;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.kronos.generator.KronosAutomatonWriter;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.AtomicPropositionMapping;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.computation.MuComputation;
import de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.TsdmhelperPackage;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage;
import de.uni_paderborn.fujaba.muml.verification.fotctl.ConstantSymbolDecl;
import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLFormula;
import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLSpec;
import de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlFactory;
import de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage;

public class RailcabEvaluation {
	
	private int railCabCount = 3;
	private int sectionControlCount = 1;
	
	private HashSet<RailCab> railCabs;
	private HashSet<SectionControl> sectionControls;
	
	private static final String PROJECT_NAME = "de.uni_paderborn.muml.verification.test.railcab.transformationrules";
	private ResourceSet resourceSet = new ResourceSetImpl();

	@Before
	public void setUp() {
		railCabs = new HashSet<RailCab>();
		sectionControls = new HashSet<SectionControl>();
		
		for(int i = 0; i < railCabCount; i++)
		{
			RailCab railCab = RailcabFactory.eINSTANCE.createRailCab();
			railCab.setIsLeader(false);
			railCab.setName("r"+i);
			railCabs.add(railCab);
		}
		
		for(int i = 0; i < sectionControlCount;i++) 
		{
			SectionControl sectionControl = RailcabFactory.eINSTANCE.createSectionControl();
			sectionControl.setName("s"+i);
			sectionControls.add(sectionControl);
			
		}
		
		// initialize resource set
		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());

		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Register Packages
		EcorePackage.eINSTANCE.eClass();
		TimedstorydiagramPackage.eINSTANCE.eClass();
		ModelinstancePackage.eINSTANCE.eClass();
		TsdmhelperPackage.eINSTANCE.eClass();
		FotctlPackage.eINSTANCE.eClass();

		// Find out absolute path of muml.model project
		StringBuffer absoluteProjectPath = new StringBuffer();
		absoluteProjectPath.append(new File("").getAbsoluteFile()
				.getParentFile());
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(PROJECT_NAME);
		// no idea why, but this is necessary two times
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(PROJECT_NAME);

		// Register platform mapping for muml.model project
		EcorePlugin.getPlatformResourceMap().put(PROJECT_NAME,
				URI.createFileURI(absoluteProjectPath.toString()));
		
		
	}
	

	@Test
	public void test() throws IOException {
		
		// load TGTS from xmi file
		TimedGraphTransformationSystem tgts = (TimedGraphTransformationSystem) load("railCabTransform.timedstorydiagram");
		FoTCTLSpec fotctlSpec = (FoTCTLSpec) load("railcab.fotctl");
		
		// collect initial graph objects
		tgts.getInitialGraphObjects().addAll(railCabs);
		tgts.getInitialGraphObjects().addAll(sectionControls);
		
		// compute GtAutomaton
		GtAutomatonComputation gtAutomatonComputation = new GtAutomatonComputation(tgts);
		gtAutomatonComputation.computeReachabilityGraph();
		GtAutomaton gtAutomaton = gtAutomatonComputation.getReachabilityGraph();
		
		MuComputation muComp = new MuComputation();

		HashSet<ConstantSymbolDecl> constSymbols = new HashSet<ConstantSymbolDecl>();
		
		for(ConstantSymbolDecl constant : fotctlSpec.getConstants())
		{
			constSymbols.add(constant);	
		}

		for (Entry<String, EObject> entry : ((GtStepGraph) gtAutomaton.getStartState()).getObjectIdentifier().getIdentifierToEObject())
		{
			ConstantSymbolDecl constantSymbol = FotctlFactory.eINSTANCE.createConstantSymbolDecl();
			constantSymbol.setName(entry.getKey());
			constSymbols.add(constantSymbol);
		}

		muComp.init(constSymbols);
		HashMap<FoTCTLFormula,HashSet<AtomicPropositionMapping>> mus = new HashMap<FoTCTLFormula, HashSet<AtomicPropositionMapping>>();
		for (Iterator<FoTCTLFormula> formulaIterator = fotctlSpec.getFormulas().iterator(); formulaIterator.hasNext();)
		{
			FoTCTLFormula formula = formulaIterator.next();
			mus.put(formula,muComp.computeMu(gtAutomaton, formula));
		}
		
		KronosAutomatonWriter automatonWriter = new KronosAutomatonWriter();
		automatonWriter.setModel(gtAutomaton);
		automatonWriter.writeToFile("railcabSystem.tg");

	}
	
	
	private EObject load(String modelName) throws IOException {

		ResourceSet rs = new ResourceSetImpl();
		
		String modelFolder = "/de.uni_paderborn.fujaba.muml.reachanalysis.example.simple_railcab/model/";

		Resource r = rs.createResource(URI.createPlatformPluginURI(
				modelFolder + modelName, true));

		r.load(Collections.EMPTY_MAP);

		return r.getContents().get(0);
	}

	

}
