package org.muml.udbm;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class Federation implements Cloneable
{
	
	  /**
	    * <pre>
	    *           0..n     has     0..n
	    * Federation ------------------------- Clock
	    *           federation               clock
	    * </pre>
	    */
	   public static final String PROPERTY_CLOCK = "clock";

	   /**
	    * Key = UDBMClock.id, Value = the clock itself
	    */
	   private HashMap<String, UDBMClock> clock;

	   public boolean addClock(UDBMClock value){
		   return addToClock(value);
	   }
	   
	   protected boolean addToClock (UDBMClock value)
	   {
	      boolean changed = false;

	      if (this.getClock() == null)
	      {
	         this.setClock(new HashMap<String, UDBMClock> ());
	      }
	   
	      UDBMClock oldValue = (UDBMClock) this.getClock().put (value.getId(), value);
	      if (oldValue != value)
	      {
	         if (oldValue != null)
	         {
	            oldValue.removeFromFederation (this);
	         }
	         if (value != null)
	         {
	            value.addToFederation (this);
	         }
	         changed = true;
	      }
	   
	      return changed;
	   }
	   
	   public Iterator<? extends UDBMClock> iteratorOfClock ()
	   {
		   if (this.getClock() == null){
			   this.setClock(new HashMap<String, UDBMClock> ());
		   }
	      return this.getClock().values ().iterator ();
	   }

	   public int sizeOfClock ()
	   {
	      return ((this.getClock() == null)
	              ? 0
	              : this.getClock().size ());
	   }

	   public boolean hasInClock (UDBMClock value)
	   {
	      return ((this.getClock() != null) &&
	              (value != null) && 
	              (this.getClock().get(value.getId()) == value));
	   }
	   
	   public UDBMClock getFromClock(String clockID){
		   if(this.getClock() != null){
			   return this.getClock().get(clockID);
		   } else {
			   return null;
		   }
	   }
	   
	   public boolean removeClock(UDBMClock value){
		   return removeFromClock(value);
	   }

	   protected boolean removeFromClock (UDBMClock value)
	   {
	      boolean changed = false;

	      if (this.getClock() != null && value != null)
	      {
	         UDBMClock oldValue = (UDBMClock) this.getClock().get (value.getId());
	         if (oldValue == value && 
	             (oldValue != null || this.getClock().containsKey (value.getId())))
	         {
	         
	            this.getClock().remove (value.getId());
	            if (value != null)
	            {
	               value.removeFromFederation (this);
	            }
	            changed = true;
	         
	         }
	      }
	      return changed;
	   }
	   
	   protected void removeAllFromClock (){
		   while (!this.getClock().isEmpty())
		   {
			   UDBMClock value = this.getClock().values().iterator().next();
			   removeFromClock (value);
		   }
	   }
	   
	   /**
	    * <pre>
	    *           1     has     0..n
	    * Federation ------------------------- ClockZone
	    *           federation               clockZone
	    * </pre>
	    */
	   public static final String PROPERTY_CLOCK_ZONE = "clockZone";

	   protected HashSet<ClockZone> clockZone;

	   public Set<? extends ClockZone> getClockZone()
	   {
		   if (this.clockZone == null){
			   this.clockZone = new HashSet<ClockZone> ();
		   }
	      return Collections.unmodifiableSet(this.clockZone);
	   }

	   public boolean addToClockZone (ClockZone value)
	   {
	      boolean changed = false;

	      if (value != null)
	      {
	         if (this.clockZone == null)
	         {
	            this.clockZone = new HashSet<ClockZone> ();

	         }
	      
	         changed = this.clockZone.add (value);
	         if (changed)
	         {
	            value.setFederation (this);
	         }
	      
	      }
	      return changed;
	   }

	   public boolean removeFromClockZone (ClockZone value)
	   {
	      boolean changed = false;

	      if ((this.clockZone != null) && (value != null))
	      {
	      
	         changed = this.clockZone.remove (value);
	         if (changed)
	         {
	            value.setFederation (null);
	         }
	      
	      }
	      return changed;
	   }

	   public void removeAllFromClockZone (){
	   
	      ClockZone tmpValue;
	      Iterator<ClockZone> it = this.clockZone.iterator();
	      while (it.hasNext())
	      {
	         tmpValue = it.next();
	         it.remove();
	         this.removeFromClockZone (tmpValue);
	      }
	   
	   }

	   public boolean hasInClockZone (ClockZone value)
	   {
	      return ((this.clockZone != null) &&
	              (value != null) &&
	              this.clockZone.contains (value));
	   }

	   public Iterator<? extends ClockZone> iteratorOfClockZone ()
	   {
		   if (this.clockZone == null){
			   this.clockZone = new HashSet<ClockZone> ();
		   }
	      return this.clockZone.iterator ();
	   }

	   public int sizeOfClockZone ()
	   {
	      return ((this.clockZone == null)
	              ? 0
	              : this.clockZone.size ());
	   }

   public abstract void or (Federation federation);
	   
   public abstract void or (ClockConstraint constraint);
   
   public abstract void or (Collection<ClockConstraint> constraints);
   
   public abstract void and(Federation federation);

   public abstract void and(ClockConstraint constraint);
   
   public abstract void and(Collection<ClockConstraint> constraints);
   
   /**
    * Sets all clocks contained in the HashSet given as a parameter to 0.
    * @param clock
    */
   public abstract void applyResets(HashSet<UDBMClock> clock);

   /**
    * Normalize the federation. Use this function if difference constraints
    * are contained in this federation. This function is more costly than
    * normalize().
    * @param maxValues the maximum value for each clock occuring in a clock constraint 
    * @param clockConstraints all DifferenceClockConstraints
    */
   public abstract void diagonalNormalize(HashMap<UDBMClock,Integer> maxValues, HashSet<DifferenceClockConstraint> clockConstraints);

   /**
    * Removes the lower bounds of all clocks, if possible, while keeping the clock differences.
    * After calling down, a clock will have the lower bound 0 unless a higher lower bound is
    * required by any difference constraint.
    */
   public abstract void down();

   /**
    * Check whether this federation is equal to the federation given as a parameter.
    * @param federation
    * @return
    */
   public abstract boolean equals(Federation federation);

   /**
    * Check whether the federation is empty.
    * @return
    */
   public abstract boolean isEmpty();

   /**
    * Normalize the federation. Use this function if no difference constraints
    * are contained in this federation.
    * @param maxValues the maximum value for each clock occuring in a clock constraint 
    */
   public abstract void normalize(HashMap<UDBMClock,Integer> maxValues);

   public abstract void subtract(Federation federation);

   /**
    * Let time pass in the federation. Letting time pass is basically implemented by
    * removing the upper bounds of all clocks while keeping the clock differences.
    */
   public abstract void up();
   
   /**
    * Relaxes the boolean operators used in the clock constraints of this federation.
    * A less operator will be relaxed to less or equal, a greater operator will be 
    * relaxed to greater or equal.
    */
   public abstract void relax();
   
   /**
    * Returns the upper bound that the {@link UDBMClock} <emph>clock</emph> given
    * as a parameter has in any zone of this federation.  
    * @param clock a clock contained in this federation
    * @return 
    */
   public abstract ClockConstraint getUpperBound(UDBMClock clock);
 
   /**
    * Returns the lower bound that the {@link UDBMClock} <emph>clock</emph> given
    * as a parameter has in any zone of this federation.  
    * @param clock a clock contained in this federation
    * @return 
    */
   public abstract ClockConstraint getLowerBound(UDBMClock clock);
   
   /**
    * Returns a clone of this federation. The clocks will not be cloned along with
    * the federation. The reason is that clocks can occur in more than one federation 
    * without any problems. 
    */
   public Object clone(){
	   try {
		Federation clone = (Federation) super.clone();
		
		// add the clone to the federation set of the clocks and 
		//generate new Hashset as otherwise two distinct federations
		//would point to the same hashset
		HashMap<String, UDBMClock> clocks = new HashMap<String, UDBMClock>();
		clocks.putAll(clone.getClock());
		clone.setClock(clocks);
		
		Iterator<UDBMClock> clockIt = clone.getClock().values().iterator();
		while(clockIt.hasNext()){
			clockIt.next().addToFederation(clone);
		}
		
		//clone all zones
		clone.clockZone =  new HashSet<ClockZone> () ;
		
		if (clone.clockZone != null){
			Iterator<ClockZone> it = this.clockZone.iterator();
			while(it.hasNext()){
				clone.addToClockZone((ClockZone)it.next().clone());
			}
		}
		
		return clone;
	} catch (CloneNotSupportedException e) {
		return null;
	}
   }
   
   public Object superClone(){
	   try {
		Federation clone = (Federation) super.clone();
		return clone;
	} catch (CloneNotSupportedException e) {
		return null;
	}
   }
   
   public void removeYou()
   {
      removeAllFromClockZone ();
      removeAllFromClock ();
   }
   
   public abstract String toString();

	/**
	 * If the federation contains the clock to replace this clock is replaced
	 * by the new clock. The constraints are changed accordingly. If the
	 * federation does not contain the clock nothing is done.
	 * 
	 * @param clockToReplace
	 * @param newClock
	 */
	public void replaceClock(UDBMClock clockToReplace, UDBMClock newClock) {
		
		// Only do something if the clock to replace exists in the federation.
		if (this.hasInClock(clockToReplace)) {
			
			// Get all the constraints concerning the clock which shall be
			// replaces and save them in a container.
			Iterator<? extends ClockZone> zoneIter = this.iteratorOfClockZone();
			while (zoneIter.hasNext()) {
				ClockZone zone = (ClockZone) zoneIter.next();
				zone.replaceClock(clockToReplace, newClock);
			}
			
			//remove clock to replace and add newClock instead
			this.removeFromClock(clockToReplace);
			this.addToClock(newClock);
		}
		
	}

	/**
	 * This method is a helper method for the equals method. It checks whether
	 * two federations have the same set of clocks. If they don't they cannot
	 * be equal. This check has to be done before the UDBM server is asked for
	 * equality because it crashes when two federations with different sets of
	 * clocks are passed to it.
	 * 
	 * @param federation
	 * @return
	 */
	public boolean hasSameSetOfClocksAs(Federation federation) {
		
		
		return this.hasAllClocksOf(federation) && federation.hasAllClocksOf(this);
	}
	
	private boolean hasAllClocksOf(Federation federation) {
		boolean missingClockFound = false;
		Iterator<? extends UDBMClock> clockIter = this.iteratorOfClock();
		while (!missingClockFound && clockIter.hasNext()) {
			UDBMClock currentClock = (UDBMClock) clockIter.next();
			missingClockFound = !federation.hasInClock(currentClock);
		}
		return !missingClockFound;
	}

	protected long hashValue(){
		long result = 0;
		Iterator<? extends ClockZone> iter = this.iteratorOfClockZone();
		while(iter.hasNext()){
			result = result + iter.next().hashValue();
		}
		return result;
	}
	
	public long getFullHash(){
		return hashValue();
	}

	public HashMap<String, UDBMClock> getClock() {
		return clock;
	}

	public void setClock(HashMap<String, UDBMClock> clock) {
		this.clock = clock;
	}
}
