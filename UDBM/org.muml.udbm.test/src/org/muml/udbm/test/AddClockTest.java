package org.muml.udbm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;

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

public class AddClockTest extends AbstractUDBMTest{

	private UDBMClock c1;
	
	private UDBMClock c2;
	
	private UDBMClock c3;

	@Override
	protected void testSpecificSetUp() {
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
		c3 = new UDBMClock("c3", "c3");
	}
	
	
	@Test
	public void testAddClockFedWithOneZoneOneClock(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		
		//c1 >= 10
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		fed.addClock(c2);
		
		//there need to be two clocks in the fed
		assertEquals(2, fed.sizeOfClock());
		
		//clocks need to be initialized with 0, all other clocks keep their values
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 0);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 0);
		
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}
	
	@Test
	public void testAddClockFedWithOneZoneTwoClocks(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);

		//c1 <= 20 && 10 <= c2 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 10);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, 0);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 0);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		fed.addClock(c3);
		
		//there need to be three clocks in the zone
		assertEquals(3, fed.sizeOfClock());
		
		//clocks need to be initialized with 0, all other clocks keep their values
		assertTrue(fed.getUpperBound(c3) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c3)).getValue() == 0);
		assertTrue(fed.getLowerBound(c3) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c3)).getValue() == 0);

		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 20);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 10);
		
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}

	@Test
	public void testAddClockFedWithTwoZonesOneClock(){
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
		
		fed.addClock(c2);
		
		assertEquals(2, fed.sizeOfClockZone());
		assertEquals(2, fed.sizeOfClock());
		
		//both zones need to contain constraint c2 == 0
		for(ClockZone z : fed.getClockZone()){
			boolean constraintFound = false;
			Iterator<ClockConstraint> conIter = z.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();
				
				if(cc instanceof SimpleClockConstraint){
					SimpleClockConstraint curSCC = (SimpleClockConstraint) cc;
					if(curSCC.getClock() == c2){
						constraintFound = true;
						break;
					}
				}
			}
			
			assertTrue(constraintFound);
		}
		
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 0);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 0);
	}
	
	@Test
	public void testAddClockToFalseFederation(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);

		ClockConstraint falseConstraint = new FalseClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(falseConstraint);

		Federation fed = fedFactory.createFederation(clocks, constraints);
		
		fed.addClock(c2);
		
		assertEquals(2, fed.sizeOfClock());
		assertTrue(fed.isEmpty());
		
		assertTrue(fed.getUpperBound(c2) instanceof FalseClockConstraint);
		assertTrue(fed.getLowerBound(c2) instanceof FalseClockConstraint);
	}
	
	@Test
	public void testAddClockToTrueFederation(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);

		ClockConstraint trueConstraint = new TrueClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(trueConstraint);

		Federation fed = fedFactory.createFederation(clocks, constraints);

		fed.addClock(c2);

		assertEquals(2, fed.sizeOfClock());

		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 0);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 0);
		
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 0);
	}
	
}

