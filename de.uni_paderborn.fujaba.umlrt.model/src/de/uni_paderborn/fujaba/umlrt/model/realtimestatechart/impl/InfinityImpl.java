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

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Infinity;



/**
 * @author    Administrator
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 * @version   $Revision: 654 $ $Date: 2004-09-14 13:53:41 +0200 (Di, 14 Sep 2004) $
 * @generated
 */
public class InfinityImpl implements Infinity
{

	/*
	 * User-defined methods.
	 */
	
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public byte byteValue()
   {
      System.out.println ("Infinity is no byte value!");
      return Byte.MAX_VALUE;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public double doubleValue()
   {
      System.out.println ("Infinity is not a double value!");
      return Double.MAX_VALUE;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public float floatValue()
   {
      System.out.println ("Infinity is not a float value!");
      return Float.MAX_VALUE;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public int intValue()
   {
      System.out.println ("Infinity is not a int value!");
      return Integer.MAX_VALUE;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public long longValue()
   {
      //System.out.println ("Infinity is not a long value!");
      return Long.MAX_VALUE;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public short shortValue()
   {
      System.out.println ("Infinity is not a short value!");
      return Short.MAX_VALUE;
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public String toString()
   {
      return "inf";
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param o  No description provided
    * @return   No description provided
    */
   public boolean equals (Object o)
   {
      return  (o instanceof InfinityImpl);
   }

}

/*
 * $Log$
 * Revision 1.2  2004/09/14 11:53:41  burmi
 * sb: relatred work
 *
 */
