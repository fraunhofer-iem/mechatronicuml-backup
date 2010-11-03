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
package de.uni_paderborn.fujaba.umlrt.model.pattern;

import de.uni_paderborn.fujaba.umlrt.model.component.Interface;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: cajudosu $
 * @version   $Revision: 3391 $ $Date: 2009-01-09 11:22:04 +0100 (Fr, 09 Jan 2009) $
 * 
 * @model
 */
public interface PatternDiagram // extends ASGDiagram
{
	/**
	 * @model
	 */
   public String getName();

	/**
	 * @model
	 */
   public java.util.List<Channel> getChannels();

	/**
	 * @model
	 */
   public java.util.List<Interface> getInterfaces();

	/**
	 * @model
	 */
   public java.util.List<PortRole> getPortRoles();

//	/**
//	 * @model
//	 */
//   public UMLClassDiagram getUMLClassDiagram();
//
//	/**
//	 * @model
//	 */
//   public MessageInterfaceDiagram getMessageInterfaceDiagram();

	/**
	 * @model
	 */
   public Pattern getPattern();
}

/*
 * $Log$
 * Revision 1.21  2009/01/09 10:22:04  cajudosu
 * * Changed return type of getMessageInterfaceDiagram method from UMLClassDiagram to MessageInterfaceDiagram.
 *
 * Revision 1.20  2009/01/09 10:16:14  cajudosu
 * * Added field for saving corresponding message interface diagram.
 *
 * Revision 1.19  2007/02/14 09:40:51  alexfupp
 * Adjustments to work with fujaba4eclipse.pattern.ui
 *
 * Revision 1.18  2007/01/15 23:10:50  alexfupp
 * some small clean ups
 *
 * Revision 1.17  2007/01/15 20:08:35  alexfupp
 * fixed FieldNotFoundException
 *
 * Revision 1.16  2007/01/09 23:50:16  alexfupp
 * Fixes for PropertyChangeSupport in patterns
 *
 * Revision 1.15  2007/01/03 21:28:12  alexfupp
 * cleaned up a bit
 *
 * Revision 1.14  2007/01/03 21:05:45  alexfupp
 * some small changes needed for fujaba4eclipse.umlrt2.pattern.ui
 *
 * Revision 1.13  2006/11/23 09:09:39  mtt
 * organize imports
 *
 * Revision 1.12  2006/09/03 13:13:06  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.11  2006/08/13 20:47:28  alexfupp
 * imports organized
 *
 * Revision 1.10  2005/11/30 15:56:17  serti
 * Constraints are correct removed
 *
 */
