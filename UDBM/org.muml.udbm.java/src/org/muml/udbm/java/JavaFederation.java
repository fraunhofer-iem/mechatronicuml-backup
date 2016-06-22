package org.muml.udbm.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.ComparativeClockConstraint;
import org.muml.udbm.clockconstraint.FalseClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;
import org.muml.udbm.clockconstraint.TrueClockConstraint;

public class JavaFederation extends Federation {

	public JavaFederation() {
		// Do nothing
	}

	/**
	 * Maps the clock to the index in the arrays of the zones. The order must be
	 * the same for all zones. The usage of a LinkedHashMap preserves the
	 * insertion order during iteration.
	 */
	protected LinkedHashMap<UDBMClock, Integer> clockNamesToIndices;

	/**
	 * Maps the array index in the zone to the clock. The order must be the same
	 * for all zones. The usage of a LinkedHashMap preserves the insertion order
	 * during iteration.
	 */
	protected LinkedHashMap<Integer, UDBMClock> indicesToClockNames;

	private HashSet<UDBMClock> clocks;

	protected JavaFederation(HashSet<UDBMClock> clocks,
			HashSet<ClockZone> clockZones) {
		this.setClockHashSet(clocks);
		indicesToClockNames = new LinkedHashMap<Integer, UDBMClock>();
		clockNamesToIndices = new LinkedHashMap<UDBMClock, Integer>();
		// add Zero clock
		UDBMClock zeroClock = new UDBMClock("zeroclock", "zeroclock");
		indicesToClockNames.put(0, zeroClock);
		clockNamesToIndices.put(zeroClock, 0);
		addToClock(zeroClock);
		// add other clocks
		for (UDBMClock clock : clocks) {
			addToClock(clock);
			int index = indicesToClockNames.size();
			indicesToClockNames.put(index, clock);
			clockNamesToIndices.put(clock, index);
		}

		for (ClockZone clockZone : clockZones) {
			if (!(clockZone instanceof JavaClockZone)) {
				throw new UnsupportedOperationException(
						"Provided ClockZone has a concrete type that cannot be processed with the Java implementation.");
			}
			addToClockZone(clockZone);
		}

		if (clockZones.size() == 0) {
			HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
			constraints.add(new TrueClockConstraint());
			addToClockZone(new JavaClockZone(constraints, clocks.size()));
		}
	}

	private void setClockHashSet(HashSet<UDBMClock> clocks) {
		this.clocks = clocks;
		
	}

	@Override
	public void and(Federation federation) {
		// intersect all zones with each other
		Iterator<JavaClockZone> outerIter = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (outerIter.hasNext()) {
			JavaClockZone outerZone = outerIter.next();
			Iterator<JavaClockZone> innerIter = (Iterator<JavaClockZone>) federation
					.iteratorOfClockZone();
			while (innerIter.hasNext()) {
				JavaClockZone innerZone = innerIter.next();
				outerZone.and(innerZone);
			}
		}

		// remove empty zones
		outerIter = (Iterator<JavaClockZone>) this.iteratorOfClockZone();
		while (outerIter.hasNext()) {
			if (outerIter.next().isEmpty())
				outerIter.remove();
		}

	}
	
	/* SergejJ: Function checks if Federation contains overloaded ClockZone
	 * - Parameter strictSubset is true: check if overloaded ClockZone is a strict subset of this Federation
	 *   - In this case the overloaded ClockZone has to be a strict subset of every! ClockZone of this Federation 
	 * - Parameter strictSubset is false: check if overloaded ClockZone is a subset of this Federation
	 *   - In this case the overloaded ClockZone has to be a subset of at least one ClockZone of this Federation 
	 */
	public boolean contains(ClockZone clockZone, boolean checkStrictSubset) {
		// New ClockZoneHashSet
		HashSet<ClockZone> ClockZonesExtended = new HashSet<ClockZone>();
		ClockZonesExtended.addAll(this.getClockZone());
		ClockZonesExtended.add(clockZone);
		
		// Copy origin Federation and add overloaded ClockZone which has to be checked
		JavaFederationFactory jff = new JavaFederationFactory();
		
		JavaFederation jfCopy = (JavaFederation) jff.createFederationFromClockZones(this.getClockHashSet(), ClockZonesExtended);
				
		if (checkStrictSubset == true){
			return checkStrictSubset(jfCopy, clockZone);
		}
		else{
			return checkSubset(jfCopy, clockZone);
		}
	}
	
