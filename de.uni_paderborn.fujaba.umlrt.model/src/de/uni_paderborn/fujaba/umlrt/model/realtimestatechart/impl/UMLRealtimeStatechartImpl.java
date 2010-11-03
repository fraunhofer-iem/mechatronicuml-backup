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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLComplexRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLSynchronizationChannel;


/**
 * UMLClass: 'UMLRealtimeStatechart'.
 * 
 * @author $Author: cytom $
 * @version $Revision: 3572 $
 * @created $Date: 2009-03-24 16:53:02 +0100 (Di, 24 Mrz 2009) $
 * @generated
 */
public class UMLRealtimeStatechartImpl implements UMLRealtimeStatechart
    
{
	/**
	 * @generated
	 */
	public String getName(){return null;}

	/**
	 * @generated
	 */
	public int getEventQueueSize(){return 0;}

	// Transient field in class.
	/**
	 * @generated
	 */
	public boolean getFirstCalculation(){return false;}

	/**
	 * @generated
	 */
	public boolean getTopStatechart(){return false;}

	/**
	 * @generated
	 */
	public String getWcetDocument(){return null;}

	/**
	 * Default value should be "UMLRealtimeStatechart.CONFORM"
	 * 
	 * @generated default="0"
	 */
	public int getSecurityLevel(){return 0;}
	/**
	 * @generated
	 */
	public Map getSystemWcetMap(){return null;}

	/**
	 * @generated
	 */
	public double getUtilisation(){return 0.0;}

