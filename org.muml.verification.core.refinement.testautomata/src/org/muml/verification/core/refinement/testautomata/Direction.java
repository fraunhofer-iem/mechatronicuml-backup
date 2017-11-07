package org.muml.verification.core.refinement.testautomata;

import org.eclipse.emf.common.util.Enumerator;

public enum Direction implements Enumerator {
	/**
	 * refined RTSC is restricted
	 */
	REFINED(0, "REFINED", "REFINED"),
	/**
	 * abstract RTSC is restricted
	 */
	ABSTRACT(1, "ABSTRACT", "ABSTRACT");
	private final int value;
	private final String name, literal;

	public static final int REFINED_VALUE = 0;
	public static final int ABSTRACT_VALUE = 1;

	// private static final Direction[] VALUES_ARRAY = new Direction[] {
	// REFINED, ABSTRACT, };

	Direction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public int getValue() {

		return value;
	}

	@Override
	public String getLiteral() {

		return literal;
	}

}
