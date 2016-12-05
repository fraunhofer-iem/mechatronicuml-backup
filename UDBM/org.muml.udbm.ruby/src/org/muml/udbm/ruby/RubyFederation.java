package org.muml.udbm.ruby;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.FalseClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;
import org.muml.udbm.clockconstraint.TrueClockConstraint;

public class RubyFederation extends Federation implements Cloneable{

	private static boolean rubyClientInitialized = false;

	/** Defines that the client expects a minimum constraint representation to be 
	 * returned by the server. */
	private final static boolean useMCR = false;

	private static RubyUDBMClient rubyUDBMClient = null;

	protected ArrayList<UDBMClock> orderedClocks = new ArrayList<UDBMClock>();
	
	private static RubyStringToFed rubyStringToFed;

	protected RubyFederation(HashSet<UDBMClock> clocks,
			HashSet<ClockZone> clockZones) {
		// add Zero clock
		UDBMClock zeroClock = new UDBMClock("zeroclock", "zeroclock");
		addToClock(zeroClock);
		// add other clocks
		for (UDBMClock clock : clocks) {
			addToClock(clock);
		}
		for (ClockZone clockZone : clockZones) {
			addToClockZone(clockZone);
		}

		if (clockZones.size() == 0) {
			HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
			constraints.add(new TrueClockConstraint());
			addToClockZone(new ClockZone(constraints));
		}

		// initialize ruby udbm client
		if (!rubyClientInitialized) {
			rubyUDBMClient = new RubyUDBMClient();
			try {
				rubyUDBMClient.connect();
			} catch (UnknownHostException e) {
				// should never happen
				e.printStackTrace();
			} catch (IOException e) {
				// should also not happen
				e.printStackTrace();
			}
			rubyClientInitialized = true;
			Runtime.getRuntime().addShutdownHook(
					new RubyClientServerShutdownThread(rubyUDBMClient));
		}

		update();
	}
	
	private static void setRubyStringToFed (RubyStringToFed value)
	{
		RubyFederation.rubyStringToFed = value;
	}

	private static RubyStringToFed getRubyStringToFed ()
	{
		if (rubyStringToFed == null){
			//use additional block to prevent wrong else interpretation 
			{if (useMCR){
				setRubyStringToFed(new RubyStringToMCR());
			} else
				setRubyStringToFed(new RubyStringToDBM());
			}
			}
		return RubyFederation.rubyStringToFed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_paderborn.fujaba.umlrt.udbm.Federation#addToClock(de.uni_paderborn
	 * .fujaba.umlrt.udbm.Clock)
	 */
	@Override
	protected boolean addToClock(UDBMClock value) {
		boolean changed = super.addToClock(value);
		if (changed) {
			//add to ordered clock set, insert element in sorted order
			int i = 0;
			while(i < orderedClocks.size() && orderedClocks.get(i).getId().compareTo(value.getId()) < 0){
				i++;
			}
			orderedClocks.add(i, value);
		}
		return changed;
	}
	
