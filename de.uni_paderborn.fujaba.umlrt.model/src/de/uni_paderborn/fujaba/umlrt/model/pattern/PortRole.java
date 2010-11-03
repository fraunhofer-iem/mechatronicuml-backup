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
package de.uni_paderborn.fujaba.umlrt.model.pattern;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.umlrt.model.component.Interface;
import de.uni_paderborn.fujaba.umlrt.model.instance.Assembly;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortRoleInstance;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: cajudosu $
 * @version   $Revision: 1.23 $ $Date: 2009/01/09 16:48:38 $
 * 
 * @model
 */
public interface PortRole // extends UMLIncrement
{
	/**
	 * @model
	 */
   public String getName();

	/**
	 * @model
	 */
   public boolean getMulti();

	/**
	 * @model
	 */
   public Assembly getAssembly();

	/**
	 * @model
	 */
   public Channel getChannel();

	/**
	 * @model
	 */
   public Pattern getPattern();

	/**
	 * @model
	 */
   public PatternDiagram getPatternDiagram();

	/**
	 * @model
	 */
   public java.util.List<Interface> getInterfaces();

	/**
	 * @model
	 */
   public java.util.List<PortRoleInstance> getPortRoleInstances();

	/**
	 * @model
	 */
   public UMLRealtimeStatechart getUMLRealtimeStatechart();

	/**
	 * @model
	 */
   public EClass getEClass();// UMLClass getUMLClass();

	/**
	 * @model
	 */
   public EClass getMessageInterface();// MessageInterface getMessageInterface();

}
   
/*
 * $Log: PortRole.java,v $
 * Revision 1.23  2009/01/09 16:48:38  cajudosu
 * * Added field for interface.
 *
 * Revision 1.22  2008/06/19 12:02:53  cytom
 * api-changes/-fixes in umlrt2: ConstraintApplicable is an obsolete subset of already implemented FIncrement, so some similar/equal fields/methods exists two times in Constraint and Component with slightly different name, in this first step they get deprecated, next step is to remove them ...
 *
 * Revision 1.21  2007/10/09 22:07:55  mgw
 * added multi attribute to PortRole and changed editparts and figures of PortRole and PortRoleInstance to visualize it.
 *
 * Revision 1.20  2007/04/16 14:07:52  mtt
 * readded standalone gui, compilable using Fujaba 5
 *
 * Revision 1.19  2007/02/14 09:40:51  alexfupp
 * Adjustments to work with fujaba4eclipse.pattern.ui
 *
 * Revision 1.18  2007/01/17 10:39:10  mtt
 * fixed access-method names for _interface attributes (removed many nosuchfieldexceptions)
 *
 * Revision 1.17  2007/01/03 21:05:45  alexfupp
 * some small changes needed for fujaba4eclipse.umlrt2.pattern.ui
 *
 * Revision 1.16  2006/11/23 09:09:39  mtt
 * organize imports
 *
 * Revision 1.15  2006/09/03 19:12:28  alexfupp
 * Fixes for becoming compatibel to Fujaba5 (using factories and using getProject instead of UMLProject.get())
 *
 * Revision 1.14  2006/09/03 13:13:06  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.13  2006/08/13 20:47:28  alexfupp
 * imports organized
 *
 * Revision 1.12  2005/12/01 15:11:59  aseibel
 * duplicated channels cant be created
 *
 */
