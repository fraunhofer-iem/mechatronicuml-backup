package org.muml.pim.common.naming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.realtimestatechart.ExitPoint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.StateConnectionPoint;
import org.muml.pim.realtimestatechart.Transition;

/**
 * An implementation of QualifiedNameProvider that defines QualifiedNames for
 * (most) classes in muml.ecore.
 * 
 * <p>This class is marked final because the delegation mechanism should be used to 
 * define more specific naming (see {@link QualifiedNameProvider}).</p>
 */
public final class MumlQualifiedNameProvider extends QualifiedNameProvider {
	
	/**
	 * Construct a MumlQualifiedNameProvider that works on its own.
	 * (Internally occasionally delegating to QualifiedNameProvider's default implementation)
	 */
	public MumlQualifiedNameProvider() {
		super(new QualifiedNameProvider());
	}
	
	/**
	 * Construct a new MumlQualifiedNameProvider that uses 'delegate' 
	 * as a fallback. 
	 * 
	 * <p>If you use this constructor, please make sure that there is 
	 * an instance of QualifiedNameProvider itself somewhere along the 
	 * delegation chain, otherwise errors will occur</p> 
	 */
	public MumlQualifiedNameProvider(QualifiedNameProvider delegate) {
		super(delegate);
	}
	
	@Override
	public QualifiedName getQualifiedName(EObject object, EObject scope) {
		if (object == null)
			return new QualifiedName();
		
		if (object instanceof RealtimeStatechart) {
			RealtimeStatechart rtsc = (RealtimeStatechart) object;
			if (rtsc.getBehavioralElement() != null)
				return delegationRoot.getQualifiedName(rtsc.getBehavioralElement(), scope).append(rtsc.getName()); //top-level RTSC are called (role|port).rtsc
			else if (rtsc.isEmbedded()) {
				QualifiedName name = delegationRoot.getQualifiedName(rtsc.getParentRegion().getParentState(), scope); //embedded RTSC are called like their parent state, unless ...
				if (rtsc.getParentRegion().getParentState().getEmbeddedRegions().size() > 1)
					name = name.append(rtsc.getName()); //... if there is more than one region in the parent state, we further qualify the name
				return name;
			}
		}
		
		//Skip the names of RTSCs that have a behavioral element (to avoid names like "frontrole.frontrolestatechart.statename")
		if (object instanceof NamedElement && object.eContainer() != null && object.eContainer() instanceof RealtimeStatechart 
				&& ((RealtimeStatechart) object.eContainer()).getBehavioralElement() != null ) {
			return delegationRoot.getQualifiedName(((RealtimeStatechart) object.eContainer()).getBehavioralElement(), scope).append(((NamedElement) object).getName());
		}
		
		if (object instanceof Transition)
			return delegationRoot.getQualifiedName(object.eContainer(), scope).append(getNameForTransition((Transition) object));	
		
		if (object instanceof StateConnectionPoint) {
			StateConnectionPoint connPoint = (StateConnectionPoint) object;
			// call StateConnectionPoints <qualifiedNameOfContainingState>_(exit|entry)
			String stateConnectionPointName = connPoint.getState().getName() + "_" + (object instanceof ExitPoint ? "exit" : "entry");
			for (StateConnectionPoint scp : connPoint.getState().getConnectionPoints()) {
				if (scp.eClass().equals(object.eClass()) && scp != object) {
					// add "_<indexInConnectionPointsListOfState>" in case there are multiple points of the same class
					stateConnectionPointName += "_" + connPoint.getState().getConnectionPoints().indexOf(connPoint);
					break;
				}
			}
			return delegationRoot.getQualifiedName(connPoint.getState().eContainer(), scope).append(stateConnectionPointName);
		}
		
		if (delegate != null)
			return delegate.getQualifiedName(object, scope);
		
		throw new RuntimeException("Cannot create a qualified name for " + object);
		
	}
	
