package org.muml.udbm.test;


import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.RelationalOperator;
import static org.junit.Assert.assertEquals;

public class CloneFederationTest extends AbstractUDBMTest {

	private UDBMClock c1;

	private UDBMClock c2;

	private UDBMClock c3;
	
	private HashSet<UDBMClock> clocks;

	@Override
	protected void testSpecificSetUp() {

		clocks = new HashSet<UDBMClock>();
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
		c3 = new UDBMClock("c3", "c3");
		clocks.add(c1);
		clocks.add(c2);
		clocks.add(c3);
	}

	@Test
	public void testClone(){
		
		Federation fed = fedFactory.createZeroFederation(clocks);
		Federation fed2 = fedFactory.createZeroFederation(clocks);

		// Let time pass and and with two constraints.
		fed.up();
		fed.and(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 40));
		fed.and(new SimpleClockConstraint(c2, RelationalOperator.GreaterOrEqualOperator, 5));
		fed.and(new DifferenceClockConstraint(c2, c3, RelationalOperator.LessOrEqualOperator, 15));

		//clone federation
		Federation clone = (Federation)fed.clone();

		//validate the clone, has to be recognized as equal
		assert(clone.equals(fed));
		checkCorrectnessOfBidirectionalLinks(clone, 3);

		//create federation with 2 zones by substracting a interval in the middle
		fed2.up();
		fed2.and(new SimpleClockConstraint(c1, RelationalOperator.GreaterOrEqualOperator, 15));
		fed2.and(new SimpleClockConstraint(c1, RelationalOperator.LessOrEqualOperator, 25));

		fed.subtract(fed2);

		clone = (Federation)fed.clone();

		//validate the clone, has to be recognized as equal
		assert(clone.equals(fed));
		checkCorrectnessOfBidirectionalLinks(clone, 4);

	}

	private void checkCorrectnessOfBidirectionalLinks(Federation clone, int numberOfClocks){
		//check correctness of bidirectional links
		Iterator<? extends UDBMClock> clockIter = clone.iteratorOfClock();
		while(clockIter.hasNext()){
			UDBMClock curClock = clockIter.next();
			assert(curClock.hasInFederation(clone));
		}

		Iterator<? extends ClockZone> zoneIter = clone.iteratorOfClockZone();
		while(zoneIter.hasNext()){
			ClockZone curZone = zoneIter.next();
			assert(curZone.getFederation() == clone);

			//iterate clock constraints
			Iterator<ClockConstraint> conIter = curZone.iteratorOfClockConstraint();
			while(conIter.hasNext()){
				ClockConstraint curCon = conIter.next();
				//assertEquals(curCon.getClockZone(),curZone);

				if (curCon instanceof SimpleClockConstraint){
					SimpleClockConstraint s = (SimpleClockConstraint)curCon;
					assert(s.getClock().hasInSimpleClockConstraint(s));
				}

				if (curCon instanceof DifferenceClockConstraint){
					DifferenceClockConstraint d = (DifferenceClockConstraint)curCon;
					assert(d.getClockMinuend().hasInDifferenceClockConstraintOfMinuend(d));
					assert(d.getClockSubtrahend().hasInDifferenceClockConstraintOfSubtrahend(d));
				}
			}
		}
	}
}
