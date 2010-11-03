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

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;



/**
 * UMLClass: 'UMLRealtimeStopState'.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3462 $
 * @created   $Date: 2009-02-13 14:53:37 +0100 (Fr, 13 Feb 2009) $
 * @generated
 */
public class UMLRealtimeStopStateImpl implements UMLRealtimeStopState
{
	/**
	 * @generated
	 */
	public List<UMLRealtimeTransition> getIncomingUMLRealtimeTransitionss() {

		return null;
	}


	/**
	 * @generated
	 */
	public String getName() {

		return null;
	}


	/**
	 * @generated
	 */
	public List<UMLRealtimeTransition> getOutgoingUMLRealtimeTransitionss() {

		return null;
	}


	/**
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart() {

		return null;
	}

	/*
	 * User defined.
	 */
	
   /**
    * Get the a clone of the current UMLRealtimeStopState object
    *
    * @param rtsc          No description provided
    * @param newStopState  No description provided
    * @return              The cloned realtimestopstate value
    */
   public Object clone (UMLRealtimeStatechart rtsc, UMLRealtimeStopStateImpl newStopState)
   {
	   return null;
//      FProject project=rtsc.getProject();
//      //begin cloning
//      newStopState.setName (this.getName());
//
//      //clone realtimestatechart
//      if (this.getUMLRealtimeStatechart() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()))
//         {
//            UMLRealtimeStatechart tmpRealtimeStatechart = (UMLRealtimeStatechart) rtsc.addToCloneObservationMap (this.getUMLRealtimeStatechart().hashCode(), project.getFromFactories(UMLRealtimeStatechart.class).create(true));
//            newStopState.setUMLRealtimeStatechart ((UMLRealtimeStatechart) this.getUMLRealtimeStatechart().internal_clone (rtsc, tmpRealtimeStatechart));
//         }
//         else
//         {
//            newStopState.setUMLRealtimeStatechart ((UMLRealtimeStatechart) rtsc.getFromCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()));
//         }
//      }
//
//      //clone realtimetransition (entry)
//      Iterator<UMLRealtimeTransition> iter = this.iteratorOfIncomingUMLRealtimeTransitions();
//      while (iter.hasNext())
//      {
//         UMLRealtimeTransition oldTransition = (UMLRealtimeTransition) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldTransition.hashCode()))
//         {
//            UMLRealtimeTransition tmpTransition = (UMLRealtimeTransition) rtsc.addToCloneObservationMap (oldTransition.hashCode(), project.getFromFactories(UMLRealtimeTransition.class).create(true));
//            newStopState.addToIncomingUMLRealtimeTransitions ((UMLRealtimeTransition) oldTransition.clone (rtsc, tmpTransition));
//         }
//         else
//         {
//            newStopState.addToIncomingUMLRealtimeTransitions ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (oldTransition.hashCode()));
//         }
//      }
//
//      //clone realtimetransition1 (exit)
//      iter = this.iteratorOfOutgoingUMLRealtimeTransitions();
//      while (iter.hasNext())
//      {
//         UMLRealtimeTransition oldTransition = (UMLRealtimeTransition) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldTransition.hashCode()))
//         {
//            UMLRealtimeTransition tmpTransition = (UMLRealtimeTransition) rtsc.addToCloneObservationMap (oldTransition.hashCode(), project.getFromFactories(UMLRealtimeTransition.class).create(true));
//            newStopState.addToOutgoingUMLRealtimeTransitions ((UMLRealtimeTransition) oldTransition.clone (rtsc, tmpTransition));
//         }
//         else
//         {
//            newStopState.addToOutgoingUMLRealtimeTransitions ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (oldTransition.hashCode()));
//         }
//      }
//
//      return newStopState;
   }


}

/*
 * $Log$
 * Revision 1.13  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.12  2006/08/16 22:01:01  alexfupp
 * more changes to use factories
 *
 * Revision 1.11  2006/08/13 21:29:42  alexfupp
 * changed to use factories
 *
 * Revision 1.10  2006/07/20 20:03:36  mtt
 * first bunch of factories
 *
 * Revision 1.9  2005/09/01 08:36:39  aseibel
 * improved realtimestatechart cloning
 *
 */
