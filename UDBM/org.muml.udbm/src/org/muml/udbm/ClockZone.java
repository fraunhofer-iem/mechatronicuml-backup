package org.muml.udbm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

import org.muml.udbm.clockconstraint.TrueClockConstraint;


public class ClockZone implements Cloneable
{
	
	/**
	 * Flag indicating if a strong hash should be computed. A strong hash includes
	 * all clock constraints contained in the zone. A weak hash only considers the 
	 * clock constraints for a single clock, representing their upper and lower bounds.
	 */
	protected static boolean strongHash = true;
	
	protected PriorityQueue<Long> sortedHashes = null;
	
	/**
	 * Stores the current hash value.
	 */
	protected long hashCache = 0;

	protected boolean hashCacheValid = false;
	
	public ClockZone(Collection<ClockConstraint> clockConstraints) {
		//initialize private container
		this.sortedHashes = new PriorityQueue<Long>();
		this.hashCacheValid = false;
		
		for (ClockConstraint clockConstraint : clockConstraints) {
			addToClockConstraint(clockConstraint);
		}
		
		if(sizeOfClockConstraint()==0){
			addToClockConstraint(new TrueClockConstraint());
		}
	}
	
   /**
    * <pre>
    *            1           has           0..n 
    * ClockZone -------------------------------- ClockConstraint
    *            clockZone      clockConstraint 
    * </pre>
    */
   protected HashSet<ClockConstraint> clockConstraint;

   public boolean isEmpty(){
	   return this.clockConstraint.isEmpty();
   }

   protected boolean addToClockConstraint(ClockConstraint value)
   {
      boolean changed = false;
      if (value != null)
      {
         if (this.clockConstraint == null)
         {
            this.clockConstraint = new HashSet<ClockConstraint>(); // or FTreeSet () or FLinkedList ()
         }
         
         changed = this.clockConstraint.add (value);
         if (changed)
         {
        	// invalidate HashCache
        	hashCacheValid = false;
            value.setClockZone (this);
         }
         
      }
      return changed;
   }

   public boolean hasInClockConstraint(ClockConstraint value)
   {
      return ((this.clockConstraint != null) &&
              (value != null) &&
              this.clockConstraint.contains (value));
   }

   public Iterator<ClockConstraint> iteratorOfClockConstraint()
   {
	   if (clockConstraint == null){
		   clockConstraint = new HashSet<ClockConstraint>();
	   }
      return this.clockConstraint.iterator ();
   }

   protected void removeAllFromClockConstraint()
   {
	  // invalidate HashCache
	  hashCacheValid = false;
      ClockConstraint tmpValue;
      Iterator<ClockConstraint> it = this.clockConstraint.iterator();
      while (it.hasNext())
      {
         tmpValue = it.next();
         it.remove();
         this.removeFromClockConstraint (tmpValue);
      }
   }

   protected boolean removeFromClockConstraint(ClockConstraint value)
   {
	  // invalidate HashCache
	  hashCacheValid = false;
	  boolean changed = false;
      if ((this.clockConstraint != null) && (value != null))
      {
         
         changed = this.clockConstraint.remove (value);
         if (changed)
         {
            value.setClockZone (null);
         }
         
      }
      return changed;
   }

   public int sizeOfClockConstraint()
   {
      return ((this.clockConstraint == null)
              ? 0
              : this.clockConstraint.size ());
   }

   /**
    * <pre>
    *            0..n        has         1 
    * ClockZone --------------------------- Federation
    *            clockZone      federation 
    * </pre>
    */
   private Federation federation;

   public Federation getFederation()
   {
      return this.federation;
   }

   protected boolean setFederation(Federation value)
   {
      boolean changed = false;
      if (this.federation != value)
      {
         Federation oldValue = this.federation;
         
         if (this.federation != null)
         {
            this.federation = null;
            oldValue.removeFromClockZone (this);
         }
         this.federation = value;
         if (value != null)
         {
            value.addToClockZone (this);
         }
         changed = true;
         
      }
      return changed;
   }

   protected void removeYou()
   {
      Federation tmpFederation = getFederation ();
      if (tmpFederation != null)
      {
         setFederation (null);
      }
      removeAllFromClockConstraint ();
   }