	private HashSet<UDBMClock> getClockHashSet() {
		return clocks;
	}

	// Check for every ClockZone in this Federation, if overloaded ClockZone is a strict subset of this Federation
	private boolean checkStrictSubset(Federation jfCopy, ClockZone clockZone){
		Set<? extends ClockZone> clockZones = jfCopy.getClockZone();

		int containsValue;
		boolean strictSubsetIsGiven = true;
		
		// Check for every ClockZone in this Federation, if overloaded ClockZone is a subset of this Federation
		for (ClockZone cz: clockZones){
			
			containsValue = 0;
			
			// Don't compare itself 
			if (cz.hashCode() != clockZone.hashCode()){

				// thisZone.relation(givenZone)
				// 0: zones are disjunct
				// 1: givenZone part of thisZone // equals contains function
				// 2: thisZone part of givenZone
				// 3: zones are equal
				containsValue =((JavaClockZone)cz).relation((JavaClockZone) clockZone);
							
				// Only strict subsets are allowed
				if (containsValue != 1){
					return false;
				}
			}
		}

		return strictSubsetIsGiven;
	}
	
	// Check for every ClockZone in this Federation, if overloaded ClockZone is a subset of this Federation
	private boolean checkSubset(Federation jfCopy, ClockZone clockZone){
		Set<? extends ClockZone> clockZones = jfCopy.getClockZone();

		int containsValue;
		boolean booleanContains = false;
		
		// Check for every ClockZone in this Federation, if overloaded ClockZone is a subset of this Federation
		for (ClockZone cz: clockZones){
			
			containsValue = 0;
			
			// Don't compare itself 
			if (cz.hashCode() != clockZone.hashCode()){

				// thisZone.relation(givenZone)
				// 0: zones are disjunct
				// 1: givenZone part of thisZone // equals contains function
				// 2: thisZone part of givenZone
				// 3: zones are equal
				containsValue =((JavaClockZone)cz).relation((JavaClockZone) clockZone);
							
				// Check if overloaded ClockZone is equal or a subset of this Federation
				if (containsValue == 1 || containsValue == 3){
					return true;
				}
			}
		}

		return booleanContains;
	}
	
	

	@Override
	public void and(ClockConstraint constraint) {
		Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (it.hasNext()) {
			// Intersect against constraint
			JavaClockZone curZone = it.next();
			curZone.and(constraint);

			// delete zone if it became empty
			if (curZone.isEmpty()) {
				it.remove();
			}
		}
	}

	@Override
	public void and(Collection<ClockConstraint> constraints) {
		for (ClockConstraint c : constraints) {
			this.and(c);
		}
	}

	@Override
	public void applyResets(HashSet<UDBMClock> clock) {
		// reset all clocks ...
		for (UDBMClock curClock : clock) {
			// ... in all clock zones
			Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
					.iteratorOfClockZone();
			while (it.hasNext()) {
				it.next().reset(curClock);
			}
		}
	}

	@Override
	public void diagonalNormalize(HashMap<UDBMClock, Integer> maxValues,
			HashSet<DifferenceClockConstraint> clockConstraints) {
		Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();

		while (it.hasNext()) {
			JavaClockZone jcz = it.next();
			HashSet<JavaClockZone> normalizedZones = jcz.diagonalNormalize(
					maxValues, clockConstraints);
			this.removeFromClockZone(jcz);

			for (JavaClockZone normalizedZone : normalizedZones) {
				this.addToClockZone(normalizedZone);
			}
		}
	}

