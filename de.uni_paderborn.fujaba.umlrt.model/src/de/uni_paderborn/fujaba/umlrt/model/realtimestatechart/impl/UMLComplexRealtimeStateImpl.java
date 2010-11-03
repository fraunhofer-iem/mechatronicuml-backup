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

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLComplexRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;


/**
 * UMLClass: 'UMLComplexRealtimeState'.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3462 $
 * @created   $Date: 2009-02-13 14:53:37 +0100 (Fr, 13 Feb 2009) $
 * @generated
 */
public class UMLComplexRealtimeStateImpl implements UMLComplexRealtimeState
{
	/**
	 * @generated
	 */
   public java.util.List<UMLRealtimeStatechart> getUMLRealtimeStatecharts(){return null;}

	/**
	 * @generated
	 */
   public UMLRealtimeAction getUMLRealtimeDoAction(){return null;}

	/**
	 * @generated
	 */
   public UMLRealtimeAction getUMLRealtimeExitAction(){return null;}

	/**
	 * @generated
	 */
   public UMLRealtimeAction getUMLRealtimeEntryAction(){return null;}

	/**
	 * @generated
	 */
   public boolean getCommitted(){return false;}

   /**
	 * @generated
	 */
   public ReconfDiagram getReconfDiagram(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<UMLComplexRealtimeState> getInterfacedStates(){return null;}

	/**
	 * @generated
	 */
   public UMLComplexRealtimeStateImpl getInterfaceState(){return null;}

   
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
   
   
//   /**
//    * Get the a clone of the current UMLComplexRealtimeState object
//    *
//    * @param rtsc             No description provided
//    * @param newComplexState  No description provided
//    * @return                 The cloned complexrealtimestate value
//    */
   public Object clone (UMLRealtimeStatechart rtsc, UMLComplexRealtimeStateImpl newComplexState)
   {
//      FProject project=rtsc.getProject();
//      //begin cloning
//      newComplexState.setName (this.getName());
//
//      //clone RealtimeDoAction
//      if (this.getUMLRealtimeDoAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeDoAction().hashCode()))
//         {
//            UMLRealtimeAction tmpAction = (UMLRealtimeAction) rtsc.addToCloneObservationMap (this.getUMLRealtimeDoAction().hashCode(), project.getFromFactories(UMLRealtimeAction.class).create(true));
//            newComplexState.setUMLRealtimeDoAction ((UMLRealtimeAction) this.getUMLRealtimeDoAction().clone (rtsc, tmpAction));
//         }
//         else
//         {
//            newComplexState.setUMLRealtimeDoAction ((UMLRealtimeAction) rtsc.getFromCloneObservationMap (this.getUMLRealtimeDoAction().hashCode()));
//         }
//      }
//
//      //clone RealtimeEntryAction
//      if (this.getUMLRealtimeEntryAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeEntryAction().hashCode()))
//         {
//
//            UMLRealtimeAction tmpAction = (UMLRealtimeAction) rtsc.addToCloneObservationMap (this.getUMLRealtimeEntryAction().hashCode(), project.getFromFactories(UMLRealtimeAction.class).create(true));
//            newComplexState.setUMLRealtimeEntryAction ((UMLRealtimeAction) this.getUMLRealtimeEntryAction().clone (rtsc, tmpAction));
//         }
//         else
//         {
//            newComplexState.setUMLRealtimeEntryAction ((UMLRealtimeAction) rtsc.getFromCloneObservationMap (this.getUMLRealtimeEntryAction().hashCode()));
//         }
//      }
//
//      //clone RealtimeExitAction
//      if (this.getUMLRealtimeExitAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeExitAction().hashCode()))
//         {
//            UMLRealtimeAction tmpAction = (UMLRealtimeAction) rtsc.addToCloneObservationMap (this.getUMLRealtimeExitAction().hashCode(), project.getFromFactories(UMLRealtimeAction.class).create(true));
//            newComplexState.setUMLRealtimeExitAction ((UMLRealtimeAction) this.getUMLRealtimeExitAction().clone (rtsc, tmpAction));
//         }
//         else
//         {
//            newComplexState.setUMLRealtimeExitAction ((UMLRealtimeAction) rtsc.getFromCloneObservationMap (this.getUMLRealtimeExitAction().hashCode()));
//         }
//      }
//
//      //clone realtimestatechart
//      if (this.getUMLRealtimeStatechart() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()))
//         {
//            UMLRealtimeStatechart tmpRealtimeStatechart = (UMLRealtimeStatechart) rtsc.addToCloneObservationMap (this.getUMLRealtimeStatechart().hashCode(), project.getFromFactories(UMLRealtimeStatechart.class).create(true));
//            newComplexState.setUMLRealtimeStatechart ((UMLRealtimeStatechart) this.getUMLRealtimeStatechart().internal_clone (rtsc, tmpRealtimeStatechart));
//         }
//         else
//         {
//            newComplexState.setUMLRealtimeStatechart ((UMLRealtimeStatechart) rtsc.getFromCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()));
//         }
//      }
//
//      //clone substatecharts
//      Iterator iter = this.iteratorOfUMLRealtimeStatechart1();
//      while (iter.hasNext())
//      {
//         UMLRealtimeStatechart oldStatechart = (UMLRealtimeStatechart) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldStatechart.hashCode()))
//         {
//            UMLRealtimeStatechart tmpStatechart = (UMLRealtimeStatechart) rtsc.addToCloneObservationMap (oldStatechart.hashCode(), project.getFromFactories(UMLRealtimeStatechart.class).create(true));
//            newComplexState.addToUMLRealtimeStatechart1 ((UMLRealtimeStatechart) oldStatechart.internal_clone (rtsc, tmpStatechart));
//         }
//         else
//         {
//            newComplexState.addToUMLRealtimeStatechart1 ((UMLRealtimeStatechart) rtsc.getFromCloneObservationMap (oldStatechart.hashCode()));
//         }
//      }
//
//      //clone realtimetransition (entry)
//      iter = this.iteratorOfIncomingUMLRealtimeTransitions();
//      while (iter.hasNext())
//      {
//         UMLRealtimeTransition oldTransition = (UMLRealtimeTransition) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldTransition.hashCode()))
//         {
//            UMLRealtimeTransition tmpTransition = (UMLRealtimeTransition) rtsc.addToCloneObservationMap (oldTransition.hashCode(), project.getFromFactories(UMLRealtimeTransition.class).create(true));
//            newComplexState.addToIncomingUMLRealtimeTransitions ((UMLRealtimeTransition) oldTransition.clone (rtsc, tmpTransition));
//         }
//         else
//         {
//            newComplexState.addToIncomingUMLRealtimeTransitions ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (oldTransition.hashCode()));
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
//            newComplexState.addToOutgoingUMLRealtimeTransitions ((UMLRealtimeTransition) oldTransition.clone (rtsc, tmpTransition));
//         }
//         else
//         {
//            newComplexState.addToOutgoingUMLRealtimeTransitions ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (oldTransition.hashCode()));
//         }
//      }
//
//      //clone invariantatom
//      iter = this.iteratorOfUMLInvariantAtom();
//      while (iter.hasNext())
//      {
//         UMLInvariantAtom oldAtom = (UMLInvariantAtom) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldAtom.hashCode()))
//         {
//            UMLInvariantAtom tmpAtom = (UMLInvariantAtom) rtsc.addToCloneObservationMap (oldAtom.hashCode(), project.getFromFactories(UMLInvariantAtom.class).create(true));
//            newComplexState.addToUMLInvariantAtom ((UMLInvariantAtom) oldAtom.clone (rtsc, tmpAtom));
//         }
//         else
//         {
//            newComplexState.addToUMLInvariantAtom ((UMLInvariantAtom) rtsc.getFromCloneObservationMap (oldAtom.hashCode()));
//         }
//      }
//      
//      //clone realtimeDoAction
//      if (this.getUMLRealtimeDoAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeDoAction().hashCode()))
//         {
//            UMLRealtimeAction tmpAction = (UMLRealtimeAction) rtsc.addToCloneObservationMap (this.getUMLRealtimeDoAction().hashCode(), project.getFromFactories(UMLRealtimeAction.class).create(true));
//            newComplexState.setUMLRealtimeDoAction ((UMLRealtimeAction) this.getUMLRealtimeDoAction().clone (rtsc, tmpAction));
//         }
//         else
//         {
//           newComplexState.setUMLRealtimeDoAction ((UMLRealtimeAction) rtsc.getFromCloneObservationMap (this.getUMLRealtimeDoAction().hashCode()));
//         }
//      }
//      
//      //clone realtimeEntryAction
//      if (this.getUMLRealtimeEntryAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeEntryAction().hashCode()))
//         {
//            UMLRealtimeAction tmpAction = (UMLRealtimeAction) rtsc.addToCloneObservationMap (this.getUMLRealtimeEntryAction().hashCode(), project.getFromFactories(UMLRealtimeAction.class).create(true));
//            newComplexState.setUMLRealtimeEntryAction ((UMLRealtimeAction) this.getUMLRealtimeEntryAction().clone (rtsc, tmpAction));
//         }
//         else
//         {
//           newComplexState.setUMLRealtimeEntryAction ((UMLRealtimeAction) rtsc.getFromCloneObservationMap (this.getUMLRealtimeEntryAction().hashCode()));
//         }
//      }
//
//      //clone realtimeExitAction
//      if (this.getUMLRealtimeExitAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeExitAction().hashCode()))
//         {
//            UMLRealtimeAction tmpAction = (UMLRealtimeAction) rtsc.addToCloneObservationMap (this.getUMLRealtimeExitAction().hashCode(), project.getFromFactories(UMLRealtimeAction.class).create(true));
//            newComplexState.setUMLRealtimeExitAction ((UMLRealtimeAction) this.getUMLRealtimeExitAction().clone (rtsc, tmpAction));
//         }
//         else
//         {
//           newComplexState.setUMLRealtimeExitAction ((UMLRealtimeAction) rtsc.getFromCloneObservationMap (this.getUMLRealtimeExitAction().hashCode()));
//         }
//      }
//
//      return newComplexState;
	  return null;
   }

}

/*
 * $Log$
 * Revision 1.35  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.34  2009/02/13 10:29:36  chrisheinzemann
 * Natural Numbers are created using the factories, now
 * this removes many exceptions and warning on creation and serialization of the objects and while setting the attributes
 *
 * Revision 1.33  2009/01/26 16:50:10  cytom
 * fixed erros with wcet-document path:
 * In fujaba-standalone it pointed normally to "plugins/RealtimeStatechart/wcet.xml". In F4E the path to wcet.xml cant specified relative without knowledge of eclipse-details and it may be inside a jar-archive so the path had to be changed at startup.
 * Badly the absolut path was saved to the model, this is fixed now. Only when the user changes the path it get saved to the model, in other cases the default-path to wcet.xml is used.
 *
 * Revision 1.32  2008/12/09 11:28:03  cytom
 * cleanups + removed warnings
 *
 * Revision 1.31  2007/06/18 22:16:48  mtt
 * fixed removal of actions in states
 * added gui for adding and removing clock resets to actions in states
 *
 * Revision 1.30  2007/02/21 15:36:15  mtt
 * removed old demo fix to enable correct period calculation
 *
 * Revision 1.29  2007/01/03 20:41:56  alexfupp
 * removed constraints because they are not used
 *
 * Revision 1.28  2006/11/30 18:40:24  aseibel
 * removing a state should imply removing all connected transitions
 *
 * Revision 1.27  2006/08/16 22:01:01  alexfupp
 * more changes to use factories
 *
 * Revision 1.26  2006/08/16 21:06:16  alexfupp
 * changed to use factories
 * and a few fixes for errors caused by switch to fujaba5
 *
 * Revision 1.25  2006/08/13 21:29:42  alexfupp
 * changed to use factories
 *
 * Revision 1.24  2006/07/20 20:03:36  mtt
 * first bunch of factories
 *
 * Revision 1.23  2005/09/12 06:02:07  burmi
 * adjustment for pattern support
 *
 */
