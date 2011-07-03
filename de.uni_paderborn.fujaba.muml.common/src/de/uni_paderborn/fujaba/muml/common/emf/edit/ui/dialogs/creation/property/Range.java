package de.uni_paderborn.fujaba.muml.common.emf.edit.ui.dialogs.creation.property;

public class Range {
	private int start;
	private int length;
	
	public Range() {
	}
	
	public Range(int start, int length) {
		setStart(start);
		setLength(length);
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getStart() {
		return start;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void incrementLength() {
		length++;
	}
	
	public void decrementLength() {
		length--;
	}
}