	// TODO: ensure zones are disjunct
	@Override
	public void down() {
		Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (it.hasNext()) {
			it.next().down();
		}
	}

	@Override
	public void relax() {
		Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (it.hasNext()) {
			it.next().relax();
		}
	}

	@Override
	public boolean equals(Federation federation) {
		// iterate all zones of this federation
		Iterator<JavaClockZone> zoneIter = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (zoneIter.hasNext()) {
			boolean found = false;
			JavaClockZone curZone = zoneIter.next();

			// compare to the zones of the parameter fed
			Iterator<JavaClockZone> otherZoneIter = (Iterator<JavaClockZone>) federation
					.iteratorOfClockZone();
			while (otherZoneIter.hasNext()) {
				JavaClockZone otherZone = otherZoneIter.next();
				if (curZone.equals(otherZone))
					found = true;
			}
			if (!found)
				return false;
		}
		return true;
	}

	@Override
	public ClockConstraint getUpperBound(UDBMClock clock) {

		// the maximum value of the clock
		int value = -1;

		// iterate all zone to obtain larger clock value
		Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (it.hasNext()) {
			int tmpValue = it.next().getUpperBound(clock);
			if (tmpValue > value)
				value = tmpValue;
		}

		if (value == -1)
			return new FalseClockConstraint();
		else if (value == Integer.MAX_VALUE)
			return new TrueClockConstraint();
		else
			return new SimpleClockConstraint(
					clock,
					JavaClockZone.isStrict(value) ? RelationalOperator.LessOperator
							: RelationalOperator.LessOrEqualOperator,
					JavaClockZone.getValue(value));
	}

	@Override
	public boolean isEmpty() {
		Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (it.hasNext()) {
			if (!(it.next().isEmpty()))
				return false;
		}
		return true;
	}

	@Override
	public void normalize(HashMap<UDBMClock, Integer> maxValues) {
		for (ClockZone clockZone : this.getClockZone()) {
			((JavaClockZone) clockZone).normalize(maxValues);
		}

	}

	@Override
	public void subtract(Federation federation) {
		HashSet<ClockZone> clockZonesToRemove = new HashSet<ClockZone>();
		HashSet<ClockZone> clockZonesToAdd = new HashSet<ClockZone>();
		for (ClockZone zone1 : this.getClockZone()) {
			for (ClockZone zone2 : federation.getClockZone()) {
				Iterator<ClockConstraint> iteratorOfClockConstraint = zone2
						.iteratorOfClockConstraint();
				while (iteratorOfClockConstraint.hasNext()) {

					ClockZone clonedZone = (ClockZone) zone1.clone();
					ClockConstraint clockConstraint = iteratorOfClockConstraint
							.next();
					ClockConstraint newClockConstraint = null;
					if (clockConstraint instanceof ComparativeClockConstraint) {
						RelationalOperator newOperator = null;
						switch (((ComparativeClockConstraint) clockConstraint)
								.getRelationalOperator()) {
						case GreaterOperator:
							newOperator = RelationalOperator.LessOrEqualOperator;
							break;
						case GreaterOrEqualOperator:
							newOperator = RelationalOperator.LessOperator;
							break;
						case LessOperator:
							newOperator = RelationalOperator.GreaterOrEqualOperator;
							break;
						case LessOrEqualOperator:
							newOperator = RelationalOperator.GreaterOperator;
							break;
						default:
							break;
						}
						if (clockConstraint instanceof SimpleClockConstraint) {
							newClockConstraint = new SimpleClockConstraint(
									((SimpleClockConstraint) clockConstraint)
											.getClock(),
									newOperator,
									((ComparativeClockConstraint) clockConstraint)
											.getValue());
						} else if (clockConstraint instanceof DifferenceClockConstraint) {
							newClockConstraint = new DifferenceClockConstraint(
									((DifferenceClockConstraint) clockConstraint)
											.getClockMinuend(),
									((DifferenceClockConstraint) clockConstraint)
											.getClockSubtrahend(),
									newOperator,
									((ComparativeClockConstraint) clockConstraint)
											.getValue());
						}
					} else if (clockConstraint instanceof TrueClockConstraint) {
						newClockConstraint = new FalseClockConstraint();
					} else if (clockConstraint instanceof FalseClockConstraint) {
						newClockConstraint = new TrueClockConstraint();
					}
					((JavaClockZone) clonedZone).and(newClockConstraint);
					if(!((JavaClockZone) clonedZone).isEmpty()){
						boolean duplicate=false;
						for(ClockZone zone:clockZonesToAdd)
							if(zone.equals(clonedZone))
								duplicate=true;
						if(!duplicate)
							clockZonesToAdd.add(clonedZone);
					}
					clockZonesToRemove.add(zone1);
				}
			}
		}
		for (ClockZone zone : clockZonesToRemove) {
			this.removeFromClockZone(zone);
		}
		for (ClockZone zone : clockZonesToAdd) {
			this.addToClockZone(zone);
		}
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Federation: \\n");
		
		Iterator<? extends ClockZone> clockZIter = this.getClockZone()
				.iterator();
		while (clockZIter.hasNext()) {
			buffer.append(clockZIter.next().toString());
			if (clockZIter.hasNext())
				buffer.append(" | ");
		}
		return buffer.toString();
	}

