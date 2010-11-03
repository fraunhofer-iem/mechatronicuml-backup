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
package de.uni_paderborn.fujaba.umlrt.model.component;


import de.uni_paderborn.fujaba.umlrt.model.part.RequiredInterfacePart;


	/**
	 * @model
	 */
public interface RequiredInterface extends Interface

{
	/**
	 * @model
	 */
   public java.util.List<RequiredInterfacePart> getReferencingRequiredInterfaceParts();

}

/*
 * $Log$
 * Revision 1.16  2008/07/03 13:51:45  mtt
 * fixed generics
 *
 * Revision 1.15  2008/06/22 20:02:49  crowdy
 * fix NPE
 *
 * Revision 1.14  2008/06/19 12:02:53  cytom
 * api-changes/-fixes in umlrt2: ConstraintApplicable is an obsolete subset of already implemented FIncrement, so some similar/equal fields/methods exists two times in Constraint and Component with slightly different name, in this first step they get deprecated, next step is to remove them ...
 *
 * Revision 1.13  2008/06/05 14:07:42  crowdy
 * if an interface is assigned to a port it will be listed to the protocol statechart of the port and the rt-statechart of the component
 *
 * Revision 1.12  2008/05/13 14:24:19  chrisheinzemann
 * improved javadoc documentation
 *
 * Revision 1.11  2007/10/19 13:37:36  chrome
 * changed package structure
 *
 * Revision 1.10  2007/10/11 15:30:31  chrome
 * First buggy version of ComponentParts
 * Revision 1.9 2006/11/23 09:09:39 mtt organize imports
 * 
 * Revision 1.8 2006/09/03 13:13:05 alexfupp changed to use factories (Fujaba5)
 * 
 * Revision 1.7 2006/08/13 20:47:27 alexfupp imports organized
 * 
 * Revision 1.6 2005/03/30 13:52:22 kudak L�schen von Komponenteninstanzen & nicht ben�tigte
 * Assoziationen gel�scht
 * 
 */
