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

import de.uni_paderborn.fujaba.umlrt.model.component.Delegation;
import de.uni_paderborn.fujaba.umlrt.model.component.PI2PIDelegation;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.instance.Assembly;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstanceDiagram;
import de.uni_paderborn.fujaba.umlrt.model.instance.HybridPortInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InterfaceInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortRoleInstance;
import de.uni_paderborn.fujaba.umlrt.model.part.PortPart;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: sluzar $
 * @version   $Revision: 2490 $ $Date: 2007-04-16 09:54:08 +0200 (Mo, 16 Apr 2007) $
 * @generated
 */
public class HybridPortInstanceImpl implements HybridPortInstance
{

	/**
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {

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
	public List<Delegation> getDelegations() {

		return null;
	}


	/**
	 * @generated
	 */
	public List<Assembly> getIngoingAssemblies() {

		return null;
	}


	/**
	 * @generated
	 */
	public List<InterfaceInstance> getInterfaceInstances() {

		return null;
	}


	/**
	 * @generated
	 */
	public Delegation getInvisibleDelegation() {

		return null;
	}


	/**
	 * @generated
	 */
	public List<InterfaceInstance> getInvisibleInterfaceInstances() {

		return null;
	}


	/**
	 * @generated
	 */
	public List<Assembly> getOutgoingAssemblies() {

		return null;
	}


	/**
	 * @generated
	 */
	public PortPart getPortPart() {

		return null;
	}


	/**
	 * @generated
	 */
	public PortRoleInstance getPortRoleInstance() {

		return null;
	}


	/**
	 * @generated
	 */
	public List<PI2PIDelegation> getSourcePI2PIDelegations() {

		return null;
	}


	/**
	 * @generated
	 */
	public List<PI2PIDelegation> getTargetPI2PIDelegations() {

		return null;
	}
	
	
	/**
	 * @generated
	 */
   public java.util.List<PortInstance> getPortInstances(){return null;}


   /*
    * User implemented methods.
    */

   /**
    * @see de.uni_paderborn.fujaba.umlrt.PortInstanceImpl.instance.PortInstance#getPort()
    */
   @Override
   public Port getPort()
   {
      return (Port) getPort();
   }

}

/*
 * $Log$
 * Revision 1.2  2007/04/16 07:53:57  sluzar
 * Alle ASGElements umgestellt
 *
 * Revision 1.1  2006/11/09 13:44:03  shenkler
 * hybrid modeling plugins
 *
 * Revision 1.4  2005/09/18 13:37:41  kudak
 * Darstellung hybrider Port abh�ngig von internen Ports
 *
 */
