package org.muml.udbm.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaFederation extends Federation {
	private Logger logger = LoggerFactory.getLogger(JavaFederation.class);
	
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
		
		if (clockNamesToIndices.containsKey("zeroclock") == false && indicesToClockNames.containsValue("zeroclock") == false){
			// add Zero clock
			UDBMClock zeroClock = new UDBMClock("zeroclock", "zeroclock");
			indicesToClockNames.put(0, zeroClock);
			clockNamesToIndices.put(zeroClock, 0);
			addToClock(zeroClock);
		}
		// add other clocks
		for (UDBMClock clock : clocks) {
			if (clock.getName() != "zeroclock"){
				addToClock(clock);
				int index = indicesToClockNames.size();
				indicesToClockNames.put(index, clock);
				clockNamesToIndices.put(clock, index);
			}
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
	public void and(Federation original) {
		JavaFederation federation = (JavaFederation) original.clone();
		
		// Skip and operation if this federation is empty or false
		if (this.isEmpty() || this.isFalseFederation()){
			return;
		}
		
		// If overloaded Federation is false, this will lead to a false Federation
		if (federation.isEmpty() || ((JavaFederation) federation).isFalseFederation()){
			this.removeAllFromClockZone();
			Iterator<? extends ClockZone> federationCZIT = federation.iteratorOfClockZone();
			while (federationCZIT.hasNext()){
				JavaClockZone jcz = (JavaClockZone) federationCZIT.next();
				this.addToClockZone(jcz);
			}
			return;
		}
		
		// intersect all zones with each other
		Iterator<?> outerIter = (Iterator<?>) this.iteratorOfClockZone();
		while (outerIter.hasNext()) {
			JavaClockZone outerZone = (JavaClockZone) outerIter.next();
			Iterator<?> innerIter = (Iterator<?>) federation.iteratorOfClockZone();
			while (innerIter.hasNext()) {
				JavaClockZone innerZone = (JavaClockZone) innerIter.next();
				outerZone.and(innerZone, this.getClockHashSet());
			}
		}

		// remove empty zones
		outerIter = (Iterator<?>) this.iteratorOfClockZone();
		while (outerIter.hasNext()) {
			if (((JavaClockZone) outerIter.next()).isEmpty())
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
		JavaFederation jfUseCopiedClockZones = (JavaFederation) this.clone();
		ClockZonesExtended.addAll(jfUseCopiedClockZones.getClockZone());
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
	
	// SergejJ: Function checks for overloaded Federation if it is a (strict) subset of this Federation
	public boolean contains(JavaFederation javaFederation, boolean checkStrictSubset){
		// Check first if overloaded Federation is a TrueFederation or a FalseFederation
		if (checkStrictSubset == true){
			if (javaFederation.isTrueFederation()){
				return false;
			}
			
			if (javaFederation.isFalseFederation()){
				if (this.isFalseFederation() == false){
					return true;
				}
				else {
					return false;
				}
			}
		}
		else {
			if (javaFederation.isTrueFederation()){
				if (this.isTrueFederation()){
					return true;
				}
				else {
					return false;
				}
			}
			
			if (javaFederation.isFalseFederation()){
				return true;
			}
		}
	
		
		JavaFederation jfCopy = (JavaFederation) javaFederation.clone();
				
		Set<? extends ClockZone> clockZones = jfCopy.getClockZone();
		
		ClockZone czCopy;
		
		boolean booleanContains = true;
		
		for (ClockZone clockZone: clockZones){
			czCopy = (ClockZone) clockZone.clone();
			booleanContains = this.contains(czCopy, checkStrictSubset);
			if (booleanContains == false){
				return false;
			}
		}
				
		return true;
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
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		while (it.hasNext()) {
			// Intersect against constraint
			JavaClockZone curZone = (JavaClockZone) it.next();
//			logger.debug("###     Current zone: " + curZone);
			if (constraint instanceof FalseClockConstraint){
				// curZone and FalseClockConstraint results in emptyZone
				logger.debug("###     Remove *** Current zone and FalseClockConstraint: " + curZone);
				
				curZone.applyResets(getClockHashSet());
				it.remove();				
			}
			else {
				curZone.and(constraint);
				logger.debug("###     Current zone and constraint: " + curZone);
				
				// delete zone if it became empty
				if (curZone.isEmpty()) {
					logger.debug("###     Remove *** Current zone and constraint: " + curZone);
					
					curZone.applyResets(getClockHashSet());
					it.remove();
				}
			}
		}
//		logger.debug("###     Federation and constraint: " + this.toString());
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
			Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
			while (it.hasNext()) {
				((JavaClockZone) it.next()).reset(curClock);
			}
		}
	}

	@Override
	public void diagonalNormalize(HashMap<UDBMClock, Integer> maxValues,
			HashSet<DifferenceClockConstraint> clockConstraints) {
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();

		while (it.hasNext()) {
			JavaClockZone jcz = (JavaClockZone) it.next();
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
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		while (it.hasNext()) {
			((JavaClockZone) it.next()).down();
		}
	}

	@Override
	public void relax() {
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		while (it.hasNext()) {
			((JavaClockZone) it.next()).relax();
		}
	}

	@Override
	public boolean equals(Federation federation) {
		// iterate all zones of this federation
		Iterator<?> zoneIter = (Iterator<?>) this.iteratorOfClockZone();
		while (zoneIter.hasNext()) {
			boolean found = false;
			JavaClockZone curZone = (JavaClockZone) zoneIter.next();

			// compare to the zones of the parameter fed
			Iterator<?> otherZoneIter = (Iterator<?>) federation.iteratorOfClockZone();
			while (otherZoneIter.hasNext()) {
				JavaClockZone otherZone = (JavaClockZone) otherZoneIter.next();
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
		int value = Integer.MIN_VALUE;

		// iterate all zone to obtain larger clock value
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		while (it.hasNext()) {
			int tmpValue = ((JavaClockZone) it.next()).getUpperBound(clock);
			
			// positive clock values (or clock differences)
			if (tmpValue >= 0){
				if (tmpValue > value){
					value = tmpValue;
				}
			}
			// negative clock values (or clock differences)
			else {
				if (value == Integer.MIN_VALUE){
					value = (-1)*value;
				}
				if (tmpValue < value){
					value = tmpValue;
				}
			}
				
		}
		
		if (value == Integer.MIN_VALUE || value == -Integer.MAX_VALUE  )
			return new FalseClockConstraint();
		else if (value == Integer.MAX_VALUE || value == -Integer.MIN_VALUE)
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
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		JavaClockZone cz;
		while (it.hasNext()) {
			cz = (JavaClockZone)it.next();
			if (!cz.isEmpty()){
				return false;
			}
		}
		return true;
	}
	
	/*
	 * A Federation is a TrueFederation, if it only consists of true clock constrains
	 */
	public boolean isTrueFederation(){		
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		JavaClockZone cz;
		boolean returnValue = false;
		while (it.hasNext()) {
			cz = (JavaClockZone)it.next();
			if (cz.containsOnlyTrueClockConstraints() == true){
				returnValue = true;
			}
			else{
				return false;
			}
		}
		return returnValue;
	}
	
	/*
	 * A Federation is a FalseFederation, if it only consists of false clock constrains
	 */
	public boolean isFalseFederation(){		
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		JavaClockZone cz;
		boolean returnValue = false;
		boolean clockZoneFound = false;
		while (it.hasNext()) {
			clockZoneFound = true;
			cz = (JavaClockZone)it.next();
			if (cz.containsOnlyFalseClockConstraints() == true){
				returnValue = true;
			}
			else{
				return false;
			}
		}
		
		if (clockZoneFound == false){
			return true;
		}
		
		return returnValue;
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
		return this.createFederationString(this);
//		StringBuffer buffer = new StringBuffer();
//		buffer.append("Federation: \n");
//		
//		Iterator<? extends ClockZone> clockZIter = this.getClockZone()
//				.iterator();
//		while (clockZIter.hasNext()) {
//			buffer.append(clockZIter.next().toString());
//			if (clockZIter.hasNext())
//				buffer.append("\n");
//		}
//		return buffer.toString();
	}
	
	public String createFederationString(JavaFederation original) {
		JavaFederation federation = (JavaFederation) original.clone();
		if (federation.sizeOfClockZone() >= 1) {
			Map<UDBMClock, SimpleClockConstraint> clock2lowerBound = new HashMap<>();
			Map<UDBMClock, SimpleClockConstraint> clock2upperBound = new HashMap<>();
			Map<List<UDBMClock>, DifferenceClockConstraint> clockPair2bound = new HashMap<>();

			ClockZone zone = federation.iteratorOfClockZone().next();
			Iterator<ClockConstraint> ccIt = zone.iteratorOfClockConstraint();
			while (ccIt.hasNext()) {
				ClockConstraint cc = ccIt.next();
				if (cc instanceof SimpleClockConstraint) {
					SimpleClockConstraint scc = (SimpleClockConstraint) cc;
					if (scc.getRelationalOperator().toString().contains(">"))
						clock2lowerBound.put(scc.getClock(), scc);
					else if (scc.getRelationalOperator().toString()
							.contains("<"))
						clock2upperBound.put(scc.getClock(), scc);
				} else if (cc instanceof DifferenceClockConstraint) {
					DifferenceClockConstraint dcc = (DifferenceClockConstraint) cc;
					List<UDBMClock> clockPair = new LinkedList<UDBMClock>();
					clockPair.add(dcc.getClockMinuend());
					clockPair.add(dcc.getClockSubtrahend());
					clockPair2bound.put(clockPair, dcc);
				}
			}
			StringBuilder sb = new StringBuilder();
			boolean notEmpty = false;
			Iterator<? extends UDBMClock> clockIt = federation
					.iteratorOfClock();
			while (clockIt.hasNext()) {
				UDBMClock clock = clockIt.next();
				if (clock.getId().equals("zeroclock"))
					continue;
				SimpleClockConstraint lb = clock2lowerBound.get(clock);
				SimpleClockConstraint ub = clock2upperBound.get(clock);
				if (lb != null || ub != null) {
					if (ub == null) {
						sb.append(clock.getName());
						sb.append(lb.getRelationalOperator());
						sb.append(lb.getValue());
//						sb.append(", ");
					} else if (lb == null) {
						sb.append(clock.getName());
						sb.append(ub.getRelationalOperator());
						sb.append(ub.getValue());
						sb.append(", ");
					} else if (ub.getRelationalOperator().toString()
							.contains("=")
							&& lb.getRelationalOperator().toString()
									.contains("=")
							&& ub.getValue() == lb.getValue()) {
						sb.append(clock.getName());
						sb.append("=");
						sb.append(lb.getValue());
//						sb.append(", ");
					} else {
						if (lb != null) {
							sb.append(lb.getValue());
							sb.append(lb.getRelationalOperator().toString()
									.replace('>', '<'));
						}
						sb.append(clock.getName());
						sb.append(ub.getRelationalOperator());
						sb.append(ub.getValue());
						sb.append(", ");
					}
					if (clockIt.hasNext()){
//						sb.append(", ");
					}
					notEmpty = true;
				}
			}
			if (notEmpty){
//				sb.append("\n");
			}
			clockIt = federation.iteratorOfClock();
			while (clockIt.hasNext()) {
				UDBMClock clock = clockIt.next();
				if (clock.getId().equals("zeroclock"))
					continue;
				boolean notEmpty2 = false;
				Iterator<? extends UDBMClock> clockIt2 = federation
						.iteratorOfClock();
				while (clockIt2.hasNext()) {
					UDBMClock clock2 = clockIt2.next();
					if (clock2.getId().equals("zeroclock"))
						continue;
					List<UDBMClock> clockPair = new LinkedList<>();
					clockPair.add(clock);
					clockPair.add(clock2);
					DifferenceClockConstraint dcc = clockPair2bound
							.remove(clockPair);
					List<UDBMClock> oppositeClockPair = new LinkedList<>();
					oppositeClockPair.add(clock2);
					oppositeClockPair.add(clock);
					DifferenceClockConstraint oppositeDcc = clockPair2bound
							.remove(oppositeClockPair);
					if (dcc != null || oppositeDcc != null) {
						if (dcc != null && oppositeDcc != null
								&& dcc.getValue() == 0
								&& oppositeDcc.getValue() == 0) {
							sb.append(dcc.getClockMinuend().getName());
							sb.append("=");
							sb.append(dcc.getClockSubtrahend().getName());
							sb.append(", ");
						} else {
							if (dcc != null) {
								sb.append(dcc.toString());
//								sb.append(", ");
							}
							if (dcc != null && oppositeDcc != null){
								sb.append(", ");
							}
							if (oppositeDcc != null) {
								sb.append(oppositeDcc.toString());
								sb.append(", ");
							}
						}
						if (clockIt2.hasNext()){
//							sb.append("\n");
						}
						notEmpty2 = true;
					}
				}
				if (notEmpty2 && clockIt.hasNext()){
//					sb.append("\n");
				}
			}

			if (sb.length() != 0){
				return sb.toString().replace("_0", "");
			}
			else{
				return "true\n";
			}
		} else{
			return "false\n";
		}
	}

	// TODO: Ensure that the zones are disjunct.
	@Override
	public void up() {
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		while (it.hasNext()) {
			((JavaClockZone) it.next()).up();
		}

	}

	@Override
	public Object clone() {
		JavaFederation clone = (JavaFederation) super.superClone();
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
			Iterator<? extends ClockZone> it = this.iteratorOfClockZone();
			while(it.hasNext()){
				clone.addToClockZone((JavaClockZone) it.next().clone());
			}
		}
		

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
		Iterator<?> it = (Iterator<?>) this.iteratorOfClockZone();
		while (it.hasNext()) {
			
			int tmpValue = ((JavaClockZone) it.next()).getLowerBound(clock);
			
			// positive clock values (or clock differences)
			if (tmpValue >= 0){
				if (tmpValue < value){
					value = tmpValue;
				}
			}
			// negative clock values (or clock differences)
			else {
				if (value == Integer.MAX_VALUE){
					value = (-1)*value;
				}
				if (tmpValue > value){
					value = tmpValue;
				}
			}
		}

		if (value == Integer.MAX_VALUE || value == -Integer.MIN_VALUE)
			return new FalseClockConstraint();
		else if (value == Integer.MIN_VALUE || value == -Integer.MAX_VALUE)
			return new TrueClockConstraint();
		else
			return new SimpleClockConstraint(
					clock,
					JavaClockZone.isStrict(value) ? RelationalOperator.GreaterOperator
							: RelationalOperator.GreaterOrEqualOperator,
					-JavaClockZone.getValue(value));

	}
	
	

//	public Federation createUnion(Federation fedAoriginal, Federation fedBoriginal) {
//		Federation fedA = (Federation) fedAoriginal.clone();
//		Federation fedB = (Federation) fedBoriginal.clone();
//		
//		Iterator<? extends UDBMClock> fedAClockIt = fedA.iteratorOfClock();
//		Iterator<? extends UDBMClock> fedBClockIt = fedB.iteratorOfClock();
//		
//		// Extract Clocks from fedA and fedB
//		HashSet<UDBMClock> unionClocks = new HashSet<UDBMClock>();
//		while (fedAClockIt.hasNext()){
//			UDBMClock fedACurrentClock = fedAClockIt.next();
//			if (!unionClocks.contains(fedACurrentClock)){
//				unionClocks.add(fedACurrentClock);
//			}
//		}
//		while (fedBClockIt.hasNext()){
//			UDBMClock fedBCurrentClock = fedBClockIt.next();
//			if (!unionClocks.contains(fedBCurrentClock)){
//				unionClocks.add(fedBCurrentClock);
//			}
//		}
//		
//		HashSet<ClockZone> unionClockZones = new HashSet<ClockZone>();
//		
//		// Extract ClockZones from fedA and fedB
//		unionClockZones.addAll(fedA.getClockZone());
//		unionClockZones.addAll(fedB.getClockZone());
//		
//		fedA.removeYou();
//		fedB.removeYou();
//		
//		JavaFederation unionFed = new JavaFederation(unionClocks, unionClockZones);
//		
//		return unionFed;
//	}
	
//	// Alternative to method or, TODO: Fix bugs in relation to getLowerBound and getUpperBound methods
//	public Federation createUnion(Federation fedBref) {
//		Federation fedA = (Federation) this.clone();
//		Federation fedB = (Federation) fedBref.clone();
//		
//		Iterator<? extends UDBMClock> fedAClockIt = fedA.iteratorOfClock();
//		Iterator<? extends UDBMClock> fedBClockIt = fedB.iteratorOfClock();
//		
//		// Extract Clocks from fedA and fedB
//		HashSet<UDBMClock> unionClocks = new HashSet<UDBMClock>();
//		while (fedAClockIt.hasNext()){
//			UDBMClock fedACurrentClock = fedAClockIt.next();
//			if (!unionClocks.contains(fedACurrentClock)){
//				unionClocks.add(fedACurrentClock);
//			}
//		}
//		while (fedBClockIt.hasNext()){
//			UDBMClock fedBCurrentClock = fedBClockIt.next();
//			if (!unionClocks.contains(fedBCurrentClock)){
//				unionClocks.add(fedBCurrentClock);
//			}
//		}
//		
//		HashSet<ClockZone> unionClockZones = new HashSet<ClockZone>();
//		
//		// Extract ClockZones from fedA and fedB
//		unionClockZones.addAll(fedA.getClockZone());
//		unionClockZones.addAll(fedB.getClockZone());
//		
//		fedA.removeYou();
//		fedB.removeYou();
//		
//		JavaFederation unionFed = new JavaFederation(unionClocks, unionClockZones);
//
//		return unionFed;
//	}
	
	@Override
	public void or(ClockConstraint constraint) {
		// Skip not relevant constraint
		if (constraint instanceof FalseClockConstraint){
			return;
		}
		
		Iterator<? extends ClockZone> czIt = this.iteratorOfClockZone();
		
		if (constraint instanceof TrueClockConstraint){
			// Remove all clock Zones
			while (czIt.hasNext()){
				JavaClockZone currentJCZ = (JavaClockZone) czIt.next();
				czIt.remove();
			}
		}
		// Add overloaded ClockConstraint to this Federation
		HashSet<ClockConstraint> ccHS = new HashSet<ClockConstraint>();
		ccHS.add(constraint);
		JavaClockZone cz = new JavaClockZone(ccHS, 1);
		this.addToClockZone(cz);
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

	@Override
	public void or(Federation federation) {
		if (federation != null && !federation.isEmpty() && !((JavaFederation)federation).isFalseFederation()){
 			// Optimization: Remove all ClockZones, if overloaded value is a TrueFederation
			if (((JavaFederation)federation).isTrueFederation()){
 				// Remove all ClockZones from this Federation
				Iterator<?> czIt = (Iterator<?>) federation.iteratorOfClockZone();
				while (czIt.hasNext()) {
					JavaClockZone cz = (JavaClockZone) czIt.next();
					czIt.remove();
				}
			}
 			
			// Extract ClockConstraints of overloaded Federation and put them in every ClockZone of this Federation
			Iterator<?> czIT = (Iterator<?>) federation.iteratorOfClockZone();
			// Iterate over ClockZones of overloaded Federation
			while (czIT.hasNext()) {
				JavaClockZone jcz = (JavaClockZone) czIT.next();
				Iterator<?> ccIT = (Iterator<?>) jcz.iteratorOfClockConstraint();
				// Iterate over ClockConstraints of current ClockZone of overloaded Federation
				while (ccIT.hasNext()) {
					ClockConstraint cc = (ClockConstraint) ccIT.next();
					Iterator<?> thisCZIT = this.iteratorOfClockZone();
					// Iterate over every ClockZone in this Federation and add current ClockConstraint of
					// current ClockZone of overloaded Federation to current ClockZone of this Federation
					while (((Iterator<?>) thisCZIT).hasNext()) {
						JavaClockZone thisJCZ = (JavaClockZone) thisCZIT.next();
						// Does ClockConstraint_old.and(cc)
						thisJCZ.or(cc);
					}
				}
			}
	
			// remove empty zones
			czIT = (Iterator<?>) this.iteratorOfClockZone();
			while (czIT.hasNext()) {
				if (((JavaClockZone) czIT.next()).isEmpty())
					czIT.remove();
			}
		}
	}
	
//	@Override
//	public void or(Federation federation) {
//		if (federation != null && !federation.isEmpty() && !((JavaFederation)federation).isFalseFederation()){
// 			// Optimization: Remove all ClockZones, if overloaded value is a TrueFederation
//			if (((JavaFederation)federation).isTrueFederation()){
// 				// Remove all ClockZones from this Federation
//				Iterator<?> czIt = (Iterator<?>) federation.iteratorOfClockZone();
//				while (czIt.hasNext()) {
//					JavaClockZone cz = (JavaClockZone) czIt.next();
//					czIt.remove();
//				}
//			}
// 			
//			// Add JavaClockZones from overloaded JavaFederation to this JavaFederation 
//			Iterator<?> czIT = (Iterator<?>) federation.iteratorOfClockZone();
//			while (czIT.hasNext()) {
//				JavaClockZone jcz = (JavaClockZone) czIT.next();
//				this.addToClockZone((ClockZone)jcz.clone());
//			}
//	
//			// remove empty zones
//			czIT = (Iterator<?>) this.iteratorOfClockZone();
//			while (czIT.hasNext()) {
//				if (((JavaClockZone) czIT.next()).isEmpty())
//					czIT.remove();
//			}
//		}
//	}
}
