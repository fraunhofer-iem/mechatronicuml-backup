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

import java.util.Iterator;
import java.util.List;

import de.uni_paderborn.fujaba.umlrt.model.component.Delegation;
import de.uni_paderborn.fujaba.umlrt.model.component.Interface;
import de.uni_paderborn.fujaba.umlrt.model.component.PI2PIDelegation;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.component.ProvidedInterface;
import de.uni_paderborn.fujaba.umlrt.model.instance.Assembly;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstanceDiagram;
import de.uni_paderborn.fujaba.umlrt.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InterfaceInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortRoleInstance;
import de.uni_paderborn.fujaba.umlrt.model.part.PortPart;


/**
 * Instance of a {@link DiscretePort}.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3003 $ $Date: 2008-06-02 15:43:11 +0200 (Mo, 02 Jun 2008) $
 * @generated
 */
public class DiscretePortInstanceImpl implements DiscretePortInstance
{

	/**
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<ComponentInstanceDiagram> getComponentInstanceDiagrams() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<Delegation> getDelegations() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<Assembly> getIngoingAssemblies() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<InterfaceInstance> getInterfaceInstances() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public Delegation getInvisibleDelegation() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<InterfaceInstance> getInvisibleInterfaceInstances() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<Assembly> getOutgoingAssemblies() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public Port getPort() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public PortPart getPortPart() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public PortRoleInstance getPortRoleInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<PI2PIDelegation> getSourcePI2PIDelegations() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @generated
	 */
	public List<PI2PIDelegation> getTargetPI2PIDelegations() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
   /*
    * User implemented methods.
    */

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param instDiag  No description provided
    */
//   public void makeSpecialEnvironment (ComponentInstanceDiagram instDiag)
//   {
//      Iterator<Interface> iter2 =  ((Port) this.getPort()).iteratorOf_interface();
//      Interface _interface;
//      InterfaceInstance iinstance;
//      while (iter2.hasNext())
//      {
//         _interface = (Interface) iter2.next();
//         if (_interface instanceof ProvidedInterface)
//         {
//            iinstance = this.getProject().getFromFactories(ProvidedInterfaceInstance.class).create();
//            iinstance.set_interface( _interface);
//            this.addToInterfaceInstance (iinstance);
//         }
//         else
//         {
//            iinstance = this.getProject().getFromFactories(RequiredInterfaceInstance.class).create();
//            iinstance.set_interface(_interface);
//            this.addToInterfaceInstance (iinstance);
//         }
//         iinstance.addToComponentInstanceDiagram (instDiag);
//      }
//   }
//
//
//   /**
//    * No comment provided by developer, please add a comment to improve documentation.
//    */
//   public void makeSpecialEnvironment()
//   {
//      Iterator<Interface> iter2 =  ((Port) this.getPort()).iteratorOf_interface();
//      Interface _interface;
//      InterfaceInstance iinstance;
//      while (iter2.hasNext())
//      {
//         _interface = (Interface) iter2.next();
//         if (_interface instanceof ProvidedInterface)
//         {
//            iinstance = this.getProject().getFromFactories(ProvidedInterfaceInstance.class).create();
//            iinstance.set_interface(_interface);
//            this.addToInterfaceInstance (iinstance);
//         }
//         else
//         {
//            iinstance = this.getProject().getFromFactories(RequiredInterfaceInstance.class).create();
//            iinstance.set_interface(_interface);
//            this.addToInterfaceInstance (iinstance);
//         }
//         Iterator<ComponentInstanceDiagram> compInstDiag = this.iteratorOfComponentInstanceDiagram();
//         while (compInstDiag.hasNext())
//         {
//            iinstance.addToComponentInstanceDiagram ((ComponentInstanceDiagram) compInstDiag.next());
//         }
//      }
//   }
}

/*
 * $Log$
 * Revision 1.22  2008/06/02 13:43:11  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.21  2008/05/14 09:25:19  chrisheinzemann
 * more javadocs
 *
 * Revision 1.20  2007/01/17 10:39:09  mtt
 * fixed access-method names for _interface attributes (removed many nosuchfieldexceptions)
 *
 * Revision 1.19  2006/11/23 09:09:40  mtt
 * organize imports
 *
 * Revision 1.18  2006/09/03 19:12:26  alexfupp
 * Fixes for becoming compatibel to Fujaba5 (using factories and using getProject instead of UMLProject.get())
 *
 * Revision 1.17  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.16  2006/08/13 20:47:30  alexfupp
 * imports organized
 *
 * Revision 1.15  2005/12/12 12:37:13  mtt
 * small fixes for decoupling meta model and visualization
 *
 */
