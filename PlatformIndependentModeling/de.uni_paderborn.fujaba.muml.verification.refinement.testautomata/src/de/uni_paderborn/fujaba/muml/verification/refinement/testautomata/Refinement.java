package de.uni_paderborn.fujaba.muml.verification.refinement.testautomata;

public class Refinement {
	private TransitionType transitionType;
	private Direction direction;
	private Requirement requirement;


	Refinement(TransitionType transitionType, Direction direction, Requirement requirement) {
		this.transitionType = transitionType;
		this.direction = direction;
		this.requirement = requirement;
	}
	
	public TransitionType getTransitionType(){
		return transitionType;
	}

	public Direction getDirection() {
		return direction;
	}

	public Requirement getRequirement() {
		return requirement;
	}
}


