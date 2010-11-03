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
package de.uni_paderborn.fujaba.umlrt.model.instance;

import java.util.Iterator;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentDiagram;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PortRole;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3052 $ $Date: 2008-06-19 14:03:01 +0200 (Do, 19 Jun 2008) $
 * 
 * @model
 */
public interface PortRoleInstance // extends UMLIncrement
{
	/**
	 * @model
	 */
   public PatternInstance getPatternInstance();

	/**
	 * @model
	 */
   public Port getPort();

	/**
	 * @model
	 */
   public PortInstance getPortInstance();

	/**
	 * @model
	 */
   public Iterator<InterfaceInstance> iteratorOfInterfaceInstance();

	/**
	 * @model
	 */
   public PortRole getPortRole();

	/**
	 * @model
	 */
   public UMLRealtimeStatechart getUMLRealtimeStatechart();

	/**
	 * @model
	 */
   public ComponentDiagram getComponentDiagram();

	/**
	 * @model
	 */
   public String getName();

}

/*
 * $Log$
 * Revision 1.13  2008/06/19 12:02:54  cytom
 * api-changes/-fixes in umlrt2: ConstraintApplicable is an obsolete subset of already implemented FIncrement, so some similar/equal fields/methods exists two times in Constraint and Component with slightly different name, in this first step they get deprecated, next step is to remove them ...
 *
 * Revision 1.12  2008/06/02 13:43:11  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.11  2007/10/03 22:21:16  mgw
 * merge of port role instance with component works
 *
 * Revision 1.10  2007/02/14 09:40:52  alexfupp
 * Adjustments to work with fujaba4eclipse.pattern.ui
 *
 * Revision 1.9  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.8  2006/08/13 20:47:30  alexfupp
 * imports organized
 *
 * Revision 1.7  2005/11/30 17:20:58  aseibel
 * port role can be deleted, even if an instance is merged.
 *
 */