	@Override
	public boolean addClock(UDBMClock value){
		boolean result = super.addClock(value);
		
		if(result && this.sizeOfClockZone() > 0){
			this.and(new SimpleClockConstraint(value, RelationalOperator.EqualOperator, 0));
		}
		
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.uni_paderborn.fujaba.umlrt.udbm.Federation#removeAllFromClock()
	 */
	@Override
	protected void removeAllFromClock() {
		super.removeAllFromClock();
		orderedClocks.clear();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seede.uni_paderborn.fujaba.umlrt.udbm.Federation#removeFromClock(de.
	 * uni_paderborn.fujaba.umlrt.udbm.Clock)
	 */
	@Override
	public boolean removeFromClock(UDBMClock value) {
		boolean changed = super.removeFromClock(value);
		if (changed) {
			orderedClocks.remove(value);
			
			 // If a clock is removed from the federation the clock constraints
	        // referencing this clock should also be removed.
	        this.removeConstraintsOfClock(value);	
		}

		return changed;
	}
	
	@Override
	public boolean removeClock(UDBMClock value){
		boolean result = super.removeClock(value);
		
		//if the last clock has been removed, ensure that there only exists
		//one zone with one FalseClockConstraint
		if(this.sizeOfClock() == 0){
			this.removeAllFromClockZone();
			FalseClockConstraint fcc = new FalseClockConstraint();
			HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
			constraints.add(fcc);
			this.addToClockZone(new ClockZone(constraints));
		} else {
			update();
		}
		
		return result;
	}
	
	/**
	 * This is a helper method which removes all constraints referring to a
	 * certain clock. If all constraints are removed the true constraint is
	 * added. This is the same as what the ruby UDBM server does when there are
	 * no further constraints contained by the federation. This is required
	 * because we check different federations against equality. These might be
	 * federations given back by the UDBM server that have no constraints and
	 * also ones constructed by us. To make sure that also the ones containing
	 * no constraints are equal we have to add the true constraint.
	 * 
	 * @param clock
	 */
   private void removeConstraintsOfClock(UDBMClock clock) {
	   Iterator<? extends ClockZone> clockZoneIter = this.iteratorOfClockZone();
	   while (clockZoneIter.hasNext()) {
		   ClockZone zone = (ClockZone) clockZoneIter.next();
		   zone.removeConstraintsOfClock(clock);
	   }

   }

	public void update() {
		executeFedOperation(fedToRubySetDefinition(this).toString());
	}

	public static String constraintToRubySetDefinition(RubyFederation fed,
			ClockConstraint constraint, StringBuilder rubyConstraintString) {
		if (constraint instanceof SimpleClockConstraint) {
			SimpleClockConstraint simpleConstr = (SimpleClockConstraint) constraint;

			rubyConstraintString.append('(');
			rubyConstraintString.append(simpleConstr.getClock().getId());
			rubyConstraintString.append(simpleConstr.getRelationalOperator());
			rubyConstraintString.append(simpleConstr.getValue());
			rubyConstraintString.append(')');

		} else if (constraint instanceof DifferenceClockConstraint) {
			DifferenceClockConstraint diffConstr = (DifferenceClockConstraint) constraint;

			rubyConstraintString.append('(');
			rubyConstraintString.append(diffConstr.getClockMinuend().getId());
			rubyConstraintString.append('-');
			rubyConstraintString.append(diffConstr.getClockSubtrahend().getId());
			rubyConstraintString.append(diffConstr.getRelationalOperator());
			rubyConstraintString.append(diffConstr.getValue());
			rubyConstraintString.append(')');

		} else if (constraint instanceof TrueClockConstraint) {
			rubyConstraintString.append('(');
			//if this method is invoked from other static method, the constraint is contained in a zone and parameter fed is null
			if (constraint.getClockZone() != null){
				rubyConstraintString.append(rubyUDBMClient.getContextVariable(((RubyFederation)constraint.getClockZone().getFederation()).orderedClocks));
			} else {
				//if method is invoked from non-static method, the constraint is not contained is a zone, but parameter fed is not null
				rubyConstraintString.append(rubyUDBMClient.getContextVariable(fed.orderedClocks));
			}
			rubyConstraintString.append(".true)");

		} else if (constraint instanceof FalseClockConstraint) {
			rubyConstraintString.append('(');
			if (constraint.getClockZone() != null){
				rubyConstraintString.append(rubyUDBMClient.getContextVariable(((RubyFederation)constraint.getClockZone().getFederation()).orderedClocks));
			} else {
				//if method is invoked from non-static method, the constraint is not contained is a zone, but parameter fed is not null
				rubyConstraintString.append(rubyUDBMClient.getContextVariable(fed.orderedClocks));
			}
			rubyConstraintString.append(".false)");

		}
		return rubyConstraintString.toString();
	}

	public static void zoneToRubySetDefinition(ClockZone zone, StringBuilder zoneString) {
		zoneString.append('(');
		boolean first = true;
		for (Iterator<ClockConstraint> constrIter = zone
				.iteratorOfClockConstraint(); constrIter.hasNext();) {
			ClockConstraint constr = constrIter.next();

			if (!first) {
				zoneString.append('&');
			}

			constraintToRubySetDefinition(null, constr, zoneString);
			first = false;
		}

		zoneString.append(')');
	}

	public static StringBuilder fedToRubySetDefinition(Federation fed) {
		StringBuilder federationString = new StringBuilder(); 
		federationString.append('(');

		for (Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone(); zoneIter
		.hasNext();) {
			ClockZone zone = zoneIter.next();

			if (!(federationString.length() == 1)
					&& zone.sizeOfClockConstraint() > 0) {
				federationString.append('|');
			}

			zoneToRubySetDefinition(zone, federationString);

		}

		federationString.append(')');

		return federationString;
	}


	@Override
	public void and(Federation federation) {
		if (federation != null){
			executeFedOperation(fedToRubySetDefinition(this) + ".and!("
				+ fedToRubySetDefinition(federation) + ")");
		}
	}

	@Override
	public void and(ClockConstraint constraint) {
		if (constraint != null){
			StringBuilder command = fedToRubySetDefinition(this);
			command.append(".and!(");
			constraintToRubySetDefinition(this, constraint, command);
			command.append(')');
			executeFedOperation(command.toString());
		}
	}

	@Override
	public void and(Collection<ClockConstraint> constraints) {
		if (!constraints.isEmpty()){
			ClockZone zone = new ClockZone(constraints);
			StringBuilder command = fedToRubySetDefinition(this);
			command.append(".and!(");
			zoneToRubySetDefinition(zone, command);
			command.append(')');
			executeFedOperation(command.toString());
		}
	}

	@Override
	public void applyResets(HashSet<UDBMClock> clock) {
		for (UDBMClock curClock : clock) {
			if (hasInClock(curClock)) {
				executeFedOperation(fedToRubySetDefinition(this)
						+ ".assign_clock!(" + curClock.getId() + "," + "0"
						+ ")");
			}
		}
	}

	@Override
	public void normalize(HashMap<UDBMClock, Integer> maxValues) {
		String maxValuesRubyArrayString = createMaxValuesRubyArrayString(maxValues);

		executeFedOperation(fedToRubySetDefinition(this)
				+ ".extrapolate_max_bounds!(" + maxValuesRubyArrayString + ")");
	}

	@Override
	public void diagonalNormalize(HashMap<UDBMClock, Integer> maxValues, HashSet<DifferenceClockConstraint> clockConstraints) {
		String maxValuesRubyArrayString = createMaxValuesRubyArrayString(maxValues);

		executeFedOperation(fedToRubySetDefinition(this)
				+ ".diagonal_extrapolate_max_bounds!("
				+ maxValuesRubyArrayString + ")");
	}

	/**
	 * @param maxValues
	 */
	private String createMaxValuesRubyArrayString(
			HashMap<UDBMClock, Integer> maxValues) {
		String maxValuesRubyArrayString;
		maxValuesRubyArrayString = "[0";

		for (UDBMClock clock : orderedClocks) {
			maxValuesRubyArrayString += "," + maxValues.get(clock).intValue();
		}
		maxValuesRubyArrayString += "]";

		return maxValuesRubyArrayString;
	}

	@Override
	public void down() {
		executeFedOperation(fedToRubySetDefinition(this) + ".down!");
	}

	@Override
	public void relax(){
		executeFedOperation(fedToRubySetDefinition(this) + ".relax_all!");
	}
	
	@Override
	public boolean equals(Federation federation) {
		
		// First do a quick check whether both federations have the same set of
		// clocks. If this is not the case they cannot be equal.
		if (!this.hasSameSetOfClocksAs(federation)) {
			return false;
		}
		
		boolean condition1 = testFedProperty(fedToRubySetDefinition(this)
				+ ".fed.subtraction_empty?("
				+ fedToRubySetDefinition(federation) + ".fed)");
		boolean condition2 = testFedProperty(fedToRubySetDefinition(federation)
				+ ".fed.subtraction_empty?(" + fedToRubySetDefinition(this)
				+ ".fed)");
		return condition1 && condition2;
	}

	@Override
	public boolean isEmpty() {
		if(this.sizeOfClock() == 0){
			return true;
		}
		return testFedProperty(fedToRubySetDefinition(this) + ".empty?");
	}

	@Override
	public void subtract(Federation federation) {
		executeFedOperation(fedToRubySetDefinition(this) + "-("
				+ fedToRubySetDefinition(federation) + ")");
	}

	@Override
	public void up() {
		executeFedOperation(fedToRubySetDefinition(this) + ".up!");
	}

	private void executeFedOperation(String fedOperationRubyString) {

		try {
			rubyUDBMClient.setContext(this.orderedClocks);
			String updatedRubyFederation = rubyUDBMClient
					.executeFedOperation(fedOperationRubyString);
			rubyUDBMClient.switchToIdle();

			getRubyStringToFed().updateFromRubyFederationString(this, updatedRubyFederation);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean testFedProperty(String fedOperationRubyString) {

		try {
			rubyUDBMClient.setContext(this.orderedClocks);
			boolean fedPropertyResult = rubyUDBMClient
					.testFedProperty(fedOperationRubyString);
			rubyUDBMClient.switchToIdle();

			return fedPropertyResult;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ClockConstraint getUpperBound(UDBMClock clock) {
		
		ClockZone theZone = null;
		Iterator<? extends ClockZone> zoneIt = this.iteratorOfClockZone();
		if(!zoneIt.hasNext()){
			return new FalseClockConstraint();
		}

		boolean falseConstraint = false; //will be set to true if the zone contains a false clock constraint
		int maxClockValue = -1;
		RelationalOperator resultOp = null;
		while(zoneIt.hasNext())
		{
			theZone = zoneIt.next();
			Iterator<ClockConstraint> it = theZone.iteratorOfClockConstraint();
			boolean uBoundFoundInZone = false;
			while(it.hasNext()){
				ClockConstraint curConst = it.next();

				//check for false clock constraint
				if(curConst instanceof FalseClockConstraint){
					falseConstraint = true;
					break;
				}
				
				//upper bound has to be specified by a SimpleClockConstraint
				if(!(curConst instanceof SimpleClockConstraint)) continue;

				//search for constraint having the same clock
				SimpleClockConstraint simpleCon = (SimpleClockConstraint) curConst;
				if(simpleCon.getClock().getId().equals(clock.getId()) 
						&& (simpleCon.getRelationalOperator() == RelationalOperator.EqualOperator
								|| simpleCon.getRelationalOperator() == RelationalOperator.LessOperator
								|| simpleCon.getRelationalOperator() == RelationalOperator.LessOrEqualOperator)
				  )
				{
					//constraint represents an upper bound
					uBoundFoundInZone = true;
					falseConstraint = false;
					
					//check value
					if (simpleCon.getValue() > maxClockValue){
						maxClockValue = simpleCon.getValue();
						resultOp = simpleCon.getRelationalOperator();
					} else if (simpleCon.getValue() == maxClockValue && resultOp == RelationalOperator.LessOperator){
						resultOp = simpleCon.getRelationalOperator();
					}
					
					//skip other clock constraints, there can only be one upper bound constraint in each zone
					break;
				}
			}
			
			//if no bound for the clock has been found within the zone, the clock is unbounded
			if(!uBoundFoundInZone){
				maxClockValue = Integer.MAX_VALUE;
			}
		}
		
		if (falseConstraint){
			// no clock constraint has been found for the upper bound of the clock
			// as all zones are empty
			return new FalseClockConstraint();
		} else {
			if (maxClockValue == Integer.MAX_VALUE){
				// no clock constraint has been found for the upper bound of the clock
				// as the clock has no upper bound which is indicated by a true clock constraint
				return new TrueClockConstraint();
			} else {
				//return result with < or <= operator
				if(resultOp == RelationalOperator.EqualOperator){
					resultOp = RelationalOperator.LessOrEqualOperator;
				}
				return new SimpleClockConstraint(clock, resultOp, maxClockValue);
			}
		}

	}
		
	@Override
	public ClockConstraint getLowerBound(UDBMClock clock) {

		ClockZone theZone = null;
		Iterator<? extends ClockZone> zoneIt = this.iteratorOfClockZone();
		if(!zoneIt.hasNext()){
			return new FalseClockConstraint();
		}

		boolean falseConstraint = false; //will be set to true if the zone contains a false clock constraint
		SimpleClockConstraint resultConstraint = new SimpleClockConstraint(clock, RelationalOperator.GreaterOperator, Integer.MAX_VALUE);
		while(zoneIt.hasNext())
		{
			theZone = zoneIt.next();
			Iterator<ClockConstraint> it = theZone.iteratorOfClockConstraint();
			while(it.hasNext()){
				ClockConstraint curConst = it.next();

				//check for false clock constraint
				if(curConst instanceof FalseClockConstraint){
					falseConstraint = true;
					break;
				}
				
				//upper bound has to be specified by a SimpleClockConstraint
				if(!(curConst instanceof SimpleClockConstraint)) continue;

				//search for constraint having the same clock
				SimpleClockConstraint simpleCon = (SimpleClockConstraint) curConst;
				if(simpleCon.getClock().getId().equals(clock.getId()) 
						&& (simpleCon.getValue() < resultConstraint.getValue()
								|| (simpleCon.getValue() == resultConstraint.getValue()
									&& simpleCon.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator)
							)
				  )
				{

					//constraint must have Equal, GreaterOrEqual or Greater operator to represent an lower bound
					if (simpleCon.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator
							|| simpleCon.getRelationalOperator() == RelationalOperator.EqualOperator){
						resultConstraint = new SimpleClockConstraint(clock, RelationalOperator.GreaterOrEqualOperator, simpleCon.getValue());
						falseConstraint = false;
					} else if (simpleCon.getRelationalOperator() == RelationalOperator.GreaterOperator){
						resultConstraint = new SimpleClockConstraint(clock, RelationalOperator.GreaterOperator, simpleCon.getValue());
						falseConstraint = false;
					}
				}
			}
		}

		if (falseConstraint){
			// no clock constraint has been found for the lower bound of the clock
			// as all zones are empty
			return new FalseClockConstraint();
		} else {
			if (resultConstraint.getValue() == Integer.MAX_VALUE)
				// no clock constraint has been found for the lower bound of the clock
				// as the clock has no lower bound which is indicated by a true clock constraint
				return new TrueClockConstraint();
			else
				return resultConstraint;
		}
	}

	public Object clone() {
		RubyFederation clone = (RubyFederation) super.clone();
		
		// need to clone the clock list as otherwise two distinct 
		//clock zones would point to the same list
		clone.orderedClocks = (ArrayList<UDBMClock>)this.orderedClocks.clone();
		
		return clone;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String returnString = "";
		Iterator<? extends ClockZone> iter = this.iteratorOfClockZone();
		boolean firstZone = true;
		while (iter.hasNext()) {
			if (!firstZone) {
				returnString += "|";
			} else {
				firstZone = false;
			}
			returnString += "(" + ((ClockZone) iter.next()).toString() + ")";

		}
		return returnString;
	}

	@Override
	public void or(Federation federation) {
		if (federation != null){
			executeFedOperation(fedToRubySetDefinition(this) + ".or!("
				+ fedToRubySetDefinition(federation) + ")");
		}
	}

	@Override
	public void or(ClockConstraint constraint) {
		if (constraint != null){
			StringBuilder command = fedToRubySetDefinition(this);
			command.append(".or!(");
			constraintToRubySetDefinition(this, constraint, command);
			command.append(')');
			executeFedOperation(command.toString());
		}		
	}

	@Override
	public void or(Collection<ClockConstraint> constraints) {
		if (!constraints.isEmpty()){
			ClockZone zone = new ClockZone(constraints);
			StringBuilder command = fedToRubySetDefinition(this);
			command.append(".or!(");
			zoneToRubySetDefinition(zone, command);
			command.append(')');
			executeFedOperation(command.toString());
		}
	}
	
}
