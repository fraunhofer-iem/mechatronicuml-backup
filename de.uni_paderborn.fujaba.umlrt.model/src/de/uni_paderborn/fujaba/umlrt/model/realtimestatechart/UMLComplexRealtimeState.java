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

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;


/**
 * UMLClass: 'UMLComplexRealtimeState'.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3462 $
 * @created   $Date: 2009-02-13 14:53:37 +0100 (Fr, 13 Feb 2009) $
 * 
 * @model
 */
public interface UMLComplexRealtimeState extends UMLRealtimeState
{
	/**
	 * @model
	 */
   public java.util.List<UMLRealtimeStatechart> getUMLRealtimeStatecharts();

	/**
	 * @model
	 */
   public UMLRealtimeAction getUMLRealtimeDoAction();

	/**
	 * @model
	 */
   public UMLRealtimeAction getUMLRealtimeExitAction();

	/**
	 * @model
	 */
   public UMLRealtimeAction getUMLRealtimeEntryAction();

	/**
	 * @model
	 */
   public boolean getCommitted();

   /**
	 * @model
	 */
   public ReconfDiagram getReconfDiagram();

	/**
	 * @model
	 */
   public java.util.List<UMLComplexRealtimeState> getInterfacedStates();

	/**
	 * @model
	 */
   public UMLComplexRealtimeState getInterfaceState();
}

/*
 * $Log$
 * Revision 1.35  2009/02/13 13:53:37  chrisheinzemann
 * removed many compile warnings by making use of generics and removing unused variables
 *
 * Revision 1.34  2009/02/13 10:29:36  chrisheinzemann
 * Natural Numbers are created using the factories, now
 * this removes many exceptions and warning on creation and serialization of the objects and while setting the attributes
 *
 * Revision 1.33  2009/01/26 16:50:10  cytom
 * fixed erros with wcet-document path:
 * In fujaba-standalone it pointed normally to "plugins/RealtimeStatechart/wcet.xml". In F4E the path to wcet.xml cant specified relative without knowledge of eclipse-details and it may be inside a jar-archive so the path had to be changed at startup.
 * Badly the absolut path was saved to the model, this is fixed now. Only when the user changes the path it get saved to the model, in other cases the default-path to wcet.xml is used.
 *
 * Revision 1.32  2008/12/09 11:28:03  cytom
 * cleanups + removed warnings
 *
 * Revision 1.31  2007/06/18 22:16:48  mtt
 * fixed removal of actions in states
 * added gui for adding and removing clock resets to actions in states
 *
 * Revision 1.30  2007/02/21 15:36:15  mtt
 * removed old demo fix to enable correct period calculation
 *
 * Revision 1.29  2007/01/03 20:41:56  alexfupp
 * removed constraints because they are not used
 *
 * Revision 1.28  2006/11/30 18:40:24  aseibel
 * removing a state should imply removing all connected transitions
 *
 * Revision 1.27  2006/08/16 22:01:01  alexfupp
 * more changes to use factories
 *
 * Revision 1.26  2006/08/16 21:06:16  alexfupp
 * changed to use factories
 * and a few fixes for errors caused by switch to fujaba5
 *
 * Revision 1.25  2006/08/13 21:29:42  alexfupp
 * changed to use factories
 *
 * Revision 1.24  2006/07/20 20:03:36  mtt
 * first bunch of factories
 *
 * Revision 1.23  2005/09/12 06:02:07  burmi
 * adjustment for pattern support
 *
 */
