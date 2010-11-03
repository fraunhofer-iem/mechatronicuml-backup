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
 * UMLClass: 'UMLInvariantAtom'.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3456 $
 * @created   $Date: 2009-02-13 11:31:31 +0100 (Fr, 13 Feb 2009) $
 * 
 * @model
 */
public interface UMLInvariantAtom extends UMLBoolRealtimeAtom
{
	/**
	 * @model
	 */
   public UMLComplexRealtimeState getUMLComplexRealtimeState();
}

/*
 * $Log$
 * Revision 1.13  2009/02/13 10:29:36  chrisheinzemann
 * Natural Numbers are created using the factories, now
 * this removes many exceptions and warning on creation and serialization of the objects and while setting the attributes
 *
 * Revision 1.12  2008/07/02 15:08:42  crowdy
 * removed unused imports
 *
 * Revision 1.11  2007/06/18 13:17:52  mtt
 * fixed cloning for time and clock related syntax elements, raised events are correctly cloned as raised events
 *
 * Revision 1.10  2006/08/05 21:12:40  mtt
 * more fixes for factories
 *
 * Revision 1.9  2005/08/31 17:23:33  aseibel
 * - RTSC can be cloned (not cloning all parts at the moment, but working with the rest).
- Improved constraints for RTSCStates (not working at the moment (CCE))
 *
 */
