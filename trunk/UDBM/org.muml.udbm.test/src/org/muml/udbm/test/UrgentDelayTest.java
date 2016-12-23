package org.muml.udbm.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.muml.udbm.ClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.RelationalOperator;

public class UrgentDelayTest extends AbstractUDBMTest {
	private UDBMClock c1, c2, c3, c4;

	private HashSet<UDBMClock> clocks;

	@Override
	protected void testSpecificSetUp() {
		clocks = new HashSet<UDBMClock>();
		c1 = new UDBMClock("c1", "c1");
		c2 = new UDBMClock("c2", "c2");
		c3 = new UDBMClock("c3", "c3");
		c4 = new UDBMClock("c4", "c4");

		clocks.add(c1);
		clocks.add(c2);
		clocks.add(c3);
		clocks.add(c4);

	}

	@Test
	public void testUrgentDelay() {
		// HashMap for normalization
		HashMap<UDBMClock, Integer> clockMaxValues = new HashMap<UDBMClock, Integer>();
		clockMaxValues.put(c1, 1);
		clockMaxValues.put(c2, 0);
		clockMaxValues.put(c3, 0);
		clockMaxValues.put(c4, 0);

		// base federation
		Federation fed = fedFactory.createZeroFederation(clocks);

		// clock constraint of urgent transition
		HashSet<ClockConstraint> urgentConstraints = new HashSet<ClockConstraint>();
		SimpleClockConstraint urgentConstraint = new SimpleClockConstraint(c1,
				RelationalOperator.GreaterOrEqualOperator, 1);
		urgentConstraints.add(urgentConstraint);

		// federationa representing time intervals in which urgent transitions
		// can fire
		Federation urgentFederation = fedFactory.createFederation(clocks,
				urgentConstraints);
		HashSet<Federation> urgentFederations = new HashSet<Federation>();
		urgentFederations.add(urgentFederation);

		// urgent delay
		Federation upTriggerFed = (Federation) fed.clone();
		upTriggerFed.up();
		Federation downTriggerFed = (Federation) fed.clone();
		downTriggerFed.down();

		Iterator<Federation> fedIterator = urgentFederations.iterator();
		Federation orFederation = (Federation) fedIterator.next().clone();

		while (fedIterator.hasNext()) {
			orFederation.or(fedIterator.next());
		}

		orFederation.subtract(downTriggerFed);
		orFederation.up();
		upTriggerFed.subtract(orFederation);
		upTriggerFed.relax();
		// if (invariants != null)
		// upTriggerFed.and(invariants);
		// ((ZoneGraphState) result).setFederation(upTriggerFed);
		fed = upTriggerFed;

		// normalize
		fed.normalize(clockMaxValues);

		// and cc
		for (ClockConstraint curConstraint : urgentConstraints)
			fed.and(curConstraint);

		// reset
		HashSet<UDBMClock> resetClocks = new HashSet<UDBMClock>();
		resetClocks.add(c1);
		resetClocks.add(c2);
		fed.applyResets(resetClocks);

		// normalize
		fed.normalize(clockMaxValues);

		// urgent delay
		upTriggerFed = (Federation) fed.clone();
		upTriggerFed.up();
		downTriggerFed = (Federation) fed.clone();
		downTriggerFed.down();

		fedIterator = urgentFederations.iterator();
		orFederation = (Federation) fedIterator.next().clone();

		while (fedIterator.hasNext()) {
			orFederation.or(fedIterator.next());
		}

		orFederation.subtract(downTriggerFed);
		orFederation.up();
		upTriggerFed.subtract(orFederation);
		upTriggerFed.relax();
		fed = upTriggerFed;

		// normalize
		fed.normalize(clockMaxValues);

		// and cc
		for (ClockConstraint curConstraint : urgentConstraints)
			fed.and(curConstraint);

		// reset
		resetClocks.add(c1);
		resetClocks.add(c2);
		fed.applyResets(resetClocks);

		// normalize
		fed.normalize(clockMaxValues);

		assertTrue(fed.getClockZone().size()==1);

	}

}
