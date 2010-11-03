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

import de.uni_paderborn.fujaba.umlrt.model.component.Interface;
import de.uni_paderborn.fujaba.umlrt.model.part.InterfacePart;


/**
 * Instance of an {@link Interface} which is connected with a {@link PortInstance}.
 * Interface instances can be used to connect {@link ComponentInstance}s with an 
 * {@link Assembly}. 
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3218 $ $Date: 2008-11-06 17:04:23 +0100 (Do, 06 Nov 2008) $
 * 
 * @model abstract="true"
 */
public interface InterfaceInstance
{

	/**
	 * @model
	 */
   public Assembly getAssembly();

	/**
	 * @model
	 */
   public Interface get_interface();

	/**
	 * @model
	 */
   public PortInstance getPortInstance();

	/**
	 * @model
	 */
   public PortRoleInstance getPortRoleInstance();

	/**
	 * @model
	 */
   public java.util.List<ComponentInstanceDiagram> getComponentInstanceDiagrams();

	/**
	 * @model
	 */
   public InterfacePart getInterfacePart ();

}

/*
 * $Log$
 * Revision 1.29  2008/11/06 16:04:23  cytom
 * removed warning
 *
 * Revision 1.28  2008/06/02 13:43:11  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.27  2008/05/14 09:25:19  chrisheinzemann
 * more javadocs
 *
 * Revision 1.26  2008/05/07 13:37:47  chrome
 * removed again names for InterfaceInstances
 *
 * Revision 1.25  2008/01/17 20:34:37  chrome
 * - introduced InterfaceVariables
 * - association InterfacePart <-> Interface changed to unidirectional
 *
 * Revision 1.24  2007/12/10 20:24:48  chrome
 * added associations between Part- and Instance-classes
 *
 * Revision 1.23  2007/04/24 10:26:41  sluzar
 * Fix f�r Bug 898 und Bug 912
 * Bei der ComponentInstance n�tigen Konstruktor hinzugef�gt
 * Beim Assembly die Interfaces beim L�schvorgang auf null gesetzt
 *
 * Revision 1.22  2007/01/17 10:39:09  mtt
 * fixed access-method names for _interface attributes (removed many nosuchfieldexceptions)
 *
 * Revision 1.21  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.20  2006/08/13 20:47:30  alexfupp
 * imports organized
 *
 * Revision 1.19  2006/02/12 17:46:09  burmi
 * fixed remove action for components, componentinstances, ports, portinstances etc. (except a remaining update problem)
 *
 */
