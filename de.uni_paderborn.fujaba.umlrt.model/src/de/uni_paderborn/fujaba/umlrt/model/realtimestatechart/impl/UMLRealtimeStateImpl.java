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
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLComplexRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;


/**
 * UMLClass: 'UMLRealtimeState'.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3315 $
 * @created   $Date: 2008-12-17 17:24:29 +0100 (Mi, 17 Dez 2008) $
 * @generated
 */
public class UMLRealtimeStateImpl implements UMLRealtimeState {
	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeTransition> getOutgoingUMLRealtimeTransitionss(){return null;}

	/**
	 * @generated
	 */
	public java.util.List<UMLRealtimeTransition> getIncomingUMLRealtimeTransitionss(){return null;}

	/**
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart(){return null;}

	/**
	 * @generated
	 */
	public String getName(){return null;}

	/*
	 * User defined.
	 */
	
   /**
    * Get the parentElement attribute of the UMLRealtimeState object
    *
    * @return   The parentElement value
    */
   public UMLRealtimeStatechart getParentElement()
   {
      return getUMLRealtimeStatechart();
   }

   /**
    * Get the longName attribute of the UMLRealtimeState object
    *
    * @return   The longName value
    */
   public String getLongName()
   {
      String s = "";
      UMLRealtimeStatechart rtsc = getUMLRealtimeStatechart();
      while (rtsc != null)
      {
         String dummy = rtsc.getName();
         s = dummy + "_" + s;
         UMLComplexRealtimeState cs = rtsc.getUMLComplexRealtimeState();
         rtsc = null;
         if (cs != null)
         {
            rtsc = cs.getUMLRealtimeStatechart();
         }
      }
      s += getName();
      return s;
   }


   /**
    * No comment provided by developer, please add a comment to ensure improve documentation.
    */
   private static int uniqueNameId = 0;


   /**
    * UMLMethod: '+ setName (newName: String): Void'.
    *
    * @param newName  The new name value
    */
   public void setName (String newName)
   {
//	   //avoid the name ""
//	  if ("".equals(newName))
//	   	  return;
//	   
//	  if (newName == null)
//      {
//         newName = "State" + uniqueNameId;
//         uniqueNameId++;
//      }
//      
//      if ( (this.name == null) ||  (this.name != null && !this.name.equals (newName)))
//      {
//         String oldName = this.name;
//         this.name = newName;
//         firePropertyChange ("name", oldName, newName);
//      } // if
   }


   /**
    * Get the rootRealtimeStatechart attribute of the UMLRealtimeState object
    *
    * @return   The rootRealtimeStatechart value
    */
   public UMLRealtimeStatechart getRootRealtimeStatechart()
   {
	   return null;
//      UMLRealtimeStatechart rtsc = getUMLRealtimeStatechart();
//      UMLComplexRealtimeState state = rtsc.getUMLComplexRealtimeState();
//      if (state == null)
//      {
//         return rtsc;
//      }
//      else
//      {
//         return state.getRootRealtimeStatechart();
//      }
   }

}

/*
 * $Log$
 * Revision 1.32  2008/12/17 16:24:29  chrisheinzemann
 * removed dead code
 *
 * Revision 1.31  2008/12/14 08:59:55  alhawash
 * avoiding NPE when calling removeYou()-method and removes incoming and outgoing transitions
 *
 * Revision 1.30  2008/12/09 11:28:03  cytom
 * cleanups + removed warnings
 *
 * Revision 1.29  2008/11/19 13:39:13  alhawash
 * adding comment to FPropHashSets "uMLRealTimeTransition" and "uMLRealTimeTransition1", so that incoming- and outgoing-transitions can be easier identified.
 *
 * Revision 1.28  2008/06/22 15:31:38  crowdy
 * add missing class "UMLRealtimeEventInstanceOfMessageType" and changes for the new messageTypes
 * previous changes see logs
 *
 * Revision 1.27.2.2  2008/05/24 11:21:00  crowdy
 * avoid possible NullPointerException if trying to set the name ""
 *
 * Revision 1.27.2.1  2008/05/21 18:52:24  crowdy
 * avoid the name "" for a complex state name
 *
 * Revision 1.27  2007/06/15 14:12:05  mtt
 * fixed problem, when a transition is connected to another state by
 * moving trans.removeYou() call from removeFromTransition() to removeYou()
 *
 * Revision 1.26  2007/01/03 20:41:56  alexfupp
 * removed constraints because they are not used
 *
 * Revision 1.25  2006/11/30 18:40:24  aseibel
 * removing a state should imply removing all connected transitions
 *
 * Revision 1.24  2006/07/20 21:54:02  mtt
 * next bunch of factories
 *
 * Revision 1.23  2006/07/20 20:03:36  mtt
 * first bunch of factories
 *
 * Revision 1.22  2006/07/19 18:46:03  mtt
 * changed import declarations to Fujaba 5 package structure
 *
 * Revision 1.21  2006/03/02 08:38:23  mtt
 * added getParentElement-Method
 *
 */
