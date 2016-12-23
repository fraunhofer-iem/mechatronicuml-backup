package org.muml.udbm.test;


import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.RelationalOperator;
import org.muml.udbm.clockconstraint.TrueClockConstraint;

public class NormalizationTest extends AbstractUDBMTest{

	private UDBMClock c1;

	private UDBMClock c2;
	
	private UDBMClock c3;
	
	private HashSet<UDBMClock> clocks;

	@Override
	protected void testSpecificSetUp(){

		clocks = new HashSet<UDBMClock>();
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
		c3 = new UDBMClock("c_dead4", "c_dead4");
		clocks.add(c1);
		clocks.add(c2);
		clocks.add(c3);
	}
	
	@Test
	public void testNormalization(){
		Federation fed = fedFactory.createZeroFederation(clocks);
		
		//apply constraints such that upper and lower bound are defined
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20));

		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50));

		fed.up();
		fed.and(sccs);
		
		//normalize
		HashMap<UDBMClock, Integer> maxValues = new HashMap<UDBMClock, Integer>();
		maxValues.put(c1, 50);
		maxValues.put(c2, 50);
		maxValues.put(c3, 10);
		HashSet<DifferenceClockConstraint> diffClockConstraints = new HashSet<DifferenceClockConstraint>();
		fed.diagonalNormalize(maxValues,diffClockConstraints);
		
		//assure that upper bound of c3 is a TrueClockConstraint
		assertTrue(fed.getUpperBound(c3) instanceof TrueClockConstraint);

		//assure that lower bound of c3 is a SimpleClockConstraint whose bound equals the normalization value
		ClockConstraint lBound = fed.getLowerBound(c3);
		assertTrue(lBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)lBound).getValue() == 10);
		assertTrue(((SimpleClockConstraint)lBound).getRelationalOperator() == RelationalOperator.GreaterOperator);

		//assert that other uBounds are 200
		ClockConstraint uBound = fed.getUpperBound(c1);
		assertTrue(uBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)uBound).getValue() == 50);
		uBound = fed.getUpperBound(c2);
		assertTrue(uBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)uBound).getValue() == 50);
	}

	@Test
	public void testNormalizationWithDifferences(){
		
		Federation fed = fedFactory.createZeroFederation(clocks);

		//apply constraints such that upper and lower bound are defined
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 5));

		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50));

		fed.up();
		fed.and(sccs);
		
		HashSet<UDBMClock> reset = new HashSet<UDBMClock>();
		reset.add(c3);
		
		//apply reset to obtain a difference
		fed.applyResets(reset);
		sccs.clear();

		//increase the lower and upper bound
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 200));
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 150));

		fed.up();
		fed.and(sccs);
		
		//normalize
		HashMap<UDBMClock, Integer> maxValues = new HashMap<UDBMClock, Integer>();
		maxValues.put(c1, 200);
		maxValues.put(c2, 200);
		maxValues.put(c3, 30);
		HashSet<DifferenceClockConstraint> diffClockConstraints = new HashSet<DifferenceClockConstraint>();
		fed.diagonalNormalize(maxValues,diffClockConstraints);
		
		//assure that upper bound of c3 is a TrueClockConstraint
		assertTrue(fed.getUpperBound(c3) instanceof TrueClockConstraint);
		
		//assure that lower bound of c3 is a SimpleClockConstraint whose bound equals the normalization value
		ClockConstraint lBound = fed.getLowerBound(c3);
		assertTrue(lBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)lBound).getValue() == 30);
		assertTrue(((SimpleClockConstraint)lBound).getRelationalOperator() == RelationalOperator.GreaterOperator);
		
		//assert that other uBounds are 200
		ClockConstraint uBound = fed.getUpperBound(c1);
		assertTrue(uBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)uBound).getValue() == 200);
		uBound = fed.getUpperBound(c2);
		assertTrue(uBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)uBound).getValue() == 200);
	}
}
