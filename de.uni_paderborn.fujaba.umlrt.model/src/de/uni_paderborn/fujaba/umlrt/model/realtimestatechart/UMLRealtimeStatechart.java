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
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;


/**
 * UMLClass: 'UMLRealtimeStatechart'.
 * 
 * @author $Author: cytom $
 * @version $Revision: 3572 $
 * @created $Date: 2009-03-24 16:53:02 +0100 (Di, 24 Mrz 2009) $
 * 
 * @model
 */
public interface UMLRealtimeStatechart // extends UMLRealtimeStatechartVisitorElement// extends UMLDiagram
    
{
	/**
	 * @model
	 */
	public String getName();

	/**
	 * @model
	 */
	public int getEventQueueSize();

	// Transient field in class.
	/**
	 * @model
	 */
	public boolean getFirstCalculation();

	/**
	 * @model
	 */
	public boolean getTopStatechart();

	/**
	 * @model
	 */
	public String getWcetDocument();

	/**
	 * Default value should be "UMLRealtimeStatechart.CONFORM".
	 * 
	 * @model default="0"
	 */
	public int getSecurityLevel();
	/**
	 * @model
	 */
	public Map getSystemWcetMap();

	/**
	 * @model
	 */
	public double getUtilisation();

	/**
	 * @model default="\"schedule.xml\""
	 */
	public String getScheduleDocument();

	/**
	 * @model
	 */
	public UMLRealtimeStartState getUMLRealtimeStartState();

	/**
	 * @model
	 */
	public UMLComplexRealtimeState getUMLComplexRealtimeState();

	/**
	 * @model
	 */
	public java.util.List<UMLRealtimeTransition> getUMLRealtimeTransitions();

	/**
	 * @model
	 */
	public java.util.List<UMLRealtimeState> getUMLRealtimeStates();

	/**
	 * @model
	 */
	public java.util.List<UMLSynchronizationChannel> getUMLSynchronizationChannels();

	/**
	 * @model
	 */
	public EClass getEClass(); // UMLClass getUMLClass();

	/**
	 * @model
	 */
	public UMLInterfaceStatechart getUMLInterfaceStatechart();

	/**
	 * @model
	 */
	public Component getComponent();


	/**
	 * No comment provided by developer, please add a comment to ensure improve documentation.
	 */
	public final static int CONFORM = 0;

	/**
	 * No comment provided by developer, please add a comment to ensure improve documentation.
	 */
	public final static int INCONSISTENT = 1;

	/**
	 * No comment provided by developer, please add a comment to ensure improve documentation.
	 */
	public final static int INSECURE = 2;

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    */
   public final static String TRANSITION_NAME_PREFIX = "F_TRANSITION_";

   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static long INFINITY = Long.MAX_VALUE;

   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static String INTEGER_ASSIGNMENT = "INTEGER_ASSIGNMENT";
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static String LONG_INTEGER_ASSIGNMENT =
      "LONG_INTEGER_ASSIGNMENT";
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static String INTEGER_ADDITION = "INTEGER_ADDITION";
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static String INTEGER_COPARISON = "INTEGER_COMPARISON";
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static String GET_METHOD_CALL = "GET_METHOD_CALL";
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static String SET_OR_ADD_METHOD_CALL =
      "SET_OR_ADD_METHOD_CALL";
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static String OBJECT_ASSIGNMENT = "OBJECT_ASSIGNMENT";
   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   public final static String TYPE_CAST = "TYPE_CAST";

   /**
    * Plugin-relative path to RelatimeStatechart's wcet-document
    */
   public static final String WCET_DOCUMENT_PLUGIN_RELATIVE_PATH = "wcet.xml";
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
