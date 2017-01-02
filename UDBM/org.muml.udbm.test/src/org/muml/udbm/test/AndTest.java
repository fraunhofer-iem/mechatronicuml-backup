package org.muml.udbm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.FalseClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;
import org.muml.udbm.clockconstraint.TrueClockConstraint;

public class AndTest extends AbstractUDBMTest{
	
	private UDBMClock c1;
	
	private UDBMClock c2;

	@Override
	protected void testSpecificSetUp() {
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
	}
	
	@Test
	public void testAndOneClockWithClockConstraint(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//c1 >= 10
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		fed.and(scc2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}
	
	@Test
	public void testAndOneClockWithFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//c1 >= 10
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc2);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);
		
		fed.and(fed2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}
	
	@Test
	public void testAndOneClockWithSetOfClockConstraints(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//c1 >= 10 && c1 <= 20
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc2);
		clockConstraints2.add(scc3);
		
		fed.and(clockConstraints2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}
	
	@Test
	public void testAndOneClockWithSubInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//c1 <= 5
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		fed.and(scc2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 10);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 0);
	}
	
	@Test
	public void testAndOneClockWithTrueClockConstraint(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//10 <= c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//(true)
		TrueClockConstraint tcc = new TrueClockConstraint();
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		fed.and(tcc);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}
	
	@Test
	public void testAndOneClockWithFalseClockConstraint(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//10 <= c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//(false)
		FalseClockConstraint fcc = new FalseClockConstraint();
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		fed.and(fcc);

		assertTrue(fed.getLowerBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed.getUpperBound(c1) instanceof FalseClockConstraint);
	}
	
	@Test
	public void testAndTwoClocksWithClockConstraint(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//c1 <= 20 && c2 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 20);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, 0);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 0);
		
		//c2 >= 10
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 10);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		fed.and(scc3);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		//check values for c1
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
		
		//check values for c2
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 20);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 10);
	}
	
	@Test
	public void testAndTwoClocksWithFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//c1 <= 20 && c2 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 20);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, 0);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 0);

		//c2 >= 10
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 10);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);

		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);
		
		fed.and(fed2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		//check values for c1
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
		
		//check values for c2
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 20);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 10);
	}
	
	@Test
	public void testAndTwoClocksWithSetOfClockConstraints(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//c1 <= 20 && c2 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 20);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, 0);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 0);
		
		//c2 >= 10 && c2 <= 20
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		
		fed.and(clockConstraints2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		//check values for c1
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
		
		//check values for c2
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 20);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 10);
	}
	
	@Test
	public void testAndTwoClocskWithSuperInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//c1 <= 10 && c2 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 10);
		
		//c2 <= 20
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		fed.and(scc3);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 10);
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 10);
	}

	@Test
	public void testAndEmptyFed(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		
		ClockConstraint falseConstraint = new FalseClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(falseConstraint);
		
		
		Federation fed = fedFactory.createFederation(clocks, constraints);
		
		fed.and(scc1);
		
		assertEquals(fed.getLowerBound(c1), 10);
		assertEquals(fed.getUpperBound(c1), 10);	
	}
	
	/**
	 * Perform and on Federation with two zones such that the Federation is reduced to one of the zones.
	 */
	@Test
	public void testAndTwoZonesReduceToOneZone(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//set up first Federation
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		
		Federation fed1 = fedFactory.createFederation(clocks, constraints);
		
		//set up second Federation
		HashSet<ClockConstraint> constraints2 = new HashSet<ClockConstraint>();
		constraints2.add(scc3);
		constraints2.add(scc4);
		
		Federation fed2 = fedFactory.createFederation(clocks, constraints2);
		
		//obtain clock zones and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());
		
		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);
		assertTrue(fed.sizeOfClockZone() == 2);
		
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 15);
		
		fed.and(scc5);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		//check values for c1
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 15);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}
	
	/**
	 * Perform and on Federation with two zones such that only one zone is affected.
	 */
	@Test
	public void testAndTwoZonesOneZoneAffected(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//set up first Federation
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		
		Federation fed1 = fedFactory.createFederation(clocks, constraints);
		
		//set up second Federation
		HashSet<ClockConstraint> constraints2 = new HashSet<ClockConstraint>();
		constraints2.add(scc3);
		constraints2.add(scc4);
		
		Federation fed2 = fedFactory.createFederation(clocks, constraints2);
		
		//obtain clock zones and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());
		
		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);
		assertTrue(fed.sizeOfClockZone() == 2);
		
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 15);
		fed.and(scc5);
		
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 45);
		fed.and(scc6);

		

		//check values for c1
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertEquals(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue(), 45);
		assertEquals(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue(), 15);
	}
	
	/**
	 * Perform and on Federation with two zones such that both zones are affected.
	 */
	@Test
	public void testAndTwoZonesBothZonesAffected(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//set up first Federation
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		
		Federation fed1 = fedFactory.createFederation(clocks, constraints);
		
		//set up second Federation
		HashSet<ClockConstraint> constraints2 = new HashSet<ClockConstraint>();
		constraints2.add(scc3);
		constraints2.add(scc4);
		
		Federation fed2 = fedFactory.createFederation(clocks, constraints2);
		
		//obtain clock zones and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());
		
		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);
		assertTrue(fed.sizeOfClockZone() == 2);
		
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 15);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		HashSet<ClockConstraint> constraints3 = new HashSet<ClockConstraint>();
		constraints3.add(scc5);
		constraints3.add(scc6);
		
		fed.and(constraints3);
		
		assertTrue(fed.sizeOfClockZone() == 2);
		//check values for c1
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 40);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 15);
	}
}

