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

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClockResetAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3555 $ $Date: 2009-03-22 01:08:17 +0100 (So, 22 Mrz 2009) $
 * @generated
 */
public class UMLClockResetAtomImpl implements UMLClockResetAtom
{
	/**
	 * @generated
	 */
   public String getId(){return null;}

	/**
	 * @generated
	 */
   public UMLClock getUMLClock(){return null;}

	/**
	 * @generated
	 */
   public UMLRealtimeTransition getUMLRealtimeTransition(){return null;}

	/**
	 * @generated
	 */
   public UMLRealtimeAction getUMLRealtimeAction(){return null;}
   
   /*
    * User defined.
    */
   
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    *
    * @return   No description provided
    */
   public String toString()
   {
      String value = getId();
      if (value == null || value.equals (NO_CLOCK) || value.equals (""))
      {
         value = "NO_CLOCK";
      }
      return value;
   }
   /**
    * Get the a clone of the current UMLClockResetAtom object
    *
    * @param rtsc     No description provided
    * @param newAtom  No description provided
    * @return         The cloned clockresetatom value
    */
   public EObject clone (UMLRealtimeStatechart rtsc, UMLClockResetAtom newAtom)
   {
//      FProject project = rtsc.getProject();
//      //begin cloning
//      newAtom.setId (this.getId());
//      
//      //clone clock
//      if (getUMLClock() != null)
//      {
//         UMLClock oldClock = getUMLClock();
//         if (!rtsc.hasInCloneObservationMap (oldClock.hashCode()))
//         {
//            UMLClock tmpClock = (UMLClock) rtsc.addToCloneObservationMap (oldClock.hashCode(), project.getFromFactories(UMLClock.class).create(true));
//            newAtom.setUMLClock ((UMLClock) oldClock.clone (rtsc, tmpClock));
//         }
//         else
//         {
//        	 newAtom.setUMLClock ((UMLClock) rtsc.getFromCloneObservationMap (oldClock.hashCode()));
//         }
//      }
//
//      //clone transition
//      if (this.getUMLRealtimeTransition() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeTransition().hashCode()))
//         {
//            UMLRealtimeTransition tmpTransition = (UMLRealtimeTransition) rtsc.addToCloneObservationMap (this.getUMLRealtimeTransition().hashCode(), project.getFromFactories(UMLRealtimeTransition.class).create(true));
//            newAtom.setUMLRealtimeTransition ((UMLRealtimeTransition) this.getUMLRealtimeTransition().clone (rtsc, tmpTransition));
//         }
//         else
//         {
//            newAtom.setUMLRealtimeTransition ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (this.getUMLRealtimeTransition().hashCode()));
//         }
//      }
//      
//      //clone realtimeaction
//      if (this.getUMLRealtimeAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeAction().hashCode()))
//         {
//            UMLRealtimeAction tmpAction = (UMLRealtimeAction) rtsc.addToCloneObservationMap (this.getUMLRealtimeAction().hashCode(), project.getFromFactories(UMLRealtimeAction.class).create(true));
//            newAtom.setUMLRealtimeAction ((UMLRealtimeAction) this.getUMLRealtimeAction().clone (rtsc, tmpAction));
//         }
//         else
//         {
//           newAtom.setUMLRealtimeAction ((UMLRealtimeAction) rtsc.getFromCloneObservationMap (this.getUMLRealtimeAction().hashCode()));
//         }
//      }
//
//      return newAtom;
      return null;
   }
}

/*
 * $Log$
 * Revision 1.11  2008/07/02 15:08:42  crowdy
 * removed unused imports
 *
 * Revision 1.10  2007/06/21 06:16:21  mtt
 * null check moved to beginning of boolean formula
 *
 * Revision 1.9  2007/06/18 22:16:48  mtt
 * fixed removal of actions in states
 * added gui for adding and removing clock resets to actions in states
 *
 * Revision 1.8  2007/06/18 17:04:30  mtt
 * support for clock resets on actions
 *
 * Revision 1.7  2007/06/18 13:17:52  mtt
 * fixed cloning for time and clock related syntax elements, raised events are correctly cloned as raised events
 *
 * Revision 1.6  2006/08/13 21:29:42  alexfupp
 * changed to use factories
 *
 * Revision 1.5  2006/08/03 11:51:48  mtt
 * more fixes for factories
 *
 * Revision 1.4  2005/08/31 17:23:34  aseibel
 * - RTSC can be cloned (not cloning all parts at the moment, but working with the rest).
- Improved constraints for RTSCStates (not working at the moment (CCE))
 *
 */
