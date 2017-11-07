package org.muml.verification.core.refinement.testautomata;

import org.eclipse.emf.common.util.Enumerator;

public enum Requirement implements Enumerator {
	/**
	 * The restriction of the possible sequences of events communicated by
	 * one model to those sequences defined for the other model
	 */
	R1(0, "R1", "R1"),
	/**
	 * The restriction of interactions in one model to those intervals in
	 * which the same interaction is allowed in the other model
	 */
	R2(1, "R2", "R2"),
	/**
	 * The restriction of interactions in one model to not occur after the
	 * latest interaction in the other model
	 */
	R3(2, "R3", "R3"),
	/**
	 * The restriction of interactions in one model to not occur before the
	 * earliest interaction in the other model
	 */
	R4(3, "R4", "R4"), ;
	private final int value;
	private final String name, literal;

	public static final int R1_VALUE = 0;
	public static final int R2_VALUE = 1;
	public static final int R3_VALUE = 2;
	public static final int R4_VALUE = 3;

	// private static final Requirement[] VALUES_ARRAY = new Requirement[] {
	// R2, R3, R4, };

	Requirement(int value, String name, String literal) {
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
