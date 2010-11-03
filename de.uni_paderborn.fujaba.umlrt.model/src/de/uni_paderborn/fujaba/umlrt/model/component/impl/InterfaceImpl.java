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
package de.uni_paderborn.fujaba.umlrt.model.component.impl;


import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentDiagram;
import de.uni_paderborn.fujaba.umlrt.model.component.Interface;
import de.uni_paderborn.fujaba.umlrt.model.instance.InterfaceInstance;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Channel;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternDiagram;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PortRole;

/**
 * 
 * @author cajudosu
 * @generated
 */
public class InterfaceImpl implements Interface

{
	/**
	 * @generated
	 */
   public String getName(){return null;}

	/**
	 * @generated
	 */
   public Channel getChannel(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<? extends InterfaceInstance> getInterfaceInstances(){return null;}

	/**
	 * @generated
	 */
   public PortRole getPortRole(){return null;}

	/**
	 * @generated
	 */
   public PortImpl getPort(){return null;}

	/**
	 * @generated
	 */
   public ComponentDiagram getComponentDiagram(){return null;}

	/**
	 * @generated
	 */
   public PatternDiagram getPatternDiagram(){return null;}

	/**
	 * @generated
	 */
   public EClass getEClass(){return null;} // UMLClass getUMLClass(){return null;}

//	/**
//	 * @generated
//	 */
//   public UMLCardinality getMultiplicity (){return null;}

   /**
    * @see de.uni_paderborn.fujaba.asg.ASGElement#toString()
    */
   @Override
   public String toString()
   {
      return getName();
   }
}

/*
 * $Log$
 * Revision 1.31  2008/11/06 16:04:42  cytom
 * added/fixed property descriptors for PortInstance, InterfaceInstance, ComponentInstance
 *
 * Revision 1.30  2008/07/03 13:51:45  mtt
 * fixed generics
 *
 * Revision 1.29  2008/06/02 12:57:40  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.28  2008/05/13 14:24:19  chrisheinzemann
 * improved javadoc documentation
 *
 * Revision 1.27  2008/01/17 20:34:36  chrome
 * - introduced InterfaceVariables
 * - association InterfacePart <-> Interface changed to unidirectional
 *
 * Revision 1.26  2007/11/18 09:07:13  mtt
 * - moved creation of classes and statecharts for ports to a new command in order to avoid clobbering models with unnecessary classes and statecharts
 * - interfaces are created in a special interface class diagram
 *
 * Revision 1.25  2007/10/27 10:49:04  chrome
 * UMLCardinality for multiplicities instead of simple flag
 *
 * Revision 1.24  2007/10/19 13:37:36  chrome
 * changed package structure
 *
 * Revision 1.23  2007/10/14 10:01:01  chrome
 * added multiplicity flag
 * Revision 1.22 2007/10/11 15:30:31 chrome First buggy version of
 * ComponentParts
 * 
 * Revision 1.21 2007/01/17 10:39:09 mtt fixed access-method names for _interface attributes
 * (removed many nosuchfieldexceptions)
 * 
 * Revision 1.20 2007/01/16 20:26:06 alexfupp fixed a wrong string for PropertyChange
 * 
 * Revision 1.19 2006/11/23 09:09:39 mtt organize imports
 * 
 * Revision 1.18 2006/09/03 13:13:05 alexfupp changed to use factories (Fujaba5)
 * 
 * Revision 1.17 2006/08/13 20:47:27 alexfupp imports organized
 * 
 * Revision 1.16 2005/08/02 13:41:40 kudak Interface Visual removed
 * 
 */
