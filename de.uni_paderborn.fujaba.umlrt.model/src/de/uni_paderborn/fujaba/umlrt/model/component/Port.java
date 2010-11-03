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
package de.uni_paderborn.fujaba.umlrt.model.component;

import de.uni_paderborn.fujaba.umlrt.model.component.impl.DPortImpl;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortRoleInstance;
import de.uni_paderborn.fujaba.umlrt.model.part.DelegationType;
import de.uni_paderborn.fujaba.umlrt.model.part.PortPart;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PortRole;


	/**
	 * @model
	 */
public interface Port

{
	public static final int TYPE_DISCRETE = 0;

	public static final int TYPE_CONTINUOUS = 1;

	public static final int TYPE_HYBRID = 2;

	/**
	 * @model
	 */
	public String getName();

	/**
	 * @model
	 */
	public java.util.List<Delegation> getDelegations();

	/**
	 * @model
	 */
	public java.util.List<Interface> getInvisibleInterfaces();

	/**
	 * @model
	 */
	public java.util.List<Interface> get_interfaces();

	/**
	 * @model
	 */
	public Component getComponent();

	/**
	 * @model
	 */
	public java.util.List<PortInstance> getPortInstances();

	/**
	 * @model
	 */
	public ComponentDiagram getComponentDiagram();

	/**
	 * @model
	 */
	public PortRoleInstance getPortRoleInstance();

//	/**
//	 * @model
//	 */
//	public UMLCardinality getMultiplicity ();

//	/**
//	 * @model
//	 */
//	public java.util.List<PortVariable> getPortVariables();

	/**
	 * @model
	 */
	public java.util.List<PortPart> getReferencingPortParts();

	/**
	 * @model
	 */
	public java.util.List<DelegationType> getDelegationTypes();

//	/**
//	 * @model
//	 */
//	public java.util.List<ComplexParam> getPortParams();

//	/**
//	 * @model
//	 */
//	public java.util.List<ReturnDeclaration> getClassifyingPortReturnDeclarations();

	/**
	 * @model
	 */
	public PortRole getPortRole();

	/**
	 * @model
	 */
	public DPortImpl getDPort();

//	/**
//	 * @model
//	 */
//	public CPortImpl getCPort();

	/**
	 * @model
	 */
	public int getType();
}

/*
 * $Log$
 * Revision 1.49  2008/06/02 12:27:34  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.48  2008/05/13 14:24:19  chrisheinzemann
 * improved javadoc documentation
 *
 * Revision 1.47  2008/02/25 20:41:09  chrome
 * - return values for transformations
 * - several bugfixes
 *
 * Revision 1.46  2008/01/31 21:19:04  chrome
 * - Updated Params and Arguments
 * - Introduced Composite as superclass of Parts and ConnectorTypes
 * - Mapping rules for Params and Aguments
 *
 * Revision 1.45  2007/12/09 15:37:49  mtt
 * toString methods
 *
 * Revision 1.44  2007/11/04 17:59:09  chrome
 * introduced PortVariable
 *
 * Revision 1.43  2007/10/27 13:59:38  chrome
 * changed many associations to compositions
 *  - Delegation- and AssemlblyTypes are deleted if related Port(-Parts) are deleted
 *  - Deleting a Component results in deleting all embedded and referencing Parts and ConnectorTypes
 *
 * Revision 1.42  2007/10/27 10:49:04  chrome
 * UMLCardinality for multiplicities instead of simple flag
 *
 * Revision 1.41  2007/10/20 16:35:21  chrome
 * - corrected multiplicites for DelegationTypes
 * - added DelegationType to factory
 *
 * Revision 1.40  2007/10/19 13:37:36  chrome
 * changed package structure
 *
 * Revision 1.39  2007/10/11 15:30:31  chrome
 * First buggy version of ComponentParts
 *
 * Revision 1.38  2007/10/03 22:21:16  mgw
 * merge of port role instance with component works
 *
 * Revision 1.37  2007/04/16 14:07:49  mtt
 * readded standalone gui, compilable using Fujaba 5
 *
 * Revision 1.36  2007/01/17 10:39:09  mtt
 * fixed access-method names for _interface attributes (removed many nosuchfieldexceptions)
 *
 * Revision 1.35  2006/11/30 15:24:32  alexfupp
 * fix duplication of interface instances while loading models
 *
 * Revision 1.34  2006/11/23 09:09:39  mtt
 * organize imports
 *
 * Revision 1.33  2006/09/03 19:12:28  alexfupp
 * Fixes for becoming compatibel to Fujaba5 (using factories and using getProject instead of UMLProject.get())
 *
 * Revision 1.32  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.31  2006/08/13 20:47:27  alexfupp
 * imports organized
 *
 * Revision 1.30  2006/02/12 17:46:08  burmi
 * fixed remove action for components, componentinstances, ports, portinstances etc. (except a remaining update problem)
 *
 */
