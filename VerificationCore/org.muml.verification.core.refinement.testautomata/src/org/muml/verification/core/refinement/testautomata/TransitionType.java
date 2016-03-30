package org.muml.verification.core.refinement.testautomata;

import org.eclipse.emf.common.util.Enumerator;

public enum TransitionType implements Enumerator {
	/**
	 * For all transitions
	 */
	ALL(0, "REFINED", "REFINED"),
	/**
	 * Only for urgent transitions
	 */
	URGENT(1, "ABSTRACT", "ABSTRACT"),
	
	/**
	 * Only for transitions with send synchronizations
	 */
	OUTGOING(2, "OUTGOING", "OUTGOING"),
	
	/**
	 * Only for transitions with receive synchronizations
	 */
	INCOMING(3, "INCOMING", "INCOMING"),
	
	/**
	 * Only for transitions without synchronizations
	 */
	NONE(4, "NONE", "NONE");
	private final int value;
	private final String name, literal;

	public static final int ALL_VALUE = 0;
	public static final int URGENT_VALUE = 1;
	public static final int OUTGOING_VALUE = 2;
	public static final int INCOMING_VALUE = 3;
	public static final int NONE_VALUE = 4;


	TransitionType(int value, String name, String literal) {
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
