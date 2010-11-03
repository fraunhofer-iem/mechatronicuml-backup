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

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.Delegation;
import de.uni_paderborn.fujaba.umlrt.model.component.PI2PIDelegation;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.instance.Assembly;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstanceDiagram;
import de.uni_paderborn.fujaba.umlrt.model.instance.InterfaceInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortRoleInstance;
import de.uni_paderborn.fujaba.umlrt.model.part.PortPart;


/**
 * An instance of a {@link Port}. The ports of a {@link Component} are instantiated using
 * this class when the component is instantiated to a {@link ComponentInstance}.
 * <p>
 * The {@link #interfaceInstance interfaceInstances} are connected by {@link Assembly Assemblies}
 * and thus make up the connections between the superordinated {@link Component Components}. The
 * associations {@link #ingoingAssemblies} and {@link #outgoingAssemblies} are redundant, direct
 * links to the same {@link Assembly Assemblies} needed for technical reasons by the mapping rules
 * from ComponentActivityDiagrams to TransformationsDiagrams.
 * 
 * @author $Author: cytom $
 * @version $Revision: 3239 $ $Date: 2008-11-25 16:53:05 +0100 (Di, 25 Nov 2008) $
 * @generated
 */
public class PortInstanceImpl implements PortInstance
{

	/**
	 * @generated
	 */
   public ComponentInstance getComponentInstance(){return null;}

	/**
	 * @generated
	 */
   public Delegation getInvisibleDelegation(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<Delegation> getDelegations(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<PI2PIDelegation> getSourcePI2PIDelegations(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<PI2PIDelegation> getTargetPI2PIDelegations(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<InterfaceInstance> getInvisibleInterfaceInstances(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<InterfaceInstance> getInterfaceInstances(){return null;}

	/**
	 * @generated
	 */
   public Port getPort(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<ComponentInstanceDiagram> getComponentInstanceDiagrams(){return null;}

	/**
	 * @generated
	 */
   public PortRoleInstance getPortRoleInstance(){return null;}

	/**
	 * @generated
	 */
   public PortPart getPortPart (){return null;}

	/**
	 * @generated
	 */
   public java.util.List<Assembly> getIngoingAssemblies(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<Assembly> getOutgoingAssemblies(){return null;}


   
   /*
    * User implemented methods.
    */

   /**
    * Returns this ones name or, if not set, the name of the Port as name of the PortInstance.
    */
//   @Property( name = PROPERTY_NAME )
//   public String getName()
//   {
//      if(this.name != null) {
//         return this.name;
//      }
//	   if (getPort() != null)
//		   return getPort().getName();
//	   else
//		   return super.getName();
//   }
//   
//   
//   public String toString()
//   {
//     if(this.name != null && this.portPart != null && this.portPart.getName() != null) {
//        return (getComponentInstance()!= null ? getComponentInstance().getName() : "<noComponentInstance>") + ":" + this.name + "/" + this.getPortPart().getName();
//     }
//     if (getPort() != null)
//     {
//       return (getComponentInstance()!= null ? getComponentInstance().getName() : "<noComponentInstance>") + ":" + getPort().toString();
//     }
//     else return getName(); 
//   }
}

/*
 * $Log$
 * Revision 1.38  2008/11/25 15:53:03  cytom
 * type (in/out) of continuous and hybrid ports can be set via gui and is correctly displayed + some cleanups/improvements + removed warnings
 *
 * Revision 1.37  2008/06/02 13:43:11  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.36  2008/05/14 09:25:19  chrisheinzemann
 * more javadocs
 *
 * Revision 1.35  2008/05/08 11:37:54  chrome
 * some comments
 *
 * Revision 1.34  2008/04/09 20:34:32  chrome
 * turned associations to compositions PortInstance <+>- PI2PIDelegations
 *
 * Revision 1.33  2008/02/07 14:52:53  chrome
 * - introduced redundant associations PortInstance -- Assembly
 * - mapping rules for replacing assembly links with multiplicities of 1
 *
 * Revision 1.32  2008/01/30 11:40:59  mtt
 * fixed pi2pidelegation delete bug, association implementations were copied and not correctly changed
 *
 * Revision 1.31  2007/12/27 18:27:28  chrome
 * possibility to set names for PortInstances
 *
 * Revision 1.30  2007/12/10 20:24:48  chrome
 * added associations between Part- and Instance-classes
 *
 * Revision 1.29  2007/12/09 15:37:48  mtt
 * toString methods
 *
 * Revision 1.28  2007/06/19 09:41:55  sluzar
 * InnerDiag for Components and PI2PIDelegation added
 *
 * Revision 1.27  2007/03/15 10:33:55  mtt
 * added getName() which returns the name of the Port
 *
 * Revision 1.26  2006/11/23 09:09:40  mtt
 * organize imports
 *
 * Revision 1.25  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.24  2006/08/13 20:47:30  alexfupp
 * imports organized
 *
 * Revision 1.23  2006/02/12 17:46:09  burmi
 * fixed remove action for components, componentinstances, ports, portinstances etc. (except a remaining update problem)
 *
 */
