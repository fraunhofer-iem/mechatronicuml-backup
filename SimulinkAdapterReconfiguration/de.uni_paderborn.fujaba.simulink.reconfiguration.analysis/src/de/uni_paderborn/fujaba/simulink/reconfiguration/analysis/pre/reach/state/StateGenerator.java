package de.uni_paderborn.fujaba.simulink.reconfiguration.analysis.pre.reach.state;

import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelinstanceFactory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;
import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;

/**
 * Generates a State for a given instance
 */
public class StateGenerator 
{	
	final static String CATEGORY_COMPONENTS = "de.uni_paderborn.fujaba.muml.components.category";
	static final String CATEGORY_RTSC = "de.uni_paderborn.fujaba.muml.realtimestatechart.category";
	static final String CATEGORY_MSGTYPE = "de.uni_paderborn.fujaba.muml.messagetype.category";
	
	static final String BASERECONFIGURATIONMESSAGETYPEREPOSITORY = "_BaseReconfigurationMessageTypeRepo";
	
	public static final String MSGTYPE_FINISHED = "finished";
	public static final String MSGTYPE_SETUP = "setup";
	public static final String MSGTYPE_FADING= "fading";
	public static final String MSGTYPE_TEARDOWN = "teardown";	
	
	static final ComponentFactory componentfactory = ComponentFactory.eINSTANCE;
	static final InstanceFactory instancefactory = InstanceFactory.eINSTANCE;
	static final ValuetypeFactory valuefactory = ValuetypeFactory.eINSTANCE;
	
	private RootNode model = null;
	
	StateStructureGenerator structureGen = null;
	StateBehaviorGenerator behaviorGen = null;
	
	public StateGenerator(RootNode model)
	{
		this.model = model;
		this.structureGen = new StateStructureGenerator();
		this.behaviorGen = new StateBehaviorGenerator(this.model);		
	}
	
	public StateBehaviorGenerator getStateBehaviorGenerator()
	{
		return this.behaviorGen;
	}
	
	/**
	 * Generate a State for the given instance. You can insert it into the
	 * instance using {@link #injectInto(StructuredComponentInstance, AtomicComponent)}
	 */	
	public AtomicComponent generateStateType(StructuredComponentInstance target)
	{
		Executor executor = null;
		if(target.getComponentType() instanceof ReconfigurableStructuredComponent)
			executor = ((ReconfigurableStructuredComponent)target.getComponentType()).getExecutor();
		
		//Generate MessageTypes
		MessageTypeRepository msgTypes = this.getReconfigurationMessageTypeRepository();
		
		//Generate Behavior		
		RealtimeStatechart behavior = behaviorGen.generateBehavior(target.getName(), msgTypes);
		this.addElementToCategory(CATEGORY_RTSC, behavior);

		//Generate Structure		
		AtomicComponent stateType = structureGen.generateStateType(behavior, target.getName(), msgTypes, executor);
		this.addElementToCategory(CATEGORY_COMPONENTS, stateType);
		
		return stateType;
	}
	
	

	/**
	 * Creates an instance of the given State component and insert it into the given instance
	 */
	public void injectInto(StructuredComponentInstance target, AtomicComponent stateType)
	{
		//Generate Instance
		AtomicComponentInstance stateInst = structureGen.generateStateInstance(stateType);		
		
		this.injectIntoType((ReconfigurableStructuredComponent) target.getComponentType(), stateType);
		this.injectIntoInstance(target, stateInst);
	}
	
	/**
	 * Inject a ComponentPart into the given Component to reference the State Component
	 */
	protected void injectIntoType(ReconfigurableStructuredComponent targetType, AtomicComponent stateType)
	{
		//Create ComponentPart
		ComponentPart statePart = componentfactory.createComponentPart();
		statePart.setName("State");
		statePart.setCardinality(this.generateCardinality(1, 1));
		statePart.setComponentType(stateType);
		statePart.setParentComponent(targetType);
		
		//Create PortParts
		for(Port port: stateType.getPorts())
		{
			PortPart portPart = componentfactory.createPortPart();		
			portPart.setComponentPart(statePart);
			portPart.setPortType(port);
		}
	}

	/**
	 * Inject the state instance into the target instance
	 */
	protected void injectIntoInstance(StructuredComponentInstance targetInstance, AtomicComponentInstance stateInstance)
	{
		targetInstance.getEmbeddedCIC().getComponentInstances().add(stateInstance);
		for(ComponentPart part: ((StructuredComponent)targetInstance.getComponentType()).getEmbeddedComponentParts())
			if(part.getComponentType() == stateInstance.getComponentType())
				stateInstance.setComponentPart(part);
		
	}

	/**
	 * Generate a Cardinality with the given upper and lower bound
	 */
	private Cardinality generateCardinality(long lower, long upper)
	{
		Cardinality card = valuefactory.createCardinality();
		NaturalNumber lowerBound = valuefactory.createNaturalNumber();
		lowerBound.setValue(lower);
		NaturalNumber upperBound = valuefactory.createNaturalNumber();
		upperBound.setValue(upper);	
		card.setLowerBound(lowerBound);
		card.setUpperBound(upperBound);
		return card;
	}
	
	/**
	 * Adds an element to a category. If the category is not present, it is created.
	 */
	private void addElementToCategory(String categoryType, ExtendableElement element)
	{
		//Find category
		ModelElementCategory category = null;
		for(ModelElementCategory cat: this.model.getCategories())
			if(categoryType.equals(cat.getKey()))
				category = cat;
		
		//Create category
		if(category == null)
		{
			category = ModelinstanceFactory.eINSTANCE.createModelElementCategory();
			category.setKey(categoryType);
			this.model.getCategories().add(category);
		}		
		
		//Add element
		category.getModelElements().add(element);
	}
	
	/**
	 * Get the MessageTypeRepository 'BASERECONFIGURATIONMESSAGETYPEREPOSITORY'
	 * 
	 * No, Java is not the language you should use to work with models ...
	 */
	private MessageTypeRepository getReconfigurationMessageTypeRepository() 
	{
		for(ModelElementCategory cat: this.model.getCategories())
			if(CATEGORY_MSGTYPE.equals(cat.getKey()))
				for(ExtendableElement element:cat.getModelElements())
					if(element instanceof MessageTypeRepository)
						if(BASERECONFIGURATIONMESSAGETYPEREPOSITORY.equals(((MessageTypeRepository)element).getName()))
							return (MessageTypeRepository) element;
		throw new IllegalArgumentException("Could not find MessageTypeRepository " + BASERECONFIGURATIONMESSAGETYPEREPOSITORY);
	}
}
