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
import org.muml.udbm.java.JavaClockZone;
import org.muml.udbm.java.JavaFederation;
import org.muml.udbm.java.JavaFederationFactory;

public class ContainsTest extends AbstractUDBMTest{
	
	@Override
	protected void testSpecificSetUp() {
	}
	
	/**
	 * Check if a overloaded ClockZone is a strict subset of all ClockZones of a given Federation
	 */
	@Test
	public void testCheckStrictSubset1(){

		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZones = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZones.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 0));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 0));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZones.add(ClockZone2);
				
		// Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZones);
		
		// New ClockZone
		HashSet<ClockConstraint> ClockConstraints3 = new HashSet<ClockConstraint>();	
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 9));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 9));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		
		assertTrue(jf.contains(ClockZone3, true));
	}
	
	/**
	 * Check if a overloaded ClockZone is a strict subset of all ClockZones of a given Federation
	 */
	@Test
	public void testCheckStrictSubset2(){
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZones = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZones.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 0));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 0));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZones.add(ClockZone2);
				
		// Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZones);
		
		// New ClockZone
		HashSet<ClockConstraint> ClockConstraints3 = new HashSet<ClockConstraint>();	
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		
		assertTrue(!(jf.contains(ClockZone3, true)));
	}
	
	/**
	 * Check if a overloaded ClockZone is a strict subset of all ClockZones of a given Federation
	 */
	@Test
	public void testCheckStrictSubset3(){
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZones = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZones.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 0));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 0));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZones.add(ClockZone2);
				
		// Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZones);
		
		// New ClockZone
		HashSet<ClockConstraint> ClockConstraints3 = new HashSet<ClockConstraint>();	
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 4));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 11));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 4));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 11));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		
		assertTrue(!jf.contains(ClockZone3, true));
	}
	
	/**
	 * Check if a overloaded ClockZone is a subset of at least one ClockZones of a given Federation
	 */
	@Test
	public void testCheckSubset1(){
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZones = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZones.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZones.add(ClockZone2);
				
		// Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZones);
		
		// New ClockZone
		HashSet<ClockConstraint> ClockConstraints3 = new HashSet<ClockConstraint>();	
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 9));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 9));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		
		assertTrue(jf.contains(ClockZone3, false));
	}
	
	/**
	 * Check if a overloaded ClockZone is a subset of at least one ClockZones of a given Federation
	 */
	@Test
	public void testCheckSubset2(){
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZones = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZones.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZones.add(ClockZone2);
				
		// Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZones);
		
		// New ClockZone
		HashSet<ClockConstraint> ClockConstraints3 = new HashSet<ClockConstraint>();	
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		
		assertTrue(jf.contains(ClockZone3, false));
	}

	/**
	 * Check if a overloaded ClockZone is a subset of at least one ClockZones of a given Federation
	 */
	@Test
	public void testCheckSubset3(){
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZones = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZones.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZones.add(ClockZone2);
				
		// Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZones);
		
		// New ClockZone
		HashSet<ClockConstraint> ClockConstraints3 = new HashSet<ClockConstraint>();	
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		
		assertTrue(jf.contains(ClockZone3, false));
	}
}

