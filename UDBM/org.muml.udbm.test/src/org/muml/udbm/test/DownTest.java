package org.muml.udbm.test;

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

public class DownTest extends AbstractUDBMTest{
	
	private UDBMClock c1;
	
	private UDBMClock c2;

	@Override
	protected void testSpecificSetUp(){
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
	}

	@Test
	public void testDownZeroFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		Federation fed1 = fedFactory.createZeroFederation(clocks);
		
		fed1.down();
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//upper bound must be zero
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 0);
		
		//lower bound must be zero
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 0);
	}
	
	@Test
	public void testDownEmptyFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		ClockConstraint fcc = new FalseClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(fcc);
		
		Federation fed1 = fedFactory.createFederation(clocks, constraints);
		
		fed1.down();
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//both bounds must be false
		assertTrue((fed1.getUpperBound(c1)) instanceof FalseClockConstraint);
		assertTrue((fed1.getLowerBound(c1)) instanceof FalseClockConstraint);
	}
	
	@Test
	public void testDownTrueFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		ClockConstraint tcc = new TrueClockConstraint();
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(tcc);
		
		Federation fed1 = fedFactory.createFederation(clocks, constraints);
		
		fed1.down();
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//upper bound must be true
		assertTrue((fed1.getUpperBound(c1)) instanceof TrueClockConstraint);
		
		//lower bound must be zero
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 0);
	}
	
	@Test
	public void testDownConvexFederation_OneDimensionalCase(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//10 <= c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		
		Federation fed1 = fedFactory.createFederation(clocks, constraints);
		
		fed1.down();
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//upper bound must be 20, lower bound must be 0
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 0);
	}

	@Test
	public void testDownNonConvexFederation_OneDimensionalCase(){

		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);

		//Setup fed1: 10 <= c1 <= 20
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);

		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);

		Federation fed1 = fedFactory.createFederation(clocks, constraints);

		//Setup fed2: 50 <= c1 <= 60 
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 60);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 50);

		HashSet<ClockConstraint> constraints2 = new HashSet<ClockConstraint>();
		constraints2.add(scc5);
		constraints2.add(scc6);

		Federation fed2 = fedFactory.createFederation(clocks, constraints2);

		//obtain clock zones and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());

		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);

		//perform down
		fed.down();

		assertTrue(fed.sizeOfClockZone() == 1);

		//upper bound must be 20, lower bound must be 0
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 60);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 0);
	}
	
	@Test
	public void testDownConvexFederation_TwoDimensionalCase(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//Setup fed1: 10 <= c1 <= 20 && 30 <= c2 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 30);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 20);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -20);
		
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);
		constraints.add(diff1);
		constraints.add(diff2);
		
		Federation fed = fedFactory.createFederation(clocks, constraints);
		
		fed.down();
		
		assertTrue(fed.sizeOfClockZone() == 1);
		
		//check bounds, lower bound of c2 needs to be 20 because of the clock difference
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 20);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 0);
		
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 40);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 20);
	}
	
	@Test
	public void testDownNonConvexFederation_TwoDimensionalCase(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//Setup fed1: 10 <= c1 <= 20 && 30 <= c2 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 20);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 30);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 20);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -20);
		
		HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
		constraints.add(scc1);
		constraints.add(scc2);
		constraints.add(scc3);
		constraints.add(scc4);
		constraints.add(diff1);
		constraints.add(diff2);
		
		Federation fed1 = fedFactory.createFederation(clocks, constraints);
		
		//Setup fed2: 50 <= c1 <= 60 && 70 <= c2 <= 80
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 60);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 50);
		SimpleClockConstraint scc7 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 80);
		SimpleClockConstraint scc8 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 70);
		DifferenceClockConstraint diff3 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 20);
		DifferenceClockConstraint diff4 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -20);

		HashSet<ClockConstraint> constraints2 = new HashSet<ClockConstraint>();
		constraints2.add(scc5);
		constraints2.add(scc6);
		constraints2.add(scc7);
		constraints2.add(scc8);
		constraints2.add(diff3);
		constraints2.add(diff4);

		Federation fed2 = fedFactory.createFederation(clocks, constraints2);
		
		//obtain clock zones and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());

		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);
		
		fed.down();
		
		assertTrue(fed.sizeOfClockZone() == 1);
		
		//check bounds, lower bound of c2 needs to be 20 because of the clock difference
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 60);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 0);
		
		assertTrue(fed.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c2)).getValue() == 80);
		assertTrue(fed.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c2)).getValue() == 20);
	}
	
}
