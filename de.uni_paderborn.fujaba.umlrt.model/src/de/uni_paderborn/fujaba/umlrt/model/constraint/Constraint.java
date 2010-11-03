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
package de.uni_paderborn.fujaba.umlrt.model.constraint;



	/**
	 * @model
	 */
public interface Constraint // extends UMLConstraint

//XXX :am was UMLDiagramItem, but UMLConstraint is an UMLDiagramItem
//This leads to Constraints beeing aplicapble to UMLIncrements 
//also this makes it possible to use one Constraint to many UMLIncrements (does this cause trouble?)
{

	//TODO :am overwrite addToIncrements to make sure only one Increment is allowed 
	
	/**
	 * @model
	 */
   public boolean getBackground();

	/**
	 * @model
	 */
   public boolean getIsInternalConstraint();

	/**
	 * @model
	 */
   public boolean getExtendAutomatically();

	/**
	 * @model
	 */
   public Correctness getCorrectness();

	/**
	 * CTL, TCTL, ....
	 * @model
	 */
   public String getType();


   public static enum Correctness
   {
      UNKNOWN,
      CORRECT,
      UNSAFE,
      FALSE
   }   
}

/*
 * $Log$
 * Revision 1.23  2008/06/24 14:40:23  cytom
 * moved all functionality from RTCommentary to Constraint and made RTCommentary deprecated,
 * new fields of Constraint can be edited via PropertiesView,
 * don't create new objects every 500ms in ModelCheckerObserver,
 * execute propertyChange-method of ConstraintFigure asynchronously,
 * prevented some NPEs,
 * removed some debug println's
 *
 * Revision 1.22  2008/06/19 12:02:54  cytom
 * api-changes/-fixes in umlrt2: ConstraintApplicable is an obsolete subset of already implemented FIncrement, so some similar/equal fields/methods exists two times in Constraint and Component with slightly different name, in this first step they get deprecated, next step is to remove them ...
 *
 * Revision 1.21  2008/06/04 16:22:02  cytom
 * further properties of Constraint can be edited via Properties-Tab
 *
 * Revision 1.20  2008/06/04 14:36:21  cytom
 * fixed removeYou: added removeAllFromTargets()
 *
 * Revision 1.19  2008/05/30 20:29:58  cytom
 * next stept to constraints on components
 *
 * Revision 1.18  2008/05/29 16:23:27  cytom
 * first version of constraints on components
 *
 * Revision 1.17  2008/04/03 16:27:44  cytom
 * parameterized FHashset of targets
 *
 * Revision 1.16  2008/04/03 16:12:24  cytom
 * fixed: attribute text was declared two times, in super-class UMLConstraint and in Constraint, removed attribute in Constraint
 *
 * Revision 1.15  2007/08/23 19:25:42  mahirsch
 * porting to fujaba5
 *
 * Revision 1.14  2007/04/16 14:07:48  mtt
 * readded standalone gui, compilable using Fujaba 5
 *
 * Revision 1.13  2007/02/14 09:40:51  alexfupp
 * Adjustments to work with fujaba4eclipse.pattern.ui
 *
 * Revision 1.12  2006/11/23 09:09:39  mtt
 * organize imports
 *
 * Revision 1.11  2006/08/23 21:06:12  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.10  2006/08/23 13:03:58  alexfupp
 * changed to use factories (Fujaba5)
 *
 * Revision 1.9  2006/08/13 20:47:31  alexfupp
 * imports organized
 *
 * Revision 1.8  2006/08/12 10:25:23  burmi
 * adjustments
 *
 * Revision 1.7  2005/11/30 15:56:17  serti
 * Constraints are correct removed
 *
 */
