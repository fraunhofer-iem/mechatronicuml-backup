package org.muml.udbm;

import java.util.HashSet;


public abstract class FederationFactory
{
   public abstract Federation createFederation(HashSet<UDBMClock> clocks, HashSet<ClockConstraint> clockConstraints);

   public abstract Federation createFederationFromClockZones(HashSet<UDBMClock> clocks, HashSet<ClockZone> clockZones);

   public abstract Federation createZeroFederation(HashSet<UDBMClock> clocks);

}
