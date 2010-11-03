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

import java.util.Iterator;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLSynchronizationChannel;


/**
 * UMLClass: 'UMLSynchronizationChannel'.
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3555 $
 * @created   $Date: 2009-03-22 01:08:17 +0100 (So, 22 Mrz 2009) $
 * @generated
 */
public class UMLSynchronizationChannelImpl implements UMLSynchronizationChannel
{
	/**
	 * @generated
	 */
   public UMLRealtimeStatechart getUMLRealtimeStatechart(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<UMLRealtimeTransition> getUMLRealtimeTransitions(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<UMLRealtimeTransition> getSenderTransitions(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<UMLRealtimeTransition> getReceiverTransitions(){return null;}

	/**
	 * @generated
	 */
   public String getName(){return null;}

   
   /*
    * User defined.
    */

   /**
    * Get the a clone of the current UMLSynchronizationChannel object
    *
    * @param rtsc        No description provided
    * @param newChannel  No description provided
    * @return            The cloned realtimetransition value
    */
   public Object clone (UMLRealtimeStatechart rtsc, UMLSynchronizationChannelImpl newChannel)
   {
	   return null;
//	  FProject project = rtsc.getProject();
//	   
//      //begin cloning
//      newChannel.setName (this.getName());
//
//      //clone realtimestatechart
//      if (this.getUMLRealtimeStatechart() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()))
//         {
//            UMLRealtimeStatechart tmpRealtimeStatechart = (UMLRealtimeStatechart) rtsc.addToCloneObservationMap (this.getUMLRealtimeStatechart().hashCode(), project.getFromFactories(UMLRealtimeStatechart.class).create(true));
//            newChannel.setUMLRealtimeStatechart ((UMLRealtimeStatechart) this.getUMLRealtimeStatechart().internal_clone (rtsc, tmpRealtimeStatechart));
//         }
//         else
//         {
//            newChannel.setUMLRealtimeStatechart ((UMLRealtimeStatechart) rtsc.getFromCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()));
//         }
//      }
//
//      //clone transitions
//      Iterator<UMLRealtimeTransition> iter = this.iteratorOfUMLRealtimeTransition();
//      while (iter.hasNext())
//      {
//         UMLRealtimeTransition oldTransition = iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldTransition.hashCode()))
//         {
//            UMLRealtimeTransition tmpTransition = (UMLRealtimeTransition) rtsc.addToCloneObservationMap (oldTransition.hashCode(), project.getFromFactories(UMLRealtimeTransition.class).create(true));
//            newChannel.addToUMLRealtimeTransition ((UMLRealtimeTransition) oldTransition.clone (rtsc, tmpTransition));
//         }
//         else
//         {
//            newChannel.addToUMLRealtimeTransition ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (oldTransition.hashCode()));
//         }
//      }
//
//      // clone sender transitions
//      if (senderTransition != null)
//      {
//         for (UMLRealtimeTransition trans : senderTransition)
//         {
//            if (!rtsc.hasInCloneObservationMap(trans.hashCode()))
//            {
//               UMLRealtimeTransition newTrans = project.createFromFactories(UMLRealtimeTransition.class);
//               rtsc.addToCloneObservationMap(trans.hashCode(), newTrans);
//               newChannel.addToSenderTransition((UMLRealtimeTransition) trans.clone(rtsc, newTrans));
//            }
//            else
//            {
//               newChannel.addToSenderTransition((UMLRealtimeTransition) rtsc.getFromCloneObservationMap(trans.hashCode()));
//            }
//         }
//      }
//
//      // clone receiver transitions
//      if (receiverTransition != null)
//      {
//         for (UMLRealtimeTransition trans : receiverTransition)
//         {
//            if (!rtsc.hasInCloneObservationMap(trans.hashCode()))
//            {
//               UMLRealtimeTransition newTrans = project.createFromFactories(UMLRealtimeTransition.class);
//               rtsc.addToCloneObservationMap(trans.hashCode(), newTrans);
//               newChannel.addToReceiverTransition((UMLRealtimeTransition) trans.clone(rtsc, newTrans));
//            }
//            else
//            {
//               newChannel.addToReceiverTransition((UMLRealtimeTransition) rtsc.getFromCloneObservationMap(trans.hashCode()));
//            }
//         }
//      }
//
//      return newChannel;
   }


   /**
    * @see de.uni_paderborn.fujaba.asg.ASGElement#toString()
    */
   @Override
   public String toString()
   {
      return getName();
   }
}

/*
 * $Log$
 * Revision 1.8.4.1  2009/02/25 21:48:25  cajudosu
 * * Added changes to meta model of RTSCs to support parameterized synchronization channels.
 *
 * Revision 1.9  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.8  2006/08/05 21:12:40  mtt
 * more fixes for factories
 *
 * Revision 1.7  2005/09/01 08:36:38  aseibel
 * improved realtimestatechart cloning
 *
 */