	/**
	 * @generated default="\"schedule.xml\""
	 */
	public String getScheduleDocument(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeStartState getUMLRealtimeStartState(){return null;}

	/**
	 * @generated
	 */
	public UMLComplexRealtimeState getUMLComplexRealtimeState(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeTransition> getUMLRealtimeTransitions(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeState> getUMLRealtimeStates(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLSynchronizationChannel> getUMLSynchronizationChannels(){return null;}

	/**
	 * @generated
	 */
	public UMLInterfaceStatechart getUMLInterfaceStatechart(){return null;}

	/**
	 * @generated
	 */
	public Component getComponent(){return null;}

	/**
	 * @generated
	 */
	public EClass getEClass() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
    * User defined.
    */

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private int rtscId;
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   private static int counter = 0;

//   private FProject project; 
   // an inner UMLRealtimeStatechart is not associated with an UMLClass
   /**
    * Constructor for class UMLRealtimeStatechart
    */
//   protected UMLRealtimeStatechartImpl(FProject project, boolean persistent)
//   {
//      super(project, persistent);
//      
//      isTopStatechart = false;
//
//      rtscId = counter;
//      counter++;
//   }
   /**
    * Get the highestParentStatechart attribute of the UMLRealtimeStatechart object
    * 
    * @return The highestParentStatechart value
    */
   public UMLRealtimeStatechart getHighestParentStatechart()
   {
      UMLRealtimeStatechart highestParentStatechart = this;
      UMLRealtimeStatechart oldStatechart = null;

      while ( (highestParentStatechart != null)
         &&  (highestParentStatechart != oldStatechart))
      {
         oldStatechart = highestParentStatechart;
         if (highestParentStatechart.getUMLComplexRealtimeState() != null)
         {
            highestParentStatechart =
               highestParentStatechart.getUMLComplexRealtimeState()
               .getUMLRealtimeStatechart();
         }
      }
      highestParentStatechart = oldStatechart;

      return highestParentStatechart;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    * 
    * @param name No description provided
    * @return No description provided
    */
   public boolean hasInUMLSynchronizationChannel (String name)
   {
//      Iterator<UMLSynchronizationChannelImpl> iter = iteratorOfUMLSynchronizationChannel();
//      while (iter.hasNext())
//      {
//         UMLSynchronizationChannelImpl channel = iter.next();
//         
//         if (channel.getName().equals (name))
//         {
//            return true;
//         }
//      }
//      return false;
      return false;
   }


//
//
//   /**
//    * No comment provided by developer, please add a comment to improve documentation.
//    * 
//    * @param project No description provided
//    * @param clazz No description provided
//    * @param eventName No description provided
//    */
//   private void createSignal (UMLProject project, UMLClass clazz, String eventName)
//   {
//      UMLMethod method = project.getFromFactories(UMLMethod.class).create(true);
//      method.setName(eventName);
//      method.setStatic(false);
//      method.setVisibility(UMLMethod.PUBLIC);
//      method.setResultType(project.getFromFactories(UMLBaseType.class).getFromProducts(FBaseType.VOID));
//
//      method.addToStereotypes(project.getFromFactories(UMLStereotype.class).getFromProducts(FStereotype.SIGNAL));
//      method.setDisplayLevel (FDeclaration.DESIGN_DISPLAY_LEVEL);
//      
//      
//      UMLMethod oldMethod = clazz.getFromMethods (method.getFullMethodName());
//      if (oldMethod != null)
//      {
//         oldMethod.removeYou();
//      }
//      clazz.addToMethods (method);
//      
//   }
//
//
//
   /**
    * This method is used to obtain a list of UMLSynchronizationChannels. In spite of
    * iteratorOfUMLSynchronizationChannel() each name of the channel is just once inside this
    * iterator.
    * 
    * @return No description provided
    * @deprecated use {@link #mapOfAllSyncChannels(boolean, boolean)} instead
    */
   public Iterator listOfChannels()
   {
	   return null;
//      Set set = new HashSet();
//      Iterator<UMLSynchronizationChannelImpl> iter = iteratorOfUMLSynchronizationChannel();
//      while (iter.hasNext())
//      {
//         UMLSynchronizationChannelImpl channel = iter.next();
//         Iterator iter2 = set.iterator();
//         boolean alreadyInSet = false;
//         while (iter2.hasNext())
//         {
//            UMLSynchronizationChannelImpl channel2 =
//               (UMLSynchronizationChannelImpl) iter2.next();
//            if (channel.getName().equals (channel2.getName()))
//            {
//               alreadyInSet = true;
//               break;
//            }
//         }
//         if (!alreadyInSet)
//         {
//            set.add (channel);
//         }
//      }
//      return set.iterator();
   }


   /**
    * @return all channels in this statechart and all sub-statecharts mapped by their name
    */
   public Map<String,UMLSynchronizationChannelImpl> mapOfAllSyncChannels()
   {
//      return mapOfAllSyncChannels(true, true);
      return null;
   }


   /**
    * @param sender flag to add sender-channels
    * @param receiver flag to add receiver-channels
    * @return all channels of specified type in this statechart and all sub-statecharts mapped by their name
    */
   public Map<String,UMLSynchronizationChannelImpl> mapOfAllSyncChannels(boolean sender, boolean receiver)
   {
//      return mapOfAllSyncChannels(sender, receiver, null);
      return null;
   }


   /**
    * @param sender flag to add sender-channels
    * @param receiver flag to add receiver-channels
    * @param exclude statechart which channels should be excluded (channels from its sub-statecharts are not excluded)
    * @return all channels of specified type in this statechart and all sub-statecharts mapped by their name
    */
   public Map<String,UMLSynchronizationChannelImpl> mapOfAllSyncChannels(boolean sender, boolean receiver, UMLRealtimeStatechart exclude)
   {
//      if (!sender && !receiver)
//      {
//         return Collections.emptyMap();
//      }
//      Map<String, UMLSynchronizationChannelImpl> map = Collections.emptyMap();
//      // add channels from our transitions (only if we are not the statechart to exclude)
//      if (uMLRealtimeTransition != null && !this.equals(exclude))
//      {
//         map = mapOfSyncChannels(sender, receiver);
//      }
//      // >>> add channels from sub-statecharts <<<
//      if (uMLRealtimeState == null)
//      {
//         return map;
//      }
//      // map may be an EmptyMap, which does not allow adding new elements, so create a new map in this case
//      if (Collections.EMPTY_MAP.equals(map))
//      {
//         map = new HashMap<String, UMLSynchronizationChannelImpl>();
//      }
//      for (UMLRealtimeState state : uMLRealtimeState)
//      {
//         if (!(state instanceof UMLComplexRealtimeState))
//         {
//            continue;
//         }
//         // recursivly add channels of sub-statecharts
//         UMLComplexRealtimeState cState = (UMLComplexRealtimeState) state;
//         for (Iterator<UMLRealtimeStatechart> it = cState.iteratorOfUMLRealtimeStatechart(); it.hasNext();)
//         {
//            map.putAll(it.next().mapOfAllSyncChannels(sender, receiver, exclude));
//         }
//      }
//      return map;
      return null;
   }
//
//
//   /**
//    * @return all channels in this statechart mapped by their name
//    */
   public Map<String,UMLSynchronizationChannelImpl> mapOfSyncChannels()
   {
//      return mapOfSyncChannels(true, true);
      return null;
   }
//
//
//   /**
//    * @param sender flag to add sender-channels
//    * @param receiver flag to add receiver-channels
//    * @return all channels of specified type in this statechart mapped by their name
//    */
   public Map<String,UMLSynchronizationChannelImpl> mapOfSyncChannels(boolean sender, boolean receiver)
   {
//      if (!sender && !receiver || uMLRealtimeTransition == null)
//      {
//         return Collections.emptyMap();
//      }
//      // add channels from our transitions
//      Map<String, UMLSynchronizationChannelImpl> map = new HashMap<String, UMLSynchronizationChannelImpl>();
//      for (UMLRealtimeTransitionImpl trans : uMLRealtimeTransition)
//      {
//         UMLSynchronizationChannelImpl chan = trans.getSenderSynchronizationChannel();
//         if (sender && chan != null)
//         {
//            map.put(chan.getName(), chan);
//         }
//         chan = trans.getReceiverSynchronizationChannel();
//         if (receiver && chan != null)
//         {
//            map.put(chan.getName(), chan);
//         }
//      }
//      return map;
      return null;
   }


   /**
    * The next time, when calculatePeriodForMainThread() is called, message dialog will occur,
    * notifying about the result.
    */
   private transient boolean firstCalculation = true;
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   public void enablePeriodNotification()
   {
      firstCalculation = true;
   }
   

   /**
    * Default value for Fujaba-Standalone (relative to the Fujaba-dir).
    * In Fujaba4Eclipse this path gets overridden at startup!
    */
   public static String WCET_DOCUMENT_PATH = "plugins"
      + System.getProperty("file.separator")
      + "RealtimeStatechart"
      + System.getProperty("file.separator")
      + UMLRealtimeStatechart.WCET_DOCUMENT_PLUGIN_RELATIVE_PATH;
   
   
   /**
    * Returns the actual path to the wcet-document, if the wcetDocument attribute is 
    * unset (null) a path the default document ({@link #WCET_DOCUMENT_PATH})
    * is returned.
    * To be backward compatible: If old default-values are set, the new
    * default-path is returned.
    * @return
    */
   public String getWcetDocumentPath()
   {
	   return null;
//      // use default value if unset
//      if (wcetDocument == null)
//      {
//         return WCET_DOCUMENT_PATH;
//      }
//      // to be backward compatible: test for old default-values and return new default-value instead
//      if ("".equals(wcetDocument)
//            || "wcet.xml".equals(wcetDocument)
//            || "plugins/RealtimeStatechart/wcet.xml".equalsIgnoreCase(wcetDocument))
//      {
//         return WCET_DOCUMENT_PATH;
//      }
//      // use user-specified path
//      return wcetDocument;
   }
   /**
    * <pre>
    * creates a new UMLRealtimeTransition and adds it and it's source and target States
    * to this UMLTimedSattechart by calling the methods this.addToUMLRealtimeTransition and this.addToUMLRealtimeState
    * </pre>
    * 
    * @param name No description provided
    * @param source No description provided
    * @param target No description provided
    * @return No description provided
    */
//   public UMLRealtimeTransitionImpl createNewUMLRealtimeTransition (
//                                                                String name,
//                                                                UMLRealtimeState source,
//                                                                UMLRealtimeState target)
//   {
//      return createNewUMLRealtimeTransition (name, source, target, null);
//   }


   /**
    * <pre>
    * creates a new UMLRealtimeTransition and adds it and it's source and target States
    * to this UMLTimedSattechart by calling the methods this.addToUMLRealtimeTransition and this.addToUMLRealtimeState
    * </pre>
    * 
    * @param name No description provided
    * @param source No description provided
    * @param target No description provided
    * @param action No description provided
    * @return No description provided
    */

//   public UMLRealtimeTransitionImpl createNewUMLRealtimeTransition (
//                                                                String name,
//                                                                UMLRealtimeState source,
//                                                                UMLRealtimeState target,
//                                                                UMLRealtimeAction action)
//   {
//      return createNewUMLRealtimeTransition (
//         name,
//         source,
//         target,
//         null,
//         null,
//         null);
//   }


   /**
    * <pre>
    * creates a new UMLRealtimeTransition and adds it and it's source and target States
    * to this UMLTimedSattechart by calling the methods this.addToUMLRealtimeTransition and this.addToUMLRealtimeState
    * </pre>
    * 
    * @param name No description provided
    * @param source No description provided
    * @param target No description provided
    * @param event No description provided
    * @param guard No description provided
    * @param action No description provided
    * @return No description provided
    */
//   public UMLRealtimeTransitionImpl createNewUMLRealtimeTransition (
//                                                                String name,
//                                                                UMLRealtimeState source,
//                                                                UMLRealtimeState target,
//                                                                String eventName,
//                                                                String guard,
//                                                                UMLRealtimeAction action)
//   {
//      UMLRealtimeTransitionImpl transition = this.getProject().getFromFactories(UMLRealtimeTransitionImpl.class).create(true);
//      transition.setName(name);
//      transition.setSourceConnector(source);
//      transition.setTargetConnector(target);
//
//      if (!source.equals(getUMLRealtimeStartState()) && eventName != null)
//      {
//         UMLRealtimeEvent event = getProject().createFromFactories(UMLRealtimeEvent.class);
//         event.setName(eventName);
//     	   transition.addToUMLRealtimeTriggerEvents(event);
//      }
//      
//      transition.setGuard(guard);
//      transition.setUMLRealtimeAction(action);
//      addToUMLRealtimeState (source);
//      if (target.getUMLRealtimeStatechart() == null)
//      {
//         addToUMLRealtimeState (target);
//      }
//      addToUMLRealtimeTransition (transition);
//      return transition;
//   }


   /**
    * Returns all UMLRealtimeState objects associated with this statechart and all of its sub
    * statecharts.
    * 
    * @return the iterator of the states
    */
//   public Iterator<UMLRealtimeState> iteratorOfAllUMLRealtimeStates()
//   {
//      return iteratorOfAllUMLRealtimeStates (true);
//   }


   /**
    * @param inclusiveStartStates No description provided
    * @return No description provided
    * @returns an Iterator of all UMLRealtimeStates of this UMLRealtimeStatechart, in consideration
    *          of hierarchy and concurrency.
    */
//   public Iterator<UMLRealtimeState> iteratorOfAllUMLRealtimeStates (boolean inclusiveStartStates)
//   {
//      Set<UMLRealtimeState> set = new FHashSet<UMLRealtimeState>();
//      addAllUMLRealtimeStates (set, inclusiveStartStates);
//      return set.iterator();
//   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    * 
    * @return No description provided
    */
//   public Iterator<UMLComplexRealtimeState> iteratorOfComplexUMLRealtimeStates()
//   {
//      Set<UMLComplexRealtimeState> set = new FHashSet<UMLComplexRealtimeState>();
//      addComplexUMLRealtimeStates (set);
//      return set.iterator();
//   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    * 
    * @return No description provided
    */
   public Iterator<UMLRealtimeStatechart> iteratorOfAllSubRealtimeStatecharts()
   {
	   return null;
//      Set<UMLRealtimeStatechart> set = new HashSet<UMLRealtimeStatechart>();
//      set.add(this);
//
//      for (Iterator<UMLRealtimeState> it = iteratorOfAllUMLRealtimeStates(); it.hasNext();)
//      {
//         UMLRealtimeState state = (UMLRealtimeState) it.next();
//         if (state instanceof UMLComplexRealtimeState)
//         {
//            UMLComplexRealtimeState cs = (UMLComplexRealtimeState) state;
//            for (Iterator<UMLRealtimeStatechart> it2 = cs.iteratorOfUMLRealtimeStatechart(); it2.hasNext();)
//            {
//               set.add(it2.next());
//            }
//         }
//      }
//      return set.iterator();
   }


   /**
    * adds all UMLRealtimeStates of this UMLRealtimeStatechart to set, in consideration of hierarchy
    * and concurrency.
    * 
    * @param set The object added.
    * @param inclusiveStartStates The object added.
    */

   public void addAllUMLRealtimeStates (
                                         Set<UMLRealtimeState> set,
                                         boolean inclusiveStartStates)
   {
//      Iterator<UMLRealtimeState> iter = iteratorOfUMLRealtimeState();
//      while (iter.hasNext())
//      {
//         UMLRealtimeState state = iter.next();
//         if ( (inclusiveStartStates)
//            ||  (! (state instanceof UMLRealtimeStartState)))
//         {
//            set.add (state);
//         }
//         if (state instanceof UMLComplexRealtimeState)
//         {
//            UMLComplexRealtimeState complexState =
//               (UMLComplexRealtimeState) state;
//            Iterator<UMLRealtimeStatechart> iter2 = complexState.iteratorOfUMLRealtimeStatechart();
//            while (iter2.hasNext())
//            {
//               UMLRealtimeStatechart innerStatechart =
//                  (UMLRealtimeStatechart) iter2.next();
//               innerStatechart.addAllUMLRealtimeStates (
//                  set,
//                  inclusiveStartStates);
//            }
//         }
//      }
   }


   /**
    * Access method for an one to n association.
    * 
    * @param set The object added.
    */
   public void addComplexUMLRealtimeStates (Set<UMLComplexRealtimeState> set)
   {
//      for (Iterator<UMLRealtimeState> it = iteratorOfUMLRealtimeState(); it.hasNext();)
//      {
//         UMLRealtimeState state = it.next();
//         
//         if (state instanceof UMLComplexRealtimeState)
//         {
//            UMLComplexRealtimeState complexState = (UMLComplexRealtimeState) state;
//            set.add (complexState);
//            
//            for (Iterator<UMLRealtimeStatechart> it2 = complexState.iteratorOfUMLRealtimeStatechart(); it2.hasNext();)
//            {
//               UMLRealtimeStatechart innerStatechart = it2.next();
//               innerStatechart.addComplexUMLRealtimeStates (set);
//            }
//         }
//      }
   }
//
//
//   /**
//    * Returns all UMLRealtimeTransition objects associated with this statechart and all of its sub
//    * statecharts.
//    * 
//    * @return the iterator of the transitions
//    */
//   public Iterator<UMLRealtimeTransitionImpl> iteratorOfAllUMLRealtimeTransitions()
//   {
//      return iteratorOfAllUMLRealtimeTransitions (true);
//   }
//
//
//   /**
//    * @param inclusiveInitTrans No description provided
//    * @return No description provided
//    * @returns an Iterator of all UMLRealtimeTransitions of this UMLRealtimeStatechart, in
//    *          consideration of hierarchy and concurrency.
//    */
//   public Iterator<UMLRealtimeTransitionImpl> iteratorOfAllUMLRealtimeTransitions (boolean inclusiveInitTrans)
//   {
//      Set<UMLRealtimeTransitionImpl> set = new FHashSet<UMLRealtimeTransitionImpl>();
//      addAllUMLRealtimeTransitions (set, inclusiveInitTrans);
//      return set.iterator();
//   }
//
//
//   /**
//    * adds all UMLRealtimeTransitions of this UMLRealtimeStatechart to set, in consideration of
//    * hierarchy and concurrency.
//    * 
//    * @param set The object added.
//    * @param inclusiveInitTrans The object added.
//    */
//
   private void addAllUMLRealtimeTransitions (
                                              Set set,
                                              boolean inclusiveInitTrans)
   {
//      Iterator iter = iteratorOfUMLRealtimeTransition();
//      while (iter.hasNext())
//      {
//         UMLRealtimeTransitionImpl transition =
//            (UMLRealtimeTransitionImpl) iter.next();
//         UMLRealtimeState source =
//            (UMLRealtimeState) transition.getSourceConnector();
//         if ( (inclusiveInitTrans)
//            ||  (! (source instanceof UMLRealtimeStartState)))
//         {
//            set.add (transition);
//         }
//      }
//
//      iter = iteratorOfUMLRealtimeState();
//      while (iter.hasNext())
//      {
//         UMLRealtimeState state = (UMLRealtimeState) iter.next();
//         if (state instanceof UMLComplexRealtimeState)
//         {
//            UMLComplexRealtimeState complexState =
//               (UMLComplexRealtimeState) state;
//            Iterator iter2 = complexState.iteratorOfUMLRealtimeStatechart();
//            while (iter2.hasNext())
//            {
//               UMLRealtimeStatechart innerStatechart =
//                  (UMLRealtimeStatechart) iter2.next();
//               innerStatechart.addAllUMLRealtimeTransitions (
//                  set,
//                  inclusiveInitTrans);
//            }
//         }
//      }
   }


//   /**
//    * Returns all UMLClock objects associated with this statechart and all of its sub statecharts.
//    * 
//    * @return an Iterator of all UMLClocks of this UMLRealtimeStatechart, in consideration of
//    *         hierarchy and concurrency.
//    */
//   public Iterator<UMLClock> iteratorOfAllUMLClocks()
//   {
//      return iteratorOfAllUMLClocks(false);
//   }


   public Iterator<UMLClock> iteratorOfAllUMLClocks(boolean excludeNoClock)
   {
	   return null;
//      Set<UMLClock> set = new FHashSet<UMLClock>();
//      addAllUMLClocks (set, excludeNoClock);
//      return set.iterator();
   }


   /**
    * adds all UMLClocks of this UMLRealtimeStatechart to set, in consideration of hierarchy and
    * concurrency.
    * 
    * @param set The object added.
    */
   public void addAllUMLClocks (Set<UMLClock> set, boolean excludeNoClock)
   {
//      for (Iterator<UMLClock> it = iteratorOfUMLClock(); it.hasNext();)
//      {
//         set.add(it.next());
//      }
//      if (excludeNoClock && uMLClock!=null && uMLClock.containsKey(UMLClock.NO_CLOCK))
//      {
//         set.remove(uMLClock.get(UMLClock.NO_CLOCK));
//      }
//
//      if (uMLRealtimeState == null)
//      {
//         return;
//      }
//      for (UMLRealtimeState state : uMLRealtimeState)
//      {
//         if (!(state instanceof UMLComplexRealtimeState))
//         {
//            continue;
//         }
//         UMLComplexRealtimeState complexState = (UMLComplexRealtimeState) state;
//         for (Iterator<UMLRealtimeStatechart> it = complexState.iteratorOfUMLRealtimeStatechart(); it.hasNext();)
//         {
//            it.next().addAllUMLClocks (set, excludeNoClock);
//         }
//      }
   }


   /*
    * After helper methods for associations.
    */


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    * 
    * @return No description provided
    */
   public String toString()
   {
	   return null;
//      if (getUMLClass() == null)
//      {
//         return getName();
//      }
//      return getUMLClass().getName();
   }


   /**
    * Get the a clone of the current UMLRealtimeStatechart object
    * 
    * @param rtsc No description provided
    * @param newrtsc No description provided
    * @return The topStatechart value
    */
   public Object clone (UMLRealtimeStatechart rtsc, UMLRealtimeStatechart newrtsc)
   {
	   return null;
//	  FProject project = rtsc.getProject();
//	   
//      newrtsc.SetRTSCRefinement (this.isRefinement());
//      newrtsc.setScheduleDocument (this.getScheduleDocument());
//      newrtsc.setSecurityLevel (this.getSecurityLevel());
//      newrtsc.setUtilisation (this.getUtilisation());
//      newrtsc.setName (this.getName());
//      newrtsc.setWcetDocument (this.getWcetDocument());
//
//      // clone umlClass
//      if (this.getUMLClass() != null)
//      {
//         UMLClass umlClass = this.getUMLClass();
//         int hashCode = umlClass.hashCode();
//         UMLClass clonedUMLClass;
//         if (!this.hasInCloneObservationMap(hashCode))
//         {
//            clonedUMLClass = project.createFromFactories(UMLClass.class, true);
//            addToCloneObservationMap(hashCode, clonedUMLClass);
//            clonedUMLClass.setName(umlClass.getName());
//            clonedUMLClass.setDeclaredInPackage(umlClass.getDeclaredInPackage());
//            // TODO: what else should be set?
//         }
//         else
//         {
//            clonedUMLClass = (UMLClass) getFromCloneObservationMap(hashCode);
//         }
//         newrtsc.setUMLClass(clonedUMLClass);
//      }
//      
//      // clone provided and required interface.
//      Iterator providedMsgIFacesIter = this.iteratorOfProvidedInterface();
//      while (providedMsgIFacesIter.hasNext()) {
//         MessageInterface msgIFace = (MessageInterface) providedMsgIFacesIter.next();
//         newrtsc.addToProvidedInterface(msgIFace.getName(), msgIFace);
//      }
//      Iterator requiredMsgIFacesIter = this.iteratorOfRequiredInterface();
//      while (requiredMsgIFacesIter.hasNext()) {
//         MessageInterface msgIFace = (MessageInterface) requiredMsgIFacesIter.next();
//         newrtsc.addToRequiredInterface(msgIFace.getName(), msgIFace);
//      }
//
//      // clone startstate
//      if (this.getUMLRealtimeStartState() != null)
//      {
//         if (!this.hasInCloneObservationMap (this.getUMLRealtimeStartState().hashCode()))
//         {
//            UMLRealtimeStartState tmpStartState = (UMLRealtimeStartState) addToCloneObservationMap (this.getUMLRealtimeStartState().hashCode(), project.getFromFactories(UMLRealtimeStartState.class).create(true));
//            newrtsc.setUMLRealtimeStartState ((UMLRealtimeStartState) this.getUMLRealtimeStartState().clone (rtsc, tmpStartState));
//         }
//         else
//         {
//            newrtsc.setUMLRealtimeStartState ((UMLRealtimeStartState) rtsc.getFromCloneObservationMap (this.getUMLRealtimeStartState().hashCode()));
//         }
//      }
//
//      // clone complexstate
//      if (this.getUMLComplexRealtimeState() != null)
//      {
//         if (!this.hasInCloneObservationMap (this.getUMLComplexRealtimeState().hashCode()))
//         {
//            UMLComplexRealtimeState tmpComplexState = (UMLComplexRealtimeState) addToCloneObservationMap (this.getUMLComplexRealtimeState().hashCode(), project.getFromFactories(UMLComplexRealtimeState.class).create(true));
//            newrtsc.setUMLComplexRealtimeState ((UMLComplexRealtimeState) this.getUMLComplexRealtimeState().clone (rtsc, tmpComplexState));
//         }
//         else
//         {
//            newrtsc.setUMLComplexRealtimeState ((UMLComplexRealtimeState) rtsc.getFromCloneObservationMap (this.getUMLComplexRealtimeState().hashCode()));
//         }
//      }
//
//      // clone transitions
//      Iterator iter = this.iteratorOfUMLRealtimeTransition();
//      while (iter.hasNext())
//      {
//         UMLRealtimeTransitionImpl oldTransition = (UMLRealtimeTransitionImpl) iter.next();
//         if (!this.hasInCloneObservationMap (oldTransition.hashCode()))
//         {
//            UMLRealtimeTransitionImpl tmpTransition = (UMLRealtimeTransitionImpl) addToCloneObservationMap (oldTransition.hashCode(), project.getFromFactories(UMLRealtimeTransitionImpl.class).create(true));
//            newrtsc.addToUMLRealtimeTransition ((UMLRealtimeTransitionImpl) oldTransition.clone (rtsc, tmpTransition));
//         }
//         else
//         {
//            newrtsc.addToUMLRealtimeTransition ((UMLRealtimeTransitionImpl) rtsc.getFromCloneObservationMap (oldTransition.hashCode()));
//         }
//      }
//
//      // clone clocks
//      iter = this.iteratorOfUMLClock();
//      while (iter.hasNext())
//      {
//         UMLClock oldClock = (UMLClock) iter.next();
//         if (!this.hasInCloneObservationMap (oldClock.hashCode()))
//         {
//            UMLClock tmpClock = (UMLClock) addToCloneObservationMap (oldClock.hashCode(), project.getFromFactories(UMLClock.class).create(true));
//            newrtsc.addToUMLClock ((UMLClock) oldClock.clone (rtsc, tmpClock));
//         }
//         else
//         {
//            newrtsc.addToUMLClock ((UMLClock) rtsc.getFromCloneObservationMap (oldClock.hashCode()));
//         }
//      }
//
//      return newrtsc;
   }


}

/*
 * $Log$
 * Revision 1.84.2.1  2009/01/07 20:33:34  alhawash
 * adopt the maps "required- and provided-Interfaces" to generics
 *
 * Revision 1.88  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.87  2009/02/13 10:29:36  chrisheinzemann
 * Natural Numbers are created using the factories, now
 * this removes many exceptions and warning on creation and serialization of the objects and while setting the attributes
 *
 * Revision 1.86  2009/02/04 17:33:34  cytom
 * fixed unneeded creation of event "!!! no_message_assigned !!!" + fixed equality test of InitialState (don't test by name!)
 *
 * Revision 1.85  2009/01/26 16:50:10  cytom
 * fixed erros with wcet-document path:
 * In fujaba-standalone it pointed normally to "plugins/RealtimeStatechart/wcet.xml". In F4E the path to wcet.xml cant specified relative without knowledge of eclipse-details and it may be inside a jar-archive so the path had to be changed at startup.
 * Badly the absolut path was saved to the model, this is fixed now. Only when the user changes the path it get saved to the model, in other cases the default-path to wcet.xml is used.
 *
 * Revision 1.84  2008/12/09 11:28:03  cytom
 * cleanups + removed warnings
 *
 * Revision 1.83  2008/08/20 12:49:23  crowdy
 * corrected typo
 *
 * Revision 1.82  2008/08/05 14:45:59  crowdy
 * add getter methods for interfaces hash maps to get key from a value
 *
 * Revision 1.81  2008/07/01 13:39:20  cytom
 * fixed NPE when createSignal sets result type "Void"
 *
 * Revision 1.80  2008/06/26 12:13:44  crowdy
 * don't add an event to a transition from the initial state outgoing because not needed
 *
 * Revision 1.79  2008/06/22 20:08:33  crowdy
 * set an initial name for an event if a statechart is created (with states, transitions and events) automatically
 *
 * Revision 1.78  2008/06/22 15:31:38  crowdy
 * add missing class "UMLRealtimeEventInstanceOfMessageType" and changes for the new messageTypes
 * previous changes see logs
 *
 * Revision 1.77.2.3  2008/06/05 13:46:45  crowdy
 * add providedInterface- and requiredInterface-HashSet, now rt-statecharts know the interfaces assigned to the component they belongs
 *
 * Revision 1.77.2.2  2008/05/24 11:21:00  crowdy
 * avoid possible NullPointerException if trying to set the name ""
 *
 * Revision 1.77.2.1  2008/05/21 19:27:56  crowdy
 * avoid the name "" of the statechart
 * fix bug: remove the transition from a (start) state complete, so the diagram canvas of a realtime statechart is also deleted after delete the realtime statechart in the project
 *
 * Revision 1.77  2007/10/09 12:58:07  mgw
 * changed clone behavior of UMLRealtimeStatechart. Now it clones the UMLClass too, instead of simply setting the class of the old rtsc on the new/cloned one, which caused problems.
 *
 * Revision 1.76  2007/06/15 09:14:27  mtt
 * fixed handling of clocks during loading of statecharts
 * no new NO_CLOCKS are created during loading
 *
 * Revision 1.75  2007/04/03 11:52:53  aseibel
 * FDuplicatedHashMap -> FPropDuplicatedHashMap for UMLClocks
 *
 * Revision 1.74  2007/02/14 14:38:10  mtt
 * new statechart put into cloningMap
 *
 * Revision 1.73  2007/02/14 13:10:30  mtt
 * forbid cloning a statechart into itself
 *
 * Revision 1.72  2007/01/03 20:41:56  alexfupp
 * removed constraints because they are not used
 *
 * Revision 1.71  2006/12/05 15:38:55  aseibel
 * removed debug outs
 *
 * Revision 1.70  2006/12/05 15:36:29  aseibel
 * divided edit part of rtsc's into root and sub rtsc edit parts
 *
 * Revision 1.69  2006/10/06 13:34:33  mtt
 * removed implementation of FDeclaration
 *
 * Revision 1.68  2006/09/22 20:56:11  alexfupp
 * Fixed some Null-Pointer-Exceptions
 *
 * Revision 1.67  2006/08/23 20:38:55  alexfupp
 * changed to use factories (Fujaba5)
 * and fix of a bug created in last commit
 *
 * Revision 1.66  2006/08/18 20:35:37  alexfupp
 * -changed to use factories
 * -fixes for errors caused by switch to fujaba5
 * Revision 1.65 2006/08/16 22:01:01 alexfupp more changes to
 * use factories
 * 
 * Revision 1.64 2006/08/16 21:06:16 alexfupp changed to use factories and a few fixes for errors
 * caused by switch to fujaba5
 * 
 * Revision 1.63 2006/08/03 11:51:48 mtt more fixes for factories
 * 
 * Revision 1.62 2006/07/20 21:54:02 mtt next bunch of factories
 * 
 * Revision 1.61 2006/07/20 20:03:36 mtt first bunch of factories
 * 
 * Revision 1.60 2006/07/19 19:48:00 mtt changed refreshDisplay()-call to FrameMain.get()
 * 
 * Revision 1.59 2006/07/19 19:10:22 mtt removed extension to class UMLAction since this class is
 * not part of Fujaba 5 anymore
 * 
 * Revision 1.58 2006/07/19 18:46:03 mtt changed import declarations to Fujaba 5 package structure
 * 
 * Revision 1.57 2006/02/15 13:21:05 mtt removed reference to FrameMain
 * 
 */
