package org.muml.udbm.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.FalseClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;
import org.muml.udbm.clockconstraint.TrueClockConstraint;

public class RelaxTest extends AbstractUDBMTest{

	private UDBMClock clock1;
	
	private UDBMClock clock2;

	@Override
	protected void testSpecificSetUp(){
		clock1 = new UDBMClock("c1", "c1");
		clock2 = new UDBMClock("c2", "c2");
	}

	@Test
	public void testRelaxOneClock() {
		
		//set up clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(clock1);
		
		// 10 < c1 < 20
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		SimpleClockConstraint scc1 = new SimpleClockConstraint(clock1, RelationalOperator.GreaterOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(clock1, RelationalOperator.LessOperator, 20);
		constraints.add(scc1);
		constraints.add(scc2);
		
		Federation federation = fedFactory.createFederation(clocks, constraints);
		federation.relax();
		
		// after relax: values unchanged; bounds are non-strict
		{
			SimpleClockConstraint lowerBound1 = (SimpleClockConstraint)federation.getLowerBound(clock1);
			SimpleClockConstraint upperBound1 = (SimpleClockConstraint)federation.getUpperBound(clock1);

			assertTrue(lowerBound1.getValue() == 10);
			assertTrue(lowerBound1.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
			assertTrue(upperBound1.getValue() == 20);
			assertTrue(upperBound1.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		}
	}
	
	@Test
	public void testRelaxOneClockNonStrict() {
		
		//set up clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(clock1);
		
		// 10 <= c1 <= 20
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		SimpleClockConstraint scc1 = new SimpleClockConstraint(clock1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(clock1, RelationalOperator.LessOrEqualOperator, 20);
		constraints.add(scc1);
		constraints.add(scc2);
		
		Federation federation = fedFactory.createFederation(clocks, constraints);
		federation.relax();
		
		// after relax: values unchanged; bounds are non-strict
		{
			SimpleClockConstraint lowerBound1 = (SimpleClockConstraint)federation.getLowerBound(clock1);
			SimpleClockConstraint upperBound1 = (SimpleClockConstraint)federation.getUpperBound(clock1);

			assertTrue(lowerBound1.getValue() == 10);
			assertTrue(lowerBound1.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
			assertTrue(upperBound1.getValue() == 20);
			assertTrue(upperBound1.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		}
	}
	
	@Test
	public void testRelaxTwoClocks() {
		
		//set up clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(clock1);
		clocks.add(clock2);
		
		// 10 < c1 < 20 && 10 < c2 < 20
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		SimpleClockConstraint scc1 = new SimpleClockConstraint(clock1, RelationalOperator.GreaterOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(clock1, RelationalOperator.LessOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(clock2, RelationalOperator.GreaterOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(clock2, RelationalOperator.LessOperator, 20);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(clock2, clock1, RelationalOperator.EqualOperator, 0);
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);
		constraints.add(diff1);
		
		Federation federation = fedFactory.createFederation(clocks, constraints);
		federation.relax();
		
		// after relax: values unchanged; bounds are non-strict
		{
			SimpleClockConstraint lowerBound1 = (SimpleClockConstraint)federation.getLowerBound(clock1);
			SimpleClockConstraint lowerBound2 = (SimpleClockConstraint)federation.getLowerBound(clock2);
			SimpleClockConstraint upperBound1 = (SimpleClockConstraint)federation.getUpperBound(clock1);
			SimpleClockConstraint upperBound2 = (SimpleClockConstraint)federation.getUpperBound(clock2);

			assertTrue(lowerBound1.getValue() == 10);
			assertTrue(lowerBound2.getValue() == 10);
			assertTrue(lowerBound1.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
			assertTrue(lowerBound2.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);

			assertTrue(upperBound1.getValue() == 20);
			assertTrue(upperBound2.getValue() == 20);
			assertTrue(upperBound1.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
			assertTrue(upperBound2.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		}

	}
	
	@Test
	public void testRelaxTwoClocksOneNonStrict(){
		//set up clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(clock1);
		clocks.add(clock2);

		// 10 < c1 < 20 && 10 <= c2 <= 20
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		SimpleClockConstraint scc1 = new SimpleClockConstraint(clock1, RelationalOperator.GreaterOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(clock1, RelationalOperator.LessOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(clock2, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(clock2, RelationalOperator.LessOrEqualOperator, 20);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(clock2, clock1, RelationalOperator.EqualOperator, 0);
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);
		constraints.add(diff1);

		Federation federation = fedFactory.createFederation(clocks, constraints);
		federation.relax();

		// after relax: values unchanged; bounds are non-strict
		{
			SimpleClockConstraint lowerBound1 = (SimpleClockConstraint)federation.getLowerBound(clock1);
			SimpleClockConstraint lowerBound2 = (SimpleClockConstraint)federation.getLowerBound(clock2);
			SimpleClockConstraint upperBound1 = (SimpleClockConstraint)federation.getUpperBound(clock1);
			SimpleClockConstraint upperBound2 = (SimpleClockConstraint)federation.getUpperBound(clock2);

			assertTrue(lowerBound1.getValue() == 10);
			assertTrue(lowerBound2.getValue() == 10);
			assertTrue(lowerBound1.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
			assertTrue(lowerBound2.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);

			assertTrue(upperBound1.getValue() == 20);
			assertTrue(upperBound2.getValue() == 20);
			assertTrue(upperBound1.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
			assertTrue(upperBound2.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		}
	}

	@Test
	public void testRelaxTwoClocksOnlyStrictConstraints(){
		//set up clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(clock1);
		clocks.add(clock2);

		// 10 < c1 < 20 && 30 < c2 < 40 && strict difference
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		SimpleClockConstraint scc1 = new SimpleClockConstraint(clock1, RelationalOperator.GreaterOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(clock1, RelationalOperator.LessOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(clock2, RelationalOperator.GreaterOperator, 30);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(clock2, RelationalOperator.LessOperator, 40);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(clock2, clock1, RelationalOperator.LessOperator, 20);
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);
		constraints.add(diff1);

		Federation federation = fedFactory.createFederation(clocks, constraints);
		federation.relax();

		// after relax: values unchanged; bounds are non-strict
		{
			SimpleClockConstraint lowerBound1 = (SimpleClockConstraint)federation.getLowerBound(clock1);
			SimpleClockConstraint lowerBound2 = (SimpleClockConstraint)federation.getLowerBound(clock2);
			SimpleClockConstraint upperBound1 = (SimpleClockConstraint)federation.getUpperBound(clock1);
			SimpleClockConstraint upperBound2 = (SimpleClockConstraint)federation.getUpperBound(clock2);

			assertTrue(lowerBound1.getValue() == 10);
			assertTrue(lowerBound2.getValue() == 30);
			assertTrue(lowerBound1.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
			assertTrue(lowerBound2.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);

			assertTrue(upperBound1.getValue() == 20);
			assertTrue(upperBound2.getValue() == 40);
			assertTrue(upperBound1.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
			assertTrue(upperBound2.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		}
	}
	
	@Test
	public void testRelaxTwoClocksStrictDifference(){
		//set up clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(clock1);
		clocks.add(clock2);

		// 10 <= c1 <= 20 && 30 < c2 < 40 && strict difference
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		SimpleClockConstraint scc1 = new SimpleClockConstraint(clock1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(clock1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(clock2, RelationalOperator.GreaterOperator, 30);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(clock2, RelationalOperator.LessOperator, 40);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(clock2, clock1, RelationalOperator.LessOperator, 20);
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);
		constraints.add(diff1);

		Federation federation = fedFactory.createFederation(clocks, constraints);
		federation.relax();

		// after relax: values unchanged; bounds are non-strict
		{
			SimpleClockConstraint lowerBound1 = (SimpleClockConstraint)federation.getLowerBound(clock1);
			SimpleClockConstraint lowerBound2 = (SimpleClockConstraint)federation.getLowerBound(clock2);
			SimpleClockConstraint upperBound1 = (SimpleClockConstraint)federation.getUpperBound(clock1);
			SimpleClockConstraint upperBound2 = (SimpleClockConstraint)federation.getUpperBound(clock2);

			assertTrue(lowerBound1.getValue() == 10);
			assertTrue(lowerBound2.getValue() == 30);
			assertTrue(lowerBound1.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
			assertTrue(lowerBound2.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);

			assertTrue(upperBound1.getValue() == 20);
			assertTrue(upperBound2.getValue() == 40);
			assertTrue(upperBound1.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
			assertTrue(upperBound2.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		}
	}
	
	@Test
	public void testRelaxFalseFederation(){
		//set up clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(clock1);

		// (false)
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		FalseClockConstraint fcc = new FalseClockConstraint();
		constraints.add(fcc);

		Federation federation = fedFactory.createFederation(clocks, constraints);
		federation.relax();
		
		assertTrue(federation.getLowerBound(clock1) instanceof FalseClockConstraint);
		assertTrue(federation.getUpperBound(clock1) instanceof FalseClockConstraint);
	}
	
	@Test
	public void testRelaxTrueFederation(){
		//set up clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(clock1);

		// (true)
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		TrueClockConstraint tcc = new TrueClockConstraint();
		constraints.add(tcc);

		Federation federation = fedFactory.createFederation(clocks, constraints);
		federation.relax();
		
		assertTrue(federation.getLowerBound(clock1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)federation.getLowerBound(clock1)).getValue() == 0);
		assertTrue(((SimpleClockConstraint)federation.getLowerBound(clock1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
		assertTrue(federation.getUpperBound(clock1) instanceof TrueClockConstraint);
	}
}
