package de.uni_paderborn.fujaba.common.emf.edit.ui.property;


/**
 * A Range, which has a starting position and a length.
 * 
 * @author bingo
 * 
 */
public class Range {
	/**
	 * The starting position of the range.
	 */
	private int start;

	/**
	 * The length of the range.
	 */
	private int length;

	/**
	 * Constructs this range.
	 */
	public Range() {
	}

	/**
	 * Constructs this range by copying the given range.
	 * 
	 * @param range
	 *            The range to copy.
	 */
	public Range(Range range) {
		this(range.getStart(), range.getLength());
	}

	/**
	 * Constructs this range.
	 * 
	 * @param start
	 *            The starting position of the range.
	 * @param length
	 *            The length of the range.
	 */
	public Range(int start, int length) {
		setStart(start);
		setLength(length);
	}

	/**
	 * Sets the starting position of this range.
	 * 
	 * @param start
	 *            The starting position.
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * Gets the starting position of this range.
	 * 
	 * @return The starting position.
	 */
	public int getStart() {
		return start;
	}

	/**
	 * Sets the length of this range.
	 * 
	 * @param length
	 *            The length.
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * Gets the length of this range.
	 * 
	 * @return The length.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Increments the length of this range.
	 */
	public void incrementLength() {
		length++;
	}

	/**
	 * Decrements the length of this range.
	 */
	public void decrementLength() {
		length--;
	}

	/**
	 * Find out, if the length is zero.
	 * 
	 * @return <code>true</code>, if the Range is empty.
	 */
	public boolean isEmpty() {
		return length == 0;
	}

	/**
	 * Gets a copied Range, which is moved by the given offset.
	 * 
	 * @param offset
	 *            The offset to move the Range by.
	 * @return The new range.
	 */
	public Range getMoved(int offset) {
		Range moved = new Range(this);
		moved.move(offset);
		return moved;
	}

	/**
	 * Moves this Range by the given offset.
	 * 
	 * @param offset
	 *            The offset to move this Range by.
	 */
	public void move(int offset) {
		setStart(getStart() + offset);
	}
}
