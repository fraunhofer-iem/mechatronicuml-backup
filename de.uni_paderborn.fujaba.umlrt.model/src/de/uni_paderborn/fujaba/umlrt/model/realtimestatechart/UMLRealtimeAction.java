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
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;




/**
 * UMLClass: 'UMLRealtimeAction'.
 *
 * @author    $Author: cytom $
 * @version   $Revision: 3555 $
 * @created   $Date: 2009-03-22 01:08:17 +0100 (So, 22 Mrz 2009) $
 * 
 * @model
 */
public interface UMLRealtimeAction // extends UMLRealtimeStatechartVisitorElement // extends UMLDiagramItem
{

	/**
	 * @model
	 */
   public String getId();

	/**
	 * @model
	 */
   public String getActionType();

	/**
	 * @model
	 */
   public String getAction();

	/**
	 * @model
	 */
   public long getPeriodUpperBound();

	/**
	 * @model
	 */
   public long getPeriodLowerBound();

	/**
	 * @model
	 */
   public Long getWcet();

	/**
	 * @model
	 */
   public boolean getWcetSpecifiedByUser();

	/**
	 * @model
	 */
   public String getWcetName();

	/**
	 * @model
	 */
   public boolean getDisplayValuation();

	/**
	 * @model
	 */
   public long getBlocking();

	/**
	 * @model
	 */
   public UMLRealtimeTransition getUMLRealtimeTransition();

	/**
	 * @model
	 */
   public UMLComplexRealtimeState getRevUMLRealtimeDoAction();

	/**
	 * @model
	 */
   public UMLComplexRealtimeState getRevUMLRealtimeEntryAction();

	/**
	 * @model
	 */
   public UMLComplexRealtimeState getRevUMLRealtimeExitAction();

	/**
	 * @model
	 */
   public java.util.List<UMLClockResetAtom> getUMLClockResetAtoms();
}

/*
 * $Log$
 * Revision 1.24  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.23  2008/07/02 15:08:42  crowdy
 * removed unused imports
 *
 * Revision 1.22  2007/06/18 22:16:48  mtt
 * fixed removal of actions in states
 * added gui for adding and removing clock resets to actions in states
 *
 * Revision 1.21  2007/06/18 17:04:30  mtt
 * support for clock resets on actions
 *
 * Revision 1.20  2006/08/16 21:06:16  alexfupp
 * changed to use factories
 * and a few fixes for errors caused by switch to fujaba5
 *
 * Revision 1.19  2006/08/13 21:29:42  alexfupp
 * changed to use factories
 *
 * Revision 1.18  2006/07/19 19:10:22  mtt
 * removed extension to class UMLAction since this class is not part of Fujaba 5 anymore
 *
 * Revision 1.17  2006/07/19 18:46:03  mtt
 * changed import declarations to Fujaba 5 package structure
 *
 * Revision 1.16  2005/09/01 08:36:39  aseibel
 * improved realtimestatechart cloning
 *
 */
