package org.muml.udbm;

import org.muml.udbm.clockconstraint.ComparativeClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;

public class SimpleClockConstraint
extends ComparativeClockConstraint implements Cloneable
{
	/**
	 * @param clock
	 * @param relationalOperator
	 * @param value
	 */
	public SimpleClockConstraint(UDBMClock clock, RelationalOperator relationalOperator,
			int value) {
		super(value, relationalOperator);
		setClock(clock);
	}

	/**
    * <pre>
    *                        0..n           uses            1 
    * SimpleClockConstraint ---------------------------------- Clock
    *                        simpleClockConstraint      clock 
    * </pre>
    */
   private UDBMClock clock;

   public UDBMClock getClock()
   {
      return this.clock;
   }

   protected boolean setClock(UDBMClock value)
   {
      boolean changed = false;
      if (this.clock != value)
      {
         UDBMClock oldValue = this.clock;
         
         if (this.clock != null)
         {
            this.clock = null;
            oldValue.removeFromSimpleClockConstraint (this);
         }
         this.clock = value;
         if (value != null)
         {
            value.addToSimpleClockConstraint (this);
         }
         changed = true;
         
      }
      return changed;
   }

   protected void removeYou()
   {
      UDBMClock tmpClock = getClock ();
      if (tmpClock != null)
      {
         setClock (null);
      }
      super.removeYou ();
   }

   public Object clone(){
	   SimpleClockConstraint clone = (SimpleClockConstraint) super.clone();
	   
	   //adjust back pointer
	   clock.addToSimpleClockConstraint(clone);
	   
	   return clone;
   }
   
   public String toString(){
	   return this.getClock().getId() + this.getRelationalOperator() + this.getValue();
   }
   
   protected long hashValue(){
	   return this.toString().hashCode();
   }
   
}
