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

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClockResetAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLComplexRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;


/**
 * UMLClass: 'UMLRealtimeAction'.
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3555 $
 * @created   $Date: 2009-03-22 01:08:17 +0100 (So, 22 Mrz 2009) $
 * @generated
 */
public class UMLRealtimeActionImpl implements UMLRealtimeAction // extends UMLDiagramItem
{

	/**
	 * @generated
	 */
   public String getId(){return null;}

	/**
	 * @generated
	 */
   public String getActionType(){return null;}

	/**
	 * @generated
	 */
   public String getAction(){return null;}

	/**
	 * @generated
	 */
   public long getPeriodUpperBound(){return 0;}

	/**
	 * @generated
	 */
   public long getPeriodLowerBound(){return 0;}

	/**
	 * @generated
	 */
   public Long getWcet(){return null;}

	/**
	 * @generated
	 */
   public boolean getWcetSpecifiedByUser(){return false;}

	/**
	 * @generated
	 */
   public String getWcetName(){return null;}

	/**
	 * @generated
	 */
   public boolean getDisplayValuation(){return false;}

	/**
	 * @generated
	 */
   public long getBlocking(){return 0;}

	/**
	 * @generated
	 */
   public UMLRealtimeTransition getUMLRealtimeTransition(){return null;}

	/**
	 * @generated
	 */
   public UMLComplexRealtimeState getRevUMLRealtimeDoAction(){return null;}

	/**
	 * @generated
	 */
   public UMLComplexRealtimeState getRevUMLRealtimeEntryAction(){return null;}

