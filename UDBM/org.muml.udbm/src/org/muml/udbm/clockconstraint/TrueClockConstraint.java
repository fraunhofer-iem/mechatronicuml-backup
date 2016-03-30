package org.muml.udbm.clockconstraint;

import org.muml.udbm.ClockConstraint;


public class TrueClockConstraint
extends ClockConstraint implements Cloneable
{
   private final String stringRepresentation = "true";
   
   private final long hashValue = 3569038;

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
