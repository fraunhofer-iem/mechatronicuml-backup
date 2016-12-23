package org.muml.storydiagram.reachanalysis.sdm;

/**
 * Helper class for the isomorphism computation that enumerates permutations of a set of numbers.
 * 
 * This class implements the <a href="http://en.wikipedia.org/wiki/Steinhaus%E2%80%93Johnson%E2%80%93Trotter_algorithm"
 * >Steinhaus-Johnson-Trotter</a> algorithm for enumerating permutations. 
 * Main parts of the algorithm implementation have been obtained from an 
 * <a href="data.christianschenk.org/changing-order-letters-words/xref/org/christianschenk/letterorder/utils/PermutationUtils.html"> implementation</a>
 * of the algorithm by Christian Schenk that has been released under the terms of the GPL.
 * 
 * @author Christian
 *
 */
public class Permutation {
	
	/**
	 * The current permutation which will be returned via {@link getCurrentChoice}.
	 */
	private int[] permutation;
	
	/**
	 * Stores the current working permutation which is modified by the algorithm.
	 */
	private int[] work;
	
	/**
	 * Stores the current direction of the element at position i.
	 */
	private int[] dir;
	
	/** The number of numbers to be permuted. */
	private int size;
	
	/**
	 * Parameter for the enumeration of the permutations. Permutations of the numbers
	 * 0..n-1 are returned.
	 * @param n
	 */
	public Permutation(int n){
		size = n;
	}
	
	/**
	 * Initializes the computation. It stores the initial permutation in the work array
	 * and initializes the dir array.
	 */
	private void initialize(){
		
		//guard against NPE
		if(size<=0){
			return;
		}
		
		//initialize arrays to the number of elements
		work = new int[size];
		dir = new int[size];
		
		//initialize arrays, initially the work permutation will be 1,2,3,..., size
		for(int i = 0; i < size; i++){
			work[i] = i;
			dir[i] = 0;
		}
	}
	
	
	/**
	 * Returns true, if the ChoicePoint can provide another choice. 
	 * @return
	 */
	public boolean hasNext(){
		if(size<=0){
			return false;
		} else if(permutation == null){
			return true;
		} else { //check if another permutation exists
			for (int i = 0, n = work.length; i < n; i++) {
				if (this.isMobile(work, dir, i)) return true;
			}
			return false;
		}
	}
	
	/**
	 * Returns the next choice, if it exists.
	 * @return
	 */
	public int[] next(){
		if (this.hasNext()){

			//check for init phase, initialize and return initial permutation
			if(permutation == null){
				initialize();
				permutation = copy(work);
			} else { //compute next permutation
				final int curMobile = this.findLargestMobile(work, dir);

				// swap, b = (a += b -= a) - b;
				final int movePos = curMobile + (dir[curMobile] == 0 ? -1 : 1);
				work[movePos] = (work[curMobile] += work[movePos] -= work[curMobile]) - work[movePos];
				dir[movePos] = (dir[curMobile] += dir[movePos] -= dir[curMobile]) - dir[movePos];

				// reverse direction
				for (int i = 0; i < work.length; i++)
					if (work[i] > work[movePos]) dir[i] = dir[i] == 0 ? 1 : 0;
				
				//store result
				permutation = copy(work);
			}
		} else {
			permutation = null;
		}

		return permutation;
	}
	
	/**
	 * Returns true if the given integer is mobile otherwise false. An integer
	 * is said to be mobile if, in the direction of its mobility, the nearest
	 * integer is less than the current integer. Note that if an integer is to
	 * the far left and its mobility is to the left, it is not mobile.
	 * Similarly, if an integer is to the far right and its mobility is to the
	 * right, it is also not mobile.
	 * 
	 * @param work
	 *            array of the integer values
	 * @param dir
	 *            direction of the integer values
	 * @param i
	 *            selected integer
	 * @return true if selected integer is mobile otherwise false
	 */
	private boolean isMobile(final int[] work, final int[] dir, final int i) {
		// leftmost integer pointing to the left is not mobile
		// rightmost integer pointing to the right is not mobile
		if ((i == 0 && dir[i] == 0) || (i == work.length - 1 && dir[i] == 1)) {
			return false;
		}
		// An integer is mobile if, in the direction of its mobility, the
		// nearest integer is less than the current integer.
		if (i > 0 && dir[i] == 0 && work[i] > work[i - 1]) {
			return true;
		}
		if (i < work.length - 1 && dir[i] == 1 && work[i] > work[i + 1]) {
			return true;
		}
		if (i > 0 && i < work.length) {
			if ((dir[i] == 0 && work[i] > work[i - 1]) || (dir[i] == 1 && work[i] > work[i + 1])) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Returns the index of the largest mobile integer.
	 * 
	 * @param work
	 *            array of the integer values
	 * @param dir
	 *            direction of the integer values
	 * @return index of largest mobile integer
	 */
	private int findLargestMobile(final int[] work, final int[] dir) {
		int largest = -1;
		int pos = -1;
		for (int i = 0, n = work.length; i < n; i++) {
			if (this.isMobile(work, dir, i) && largest < work[i]) {
				largest = work[i];
				pos = i;
			}
		}
		return pos;
	}
	
	/**
	 * Copies the given array and returns the copy.
	 * 
	 * @param src
	 *            source array
	 * @return array with copied data from source array
	 */
	private int[] copy(final int[] src) {
		final int[] dest = new int[src.length];
		System.arraycopy(src, 0, dest, 0, src.length);
		return dest;
	}
	
	/**
	 * Returns the currently selected permutation.
	 * @return
	 */
	public int[] getCurrentPermutation(){
		return permutation;
	}
}