	/**
	 * @generated
	 */
   public UMLComplexRealtimeState getRevUMLRealtimeExitAction(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<UMLClockResetAtom> getUMLClockResetAtoms(){return null;}

   
   /*
    * User defined.
    */
   
   
   private static int idCount = 0;

//   protected UMLRealtimeActionImpl(FProject project, boolean persistent){
//	      super(project, persistent);
//	      this.setAction("");
//	      setId ("UMLRealtimeAction" + idCount);
//	      setWcet (new Long (0));
//	      setBlocking (0);
//	      setWcetName (null);
//	      setDisplayValuation (true);
//	      idCount++;
//	   }

   /**
    * {@inheritDoc}
    *
    * @param v  No description provided
    * @param s  No description provided
    * @return   No description provided
    */
//   public String accept (UMLRealtimeStatechartVisitorInterface v, String s)
//   {
//      return v.visit (this, s);
//   }
   /**
    * Get the a clone of the current UMLRealtimeAction object
    *
    * @param rtsc       No description provided
    * @param newAction  No description provided
    * @return           The cloned realtimeaction value
    */
   public EObject clone (UMLRealtimeStatechart rtsc, UMLRealtimeAction newAction)
   {
//      FProject project=rtsc.getProject();
//      //begin cloning
//      newAction.setAction (this.getAction());
//      newAction.setActionType (this.getActionType());
//      newAction.setBlocking (this.getBlocking());
//      newAction.setId (this.getId());
//      newAction.setWcet (this.getWcet());
//      newAction.setWcetName (this.getWcetName());
//      newAction.setWcetSpecifiedByUser (this.isWcetSpecifiedByUser());
//      newAction.setDisplayValuation (this.displayValuation());
//
//      //clone realtimetransition
//      if (this.getUMLRealtimeTransition() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeTransition().hashCode()))
//         {
//            UMLRealtimeTransition tmpRealtimeTransition = (UMLRealtimeTransition) rtsc.addToCloneObservationMap (this.getUMLRealtimeTransition().hashCode(), project.getFromFactories(UMLRealtimeTransition.class).create(true));
//            newAction.setUMLRealtimeTransition ((UMLRealtimeTransition) this.getUMLRealtimeTransition().clone (rtsc, tmpRealtimeTransition));
//         }
//         else
//         {
//            newAction.setUMLRealtimeTransition ((UMLRealtimeTransition) rtsc.getFromCloneObservationMap (this.getUMLRealtimeTransition().hashCode()));
//         }
//      }
//      
//      //clone clockresetatoms
//      Iterator<UMLClockResetAtom> iter = this.iteratorOfUMLClockResetAtom();
//      while (iter.hasNext())
//      {
//         UMLClockResetAtom oldClockResetAtom = iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldClockResetAtom.hashCode()))
//         {
//            UMLClockResetAtom tmpClockResetAtom = (UMLClockResetAtom) rtsc.addToCloneObservationMap (oldClockResetAtom.hashCode(), project.getFromFactories(UMLClockResetAtom.class).create(true));
//            newAction.addToUMLClockResetAtom ((UMLClockResetAtom) oldClockResetAtom.clone (rtsc, tmpClockResetAtom));
//         }
//         else
//         {
//            newAction.addToUMLClockResetAtom ((UMLClockResetAtom) rtsc.getFromCloneObservationMap (oldClockResetAtom.hashCode()));
//         }
//      }
//
//      //clone revDoAction state
//      if (this.getRevUMLRealtimeDoAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getRevUMLRealtimeDoAction().hashCode()))
//         {
//               UMLComplexRealtimeState tmpState = (UMLComplexRealtimeState) rtsc.addToCloneObservationMap (this.getRevUMLRealtimeDoAction().hashCode(), project.getFromFactories(UMLComplexRealtimeState.class).create(true));
//               newAction.setRevUMLRealtimeDoAction((UMLComplexRealtimeState)  ((UMLComplexRealtimeState) this.getRevUMLRealtimeDoAction()).clone (rtsc, (UMLComplexRealtimeState) tmpState));
//         }
//         else
//         {
//           newAction.setRevUMLRealtimeDoAction ((UMLComplexRealtimeState) rtsc.getFromCloneObservationMap (this.getRevUMLRealtimeDoAction().hashCode()));
//         }
//      }
//      
//      //clone revEntryAction state
//      if (this.getRevUMLRealtimeEntryAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getRevUMLRealtimeEntryAction().hashCode()))
//         {
//               UMLComplexRealtimeState tmpState = (UMLComplexRealtimeState) rtsc.addToCloneObservationMap (this.getRevUMLRealtimeEntryAction().hashCode(), project.getFromFactories(UMLComplexRealtimeState.class).create(true));
//               newAction.setRevUMLRealtimeEntryAction((UMLComplexRealtimeState)  ((UMLComplexRealtimeState) this.getRevUMLRealtimeEntryAction()).clone (rtsc, (UMLComplexRealtimeState) tmpState));
//         }
//         else
//         {
//           newAction.setRevUMLRealtimeEntryAction ((UMLComplexRealtimeState) rtsc.getFromCloneObservationMap (this.getRevUMLRealtimeEntryAction().hashCode()));
//         }
//      }
//      
//      //clone revEntryAction state
//      if (this.getRevUMLRealtimeExitAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getRevUMLRealtimeExitAction().hashCode()))
//         {
//               UMLComplexRealtimeState tmpState = (UMLComplexRealtimeState) rtsc.addToCloneObservationMap (this.getRevUMLRealtimeExitAction().hashCode(), project.getFromFactories(UMLComplexRealtimeState.class).create(true));
//               newAction.setRevUMLRealtimeExitAction((UMLComplexRealtimeState)  ((UMLComplexRealtimeState) this.getRevUMLRealtimeExitAction()).clone (rtsc, (UMLComplexRealtimeState) tmpState));
//         }
//         else
//         {
//           newAction.setRevUMLRealtimeExitAction ((UMLComplexRealtimeState) rtsc.getFromCloneObservationMap (this.getRevUMLRealtimeExitAction().hashCode()));
//         }
//      }
//      return newAction;
      return null;
   }
}

/*
 * $Log$
 * Revision 1.24  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.23  2008/07/02 15:08:42  crowdy
 * removed unused imports
 *
 * Revision 1.22  2007/06/18 22:16:48  mtt
 * fixed removal of actions in states
 * added gui for adding and removing clock resets to actions in states
 *
 * Revision 1.21  2007/06/18 17:04:30  mtt
 * support for clock resets on actions
 *
 * Revision 1.20  2006/08/16 21:06:16  alexfupp
 * changed to use factories
 * and a few fixes for errors caused by switch to fujaba5
 *
 * Revision 1.19  2006/08/13 21:29:42  alexfupp
 * changed to use factories
 *
 * Revision 1.18  2006/07/19 19:10:22  mtt
 * removed extension to class UMLAction since this class is not part of Fujaba 5 anymore
 *
 * Revision 1.17  2006/07/19 18:46:03  mtt
 * changed import declarations to Fujaba 5 package structure
 *
 * Revision 1.16  2005/09/01 08:36:39  aseibel
 * improved realtimestatechart cloning
 *
 */
