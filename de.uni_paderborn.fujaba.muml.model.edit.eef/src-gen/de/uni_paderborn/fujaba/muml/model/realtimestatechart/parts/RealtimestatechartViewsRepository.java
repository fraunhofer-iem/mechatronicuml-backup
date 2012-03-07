/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts;

/**
 * 
 * 
 */
public class RealtimestatechartViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * AbsoluteDeadline view descriptor
	 * 
	 */
	public static class AbsoluteDeadline {
		public static class Properties {
	
			
			public static String clock = "realtimestatechart::AbsoluteDeadline::properties::clock";
			
	
		}
	
	}

	/**
	 * RelativeDeadline view descriptor
	 * 
	 */
	public static class RelativeDeadline {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * Clock view descriptor
	 * 
	 */
	public static class Clock {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::Clock::properties::name";
			
			
			public static String statechart = "realtimestatechart::Clock::properties::statechart";
			
	
		}
	
	}

	/**
	 * Region view descriptor
	 * 
	 */
	public static class Region {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::Region::properties::name";
			
			
			public static String priority = "realtimestatechart::Region::properties::priority";
			
			
			public static String parentState = "realtimestatechart::Region::properties::parentState";
			
	
		}
	
	}

	/**
	 * State view descriptor
	 * 
	 */
	public static class State {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::State::properties::name";
			
			
			public static String outgoingTransitions = "realtimestatechart::State::properties::outgoingTransitions";
			
			
			public static String incomingTransitions = "realtimestatechart::State::properties::incomingTransitions";
			
			
			public static String statechart = "realtimestatechart::State::properties::statechart";
			
			
			public static String invariants = "realtimestatechart::State::properties::invariants";
			
			
			public static String initial = "realtimestatechart::State::properties::initial";
			
			
			public static String final_ = "realtimestatechart::State::properties::final";
			
			
			public static String urgent = "realtimestatechart::State::properties::urgent";
			
	
		}
	
	}

	/**
	 * Transition view descriptor
	 * 
	 */
	public static class Transition {
		public static class Properties {
	
			
			public static String priority = "realtimestatechart::Transition::properties::priority";
			
			
			public static String target = "realtimestatechart::Transition::properties::target";
			
			
			public static String source = "realtimestatechart::Transition::properties::source";
			
			
			public static String statechart = "realtimestatechart::Transition::properties::statechart";
			
			
			public static String clockResets = "realtimestatechart::Transition::properties::clockResets";
			
			
			public static String clockConstraints = "realtimestatechart::Transition::properties::clockConstraints";
			
			
			public static String absoluteDeadlines = "realtimestatechart::Transition::properties::absoluteDeadlines";
			
			
			public static String blockable = "realtimestatechart::Transition::properties::blockable";
			
			
			public static String events = "realtimestatechart::Transition::properties::events";
			
	
		}
	
	}

	/**
	 * ClockConstraint view descriptor
	 * 
	 */
	public static class ClockConstraint {
		public static class Properties {
	
			
			public static String clock = "realtimestatechart::ClockConstraint::properties::clock";
			
			
			public static String operator = "realtimestatechart::ClockConstraint::properties::operator";
			
	
		}
	
	}

	/**
	 * Action view descriptor
	 * 
	 */
	public static class Action {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::Action::properties::name";
			
	
		}
	
	}

	/**
	 * AsynchronousMessageEvent view descriptor
	 * 
	 */
	public static class AsynchronousMessageEvent {
		public static class Properties {
	
			
			public static String kind = "realtimestatechart::AsynchronousMessageEvent::properties::kind";
			
			
			public static String message = "realtimestatechart::AsynchronousMessageEvent::properties::message";
			
	
		}
	
	}

	/**
	 * DoEvent view descriptor
	 * 
	 */
	public static class DoEvent {
		public static class Properties {
	
			
			public static String kind = "realtimestatechart::DoEvent::properties::kind";
			
			
			public static String periodLower = "realtimestatechart::DoEvent::properties::periodLower";
			
			
			public static String periodUpper = "realtimestatechart::DoEvent::properties::periodUpper";
			
	
		}
	
	}

	/**
	 * SynchronizationChannel view descriptor
	 * 
	 */
	public static class SynchronizationChannel {
		public static class Properties {
	
			
			public static String comment = "realtimestatechart::SynchronizationChannel::properties::comment";
			
			
			public static String inParameter = "realtimestatechart::SynchronizationChannel::properties::inParameter";
			
			
			public static String outParameter = "realtimestatechart::SynchronizationChannel::properties::outParameter";
			
			
			public static String name = "realtimestatechart::SynchronizationChannel::properties::name";
			
			
			public static String state = "realtimestatechart::SynchronizationChannel::properties::state";
			
	
		}
	
	}

	/**
	 * Synchronization view descriptor
	 * 
	 */
	public static class Synchronization {
		public static class Properties {
	
			
			public static String comment = "realtimestatechart::Synchronization::properties::comment";
			
			
			public static String callee = "realtimestatechart::Synchronization::properties::callee";
			
			
			public static String kind = "realtimestatechart::Synchronization::properties::kind";
			
	
		}
	
	}

	/**
	 * RealtimeStatechart view descriptor
	 * 
	 */
	public static class RealtimeStatechart_ {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::RealtimeStatechart_::properties::name";
			
			
			public static String comment = "realtimestatechart::RealtimeStatechart_::properties::comment";
			
			
			public static String behavioralElement = "realtimestatechart::RealtimeStatechart_::properties::behavioralElement";
			
			
			public static String embeddingRegion = "realtimestatechart::RealtimeStatechart_::properties::embeddingRegion";
			
			
			public static String history = "realtimestatechart::RealtimeStatechart_::properties::history";
			
			
			public static String eventQueueSize = "realtimestatechart::RealtimeStatechart_::properties::eventQueueSize";
			
			
			public static String securityLevel = "realtimestatechart::RealtimeStatechart_::properties::securityLevel";
			
			
			public static String utilisation = "realtimestatechart::RealtimeStatechart_::properties::utilisation";
			
			
			public static String scheduleDocument = "realtimestatechart::RealtimeStatechart_::properties::scheduleDocument";
			
	
		}
	
	}

	/**
	 * Message view descriptor
	 * 
	 */
	public static class Message {
		public static class Properties {
	
			
			public static String comment = "realtimestatechart::Message::properties::comment";
			
			
			public static String callee = "realtimestatechart::Message::properties::callee";
			
	
		}
	
	}

	/**
	 * EntryEvent view descriptor
	 * 
	 */
	public static class EntryEvent {
		public static class Properties {
	
			
			public static String kind = "realtimestatechart::EntryEvent::properties::kind";
			
			
			public static String clockResets = "realtimestatechart::EntryEvent::properties::clockResets";
			
	
		}
	
	}

	/**
	 * ExitEvent view descriptor
	 * 
	 */
	public static class ExitEvent {
		public static class Properties {
	
			
			public static String kind = "realtimestatechart::ExitEvent::properties::kind";
			
			
			public static String clockResets = "realtimestatechart::ExitEvent::properties::clockResets";
			
	
		}
	
	}

	/**
	 * EntryPoint view descriptor
	 * 
	 */
	public static class EntryPoint {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::EntryPoint::properties::name";
			
			
			public static String outgoingTransitions = "realtimestatechart::EntryPoint::properties::outgoingTransitions";
			
			
			public static String incomingTransitions = "realtimestatechart::EntryPoint::properties::incomingTransitions";
			
			
			public static String statechart = "realtimestatechart::EntryPoint::properties::statechart";
			
	
		}
	
	}

	/**
	 * ExitPoint view descriptor
	 * 
	 */
	public static class ExitPoint {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::ExitPoint::properties::name";
			
			
			public static String outgoingTransitions = "realtimestatechart::ExitPoint::properties::outgoingTransitions";
			
			
			public static String incomingTransitions = "realtimestatechart::ExitPoint::properties::incomingTransitions";
			
			
			public static String statechart = "realtimestatechart::ExitPoint::properties::statechart";
			
	
		}
	
	}

	/**
	 * StateEntryPoint view descriptor
	 * 
	 */
	public static class StateEntryPoint {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::StateEntryPoint::properties::name";
			
			
			public static String outgoingTransitions = "realtimestatechart::StateEntryPoint::properties::outgoingTransitions";
			
			
			public static String incomingTransitions = "realtimestatechart::StateEntryPoint::properties::incomingTransitions";
			
			
			public static String statechart = "realtimestatechart::StateEntryPoint::properties::statechart";
			
			
			public static String state = "realtimestatechart::StateEntryPoint::properties::state";
			
			
			public static String entryPoint = "realtimestatechart::StateEntryPoint::properties::entryPoint";
			
	
		}
	
	}

	/**
	 * StateExitPoint view descriptor
	 * 
	 */
	public static class StateExitPoint {
		public static class Properties {
	
			
			public static String name = "realtimestatechart::StateExitPoint::properties::name";
			
			
			public static String outgoingTransitions = "realtimestatechart::StateExitPoint::properties::outgoingTransitions";
			
			
			public static String incomingTransitions = "realtimestatechart::StateExitPoint::properties::incomingTransitions";
			
			
			public static String statechart = "realtimestatechart::StateExitPoint::properties::statechart";
			
			
			public static String state = "realtimestatechart::StateExitPoint::properties::state";
			
			
			public static String exitPoint = "realtimestatechart::StateExitPoint::properties::exitPoint";
			
	
		}
	
	}

}
