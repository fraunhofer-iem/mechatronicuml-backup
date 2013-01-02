package de.uni_paderborn.fujaba.muml.tests.emfcompare;

@SuppressWarnings("serial")
public class ComparationException extends Exception {

	private String reason;
	
	public ComparationException() {
		this("");
	}
	
	public ComparationException(String reason) {
		super();
		this.reason = reason;
	}


	public String getReason() {
		return reason;
	}
	
	
}
