package org.muml.udbm;


public abstract class ClockConstraint implements Cloneable
{
   /**
    * <pre>
    *                  0..n           has           1 
    * ClockConstraint -------------------------------- ClockZone
    *                  clockConstraint      clockZone 
    * </pre>
    */
   private ClockZone clockZone;

   public ClockZone getClockZone()
   {
      return this.clockZone;
   }

   protected boolean setClockZone(ClockZone value)
   {
      boolean changed = false;
      if (this.clockZone != value)
      {
         ClockZone oldValue = this.clockZone;
         
         if (this.clockZone != null)
         {
            this.clockZone = null;
            oldValue.removeFromClockConstraint (this);
         }
         this.clockZone = value;
         if (value != null)
         {
            value.addToClockConstraint (this);
         }
         changed = true;
         
      }
      return changed;
   }

   protected void removeYou()
   {
      ClockZone tmpClockZone = getClockZone ();
      if (tmpClockZone != null)
      {
         setClockZone (null);
      }
   }
   
   public Object clone(){
	   try {
		   return super.clone();
	   } catch (CloneNotSupportedException e) {
		   return null;
	   }
   }
   
   public abstract String toString();
   
   protected abstract long hashValue();

}
