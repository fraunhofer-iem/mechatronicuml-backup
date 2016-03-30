package org.muml.udbm;

import org.muml.udbm.clockconstraint.ComparativeClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;

public class DifferenceClockConstraint
extends ComparativeClockConstraint implements Cloneable
{
	
	
	
   /**
	 * @param value
	 * @param relationalOperator
	 * @param clockMinuend
	 * @param clockSubtrahend
	 */
	public DifferenceClockConstraint(UDBMClock clockMinuend,
			UDBMClock clockSubtrahend, RelationalOperator relationalOperator, 
			int value) {
		super(value, relationalOperator);
		setClockMinuend(clockMinuend);
		setClockSubtrahend(clockSubtrahend);
	}

/**
    * <pre>
    *                            0..n                     uses                      1 
    * DifferenceClockConstraint ------------------------------------------------------ Clock
    *                            differenceClockConstraintOfMinuend      clockMinuend 
    * </pre>
    */
   private UDBMClock clockMinuend;

   public UDBMClock getClockMinuend()
   {
      return this.clockMinuend;
   }

   protected boolean setClockMinuend(UDBMClock value)
   {
      boolean changed = false;
      if (this.clockMinuend != value)
      {
         UDBMClock oldValue = this.clockMinuend;
         
         if (this.clockMinuend != null)
         {
            this.clockMinuend = null;
            oldValue.removeFromDifferenceClockConstraintOfMinuend (this);
         }
         this.clockMinuend = value;
         if (value != null)
         {
            value.addToDifferenceClockConstraintOfMinuend (this);
         }
         changed = true;
         
      }
      return changed;
   }

   /**
    * <pre>
    *                            0..n                        uses                         1 
    * DifferenceClockConstraint ------------------------------------------------------------ Clock
    *                            differenceClockConstraintOfSubtrahend      clockSubtrahend 
    * </pre>
    */
   private UDBMClock clockSubtrahend;

   public UDBMClock getClockSubtrahend()
   {
      return this.clockSubtrahend;
   }

   protected boolean setClockSubtrahend(UDBMClock value)
   {
      boolean changed = false;
      if (this.clockSubtrahend != value)
      {
         UDBMClock oldValue = this.clockSubtrahend;
         
         if (this.clockSubtrahend != null)
         {
            this.clockSubtrahend = null;
            oldValue.removeFromDifferenceClockConstraintOfSubtrahend (this);
         }
         this.clockSubtrahend = value;
         if (value != null)
         {
            value.addToDifferenceClockConstraintOfSubtrahend (this);
         }
         changed = true;
         
      }
      return changed;
   }

   protected void removeYou()
   {
      UDBMClock tmpClockMinuend = getClockMinuend ();
      if (tmpClockMinuend != null)
      {
         setClockMinuend (null);
      }
      UDBMClock tmpClockSubtrahend = getClockSubtrahend ();
      if (tmpClockSubtrahend != null)
      {
         setClockSubtrahend (null);
      }
      super.removeYou ();
   }

   public Object clone(){
	   DifferenceClockConstraint clone = (DifferenceClockConstraint) super.clone();
	   
	   //adjust back pointer for clocks
	   clockMinuend.addToDifferenceClockConstraintOfMinuend(clone);
	   clockSubtrahend.addToDifferenceClockConstraintOfSubtrahend(clone);
	   
	   return clone;
   }
   
   public String toString(){
	   return this.getClockMinuend().getId() + "-" + this.getClockSubtrahend().getId() + this.getRelationalOperator() + this.getValue();
   }
   
   protected long hashValue(){
	   return this.toString().hashCode();
   }
   
}
