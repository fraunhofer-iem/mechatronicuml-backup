/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.pattern.parts;

/**
 * 
 * 
 */
public class PatternViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * RoleConnector view descriptor
	 * 
	 */
	public static class RoleConnector {
		public static class Properties {
	
			
			public static String behavior = "pattern::RoleConnector::properties::behavior";
			
			
			public static String bidirectional = "pattern::RoleConnector::properties::bidirectional";
			
			
			public static String source = "pattern::RoleConnector::properties::source";
			
			
			public static String target = "pattern::RoleConnector::properties::target";
			
			
			public static String coordinationPattern = "pattern::RoleConnector::properties::coordinationPattern";
			
	
		}
	
	}

	/**
	 * CoordinationPattern view descriptor
	 * 
	 */
	public static class CoordinationPattern {
		public static class Properties {
	
			
			public static String name = "pattern::CoordinationPattern::properties::name";
			
	
		}
	
	}

	/**
	 * Role view descriptor
	 * 
	 */
	public static class Role {
		public static class Properties {
	
			
			public static String name = "pattern::Role::properties::name";
			
			
			public static String behavior = "pattern::Role::properties::behavior";
			
			
			public static String incomingRoleConnector = "pattern::Role::properties::incomingRoleConnector";
			
			
			public static String coordinationPattern = "pattern::Role::properties::coordinationPattern";
			
			
			public static String senderMessageInterface = "pattern::Role::properties::senderMessageInterface";
			
			
			public static String receiverMessageInterface = "pattern::Role::properties::receiverMessageInterface";
			
			
			public static String port = "pattern::Role::properties::port";
			
			
			public static String adaptationBehavior = "pattern::Role::properties::adaptationBehavior";
			
			
			public static String roleAndAdaptationBehavior = "pattern::Role::properties::roleAndAdaptationBehavior";
			
			
			public static String ordered = "pattern::Role::properties::ordered";
			
			
			public static String orderVariable = "pattern::Role::properties::orderVariable";
			
			
			public static String outgoingRoleConnector = "pattern::Role::properties::outgoingRoleConnector";
			
	
		}
	
	}

}
