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

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.NaturalNumber;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClockResetAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLComplexRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLDeadlineAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeArgument;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeInternalEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;


/**
 * UMLClass: 'UMLRealtimeTransition'.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3594 $
 * @created   $Date: 2009-04-03 14:08:07 +0200 (Fr, 03 Apr 2009) $
 * @generated
 */
public class UMLRealtimeTransitionImpl implements UMLRealtimeTransition // extends UMLConnection
{
	/**
	 * @generated
	 */
	public int getSynchronizationType(){return 0;}

	/**
	 * @generated
	 */
	public boolean getParameterized(){return false;}

	/**
	 * @generated
	 */
	public boolean getUrgent(){return false;}

	/**
	 * @generated
	 */
	public String getGuard(){return null;}

	/**
	 * @generated
	 */
	public Vector getUMLRealtimeTransitionMappingVector(){return null;}

	/**
	 * @generated
	 */
	public int getPriority(){return 0;}

	/**
	 * @generated
	 */
	public String getName(){return null;}

	/**
	 * @generated
	 */
	public UMLSynchronizationChannelImpl getUMLSynchronizationChannel(){return null;}

	/**
	 * @generated
	 */
	public UMLSynchronizationChannelImpl getSenderSynchronizationChannel(){return null;}

	/**
	 * @generated
	 */
	public UMLSynchronizationChannelImpl getReceiverSynchronizationChannel(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLClock> getUMLClocks(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeAction getUMLRealtimeAction(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeState getTargetUMLRealtimeState(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeState getSourceUMLRealtimeState(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeArgument> getAssignmentsSets(){return null;}

//	/**
//	 * @generated
//	 */
//	public java.util.List<UMLDiagramItem> getConditionsSets(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLClockResetAtom> getUMLClockResetAtoms(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeFlatSwitching getUMLRealtimeFlatSwitching(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeFadingFunction getUMLRealtimeFadingFunction(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeInternalEvent> getUMLRealtimeInternalEventss(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeEvent> getUMLRealtimeTriggerEventss(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeEvent> getRaisedUMLRealtimeEvents(){return null;}

	/**
	 * @deprecated use field {@link #senderSynchronizationChannel} or {@link #receiverSynchronizationChannel} instead
	 */
	public final static int NONE = 0;
	/**
	 * @deprecated use field {@link #senderSynchronizationChannel} or {@link #receiverSynchronizationChannel} instead
	 */
	public final static int RECEIVER = 1;
	/**
	 * @deprecated use field {@link #senderSynchronizationChannel} or {@link #receiverSynchronizationChannel} instead
	 */
	public final static int SENDER = 2;

	/*
	 * User defined.
	 */

   /**
    * Sets the guard attribute of the UMLRealtimeTransition object
    *
    * @param guard  The new guard value
    */
   public void setGuard (String guard)
   {
//      if ( (guard == "") ||  (guard == null) ||  (getSourceConnector() instanceof UMLRealtimeStartState))
//      {
//         this.guard = null;
//      }
//      else
//      {
//         String oldValue = this.guard;
//         this.guard = guard;
//         firePropertyChange ("guard", oldValue, guard);
//      }
   }


//   /**
//    * Get the event trigger attribute of the UMLRealtimeTransition object
//    *
//    * @return       The event value
//    * @deprecated   This method has been deprecated. In future releases it will be possible to specify multiple event triggers. Then you will have to use public Iterator iteratorOfUMLRealtimeEvent()
//    */
//   public String getEvent()
//   {
//      Iterator<UMLRealtimeEvent> iter = iteratorOfUMLRealtimeTriggerEvents();
//      UMLRealtimeEvent event = null;
//      if (iter.hasNext())
//      {
//         event = (UMLRealtimeEvent) iter.next();
//         return event.getName();
//      }
//      return null;
//   }
//

//   /**
//    * Get the event trigger source attribute of the UMLRealtimeTransition object
//    *
//    * @return       The event source value
//    * @deprecated   This method has been deprecated. In future releases it will be possible to specify multiple event triggers. Then you will have to use public Iterator iteratorOfUMLRealtimeEvent()
//    */
//   public String getEventSource()
//   {
//      Iterator<UMLRealtimeEvent> iter = iteratorOfUMLRealtimeTriggerEvents();
//      UMLRealtimeEvent event = null;
//      if (iter.hasNext())
//      {
//         event = (UMLRealtimeEvent) iter.next();
//      }
//      return event.getInstance();
//   }
//
//
   /**
    * access method for the source object of the edge
    *
    * @param item  the new source object
    * @return      true if the source object was changed, false otherwise
    */
   public boolean setSourceConnector (UMLRealtimeState state)// setSourceConnector (UMLDiagramItem item)
   {
	   return false;
//      if (! (item instanceof UMLRealtimeState))
//      {
//         throw new IllegalArgumentException ("Argument is no UMLRealtimeState");
//      }
//      return setRevExit ((UMLRealtimeState) item);
   }


   /**
    * access method for the source object of the edge
    *
    * @return   the source object of the edge
    */
   public UMLRealtimeState getSourceConnector() // UMLDiagramItem getSourceConnector()
   {
	   return null;
//      return getRevExit();
   }


   /**
    * access method for the target object of the edge
    *
    * @param item  the new target object
    * @return      true if the target object was changed, false otherwise
    */
   public boolean setTargetConnector (UMLRealtimeState state) // setTargetConnector (UMLDiagramItem item)
   {
	   return false;
//      if (! (item instanceof UMLRealtimeState))
//      {
//         throw new IllegalArgumentException ("Argument is no UMLRealtimeState");
//      }
//      return setRevEntry ((UMLRealtimeState) item);
   }


   /**
    * access method for the target object of the edge
    *
    * @return   the target object of the edge
    */
   public UMLRealtimeState getTargetConnector() // UMLDiagramItem getTargetConnector()
   {
	   return null;
//      return getRevEntry();
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param clock  No description provided
    * @return       No description provided
    */
   public boolean hasClockInUMLClockResetAtom (UMLClock clock)
   {
//      Iterator<UMLClockResetAtom> iter = iteratorOfUMLClockResetAtom();
//      while (iter.hasNext())
//      {
//         UMLClockResetAtom atom = (UMLClockResetAtom) iter.next();
//         if (atom.getUMLClock() == clock)
//         {
//            return true;
//         }
//      }
      return false;
   }


//   /**
//    * No comment provided by developer, please add a comment to ensure improve documentation.
//    *
//    * @return       No description provided
//    * @deprecated   This method has been deprecated. In future releases you will have to use public NaturalNumber calculateWorstCaseDeadlineAsNaturalNumber()
//    */
//   public long calculateWorstCaseDeadline()
//   {
//      NaturalNumber n = calculateWorstCaseDeadlineAsNaturalNumber();
//      return n.longValue();
//   }
//

   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    *
    * @return   No description provided
    */
   public NaturalNumber calculateWorstCaseDeadlineAsNaturalNumber()
   {
	   return null;
//      NaturalNumber deadline = this.getProject().getFromFactories(NaturalNumber.class).create();
//      deadline.setValue (new Infinity());
//      boolean firstValue = true;
//      if (getTargetConnector() instanceof UMLComplexRealtimeState)
//      {
//         UMLComplexRealtimeState target = (UMLComplexRealtimeState) getTargetConnector();
//         Iterator iter = target.iteratorOfUMLInvariantAtom();
//         while (iter.hasNext())
//         {
//            UMLInvariantAtom atom = (UMLInvariantAtom) iter.next();
//            UMLClock clock = atom.getUMLClock();
//
//            NaturalNumber newValue = this.getProject().getFromFactories(NaturalNumber.class).create();
//            newValue.setValue (new Long (0));
//            if (hasClockInUMLClockResetAtom (clock))
//            {
//               newValue = atom.getUpperBound();
//            }
//            else
//            {
//               UMLTimeguardAtomImpl timeguardAtom = getUMLTimeguardAtom (clock);
//               if (timeguardAtom != null)
//               {
//                  if (atom.getUpperBound().isInfinity())
//                  {
//                     newValue = this.getProject().getFromFactories(NaturalNumber.class).create();
//                     newValue.setValue (new Infinity());
//                  }
//                  else if (!timeguardAtom.getUpperBound().isInfinity())
//                  {
//                     newValue = this.getProject().getFromFactories(NaturalNumber.class).create();
//                     newValue.setValue (new Long (atom.getUpperBound().longValue() - timeguardAtom.getUpperBound().longValue()));
//                  }
//               }
//               else
//               {
//                  newValue = this.getProject().getFromFactories(NaturalNumber.class).create();
//                  newValue.setValue (atom.getUpperBound().longValue());
//               }
//            }
//
//            if ( (newValue.isLessThan (deadline)) ||  (firstValue))
//            {
//               deadline = newValue;
//               firstValue = false;
//            }
//         } //while
//
////         UMLRealtimeAction action = getUMLRealtimeAction();
//         { //if (action != null)
//
//            iter = iteratorOfUMLDeadlineAtom();
//            while (iter.hasNext())
//            {
//               UMLDeadlineAtom atom = (UMLDeadlineAtom) iter.next();
//               UMLClock clock = atom.getUMLClock();
//               NaturalNumber newValue = this.getProject().getFromFactories(NaturalNumber.class).create();
//               newValue.setValue (new Long (0));
//               if (hasInUMLClock (clock))
//               {
//                  newValue = atom.getUpperBound();
//               }
//               else
//               {
//                  UMLTimeguardAtomImpl timeguardAtom = getUMLTimeguardAtom (clock);
//                  if (timeguardAtom != null)
//                  {
//                     if (atom.getUpperBound().isInfinity())
//                     {
//                        newValue = this.getProject().getFromFactories(NaturalNumber.class).create();
//                        newValue.setValue (new Infinity());
//                     }
//                     else if (!timeguardAtom.getUpperBound().isInfinity())
//                     {
//                        newValue = this.getProject().getFromFactories(NaturalNumber.class).create();
//                        newValue.setValue (new Long (atom.getUpperBound().longValue() - timeguardAtom.getUpperBound().longValue()));
//                     }
//                  }
//                  else
//                  {
//                     newValue = atom.getUpperBound();
//                  }
//               }
//               if ( (newValue.isLessThan (deadline)) ||  (firstValue))
//               {
//                  deadline = newValue;
//                  firstValue = false;
//               }
//            } //while
//         } //if (action != null)
//      } //if (getTargetConnector() instanceof UMLComplexRealtimeState)
//
//      if (firstValue)
//      {
//         deadline = this.getProject().getFromFactories(NaturalNumber.class).create();
//         deadline.setValue (new Infinity()); //INFINITY
//      }
//      return deadline;
   }
   
   
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   private static int nameCounter = 0;

	/**
    * Returns a default name based on source and target names (if possible).
    * @return a default name based on source and target names (if possible)
    */
   public String getDefaultName()
   {
      if ( (getSourceConnector() != null) &&  (getTargetConnector() != null))
      {
         return "TRANS" + nameCounter++ + "_" + getSourceConnector().getName() + "_" + getTargetConnector().getName();
      }
      return "TRANS" + nameCounter++;
   }

   /**
    * Method for compability: just calls getUMLRealtimeState1.
    *
    * @return   The revExit value
    */
   public UMLRealtimeState getRevExit()
   {
      return getSourceUMLRealtimeState();
   }


   /**
    * Method for compability: just calls getUMLRealtimeState.
    *
    * @return   The revEntry value
    */
   public UMLRealtimeState getRevEntry()
   {
      return getTargetUMLRealtimeState();
   }
   
   
   /**
    * Method to describe if clock with the same ID is contained in uMLClock.
    *
    * @param clock  No description provided
    * @return       No description provided
    */
   public boolean resetsClock (UMLClock clock)
   {
//      Iterator<UMLClockResetAtom> iter = iteratorOfUMLClockResetAtom();
//      while (iter.hasNext())
//      {
//         UMLClock c =  ((UMLClockResetAtom) iter.next()).getUMLClock();
//         if (c.getId().equals (clock.getId()))
//         {
//            return true;
//         }
//      }
      return false;
   }
   
   
   /**
    * Get the a clone of the current UMLRealtimeTransition object
    *
    * @param rtsc           No description provided
    * @param newTransition  No description provided
    * @return               The cloned realtimetransition value
    */
   public Object clone (UMLRealtimeStatechart rtsc, UMLRealtimeTransitionImpl newTransition)
   {
	   return null;
//	   FProject project = rtsc.getProject(); 
//      //begin cloning
//      newTransition.setUrgent (this.isUrgent());
//      newTransition.setGuard (this.getGuard());
//      newTransition.setName (this.getName());
//      newTransition.setPriority (this.getPriority());
//      newTransition.setSynchronizationType (this.getSynchronizationType());
//
//      //clone realtimestatechart
//      if (this.getUMLRealtimeStatechart() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()))
//         {
//            UMLRealtimeStatechart tmpRealtimeStatechart = (UMLRealtimeStatechart) rtsc.addToCloneObservationMap (this.getUMLRealtimeStatechart().hashCode(), project.getFromFactories(UMLRealtimeStatechart.class).create(true));
//            newTransition.setUMLRealtimeStatechart ((UMLRealtimeStatechart) this.getUMLRealtimeStatechart().internal_clone (rtsc, tmpRealtimeStatechart));
//         }
//         else
//         {
//            newTransition.setUMLRealtimeStatechart ((UMLRealtimeStatechart) rtsc.getFromCloneObservationMap (this.getUMLRealtimeStatechart().hashCode()));
//         }
//      }
//
//      //clone realtimeaction
//      if (this.getUMLRealtimeAction() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLRealtimeAction().hashCode()))
//         {
//            UMLRealtimeAction tmpAction = (UMLRealtimeAction) rtsc.addToCloneObservationMap (this.getUMLRealtimeAction().hashCode(), project.getFromFactories(UMLRealtimeAction.class).create(true));
//            newTransition.setUMLRealtimeAction ((UMLRealtimeAction) this.getUMLRealtimeAction().clone (rtsc, tmpAction));
//         }
//         else
//         {
//            newTransition.setUMLRealtimeAction ((UMLRealtimeAction) rtsc.getFromCloneObservationMap (this.getUMLRealtimeAction().hashCode()));
//         }
//      }
//
//      //clone syncronizationchannel
//      if (this.getUMLSynchronizationChannel() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getUMLSynchronizationChannel().hashCode()))
//         {
//            UMLSynchronizationChannelImpl tmpChannel = (UMLSynchronizationChannelImpl) rtsc.addToCloneObservationMap (this.getUMLSynchronizationChannel().hashCode(), project.getFromFactories(UMLSynchronizationChannelImpl.class).create(true));
//            newTransition.setUMLSynchronizationChannel ((UMLSynchronizationChannelImpl) this.getUMLSynchronizationChannel().clone (rtsc, tmpChannel));
//         }
//         else
//         {
//            newTransition.setUMLSynchronizationChannel ((UMLSynchronizationChannelImpl) rtsc.getFromCloneObservationMap (this.getUMLSynchronizationChannel().hashCode()));
//         }
//      }
//
//      // clone sender synchronization channel
//      UMLSynchronizationChannelImpl sChan = getSenderSynchronizationChannel();
//      if (sChan != null)
//      {
//         if (!rtsc.hasInCloneObservationMap(sChan.hashCode()))
//         {
//            UMLSynchronizationChannelImpl newSChan = project.createFromFactories(UMLSynchronizationChannelImpl.class);
//            rtsc.addToCloneObservationMap(sChan.hashCode(), newSChan);
//            newTransition.setSenderSynchronizationChannel((UMLSynchronizationChannelImpl) getSenderSynchronizationChannel().clone(rtsc, newSChan));
//         }
//         else
//         {
//            newTransition.setSenderSynchronizationChannel((UMLSynchronizationChannelImpl) rtsc.getFromCloneObservationMap(sChan.hashCode()));
//         }
//      }
//
//      // clone receiver synchronization channel
//      UMLSynchronizationChannelImpl rChan = getReceiverSynchronizationChannel();
//      if (rChan != null)
//      {
//         if (!rtsc.hasInCloneObservationMap(rChan.hashCode()))
//         {
//            UMLSynchronizationChannelImpl newRChan = project.createFromFactories(UMLSynchronizationChannelImpl.class);
//            rtsc.addToCloneObservationMap(rChan.hashCode(), newRChan);
//            newTransition.setReceiverSynchronizationChannel((UMLSynchronizationChannelImpl) getSenderSynchronizationChannel().clone(rtsc, newRChan));
//         }
//         else
//         {
//            newTransition.setReceiverSynchronizationChannel((UMLSynchronizationChannelImpl) rtsc.getFromCloneObservationMap(rChan.hashCode()));
//         }
//      }
//
//      //clone entry state
//      if (this.getSourceConnector() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getSourceConnector().hashCode()))
//         {
//            UMLRealtimeState tmpState = null;
//            if (this.getSourceConnector() instanceof UMLRealtimeStartState)
//            {
//               tmpState = (UMLRealtimeStartState) rtsc.addToCloneObservationMap (this.getSourceConnector().hashCode(), project.getFromFactories(UMLRealtimeStartState.class).create(true));
//               newTransition.setSourceConnector ((UMLRealtimeStartState)  ((UMLRealtimeStartState) this.getSourceConnector()).clone (rtsc, (UMLRealtimeStartState) tmpState));
//            }
//            else if (this.getSourceConnector() instanceof UMLRealtimeStopState)
//            {
//               tmpState = (UMLRealtimeStopState) rtsc.addToCloneObservationMap (this.getSourceConnector().hashCode(), project.getFromFactories(UMLRealtimeStopState.class).create(true));
//               newTransition.setSourceConnector ((UMLRealtimeStopState)  ((UMLRealtimeStopState) this.getSourceConnector()).clone (rtsc, (UMLRealtimeStopState) tmpState));
//            }
//            else if (this.getSourceConnector() instanceof UMLComplexRealtimeState)
//            {
//               tmpState = (UMLComplexRealtimeState) rtsc.addToCloneObservationMap (this.getSourceConnector().hashCode(), project.getFromFactories(UMLComplexRealtimeState.class).create(true));
//               newTransition.setSourceConnector ((UMLComplexRealtimeState)  ((UMLComplexRealtimeState) this.getSourceConnector()).clone (rtsc, (UMLComplexRealtimeState) tmpState));
//            }
//         }
//         else
//         {
//            newTransition.setSourceConnector ((UMLRealtimeState) rtsc.getFromCloneObservationMap (this.getSourceConnector().hashCode()));
//         }
//      }
//
//      //clone exit state
//      if (this.getTargetConnector() != null)
//      {
//         if (!rtsc.hasInCloneObservationMap (this.getTargetConnector().hashCode()))
//         {
//            UMLRealtimeState tmpState = null;
//            if (this.getTargetConnector() instanceof UMLRealtimeStartState)
//            {
//               tmpState = (UMLRealtimeStartState) rtsc.addToCloneObservationMap (this.getTargetConnector().hashCode(), project.getFromFactories(UMLRealtimeStartState.class).create(true));
//               newTransition.setTargetConnector ((UMLRealtimeStartState)  ((UMLRealtimeStartState) this.getTargetConnector()).clone (rtsc, (UMLRealtimeStartState) tmpState));
//            }
//            else if (this.getTargetConnector() instanceof UMLRealtimeStopState)
//            {
//               tmpState = (UMLRealtimeStopState) rtsc.addToCloneObservationMap (this.getTargetConnector().hashCode(), project.getFromFactories(UMLRealtimeStopState.class).create(true));
//               newTransition.setTargetConnector ((UMLRealtimeStopState)  ((UMLRealtimeStopState) this.getTargetConnector()).clone (rtsc, (UMLRealtimeStopState) tmpState));
//            }
//            else if (this.getTargetConnector() instanceof UMLComplexRealtimeState)
//            {
//               tmpState = (UMLComplexRealtimeState) rtsc.addToCloneObservationMap (this.getTargetConnector().hashCode(), project.getFromFactories(UMLComplexRealtimeState.class).create(true));
//               newTransition.setTargetConnector ((UMLComplexRealtimeState)  ((UMLComplexRealtimeState) this.getTargetConnector()).clone (rtsc, (UMLComplexRealtimeState) tmpState));
//            }
//         }
//         else
//         {
//            newTransition.setTargetConnector ((UMLRealtimeState) rtsc.getFromCloneObservationMap (this.getTargetConnector().hashCode()));
//         }
//      }
//
//      //clone clocks
//      Iterator iter = this.iteratorOfUMLClock();
//      while (iter.hasNext())
//      {
//         UMLClock oldClock = (UMLClock) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldClock.hashCode()))
//         {
//            UMLClock tmpClock = (UMLClock) rtsc.addToCloneObservationMap (oldClock.hashCode(), project.getFromFactories(UMLClock.class).create(true));
//            newTransition.addToUMLClock ((UMLClock) oldClock.clone (rtsc, tmpClock));
//         }
//         else
//         {
//            newTransition.addToUMLClock ((UMLClock) rtsc.getFromCloneObservationMap (oldClock.hashCode()));
//         }
//      }
//
//      //clone clockresetatoms
//      iter = this.iteratorOfUMLClockResetAtom();
//      while (iter.hasNext())
//      {
//         UMLClockResetAtom oldClockResetAtom = (UMLClockResetAtom) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldClockResetAtom.hashCode()))
//         {
//            UMLClockResetAtom tmpClockResetAtom = (UMLClockResetAtom) rtsc.addToCloneObservationMap (oldClockResetAtom.hashCode(), project.getFromFactories(UMLClockResetAtom.class).create(true));
//            newTransition.addToUMLClockResetAtom ((UMLClockResetAtom) oldClockResetAtom.clone (rtsc, tmpClockResetAtom));
//         }
//         else
//         {
//            newTransition.addToUMLClockResetAtom ((UMLClockResetAtom) rtsc.getFromCloneObservationMap (oldClockResetAtom.hashCode()));
//         }
//      }
//
//      //clone timeguard atoms
//      iter = this.iteratorOfUMLTimeguardAtom();
//      while (iter.hasNext())
//      {
//         UMLTimeguardAtomImpl oldAtom = (UMLTimeguardAtomImpl) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldAtom.hashCode()))
//         {
//            UMLTimeguardAtomImpl tmpAtom = (UMLTimeguardAtomImpl) rtsc.addToCloneObservationMap (oldAtom.hashCode(), project.getFromFactories(UMLTimeguardAtomImpl.class).create(true));
//            newTransition.addToUMLTimeguardAtom ((UMLTimeguardAtomImpl) oldAtom.clone (rtsc, tmpAtom));
//         }
//         else
//         {
//            newTransition.addToUMLTimeguardAtom ((UMLTimeguardAtomImpl) rtsc.getFromCloneObservationMap (oldAtom.hashCode()));
//         }
//      }
//
//      //clone deadline atoms
//      iter = this.iteratorOfUMLDeadlineAtom();
//      while (iter.hasNext())
//      {
//         UMLDeadlineAtom oldAtom = (UMLDeadlineAtom) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldAtom.hashCode()))
//         {
//            UMLDeadlineAtom tmpAtom = (UMLDeadlineAtom) rtsc.addToCloneObservationMap (oldAtom.hashCode(), project.getFromFactories(UMLDeadlineAtom.class).create(true));
//            newTransition.addToUMLDeadlineAtom ((UMLDeadlineAtom) oldAtom.clone (rtsc, tmpAtom));
//         }
//         else
//         {
//            newTransition.addToUMLDeadlineAtom ((UMLDeadlineAtom) rtsc.getFromCloneObservationMap (oldAtom.hashCode()));
//         }
//      }
//
//      //clone realtime event
//      iter = this.iteratorOfUMLRealtimeTriggerEvents();
//      while (iter.hasNext())
//      {
//         UMLRealtimeEvent oldEvent = (UMLRealtimeEvent) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldEvent.hashCode()))
//         {
//            UMLRealtimeEvent tmpEvent = (UMLRealtimeEvent) rtsc.addToCloneObservationMap (oldEvent.hashCode(), project.getFromFactories(UMLRealtimeEvent.class).create(true));
//            newTransition.addToUMLRealtimeTriggerEvents ((UMLRealtimeEvent) oldEvent.clone (rtsc, tmpEvent));
//         }
//         else
//         {
//            newTransition.addToUMLRealtimeTriggerEvents ((UMLRealtimeEvent) rtsc.getFromCloneObservationMap (oldEvent.hashCode()));
//         }
//      }
//
//      //clone realtime event1
//      iter = this.iteratorOfUMLRealtimeRaisedEvents();
//      while (iter.hasNext())
//      {
//         UMLRealtimeEvent oldEvent = (UMLRealtimeEvent) iter.next();
//         if (!rtsc.hasInCloneObservationMap (oldEvent.hashCode()))
//         {
//            UMLRealtimeEvent tmpEvent = (UMLRealtimeEvent) rtsc.addToCloneObservationMap (oldEvent.hashCode(), project.getFromFactories(UMLRealtimeEvent.class).create(true));
//            newTransition.addToUMLRealtimeRaisedEvents ((UMLRealtimeEvent) oldEvent.clone (rtsc, tmpEvent));
//         }
//         else
//         {
//            newTransition.addToUMLRealtimeRaisedEvents ((UMLRealtimeEvent) rtsc.getFromCloneObservationMap (oldEvent.hashCode()));
//         }
//      }
//
//      return newTransition;
   }
}

/*
 * $Log$
 * Revision 1.66.2.7  2009/02/25 21:48:25  cajudosu
 * * Added changes to meta model of RTSCs to support parameterized synchronization channels.
 *
 * Revision 1.66.2.6  2009/01/06 21:43:49  alhawash
 * remove unused import
 *
 * Revision 1.66.2.5  2009/01/06 16:07:21  alhawash
 * removing old Attributes for setting the referenced UMLMethod. these were replaced with the Sets AssignmentsSet and ConditionsSet
 *
 * Revision 1.66.2.4  2009/01/05 13:59:16  alhawash
 * FHashSet to -> FPropHashSet for the Sets: "Assignments and Conditions". so that fire-property-changes are better supported.
 *
 * Revision 1.66.2.3  2008/12/23 23:14:36  alhawash
 * adding FHashSet<UMLDiagramItem> conditionsSet
 *
 * Revision 1.66.2.2  2008/12/23 17:09:17  alhawash
 * adding the FHashSet<UMLRealtimeArgument> assignmentsSet
 *
 * Revision 1.66.2.1  2008/12/19 21:26:01  alhawash
 * adding the Class "UMLRealtimeInternalEvent" and "UMLRealtimeArgument" and their needed related reference-Classes to work + updated related classes "UMLRealtimeTransition" and Visitor-Package-classes
 *
 * Revision 1.66  2008/12/12 22:46:39  alhawash
 * removing propertyChangeListener for referenced UMLMethod.
 * improve implementing
 *
 * Revision 1.65  2008/12/11 14:01:13  alhawash
 * change visibility of the method "setNameOfReferencedMethod()" to public
 *
 * Revision 1.63  2008/12/09 13:54:42  alhawash
 * bug-fix. avoid setting the referenced method on null, while loading the project. and the Method-arguments are reseted
 *
 * Revision 1.62  2008/12/09 11:28:03  cytom
 * cleanups + removed warnings
 *
 * Revision 1.61  2008/11/19 13:37:36  alhawash
 * add the Attributes  "referencedUMLMethod" and "nameOFReferencedUMLMethod" with their getter and setter.
 *
 * Slightly cleaning of Code.
 *
 * Revision 1.60  2008/10/19 18:19:09  cytom
 * hybrid transitions get drawn as bold lines only when a flat switching spline function is given + added/improved property change code to UMLHybridFlatSwitching/-Transition
 *
 * Revision 1.59  2008/07/24 15:04:09  cytom
 * setting the name of a transition to null or empty-string resulted in setting an default-name already, now the default-name is also set when getName() is called and name is null
 *
 * Revision 1.58  2008/07/02 15:08:42  crowdy
 * removed unused imports
 *
 * Revision 1.57  2008/06/22 15:31:38  crowdy
 * add missing class "UMLRealtimeEventInstanceOfMessageType" and changes for the new messageTypes
 * previous changes see logs
 *
 * Revision 1.56.2.2  2008/06/19 08:56:14  chrisheinzemann
 * events are deleted with the transition now, after deleting an event the element references are unregistered correctly
 *
 * Revision 1.56.2.1  2008/06/05 13:51:03  crowdy
 * adopted to generic iterators
 *
 * Revision 1.56  2007/06/18 13:17:52  mtt
 * fixed cloning for time and clock related syntax elements, raised events are correctly cloned as raised events
 *
 * Revision 1.55  2007/06/15 13:44:58  mtt
 * fixed changing of clocks in a timeguard in gui -> more than one timeguard can be added to a transition in gui
 *
 * Revision 1.54  2007/01/17 10:39:14  mtt
 * fixed access-method names for _interface attributes (removed many nosuchfieldexceptions)
 *
 * Revision 1.53  2006/11/30 18:40:24  aseibel
 * removing a state should imply removing all connected transitions
 *
 * Revision 1.52  2006/08/16 21:06:16  alexfupp
 * changed to use factories
 * and a few fixes for errors caused by switch to fujaba5
 *
 * Revision 1.51  2006/08/03 11:51:48  mtt
 * more fixes for factories
 *
 * Revision 1.50  2006/07/19 18:46:03  mtt
 * changed import declarations to Fujaba 5 package structure
 *
 * Revision 1.49  2005/12/08 12:28:28  mtt
 * removed deprecated attribute event and method setEvent(), getEvent() is left since it is used as a wrapper for a single event in various places (code generation, dialogs)
 *
 */
