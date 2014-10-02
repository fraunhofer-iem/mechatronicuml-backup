package de.uni_paderborn.fujaba.udbm.java;

import java.util.HashSet;

import de.uni_paderborn.fujaba.udbm.ClockConstraint;
import de.uni_paderborn.fujaba.udbm.ClockZone;
import de.uni_paderborn.fujaba.udbm.Federation;
import de.uni_paderborn.fujaba.udbm.FederationFactory;
import de.uni_paderborn.fujaba.udbm.SimpleClockConstraint;
import de.uni_paderborn.fujaba.udbm.UDBMClock;
import de.uni_paderborn.fujaba.udbm.clockconstraint.RelationalOperator;

public class JavaFederationFactory extends FederationFactory {

	@Override
	public Federation createFederation(HashSet<UDBMClock> clocks,
			HashSet<ClockConstraint> clockConstraints) {
		
		HashSet<ClockZone> clockZoneFromConstraints = new HashSet<ClockZone>();
		clockZoneFromConstraints.add(new JavaClockZone(clockConstraints,clocks.size()));
		
		return new JavaFederation(clocks, clockZoneFromConstraints);
	}

	@Override
	public Federation createFederationFromClockZones(HashSet<UDBMClock> clocks,
			HashSet<ClockZone> clockZones) {
		return new JavaFederation(clocks, clockZones);
	}

	@Override
	public Federation createZeroFederation(HashSet<UDBMClock> clocks) {
		HashSet<ClockConstraint> zeroClockConstraints = new HashSet<ClockConstraint>();
		
		for (UDBMClock clock : clocks) {
			zeroClockConstraints.add(new SimpleClockConstraint(clock,RelationalOperator.LessOrEqualOperator,0));
		}
		
		HashSet<ClockZone> zeroClockZone = new HashSet<ClockZone>();
		zeroClockZone.add(new JavaClockZone(zeroClockConstraints, clocks.size()));
		
		return new JavaFederation(clocks, zeroClockZone);
	}

}
