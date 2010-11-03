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
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;



/**
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3307 $ $Date: 2008-12-16 16:59:33 +0100 (Di, 16 Dez 2008) $
 * 
 * @model
 */
public interface UMLInterfaceStatechart extends UMLRealtimeStatechart
{
	/**
	 * @model
	 */
   public UMLRealtimeStatechart getUMLRealtimeStatechart();

}

/*
 * $Log$
 * Revision 1.6  2008/12/16 15:59:20  chrisheinzemann
 * moved check for simple interface statechart to own class
 *
 * Revision 1.5  2008/12/16 14:18:05  chrisheinzemann
 * removed unused 1:n association between HybridStatechart and InterfaceStatechart which had been replaced by 1:1 association
 *
 * Revision 1.4  2008/12/10 12:40:36  chrisheinzemann
 * made use of generics to remove many warnings
 *
 * Revision 1.3  2008/12/10 09:15:53  chrisheinzemann
 * moved check for simplyness of interface statechart to the interface statechart class
 *
 * Revision 1.2  2007/04/16 07:54:03  sluzar
 * Alle ASGElements umgestellt
 *
 * Revision 1.1  2006/11/09 13:44:08  shenkler
 * hybrid modeling plugins
 *
 * Revision 1.6  2005/06/15 14:59:30  kudak
 * Updatemechanismus f�r Interface Statecharts
 *
 */
