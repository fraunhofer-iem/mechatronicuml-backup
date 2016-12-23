package org.muml.udbm;

import java.util.HashSet;
import java.util.Iterator;

public class UDBMClock
{
	/**
	 * @param id
	 * @param name
	 */
	public UDBMClock(String id, String name) {
		this.id = id;
		this.name = name;
	}

   
   private String id = "";

   public String getId()
   {
      return this.id;
   }

   private String name = "";

   public String getName()
   {
      return this.name;
   }

   /**
    * <pre>
    *        1                     uses                      0..n 
    * Clock ------------------------------------------------------ DifferenceClockConstraint
    *        clockMinuend      differenceClockConstraintOfMinuend 
    * </pre>
    */
   private HashSet<DifferenceClockConstraint> differenceClockConstraintOfMinuend;

   protected boolean addToDifferenceClockConstraintOfMinuend(DifferenceClockConstraint value)
   {
      boolean changed = false;
      if (value != null)
      {
         if (this.differenceClockConstraintOfMinuend == null)
         {
            this.differenceClockConstraintOfMinuend = new HashSet<DifferenceClockConstraint> (); // or FTreeSet () or FLinkedList ()
         }
         
         changed = this.differenceClockConstraintOfMinuend.add (value);
         if (changed)
         {
            value.setClockMinuend (this);
         }
         
      }
      return changed;
   }

   public boolean hasInDifferenceClockConstraintOfMinuend(DifferenceClockConstraint value)
   {
      return ((this.differenceClockConstraintOfMinuend != null) &&
              (value != null) &&
              this.differenceClockConstraintOfMinuend.contains (value));
   }

   public Iterator<DifferenceClockConstraint> iteratorOfDifferenceClockConstraintOfMinuend()
   {
	   if (this.differenceClockConstraintOfMinuend == null){
		   this.differenceClockConstraintOfMinuend = new HashSet<DifferenceClockConstraint>();
	   }
      return this.differenceClockConstraintOfMinuend.iterator ();
   }

   protected void removeAllFromDifferenceClockConstraintOfMinuend()
   {
      DifferenceClockConstraint tmpValue;
      Iterator<DifferenceClockConstraint> it = this.differenceClockConstraintOfMinuend.iterator();
      while (it.hasNext())
      {
         tmpValue = it.next ();
         it.remove();
         this.removeFromDifferenceClockConstraintOfMinuend (tmpValue);
      }
   }

   protected boolean removeFromDifferenceClockConstraintOfMinuend(DifferenceClockConstraint value)
   {
      boolean changed = false;
      if ((this.differenceClockConstraintOfMinuend != null) && (value != null))
      {
         
         changed = this.differenceClockConstraintOfMinuend.remove (value);
         if (changed)
         {
            value.setClockMinuend (null);
         }
         
      }
      return changed;
   }

   public int sizeOfDifferenceClockConstraintOfMinuend()
   {
      return ((this.differenceClockConstraintOfMinuend == null)
              ? 0
              : this.differenceClockConstraintOfMinuend.size ());
   }

   /**
    * <pre>
    *        1                        uses                         0..n 
    * Clock ------------------------------------------------------------ DifferenceClockConstraint
    *        clockSubtrahend      differenceClockConstraintOfSubtrahend 
    * </pre>
    */
   private HashSet<DifferenceClockConstraint> differenceClockConstraintOfSubtrahend;

   protected boolean addToDifferenceClockConstraintOfSubtrahend(DifferenceClockConstraint value)
   {
      boolean changed = false;
      if (value != null)
      {
         if (this.differenceClockConstraintOfSubtrahend == null)
         {
            this.differenceClockConstraintOfSubtrahend = new HashSet<DifferenceClockConstraint>(); // or FTreeSet () or FLinkedList ()
         }
         
         changed = this.differenceClockConstraintOfSubtrahend.add (value);
         if (changed)
         {
            value.setClockSubtrahend (this);
         }
         
      }
      return changed;
   }

   public boolean hasInDifferenceClockConstraintOfSubtrahend(DifferenceClockConstraint value)
   {
      return ((this.differenceClockConstraintOfSubtrahend != null) &&
              (value != null) &&
              this.differenceClockConstraintOfSubtrahend.contains (value));
   }

   public Iterator<DifferenceClockConstraint> iteratorOfDifferenceClockConstraintOfSubtrahend()
   {
	   if (this.differenceClockConstraintOfSubtrahend == null){
		   this.differenceClockConstraintOfSubtrahend = new HashSet<DifferenceClockConstraint>();
	   }
      return this.differenceClockConstraintOfSubtrahend.iterator ();
   }

