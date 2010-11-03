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
package de.uni_paderborn.fujaba.umlrt.model.behavior;

import de.uni_paderborn.fujaba.umlrt.model.component.impl.DPortImpl;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;


/**
 * An UMLRealtimeStatechart which describes the protocol of a DiscretePort. This class inherits
 * from UMLRealtimeStatechart and is needed to provided a distinction between protocol
 * statecharts and normal UMLRealtimeStatecharts.
 *
 * @author    $Author: crowdy $
 * @version   $Revision: 3081 $ $Date: 2008-07-01 15:28:26 +0200 (Di, 01 Jul 2008) $
 * 
 * @model
 */
public interface ProtocolStatechart extends UMLRealtimeStatechart

{
	/**
	 * @model
	 */
   public DPortImpl getDPort();

}

/*
 * $Log$
 * Revision 1.14  2008/07/01 13:28:26  crowdy
 * if the protocol statechart is deleted, set the port attribute with setPort method to null
 *
 * Revision 1.13  2008/05/13 14:24:20  chrisheinzemann
 * improved javadoc documentation
 *
 * Revision 1.12  2006/11/23 09:09:41  mtt
 * organize imports
 *
 * Revision 1.11  2006/10/05 12:21:46  mtt
 * component is not a class anymore but has a class
 *
 * Revision 1.10  2006/09/03 13:13:07  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.9  2006/08/13 20:47:33  alexfupp
 * imports organized
 *
 * Revision 1.8  2005/08/31 17:26:27  aseibel
 * port merging nearly working. the  component rtsc has a complex state with all rtscs.
 *
 */
