package org.muml.udbm.ruby;

import java.util.HashSet;

import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.Federation;
import org.muml.udbm.FederationFactory;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.RelationalOperator;


public class RubyFederationFactory
extends FederationFactory
{

	@Override
	public Federation createFederation(HashSet<UDBMClock> clocks,
			HashSet<ClockConstraint> clockConstraints) {
	
		HashSet<ClockZone> clockZoneFromConstraints = new HashSet<ClockZone>();
		clockZoneFromConstraints.add(new ClockZone(clockConstraints));
		
		return new RubyFederation(clocks, clockZoneFromConstraints);
	}

	@Override
	public Federation createFederationFromClockZones(HashSet<UDBMClock> clocks,
			HashSet<ClockZone> clockZones) {
		
		return new RubyFederation(clocks,clockZones);
	}

	@Override
	public Federation createZeroFederation(HashSet<UDBMClock> clocks) {
		if(clocks.isEmpty()){
			UDBMClock zeroClock = new UDBMClock("zeroclock", "zeroclock");
			clocks.add(zeroClock);
		}
		
		HashSet<ClockConstraint> zeroClockConstraints = new HashSet<ClockConstraint>();
		
		for (UDBMClock clock : clocks) {
			zeroClockConstraints.add(new SimpleClockConstraint(clock,RelationalOperator.EqualOperator,0));
		}
		
		HashSet<ClockZone> zeroClockZone = new HashSet<ClockZone>();
		zeroClockZone.add(new ClockZone(zeroClockConstraints));
		
		return new RubyFederation(clocks, zeroClockZone);
	}

}