   protected void removeAllFromDifferenceClockConstraintOfSubtrahend()
   {
      DifferenceClockConstraint tmpValue;
      Iterator<DifferenceClockConstraint> it = differenceClockConstraintOfSubtrahend.iterator();
      while (it.hasNext())
      {
         tmpValue = it.next ();
         it.remove();
         this.removeFromDifferenceClockConstraintOfSubtrahend (tmpValue);
      }
   }

   protected boolean removeFromDifferenceClockConstraintOfSubtrahend(DifferenceClockConstraint value)
   {
      boolean changed = false;
      if ((this.differenceClockConstraintOfSubtrahend != null) && (value != null))
      {
         
         changed = this.differenceClockConstraintOfSubtrahend.remove (value);
         if (changed)
         {
            value.setClockSubtrahend (null);
         }
         
      }
      return changed;
   }

   public int sizeOfDifferenceClockConstraintOfSubtrahend()
   {
      return ((this.differenceClockConstraintOfSubtrahend == null)
              ? 0
              : this.differenceClockConstraintOfSubtrahend.size ());
   }

   /**
    * <pre>
    *        1..n     has     0..n 
    * Clock ----------------------- Federation
    *        clock      federation 
    * </pre>
    */
   private HashSet<Federation> federation;

   public boolean addToFederation(Federation value)
   {
      boolean changed = false;
      if (value != null)
      {
         if (this.federation == null)
         {
            this.federation = new HashSet<Federation> (); 
         }
         
         changed = this.federation.add (value);
         if (changed)
         {
            value.addToClock (this);
         }
         
      }
      return changed;
   }

   public boolean hasInFederation(Federation value)
   {
      return ((this.federation != null) &&
              (value != null) &&
              this.federation.contains (value));
   }

   public Iterator<Federation> iteratorOfFederation()
   {
      return ((this.federation == null)
              ? new HashSet<Federation>().iterator()
              : this.federation.iterator ());
   }

   public void removeAllFromFederation()
   {
      Federation tmpValue;
      Iterator<Federation> it = this.federation.iterator();
      while (it.hasNext())
      {
         tmpValue = it.next ();
         it.remove();
         this.removeFromFederation (tmpValue);
      }
   }

   public boolean removeFromFederation(Federation value)
   {
      boolean changed = false;
      if ((this.federation != null) && (value != null))
      {
         
         changed = this.federation.remove (value);
         if (changed)
         {
            value.removeFromClock (this);
         }
         
      }
      return changed;
   }

   public int sizeOfFederation()
   {
      return ((this.federation == null)
              ? 0
              : this.federation.size ());
   }

   /**
    * <pre>
    *        1           uses            0..n 
    * Clock ---------------------------------- SimpleClockConstraint
    *        clock      simpleClockConstraint 
    * </pre>
    */
   private HashSet<SimpleClockConstraint> simpleClockConstraint;

   public boolean addToSimpleClockConstraint(SimpleClockConstraint value)
   {
      boolean changed = false;
      if (value != null)
      {
         if (this.simpleClockConstraint == null)
         {
            this.simpleClockConstraint = new HashSet<SimpleClockConstraint> (); // or FTreeSet () or FLinkedList ()
         }
         
         changed = this.simpleClockConstraint.add (value);
         if (changed)
         {
            value.setClock (this);
         }
         
      }
      return changed;
   }

   public boolean hasInSimpleClockConstraint(SimpleClockConstraint value)
   {
      return ((this.simpleClockConstraint != null) &&
              (value != null) &&
              this.simpleClockConstraint.contains (value));
   }

   public Iterator<SimpleClockConstraint> iteratorOfSimpleClockConstraint()
   {
	   if (this.simpleClockConstraint == null){
		   this.simpleClockConstraint = new HashSet<SimpleClockConstraint>();
	   }
      return this.simpleClockConstraint.iterator ();
   }

   protected void removeAllFromSimpleClockConstraint()
   {
      SimpleClockConstraint tmpValue;
      Iterator<SimpleClockConstraint> it = this.simpleClockConstraint.iterator();
      while (it.hasNext())
      {
         tmpValue = it.next ();
         it.remove();
         this.removeFromSimpleClockConstraint (tmpValue);
      }
   }

   protected boolean removeFromSimpleClockConstraint(SimpleClockConstraint value)
   {
      boolean changed = false;
      if ((this.simpleClockConstraint != null) && (value != null))
      {
         
         changed = this.simpleClockConstraint.remove (value);
         if (changed)
         {
            value.setClock (null);
         }
         
      }
      return changed;
   }

   public int sizeOfSimpleClockConstraint()
   {
      return ((this.simpleClockConstraint == null)
              ? 0
              : this.simpleClockConstraint.size ());
   }

   protected void removeYou()
   {
      removeAllFromFederation ();
      removeAllFromDifferenceClockConstraintOfMinuend ();
      removeAllFromSimpleClockConstraint ();
      removeAllFromDifferenceClockConstraintOfSubtrahend ();
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
	   return name + ":" + id;
   }
   
   

}
