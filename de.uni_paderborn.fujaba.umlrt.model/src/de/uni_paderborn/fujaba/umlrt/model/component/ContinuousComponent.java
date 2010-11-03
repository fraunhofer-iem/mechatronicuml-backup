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
package de.uni_paderborn.fujaba.umlrt.model.component;



	/**
	 * @model
	 */
public interface ContinuousComponent extends Component

{

	/**
	 * @model
	 */
   public String getXMLFileName();

}

/*
 * $Log$
 * Revision 1.9  2007/04/16 07:53:58  sluzar
 * Alle ASGElements umgestellt
 * Revision 1.8 2007/04/09 17:18:40 burmi automatic refresh of
 * continuous components when generating code
 * 
 * Revision 1.7 2007/04/09 16:11:40 burmi correct building of tree
 * 
 * Revision 1.6 2007/03/30 18:57:56 burmi last week's work
 * 
 * Revision 1.5 2007/03/10 00:32:06 burmi Generation of tree to calculate evaluation order -- not
 * without bugs, but without exceptions and without errors
 * 
 * Revision 1.4 2007/02/11 21:03:08 burmi fixed NullPointerExceptions
 * 
 * Revision 1.3 2007/02/11 18:57:47 burmi more work on evaluation order
 * 
 * Revision 1.2 2007/01/21 17:35:51 burmi create the tree to perform the partitioning algorithm.
 * Next Step: Implement the algorithm.
 * 
 * Revision 1.1 2006/11/09 13:44:02 shenkler hybrid modeling plugins
 * 
 * Revision 1.14 2005/03/28 14:07:30 burmi Hybride --> Hybrid
 * 
 */
