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

public class ReplaceClockTest extends AbstractUDBMTest{

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
	public void testReplaceClockOneZoneOneClock(){
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
		
		fed.replaceClock(c1, c2);
		
		assertEquals(1, fed.sizeOfClock());
		assertEquals(1, fed.sizeOfClockZone());
		
		//c2 needs to have the bound that c1 had
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 20);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 10);
		
		//fed must not contain ClockConstraints that refer to the replaced clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//zone must not contain difference constraints because it only has one clock
				assertFalse(cc instanceof DifferenceClockConstraint);

				//simple clock constraints must not refer to replaced clock c1
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c1);
				}
			}
		}
	}
	
	@Test
	public void testReplaceClockOneZoneTwoClocks(){
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
		
		fed.replaceClock(c2, c3);
		
		assertEquals(2, fed.sizeOfClock());
		assertEquals(1, fed.sizeOfClockZone());
		
		//c3 needs to have the bound that c2 had
		assertTrue(fed.getUpperBound(c3) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c3)).getValue() == 20);
		assertTrue(fed.getLowerBound(c3) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c3)).getValue() == 10);
		
		//c1 needs to keep its bounds
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
		
		//fed must not contain ClockConstraints that refer to the replaced clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//difference clock constraints must not contain replaced clock c2
				if (cc instanceof DifferenceClockConstraint){
					assertFalse(((DifferenceClockConstraint)cc).getClockMinuend() == c2);
					assertFalse(((DifferenceClockConstraint)cc).getClockSubtrahend() == c2);
				}

				//simple clock constraints must not refer to replaced clock c2
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c2);
				}
			}
		}
	}
	
	@Test
	public void testReplaceClockTwoZonesOneClock(){
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
		
		fed.replaceClock(c1, c2);
		
		assertEquals(1, fed.sizeOfClock());
		assertEquals(2, fed.sizeOfClockZone());
		
		//c2 needs to have the bound that c1 had
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 50);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 10);

		//fed must not contain ClockConstraints that refer to the replaced clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//zone must not contain difference constraints because it only has one clock
				assertFalse(cc instanceof DifferenceClockConstraint);

				//simple clock constraints must not refer to replaced clock c1
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c1);
				}
			}
		}
	}
	
	@Test
	public void testReplaceClockTwoZonesTwoClocks(){
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
		
		fed.replaceClock(c2, c3);
		
		assertEquals(2, fed.sizeOfClock());
		assertEquals(2, fed.sizeOfClockZone());
		
		//c3 needs to have the bound that c2 had
		assertTrue(fed.getUpperBound(c3) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c3)).getValue() == 50);
		assertTrue(fed.getLowerBound(c3) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c3)).getValue() == 10);

		//c1 needs to keep its bounds
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 50);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);

		//fed must not contain ClockConstraints that refer to the replaced clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//difference clock constraints must not contain replaced clock c2
				if (cc instanceof DifferenceClockConstraint){
					assertFalse(((DifferenceClockConstraint)cc).getClockMinuend() == c2);
					assertFalse(((DifferenceClockConstraint)cc).getClockSubtrahend() == c2);
				}

				//simple clock constraints must not refer to replaced clock c2
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c2);
				}
			}
		}
	}
	
	@Test
	public void testReplaceClockTrueFederation(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);

		ClockConstraint trueConstraint = new TrueClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(trueConstraint);

		Federation fed = fedFactory.createFederation(clocks, constraints);

		//replace clock c2 by c3
		fed.replaceClock(c2, c3);

		assertEquals(2, fed.sizeOfClock());
		
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 0);
		
		assertTrue(fed.getUpperBound(c3) instanceof TrueClockConstraint);
		assertTrue(fed.getLowerBound(c3) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c3)).getValue() == 0);

		//fed must not contain ClockConstraints that refer to the replaced clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//difference clock constraints must not contain replaced clock c2
				if (cc instanceof DifferenceClockConstraint){
					assertFalse(((DifferenceClockConstraint)cc).getClockMinuend() == c2);
					assertFalse(((DifferenceClockConstraint)cc).getClockSubtrahend() == c2);
				}

				//simple clock constraints must not refer to replaced clock c2
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c2);
				}
			}
		}
	}
	
	@Test
	public void testReplaceClockFalseFederation(){
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);

		ClockConstraint falseConstraint = new FalseClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(falseConstraint);

		Federation fed = fedFactory.createFederation(clocks, constraints);
		
		//replace clock c2 by c3
		fed.replaceClock(c2, c3);
		
		assertEquals(2, fed.sizeOfClock());
		assertTrue(fed.isEmpty());
		
		//fed must not contain ClockConstraints that refer to the replaced clock
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();

			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint cc = conIter.next();

				//difference clock constraints must not contain replaced clock c2
				if (cc instanceof DifferenceClockConstraint){
					assertFalse(((DifferenceClockConstraint)cc).getClockMinuend() == c2);
					assertFalse(((DifferenceClockConstraint)cc).getClockSubtrahend() == c2);
				}

				//simple clock constraints must not refer to replaced clock c2
				if(cc instanceof SimpleClockConstraint){
					assertFalse(((SimpleClockConstraint)cc).getClock() == c2);
				}
			}
		}
	}
}