	// TODO: Ensure that the zones are disjunct.
	@Override
	public void up() {
		Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (it.hasNext()) {
			it.next().up();
		}

	}

	@Override
	public Object clone() {
		JavaFederation clone = (JavaFederation) super.clone();

		// copy container to prevent this container to belong to different
		// federations
		clone.clockNamesToIndices = new LinkedHashMap<UDBMClock, Integer>(
				clockNamesToIndices.size() + 5);
		Iterator<Map.Entry<UDBMClock, Integer>> it1 = this.clockNamesToIndices
				.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<UDBMClock, Integer> curEntry = it1.next();
			clone.clockNamesToIndices.put(curEntry.getKey(),
					curEntry.getValue());
		}

		// copy container to prevent this container to belong to different
		// federations
		clone.indicesToClockNames = new LinkedHashMap<Integer, UDBMClock>(
				indicesToClockNames.size() + 5);
		Iterator<Map.Entry<Integer, UDBMClock>> it2 = this.indicesToClockNames
				.entrySet().iterator();
		while (it2.hasNext()) {
			Entry<Integer, UDBMClock> curEntry = it2.next();
			clone.indicesToClockNames.put(curEntry.getKey(),
					curEntry.getValue());
		}

		return clone;
	}

	@Override
	public ClockConstraint getLowerBound(UDBMClock clock) {
		// the minimum value of the clock
		int value = Integer.MAX_VALUE;

		// iterate all zone to obtain smaller clock value
		Iterator<JavaClockZone> it = (Iterator<JavaClockZone>) this
				.iteratorOfClockZone();
		while (it.hasNext()) {
			int tmpValue = it.next().getLowerBound(clock);
			if (tmpValue < value)
				value = tmpValue;
		}

		if (value == Integer.MAX_VALUE)
			return new FalseClockConstraint();
		else if (value == -1)
			return new TrueClockConstraint();
		else
			return new SimpleClockConstraint(
					clock,
					JavaClockZone.isStrict(value) ? RelationalOperator.GreaterOperator
							: RelationalOperator.GreaterOrEqualOperator,
					-JavaClockZone.getValue(value));

	}

	@Override
	public void or(Federation federation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void or(ClockConstraint constraint) {
		// TODO Auto-generated method stub

	}

	@Override
	public void or(Collection<ClockConstraint> constraints) {
		for (ClockConstraint cc : constraints) {
			this.or(cc);
		}
	}

	public boolean zonesDisjunct() {
		boolean result = true;
		for (ClockZone cz1 : this.getClockZone()) {
			for (ClockZone cz2 : this.getClockZone()) {
				result &= ((JavaClockZone) cz1).relation(((JavaClockZone) cz2)) == 0;
			}
		}

		return result;
	}

}
