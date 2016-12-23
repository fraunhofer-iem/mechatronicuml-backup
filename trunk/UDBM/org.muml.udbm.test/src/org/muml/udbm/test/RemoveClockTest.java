package org.muml.udbm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

public class RemoveClockTest extends AbstractUDBMTest{

	private UDBMClock c1;

	private UDBMClock c2;

	@Override
	protected void testSpecificSetUp() {
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
	}

	@Test
	public void testRemoveClockFedWithOneZoneOneClock(){
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

		fed.removeClock(c1);

		assertEquals(0, fed.sizeOfClock());
		assertEquals(1, fed.sizeOfClockZone());

		//get clock zone
		for(ClockZone z : fed.getClockZone()){
			assertEquals(1, z.sizeOfClockConstraint());

			Iterator<ClockConstraint> conIter = z.iteratorOfClockConstraint();
			ClockConstraint cc = conIter.next();

			assertTrue(cc instanceof FalseClockConstraint);
		}

		assertTrue(fed.isEmpty());
	}

	@Test
	public void testRemoveClockFedWithOneZoneTwoClocks(){
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

		fed.removeClock(c2);

		//there needs to be one clock in the zone
		assertEquals(1, fed.sizeOfClock());
		assertEquals(1, fed.sizeOfClockZone());

		//remaining clocks keep their values
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);

		//fed must not contain ClockConstraints that refer to the removed clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//zone must not contain difference constraints because it only has one clock
				assertFalse(cc instanceof DifferenceClockConstraint);

				//simple clock constraints must not refer to removed clock c2
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c2);
				}
			}
		}
	}

	@Test
	public void testRemoveClockFedWithTwoZonesTwoClocks(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);

		//fed1: 30 <= c1 <= 50 && 30 <= c2 <= 50 && c1 - c2 == 0
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.EqualOperator, 0);

		//set up first Federation
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);
		constraints.add(diff1);

		Federation fed1 = fedFactory.createFederation(clocks, constraints);

		//fed2: 10 <= c1 <= 20 && 10 <= c2 <= 20 && c1 - c2 == 0
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc7 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc8 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 20);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c1, c2, RelationalOperator.EqualOperator, 0);

		//set up second Federation
		HashSet<ClockConstraint> constraints2 = new HashSet<ClockConstraint>();
		constraints2.add(scc5);
		constraints2.add(scc6);
		constraints2.add(scc7);
		constraints2.add(scc8);
		constraints2.add(diff2);

		Federation fed2 = fedFactory.createFederation(clocks, constraints2);

		//obtain clock zones and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());

		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);

		fed.removeClock(c2);

		assertEquals(1, fed.sizeOfClock());
		assertEquals(2, fed.sizeOfClockZone());

		//values of c2 remained the same
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 50);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
		
		//fed must not contain ClockConstraints that refer to the removed clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//zone must not contain difference constraints because it only has one clock
				assertFalse(cc instanceof DifferenceClockConstraint);

				//simple clock constraints must not refer to removed clock c2
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c2);
				}
			}
		}
	}

	@Test
	public void testRemoveClockFedWithTwoZonesTwoClocksReduceToOneZone(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);

		//fed1: 30 <= c1 <= 50 && 10 <= c2 <= 50 && c1 - c2 == 0
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 50);

		//set up first Federation
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);

		Federation fed1 = fedFactory.createFederation(clocks, constraints);

		//fed2: 10 <= c1 <= 20 && 10 <= c2 <= 50 && c1 - c2 == 0
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc7 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc8 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 50);

		//set up second Federation
		HashSet<ClockConstraint> constraints2 = new HashSet<ClockConstraint>();
		constraints2.add(scc5);
		constraints2.add(scc6);
		constraints2.add(scc7);
		constraints2.add(scc8);

		Federation fed2 = fedFactory.createFederation(clocks, constraints2);

		//obtain clock zones and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());

		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);

		fed.removeClock(c1);

		//values of c2 have been equal in both zones, there should only be one zone in the result
		assertEquals(1, fed.sizeOfClock());
		assertEquals(1, fed.sizeOfClockZone());

		//values of c2 remained the same
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 50);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 10);
		
		//fed must not contain ClockConstraints that refer to the removed clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//zone must not contain difference constraints because it only has one clock
				assertFalse(cc instanceof DifferenceClockConstraint);

				//simple clock constraints must not refer to removed clock c1
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c1);
				}
			}
		}
	}

	@Test
	public void testRemoveClockFromFalseFederation(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);

		ClockConstraint falseConstraint = new FalseClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(falseConstraint);

		Federation fed = fedFactory.createFederation(clocks, constraints);

		fed.removeClock(c2);

		assertEquals(1, fed.sizeOfClock());
		assertTrue(fed.isEmpty());

		assertTrue(fed.getUpperBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed.getLowerBound(c1) instanceof FalseClockConstraint);
		
		//fed must not contain ClockConstraints that refer to the removed clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//zone must not contain difference constraints because it only has one clock
				assertFalse(cc instanceof DifferenceClockConstraint);

				//simple clock constraints must not refer to removed clock c2
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c2);
				}
			}
		}
	}

	@Test
	public void testRemoveClockFromTrueFederation(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);

		ClockConstraint trueConstraint = new TrueClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(trueConstraint);

		Federation fed = fedFactory.createFederation(clocks, constraints);

		fed.removeClock(c2);

		assertEquals(1, fed.sizeOfClock());

		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 0);
		
		//fed must not contain ClockConstraints that refer to the removed clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//zone must not contain difference constraints because it only has one clock
				assertFalse(cc instanceof DifferenceClockConstraint);

				//simple clock constraints must not refer to removed clock c2
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c2);
				}
			}
		}
	}
	
	@Test
	public void testRemoveLastClockFromFalseFederation(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);

		ClockConstraint falseConstraint = new FalseClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(falseConstraint);

		Federation fed = fedFactory.createFederation(clocks, constraints);

		fed.removeClock(c1);

		assertEquals(0, fed.sizeOfClock());
		assertEquals(1, fed.sizeOfClockZone());

		//get clock zone
		for(ClockZone z : fed.getClockZone()){
			assertEquals(1, z.sizeOfClockConstraint());

			Iterator<ClockConstraint> conIter = z.iteratorOfClockConstraint();
			ClockConstraint cc = conIter.next();

			assertTrue(cc instanceof FalseClockConstraint);
		}
		
		assertTrue(fed.isEmpty());
	}

	@Test
	public void testRemoveLastClockFromTrueFederation(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);

		ClockConstraint trueConstraint = new TrueClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(trueConstraint);

		Federation fed = fedFactory.createFederation(clocks, constraints);

		fed.removeClock(c1);

		assertEquals(0, fed.sizeOfClock());
		assertEquals(1, fed.sizeOfClockZone());

		//get clock zone
		for(ClockZone z : fed.getClockZone()){
			assertEquals(1, z.sizeOfClockConstraint());

			Iterator<ClockConstraint> conIter = z.iteratorOfClockConstraint();
			ClockConstraint cc = conIter.next();

			assertTrue(cc instanceof FalseClockConstraint);
		}
		
		assertTrue(fed.isEmpty());
	}

}
