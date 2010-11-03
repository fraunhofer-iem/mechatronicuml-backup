/*
 * The FUJABA ToolSuite project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) 1997-2004 Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact adress:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import java.util.List;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

/**
 * UMLClass: 'UMLRealtimeStartState'.
 * 
 * @author $Author: chrisheinzemann $
 * @version $Revision: 3462 $
 * @created $Date: 2009-02-13 14:53:37 +0100 (Fr, 13 Feb 2009) $
 * @generated
 */
public class UMLRealtimeStartStateImpl implements UMLRealtimeStartState {

	/**
	 * @generated
	 */
	public int getHistoryKind(){return 0;}
	
	/**
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart1(){return null;}
	
	/**
	 * @generated
	 */
	public List<UMLRealtimeTransition> getIncomingUMLRealtimeTransitionss() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<UMLRealtimeTransition> getOutgoingUMLRealtimeTransitionss() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * User defined.
	 */
	
//	/**
//	 * UMLMethod: '+ getNextState (): UMLComplexRealtimeState '.
//	 * 
//	 * @return The nextState value
//	 */
	public UMLRealtimeStateImpl getNextState() {
//		Iterator<UMLRealtimeTransitionImpl> iter = iteratorOfExit();
//		if (iter.hasNext()) {
//			UMLRealtimeTransitionImpl transition = (UMLRealtimeTransitionImpl) iter
//					.next();
//			return ((UMLRealtimeStateImpl) transition.getTargetConnector());
//		} else {
//			return null;
//		}
		return null;
	}
//
//	/**
//	 * Access method for an one to n association.
//	 * 
//	 * @param trans
//	 *            The object added.
//	 */
	public void addToExit(UMLRealtimeTransitionImpl trans) {
//		addToOutgoingUMLRealtimeTransitions(trans);
	}
//
//	/**
//	 * Sets the historyKind attribute of the UMLRealtimeStartState object
//	 * 
//	 * @param historyKind
//	 *            The new historyKind value
//	 */
	public void setHistoryKind(int historyKind) {
//		if ((historyKind == HISTORY_NONE) || (historyKind == HISTORY_SHALLOW)
//				|| (historyKind == HISTORY_DEEP)) {
//			int oldValue = this.historyKind;
//			this.historyKind = historyKind;
//			firePropertyChange("historyKind", oldValue, this.historyKind);
//		}
	}
//
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @param v
//	 *            No description provided
//	 * @param s
//	 *            No description provided
//	 * @return No description provided
//	 */
//	public String accept(UMLRealtimeStatechartVisitorInterface v, String s) {
//		return v.visit(this, s);
//	}
//
//	/**
//	 * Get the a clone of the current UMLRealtimeStartState object
//	 * 
//	 * @param rtsc
//	 *            No description provided
//	 * @param newStartState
//	 *            No description provided
//	 * @return The cloned realtimestartstate value
//	 */
	public Object clone(UMLRealtimeStatechart rtsc,
			UMLRealtimeStartStateImpl newStartState) {
//      FProject project=rtsc.getProject();
//		// begin cloning
//		newStartState.setName(this.getName());
//		newStartState.setHistoryKind(this.getHistoryKind());
//
//		// clone realtimestatechart
//		if (this.getUMLRealtimeStatechart() != null) {
//			if (!rtsc.hasInCloneObservationMap(this.getUMLRealtimeStatechart()
//					.hashCode())) {
//				UMLRealtimeStatechart tmpRealtimeStatechart = (UMLRealtimeStatechart) rtsc
//						.addToCloneObservationMap(this
//								.getUMLRealtimeStatechart().hashCode(),
//                        project.getFromFactories(UMLRealtimeStatechart.class).create(true));
//				newStartState
//						.setUMLRealtimeStatechart((UMLRealtimeStatechart) this
//								.getUMLRealtimeStatechart().internal_clone(
//										rtsc, tmpRealtimeStatechart));
//			} else {
//				newStartState
//						.setUMLRealtimeStatechart((UMLRealtimeStatechart) rtsc
//								.getFromCloneObservationMap(this
//										.getUMLRealtimeStatechart().hashCode()));
//			}
//		}
//
//		// clone realtimestatechart1
//		if (this.getUMLRealtimeStatechart1() != null) {
//			if (!rtsc.hasInCloneObservationMap(this.getUMLRealtimeStatechart1()
//					.hashCode())) {
//				UMLRealtimeStatechart tmpRealtimeStatechart = (UMLRealtimeStatechart) rtsc
//						.addToCloneObservationMap(this
//								.getUMLRealtimeStatechart1().hashCode(),
//                        project.getFromFactories(UMLRealtimeStatechart.class).create(true));
//				newStartState
//						.setUMLRealtimeStatechart1((UMLRealtimeStatechart) this
//								.getUMLRealtimeStatechart1().internal_clone(
//										rtsc, tmpRealtimeStatechart));
//			} else {
//				newStartState
//						.setUMLRealtimeStatechart1((UMLRealtimeStatechart) rtsc
//								.getFromCloneObservationMap(this
//										.getUMLRealtimeStatechart1().hashCode()));
//			}
//		}
//
//		// clone realtimetransition (entry)
//		Iterator<UMLRealtimeTransitionImpl> iter = this.iteratorOfIncomingUMLRealtimeTransitions();
//		while (iter.hasNext()) {
//			UMLRealtimeTransitionImpl oldTransition = (UMLRealtimeTransitionImpl) iter
//					.next();
//			if (!rtsc.hasInCloneObservationMap(oldTransition.hashCode())) {
//				UMLRealtimeTransitionImpl tmpTransition = (UMLRealtimeTransitionImpl) rtsc
//						.addToCloneObservationMap(oldTransition.hashCode(),
//                        project.getFromFactories(UMLRealtimeTransitionImpl.class).create(true));
//				newStartState
//						.addToIncomingUMLRealtimeTransitions((UMLRealtimeTransitionImpl) oldTransition
//								.clone(rtsc, tmpTransition));
//			} else {
//				newStartState
//						.addToIncomingUMLRealtimeTransitions((UMLRealtimeTransitionImpl) rtsc
//								.getFromCloneObservationMap(oldTransition
//										.hashCode()));
//			}
//		}
//
//		// clone realtimetransition1 (exit)
//		iter = this.iteratorOfOutgoingUMLRealtimeTransitions();
//		while (iter.hasNext()) {
//			UMLRealtimeTransitionImpl oldTransition = (UMLRealtimeTransitionImpl) iter
//					.next();
//			if (!rtsc.hasInCloneObservationMap(oldTransition.hashCode())) {
//				UMLRealtimeTransitionImpl tmpTransition = (UMLRealtimeTransitionImpl) rtsc
//						.addToCloneObservationMap(oldTransition.hashCode(),
//                        project.getFromFactories(UMLRealtimeTransitionImpl.class).create(true));
//				newStartState
//						.addToOutgoingUMLRealtimeTransitions((UMLRealtimeTransitionImpl) oldTransition
//								.clone(rtsc, tmpTransition));
//			} else {
//				newStartState
//						.addToOutgoingUMLRealtimeTransitions((UMLRealtimeTransitionImpl) rtsc
//								.getFromCloneObservationMap(oldTransition
//										.hashCode()));
//			}
//		}
//
//		return newStartState;
		return null;
	}

}

/*
 * $Log$
 * Revision 1.21  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.20  2007/01/03 20:41:56  alexfupp
 * removed constraints because they are not used
 *
 * Revision 1.19  2006/08/16 22:01:01  alexfupp
 * more changes to use factories
 *
 * Revision 1.18  2006/08/13 21:29:42  alexfupp
 * changed to use factories
 *
 * Revision 1.17  2006/07/20 20:03:36  mtt
 * first bunch of factories
 * Revision 1.16 2005/09/27 13:38:30 burmi
 * enabled to specify constraints even for non start states
 * 
 */