	/**
	 * Returns a (not qualified) name for a transition that is as short as possible
	 * It contains at least NameOfSourceVertex_to_NameOfTargetVertex, then appends information
	 * with underscores.
	 * The resulting name is unique w.r.t. the set of the transitions of the RTSC it is contained in
	 */
	protected String getNameForTransition(Transition transition) {
		final NameMap nameMaps[] = new NameMap[] {
				new NameMap() {
					public String image(EObject object) {
						// the default name for transitions should be NameOfSourceVertex_to_NameOfTargetVertex
						return ((Transition) object).getSource().getName() + "_to_" + ((Transition) object).getTarget().getName();
					}
				},
				new NameMap() {
					// returns "_<name of the incoming message>"
					public String image(EObject object) {
						if (((Transition) object).getTriggerMessageEvent() == null)
							return "";
						return  "_inc" + firstToUpper(((Transition) object).getTriggerMessageEvent().getMessage().getInstanceOf().getName());							
					}
				},
				new NameMap() {
					// returns "_<name of the outgoing message>"
					public String image(EObject object) {
						if (((Transition) object).getRaiseMessageEvent() == null)
							return "";
						return  "_out" + firstToUpper(((Transition) object).getRaiseMessageEvent().getMessage().getInstanceOf().getName());
					}
				},
				new NameMap() {
					// returns "_P<priority>"
					public String image(EObject object) {
						return  "_P" + ((Transition) object).getPriority();
					}
				},
				new NameMap() {
					// returns "_<indexInContainmentListOfStatechart>"
					public String image(EObject object) {
						return  "_" + ((Transition) object).getStatechart().getTransitions().indexOf(object);
					}
				}
			};
		
			ArrayList<Transition> transitions = new ArrayList<Transition> (((RealtimeStatechart) transition.eContainer()).getTransitions());
			String transitionName = "";
			// iterates over all name maps and adds segments until the transition's name is unique
			for (NameMap nameMap : nameMaps) {
				transitionName += nameMap.image(transition);
				if (filter(transitions, transition, nameMap))
					// the filter for the current nameMap evaluates to true, i.e. there is only one element with the transition's name
					// we're done, transitionName is unique now
					return transitionName;
			}
			return transitionName;
	}
	
	private interface NameMap {
		String image(EObject object);
	}
	
	
	//Java 8 implementation of getNameForTransition. 
	//If this is used, you can also remove the method "filter" and the interface "NameMap" from this class.
	/*protected String getNameForTransition(Transition transition) {
		final ArrayList<Function<Transition, String>> nameMaps = new ArrayList<>();
		nameMaps.add(t -> t.getSource().getName() + "_to_"+t.getTarget().getName());
		nameMaps.add(t -> t.getTriggerMessageEvent() == null ? "" : "_inc" + firstToUpper(t.getTriggerMessageEvent().getMessage().getInstanceOf().getName()));
		nameMaps.add(t -> t.getRaiseMessageEvent() == null ? "" : "_out" + firstToUpper(t.getRaiseMessageEvent().getMessage().getInstanceOf().getName()));
		nameMaps.add(t -> "_P" + t.getPriority());
		nameMaps.add(t -> "_" + t.getStatechart().getTransitions().indexOf(t));

		Set<Transition> conflictSet = new HashSet<>(((RealtimeStatechart) transition.eContainer()).getTransitions());
		conflictSet.remove(transition);
		String transitionName = "";
		// iterates over all name maps and adds segments until the transition's name is unique
		for (Function<Transition, String> nameMap : nameMaps) {
			String nextSegment = nameMap.apply(transition);
			transitionName += nextSegment;
			conflictSet.removeIf(t -> !nameMap.apply(t).equals(nextSegment));
			if (conflictSet.isEmpty())
				break;
		}
		return transitionName;
	}*/
	
	/**
	 * Filters all elements from conflictSet where nameMap.image() != nameMap.image(referenceObject).
	 * @return true iff the conflict set is trivial now
	 */
	private boolean filter(Collection<? extends EObject> conflictSet, EObject referenceObject, NameMap nameMap) {
		Iterator<? extends EObject> it = conflictSet.iterator();
		String referenceName = nameMap.image(referenceObject);
		while (it.hasNext()) { //remove all the elements from the conflict set that have the same name
			String image = nameMap.image(it.next());
			if (!(image == null && referenceName == null || referenceName != null && referenceName.equals(image)))
				it.remove();
		}
		
		return conflictSet.size() <= 1;
	}
	
	private static String firstToUpper(String str) {
		if (str == null || str.length() < 1)
			return str;
		return Character.toUpperCase(str.charAt(0))+str.substring(1);
	}
}
