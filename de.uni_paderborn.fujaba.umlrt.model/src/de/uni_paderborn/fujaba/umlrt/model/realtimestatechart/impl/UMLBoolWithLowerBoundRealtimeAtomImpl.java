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
 *      Copyright (C) 1997-2009 Fujaba Development Group
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

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLBoolWithLowerBoundRealtimeAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

/**
 * @author cytom
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * @generated
 */
public abstract class UMLBoolWithLowerBoundRealtimeAtomImpl implements UMLBoolWithLowerBoundRealtimeAtom
{
	/**
	 * @generated
	 */
   public long getLowerBound(){return 0;}

	/**
	 * @generated
	 */
   public String getLowerBoundName(){return null;}

	/**
	 * @generated
	 */
   public abstract UMLRealtimeTransition getUMLRealtimeTransition();

   
   /*
    * User defined.
    */
   
   /**
    * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLBoolRealtimeAtom#toString()
    */
//   @Override
   public String toString()
   {
//      if (getUMLClock() == null)
//      {
//         return "";
//      }
//
//      if (displayValuation())
//      {
//         if (getUMLClock().getId().equals(UMLClock.NO_CLOCK))
//         {
//            return ("[" + getLowerBound() + "; " + getUpperBound() + "]");
//         }
//         else
//         {
//            return (getLowerBound() + " <= " + getUMLClock() + " <= " + getUpperBound());
//         }
//      }
//      else
//      {
//         if (getUMLClock().getId().equals(UMLClock.NO_CLOCK))
//         {
//            return ("[" + getLowerBoundName() + "; " + getUpperBoundName() + "]");
//         }
//         else
//         {
//            return (getLowerBoundName() + " <= " + getUMLClock() + " <= " + getUpperBoundName());
//         }
//      }
      return null;
   }


   /**
    * Get the a clone of the current UMLTimeguardAtom object
    *
    * @param rtsc     No description provided
    * @param newAtom  No description provided
    * @return         The cloned timeguardatom value
    */
   public Object clone (UMLRealtimeStatechart rtsc, UMLBoolWithLowerBoundRealtimeAtomImpl newAtom) {
//      FProject project = rtsc.getProject(); 
//      //begin cloning
//      newAtom.setLowerBound (this.getLowerBound());
//      newAtom.setLowerBoundName (this.getLowerBoundName());
//      newAtom.setUpperBound(this.getUpperBound());
//      newAtom.setUpperBoundName (this.getUpperBoundName());
//     
//      //clone clocks
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
//          newAtom.setUMLClock ((UMLClock) rtsc.getFromCloneObservationMap (oldClock.hashCode()));
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
//      return newAtom;
      return null;
   }
}
