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

import java.util.Vector;


/**
 * UMLClass: 'UMLRealtimeTransition'.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3594 $
 * @created   $Date: 2009-04-03 14:08:07 +0200 (Fr, 03 Apr 2009) $
 * 
 * @model
 */
public interface UMLRealtimeTransition // extends UMLRealtimeStatechartVisitorElement // extends UMLConnection
{
	/**
	 * @model
	 */
	public int getSynchronizationType();

	/**
	 * @model
	 */
	public boolean getParameterized();

	/**
	 * @model
	 */
	public boolean getUrgent();

	/**
	 * @model
	 */
	public String getGuard();

	/**
	 * @model
	 */
	public Vector getUMLRealtimeTransitionMappingVector();

	/**
	 * @model
	 */
	public int getPriority();

	/**
	 * @model
	 */
	public String getName();

	/**
	 * @model
	 */
	public UMLSynchronizationChannel getUMLSynchronizationChannel();

	/**
	 * @model
	 */
	public UMLSynchronizationChannel getSenderSynchronizationChannel();

	/**
	 * @model
	 */
	public UMLSynchronizationChannel getReceiverSynchronizationChannel();

	/**
	 * @model
	 */
	public java.util.List<UMLClock> getUMLClocks();

	/**
	 * @model
	 */
	public UMLRealtimeAction getUMLRealtimeAction();

	/**
	 * @model
	 */
	public UMLRealtimeState getTargetUMLRealtimeState();

	/**
	 * @model
	 */
	public UMLRealtimeState getSourceUMLRealtimeState();

	/**
	 * @model
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart();

	/**
	 * @model
	 */
	public java.util.List<UMLRealtimeArgument> getAssignmentsSets();

//	/**
//	 * @model
//	 */
//	public java.util.List<UMLDiagramItem> getConditionsSets();

	/**
	 * @model
	 */
	public java.util.List<UMLClockResetAtom> getUMLClockResetAtoms();

	/**
	 * @model
	 */
	public UMLRealtimeFlatSwitching getUMLRealtimeFlatSwitching();

	/**
	 * @model
	 */
	public UMLRealtimeFadingFunction getUMLRealtimeFadingFunction();

	/**
	 * @model
	 */
	public java.util.List<UMLRealtimeInternalEvent> getUMLRealtimeInternalEventss();

	/**
	 * @model
	 */
	public java.util.List<UMLRealtimeEvent> getUMLRealtimeTriggerEventss();

	/**
	 * @model
	 */
	public java.util.List<UMLRealtimeEvent> getRaisedUMLRealtimeEvents();

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
