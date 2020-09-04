package problem_solving;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:
 * 1 -The elements of the first array are all factors of the integer being considered
 * 2 - The integer being considered is a factor of all elements of the second array
 * These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.
 */
public class BetweenTwoSets {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private BetweenTwoSets() {}
	
	/**
	 * Determines how many numbers are between two arrays.
	 * 
	 * @param a The first list of numbers.
	 * @param b The second list of numbers.
	 * @return The quantity of numbers between the two arrays.
	 */
	public static int getTotalX(List<Integer> a, List<Integer> b) {

		Set<Integer> numbers = new HashSet<>();
		
		for(int i = 1; i <= findSmallerValue(b); i++) {
			
			boolean isFactorOfAll = true;
			for(Integer number : b) {
				isFactorOfAll &= number % i == 0;
			}
			
			if(isFactorOfAll) {
				numbers.add(i);
			}
		}
	
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			Integer n = iterator.next();
			for(Integer number : a) {
				if(n % number != 0) {
					iterator.remove();
					break;
				}
			}
		}

		return numbers.size();
		
	}
	
	/**
	 * Finds the smallest value in a list.
	 * 
	 * @param list The list containing the values.
	 * @return The smallest value in a list.
	 */
	private static Integer findSmallerValue(List<Integer> list) {
		return list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	}
	
}
