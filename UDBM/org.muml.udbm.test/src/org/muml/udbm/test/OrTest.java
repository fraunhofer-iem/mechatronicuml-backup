package org.muml.udbm.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.FalseClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;
import org.muml.udbm.clockconstraint.TrueClockConstraint;

public class OrTest extends AbstractUDBMTest{

	private UDBMClock c1;
	
	private UDBMClock c2;

	@Override
	protected void testSpecificSetUp(){
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
	}
	
	@Test
	public void testOrOneClockWithClockConstraint(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		
		//c1 >= 20
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		fed.or(scc2);
		
		assertTrue(fed.sizeOfClockZone() == 2);
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
	}
	
	@Test
	public void testOrOneClockWithFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		
		//c1 >= 20
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc2);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);
		
		fed.or(fed2);
		
		assertTrue(fed.sizeOfClockZone() == 2);
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
	}
	
	@Test
	public void testOrOneClockWithSetOfClockConstraints(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		
		//c1 >= 20 && c1 <= 40
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc2);
		clockConstraints2.add(scc3);
		
		fed.or(clockConstraints2);
		
		assertTrue(fed.sizeOfClockZone() == 2);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 40);
	}
	
	@Test
	public void testOrOneClockWithSubInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		
		//c1 <= 5
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 5);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		fed.or(scc2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 10);
	}
	
	@Test
	public void testOrOneClockWithTrueClockConstraint(){
		
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
		fed.or(tcc);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 0);
	}
	
	@Test
	public void testOrOneClockWithFalseClockConstraint(){
		
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
		fed.or(fcc);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}
	
	@Test
	public void testOrTwoClocksWithClockConstraint(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//c1 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		
		//c2 >= 20
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		fed.or(scc2);
		
		assertTrue(fed.sizeOfClockZone() == 2);
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
		assertTrue(fed.getUpperBound(c2) instanceof TrueClockConstraint); 
	}
	
	@Test
	public void testOrTwoClocksWithFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//c1 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		
		//c2 >= 20
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc2);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);
		
		fed.or(fed2);
		
		assertTrue(fed.sizeOfClockZone() == 2);
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
		assertTrue(fed.getUpperBound(c2) instanceof TrueClockConstraint);
	}
	
	@Test
	public void testOrTwoClocksWithSetOfClockConstraints(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//c1 <= 10 && c2 <= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 10);
		
		//c2 >= 20 && c2 <= 40
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 40);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed = fedFactory.createFederation(clocks, clockConstraints);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		
		fed.or(clockConstraints2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 40);
	}
	
	@Test
	public void testOrTwoClocskWithSubInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//c1 <= 5
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 5);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 5);
		
		//c2 <= 10
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 10);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2); 
		
		Federation fed = fedFactory.createZeroFederation(clocks);
		fed.up();
		fed.and(clockConstraints);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints.add(scc3);
		clockConstraints.add(scc4); 
		
		fed.or(clockConstraints2);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 10);
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 10);
	}
	
	@Test
	public void testOrEmptyFed(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//c1 >= 10
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		
		ClockConstraint falseConstraint = new FalseClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(falseConstraint);
		
		
		Federation fed = fedFactory.createFederation(clocks, constraints);
		
		fed.or(scc1);
		
		assertTrue(fed.sizeOfClockZone() == 1);
		assertTrue(fed.getUpperBound(c1) instanceof TrueClockConstraint);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 10);
	}
}
