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

import org.eclipse.emf.ecore.EOperation;


/**
 * <pre>
 *                   n                events                0..1
 * UMLRealtimeEvent --------------------------------------------- UMLRealtimeTransition
 *                   uMLRealtimeEvent      uMLRealtimeTransition
 *                   
 *                   n              raisedEvents              0..1
 * UMLRealtimeEvent ----------------------------------------------- UMLRealtimeTransition
 *                   uMLRealtimeEvent1      uMLRealtimeTransition1
 *                   
 *                   *                           has                           1 
 * UMLRealtimeEvent ------------------------------------------------------------- UMLRealtimeEventInstanceOfMessageType
 *                   uMLRealtimeEvent      uMLRealtimeEventInstanceOfMessageType
 *                    
 * </pre>
 *
 * @author    $Author: alhawash $
 * @version   $Revision: 3533 $ $Date: 2009-03-17 17:54:39 +0100 (Di, 17 Mrz 2009) $
 * 
 * @model
 */
public interface UMLRealtimeEvent extends AbstractUMLRealtimeEvent
{
	/**
	 * @model
	 */
	public UMLRealtimeTransition getTriggeredUMLRealtimeTransition();

	/**
	 * @model
	 */
	public UMLRealtimeTransition getRaisedUMLRealtimeTransition();

	/**
	 * @model
	 */
	public EOperation getMessageType(); // MessageType getMessageType();
}

/*
 * $Log$
 * Revision 1.10.2.2  2009/01/07 19:17:41  alhawash
 * "!!! no_message_assigned !!!" to "no_message_assigned"
 *
 * Revision 1.10.2.1  2008/12/19 21:08:11  alhawash
 * adding the class "AbstractUMLRealtimeEvent" as super-class for UMLRealtimeEvent, so that other Event-types-classes can inherit it.
 *
 * Revision 1.10  2008/08/05 17:32:32  crowdy
 * modify getName() so that the portName is also returned in the name,
 * use final variables instead of strings directly
 *
 * Revision 1.9  2008/06/22 15:31:38  crowdy
 * add missing class "UMLRealtimeEventInstanceOfMessageType" and changes for the new messageTypes
 * previous changes see logs
 *
 * Revision 1.8.2.3  2008/06/19 08:56:14  chrisheinzemann
 * events are deleted with the transition now, after deleting an event the element references are unregistered correctly
 *
 * Revision 1.8.2.2  2008/05/21 19:02:00  crowdy
 * add an attribute to difference between a "triggered event" and a "raised event"
 * add  set and get methods
 * set the attribute respective to the events
 *
 * Revision 1.8.2.1  2008/05/14 16:58:38  chrisheinzemann
 * inserted meta model class and methods for usage of message types
 *
 * Revision 1.8  2006/08/13 21:29:42  alexfupp
 * changed to use factories
 *
 * Revision 1.7  2006/07/20 21:54:02  mtt
 * next bunch of factories
 *
 * Revision 1.6  2006/07/19 18:46:03  mtt
 * changed import declarations to Fujaba 5 package structure
 *
 * Revision 1.5  2005/08/31 17:23:33  aseibel
 * - RTSC can be cloned (not cloning all parts at the moment, but working with the rest).
- Improved constraints for RTSCStates (not working at the moment (CCE))
 *
 */
