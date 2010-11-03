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
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl;


import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLComplexRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;


/**
 * This class references a {@link ComponentInstance} which should be activated when the state
 * of the {@link ReconfDiagram} is activated. 
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3582 $ $Date: 2009-03-26 12:14:11 +0100 (Do, 26 Mrz 2009) $
 * @generated
 */
public class ComponentInstanceReconfImpl implements ComponentInstanceReconf
{
	/**
	 * @generated
	 */
	public ComponentInstance getComponentInstance(){return null;}

	/**
	 * @generated
	 */
	public ReconfDiagram getReconfDiagram(){return null;}

	/**
	 * @generated
	 */
	public UMLComplexRealtimeState getStateToBeActivated(){return null;}


	/*
	 * User defined.
	 */
	
//   /**
//    * Get the cname attribute of the ComponentInstanceReconf object
//    *
//    * @return   The cname value
//    */
   public String getCname()
   {
//      return componentInstance != null ? componentInstance.getCname() : "<no component instance>";
	   return null;
   }
//
//
//   /**
//    * @see de.uni_paderborn.fujaba.asg.ASGElement#getName()
//    */
   public String getName()
   {
//      return componentInstance != null ? componentInstance.getName() : "<no component instance>";
	   return null;
   }
}

/*
 * $Log$
 * Revision 1.5  2008/12/18 13:16:21  chrisheinzemann
 * documentation of hybrid statechart classes
 *
 * Revision 1.4  2008/10/09 16:02:29  cytom
 * in HybridStates the active ContinuousComponents can be set via the PropertiesView
 *
 * Revision 1.3  2008/04/15 14:27:08  upohl
 * Bugfix
 * change
 * firePropertyChange ("componentInstanceState", oldValue, value); to  firePropertyChange ("reconfDiagram", oldValue, value);
 *
 * Revision 1.2  2007/04/16 07:53:59  sluzar
 * Alle ASGElements umgestellt
 *
 * Revision 1.1  2006/11/09 13:44:07  shenkler
 * hybrid modeling plugins
 *
 * Revision 1.2  2005/09/11 20:59:12  burmi
 * enabled code gen for signals and implied events
 *
 */
