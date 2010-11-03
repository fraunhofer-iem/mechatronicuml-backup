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
import de.uni_paderborn.fujaba.umlrt.model.component.PI2PIDelegation;


/**
 * A component instance diagram that may be contained in a {@link Component} and contains 
 * {@link ComponentInstance}s.
 * 
 * @author    strauss
 * @author    Last editor: $Author$
 * @version   $Revision: 3003 $ $Date: 2008-06-02 15:43:11 +0200 (Mo, 02 Jun 2008) $
 * 
 * @model
 */
public interface ComponentInstanceDiagram

{
	/**
	 * @model
	 */
   public String getName();

	/**
	 * @model
	 */
   public ComponentInstance getWrapperComponent();

	/**
	 * @model
	 */
   public java.util.List<PI2PIDelegation> getPI2PIDelegations();

	/**
	 * @model
	 */
   public java.util.List<Assembly> getAssemblies();

	/**
	 * @model
	 */
   public Component getComponent();

	/**
	 * @model
	 */
   public java.util.List<ComponentInstance> getComponentInstances();

	/**
	 * @model
	 */
   public java.util.List<InterfaceInstance> getInterfaceInstances();

	/**
	 * @model
	 */
   public java.util.List<PortInstance> getPortInstances();
}

/*
 * $Log$
 * Revision 1.26  2008/06/02 13:43:11  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.25  2008/05/14 09:25:19  chrisheinzemann
 * more javadocs
 *
 * Revision 1.24  2008/02/21 10:42:44  chrome
 * Prevented NPE
 *
 * Revision 1.23  2007/06/19 09:41:55  sluzar
 * InnerDiag for Components and PI2PIDelegation added
 *
 * Revision 1.22  2007/05/29 11:09:59  sluzar
 * Relation between ComponentInstance and inner Diagram added
 *
 * Revision 1.21  2007/04/24 10:26:41  sluzar
 * Fix f�r Bug 898 und Bug 912
 * Bei der ComponentInstance n�tigen Konstruktor hinzugef�gt
 * Beim Assembly die Interfaces beim L�schvorgang auf null gesetzt
 *
 * Revision 1.20  2006/11/23 09:09:40  mtt
 * organize imports
 *
 * Revision 1.19  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.18  2006/08/13 20:47:30  alexfupp
 * imports organized
 *
 * Revision 1.17  2005/08/25 08:18:56  serti
 * Elements can be removed without killing the display. But removing constraints don't work, yet.
 *
 */
