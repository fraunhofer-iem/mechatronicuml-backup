package org.muml.simulink.adapter.wizard.transformation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.TextualExpression;
import org.muml.core.expressions.common.ComparingOperator;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.behavior.Variable;
import org.muml.pim.component.Component;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.HybridPort;
import org.muml.pim.component.Port;
import org.muml.pim.component.StaticAtomicComponent;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.realtimestatechart.AbsoluteDeadline;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.RelativeDeadline;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.Vertex;
import org.muml.pim.realtimestatechart.impl.RealtimestatechartFactoryImpl;
import org.muml.pim.realtimestatechart.impl.SynchronizationChannelImpl;
import org.muml.pim.types.ArrayDataType;
import org.muml.pim.types.DataType;
import org.muml.pim.valuetype.TimeValue;
import org.muml.simulink.adapter.actionlanguage.matlab.generator.ExpressionTransformation;
import org.muml.simulink.adapter.extension.ExtensionFactory;
import org.muml.simulink.adapter.extension.SimulinkAnnotationExtension;
import org.muml.simulink.msglib.LinkLayer;
import org.muml.simulink.msglib.MsglibFactory;


public class MUMLAnalysis {
	
	private final int DEFAULT_BUFFER_SIZE = 10;
	
	private final String DEFAULT_MIN_MSG_DELAY;
	
	private final String DEFAULT_MAX_MSG_DELAY;
	
	/**
	 * Prefix for all variables that temporarily store the selector condition
	 * of the sending transition in Stateflow.
	 */
	private final String SEND_SELECTOR_COND_VAR_PREFIX = "sendSelCond_";
	
	// Chosen Component Instance Configuration
	ComponentInstanceConfiguration chosenCIC;
	
	// Lists needed for the analysis
	EList<ModelElementCategory> cat_list;
	List<StaticAtomicComponent> atomicComponents;
	List<RealtimeStatechart> statecharts;
	List<DiscretePort> ports;	
	HashMap<RealtimeStatechart,DiscretePort> portStatecharts;
	List<Transition> transitions;
	List<State> states;
	List<ComponentInstanceConfiguration> cics;	
	HashMap<Integer,Integer> messageMapping;
	


	public MUMLAnalysis(){
		final LinkLayer tmpLinkLayer = MsglibFactory.eINSTANCE.createLinkLayer();
		DEFAULT_MIN_MSG_DELAY = tmpLinkLayer.getDelayMin();
		DEFAULT_MAX_MSG_DELAY = tmpLinkLayer.getDelayMax();
	}
	
