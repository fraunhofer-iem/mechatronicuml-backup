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
package de.uni_paderborn.fujaba.umlrt.model.pattern.impl;

import de.uni_paderborn.fujaba.umlrt.model.instance.PatternInstance;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Pattern;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternDiagram;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PortRole;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3052 $ $Date: 2008-06-19 14:03:01 +0200 (Do, 19 Jun 2008) $
 * @generated
 */
public class PatternImpl implements Pattern
{
	/**
	 * @generated
	 */
   public String getName(){return null;}

	/**
	 * @generated
	 */
   public PatternDiagram getPatternDiagram(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<PatternInstance> getPatternInstances(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<PortRole> getPortRoles(){return null;}

   
	/*
	 * User implemented methods.
	 */

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public String toString()
   {
      return getName();
   }
}

/*
 * $Log$
 * Revision 1.17  2008/06/19 12:02:53  cytom
 * api-changes/-fixes in umlrt2: ConstraintApplicable is an obsolete subset of already implemented FIncrement, so some similar/equal fields/methods exists two times in Constraint and Component with slightly different name, in this first step they get deprecated, next step is to remove them ...
 *
 * Revision 1.16  2007/04/16 14:07:52  mtt
 * readded standalone gui, compilable using Fujaba 5
 *
 * Revision 1.15  2007/02/14 09:40:51  alexfupp
 * Adjustments to work with fujaba4eclipse.pattern.ui
 *
 * Revision 1.14  2007/01/09 23:50:16  alexfupp
 * Fixes for PropertyChangeSupport in patterns
 *
 * Revision 1.13  2006/11/23 09:09:39  mtt
 * organize imports
 *
 * Revision 1.12  2006/08/23 20:14:10  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.11  2006/08/13 20:47:28  alexfupp
 * imports organized
 *
 * Revision 1.10  2005/09/09 12:24:07  burmi
 * added parameterless constructors (required for fujaba load mechanism)
 *
 */
