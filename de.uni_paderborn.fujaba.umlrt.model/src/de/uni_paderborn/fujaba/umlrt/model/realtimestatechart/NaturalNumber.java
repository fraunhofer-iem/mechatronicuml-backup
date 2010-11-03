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



/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3595 $ $Date: 2009-04-04 11:01:17 +0200 (Sa, 04 Apr 2009) $
 * 
 * @model
 */
public interface NaturalNumber // extends ASGElement
{
	/**
	 * @model
	 */
	public long getValue();

	/**
	 * @model
	 */
	public boolean isInfinity();
}

/*
 * $Log$
 * Revision 1.7  2009/02/13 10:29:36  chrisheinzemann
 * Natural Numbers are created using the factories, now
 * this removes many exceptions and warning on creation and serialization of the objects and while setting the attributes
 *
 * Revision 1.6  2009/01/22 10:42:03  chrisheinzemann
 * new helper function for natural number and one comment added
 *
 * Revision 1.5  2007/04/27 08:22:28  mtt
 * allow "inf" as argument in setValue()
 *
 * Revision 1.4  2006/02/18 23:25:13  mtt
 * fixes for invariant atoms
 *
 */
