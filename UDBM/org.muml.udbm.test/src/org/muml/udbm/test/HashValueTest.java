package org.muml.udbm.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.HashSet;

import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.RelationalOperator;

public class HashValueTest extends AbstractUDBMTest{

	private UDBMClock c1;

	private UDBMClock c2;
	
	private UDBMClock c3;

	@Override
	protected void testSpecificSetUp(){
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
		c3 = new UDBMClock("c3", "c3");
	}

	@Test
	public void testHashValuesDifferentCreationOrder(){

		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		clocks.add(c3);
		
		// Create clock constraints
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 5);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 25);
		DifferenceClockConstraint scc3 = new DifferenceClockConstraint(c2, c3, RelationalOperator.LessOperator, 5);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c3, RelationalOperator.GreaterOrEqualOperator, 10);
		
		
		//create fed1
		Federation fed1 = fedFactory.createZeroFederation(clocks);
		fed1.up();
		fed1.and(scc1);
		fed1.and(scc2);
		fed1.and(scc3);
		fed1.and(scc4);
		
		//create fed2
		Federation fed2 = fedFactory.createZeroFederation(clocks);
		fed2.up();
		fed2.and(scc2);
		fed2.and(scc1);
		fed2.and(scc4);
		fed2.and(scc3);
		
		assertEquals(fed1.getFullHash(), fed2.getFullHash());
		
	}
	
	@Test
	public void testHashValuesClonedFederation(){

		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		clocks.add(c3);
		
		// Create clock constraints
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 5);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 25);
		DifferenceClockConstraint scc3 = new DifferenceClockConstraint(c2, c3, RelationalOperator.LessOperator, 5);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c3, RelationalOperator.GreaterOrEqualOperator, 10);
		
		//create fed1
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//clone federation
		Federation cloneFed = (Federation)fed1.clone();
		
		assertEquals(fed1.getFullHash(), cloneFed.getFullHash());
	}
	
	@Test
	public void testHashValuesDifferentStrictness(){

		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		clocks.add(c3);
		
		// Create clock constraints
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 5);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 25);
		DifferenceClockConstraint scc3 = new DifferenceClockConstraint(c2, c3, RelationalOperator.LessOperator, 5);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c3, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 25);
		
		//create fed1
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//create fed2 (uses scc2 with non-strict bound)
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc1);
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);

		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		assertFalse(fed1.getFullHash() == fed2.getFullHash());
	}
	
	@Test
	public void testHashValuesDifferentBounds(){

		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		clocks.add(c3);
		
		// Create clock constraints
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 5);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 25);
		DifferenceClockConstraint scc3 = new DifferenceClockConstraint(c2, c3, RelationalOperator.LessOperator, 5);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c3, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 26);
		
		//create fed1
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);

		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//create fed2 (uses scc2 with value 26 instead of 25)
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc1);
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);

		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		assertFalse(fed1.getFullHash() == fed2.getFullHash());
	}
	
	@Test
	public void testHashValuesSameBoundsOnDifferentClocks(){

		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		clocks.add(c3);
		
		// Create clock constraints
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 5);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 25);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c3, RelationalOperator.GreaterOrEqualOperator, 10);
		
		//create fed1
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);

		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		// Create clock constraints
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c3, RelationalOperator.LessOrEqualOperator, 5);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOperator, 25);
		SimpleClockConstraint scc7 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc8 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 10);
		
		//create fed2 (applies same constraints to different clocks)
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		clockConstraints2.add(scc7);
		clockConstraints2.add(scc8);

		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);
		
		assertFalse(fed1.equals(fed2));

		assertFalse(fed1.getFullHash() == fed2.getFullHash());
	}
	
}