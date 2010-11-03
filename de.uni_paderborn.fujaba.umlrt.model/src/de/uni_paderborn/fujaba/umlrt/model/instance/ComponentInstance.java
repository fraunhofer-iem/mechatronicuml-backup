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
package de.uni_paderborn.fujaba.umlrt.model.instance;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.part.ComponentPart;


/**
 * An instance of a component. This is not a runtime instance, though. Instead it is
 * an instantiation of a component type specified by a {@link Component}.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3003 $ $Date: 2008-06-02 15:43:11 +0200 (Mo, 02 Jun 2008) $
 */
/**
 * @model abstract="true"
 */
public interface ComponentInstance // extends ASGElement
{
	/**
	 * @model
	 */
	public String getName();

	/**
	 * @model
	 */
	public Component getComponent();

	/**
	 * @model
	 */
	public ComponentInstanceDiagram getInnerDiag();

	/**
	 * @model
	 */
	public java.util.List<PortInstance> getPortInstances();

	/**
	 * @model
	 */
	public java.util.List<ComponentInstanceDiagram> getComponentInstanceDiagrams();

	/**
	 * @model
	 */
	public int getSolverId();

	/**
	 * @model
	 */
	public ComponentPart getReferencedComponentPart ();

//	/**
//	 * @model
//	 */
//	public UMLCardinality getMultiplicity();

	/**
	 * @model
	 */
	public String getRole();
}

/*
 * $Log$
 * Revision 1.41  2008/06/02 13:43:11  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.40  2008/05/14 09:25:19  chrisheinzemann
 * more javadocs
 *
 * Revision 1.39  2007/12/22 17:07:00  chrome
 * toString() prints also Parts
 *
 * Revision 1.38  2007/12/17 21:03:27  chrome
 * made rolenames unique
 *
 * Revision 1.37  2007/12/10 20:24:48  chrome
 * added associations between Part- and Instance-classes
 *
 * Revision 1.36  2007/12/09 15:37:48  mtt
 * toString methods
 *
 * Revision 1.35  2007/06/19 09:41:55  sluzar
 * InnerDiag for Components and PI2PIDelegation added
 *
 * Revision 1.34  2007/05/29 11:09:59  sluzar
 * Relation between ComponentInstance and inner Diagram added
 *
 * Revision 1.33  2007/04/30 12:17:07  mtt
 * add unparse module name
 *
 * Revision 1.32  2007/04/20 17:08:38  mtt
 * add navigation method for portinstances
 *
 * Revision 1.31  2006/11/24 14:36:54  mtt
 * class structure changes to allow distinction between software and hardware models
 *
 * Revision 1.30  2006/11/23 09:09:40  mtt
 * organize imports
 *
 * Revision 1.29  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.28  2006/08/13 20:47:30  alexfupp
 * imports organized
 *
 * Revision 1.27  2006/02/16 15:24:59  mtt
 * fixed solver id
 *
 */