	public void MUML_Analysis(String file, boolean save) {
				
		// Register the XMI resource factory for the .fujaba extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("fujaba", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(file), true);

		// get the root-element and the components-category
		RootNode root = (RootNode) resource.getContents().get(0);
		
		cat_list = root.getCategories();	
		
		for (ModelElementCategory cat : cat_list){			
			if(cat.getKey().equals("org.muml.pim.instance.category"))
				chosenCIC = (ComponentInstanceConfiguration) cat.getModelElements().get(0);			
		}
		
		MUML_Analysis(root, chosenCIC);

		if(save){
			// save
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}

	public void MUML_Analysis(RootNode root, ComponentInstanceConfiguration cic) {
		
		cat_list = root.getCategories();	
		this.chosenCIC = cic;
		
		// create Lists
		atomicComponents = new ArrayList<StaticAtomicComponent>(); 
		statecharts = new ArrayList<RealtimeStatechart>();		
		ports = new ArrayList<DiscretePort>();	
		portStatecharts = new HashMap<RealtimeStatechart,DiscretePort>();
		transitions = new ArrayList<Transition>();
		states = new ArrayList<State>();
		cics = new ArrayList<ComponentInstanceConfiguration>();	
		messageMapping = new HashMap<Integer, Integer>();
		
		
		//enumerate the message types
		enumerateMessageTypes();		
		
		// analyze ComponentInstanceConfigurations
		analyzeComponentInstanceConfigurations();
		
		// collect Statecharts
		collectStatecharts();
		
		// ---Analysis of relative deadlines---
		deadlineAnalysis();
		
		// Expression analysis
		expressionAnalysis(root.eResource());
		
		// collect Transitions
		for (RealtimeStatechart rtsc : statecharts){
			for(State v : rtsc.getStates()){
				for( Region r : v.getEmbeddedRegions() )
					collectTransitions(r);				
			}				
		}
		
		// analyze port statecharts
		portStatechartAnalysis();
		
		// ---Analysis of asynchronous messages---
		asyncMessageAnalysis();
				
		// ---Synchronization analysis---
		synchronizationAnalysis();
		
		// ---Invariant analysis---
		invariantAnalysis();
	}
	
	public void analyzeComponentInstanceConfigurations(){
				
		//collect all "embedded" component instance configurations
		collectCICs(chosenCIC, cics);
		cics.add(chosenCIC);
		
		for (ComponentInstanceConfiguration cic : cics){
			
			//move all delegation connector instances to component instance configuration of the corresponding
			//structured component instance
			moveDelegationConnectorInstances(cic);
			
			SimulinkAnnotationExtension cic_eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();					
			cic_eAnnotation.setSource("CIC");			
			cic.getExtensions().add(cic_eAnnotation);
			 
			//mark the chosen component instance configuration
			if(cic==chosenCIC)
				cic_eAnnotation.getDetails().put("chosen","true");				
			else
				cic_eAnnotation.getDetails().put("chosen","false");
			
			 //create unique port ids within each component instance configuration (important for net addresses)
			 createPortIDs(cic);
			 
			 //mark the component instance configuration if it contains at least one assembly between discrete ports
			 // in this case a communication structure must be generated in the corresponding SimulinkModel or SubSystem
			 createCommunicationStructureAnnotation(cic,cic_eAnnotation);
			 
			 //collect the instantiated atomic components
			 for(ComponentInstance compInst : cic.getComponentInstances()){
				 if(compInst instanceof AtomicComponentInstance && compInst.getComponentType() instanceof StaticAtomicComponent)
					 if(!atomicComponents.contains((StaticAtomicComponent) compInst.getComponentType()))
						 atomicComponents.add((StaticAtomicComponent) compInst.getComponentType());
			 }			
		}	
	}
	
	public void collectStatecharts(){
		
		for(StaticAtomicComponent atomComp : atomicComponents){
			if( atomComp.getBehavior()!=null ){
				
				RealtimeStatechart rtsc = (RealtimeStatechart)(atomComp.getBehavior());
				boolean correctStatechart = true;
				String dataInit = "";					
				
				int paramNumber = 0;
				
				for(Port p : atomComp.getPorts()){
					if (p instanceof DiscretePort && !(p instanceof HybridPort) ){
						DiscretePort dp = (DiscretePort) p;
						
						int portParamNumber = getMaxParamNumber(dp);
						if(paramNumber < portParamNumber)
							paramNumber = portParamNumber;
						
						//check ports						
//						correctStatechart = 
//								correctStatechart &&
//								stateChartContainsStateChart(rtsc, (RealtimeStatechart) dp.getBehavior());						

						// create an annotation for the embedded Matlab functions of the Stateflow-chart  
						SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
						eAnnotation.setSource("EMF");					
											
						if(correctStatechart){
							ports.add(dp);
							portStatecharts.put((RealtimeStatechart) dp.getBehavior(), dp);
							
							// Get the source buffer size of the port
							int sourceBufferSize = getSourceBufferSize(dp);
							
							// Compute the buffer size regarding the number of parameters
							int bufferSize;
							if(portParamNumber==0)
								bufferSize = sourceBufferSize;
							else
								bufferSize = (int) (sourceBufferSize * portParamNumber);							

							//compute the message mapping 
							String messageMappingString = computeMessageMapping();							
						
							// Put the buffer size in the "EMF"-annotation	
							eAnnotation.getDetails().put(dp.getName(), String.valueOf(bufferSize));
							
							// Put the buffer size and the message mapping in a new port-annotation 				
							SimulinkAnnotationExtension port_eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
							port_eAnnotation.setSource("DiscretePort");
							port_eAnnotation.getDetails().put("sourceBufferSize", String.valueOf(sourceBufferSize));
							port_eAnnotation.getDetails().put("bufferSize", String.valueOf(bufferSize));	
							port_eAnnotation.getDetails().put("messageMapping", messageMappingString);
							port_eAnnotation.getDetails().put("minMsgDelay", getMinMsgDelay(dp));
							port_eAnnotation.getDetails().put("maxMsgDelay", getMaxMsgDelay(dp));
							dp.getExtensions().add(port_eAnnotation);
							
							// Creating String for the transition in the DataInit-State
							String portName = dp.getName();
							dataInit += 
								portName+"WriteOut" +   " = " + portName+"WriteIn;\n" +
								portName+"ParamWriteOut" + " = " + portName+"ParamWriteIn;\n" +
								portName+"ReadOut" +    " = " + portName+"ReadIn;\n" +
								portName+"ParamReadOut" +  " = " + portName+"ParamReadIn;\n";
						}
						
						rtsc.getExtensions().add(eAnnotation);
					}		
				}
				if(correctStatechart){
					statecharts.add(  rtsc  );
					
					if(getAnnotation(rtsc, "dataInit")==null){						
						SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
						eAnnotation.setSource("dataInit");				
						eAnnotation.getDetails().put("queues", dataInit);
						rtsc.getExtensions().add(eAnnotation);
					}
					
					if(paramNumber>0){
						SimulinkAnnotationExtension paramEAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
						paramEAnnotation.setSource("tmp_variables");				
						for(int i=1; i<=paramNumber; i++){							
							paramEAnnotation.getDetails().put(String.valueOf(i), "tmp_var_"+i);							
						}
						rtsc.getExtensions().add(paramEAnnotation);
					}
				}
			}
		}
	}
	
	public void portStatechartAnalysis(){
		for(RealtimeStatechart rtsc : portStatecharts.keySet()){
			if(rtsc.getBehavioralElement() instanceof DiscretePort && ((DiscretePort)rtsc.getBehavioralElement()).getCardinality().getLowerBound().getValue() == 0
					&& ((DiscretePort)rtsc.getBehavioralElement()).getCardinality().getUpperBound().getValue() == 1){
				
				DiscretePort port = (DiscretePort)rtsc.getBehavioralElement();
				Component component = port.getComponent();
				
				SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				eAnnotation.setSource("portStatechart");				
				if(portInstanceInCIC(chosenCIC, component, port)){
					eAnnotation.getDetails().put("portInCIC", "true");
				}
				else{
					eAnnotation.getDetails().put("portInCIC", "false");
				}
				rtsc.getExtensions().add(eAnnotation);
			}
		}
	}
	
	boolean portInstanceInCIC(ComponentInstanceConfiguration cic, Component component, Port port){
		boolean portInCIC = false;
		for(ComponentInstance c : cic.getComponentInstances()){
			if(c.getComponentType().equals(component)){
				for(PortInstance p : c.getPortInstances()){
					if(p.getPortType().equals(port)){
						portInCIC = true;
					}
				}
			}
			if(c instanceof StructuredComponentInstance){
				ComponentInstanceConfiguration structuredCic = ((StructuredComponentInstance)c).getEmbeddedCIC();
				portInCIC = portInstanceInCIC(structuredCic, component, port) || portInCIC;
			}
		}
		return portInCIC;
	}
	
	public void synchronizationAnalysis(){
		for (int i = 0; i < statecharts.size(); i++) {
			// create for each statechart sender- and receiver-lists	
			ArrayList<Transition> statechart_senders = new ArrayList<Transition>();
			ArrayList<Transition> statechart_receivers = new ArrayList<Transition>();
			HashMap<Transition, Region> transition2region = new HashMap<Transition, Region>();

			// collect regions
			ArrayList<Region> regions = new ArrayList<Region>();

			for (State v : statecharts.get(i).getStates()) {
					regions.addAll(v.getEmbeddedRegions());
			}
			for (Region r : regions)
				collectSyncs(r, statechart_senders, statechart_receivers,
						transition2region);

			// find dependencies
			compare(statechart_senders, statechart_receivers, transition2region);
			
			// create annotation for sync variables of receivers
			createSyncVariables(statechart_receivers);
			
			// create annotation for receiving conditions
			createConditions(statechart_receivers);
			
			// create annotation for selector conditions
			createSelectorConditions(statechart_receivers);
			
			// create annotation for selector condition guard
			createSendGuard(statechart_receivers, statechart_senders);
			
			//create annotation for selector condition assignment
			createSendSyncAction(statechart_senders);
		}
	}
	
	public void deadlineAnalysis(){
		for(Transition trans : transitions){
			if(trans.getRelativeDeadline() != null || trans.getAbsoluteDeadlines().size() > 0){
				State newState = RealtimestatechartFactoryImpl.eINSTANCE.createState();
				newState.setParentStatechart(trans.getStatechart());
				newState.setName(trans.getSource().getName() + "_" + trans.getTarget().getName() + "_" + trans.getPriority());
				
				Vertex oldTarget = trans.getTarget();
				Transition newTrans = EcoreUtil.copy(trans);				
				trans.setTarget(newState);
				newTrans.setSource(newState);
				newTrans.setTarget(oldTarget);
				trans.getStatechart().getTransitions().add(newTrans);
				
				trans.getClockResets().clear();
				trans.eUnset(RealtimestatechartPackage.Literals.TRANSITION__ACTION);
				
				newTrans.setPriority(1);
				newTrans.getClockConstraints().clear();
				newTrans.eUnset(RealtimestatechartPackage.Literals.TRANSITION__GUARD);
				newTrans.eUnset(RealtimestatechartPackage.Literals.TRANSITION__SYNCHRONIZATION);
				
				//Deletion of not required annotations of first transition
				EAnnotation actionAn = null;
				EAnnotation asyncSendAn = null;
				EAnnotation asyncRecAn = null;
				{
					EAnnotation an = getAnnotation(newTrans, "ActionLanguage");
					if (an != null) {
						if(an.getSource().equals("ActionLanguage")){
							actionAn = an;
						}
						else if(an.getSource().equals("async")){
							for(String details : an.getDetails().keySet()){
								if(details.equals("receive")){
									asyncRecAn = an;
								}
							}
						}
					}
				}
				if(actionAn != null){
					newTrans.getExtensions().remove(actionAn);
				}
				if(asyncRecAn != null){
					asyncRecAn.getDetails().remove("receive");
					asyncRecAn = null;
				}
				
				//Deletion of not required annotations of first transition
				SimulinkAnnotationExtension an = getAnnotation(trans, "async");
				if (an != null) {
					for(String details : an.getDetails().keySet()){
						if(details.equals("send")){
							asyncSendAn = an;
						}
						else if(details.equals("dequeue")){
							asyncRecAn = an;
						}
					}
				}
				if(asyncSendAn != null){
					trans.getExtensions().remove(asyncSendAn);
				}
				if(asyncRecAn != null){
					asyncRecAn.getDetails().remove("dequeue");
				}
				
				//creation of deadline specific elements
				if(trans.getRelativeDeadline() != null){
					RelativeDeadline deadline = trans.getRelativeDeadline();
					Boolean clockNotExists = true;
					Clock cdead = null;
					for(Clock c :trans.getStatechart().getClocks()){
						if(c.getName().equals("c_dead")){
							clockNotExists = false;
							cdead = c;
						}
					}
					if(clockNotExists){
						cdead = RealtimestatechartFactoryImpl.eINSTANCE.createClock();
						cdead.setName("c_dead");
						trans.getStatechart().getClocks().add(cdead);
					}
					trans.getClockResets().add(cdead);
					ClockConstraint invariant = RealtimestatechartFactoryImpl.eINSTANCE.createClockConstraint();
					invariant.setClock(cdead);
					invariant.setBound(EcoreUtil.copy(deadline.getUpperBound()));
					invariant.setOperator(ComparingOperator.LESS_OR_EQUAL);
					newState.getInvariants().add(invariant);
					ClockConstraint constraint = RealtimestatechartFactoryImpl.eINSTANCE.createClockConstraint();
					constraint.setClock(cdead);
					constraint.setBound(EcoreUtil.copy(deadline.getLowerBound()));
					constraint.setOperator(ComparingOperator.GREATER_OR_EQUAL);
					newTrans.getClockConstraints().add(constraint);
				}
				else if(trans.getAbsoluteDeadlines().size() > 0){
					for(AbsoluteDeadline d : trans.getAbsoluteDeadlines()){
						Clock deadlineClock = d.getClock();
						ClockConstraint invariant = RealtimestatechartFactoryImpl.eINSTANCE.createClockConstraint();
						invariant.setClock(deadlineClock);
						invariant.setBound(EcoreUtil.copy(d.getUpperBound()));
						invariant.setOperator(ComparingOperator.LESS_OR_EQUAL);
						newState.getInvariants().add(invariant);
						ClockConstraint constraint = RealtimestatechartFactoryImpl.eINSTANCE.createClockConstraint();
						constraint.setClock(deadlineClock);
						constraint.setBound(EcoreUtil.copy(d.getLowerBound()));
						constraint.setOperator(ComparingOperator.GREATER_OR_EQUAL);
						newTrans.getClockConstraints().add(constraint);
					}
				}			
				
				trans.getAbsoluteDeadlines().clear();
				trans.eUnset(RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE);
				newTrans.getAbsoluteDeadlines().clear();
				newTrans.eUnset(RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE);
			}
		}
	}
	
	public void asyncMessageAnalysis(){
		
		// Check all transitions
		for (Transition t : transitions) {
			
			RealtimeStatechart portOrRoleStatechart = t.getStatechart().getPortOrRoleStatechart();
			
			// For MUML #1362:
			// getPortOrRoleStatechart() can now return null; to be sure we keep the old functionality here.
			if (portOrRoleStatechart == null) {
				portOrRoleStatechart = t.getStatechart();
			}

			DiscretePort port = portStatecharts.get(portOrRoleStatechart);		
			
			// Analyze trigger message event
			String[] queueReceiveOperations = getTriggerMessageEventStrings(t, port);		
			String checkQueue = queueReceiveOperations[0];
			String dequeue = queueReceiveOperations[1];
			
			// Analyze raise message event
			String send = getRaiseMessageEventString(t, port);			
			
			// Create new Annotation			
			if (t.getTriggerMessageEvent() != null || t.getRaiseMessageEvent() != null){
				SimulinkAnnotationExtension eAnnotation = null;
				if(getAnnotation(t,"async")==null){
					eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
					eAnnotation.getReferences().add(port);	
					eAnnotation.setSource("async");
					if(!send.equals("")) {
						eAnnotation.getDetails().put("send", send);
					}
					if(!checkQueue.equals("") && !dequeue.equals("")) {
						eAnnotation.getDetails().put("receive", checkQueue);
						eAnnotation.getDetails().put("dequeue", dequeue);
					}			
				}
				else{
					eAnnotation = getAnnotation(t, "async");
					if(eAnnotation.getDetails().get("send")==null && !send.equals("")){
						eAnnotation.getDetails().put("send", send);
					}
					if(eAnnotation.getDetails().get("receive")==null && !checkQueue.equals("") && !dequeue.equals("")){
						eAnnotation.getDetails().put("receive", checkQueue);
						eAnnotation.getDetails().put("dequeue", dequeue);
					}
				}
				t.getExtensions().add(eAnnotation);	
			}
		}
	}
	
	public void invariantAnalysis(){
		
		for(RealtimeStatechart r : statecharts){
			SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
			eAnnotation.setSource("invariant");				
			eAnnotation.getDetails().put("error", "function invariant() \n error('Simulation stopped in Error State. An invariant is violated');");
			r.getExtensions().add(eAnnotation);
		}
	}
	
	public void collectSyncs(Region r, 
			List<Transition> senders, 
			List<Transition> receivers, 
			HashMap<Transition,Region> trans2reg){
		
		RealtimeStatechart rtsc = r.getEmbeddedStatechart();

		if(rtsc!=null){
			for(Transition t : rtsc.getTransitions())
			{
				try {
					if (t.getSynchronization().getKind()
							.equals(SynchronizationKind.SEND)) {
						senders.add(t);
					}
					if (t.getSynchronization().getKind()
							.equals(SynchronizationKind.RECEIVE)) {
						receivers.add(t);
						trans2reg.put(t, r);					
					}
				}
				catch(Exception e){}
			}
	
			for(State v : rtsc.getStates()){
				for( Region reg : v.getEmbeddedRegions() )
					collectSyncs(reg, senders, receivers, trans2reg);
			}
		}
	}
	
	public void collectTransitions(Region r){
		RealtimeStatechart rtsc = r.getEmbeddedStatechart();

		if (rtsc != null) {
			transitions.addAll(rtsc.getTransitions());

			for (State v : rtsc.getStates()) {
				for (Region reg : v.getEmbeddedRegions())
					collectTransitions(reg);
			}
		}
	}
	
	
	public void compare(
			List<Transition> senders, 
			List<Transition> receivers,
			final HashMap<Transition,Region> trans2reg)
	{
		HashSet<SynchronizationChannel> treatedChannels = new HashSet<SynchronizationChannel>();
		
		for(Transition sender : senders){
			SynchronizationChannelImpl syncCh = (SynchronizationChannelImpl) sender.getSynchronization().getSyncChannel();
			
			//create annotation for sync channel with selector
			//such that a variable used by sending transitions may be created
			if(syncCh.getSelectorType() != null && !treatedChannels.contains(syncCh)){
				treatedChannels.add(syncCh);
				SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				eAnnotation.setSource("send_selector_cond");			
				eAnnotation.getDetails().put("variableName", SEND_SELECTOR_COND_VAR_PREFIX + syncCh.getName());
				syncCh.getState().getExtensions().add(eAnnotation);
			}
			
			ArrayList<Transition> concreteReceivers = new ArrayList<Transition>(); 
			for(Transition tr : receivers){
				if(syncCh == (SynchronizationChannelImpl)tr.getSynchronization().getSyncChannel()){					
					concreteReceivers.add(tr);
				}
			}

			Collections.sort(concreteReceivers, new Comparator<Transition>(){

				public int compare(Transition t1, Transition t2) {
					
					int prio1 = trans2reg.get(t1).getPriority(); 
					int prio2 = trans2reg.get(t2).getPriority();
					
					if(prio1>prio2)
						return -1;
					else if(prio1<prio2)
						return 1;
					else return 0;
					}
				} );
			
			for(int i=0; i<concreteReceivers.size(); i++){
				EObject regionObject = (EObject) trans2reg.get(concreteReceivers.get(i));
				boolean regionIsContained = false;
				
				for(Extension e : sender.getExtensions())
					if (e instanceof SimulinkAnnotationExtension)
						if (((SimulinkAnnotationExtension)e).getReferences().contains(regionObject))
							regionIsContained = true;
				
				if (!regionIsContained) {
					SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
					eAnnotation.setSource("prio");
					eAnnotation.getReferences().add(regionObject);					
					eAnnotation.getDetails().put("prio", "" + (i + 1));
					sender.getExtensions().add(eAnnotation);
				}
			}			
		}
	}
	
	public void createSyncVariables(ArrayList<Transition> statechart_receivers){
		HashMap<State, ArrayList<String>> syncVariables = new HashMap<State, ArrayList<String>>();
		for(Transition trans : statechart_receivers){
			State channelState = trans.getSynchronization().getSyncChannel().getState();
			State sourceState = (State)trans.getSource();
			Vertex targetState = trans.getTarget();
			String variableName = trans.getSynchronization().getSyncChannel().getName() + "Available" 
					+ sourceState.getParentStatechart().getParentRegion().getName().substring(0, 1).toUpperCase()
					+ sourceState.getParentStatechart().getParentRegion().getName().substring(1, sourceState.getParentStatechart().getParentRegion().getName().length())
					+ sourceState.getName().substring(0, 1).toUpperCase()
					+ sourceState.getName().substring(1, sourceState.getName().length())
					+ targetState.getName().substring(0, 1).toUpperCase()
					+ targetState.getName().substring(1, targetState.getName().length())
					+ trans.getPriority();
			if(syncVariables.containsKey(channelState)){
				syncVariables.get(channelState).add(variableName);
			}
			else{
				ArrayList<String> variableList = new ArrayList<String>();
				variableList.add(variableName);
				syncVariables.put(channelState, variableList);
			}
		}
		for(State state : syncVariables.keySet()){
			for(String variableName : syncVariables.get(state)){
				SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				eAnnotation.setSource("sync_variable");
				eAnnotation.getDetails().put("variableName", variableName);
				state.getExtensions().add(eAnnotation);
			}
		}
	}
	
	public void createSendSyncAction(ArrayList<Transition> statechart_senders){
		for (Transition curTrans : statechart_senders){
			
			Synchronization curSync = curTrans.getSynchronization();
			
			//generate action only for synchronizations with selector expression
			if(curSync.getSelectorExpression() != null){
				String assignment_lhs = SEND_SELECTOR_COND_VAR_PREFIX 
						+ curTrans.getSynchronization().getSyncChannel().getName() 
						+ " = ";
				
				//obtain generated selector expression
				SimulinkAnnotationExtension selExprAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				String annotationString = selExprAnnotation.getDetails().get("matlab");
				
				//generate new annotation with the assignment
				SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				eAnnotation.setSource("sel_cond_assign");
				eAnnotation.getDetails().put("assign", assignment_lhs + annotationString);
				curTrans.getExtensions().add(eAnnotation);
			}
		}
	}
	
	public void createConditions(ArrayList<Transition> statechart_receivers){
		HashMap<State, HashMap<SynchronizationChannel, HashMap<Transition, String>>> sourceStates = new HashMap<State, HashMap<SynchronizationChannel,HashMap<Transition,String>>>();
		for(Transition trans : statechart_receivers){
			String conditions = "";
			EAnnotation an = getAnnotation(trans, "async");
			if (an != null) {
				for(String details : an.getDetails().keySet()){
					if(details.equals("receive")){
						conditions = conditions + an.getDetails().get(details) + " && ";
					}
				}
			}
			an = getAnnotation(trans, "ActionLanguage");
			if (an != null) {
				if(an.getSource().equals("ActionLanguage")){
					for(String details : an.getDetails().keySet()){
						if(details.equals("matlab")){
							conditions = conditions + an.getDetails().get(details) + " && ";
						}
					}	
				}
			}
			
			for(ClockConstraint clockConst : trans.getClockConstraints()){
				conditions = conditions + "time(" + clockConst.getClock().getName() + ")" + getOperator(clockConst) + getTimeValue(clockConst) + " && ";
			}
			
			if(!conditions.equals("")){
				conditions = (String)conditions.subSequence(0, conditions.length()-4);
			}
			else{
				conditions = "true";
			}
			if(!sourceStates.containsKey((State)trans.getSource())){
				HashMap<SynchronizationChannel, HashMap<Transition, String>> conditionMap = new HashMap<SynchronizationChannel, HashMap<Transition,String>>();
				HashMap<Transition, String> conditionList = new HashMap<Transition, String>();
				conditionList.put(trans, conditions);
				conditionMap.put(trans.getSynchronization().getSyncChannel(), conditionList);
				sourceStates.put((State)trans.getSource(), conditionMap);
			}
			else if(!sourceStates.get((State)trans.getSource()).containsKey(trans.getSynchronization().getSyncChannel())){
				HashMap<Transition, String> conditionList = new HashMap<Transition, String>();
				conditionList.put(trans, conditions); 
				sourceStates.get((State)trans.getSource()).put(trans.getSynchronization().getSyncChannel(), conditionList);
			}
			else{
				sourceStates.get((State)trans.getSource()).get(trans.getSynchronization().getSyncChannel()).put(trans, conditions);
			}
		}
		
		for(State sourceState : sourceStates.keySet()){
			for(SynchronizationChannel channel : sourceStates.get(sourceState).keySet()){
				String conditionString = "";
				HashMap<Transition, String> conditionList = sourceStates.get(sourceState).get(channel);
				for(Transition t : conditionList.keySet()){
					State source = (State)t.getSource();
					Vertex target = t.getTarget();
					String variableName = t.getSynchronization().getSyncChannel().getName() + "Available" 
							+ source.getParentStatechart().getParentRegion().getName().substring(0, 1).toUpperCase()
							+ source.getParentStatechart().getParentRegion().getName().substring(1, source.getParentStatechart().getParentRegion().getName().length())
							+ source.getName().substring(0, 1).toUpperCase()
							+ source.getName().substring(1, source.getName().length())
							+ target.getName().substring(0, 1).toUpperCase()
							+ target.getName().substring(1, target.getName().length())
							+ t.getPriority();
					conditionString = conditionList.get(t);
					SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
					eAnnotation.setSource("sync_conditions");
					eAnnotation.getDetails().put("conditions", conditionString);
					eAnnotation.getDetails().put("variableName", variableName);
					sourceState.getExtensions().add(eAnnotation);
				}
				}	
			}
	}
	
	public String getOperator(ClockConstraint clockConst){
		switch(clockConst.getOperator()){
		case EQUAL: return "==";
		case UNEQUAL: return "!=";
		case LESS: return "<";
		case LESS_OR_EQUAL: return "<=";
		case GREATER: return ">";
		case GREATER_OR_EQUAL: return ">=";
		case REGULAR_EXPRESSION: return "";
		}
		return "";
	}
	
	public String getTimeValue(ClockConstraint clockConst){
		return getMatlabAnnotationValue(clockConst) + getSfTimeUnitConversionString(clockConst.getBound());
	}
	
	/**
	 * Helper function that returns the time unit conversion operations for 
	 * TimeValues that should be used in Stateflow.
	 * @param timeValue
	 * @return
	 */
	protected String getSfTimeUnitConversionString(TimeValue timeValue){
		
		//in Stateflow, we compute time in millisecond ticks
		switch(timeValue.getUnit()){
		case DAYS: return "*1000*60*60*24";
		case HOURS: return "*1000*60*60";
		case MINUTES: return "*1000*60";
		case SECONDS: return "*1000";
		default:
			return "";
		}
	}
	
	/**
	 * Helper function that returns the time unit conversion operations for 
	 * TimeValues that should be used in Simulink.
	 * @param timeValue
	 * @return
	 */
	protected String getSimulinkTimeUnitConversionString(TimeValue timeValue){
		//simulink computes time based on Seconds
		switch(timeValue.getUnit()){
		case DAYS: return "*60*60*24";
		case HOURS: return "*60*60";
		case MINUTES: return "*60";
		case SECONDS: return "";
		case MILLISECONDS: return "*0.001";
		case MICROSECONDS: return "*0.000001";
		default:
			return "";
		}
	}
	
	public void createSelectorConditions(ArrayList<Transition> statechart_receivers){
		HashMap<String, State> selectorConditions = new HashMap<String, State>();
		for(Transition trans : statechart_receivers){
			if(trans.getSynchronization().getSelectorExpression() != null){
				String condition = "";
				String selectorVarName = "selCond" + trans.getStatechart().getParentRegion().getName() + "_"
									 + trans.getSource().getName() + "_"
									 + trans.getTarget().getName()
									 + trans.getPriority();
				
				EAnnotation an = getAnnotation(trans.getSynchronization(), "ActionLanguage");
				if (an != null) {
					for(String details : an.getDetails().keySet()){
						if(details.equals("matlab")){
							condition = selectorVarName + " = (" + an.getDetails().get(details) + ")";
						}	
					}
				}
				
				selectorConditions.put(condition, (State)trans.getSource());
				
				//produce guard string for sync with selector expression
				String guard = selectorVarName + " == " + SEND_SELECTOR_COND_VAR_PREFIX + trans.getSynchronization().getSyncChannel().getName();
				SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				eAnnotation.setSource("selector_guard");
				eAnnotation.getDetails().put("guard", guard);
				trans.getExtensions().add(eAnnotation);
				
				//produce annotation for creating the selector variable for the receiving transition
				SimulinkAnnotationExtension varAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				varAnnotation.setSource("selCond_variable");
				varAnnotation.getDetails().put("varName", selectorVarName);
				trans.getExtensions().add(varAnnotation);
			}	
		}
		
		//produce annotations for the selector condition assignment in the source state of the receiving transition
		for(String condition : selectorConditions.keySet()){
			SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
			eAnnotation.setSource("selector_condition");
			eAnnotation.getDetails().put("condition", condition);
			selectorConditions.get(condition).getExtensions().add(eAnnotation);
		}
		
	}
	
	public void createSendGuard(ArrayList<Transition> statechart_receivers, ArrayList<Transition> statechart_senders){
		HashMap<Transition, HashMap<Region, String>> guards = new HashMap<Transition, HashMap<Region,String>>();
		for(Transition sendTrans : statechart_senders){
			HashMap<Region, String> guardList = new HashMap<Region, String>();
			String ownSelCond = "";
			EAnnotation an = getAnnotation(sendTrans.getSynchronization(), "ActionLanguage");
			if (an != null) {
				for(String details : an.getDetails().keySet()){
					if(details.equals("matlab")){
						ownSelCond =an.getDetails().get(details);
					}
				}
			}
			HashMap<Region, ArrayList<Transition>> regions = new HashMap<Region, ArrayList<Transition>>();
			for(Region reg : sendTrans.getSynchronization().getSyncChannel().getState().getEmbeddedRegions()){
				ArrayList<Transition> transList = new ArrayList<Transition>();
				for(Transition t : statechart_receivers){
					if(reg.getEmbeddedStatechart().isSuperStatechartOf(t.getStatechart())){
						transList.add(t);
					}
				}
				regions.put(reg, transList);
			}
			
			for(Region reg : regions.keySet()){
				String guard = "";
				SynchronizationChannel channel = sendTrans.getSynchronization().getSyncChannel();
				for(Transition recTrans : regions.get(reg)){
					if(recTrans.getSynchronization().getSyncChannel().equals(channel)){
						String selectorCondition = "";
						State sourceState = (State)recTrans.getSource();
						Vertex targetState = recTrans.getTarget();
						String syncVariable = recTrans.getSynchronization().getSyncChannel().getName() + "Available" 
								+ sourceState.getParentStatechart().getParentRegion().getName().substring(0, 1).toUpperCase()
								+ sourceState.getParentStatechart().getParentRegion().getName().substring(1, sourceState.getParentStatechart().getParentRegion().getName().length())
								+ sourceState.getName().substring(0, 1).toUpperCase()
								+ sourceState.getName().substring(1, sourceState.getName().length())
								+ targetState.getName().substring(0, 1).toUpperCase()
								+ targetState.getName().substring(1, targetState.getName().length())
								+ recTrans.getPriority();
						Boolean hasSelectorType = sendTrans.getSynchronization().getSyncChannel().getSelectorType() != null;
						if(hasSelectorType){
							selectorCondition = "(selCond" + recTrans.getStatechart().getParentRegion().getName() + "_"
								       + recTrans.getSource().getName() + "_"
								       + recTrans.getTarget().getName()
								       + recTrans.getPriority()
								       + " == (" + ownSelCond + "))";
							guard = guard + "(" + syncVariable + " && " + selectorCondition + ") || ";
						}
						else{
							guard = guard + syncVariable + " || ";
						}
					}
				}		
				if(!guard.equals("")){
					guardList.put(reg, (String)guard.subSequence(0, guard.length()-4));
				}				
			}
			guards.put(sendTrans, guardList);
		}
		for(Transition trans: guards.keySet()){
			for(Region r : guards.get(trans).keySet()){
				SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				eAnnotation.setSource("syncsend_guard");
				eAnnotation.getDetails().put("guard", guards.get(trans).get(r));
				eAnnotation.getReferences().add(r);
				trans.getSynchronization().getExtensions().add(eAnnotation);
			}			
		}
	}
	
	public void collectCICs(ComponentInstanceConfiguration cic, List<ComponentInstanceConfiguration> list){		
		for(ComponentInstance ci : cic.getComponentInstances()){
			if(ci instanceof StructuredComponentInstance){
				list.add(((StructuredComponentInstance) ci).getEmbeddedCIC());
				collectCICs(((StructuredComponentInstance) ci).getEmbeddedCIC(),list);
			}
		}	
	}
	
	public void createPortIDs(ComponentInstanceConfiguration cic){
		int counter = 1;
		for(ComponentInstance ci : cic.getComponentInstances()){
			for(PortInstance portInstance : ci.getPortInstances()){
				SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
				eAnnotation.setSource("PortInstance");
				// create ids only for instances of discrete ports which doesn't have delegations to upper components 
				if(needsPortID(portInstance,cic)){					
					eAnnotation.getDetails().put("ID", String.valueOf(counter));
					counter++;
				}
				else{
					eAnnotation.getDetails().put("ID", "noID");
				}
				portInstance.getExtensions().add(eAnnotation);
			}
		}		
	}

	public boolean stateChartContainsStateChart(RealtimeStatechart container, RealtimeStatechart searchedSC){
		if(searchedSC == null)
			return false;
		
		if(container==searchedSC)
			return true;
		
		EList<State> states = container.getStates();
			for(State state : states){				
				EList<Region> regions = state.getEmbeddedRegions();
				if(state.getEmbeddedRegions().size()>0 )
				{
					for(Region r : regions)
						return stateChartContainsStateChart(r.getEmbeddedStatechart(), searchedSC);
				}
		}
	
		return false;
	}

	public void enumerateMessageTypes(){	
		
		ModelElementCategory message_cat = null;		
		for (ModelElementCategory cat : cat_list){
			if(cat.getKey().equals("org.muml.pim.messagetype.category"))
				message_cat = cat;
		}
		
		if (message_cat!=null){
			int mtc = 1;
			for(int j=0; j<message_cat.getModelElements().size(); j++){			
				MessageTypeRepository mi = (MessageTypeRepository) message_cat.getModelElements().get(j);
				for(MessageType mt : mi.getMessageTypes()){
					// If the message type has no parameters
					if(mt.getParameters().size()==0){
						
						messageMapping.put(mtc, 1);
						
						SimulinkAnnotationExtension eAnnotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
						eAnnotation.setSource("msgID");
						eAnnotation.getDetails().put(String.valueOf(mtc), String.valueOf(mtc));
						mt.getExtensions().add(eAnnotation);
						mtc++;						
					}
					// If the message type has parameters
					else{
						messageMapping.put(mtc, mt.getParameters().size());
						
						for(int i=0; i<mt.getParameters().size(); i++){
							Parameter par = mt.getParameters().get(i);
							
							SimulinkAnnotationExtension msgID = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
							msgID.setSource("msgID");
							msgID.getDetails().put(String.valueOf(mtc), String.valueOf(mtc));	
							par.getExtensions().add(msgID);
							mtc++;
							
							SimulinkAnnotationExtension paramID = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
							paramID.setSource("tmp_var");	
							paramID.getDetails().put(String.valueOf(i+1), "tmp_var_"+(i+1));
							par.getExtensions().add(paramID);						
						}
					}
				}
			}
		}
	}
	

	public int getSourceBufferSize(DiscretePort dp){		
		try {
			long bufferSize = dp.getRefinedRole().getReceiverMessageBuffer().get(0).getBufferSize().getValue();
			return (int) bufferSize;	
		}
		catch(Exception e){
			long bufferSize = DEFAULT_BUFFER_SIZE;
			return (int) bufferSize;		
		}
	}
	
	/**
	 * Helper function that returns the minimum message delay for messages that are
	 * send and received by the discrete port provided as a parameter. If no 
	 * minimum message delay has been defined, the default value is returned instead.
	 * @param dp
	 * @return
	 */
	private String getMinMsgDelay(DiscretePort dp){
		try {
			TimeValue timeValue = dp.getRefinedRole().getCoordinationProtocol().getRoleConnector().
					getConnectorQualityOfServiceAssumptions().getMinMessageDelay();
			
			//ensure that value is an integer
			Integer.parseInt(((LiteralExpression)timeValue.getValue()).getValue());

			// the link layer, which receives this value, operates on a tick-based time value just as Stateflow
			return ((LiteralExpression)timeValue.getValue()).getValue() + getSfTimeUnitConversionString(timeValue);
		}
		catch(Exception e){
			return DEFAULT_MIN_MSG_DELAY;
		}
	}
	
	/**
	 * Helper function that returns the maximum message delay for messages that are
	 * send and received by the discrete port provided as a parameter. If no
	 * maximum message delay has been defined, the default value is returned instead.
	 * @param dp
	 * @return
	 */
	private String getMaxMsgDelay(DiscretePort dp){
		try {
			TimeValue timeValue = dp.getRefinedRole().getCoordinationProtocol().getRoleConnector().
					getConnectorQualityOfServiceAssumptions().getMaxMessageDelay();
			
			//ensure that value is an integer
			Integer.parseInt(((LiteralExpression)timeValue.getValue()).getValue());

			// the link layer, which receives this value, operates on a tick-based time value just as Stateflow
			return ((LiteralExpression)timeValue.getValue()).getValue() + getSfTimeUnitConversionString(timeValue);
		}
		catch(Exception e){
			return DEFAULT_MAX_MSG_DELAY;
		}
	}
	
	public String computeMessageMapping(){
		if(messageMapping.keySet().size()>0){
			StringBuffer messageMappingString = new StringBuffer();
			messageMappingString.append("[");
			for(int messageId : messageMapping.keySet()){
				int messageParamNumber = messageMapping.get(messageId);
				messageMappingString.append(messageId+" "+messageParamNumber+"; ");
			}
			messageMappingString.deleteCharAt(messageMappingString.length()-1);
			messageMappingString.deleteCharAt(messageMappingString.length()-1);
			messageMappingString.append("]");
			return messageMappingString.toString();
		}
		else return "[]";
	}
	
	public String[] getTriggerMessageEventStrings(Transition t, DiscretePort port){
		String checkQueue = "";
		String dequeue = "";
		if (t.getTriggerMessageEvent() != null) {
			AsynchronousMessageEvent ame = t.getTriggerMessageEvent();
			Message message = ame.getMessage();
			MessageType mt = (MessageType) message.getInstanceOf();
			
			String evtQueue = port.getName() + "ReadOut";
			String paramQueue = port.getName() + "ParamReadOut";
			
			//If the MessageType has no parameters
			if (mt.getParameters().size()==0){			

				String constant = "EVT_"+mt.getName().toUpperCase();
				
				checkQueue = port.getName()+"_checkQueue("+constant+", "+evtQueue+")";
				dequeue = "["+evtQueue+", "+paramQueue+"] = "+ port.getName()+"_dequeue("+constant+", "+evtQueue+", "+paramQueue+")";
			}
			//If the MessageType has parameters
			else{
				for(int i=0; i<mt.getParameters().size(); i++){
					
					Parameter par = mt.getParameters().get(i);					
					
					String constant = "EVT_"+mt.getName().toUpperCase()+"_"+par.getName().toUpperCase();
					
					// get the tmp var for the parameter
					String tmpVar = getAnnotation(par, "tmp_var").getDetails().get(0).getValue();
					
					if(i==mt.getParameters().size()-1){						
						checkQueue += port.getName()+"_checkQueue("+constant+", "+evtQueue+")";
						dequeue += "["+evtQueue+", "+paramQueue+", "+tmpVar+"] = "+ port.getName()+"_dequeue("+constant+", "+evtQueue+", "+paramQueue+")";
					}
					else{
						checkQueue += port.getName()+"_checkQueue("+constant+", "+evtQueue+") && ";
						dequeue += "["+evtQueue+", "+paramQueue+", "+tmpVar+"] = "+ port.getName()+"_dequeue("+constant+", "+evtQueue+", "+paramQueue+"); \n";
					}					
				}
			}
		}
		String[] queueReceiveOperations = {checkQueue, dequeue};
		return queueReceiveOperations;
	}	

	public String getRaiseMessageEventString(Transition t, DiscretePort port){
		String send = "";
		if (t.getRaiseMessageEvent() != null) {
			AsynchronousMessageEvent ame = t.getRaiseMessageEvent();
			Message message = ame.getMessage();
			MessageType mt = (MessageType) message.getInstanceOf();			
							
			String evtQueue = port.getName() + "WriteOut";
			String paramQueue = port.getName() + "ParamWriteOut";				
			
			//If the MessageType has no parameters
			if (mt.getParameters().size()==0){			

				String constant = "EVT_"+mt.getName().toUpperCase();
				
				send = "[" + evtQueue + ", " + paramQueue + "] = " +
						port.getName()+"_enqueue(" + constant + ", " + evtQueue + ", 0, " + paramQueue + ")";
				
			}
			
			//If the MessageType has parameters
			else{					
				ParameterBinding parBinding = null;
				
				for(Parameter par : mt.getParameters()){					
					//Get ParameterBinding						
					for(ParameterBinding pb : message.getParameterBinding())
					{
						if(pb.getParameter()==par)
							parBinding=pb;
					}
			
					if(parBinding!=null){
						
						String parBindingValue = "";				
						
						try{
							parBindingValue = getAnnotation(parBinding, "ActionLanguage").getDetails().get("matlab");
						}
						catch(Exception e){
							parBindingValue = "0";
						}
						
						String constant = "EVT_"+mt.getName().toUpperCase()+"_"+par.getName().toUpperCase();
						
						send+= 	"[" + evtQueue + ", " + paramQueue + "] = " +
								port.getName()+"_enqueue(" + constant + ", " + evtQueue + ", " + "double(" + parBindingValue + ")" + ", " + paramQueue + ")\n";
					}					
				}
			}			
		}			
		return send;
	}
	
	
	public boolean needsPortID(PortInstance pi, ComponentInstanceConfiguration cic) {
		Port portType = pi.getPortType();		
		// only discrete ports need port ids 
		if(portType instanceof DiscretePort){
			
			//if pi is a port instance of an atomic component
			if(portType.getComponent() instanceof StaticAtomicComponent){
				// if the port instance is not connected with a delegation, it need an id
				if(getDelegationConnectorInstance(pi)!=null){
					 return false;
				}	
				return true;
			}
			// if pi is a port instance of a structured component on the main component instance configuration, pi needs a port id
			else if(portType.getComponent() instanceof StructuredComponent && cic == chosenCIC)
				return true;	       	
			// if pi is a port instance of a structured component in an embedded CIC and it is not connected through a delegation to a 
			// port instance of the "upper" structured component, then it needs an id.
			else{
				
				DelegationConnectorInstance delegation = getDelegationConnectorInstance(pi); 
				if(delegation!=null)
					//guard against class cast exception
					if(cic.eContainer() instanceof ModelElementCategory){
						return true;
					} else { //if the parent is no ModelElementCategory, then it must be a structure component instance
						if (((StructuredComponentInstance)cic.eContainer()).getPortInstances().contains(delegation.getConnectorEndpointInstances()))							
							return false;
					}
				}					
			return true;			
		}
		
		// if pi is not a discrete port instance
		else return false;
	}
	
	public void expressionAnalysis(Resource resource){
		
		ExpressionTransformation transformation = new ExpressionTransformation();
		List<ExtendableElement> matlabAnnotations  = new LinkedList<ExtendableElement>();
		
		for (TreeIterator<EObject> it = resource.getContents().get(0).eAllContents(); it.hasNext();) {
			
			EObject eObject = it.next();		 						
			if (eObject instanceof Action || eObject instanceof Transition || eObject instanceof Operation || eObject instanceof HybridPort ||
					eObject instanceof ParameterBinding || eObject instanceof Synchronization || eObject instanceof ClockConstraint || eObject instanceof Variable) {
				//only annotate Transitions with guards
				if (eObject instanceof Transition){ //Transition
					Transition t = (Transition)eObject;
					if(!(t.getGuard() == null)){
						if(!(t.getGuard() instanceof TextualExpression && !"embedded_matlab".equals(((TextualExpression)t.getGuard()).getLanguage()))){							
							matlabAnnotations.add(t);
						}
					}
				}
				//only annotate ParameterBindings for raised AsynchronousMessageEvents
				else if ((eObject instanceof ParameterBinding) && (eObject.eContainer() instanceof Message)){
					matlabAnnotations.add((ParameterBinding)eObject);
				}		
				//only annotate received Synchronizations
				else if (eObject instanceof Synchronization){
					Synchronization s = (Synchronization)eObject;
					if (s.getSelectorExpression() != null){
						matlabAnnotations.add(s);
					}
				}
				else if (eObject instanceof Variable){
					//only generate an annotation if the variable has an initialize expression
					if (((Variable)eObject).getInitializeExpression() != null){
						matlabAnnotations.add((Variable) eObject);
					}
				}
				//don't annotate empty Actions (sometimes empty Block gets created)
				else if (eObject instanceof Action){
					Action a = (Action)eObject;
					Expression e = null;
					if (a.getExpressions().size()>0)
						e = a.getExpressions().get(0);
					if (e!=null){
						if(e instanceof Block){
							Block b = (Block)e;
							if(!b.getExpressions().isEmpty()){
								matlabAnnotations.add((Action)eObject);
							}
						}
						else if ((e instanceof TextualExpression && "embedded_matlab".equals(((TextualExpression)e).getLanguage()))){
							matlabAnnotations.add((Action)eObject);
						}
					}
				}
				else if (!(eObject instanceof ParameterBinding) && !(eObject instanceof TextualExpression && !"embedded_matlab".equals(((TextualExpression)eObject).getLanguage()))){
					matlabAnnotations.add((ExtendableElement)eObject);
				}
			}			
		}	
		
		List<String> expressions = transformation.generateAll(matlabAnnotations);
		for(int i=0; i < matlabAnnotations.size(); i++)
			this.addMatlabAnnotation(matlabAnnotations.get(i), expressions.get(i));
	}	
	
	private void addMatlabAnnotation(ExtendableElement element, String expression)
	{
		SimulinkAnnotationExtension annotation = ExtensionFactory.eINSTANCE.createSimulinkAnnotationExtension();
		annotation.setSource("ActionLanguage");
		
		//treat HybridPorts specially because they have two expressions that were translated
		if(element instanceof HybridPort){
			//split expression
			String[] entries = expression.split("##");
			annotation.getDetails().put("samplingInterval", entries[0]);
			if(entries.length == 2){
				annotation.getDetails().put("init", entries[1]);
			} else {
				annotation.getDetails().put("init", "");
			}
			
		} else {
			annotation.getDetails().put("matlab",expression);
		}
		element.getExtensions().add(annotation);	
	}
		
	/**
	 * Helper that returns the value of the "ActionLanguage" annotation for the given EObject.
	 * @param obj
	 */
	private String getMatlabAnnotationValue(ExtendableElement obj){
		EAnnotation an = getAnnotation(obj, "ActionLanguage");
		if (an != null) {			
			for(String details : an.getDetails().keySet()){
				if(details.equals("matlab")){
					return an.getDetails().get(details);
				}
			}	
		}
		
		//return null if no annotation has been found
		return null;
	}
	
	private SimulinkAnnotationExtension getAnnotation(ExtendableElement obj, String source) {
		for(Extension ext : obj.getExtensions()){
			if (ext instanceof SimulinkAnnotationExtension) {
				SimulinkAnnotationExtension an = (SimulinkAnnotationExtension) ext;
				if(an.getSource().equals(source)){
					return an;
				}
			}
		}
		return null;
	}

	// ----------- FOR CURRENT VERSION ONLY-----------
	public static boolean modelContainsMultiPorts(RootNode model){
		for (ModelElementCategory cat : model.getCategories()){			
			if(cat.getKey().equals("org.muml.pim.components.category"))
			{
				for(ExtendableElement me : cat.getModelElements()){
					Component comp = (Component)me;
					for(Port p : comp.getPorts()){
						if(p instanceof DiscretePort)
							if(((DiscretePort)p).getCardinality().getUpperBound().getValue()!=1 ||
									((DiscretePort)p).getCardinality().getLowerBound().getValue()==0)
								return true;
					}
				}
			}			
		}
		return false;
	}
	
	public int getMaxParamNumber(DiscretePort dp){
		int paramNumber = 0;
		try{
			if(dp.getReceiverMessageTypes().size() > 0){
				for(MessageType mt : dp.getReceiverMessageTypes()){
					if(mt.getParameters()!=null)
						if(paramNumber < mt.getParameters().size())
							paramNumber = mt.getParameters().size();
				}
			}
		}
		catch(Exception e){}
		return paramNumber;
	}
	
	public DelegationConnectorInstance getDelegationConnectorInstance(PortInstance pi){
		for(ConnectorInstance ci : pi.getConnectorInstances()){	
			if(ci instanceof DelegationConnectorInstance)
				return (DelegationConnectorInstance)ci;
		}
		return null;
	}
	
	
	public void createCommunicationStructureAnnotation(ComponentInstanceConfiguration cic, EAnnotation cic_eAnnotation) {
		for (ConnectorInstance connectorInstance : cic.getPortConnectorInstances()) {
			if (connectorInstance instanceof AssemblyConnectorInstance
					&& connectorInstance.getConnectorEndpointInstances().get(0) instanceof DiscreteSinglePortInstance
					&& connectorInstance.getConnectorEndpointInstances().get(1) instanceof DiscreteSinglePortInstance) {

				cic_eAnnotation.getDetails().put("CommunicationStructure", "true");
				return;
			}
		}
		cic_eAnnotation.getDetails().put("CommunicationStructure", "false");
	}

	// ----------- FOR CURRENT VERSION ONLY-----------
	public static boolean modelContainsArrayParameters(RootNode model){			 
		
		for (ModelElementCategory cat : model.getCategories()){			
			if(cat.getKey().equals("org.muml.pim.messagetype.category"))
			{
				for(ExtendableElement me : cat.getModelElements()){
					MessageTypeRepository mi = (MessageTypeRepository)me;
					for(MessageType mt : mi.getMessageTypes()){
						for(Parameter par : mt.getParameters()){	
							if (par.getDataType() instanceof ArrayDataType)
								return true;														
						}
					}
				}
			}			
		}
		return false;
	}	

	// ----------- FOR CURRENT VERSION ONLY-----------
	public static boolean modelContainsMultiDimensionalArrayVariables(RootNode model){
		
		for (ModelElementCategory cat : model.getCategories()){			
			if(cat.getKey().equals("org.muml.pim.realtimestatechart.category"))
			{
				for(ExtendableElement rtsc : cat.getModelElements()){					
						TreeIterator<EObject> it = EcoreUtil.getAllContents(rtsc, true);
						while (it.hasNext()) {
							EObject object = it.next();
							if(BehaviorPackage.Literals.VARIABLE.isSuperTypeOf(object.eClass())){
								Variable var = (Variable) object;
								DataType dataType = var.getDataType();
								
								//a Multidimensional array is defined by a ArrayDataType whose type is, again, an ArrayDataType
								if (dataType instanceof ArrayDataType && ((ArrayDataType)dataType).getType() instanceof ArrayDataType)
									return true;
							}
						}
					}
				}
			}	
		return false;
	}
	
	
	public void moveDelegationConnectorInstances(ComponentInstanceConfiguration cic){
		HashMap<DelegationConnectorInstance, ComponentInstanceConfiguration>delegations = new HashMap<DelegationConnectorInstance, ComponentInstanceConfiguration>();
		
		for(PortConnectorInstance delInst: cic.getPortConnectorInstances()){
			if(delInst instanceof DelegationConnectorInstance){
				for (ConnectorEndpointInstance endPoint : delInst.getConnectorEndpointInstances()){
					PortInstance portInstance = (PortInstance)endPoint;
					ComponentInstanceConfiguration cic2 = (ComponentInstanceConfiguration)portInstance.getComponentInstance().eContainer();
					if(!(cic2 == cic)){
						delegations.put((DelegationConnectorInstance)delInst, cic2);
					}
				}
			}
		}
		
		for(DelegationConnectorInstance delInst: delegations.keySet()){
			delegations.get(delInst).getPortConnectorInstances().add(delInst);
		}
	}	
}

