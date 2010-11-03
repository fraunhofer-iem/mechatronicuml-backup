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

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Infinity;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.NaturalNumber;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3595 $ $Date: 2009-04-04 11:01:17 +0200 (Sa, 04 Apr 2009) $
 * @generated
 */
public class NaturalNumberImpl implements NaturalNumber // extends ASGElement
{
	/**
	 * @generated
	 */
	public boolean isInfinity(){return false;}

	
	/*
	 * User-defined methods.
	 */
	
	
   /**
    * Sets the value attribute of the NaturalNumber object, causes the infinity 
    * property to be set to false.
    *
    * @param o  The new value
    */
   public void setValue (long o)
   {
//      value = o;
//      setInfinity(false);
   }

   /**
    * Sets the value attribute of the NaturalNumber object, causes the infinity 
    * property to be set to true.
    * 
    * @param o The new value
    */
   public void setValue(Infinity o){
	   setInfinity (true);
   }
   
   /**
    * Sets the value attribute of the NaturalNumber object, causes the infinity 
    * property to be set to false.
    *
    * @param o  The new value
    */
   public void setValue (String o)
   {
//		String str = (String) o;
//		if (str.toLowerCase().startsWith("inf"))
//		{
//			setInfinity (true);
//		}
//		else
//		{
//	      Long l = new Long (str);
//	      value = l.longValue();
//	      setInfinity(false);
//		}
   }

   /**
    * Get the value attribute of the NaturalNumber object as a long value.
    *
    * @return   The value value
    */
   public long getValue()
   {
	   return 0;
//      if (getInfinity())
//      {
//         return Long.MAX_VALUE;
//      }
//      return value;
   }

   /**
    * Get the value attribute of the NaturalNumber object as an object. If
    * {@link isInfinity} returns true, this function will return an
    * an {@link Infinity} object. Otherwise the result will be a Long.
    * @return
    */
   public EObject getValueAsObject(){
	   return null;
//	   if(isInfinity()){
//		   return new Infinity();
//	   } else {
//		   return new Long(value);
//	   }
   }

   /**
    * Sets the infinity attribute of the NaturalNumber object
    *
    * @param inf  The new infinity value
    */
   public void setInfinity (boolean inf)
   {
//      infinity = inf;
   }


   /**
    *Constructor for class NaturalNumber
    */
//   public NaturalNumberImpl(FProject project, boolean persistent) {
//	   super(project, persistent);
//   }

   /**
    * Returns true if this number is less than the NaturalNumber n.
    *
    * @param n  the NaturalNumber which should be compared to this one
    * @return   <b>true</b>, if this number is less than n, 
    * 			<b>false</b>, if this number is greater or equal n 
    */
   public boolean isLessThan (NaturalNumber n)
   {
	   return false;
//      if (this.getInfinity())
//      {
//         return false;
//      }
//      if (!this.getInfinity() && n.getInfinity())
//      {
//         return true;
//      }
//      return  (this.longValue() < n.longValue());
   }

   /**
    * Returns true if this number is less than or equal to the NaturalNumber n.
    * @param n the NaturalNumber which should be compared to this one.
    * @return <b>true</b>, if this number is less or equal n,
    * 		  <b>false</b>, if this number is greater than n
    */
//   public boolean isLessOrEqualThan(NaturalNumber n){
//	   return isLessThan(n) || equals(n);
//   }

   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public long longValue()
   {
	   return 0;
//      if (!getInfinity())
//      {
//         return value;
//      }
//      return Long.MAX_VALUE;
   }


   /*
    *  public byte byteValue()
    *  {
    *  return value.byteValue();
    *  }
    *  public double doubleValue()
    *  {
    *  return value.doubleValue();
    *  }
    *  public float floatValue()
    *  {
    *  return value.floatValue();
    *  }
    *  public int intValue()
    *  {
    *  return value.intValue();
    *  }
    *  public short shortValue()
    *  {
    *  return value.shortValue();
    *  }
    */
   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @return   No description provided
    */
   public String toString()
   {
	   return null;
//      if (isInfinity())
//      {
//         return  (new Infinity()).toString();
//      }
//      return  (new Long (value)).toString();
   }


   /**
    * No comment provided by developer, please add a comment to improve documentation.
    *
    * @param o  No description provided
    * @return   No description provided
    */
   public boolean equals (Object o)
   {
//      if ( (o instanceof Infinity) &&  (isInfinity()))
//      {
//         return true;
//      }
//      if (o instanceof NaturalNumber)
//      {
//         NaturalNumber nn = (NaturalNumber) o;
//         if ( (nn.isInfinity()) &&  (isInfinity()))
//         {
//            return true;
//         }
//         if ( (nn.isInfinity()) &&  (!isInfinity()))
//         {
//            return false;
//         }
//         if ( (!nn.isInfinity()) &&  (isInfinity()))
//         {
//            return false;
//         }
//         if ( (!nn.isInfinity()) &&  (!isInfinity()))
//         {
//            return  (nn.longValue() == longValue());
//         }
//      }
//      if (o instanceof Number)
//      {
//         Number n = (Number) o;
//         if ( (isInfinity()))
//         {
//            return false;
//         }
//         if ( (!isInfinity()))
//         {
//            return  (n.longValue() == longValue());
//         }
//      }
      return false;
   }

}

/*
 * $Log$
 * Revision 1.7  2009/02/13 10:29:36  chrisheinzemann
 * Natural Numbers are created using the factories, now
 * this removes many exceptions and warning on creation and serialization of the objects and while setting the attributes
 *
 * Revision 1.6  2009/01/22 10:42:03  chrisheinzemann
 * new helper function for natural number and one comment added
 *
 * Revision 1.5  2007/04/27 08:22:28  mtt
 * allow "inf" as argument in setValue()
 *
 * Revision 1.4  2006/02/18 23:25:13  mtt
 * fixes for invariant atoms
 *
 */
