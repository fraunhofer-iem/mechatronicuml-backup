/*
 * The FUJABA ToolSuite for Eclipse project:
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
 *      Copyright (C) Fujaba Development Group
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
 * Contact address:
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

import de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart;
import de.uni_paderborn.fujaba.umlrt.model.component.DPort;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;

/**
 * This class encapsulates all functionality of a discrete port. Whenever a port
 * requires such functionality an object of this class is created and assigned
 * to the port. The port then delegates all requests for discrete functionality
 * to this object.
 * 
 * @author cajudosu
 * @author Last editor: $Author: cajudosu $
 * @version $Revision: 1.3 $ $Date: 2005/09/17 16:24:13 $
 * @generated
 */
public class DPortImpl implements DPort
{

	/**
	 * @generated
	 */
   public Port getPort(){return null;}

	/**
	 * @generated
	 */
   public ProtocolStatechart getProtocolStatechart(){return null;}

	/**
	 * @generated
	 */
   public boolean setProtocolStatechart (ProtocolStatechart value){return false;}

	@Override
	public void updateProtocolStatechartName() {
		// TODO Auto-generated method stub
	}
   
   /*
    * User defined.
    */


//   /**
//    * This method is used to update the name of the protocol statechart. The 
//    * protocol statechart has always a name consisting of the Component Diagram 
//    * name, the component name and the port name.
//    */
//   public void updateProtocolStatechartName() {
//      String protocolSCName = this.port.getName();
//      if (this.port.getComponentDiagram() != null && this.port.getComponent() != null){
//         protocolSCName = this.port.getComponentDiagram().getName() + "." + 
//            this.port.getComponent().getName() + "." + this.port.getName();
//      }
//      
//      if (this.protocolStatechart != null)
//      {
//         this.protocolStatechart.setName(protocolSCName);
//      }
//   }
//

}
