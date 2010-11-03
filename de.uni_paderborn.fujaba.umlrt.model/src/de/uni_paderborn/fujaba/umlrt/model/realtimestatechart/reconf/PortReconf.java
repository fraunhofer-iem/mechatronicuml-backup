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
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;


/**
 * This class references a {@link Port} which should be activated when the state
 * of the {@link ReconfDiagram} is activated.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3319 $ $Date: 2008-12-18 14:16:21 +0100 (Do, 18 Dez 2008) $
 * 
 * @model
 */
public interface PortReconf // extends UMLIncrement
{
	/**
	 * @model
	 */
   public String getName();

	/**
	 * @model
	 */
   public Port getPort();

	/**
	 * @model
	 */
   public ReconfDiagram getReconfDiagram();

}

/*
 * $Log$
 * Revision 1.4  2008/12/18 13:16:21  chrisheinzemann
 * documentation of hybrid statechart classes
 *
 * Revision 1.3  2008/12/09 11:27:56  cytom
 * cleanups + removed warnings
 *
 * Revision 1.2  2007/04/16 07:53:59  sluzar
 * Alle ASGElements umgestellt
 *
 * Revision 1.1  2006/11/09 13:44:07  shenkler
 * hybrid modeling plugins
 *
 * Revision 1.2  2005/06/06 13:56:49  kudak
 * Verwendung der Interface Statecharts beim Anlegen von Zust�nden
 *
 */
