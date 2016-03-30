package org.muml.storydiagram.reachanalysis.sdm.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
import org.muml.storydiagram.reachanalysis.sdm.Permutation;

/**
 * Tests for the class choice point.
 * @author Christian
 *
 */
public class TestPermutation {

	
	@Test
	public void testNullInput(){
		Permutation cp = new Permutation(0);
		
		assertFalse(cp.hasNext());
		assertTrue(cp.next() == null);
		assertTrue(cp.getCurrentPermutation() == null);
	}
	
	@Test
	public void testHasNext(){
		Permutation cp = new Permutation(1);
		assertTrue(cp.hasNext());	
	}
	
	@Test
	public void testNext(){
		Permutation cp = new Permutation(3);
		
		//check that 6 permutations of the three objects can be retrieved
		int[][] results = new int[6][3];
		for(int i = 0; i < 6; i++){
			results[i] = cp.next();
			assertTrue(results[i] != null);
		}
		
		//check that no more than 6 permutations can be retrieved
		assertTrue(cp.next() == null);
		
		//check that no two permutations are equal
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				if(i != j){
					assertFalse(Arrays.equals(results[i], results[j]));
				}
			}
		}
	}
	
}
