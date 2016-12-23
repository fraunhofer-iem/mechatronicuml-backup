package org.muml.udbm.clockconstraint;

import org.muml.udbm.ClockConstraint;


public class FalseClockConstraint
extends ClockConstraint implements Cloneable
{
   private final String stringRepresentation = "false";
   
   private final long hashValue = 97196323; 

   public String getStringRepresentation()
   {
      return this.stringRepresentation;
   }
   
   public Object clone(){
	   return super.clone();
   }
   
   public String toString(){
	   return stringRepresentation;
   }
   
   protected long hashValue(){
	   return hashValue;
   }

}