   public Object clone(){
	   try {
		   ClockZone clone = (ClockZone) super.clone();
		   
		   //guard against NPE
		   if (this.clockConstraint != null){
			   clone.clockConstraint = new HashSet<ClockConstraint>();
			   
			   Iterator<ClockConstraint> iter = this.clockConstraint.iterator();
			   while(iter.hasNext()){
				   clone.clockConstraint.add((ClockConstraint) iter.next().clone());
			   }
		   }
		   return clone;
	   } catch (CloneNotSupportedException e) {
		   return null;
	   }
   }
   
   
   public void replaceClock(UDBMClock clockToReplace, UDBMClock newClock) {
		// invalidate HashCache
		hashCacheValid = false;
		
		//collect clock constraints to add
		ClockConstraint[] clockConstraintsToAdd = new ClockConstraint[this.sizeOfClockConstraint()];
		int i = 0;
		Iterator<ClockConstraint> constraintIter = this.iteratorOfClockConstraint();
		while (constraintIter.hasNext()) {
			ClockConstraint constraint = (ClockConstraint) constraintIter.next();
			if (constraint instanceof SimpleClockConstraint) {
				SimpleClockConstraint scc = (SimpleClockConstraint) constraint;
				if (clockToReplace == scc.getClock()) {
					clockConstraintsToAdd[i] = new SimpleClockConstraint(newClock, scc.getRelationalOperator(), scc.getValue());
					i++;
				}
			}
			else if (constraint instanceof DifferenceClockConstraint) {
				DifferenceClockConstraint dcc = (DifferenceClockConstraint) constraint;
				if (clockToReplace == dcc.getClockMinuend()) {
					clockConstraintsToAdd[i] = new DifferenceClockConstraint(newClock, dcc.getClockSubtrahend(), dcc.getRelationalOperator(), dcc.getValue());
					i++;
				}
				else if (clockToReplace == dcc.getClockSubtrahend()) {
					clockConstraintsToAdd[i] = new DifferenceClockConstraint(dcc.getClockMinuend(), newClock, dcc.getRelationalOperator(), dcc.getValue());
					i++;
				}
			}
		}
		
		// Remove all the constraints referencing the clock to be replaced.
		this.removeConstraintsOfClock(clockToReplace);
	   
		//Add all new constraints (directly adding clock constraints in previous loop 
		//causes concurrent modification exceptions)
		for(int j = 0; j < i; j++){
			this.addToClockConstraint(clockConstraintsToAdd[j]);
		}
   }
   
   public void removeConstraintsOfClock(UDBMClock clock) {
	   // invalidate HashCache
	   hashCacheValid = false;
	   
	   //collect clock constraints to delete
	   ClockConstraint[] clockConstraintsToDelete = new ClockConstraint[this.sizeOfClockConstraint()];
	   int i = 0;
	   Iterator<ClockConstraint> constraintIter = this.iteratorOfClockConstraint();
	   while (constraintIter.hasNext()) {
		   ClockConstraint constraint = (ClockConstraint) constraintIter.next();
		   if (constraint instanceof SimpleClockConstraint) {
			   SimpleClockConstraint scc = (SimpleClockConstraint) constraint;
			   if (scc.getClock() == clock) {
				   clockConstraintsToDelete[i] = scc;
				   i++;
			   }
		   }
		   else if (constraint instanceof DifferenceClockConstraint) {
			   DifferenceClockConstraint dcc = (DifferenceClockConstraint) constraint;
			   if (dcc.getClockMinuend() == clock || dcc.getClockSubtrahend() == clock) {
				   clockConstraintsToDelete[i] = dcc;
				   i++;
			   }
		   }            		
	   }
	   
	   //delete clock constraints (deleting them inside the previous loop causes concurrent modification exceptions)
	   for(int j = 0; j < i; j++){
		   clockConstraintsToDelete[j].removeYou();
	   }
	   
	   // If there are no constraints left in the clock zone we add a true
	   // constraint.
	   if (this.sizeOfClockConstraint() == 0) {
		   this.addToClockConstraint(new TrueClockConstraint());
	   }
	   
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
	   String returnString = "";
	   Iterator<ClockConstraint> iter = this.iteratorOfClockConstraint();
	   boolean firstConstraint = true;
	   while(iter.hasNext()){
		   if(!firstConstraint){
			   returnString += "&";
		   } else {
			   firstConstraint = false;
		   }
		   returnString += "(" + ((ClockConstraint)iter.next()).toString() + ")";
		   
	   }
	   return returnString;
   }
   
   protected long hashValue(){
	   //get sorted clock constraints based on hash strength
	   if(!hashCacheValid)
	   {
		   if (strongHash){
			   hashCache = computeStrongHash();
		   } else {
			   hashCache = computeWeakHash();
		   }
		   hashCacheValid = true;
	   }
	   return hashCache;

   }
   
   /**
    * Fills the {@link sortedHashes} priority queue with the hash codes of all 
    * clock constraints of this zone. For n clocks used in the zone, there will 
    * be O(n^2) clock constraints.
    */
   protected long computeStrongHash(){
	   long result = 17;
	   int multiplier = 59;
	   
	   //collect hash codes of all clock constraints
	   Iterator<ClockConstraint> iter = iteratorOfClockConstraint();
	   while(iter.hasNext()){
		   sortedHashes.add(iter.next().hashValue());
	   }
	   
	   //compute the hash based on the sorted hashes to obtain canonical representation
	   while(!sortedHashes.isEmpty()){
		   result = result * multiplier + sortedHashes.poll();
	   }
	   
	   return result;
   }
   
   /**
    * Fills the {@link sortedHashes} priority queue with the hash codes of all 
    * simple clock constraints of this zone defining upper and lower bounds
    * for the clocks. For n clocks used in the zone, there will 
    * be O(n) simple clock constraints.
    */
   protected long computeWeakHash(){
	   long result = 17;
	   int multiplier = 59;
	   
	   //collect hash codes of all clock constraints
	   Iterator<ClockConstraint> iter = iteratorOfClockConstraint();
	   while(iter.hasNext()){
		   ClockConstraint curCon = iter.next();
		   if (curCon instanceof SimpleClockConstraint)
			   sortedHashes.add(curCon.hashValue());
	   }
	   
	   //compute the hash based on the sorted hashes to obtain canonical representation
	   while(!sortedHashes.isEmpty()){
		   result = result * multiplier + sortedHashes.poll();
	   }
	   
	   return result;
   }
   
}
