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
	 * Check if the overloaded ClockZone is a strict subset of at least one ClockZone of a given Federation
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
		
		// Check if the overloaded ClockZone is a strict subset of at least one ClockZone of a given Federation
		// Contains function should return true, since ClockZone3 is a strict subset of ClockZone2
		assertTrue(jf.contains(ClockZone3, true));
	}
	
	/**
	 * Check if the overloaded ClockZone is a strict subset of at least one ClockZone of a given Federation
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

		// Check if the overloaded ClockZone is a strict subset of at least one ClockZone of a given Federation
		// Contains function should return false, since ClockZone3 is not a strict subset of ClockZone1
		assertTrue(!(jf.contains(ClockZone3, true)));
	}
	
	/**
	 * Check if the overloaded ClockZone is a strict subset of at least one ClockZone of a given Federation
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

		// Check if the overloaded ClockZone is a strict subset of at least one ClockZone of a given Federation
		// Contains function should return false, since ClockZone3 is not a strict subset of ClockZone1		
		assertTrue(!jf.contains(ClockZone3, true));
	}
	
	/**
	 * Check if the overloaded ClockZone is a subset of at least one ClockZone of a given Federation
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
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());

		// Check if the overloaded ClockZone is a subset of at least one ClockZone of a given Federation
		// Contains function should return true, since ClockZone3 is a subset of ClockZone2
		assertTrue(jf.contains(ClockZone3, false));
	}
	
	/**
	 * Check if the overloaded ClockZone is a subset of at least one ClockZone of a given Federation
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
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 16));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 19));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 16));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 19));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());

		// Check if the overloaded ClockZone is a subset of at least one ClockZone of a given Federation
		// Contains function should return true, since ClockZone3 is a subset of ClockZone2		
		assertTrue(jf.contains(ClockZone3, false));
	}

	/**
	 * Check if the overloaded ClockZone is a subset of at least one ClockZone of a given Federation
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
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 11));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 11));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());

		// Check if the overloaded ClockZone is a subset of at least one ClockZone of a given Federation
		// Contains function should return false, since ClockZone3 is not a subset of ClockZone2 or ClockZone3	
		assertTrue(!jf.contains(ClockZone3, false));
	}
	
	/**
	 * Check if the overloaded ClockZone is a subset of at least one ClockZone of a given Federation
	 */
	@Test
	public void testCheckSubset(){
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
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 11));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 11));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());

		// Check if the overloaded ClockZone is a subset of at least one ClockZone of a given Federation
		// Contains function should return false, since ClockZone3 is not a subset of ClockZone2 or ClockZone3	
		assertTrue(!jf.contains(ClockZone3, false));
	}
	
	/**
	 * Check if the ClockZones of the overloaded Federation are a strict subset of the ClockZones of the given Federation
	 */
	@Test
	public void testCheckStrictSubsetFederation1(){

		
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		
		// *** Federation 1 ***
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZonesFederation1 = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZonesFederation1.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZonesFederation1.add(ClockZone2);
				
		// Create Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf1 = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZonesFederation1);

		// *** Federation 2 ***
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZonesFederation2 = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints3 = new HashSet<ClockConstraint>();
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		ClockZonesFederation2.add(ClockZone3);
		
		HashSet<ClockConstraint> ClockConstraints4 = new HashSet<ClockConstraint>();
			ClockConstraints4.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints4.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints4.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints4.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone4 = new JavaClockZone(ClockConstraints4, clocks.size());
		ClockZonesFederation2.add(ClockZone4);
				
		// Create Federation
		JavaFederation jf2 = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZonesFederation2);		
		
		// Check if the ClockZones of the overloaded Federation are a strict subset of the ClockZones of the given Federation
		// Contains function should return false, since Federation2 is not a strict subset of Federation1
		assertTrue(!jf1.contains(jf2, true));
	}
	
	/**
	 * Check if the ClockZones of the overloaded Federation are a strict subset of the ClockZones of the given Federation
	 */
	@Test
	public void testCheckStrictSubsetFederation2(){
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		
		// *** Federation 1 ***
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZonesFederation1 = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZonesFederation1.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZonesFederation1.add(ClockZone2);
				
		// Create Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf1 = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZonesFederation1);

		// *** Federation 2 ***
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZonesFederation2 = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints3= new HashSet<ClockConstraint>();
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 9));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 9));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		ClockZonesFederation2.add(ClockZone3);
		
		HashSet<ClockConstraint> ClockConstraints4 = new HashSet<ClockConstraint>();
			ClockConstraints4.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 16));
			ClockConstraints4.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 19));
			ClockConstraints4.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 16));
			ClockConstraints4.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 19));
		JavaClockZone ClockZone4 = new JavaClockZone(ClockConstraints4, clocks.size());
		ClockZonesFederation2.add(ClockZone4);
				
		// Create Federation
		JavaFederationFactory jff2 = new JavaFederationFactory();
		JavaFederation jf2 = (JavaFederation) jff2.createFederationFromClockZones(clocks, ClockZonesFederation2);
		
		// Check if the ClockZones of the overloaded Federation are a strict subset of the ClockZones of the given Federation
		// Contains function should return false, since Federation2 is not a strict subset of Federation1
		assertTrue(!jf1.contains(jf2, true));
	}
	
	/**
	 * Check if the ClockZones of the overloaded Federation are a subset of the ClockZones of the given Federation
	 */
	@Test
	public void testCheckSubsetFederation3(){

		
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		
		// *** Federation 1 ***
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZonesFederation1 = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZonesFederation1.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZonesFederation1.add(ClockZone2);
				
		// Create Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf1 = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZonesFederation1);

		// *** Federation 2 ***
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZonesFederation2 = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints3 = new HashSet<ClockConstraint>();
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		ClockZonesFederation2.add(ClockZone3);
		
		HashSet<ClockConstraint> ClockConstraints4 = new HashSet<ClockConstraint>();
			ClockConstraints4.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints4.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints4.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints4.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone4 = new JavaClockZone(ClockConstraints4, clocks.size());
		ClockZonesFederation2.add(ClockZone4);
				
		// Create Federation
		JavaFederation jf2 = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZonesFederation2);		
		
		// Check if the ClockZones of the overloaded Federation are a subset of the ClockZones of the given Federation
		// Contains function should return true, since Federation2 is a subset of Federation1
		assertTrue(jf1.contains(jf2, false));
	}
	/**
	 * Check if the ClockZones of the overloaded Federation are a subset of the ClockZones of the given Federation
	 */
	@Test
	public void testCheckStrictSubsetFederation4(){
		// Clocks
		HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
			UDBMClock c1 = new UDBMClock("c1", "c1");
			UDBMClock c2 = new UDBMClock("c2", "c2");
			clocks.add(c1);
			clocks.add(c2);
		
		// *** Federation 1 ***
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZonesFederation1 = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints1 = new HashSet<ClockConstraint>();
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 10));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 5));
			ClockConstraints1.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 10));
		JavaClockZone ClockZone1 = new JavaClockZone(ClockConstraints1, clocks.size());
		ClockZonesFederation1.add(ClockZone1);
		
		HashSet<ClockConstraint> ClockConstraints2 = new HashSet<ClockConstraint>();
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 20));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints2.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 20));
		JavaClockZone ClockZone2 = new JavaClockZone(ClockConstraints2, clocks.size());
		ClockZonesFederation1.add(ClockZone2);
				
		// Create Federation
		JavaFederationFactory jff = new JavaFederationFactory();
		JavaFederation jf1 = (JavaFederation) jff.createFederationFromClockZones(clocks, ClockZonesFederation1);

		// *** Federation 2 ***
		// ClockConstraints and ClockZones
		HashSet<ClockZone> ClockZonesFederation2 = new HashSet<ClockZone>();
			
		HashSet<ClockConstraint> ClockConstraints3= new HashSet<ClockConstraint>();
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 9));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 6));
			ClockConstraints3.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 9));
		JavaClockZone ClockZone3 = new JavaClockZone(ClockConstraints3, clocks.size());
		ClockZonesFederation2.add(ClockZone3);
		
		HashSet<ClockConstraint> ClockConstraints4 = new HashSet<ClockConstraint>();
			ClockConstraints4.add(new SimpleClockConstraint(c1, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints4.add(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator  , 21));
			ClockConstraints4.add(new SimpleClockConstraint(c2, RelationalOperator.GreaterOperator  , 15));
			ClockConstraints4.add(new SimpleClockConstraint(c2, RelationalOperator.LessOrEqualOperator  , 21));
		JavaClockZone ClockZone4 = new JavaClockZone(ClockConstraints4, clocks.size());
		ClockZonesFederation2.add(ClockZone4);
				
		// Create Federation
		JavaFederationFactory jff2 = new JavaFederationFactory();
		JavaFederation jf2 = (JavaFederation) jff2.createFederationFromClockZones(clocks, ClockZonesFederation2);
		
		// Check if the ClockZones of the overloaded Federation are a subset of the ClockZones of the given Federation
		// Contains function should return false, since Federation2 is not a subset of Federation1
		assertTrue(!jf1.contains(jf2, false));
	}
}

