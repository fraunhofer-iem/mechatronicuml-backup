package org.muml.udbm.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.ComparativeClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;
import org.muml.udbm.clockconstraint.TrueClockConstraint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaClockZone extends ClockZone {

	/**
	 * The matrix representing the clock zone as DBM. The least significant bit
	 * of an entry represents the strictness of the bound. If the LSB = 0, the bound
	 * is strict, if LSB = 1 it is not strict. The row and column 0 represents
	 * the Zero-Clock which is always 0.
	 */
	private int[][] matrix;
	
	private String dbmValueString = "";
	
	private Logger logger = LoggerFactory.getLogger(JavaFederation.class);
		
	@Override
	protected boolean setFederation(Federation value) 
	{
		boolean result = super.setFederation(value);
		for(ClockConstraint cc : clockConstraint)
		{
			this.addToClockConstraint(cc);
		}
//		super.removeAllFromClockConstraint();
		return result;
	}
	
	
	@Override
	protected boolean addToClockConstraint(ClockConstraint value) {

		if (this.getFederation() == null)
		{
			// save clock constraint as long as there is no federation
			// this is the case upon the creation of the ClockZone 
			super.addToClockConstraint(value);
		}
		else
			this.and(value);
		return true;
	}


	@Override
	public Object clone() {
		Object clone = super.clone();
		((JavaClockZone)clone).matrix = new int [this.matrix.length][this.matrix.length];
		for (int i = 0; i < ((JavaClockZone)clone).matrix.length; i++) {
			for (int j = 0; j < ((JavaClockZone)clone).matrix.length; j++) {
				((JavaClockZone)clone).matrix[i][j] = this.matrix[i][j];
			}
		}
		return clone;
	}


	@Override
	/**
	 * Considers all constraints within the zone for computing the
	 * hash value. Runs in O(n^2) for n clocks.
	 */
	protected long computeStrongHash() {
		int hashValue;
		long result = 17;
		int multiplier = 59;
		
		for (int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				hashValue = ((Integer)matrix[i][j]).hashCode();
				result = result * multiplier + hashValue;
			}
		}
		return result;
	}

	@Override
	/**
	 * Considers only the upper and lower bound of the clocks in the zone
	 * for computing the hash value. Runs in O(n) for n clocks.
	 */
	protected long computeWeakHash() {
		int hashValue;
		long result = 17;
		int multiplier = 59;
		
		//consider lower bounds first
		for (int i = 0; i <= matrix.length; i++){
			hashValue = ((Integer)matrix[0][i]).hashCode();
			result = result * multiplier + hashValue;
		}
		
		//consider upper bounds next
		for (int i = 0; i <= matrix.length; i++){
			hashValue = ((Integer)matrix[i][0]).hashCode();
			result = result * multiplier + hashValue;
		}
		
		return result;
	}

	@Override
	public boolean hasInClockConstraint(ClockConstraint value) {
		int constraintValue = dbmValue( ((ComparativeClockConstraint) value).getValue(), ((ComparativeClockConstraint) value).getRelationalOperator() );
		
		// compute indices of the UDBMClocks of the constraint in the matrix
		int minuendClockId = 0;
		int subtrahendClockId = 0;
		if(value instanceof SimpleClockConstraint)
		{
			minuendClockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((SimpleClockConstraint) value).getClock());
		}
		else if(value instanceof DifferenceClockConstraint)
		{
			minuendClockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((DifferenceClockConstraint) value).getClockMinuend());
			subtrahendClockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((DifferenceClockConstraint) value).getClockSubtrahend());
		}


		return matrix[minuendClockId][subtrahendClockId] == constraintValue;
	}

	@Override
	public Iterator<ClockConstraint> iteratorOfClockConstraint() {
		HashSet<ClockConstraint> clockConstraints= new HashSet<ClockConstraint>();
		
		for (int i = 1; i < matrix.length; i++) {
			if(matrix[i][0] != Integer.MAX_VALUE)
			{
				UDBMClock clock = ((JavaFederation)this.getFederation()).indicesToClockNames.get(i);
				RelationalOperator relationalOperator = isStrict(matrix[i][0]) ? RelationalOperator.LessOperator : RelationalOperator.LessOrEqualOperator;
				int value = getValue(matrix[i][0]);
				clockConstraints.add(new SimpleClockConstraint(clock, relationalOperator, value));
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			if(matrix[0][i] != 1)
			{
				UDBMClock clock = ((JavaFederation)this.getFederation()).indicesToClockNames.get(i);
				RelationalOperator relationalOperator = isStrict(matrix[0][i]) ? RelationalOperator.GreaterOperator : RelationalOperator.GreaterOrEqualOperator;
				int value = getValue(matrix[0][i]);

				clockConstraints.add(new SimpleClockConstraint(clock, relationalOperator, -value));

			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix.length; j++) {
				if(i!=j && matrix[i][j] != Integer.MAX_VALUE)
				{
					UDBMClock clockMinuend = ((JavaFederation)this.getFederation()).indicesToClockNames.get(i);
					UDBMClock clockSubtrahend = ((JavaFederation)this.getFederation()).indicesToClockNames.get(j);
					RelationalOperator relationalOperator = isStrict(matrix[i][j]) ? RelationalOperator.LessOperator : RelationalOperator.LessOrEqualOperator;
					int value = getValue(matrix[i][j]);
					
					clockConstraints.add(new DifferenceClockConstraint(clockMinuend, clockSubtrahend, relationalOperator, value));
				}
			}
		}
		
		return clockConstraints.iterator();
	}

	@Override
	protected void removeAllFromClockConstraint() {
		
		hashCacheValid = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Integer.MAX_VALUE;
			}
		}
		matrix[0][0] = -((1 << 1) + 1);
	}

	@Override
	protected boolean removeFromClockConstraint(ClockConstraint value) {
		if (value instanceof SimpleClockConstraint)
		{
			int index = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((SimpleClockConstraint)value).getClock());
			matrix[index][0] = Integer.MAX_VALUE;
		}
		else if (value instanceof DifferenceClockConstraint)
		{
			int firstIndex = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((DifferenceClockConstraint)value).getClockMinuend());
			int secondIndex = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((DifferenceClockConstraint)value).getClockSubtrahend());
			
			matrix [firstIndex][secondIndex] = Integer.MAX_VALUE;

		}
		else return false; 
		return true;
	}

	@Override
	public int sizeOfClockConstraint() {
		if (matrix == null || this.isEmpty())
			return 0;
		return matrix.length*matrix.length;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
//		for (int i = 0; i < matrix.length; i++) {
//			String clockName1 = ((JavaFederation)this.getFederation()).indicesToClockNames.get(i).getName();
//			for (int j = 0; j < matrix.length; j++) {	
//				if ((i != 0 || j != 0) && i != j)
//				{
//					String clockName2 = ((JavaFederation)this.getFederation()).indicesToClockNames.get(j).getName();
//					String value = " " + (matrix[i][j] >> 1);
//					String operator = " " + ((matrix[i][j] & 1) == 0 ? "<" : "<=");
//					String clockNameTemp = clockName1;
//					if (matrix[i][j] >= Integer.MAX_VALUE -1)
//					{
//						value = "inf";
//					}
//					else if(matrix[i][j] < 0)
//					{
//						value = "" + (-1 * getValue(matrix[i][j]));
//						operator = "" + ((matrix[i][j] & 1) == 0 ? ">" : ">=");
//
//						clockName1 = clockName2;
//						clockName2 = clockNameTemp;
//					}
//
//						
//					String entry = clockName1 + (clockName2.equals("zeroclock") ? "" : ("-" + clockName2)) + operator + value;
//
//					buffer.append("   " + entry + "   ");
//
//					clockName1 = clockNameTemp;
//				}
//			}
//			buffer.append("\n");
//		}
		
		Iterator<ClockConstraint> iterator = this.iteratorOfClockConstraint();
		
		while(iterator.hasNext())
		{
			buffer.append(iterator.next().toString());
			if(iterator.hasNext())
			buffer.append(" & ");
		}
		return buffer.toString();
	}

	public JavaClockZone(HashSet<ClockConstraint> clockConstraints, int clockCount) 
	{
		super(clockConstraints);
		matrix = new int [clockCount+1][clockCount+1];
		
		// all clocks start with zero
		// i.e. all clock constraints are (0, <=)
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = i == j || i == 0 ? 1 : Integer.MAX_VALUE;
			}
		}
		matrix[0][0] = -((1 << 1) + 1);
		
		hashCacheValid = false;
	}
	
	/**
	 * Returns true if the given clock value contains a strict bound.
	 * @param i the clock value to be checked
	 * @return
	 */
	protected static boolean isStrict(int i) {
		return (i & 1) == 0;
	}
	
	/**
	 * Returns the integer value of the clock value, i.e. the strictness information
	 * is removed from the clock value.
	 * @param i the clock value to be converted
	 * @return
	 */
	protected static int getValue(int i) {
		
		if(i<0 && (i&1)==1)
			return (i+1)>>1;
		return i>>1;
	}
	
	/** 
	 * Adds two encoded bounds
	 * @param b1 the first encoded bound
	 * @param b2 the second encoded bound
	 * @return 
	 */
	protected static int addBounds(int b1, int b2)
	{
		if(b1 == Integer.MAX_VALUE || b2 == Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		else{
			
			// add values, for operator: "<" + "<" = "<" 
			//							 "<=" + "<" = "<" 
			//							 "<=" + "<=" = "<="

			int value = ( getValue(b1) + getValue(b2) )<<1;
			if (value>=0){
				return value + ((b1&1)&(b2&1));
			}
			else {
				return value - ((b1&1)&(b2&1));
			}
		}

	}
	
	public void down()
	{
		//TODO: remove workaround after fixing clone()
		//workaround to prevent revert of down() by clone()
		for(ClockConstraint cc:new LinkedList<ClockConstraint>(clockConstraint))
			if(cc instanceof SimpleClockConstraint)
				if(((SimpleClockConstraint)cc).getRelationalOperator().toString().contains(">"))
					clockConstraint.remove(cc);
		hashCacheValid = false;
		for(int i = 0; i < matrix.length; i++)
		{
			matrix[0][i] = 1;
			for(int j = 0; j < matrix.length; j++)
			{
				if(matrix[j][i] < matrix[0][i])
					matrix [0][i] = matrix[j][i]; 
			}
		}
	}
	
	public void up()
	{
		//TODO: remove workaround after fixing clone()
		//workaround to prevent revert of up() by clone()
		for(ClockConstraint cc:new LinkedList<ClockConstraint>(clockConstraint))
			if(cc instanceof SimpleClockConstraint)
				if(((SimpleClockConstraint)cc).getRelationalOperator().toString().contains("<"))
					clockConstraint.remove(cc);
					
		hashCacheValid = false;
		for(int i = 1; i < matrix.length; i++)
		{
			matrix[i][0] = Integer.MAX_VALUE;
		}
	}
	
	/**
	 * checks wether a JavaClockZone is part of this JavaClockZone, vice versa, both or neither nor
	 * @param cz a JavaClockZone
	 * @return 0 (=000) if the Zones are disjunct, 
	 * 	1 (=001) if the given Zone is part of this Zone, 
	 * 	2 (=010) if this Zone is part of the given Zone, 
	 *  3 (=011) if the Zones are equal
	 */
	public int relation(JavaClockZone cz)
	{
		boolean thisPartOfCz = true;
		boolean czPartOfThis = true;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				thisPartOfCz = thisPartOfCz && this.matrix[i][j] <= cz.matrix[i][j];
				czPartOfThis = czPartOfThis && this.matrix[i][j] >= cz.matrix[i][j];
			}
		}
		
		return (thisPartOfCz ? (1 << 1) : 0) + (czPartOfThis ? 1 : 0);
	}
	
	public void reset(UDBMClock clock)
	{
		hashCacheValid = false;
		int value = 0; // clocks are always reseted to 0
		int clockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(clock);
		matrix[clockId][0] = ((value<<1)+1);
		matrix[0][clockId] = ((value<<1)+1);
		for(int i = 1; i < matrix.length; i++)
		{
			if(clockId != i) {
				matrix[clockId][i] = addBounds(((value<<1)+1),matrix[0][i]);
				matrix[i][clockId] = addBounds(matrix[i][0],(-(value<<1)+1));
			}
		}
	}
	
	public void and(ClockConstraint value) {
		
		printDBM();
				
		hashCacheValid = false;
		this.matrix [0][0] = 1;
		if (value instanceof TrueClockConstraint)
		{
			return;
		}
		ComparativeClockConstraint adjustedClockConstraint = adjustClockConstraint((ComparativeClockConstraint)value);
		int constraintValue = dbmValue( adjustedClockConstraint.getValue(), adjustedClockConstraint.getRelationalOperator() );

		// compute indices of the UDBMClocks of the constraint in the matrix
		int minuendClockId = 0;
		int subtrahendClockId = 0;
		if(adjustedClockConstraint instanceof SimpleClockConstraint)
		{
			minuendClockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((SimpleClockConstraint) adjustedClockConstraint).getClock());

		}
		else if(adjustedClockConstraint instanceof DifferenceClockConstraint)
		{
			if(((DifferenceClockConstraint) adjustedClockConstraint).getClockMinuend() == null)
				minuendClockId = 0;
			else
				minuendClockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((DifferenceClockConstraint) adjustedClockConstraint).getClockMinuend());
			subtrahendClockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(((DifferenceClockConstraint) adjustedClockConstraint).getClockSubtrahend());
		}
		
		// check if ClockZone is empty after adding new constraint 
		int checkValue = addBounds(matrix[subtrahendClockId][minuendClockId],constraintValue);
		if(checkValue != -1 && getValue(checkValue) < 0)
			// -((1 << 1) + 1) == -0011 which means (-1,<=)
			matrix[0][0] = -((1 << 1) + 1);
		// check if new constraint is smaller i.e. more restrictive. 
		// Use matrix entry without removing LSB, this ensures to regard the operator (< is smaller than <=)
		else if(constraintValue < matrix[minuendClockId][subtrahendClockId] 
				// exclude special case:
				// constraint is greater(equal) constraint, value is equal to the one in the matrix, 
				// and the matrix entry is strict while the constraintValue is not
				&& ! (constraintValue<0 && getValue(constraintValue) == getValue(matrix[minuendClockId][subtrahendClockId])
						&& isStrict(matrix[minuendClockId][subtrahendClockId]) && !isStrict(constraintValue))
				// include special case: 
				// constraint is greater(equal) constraint, value is equal to the one in the matrix, 
				// and the matrix entry is not strict while the constraintValue is strict
				|| (constraintValue<0 && getValue(constraintValue) == getValue(matrix[minuendClockId][subtrahendClockId])
						&& !isStrict(matrix[minuendClockId][subtrahendClockId]) && isStrict(constraintValue))
				)
		{
			// set new matrix entry
			matrix[minuendClockId][subtrahendClockId] = constraintValue;
			for(int i = 0; i < matrix.length;i++)
			{
				for(int j = 0; j < matrix.length;j++)
				{
					if (i != 0 || j != 0)
					{
						checkValue = addBounds(matrix[i][minuendClockId], matrix[minuendClockId][j]);
						if(checkValue == -1)
							checkValue = 1;
						if(checkValue < matrix[i][j])
						{
							matrix[i][j] = checkValue;
						}
						checkValue = addBounds(matrix[i][subtrahendClockId], matrix[subtrahendClockId][j]);
						if(checkValue == -1)
							checkValue = 1;
						if(checkValue < matrix[i][j])
						{
							matrix[i][j] = checkValue;
						}
					}
				}
			}
			emptyCheck:
			for (int i = 1; i < matrix.length; i++) {
				for (int j = 1; j < matrix.length; j++) {
					if(matrix[i][j] == 0){
						// difference between clocks is smaller 0!
						// zone is empty
						matrix[0][0] = -((1 << 1) + 1);
						break emptyCheck;
					}
				}
			}
		}
		
		printDBM();
	}

	// Used for debugging
	private void printDBM() {
		String output = null;
		
		output = System.getProperty("line.separator") + "DBM"
				+ System.getProperty("line.separator") + " - first columb [i][0]: upper bounds"
				+ System.getProperty("line.separator") + " - first row [0][j]: lower bounds"
				+ System.getProperty("line.separator") + " - entry [0][0] == -3: DBM unsatifiable, means DBM is empty"
				+ System.getProperty("line.separator") + " - else: clock[i].value - clock[j]"
				+ System.getProperty("line.separator");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				output = output + matrix[i][j] + "\t \t \t";
			}
			output = output + System.getProperty("line.separator");
		}
		
		if (output.equals(dbmValueString)){
			System.out.println("DBM unchanged");
		}
		else{
			dbmValueString = output;
			logger.debug(output);
//			System.out.println(output);
		}
		

	}


	/**
	 * As the matrix only supports < and <= operators the clock constraint needs to be adjusted if it contains > or >= operator. 
	 * 
	 * @param value a clock constraint which may contain all kinds of relational operators
	 * @return a clock constraint which is equivalent to the input clock constraint but only with < or <= operator. Example: c1 - c2 > x  <=> c2 - c1 < -x
	 */
	private ComparativeClockConstraint adjustClockConstraint(
			ComparativeClockConstraint value) 
	{
		
		if(value.getRelationalOperator() == RelationalOperator.LessOperator 
				|| value.getRelationalOperator()  == RelationalOperator.LessOrEqualOperator)
			return value;
		
		ComparativeClockConstraint newValue = value;

		if(value.getRelationalOperator() == RelationalOperator.EqualOperator){
			// This implementation does not support the equal operator directly, 
			// since the matrix only allows encoding of < and <= operators. 
			// So we split the equal constraint to a greater-equal and a less-equal constraint:
			
			if (value instanceof SimpleClockConstraint)
			{

				SimpleClockConstraint greaterOrEqualCC = new SimpleClockConstraint(((SimpleClockConstraint) value).getClock(),
						RelationalOperator.GreaterOrEqualOperator, value.getValue());
				// add the greater-Equal clock constraint to this zone
				this.and(greaterOrEqualCC);
			
				newValue = new SimpleClockConstraint(((SimpleClockConstraint) value).getClock(),
						RelationalOperator.LessOrEqualOperator, value.getValue());
			}
			else if (value instanceof DifferenceClockConstraint)
			{
				DifferenceClockConstraint greaterOrEqualCC = new DifferenceClockConstraint(((DifferenceClockConstraint)value).getClockMinuend(), 
						((DifferenceClockConstraint)value).getClockSubtrahend(), 
						RelationalOperator.GreaterOrEqualOperator, value.getValue());
				// add the greater-Equal clock constraint to this zone
				this.and(greaterOrEqualCC);
				
				newValue = new DifferenceClockConstraint(((DifferenceClockConstraint)value).getClockMinuend(), 
						((DifferenceClockConstraint)value).getClockSubtrahend(), 
						RelationalOperator.LessOrEqualOperator, value.getValue());
			}
			// return the less-equal constraint to the calling and-method, since it may be processed without further adjustments
			return newValue;
		}
		else{
			RelationalOperator newOperator = value.getRelationalOperator() == RelationalOperator.GreaterOperator ? RelationalOperator.LessOperator : RelationalOperator.LessOrEqualOperator;

			if (value instanceof SimpleClockConstraint)
			{

				newValue = new DifferenceClockConstraint(((JavaFederation)this.getFederation()).indicesToClockNames.get(0), ((SimpleClockConstraint)value).getClock(),
						newOperator, -value.getValue());
			}
			else if (value instanceof DifferenceClockConstraint)
			{
				newValue = new DifferenceClockConstraint(((DifferenceClockConstraint)value).getClockSubtrahend(), 
						((DifferenceClockConstraint)value).getClockMinuend(), 
						newOperator, -value.getValue());
			}

			return newValue;
		}
	}


	public void and(JavaClockZone otherZone)
	{
		Iterator<ClockConstraint> clockConstraintIt = otherZone.iteratorOfClockConstraint();
		while(clockConstraintIt.hasNext())
		{
			ClockConstraint cc = clockConstraintIt.next();
			//without this check, an empty federation could become larger again by adding constraints
			if(!isEmpty())
				this.and(cc);
		}
	}
	
	public boolean isEmpty() {
		return matrix[0][0] == -((1 << 1) + 1);
	}


	public int getUpperBound(UDBMClock clock) 
	{
		return matrix[((JavaFederation)this.getFederation()).clockNamesToIndices.get(clock)][0];
	}

	public void close() 
	{
		hashCacheValid = false;
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				for (int k = 0; k < matrix.length; k++) 
				{
					int value = addBounds(matrix[i][k],matrix[k][j]);
					if(value == -1)
					{
						// bounds are equal but operator different
						if(isStrict(matrix[i][k]))
							// both bounds are strict
							value = 0;
						else
							// none of the bounds is strict
							value = 1;
					}
					
					
					matrix[i][j] = Math.min(matrix[i][j], value);
				}
			}
		}
		
	}
	
	public void normalize(HashMap<UDBMClock, Integer> maxValues)
	{
		hashCacheValid = false;
		for(int i = 0; i < matrix.length; i++)
		{
			UDBMClock ithUdbmClock = ((JavaFederation)this.getFederation()).indicesToClockNames.get(i);
			for(int j = 0; j < matrix.length; j++)
			{
				
					UDBMClock jthUdbmClock = ((JavaFederation)this.getFederation()).indicesToClockNames.get(j);

					if(i != 0 && matrix[i][j] != Integer.MAX_VALUE && matrix[i][j] > (maxValues.get(ithUdbmClock) << 1)+1)
					{
						matrix[i][j] = Integer.MAX_VALUE;
					}
					else if(j != 0 && matrix[i][j] != Integer.MAX_VALUE && matrix[i][j] < -(maxValues.get(jthUdbmClock) << 1))
					{
						matrix[i][j] = -(maxValues.get(jthUdbmClock) << 1);
					}
				
			}
		}
		
		this.close();
	}

	public void coreNormalize(HashMap<UDBMClock, Integer> maxValues,HashSet<DifferenceClockConstraint> clockConstraints)
	{
		HashSet<DifferenceClockConstraint> unsatClockConstraint = new HashSet<DifferenceClockConstraint>();
		
		for (DifferenceClockConstraint cc : clockConstraints)
		{
			DifferenceClockConstraint negatedCC = negateClockConstraint(cc);
			
			// compute matrix value of the ClockConstraint:
			// shift value of the constraint to the right, add 0 (<) or 1 (<=)
			int constraintValue = dbmValue(cc.getValue(),cc.getRelationalOperator()); 
			
			// compute indices of the UDBMClocks of the constraint in the matrix
			int minuendClockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(cc.getClockMinuend());
			int subtrahendClockId = ((JavaFederation)this.getFederation()).clockNamesToIndices.get(cc.getClockSubtrahend());
						
			// check if ClockZone is empty after adding new constraint, i.e. constraint is unsatisfiable 
			if(addBounds(matrix[subtrahendClockId][minuendClockId],constraintValue) < 0)
			{
				unsatClockConstraint.add(cc);
			}
			if (addBounds(matrix[minuendClockId][subtrahendClockId],-constraintValue) < 0)
			{
				unsatClockConstraint.add(negatedCC);
			}
		}
		
		this.normalize(maxValues);
		
		for(DifferenceClockConstraint dcc : unsatClockConstraint)
		{
			this.and(negateClockConstraint(dcc));
		}
	}
	
	public HashSet<JavaClockZone> split(HashSet<DifferenceClockConstraint> clockConstraints)
	{
		hashCacheValid = false;
		HashSet<JavaClockZone> splittedZones = new HashSet<JavaClockZone>();
		splittedZones.add(this);
		HashSet<JavaClockZone> tempZones = new HashSet<JavaClockZone>();
		
		for(DifferenceClockConstraint dcc : clockConstraints)
		{
			for(JavaClockZone jcz : splittedZones)
			{
				// compute matrix value of the ClockConstraint:
				// shift value of the constraint to the right, add 0 (<) or 1 (<=)
				int constraintValue = dbmValue(dcc.getValue(),dcc.getRelationalOperator());
				
				// compute indices of the UDBMClocks of the constraint in the matrix
				int minuendClockId = ((JavaFederation)jcz.getFederation()).clockNamesToIndices.get(dcc.getClockMinuend());
				int subtrahendClockId = ((JavaFederation)jcz.getFederation()).clockNamesToIndices.get(dcc.getClockSubtrahend());
							
				// check if ClockZone is empty after adding new constraint 
				if(addBounds(jcz.matrix[subtrahendClockId][minuendClockId],constraintValue) < 0 
						&& addBounds(jcz.matrix[minuendClockId][subtrahendClockId],-constraintValue) < 0)
				{
					JavaClockZone newJavaClockZone = (JavaClockZone) jcz.clone();
					newJavaClockZone.and(dcc);
					tempZones.add(newJavaClockZone);
					
					newJavaClockZone = (JavaClockZone) jcz.clone();
					newJavaClockZone.and(negateClockConstraint(dcc));
					tempZones.add(newJavaClockZone);
				}
				else
				{
					JavaClockZone newJavaClockZone = (JavaClockZone) jcz.clone();
					tempZones.add(newJavaClockZone);
				}
			}
			splittedZones = tempZones;
			tempZones = new HashSet<JavaClockZone>();
		}
		
		return splittedZones;	
	}
	
	public HashSet<JavaClockZone> diagonalNormalize(HashMap<UDBMClock, Integer> maxValues, HashSet<DifferenceClockConstraint> clockConstraints)
	{
		HashSet<JavaClockZone> normalizedZones = new HashSet<JavaClockZone>();
		
		for (JavaClockZone javaClockZone : this.split(clockConstraints))
		{
			javaClockZone.coreNormalize(maxValues, clockConstraints);
			normalizedZones.add(javaClockZone);
		}
		
		return normalizedZones;
	}
	
	private DifferenceClockConstraint negateClockConstraint (DifferenceClockConstraint cc)
	{
		DifferenceClockConstraint negatedClockConstraint = new DifferenceClockConstraint(cc.getClockSubtrahend(),cc.getClockMinuend(), cc.getRelationalOperator(), -cc.getValue());
		
		return negatedClockConstraint;
	}
	
	@Override
	public boolean equals(Object otherZone)
	{
		if(this.matrix.length != ((JavaClockZone)otherZone).matrix.length )
			return false;
		
		for (int i = 0; i < matrix.length; i++) 
		{

			UDBMClock firstClock = ((JavaFederation)this.getFederation()).indicesToClockNames.get(i);
			int firstClockOtherIndex = 0;
			
			if(((JavaFederation)((JavaClockZone)otherZone).getFederation()).clockNamesToIndices.get(firstClock) != null)
			{
				firstClockOtherIndex = ((JavaFederation)((JavaClockZone)otherZone).getFederation()).clockNamesToIndices.get(firstClock);
			}
			else if(i != 0)
				return false;
			
			for (int j = 0; j < matrix.length; j++) 
			{

				UDBMClock secondClock = ((JavaFederation)this.getFederation()).indicesToClockNames.get(j);
				int secondClockOtherIndex = 0;
				
				if(((JavaFederation)((JavaClockZone)otherZone).getFederation()).clockNamesToIndices.get(secondClock) != null)
				{
					secondClockOtherIndex = ((JavaFederation)((JavaClockZone)otherZone).getFederation()).clockNamesToIndices.get(secondClock);
				}
				else if(j != 0)
					return false;

				
				if(this.matrix[i][j] != ((JavaClockZone)otherZone).matrix[firstClockOtherIndex][secondClockOtherIndex])
					return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 	compute matrix value of the ClockConstraint:
		shift value of the constraint to the right, add 0 (<) or 1 (<=)
	 * @param value value of the ClockConstraint
	 * @param op operator
	 * @return
	 */
	private int dbmValue(int value, RelationalOperator op)
	{
		return (int) ( (value == 0 ? 1 : Math.signum(value)) * ( (Math.abs(value)<<1) + (op == RelationalOperator.LessOperator ? 0 : 1)));
	}
	
	public int getLowerBound(UDBMClock clock)
	{
		return matrix[0][((JavaFederation)this.getFederation()).clockNamesToIndices.get(clock)];
	}

	
	/**
	 * makes all strict bounds non-strict
	 */
	public void relax() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(isStrict(matrix[i][j])){
					if(matrix[i][j] < 0)
						matrix[i][j] -= 1;
					else
						matrix[i][j] += 1;
				}
			}
		}
	}
}
