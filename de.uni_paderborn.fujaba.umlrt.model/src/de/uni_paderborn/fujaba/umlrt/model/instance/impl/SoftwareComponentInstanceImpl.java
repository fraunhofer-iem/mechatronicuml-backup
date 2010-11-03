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
package de.uni_paderborn.fujaba.umlrt.model.instance.impl;

import java.util.List;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstanceDiagram;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.SoftwareComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.part.ComponentPart;


/**
 * An instance of a {@link SoftwareComponent}. See also {@link ComponentInstance}.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 2954 $ $Date: 2008-05-14 11:25:19 +0200 (Mi, 14 Mai 2008) $
 * @generated
 */
public class SoftwareComponentInstanceImpl implements SoftwareComponentInstance
{
	/**
	 * No comment provided by developer, please add a comment to improve documentation.
	 *
	 * @param name  The new name value
	 */
	static int index = 1;

	/**
	 * @generated
	 */
	public Component getComponent() {


		return null;
	}

	/**
	 * @generated
	 */
	public List<ComponentInstanceDiagram> getComponentInstanceDiagrams() {

		return null;
	}

	/**
	 * @generated
	 */
	public ComponentInstanceDiagram getInnerDiag() {

		return null;
	}

//	/**
//	 * @generated
//	 */
//	public UMLCardinality getMultiplicity() {
//
//		return null;
//	}

	/**
	 * @generated
	 */
	public String getName() {

		return null;
	}

	/**
	 * @generated
	 */
	public List<PortInstance> getPortInstances() {

		return null;
	}

	/**
	 * @generated
	 */
	public ComponentPart getReferencedComponentPart() {

		return null;
	}

	/**
	 * @generated
	 */
	public String getRole() {

		return null;
	}

	/**
	 * @generated
	 */
	public int getSolverId() {

		return 0;
	}

	/*
	 * User implemented methods.
	 */

   /**
    *Constructor for class ComponentInstance
    */
   protected SoftwareComponentInstanceImpl()
   {
      index++;
   }

}

/*
 * $Log$
 * Revision 1.2  2008/05/14 09:25:19  chrisheinzemann
 * more javadocs
 *
 * Revision 1.1  2006/11/24 14:36:54  mtt
 * class structure changes to allow distinction between software and hardware models
 *
 */
