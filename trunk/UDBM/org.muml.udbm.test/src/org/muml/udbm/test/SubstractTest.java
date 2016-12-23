package org.muml.udbm.test;


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

public class SubstractTest extends AbstractUDBMTest{
	
	private UDBMClock c1;

	private UDBMClock c2;

	@Override
	protected void testSpecificSetUp(){
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
	}

	/**
	 * (20 <= c1 <= 40) - (25 <= c1 <= 35)
	 */
	@Test
	public void testSubtractOneClockWithSubinterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 25 <= c1 <= 35
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 25);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 35);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 2);
		
		//check total clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		
		//obtain lower zone (before the cut)
		ClockZone lowerZone = null;
		Iterator<? extends ClockZone> zoneIter = fed1.iteratorOfClockZone();
		while(zoneIter.hasNext() && lowerZone == null){
			ClockZone curZone = zoneIter.next();
			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint curCon = conIter.next();
				if(curCon instanceof SimpleClockConstraint){
					SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
					if(scc.getClock() == c1 && 
							scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator &&
							scc.getValue() == 20){
						lowerZone = curZone;
						break;
					}
				}
			}
		}
		
		//check upper bound for c1 in lower zone
		Iterator<ClockConstraint> conIter = lowerZone.iteratorOfClockConstraint();
		while(conIter.hasNext()){
			ClockConstraint curCon = conIter.next();
			if(curCon instanceof SimpleClockConstraint){
				SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
				//if this is not the lower bound, check it
				if(scc.getClock() == c1 && 
						!(scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator)){
					
					assertTrue(scc.getRelationalOperator() == RelationalOperator.LessOperator);
					assertTrue(scc.getValue() == 25);
					break;
				}
			}
		}
		
		//obtain upper zone
		ClockZone upperZone = null;
		zoneIter = fed1.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();
			if(curZone != lowerZone){
				upperZone = curZone;
				break;
			}
		}
		
		//check lower bound for c1 in upper zone
		conIter = upperZone.iteratorOfClockConstraint();
		while(conIter.hasNext()){
			ClockConstraint curCon = conIter.next();
			if(curCon instanceof SimpleClockConstraint){
				SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
				//if this is not the lower bound, check it
				if(scc.getClock() == c1 && 
						!(scc.getRelationalOperator() == RelationalOperator.LessOrEqualOperator)){
					
					assertTrue(scc.getRelationalOperator() == RelationalOperator.GreaterOperator);
					assertTrue(scc.getValue() == 35);
					break;
				}
			}
		}
	}
	
	/**
	 * (20 <= c1 <= 40) - (30 <= c1 <= 50)
	 */
	@Test
	public void testSubtractOneClockWithGreaterIntervalRight(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 30 <= c1 <= 50
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 30);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
	}
	
	/**
	 * (20 <= c1 <= 40) - (10 <= c1 <= 30)
	 */
	@Test
	public void testSubtractOneClockWithGreaterIntervalLeft(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 10 <= c1 <= 30
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 30);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 30);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOperator);
	}
	
	/**
	 * (20 <= c1 <= 40) - (50 <= c1 <= 60)
	 */
	@Test
	public void testSubtractOneClockWithOutsideIntervalRight(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 50 <= c1 <= 60
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 50);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 60);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
	}
	
	/**
	 * (20 <= c1 <= 40) - (10 <= c1 <= 15)
	 */
	@Test
	public void testSubtractOneClockWithOutsideIntervalLeft(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 10 <= c1 <= 15
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 15);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
	}
	
	/**
	 * (20 <= c1 <= 40) - (10 <= c1 <= 50)
	 */
	@Test
	public void testSubtractOneClockWithSuperInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 10 <= c1 <= 50
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds, must be false
		assertTrue(fed1.getUpperBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c1) instanceof FalseClockConstraint);
	}
	
	/**
	 * (20 <= c1 <= 40) - (20 <= c1 <= 40)
	 */
	@Test
	public void testSubtractOneClockWithSameInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 20 <= c1 <= 40
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds, must be false
		assertTrue(fed1.getUpperBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c1) instanceof FalseClockConstraint);
	}
	
	/**
	 * (20 <= c1 <= 40) - (20 < c1 < 40)
	 */
	@Test
	public void testSubtractOneClockWithSameNonStrictInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 20 < c1 < 40
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator, 20);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.LessOperator, 40);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 2);
		
		//check total clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);

		//obtain lower zone (before the cut)
		boolean lBoundFound = false;
		boolean uBoundFound = false;
		Iterator<? extends ClockZone> zoneIter = fed1.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();
			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint curCon = conIter.next();
				if(curCon instanceof SimpleClockConstraint){
					SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
					if(scc.getClock() == c1 && 
							scc.getRelationalOperator() == RelationalOperator.EqualOperator &&
							scc.getValue() == 20){
						lBoundFound = true;
						break;
					}
					
					if(scc.getClock() == c1 && 
							scc.getRelationalOperator() == RelationalOperator.EqualOperator &&
							scc.getValue() == 40){
						uBoundFound = true;
						break;
					}
				}
			}
		}

		assertTrue(lBoundFound);
		assertTrue(uBoundFound);
	}
	
	/**
	 * (20 <= c1 <= 40) - (true)
	 */
	@Test
	public void testSubtractOneClockWithTrueFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: true
		ClockConstraint scc3 = new TrueClockConstraint();
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds, must be false
		assertTrue(fed1.getUpperBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c1) instanceof FalseClockConstraint);
	}
	
	/**
	 * (20 <= c1 <= 40) - (false)
	 */
	@Test
	public void testSubtractOneClockWithFalseFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: false
		ClockConstraint scc3 = new FalseClockConstraint();
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
	}
	
	/**
	 * (20 <= c1 <= 40 | 50 <= c1 <= 70) - (30 <= c1 <= 60)
	 */
	@Test
	public void testSubtractOneClockNonConvexWithIntersectingMiddleInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 50 <= c1 <= 70
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 50);

		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);
		
		//obtain clock zones of fed1 and fed2 and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());

		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);
		assertTrue(fed.sizeOfClockZone() == 2);
		
		//fed3: 30 <= c1 <= 60
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 60);
		
		HashSet<ClockConstraint> clockConstraints3 = new HashSet<ClockConstraint>();
		clockConstraints3.add(scc5);
		clockConstraints3.add(scc6);
		Federation fed3 = fedFactory.createFederation(clocks, clockConstraints3);

		//perform substract
		fed.subtract(fed3);
		
		assertTrue(fed.sizeOfClockZone() == 2);
		
		//check clock bounds
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 70);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
		
		//obtain lower zone (before the cut)
		ClockZone lowerZone = null;
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext() && lowerZone == null){
			ClockZone curZone = zoneIter.next();
			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint curCon = conIter.next();
				if(curCon instanceof SimpleClockConstraint){
					SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
					if(scc.getClock() == c1 && 
							scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator &&
							scc.getValue() == 20){
						lowerZone = curZone;
						break;
					}
				}
			}
		}

		//check upper bound for c1 in lower zone
		Iterator<ClockConstraint> conIter = lowerZone.iteratorOfClockConstraint();
		while(conIter.hasNext()){
			ClockConstraint curCon = conIter.next();
			if(curCon instanceof SimpleClockConstraint){
				SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
				//if this is not the lower bound, check it
				if(scc.getClock() == c1 && 
						!(scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator)){

					assertTrue(scc.getRelationalOperator() == RelationalOperator.LessOperator);
					assertTrue(scc.getValue() == 30);
					break;
				}
			}
		}

		//obtain upper zone
		ClockZone upperZone = null;
		zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();
			if(curZone != lowerZone){
				upperZone = curZone;
				break;
			}
		}

		//check lower bound for c1 in upper zone
		conIter = upperZone.iteratorOfClockConstraint();
		while(conIter.hasNext()){
			ClockConstraint curCon = conIter.next();
			if(curCon instanceof SimpleClockConstraint){
				SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
				//if this is not the lower bound, check it
				if(scc.getClock() == c1 && 
						!(scc.getRelationalOperator() == RelationalOperator.LessOrEqualOperator)){

					assertTrue(scc.getRelationalOperator() == RelationalOperator.GreaterOperator);
					assertTrue(scc.getValue() == 60);
					break;
				}
			}
		}
	}
	
	/**
	 * (20 <= c1 <= 40 | 50 <= c1 <= 70) - (42 <= c1 <= 48)
	 */
	@Test
	public void testSubtractOneClockNonConvexWithNonIntersectingMiddleInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		
		//fed1: 20 <= c1 <= 40
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 50 <= c1 <= 70
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 50);

		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc3);
		clockConstraints2.add(scc4);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);
		
		//obtain clock zones of fed1 and fed2 and create fed from them
		HashSet<ClockZone> zones = new HashSet<ClockZone>();
		zones.addAll(fed1.getClockZone());
		zones.addAll(fed2.getClockZone());

		Federation fed = fedFactory.createFederationFromClockZones(clocks, zones);
		assertTrue(fed.sizeOfClockZone() == 2);
		
		//fed3: 42 <= c1 <= 48
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 42);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 48);
		
		HashSet<ClockConstraint> clockConstraints3 = new HashSet<ClockConstraint>();
		clockConstraints3.add(scc5);
		clockConstraints3.add(scc6);
		Federation fed3 = fedFactory.createFederation(clocks, clockConstraints3);

		//perform substract
		fed.subtract(fed3);

		//check clock bounds
		assertTrue(fed.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getValue() == 70);
		assertTrue(((SimpleClockConstraint)fed.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);

		//obtain lower zone (before the cut)
		ClockZone lowerZone = null;
		Iterator<? extends ClockZone> zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext() && lowerZone == null){
			ClockZone curZone = zoneIter.next();
			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint curCon = conIter.next();
				if(curCon instanceof SimpleClockConstraint){
					SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
					if(scc.getClock() == c1 && 
							scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator &&
							scc.getValue() == 20){
						lowerZone = curZone;
						break;
					}
				}
			}
		}

		//check upper bound for c1 in lower zone
		Iterator<ClockConstraint> conIter = lowerZone.iteratorOfClockConstraint();
		while(conIter.hasNext()){
			ClockConstraint curCon = conIter.next();
			if(curCon instanceof SimpleClockConstraint){
				SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
				//if this is not the lower bound, check it
				if(scc.getClock() == c1 && 
						!(scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator)){

					assertTrue(scc.getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
					assertTrue(scc.getValue() == 40);
					break;
				}
			}
		}

		//obtain upper zone
		ClockZone upperZone = null;
		zoneIter = fed.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();
			if(curZone != lowerZone){
				upperZone = curZone;
				break;
			}
		}

		//check lower bound for c1 in upper zone
		conIter = upperZone.iteratorOfClockConstraint();
		while(conIter.hasNext()){
			ClockConstraint curCon = conIter.next();
			if(curCon instanceof SimpleClockConstraint){
				SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
				//if this is not the lower bound, check it
				if(scc.getClock() == c1 && 
						!(scc.getRelationalOperator() == RelationalOperator.LessOrEqualOperator)){

					assertTrue(scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
					assertTrue(scc.getValue() == 50);
					break;
				}
			}
		}
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (25 <= c1 <= 35)
	 */
	@Test
	public void testSubtractTwoClocksWithSubinterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);
		
		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 25 <= c1 <= 35
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 25);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 35);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 2);
		
		//check total clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		
		assertTrue(fed1.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getValue() == 70);
		assertTrue(fed1.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getValue() == 50);
		
		//obtain lower zone (before the cut)
		ClockZone lowerZone = null;
		Iterator<? extends ClockZone> zoneIter = fed1.iteratorOfClockZone();
		while(zoneIter.hasNext() && lowerZone == null){
			ClockZone curZone = zoneIter.next();
			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint curCon = conIter.next();
				if(curCon instanceof SimpleClockConstraint){
					SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
					if(scc.getClock() == c1 && 
							scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator &&
							scc.getValue() == 20){
						lowerZone = curZone;
						break;
					}
				}
			}
		}
		
		//check upper bound for c1 in lower zone
		Iterator<ClockConstraint> conIter = lowerZone.iteratorOfClockConstraint();
		while(conIter.hasNext()){
			ClockConstraint curCon = conIter.next();
			if(curCon instanceof SimpleClockConstraint){
				SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
				//if this is not the lower bound, check it
				if(scc.getClock() == c1 && 
						!(scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator)){
					
					assertTrue(scc.getRelationalOperator() == RelationalOperator.LessOperator);
					assertTrue(scc.getValue() == 25);
				}
				if(scc.getClock() == c2 &&
						!(scc.getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator)){
					assertTrue(scc.getRelationalOperator() == RelationalOperator.LessOperator);
					assertTrue(scc.getValue() == 55);
				}
			}
		}
		
		//obtain upper zone
		ClockZone upperZone = null;
		zoneIter = fed1.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();
			if(curZone != lowerZone){
				upperZone = curZone;
				break;
			}
		}
		
		//check lower bound for c1 in upper zone
		conIter = upperZone.iteratorOfClockConstraint();
		while(conIter.hasNext()){
			ClockConstraint curCon = conIter.next();
			if(curCon instanceof SimpleClockConstraint){
				SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
				//if this is not the lower bound, check it
				if(scc.getClock() == c1 && 
						!(scc.getRelationalOperator() == RelationalOperator.LessOrEqualOperator)){
					
					assertTrue(scc.getRelationalOperator() == RelationalOperator.GreaterOperator);
					assertTrue(scc.getValue() == 35);
				}
				
				if(scc.getClock() == c2 && 
						!(scc.getRelationalOperator() == RelationalOperator.LessOrEqualOperator)){
					
					assertTrue(scc.getRelationalOperator() == RelationalOperator.GreaterOperator);
					assertTrue(scc.getValue() == 65);
				}
			}
		}
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (30 <= c1 <= 50)
	 */
	@Test
	public void testSubtractTwoClocksWithGreaterIntervalRight(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 30 <= c1 <= 50
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 30);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds of c1
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 30);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
		
		//check clock bound of c2 (are restricted by c1 due to the difference constraints)
		assertTrue(fed1.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getValue() == 60);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getRelationalOperator() == RelationalOperator.LessOperator);
		assertTrue(fed1.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getValue() == 50);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (10 <= c1 <= 30)
	 */
	@Test
	public void testSubtractTwoClocksWithGreaterIntervalLeft(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 10 <= c1 <= 30
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 30);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 30);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOperator);
		
		//check clock bound of c2 (are restricted by c1 due to the difference constraints)
		assertTrue(fed1.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getValue() == 70);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getValue() == 60);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getRelationalOperator() == RelationalOperator.GreaterOperator);
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (50 <= c1 <= 60)
	 */
	@Test
	public void testSubtractTwoClocksWithOutsideIntervalRight(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 50 <= c1 <= 60
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 50);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 60);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
		
		//check clock bound of c2 (are restricted by c1 due to the difference constraints)
		assertTrue(fed1.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getValue() == 70);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getValue() == 50);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (10 <= c1 <= 15)
	 */
	@Test
	public void testSubtractTwoClocksWithOutsideIntervalLeft(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 10 <= c1 <= 15
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 15);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
		
		//check clock bound of c2 (are restricted by c1 due to the difference constraints)
		assertTrue(fed1.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getValue() == 70);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getValue() == 50);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (10 <= c1 <= 50)
	 */
	@Test
	public void testSubtractTwoClocksWithSuperInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 10 <= c1 <= 50
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 10);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 50);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds, must be false
		assertTrue(fed1.getUpperBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getUpperBound(c2) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c2) instanceof FalseClockConstraint);
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (20 <= c1 <= 40)
	 */
	@Test
	public void testSubtractTwoClocksWithSameInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 20 <= c1 <= 40
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds, must be false
		assertTrue(fed1.getUpperBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getUpperBound(c2) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c2) instanceof FalseClockConstraint);
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (20 < c1 < 40)
	 */
	@Test
	public void testSubtractTwoClocksWithSameNonStrictInterval(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: 20 < c1 < 40
		SimpleClockConstraint scc5 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator, 20);
		SimpleClockConstraint scc6 = new SimpleClockConstraint(c1, RelationalOperator.LessOperator, 40);
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		clockConstraints2.add(scc6);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 2);
		
		//check total clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
		
		assertTrue(fed1.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getValue() == 70);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getValue() == 50);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);

		//obtain lower zone (before the cut)
		boolean lBoundFoundC1 = false;
		boolean uBoundFoundC1 = false;
		boolean lBoundFoundC2 = false;
		boolean uBoundFoundC2 = false;
		Iterator<? extends ClockZone> zoneIter = fed1.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();
			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint curCon = conIter.next();
				if(curCon instanceof SimpleClockConstraint){
					SimpleClockConstraint scc = (SimpleClockConstraint) curCon;
					if(scc.getClock() == c1 && 
							scc.getRelationalOperator() == RelationalOperator.EqualOperator &&
							scc.getValue() == 20){
						lBoundFoundC1 = true;
					}
					
					if(scc.getClock() == c2 && 
							scc.getRelationalOperator() == RelationalOperator.EqualOperator &&
							scc.getValue() == 50){
						lBoundFoundC2 = true;
					}
					
					if(scc.getClock() == c1 && 
							scc.getRelationalOperator() == RelationalOperator.EqualOperator &&
							scc.getValue() == 40){
						uBoundFoundC1 = true;
					}
					
					if(scc.getClock() == c2 && 
							scc.getRelationalOperator() == RelationalOperator.EqualOperator &&
							scc.getValue() == 70){
						uBoundFoundC2 = true;
					}
				}
			}
		}

		assertTrue(lBoundFoundC1);
		assertTrue(uBoundFoundC1);
		assertTrue(lBoundFoundC2);
		assertTrue(uBoundFoundC2);
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (true)
	 */
	@Test
	public void testSubtractTwoClocksWithTrueFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: true
		ClockConstraint scc5 = new TrueClockConstraint();
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds, must be false
		assertTrue(fed1.getUpperBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c1) instanceof FalseClockConstraint);
		assertTrue(fed1.getUpperBound(c2) instanceof FalseClockConstraint);
		assertTrue(fed1.getLowerBound(c2) instanceof FalseClockConstraint);
	}
	
	/**
	 * (20 <= c1 <= 40 && 50 <= c2 <= 70) - (false)
	 */
	@Test
	public void testSubtractTwoClocksWithFalseFederation(){
		
		//setup clock set
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
		clocks.add(c1);
		clocks.add(c2);
		
		//fed1: 20 <= c1 <= 40 && 50 <= c2 <= 70
		SimpleClockConstraint scc1 = new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40);
		SimpleClockConstraint scc2 = new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 20);
		SimpleClockConstraint scc3 = new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator, 70);
		SimpleClockConstraint scc4 = new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 50);
		DifferenceClockConstraint diff1 = new DifferenceClockConstraint(c1, c2, RelationalOperator.LessOrEqualOperator, -30);
		DifferenceClockConstraint diff2 = new DifferenceClockConstraint(c2, c1, RelationalOperator.LessOrEqualOperator, 30);

		HashSet<ClockConstraint> clockConstraints = new HashSet<ClockConstraint>();
		clockConstraints.add(scc1);
		clockConstraints.add(scc2);
		clockConstraints.add(scc3);
		clockConstraints.add(scc4);
		clockConstraints.add(diff1);
		clockConstraints.add(diff2);
		Federation fed1 = fedFactory.createFederation(clocks, clockConstraints);
		
		//fed2: false
		ClockConstraint scc5 = new FalseClockConstraint();
		
		HashSet<ClockConstraint> clockConstraints2 = new HashSet<ClockConstraint>();
		clockConstraints2.add(scc5);
		Federation fed2 = fedFactory.createFederation(clocks, clockConstraints2);

		//perform substract
		fed1.subtract(fed2);
		
		assertTrue(fed1.sizeOfClockZone() == 1);
		
		//check clock bounds
		assertTrue(fed1.getUpperBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getValue() == 40);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c1)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c1) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getValue() == 20);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c1)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
		
		//check clock bound of c2 (are restricted by c1 due to the difference constraints)
		assertTrue(fed1.getUpperBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getValue() == 70);
		assertTrue(((SimpleClockConstraint)fed1.getUpperBound(c2)).getRelationalOperator() == RelationalOperator.LessOrEqualOperator);
		assertTrue(fed1.getLowerBound(c2) instanceof SimpleClockConstraint);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getValue() == 50);
		assertTrue(((SimpleClockConstraint)fed1.getLowerBound(c2)).getRelationalOperator() == RelationalOperator.GreaterOrEqualOperator);
	}
}
