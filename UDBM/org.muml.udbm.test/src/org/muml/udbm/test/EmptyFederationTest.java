package org.muml.udbm.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.RelationalOperator;

public class EmptyFederationTest extends AbstractUDBMTest{

	private UDBMClock c1;

	private UDBMClock c2;

	protected void testSpecificSetUp(){
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
	}

	@Test
	public void testEmptyFedLessAndGreaterEqual(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//create zero federation
		Federation fed = fedFactory.createZeroFederation(clocks);
		
		// Create a clock constraint which will cause the federation to be
		// false if it is conjunct them.
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 5));

		sccs.add(new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 5));

		fed.up();
		fed.and(sccs);
		
		assertTrue(fed.isEmpty());
	}
	
	@Test
	public void testEmptyFedLessAndGreater(){

		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//create zero federation
		Federation fed = (Federation) fedFactory.createZeroFederation(clocks);
		
		// Create a clock constraint which will cause the federation to be
		// false if it is conjunct them.
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator, 5));

		sccs.add(new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 5));

		fed.up();
		fed.and(sccs);
		
		assertTrue(fed.isEmpty());
	}
	
	@Test
	public void testEmptyFedLessEqualAndGreater(){

		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//create zero federation
		Federation fed = (Federation) fedFactory.createZeroFederation(clocks);
		
		// Create a clock constraint which will cause the federation to be
		// false if it is conjunct them.
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator, 5));

		sccs.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 5));

		fed.up();
		fed.and(sccs);
		
		assertTrue(fed.isEmpty());
	}
	
	@Test
	public void testEmptyFedLessAndEqual(){

		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//create zero federation
		Federation fed = (Federation) fedFactory.createZeroFederation(clocks);
		
		// Create a clock constraint which will cause the federation to be
		// false if it is conjunct them.
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.EqualOperator, 5));

		sccs.add(new SimpleClockConstraint(c2, RelationalOperator.LessOperator, 5));

		fed.up();
		fed.and(sccs);
		
		assertTrue(fed.isEmpty());
	}
	
	@Test
	public void testEmptyFedGreaterAndEqual(){

		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//create zero federation
		Federation fed = (Federation) fedFactory.createZeroFederation(clocks);
		
		// Create a clock constraint which will cause the federation to be
		// false if it is conjunct them.
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.EqualOperator, 5));

		sccs.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator, 5));

		fed.up();
		fed.and(sccs);
		
		assertTrue(fed.isEmpty());
	}
	
	@Test
	public void testNonEmptyFedGreaterEqualAndEqual(){

		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//create zero federation
		Federation fed = (Federation) fedFactory.createZeroFederation(clocks);
		
		// Create a clock constraints which will cause the federation not to be
		// false if it is conjunct them => result must have upper and lower bound
		//of the same value (5 in this case)
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.EqualOperator, 5));

		sccs.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 5));

		fed.up();
		fed.and(sccs);
		
		assertFalse(fed.isEmpty());
		
		ClockConstraint upperBound = fed.getUpperBound(c2);
		assertTrue(upperBound != null && upperBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)upperBound).getValue() == 5);
		
		ClockConstraint lowerBound = fed.getUpperBound(c2);
		assertTrue(lowerBound != null && lowerBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)lowerBound).getValue() == 5);
	}
	
	@Test
	public void testNonEmptyFedLessEqualAndEqual(){

		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//create zero federation
		Federation fed = (Federation) fedFactory.createZeroFederation(clocks);
		
		// Create a clock constraints which will cause the federation not to be
		// false if it is conjunct them => result must have upper and lower bound
		//of the same value (5 in this case)
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.EqualOperator, 5));

		sccs.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 5));

		fed.up();
		fed.and(sccs);
		
		assertFalse(fed.isEmpty());
		
		ClockConstraint upperBound = fed.getUpperBound(c2);
		assertTrue(upperBound != null && upperBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)upperBound).getValue() == 5);
		
		ClockConstraint lowerBound = fed.getUpperBound(c2);
		assertTrue(lowerBound != null && lowerBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)lowerBound).getValue() == 5);
	}
	
	@Test
	public void testNonEmptyFedGreaterEqualAndLessEqual(){

		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//create zero federation
		Federation fed = (Federation) fedFactory.createZeroFederation(clocks);
		
		// Create a clock constraints which will cause the federation not to be
		// false if it is conjunct them => result must have upper and lower bound
		//of the same value (5 in this case)
		HashSet<ClockConstraint> sccs = new HashSet<ClockConstraint>();
		sccs.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 5));

		sccs.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 5));

		fed.up();
		fed.and(sccs);
		
		assertFalse(fed.isEmpty());
		
		ClockConstraint upperBound = fed.getUpperBound(c2);
		assertTrue(upperBound != null && upperBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)upperBound).getValue() == 5);
		
		ClockConstraint lowerBound = fed.getUpperBound(c2);
		assertTrue(lowerBound != null && lowerBound instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)lowerBound).getValue() == 5);
	}
	
}
