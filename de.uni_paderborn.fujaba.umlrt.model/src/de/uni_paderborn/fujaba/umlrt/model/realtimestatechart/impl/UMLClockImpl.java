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

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLBoolRealtimeAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClockResetAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;


/**
 * UMLClass: 'UMLClock'.
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3555 $
 * @created   $Date: 2009-03-22 01:08:17 +0100 (So, 22 Mrz 2009) $
 * @generated
 */
public class UMLClockImpl implements UMLClock // extends ASGElement

{
	/**
	 * @generated
	 */
   public String getId(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<UMLRealtimeTransition> getUMLRealtimeTransitions(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<UMLBoolRealtimeAtom> getUMLBoolRealtimeAtoms(){return null;}

	/**
	 * @generated
	 */
   public UMLRealtimeStatechart getUMLRealtimeStatechart(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<UMLClockResetAtom> getUMLClockResetAtoms(){return null;}

   
   public final static String NO_CLOCK = "-1";

   /*
    * User defined.
    */
   
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    *
    * @return   No description provided
    */
   public String toString() {
//      String value = getId();
//      if ( (value == null) || value.equals (NO_CLOCK) || value.equals (""))
//      {
//         value = "NO_CLOCK";
//      }
//      return value;
      return null;
   }


   /**
    * Get the a clone of the current UMLClock object
    *
    * @param rtsc      No description provided
    * @param newClock  No description provided
    * @return          The cloned clock value
    */
   public Object clone (UMLRealtimeStatechart rtsc, UMLClockImpl newClock)
   {
//	   FProject project = rtsc.getProject();
//      //begin cloning
//      newClock.setId (this.getId());
//
//      //clone realtimestatechart
//      if (this.getUMLRealtimeStatechart() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()))
//         {
//            UMLRealtimeStatechart tmpRealtimeStatechart = (UMLRealtimeStatechart) rtsc.addToCloneObservationMap (this.getUMLRealtimeStatechart().hashCode(), project.getFromFactories(UMLRealtimeStatechart.class).create(true));
//            //TODO: is the method is really needing the id of a realtimestatechart as key?!
//            newClock.setUMLRealtimeStatechart (tmpRealtimeStatechart.getID(), (UMLRealtimeStatechart) this.getUMLRealtimeStatechart().internal_clone (rtsc, tmpRealtimeStatechart));
//         }
//         else
//         {
//            newClock.setUMLRealtimeStatechart (this.getUMLRealtimeStatechart().getID(), (UMLRealtimeStatechart) rtsc.getFromCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()));
//         }
//      }
//
//      //clone realtimetransition
//      Iterator iter = this.iteratorOfUMLRealtimeTransition();
//      while (iter.hasNext())
//      {
//         UMLRealtimeTransition oldTransition = (UMLRealtimeTransition) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldTransition.hashCode()))
//         {
//            UMLRealtimeTransition tmpTransition = (UMLRealtimeTransition) rtsc.addToCloneObservationMap (oldTransition.hashCode(), project.getFromFactories(UMLRealtimeTransition.class).create(true));
//            newClock.addToUMLRealtimeTransition ((UMLRealtimeTransition) oldTransition.clone (rtsc, tmpTransition));
//         }
//         else
//         {
//            newClock.addToUMLRealtimeTransition ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (oldTransition.hashCode()));
//         }
//      }
//
//      //clone boolrealtimeatom
//      iter = this.iteratorOfUMLBoolRealtimeAtom();
//      while (iter.hasNext())
//      {
//         UMLBoolRealtimeAtom oldAtom = (UMLBoolRealtimeAtom) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldAtom.hashCode()))
//         {
//            UMLBoolRealtimeAtom tmpAtom = null;
//            if (oldAtom instanceof UMLDeadlineAtom)
//            {
//               tmpAtom = (UMLDeadlineAtom) rtsc.addToCloneObservationMap (oldAtom.hashCode(), project.getFromFactories(UMLDeadlineAtom.class).create(true));
//               newClock.addToUMLBoolRealtimeAtom ((UMLDeadlineAtom)  ((UMLDeadlineAtom) oldAtom).clone (rtsc, (UMLDeadlineAtom) tmpAtom));
//            }
//            else if (oldAtom instanceof UMLInvariantAtom)
//            {
//               tmpAtom = (UMLInvariantAtom) rtsc.addToCloneObservationMap (oldAtom.hashCode(), project.getFromFactories(UMLInvariantAtom.class).create(true));
//               newClock.addToUMLBoolRealtimeAtom ((UMLInvariantAtom)  ((UMLInvariantAtom) oldAtom).clone (rtsc, (UMLInvariantAtom) tmpAtom));
//            }
//         }
//         else
//         {
//            newClock.addToUMLBoolRealtimeAtom ((UMLBoolRealtimeAtom) rtsc.getFromCloneObservationMap (oldAtom.hashCode()));
//         }
//      }
//
//      //clone clockresetatom
//      iter = this.iteratorOfUMLClockResetAtom();
//      while (iter.hasNext())
//      {
//         UMLClockResetAtom oldClockResetAtom = (UMLClockResetAtom) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldClockResetAtom.hashCode()))
//         {
//            UMLClockResetAtom tmpClockResetAtom = (UMLClockResetAtom) rtsc.addToCloneObservationMap (oldClockResetAtom.hashCode(), project.getFromFactories(UMLClockResetAtom.class).create(true));
//            newClock.addToUMLClockResetAtom ((UMLClockResetAtom) oldClockResetAtom.clone (rtsc, tmpClockResetAtom));
//         }
//         else
//         {
//            newClock.addToUMLClockResetAtom ((UMLClockResetAtom) rtsc.getFromCloneObservationMap (oldClockResetAtom.hashCode()));
//         }
//      }
//
//      return newClock;
      return null;
   }
}

/*
 * $Log$
 * Revision 1.17  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.16  2006/08/03 11:51:48  mtt
 * more fixes for factories
 *
 * Revision 1.15  2006/07/20 21:54:02  mtt
 * next bunch of factories
 *
 * Revision 1.14  2005/08/31 17:23:34  aseibel
 * - RTSC can be cloned (not cloning all parts at the moment, but working with the rest).
- Improved constraints for RTSCStates (not working at the moment (CCE))
 *
 */
