package de.uni_paderborn.fujaba.udbm.ruby;

import java.util.HashSet;

import de.uni_paderborn.fujaba.udbm.ClockConstraint;
import de.uni_paderborn.fujaba.udbm.ClockZone;
import de.uni_paderborn.fujaba.udbm.Federation;
import de.uni_paderborn.fujaba.udbm.FederationFactory;
import de.uni_paderborn.fujaba.udbm.SimpleClockConstraint;
import de.uni_paderborn.fujaba.udbm.UDBMClock;
import de.uni_paderborn.fujaba.udbm.clockconstraint.RelationalOperator;


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
		
		HashSet<ClockConstraint> zeroClockConstraints = new HashSet<ClockConstraint>();
		
		for (UDBMClock clock : clocks) {
			zeroClockConstraints.add(new SimpleClockConstraint(clock,RelationalOperator.EqualOperator,0));
		}
		
		HashSet<ClockZone> zeroClockZone = new HashSet<ClockZone>();
		zeroClockZone.add(new ClockZone(zeroClockConstraints));
		
		return new RubyFederation(clocks, zeroClockZone);
	}

}
