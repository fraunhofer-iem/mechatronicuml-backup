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

import de.uni_paderborn.fujaba.umlrt.model.instance.PatternInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortRoleInstance;


/**
 * Represent one Software component diagram.
 * 
 * @author    strauss
 * @version   $Revision: 3120 $ $Date: 2008-07-22 18:05:04 +0200 (Di, 22 Jul 2008) $
 */
	/**
	 * @model
	 */
public interface ComponentDiagram  // extends ASGDiagram

{

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
   public java.util.List<Component> getComponents();

	/**
	 * @model
	 */
   public java.util.List<Interface> get_interfaces();

	/**
	 * @model
	 */
   public java.util.List<Port> getPorts();

//	/**
//	 * @model
//	 */
//   public UMLClassDiagram getUMLClassDiagram();

	/**
	 * @model
	 */
   public java.util.List<PatternInstance> getPatternInstances();

	/**
	 * @model
	 */
   public java.util.List<PortRoleInstance> getPortRoleInstances();

}

/*
 * $Log$
 * Revision 1.33  2008/07/22 16:05:04  chrisheinzemann
 * update of component diagram name is correctly propagated to the view (Patch by Tobias Eckardt)
 *
 * Revision 1.32  2008/07/16 14:36:51  chrisheinzemann
 * if a component diagram is deleted, the components in the diagram are deleted as well
 *
 * Revision 1.31  2008/07/09 15:15:41  cytom
 * deprecated the 1 to n association ComponentDiagram[components ----- componentDiagram]Component, instead the n to m association FDiagram[elements ----- diagrams]FElement is used
 * to ease programming the methods Component.getFirstComponentDiagram() and ComponentDiagram.getFirstComponent() are added
 *
 * Revision 1.30  2008/06/24 14:40:24  cytom
 * moved all functionality from RTCommentary to Constraint and made RTCommentary deprecated,
 * new fields of Constraint can be edited via PropertiesView,
 * don't create new objects every 500ms in ModelCheckerObserver,
 * execute propertyChange-method of ConstraintFigure asynchronously,
 * prevented some NPEs,
 * removed some debug println's
 *
 * Revision 1.29  2008/06/02 12:57:40  chrisheinzemann
 * adopted to generic iterators
 *
 * Revision 1.28  2008/05/13 14:24:19  chrisheinzemann
 * improved javadoc documentation
 *
 * Revision 1.27  2007/12/10 17:57:34  mtt
 * fixed bug #988
 *
 * Revision 1.26  2007/02/14 09:40:52  alexfupp
 * Adjustments to work with fujaba4eclipse.pattern.ui
 *
 * Revision 1.25  2007/01/17 10:39:08  mtt
 * fixed access-method names for _interface attributes (removed many nosuchfieldexceptions)
 *
 * Revision 1.24  2006/11/23 09:09:39  mtt
 * organize imports
 *
 * Revision 1.23  2006/09/03 19:12:28  alexfupp
 * Fixes for becoming compatibel to Fujaba5 (using factories and using getProject instead of UMLProject.get())
 *
 * Revision 1.22  2006/09/03 13:13:05  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.21  2006/08/13 20:47:27  alexfupp
 * imports organized
 *
 * Revision 1.20  2006/02/12 17:46:08  burmi
 * fixed remove action for components, componentinstances, ports, portinstances etc. (except a remaining update problem)
 *
 */
