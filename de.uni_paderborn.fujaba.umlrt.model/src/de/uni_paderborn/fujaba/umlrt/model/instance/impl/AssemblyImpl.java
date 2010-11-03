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

import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.instance.Assembly;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstanceDiagram;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ProvidedInterfaceInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.RequiredInterfaceInstance;
import de.uni_paderborn.fujaba.umlrt.model.part.AssemblyType;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PortRole;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 * <p>
 * This one connects a {@link #requiredInterfaceInstance} and a {@link #providedInterfaceInstance}
 * and thus make up the connections between the superordinated Ports and Components. The
 * associations {@link #sourcePortInstance} and {@link #targetPortInstance} are redundant, direct
 * links to the same {@link Port Ports} needed for technical reasons by the mapping rules from
 * ComponentActivityDiagrams to TransformationsDiagrams.
 * 
 * @author $Author: chrisheinzemann $
 * @version $Revision: 3003 $ $Date: 2008-06-02 15:43:11 +0200 (Mo, 02 Jun 2008) $
 * @generated
 */
public class AssemblyImpl implements Assembly

{

	/**
	 * @generated
	 */
   public UMLRealtimeStatechart getStatechart(){return null;}

	/**
	 * @generated
	 */
   public ProvidedInterfaceInstance getProvidedInterfaceInstance(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<ComponentInstanceDiagram> getComponentInstanceDiagrams(){return null;}

	/**
	 * @generated
	 */
   public RequiredInterfaceInstance getRequiredInterfaceInstance(){return null;}

	/**
	 * @generated
	 */
   public java.util.List<PortRole> getPortRoles(){return null;}

	/**
	 * @generated
	 */
   public AssemblyType getAssemblyType (){return null;}

	/**
	 * @generated
	 */
   public PortInstance getSourcePortInstance (){return null;}

	/**
	 * @generated
	 */
   public PortInstance getTargetPortInstance (){return null;}

   
   /*
    * User implemented methods.
    */
   
   /**
    * Sets the name attribute of the Assembly object
    *
    * @return   The name value
    */

//   public String getName()
//   {
//      ComponentInstance fromComponentInstance = requiredInterfaceInstance.getPortInstance().getComponentInstance();
//      ComponentInstance toComponentInstance = providedInterfaceInstance.getPortInstance().getComponentInstance();
//      Port fromPort = requiredInterfaceInstance.getPortInstance().getPort();
//      Port toPort = providedInterfaceInstance.getPortInstance().getPort();
//
//      return  (fromComponentInstance.getName() + ":" + fromPort.getName() + "-->" + toComponentInstance.getName() + ":" + toPort.getName());
//   }

}

/*
 * $Log$
 * Revision 1.30  2008/06/02 13:43:11  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.29  2008/05/08 11:37:54  chrome
 * some comments
 *
 * Revision 1.28  2008/02/07 14:52:53  chrome
 * - introduced redundant associations PortInstance -- Assembly
 * - mapping rules for replacing assembly links with multiplicities of 1
 *
 * Revision 1.27  2007/12/10 20:24:48  chrome
 * added associations between Part- and Instance-classes
 *
 * Revision 1.26  2007/04/24 10:26:41  sluzar
 * Fix f�r Bug 898 und Bug 912
 * Bei der ComponentInstance n�tigen Konstruktor hinzugef�gt
 * Beim Assembly die Interfaces beim L�schvorgang auf null gesetzt
 *
 * Revision 1.25  2006/11/23 09:09:40  mtt
 * organize imports
 *
 * Revision 1.24  2006/09/03 19:12:26  alexfupp
 * Fixes for becoming compatibel to Fujaba5 (using factories and using getProject instead of UMLProject.get())
 *
 * Revision 1.23  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.22  2006/08/13 20:47:30  alexfupp
 * imports organized
 *
 * Revision 1.21  2006/02/12 17:54:15  burmi
 * fixed removeYou() for Assembly
 *
 */
