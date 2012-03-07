/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.deployment.parts;

/**
 * 
 * 
 */
public class DeploymentViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Deployment view descriptor
	 * 
	 */
	public static class Deployment_ {
		public static class Properties {
	
			
			public static String componentInstanceConfiguration = "deployment::Deployment_::properties::componentInstanceConfiguration";
			
	
		}
	
	}

	/**
	 * HardwareNode view descriptor
	 * 
	 */
	public static class HardwareNode {
		public static class Properties {
	
			
			public static String deployment_ = "deployment::HardwareNode::properties::deployment_";
			
			
			public static String deployedInstances = "deployment::HardwareNode::properties::deployedInstances";
			
	
		}
	
	}

	/**
	 * HardwarePort view descriptor
	 * 
	 */
	public static class HardwarePort {
		public static class Properties {
	
			
			public static String hardwareNode = "deployment::HardwarePort::properties::hardwareNode";
			
			
			public static String outgoingCommunicationLink = "deployment::HardwarePort::properties::outgoingCommunicationLink";
			
			
			public static String incomingCommunicationLink = "deployment::HardwarePort::properties::incomingCommunicationLink";
			
			
			public static String deployedPortInstance = "deployment::HardwarePort::properties::deployedPortInstance";
			
	
		}
	
	}

	/**
	 * CommunicationLink view descriptor
	 * 
	 */
	public static class CommunicationLink {
		public static class Properties {
	
			
			public static String deployment_ = "deployment::CommunicationLink::properties::deployment_";
			
			
			public static String source = "deployment::CommunicationLink::properties::source";
			
			
			public static String target = "deployment::CommunicationLink::properties::target";
			
	
		}
	
	}

}
