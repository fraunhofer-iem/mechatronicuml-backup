/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts;

/**
 * 
 * 
 */
public class ComponentViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * ContinuousPort view descriptor
	 * 
	 */
	public static class ContinuousPort {
		public static class Properties {
	
			
			public static String name = "component::ContinuousPort::properties::name";
			
			
			public static String comment = "component::ContinuousPort::properties::comment";
			
			
			public static String incomingConnectors = "component::ContinuousPort::properties::incomingConnectors";
			
			
			public static String outgoingConnectors = "component::ContinuousPort::properties::outgoingConnectors";
			
			
			public static String component_ = "component::ContinuousPort::properties::component_";
			
			
			public static String kind = "component::ContinuousPort::properties::kind";
			
			
			public static String type = "component::ContinuousPort::properties::type";
			
	
		}
	
	}

	/**
	 * DiscretePort view descriptor
	 * 
	 */
	public static class DiscretePort {
		public static class Properties {
	
			
			public static String name = "component::DiscretePort::properties::name";
			
			
			public static String comment = "component::DiscretePort::properties::comment";
			
			
			public static String incomingConnectors = "component::DiscretePort::properties::incomingConnectors";
			
			
			public static String outgoingConnectors = "component::DiscretePort::properties::outgoingConnectors";
			
			
			public static String component_ = "component::DiscretePort::properties::component_";
			
			
			public static String behavior = "component::DiscretePort::properties::behavior";
			
			
			public static String refines = "component::DiscretePort::properties::refines";
			
			
			public static String senderMessageInterface = "component::DiscretePort::properties::senderMessageInterface";
			
			
			public static String receiverMessageInterface = "component::DiscretePort::properties::receiverMessageInterface";
			
			
			public static String adaptationBehavior = "component::DiscretePort::properties::adaptationBehavior";
			
			
			public static String roleAndAdaptationBehavior = "component::DiscretePort::properties::roleAndAdaptationBehavior";
			
	
		}
	
	}

	/**
	 * ComponentPart view descriptor
	 * 
	 */
	public static class ComponentPart {
		public static class Properties {
	
			
			public static String comment = "component::ComponentPart::properties::comment";
			
			
			public static String componentType = "component::ComponentPart::properties::componentType";
			
			
			public static String parentComponent = "component::ComponentPart::properties::parentComponent";
			
			
			public static String fromRev = "component::ComponentPart::properties::fromRev";
			
			
			public static String toRev = "component::ComponentPart::properties::toRev";
			
			
			public static String delegation = "component::ComponentPart::properties::delegation";
			
	
		}
	
	}

	/**
	 * StructuredComponent view descriptor
	 * 
	 */
	public static class StructuredComponent {
		public static class Properties {
	
			
			public static String name = "component::StructuredComponent::properties::name";
			
			
			public static String comment = "component::StructuredComponent::properties::comment";
			
			
			public static String referencingComponentParts = "component::StructuredComponent::properties::referencingComponentParts";
			
			
			public static String componentType = "component::StructuredComponent::properties::componentType";
			
	
		}
	
	}

	/**
	 * AtomicComponent view descriptor
	 * 
	 */
	public static class AtomicComponent {
		public static class Properties {
	
			
			public static String name = "component::AtomicComponent::properties::name";
			
			
			public static String comment = "component::AtomicComponent::properties::comment";
			
			
			public static String referencingComponentParts = "component::AtomicComponent::properties::referencingComponentParts";
			
			
			public static String componentType = "component::AtomicComponent::properties::componentType";
			
			
			public static String behavior = "component::AtomicComponent::properties::behavior";
			
	
		}
	
	}

	/**
	 * Assembly view descriptor
	 * 
	 */
	public static class Assembly {
		public static class Properties {
	
			
			public static String fromPort = "component::Assembly::properties::fromPort";
			
			
			public static String toPort = "component::Assembly::properties::toPort";
			
			
			public static String parentComponent = "component::Assembly::properties::parentComponent";
			
			
			public static String behavior = "component::Assembly::properties::behavior";
			
			
			public static String to = "component::Assembly::properties::to";
			
			
			public static String from = "component::Assembly::properties::from";
			
			
			public static String coordinationPattern = "component::Assembly::properties::coordinationPattern";
			
	
		}
	
	}

	/**
	 * Delegation view descriptor
	 * 
	 */
	public static class Delegation {
		public static class Properties {
	
			
			public static String fromPort = "component::Delegation::properties::fromPort";
			
			
			public static String toPort = "component::Delegation::properties::toPort";
			
			
			public static String parentComponent = "component::Delegation::properties::parentComponent";
			
			
			public static String componentPart = "component::Delegation::properties::componentPart";
			
	
		}
	
	}

	/**
	 * HybridPort view descriptor
	 * 
	 */
	public static class HybridPort {
		public static class Properties {
	
			
			public static String name = "component::HybridPort::properties::name";
			
			
			public static String comment = "component::HybridPort::properties::comment";
			
			
			public static String incomingConnectors = "component::HybridPort::properties::incomingConnectors";
			
			
			public static String outgoingConnectors = "component::HybridPort::properties::outgoingConnectors";
			
			
			public static String component_ = "component::HybridPort::properties::component_";
			
			
			public static String behavior = "component::HybridPort::properties::behavior";
			
			
			public static String refines = "component::HybridPort::properties::refines";
			
			
			public static String senderMessageInterface = "component::HybridPort::properties::senderMessageInterface";
			
			
			public static String receiverMessageInterface = "component::HybridPort::properties::receiverMessageInterface";
			
			
			public static String adaptationBehavior = "component::HybridPort::properties::adaptationBehavior";
			
			
			public static String roleAndAdaptationBehavior = "component::HybridPort::properties::roleAndAdaptationBehavior";
			
			
			public static String kind = "component::HybridPort::properties::kind";
			
			
			public static String type = "component::HybridPort::properties::type";
			
	
		}
	
	}

}
