/**
 * 
 */
package org.muml.udbm.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.FalseClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;


public class ResetTest extends AbstractUDBMTest{
	
	private UDBMClock c1;
	
	private UDBMClock c2;

	@Override
	protected void testSpecificSetUp() {
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
	}

	/**
	 * Simple test: one clock is reset from a non-zero interval back to zero.
	 */
	@Test
	public void testResetOneClock() {
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		
		Federation fed = fedFactory.createFederation(clocks, constraints);
		
		fed.applyResets(clocks);
		
		assertFalse(fed.isEmpty());
		
		//test lower bound
		ClockConstraint bound = fed.getLowerBound(c1);
		assertTrue(bound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)bound).getValue() == 0);
		assertTrue(((SimpleClockConstraint)bound).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);		
		
		//test upper bound
		bound = fed.getUpperBound(c1);
		assertTrue(bound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)bound).getValue() == 0);
		assertTrue(((SimpleClockConstraint)bound).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
	}
	
	/**
	 * Federation with two clocks, one of which is reset to 0.
	 */
	@Test
	public void testResetTwoClocksOneReset() {
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 50);
		
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);
		
		Federation fed = fedFactory.createFederation(clocks, constraints);
		
		HashSet<UDBMClock> resets = new HashSet<UDBMClock>();
		resets.add(c1);
		
		fed.applyResets(resets);
		
		assertFalse(fed.isEmpty());
		
		//test lower bound of c1
		ClockConstraint bound = fed.getLowerBound(c1);
		assertTrue(bound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)bound).getValue() == 0);
		assertTrue(((SimpleClockConstraint)bound).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);		
		
		//test upper bound of c1
		bound = fed.getUpperBound(c1);
		assertTrue(bound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)bound).getValue() == 0);
		assertTrue(((SimpleClockConstraint)bound).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		
		//test lower bound of c2
		bound = fed.getLowerBound(c2);
		assertTrue(bound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)bound).getValue() == 30);
		assertTrue(((SimpleClockConstraint)bound).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);		

		//test upper bound of c2
		bound = fed.getUpperBound(c2);
		assertTrue(bound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)bound).getValue() == 50);
		assertTrue(((SimpleClockConstraint)bound).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
	}
	
	/**
	 * Federation with two clocks zones using only one clock. Clock is reset back to zero, result should be a 
	 * Federation with one clock zone.
	 */
	@Test
	public void testResetTwoZonesOneClock() {
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
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
		
		//perform reset
		fed.applyResets(clocks);
		
		assertFalse(fed.isEmpty());
		assertTrue(fed.sizeOfClockZone() == 1);
		
		//test lower bound
		ClockConstraint bound = fed.getLowerBound(c1);
		assertTrue(bound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)bound).getValue() == 0);
		assertTrue(((SimpleClockConstraint)bound).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);		
		
		//test upper bound
		bound = fed.getUpperBound(c1);
		assertTrue(bound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)bound).getValue() == 0);
		assertTrue(((SimpleClockConstraint)bound).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
	}

	/**
	 * Reset an empty fed. Needs still to be empty afterwards.
	 */
	@Test
	public void testResetEmptyFed(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		ClockConstraint falseConstraint = new FalseClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(falseConstraint);
		
		
		Federation fed = fedFactory.createFederation(clocks, constraints);
		
		fed.applyResets(clocks);
		
		assertTrue(fed.isEmpty());
		assertTrue(fed.getLowerBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed.getUpperBound(c1) instanceof FalseClockConstraint);
	}
}
