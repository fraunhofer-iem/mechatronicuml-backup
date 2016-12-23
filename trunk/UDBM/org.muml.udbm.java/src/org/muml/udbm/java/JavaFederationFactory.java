package org.muml.udbm.java;

import java.util.HashSet;

import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.Federation;
import org.muml.udbm.FederationFactory;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.RelationalOperator;

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
