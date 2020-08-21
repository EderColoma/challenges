package problem_solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You are given a number of sticks of varying lengths. 
 * You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. 
 * At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then 
 * discard all the pieces of that shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.
 *
 * Given the lengths of n sticks, print the number of sticks that are left before each iteration until there are none left.
 */
public class CutSticks {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private CutSticks() {}
	
	/**
	 * Counts the number of sticks that are left before each iteration.
	 * 
	 * @param arr The array containing the sticks.
	 * @return The number of sticks that are left before each iteration until there are none left.
	 */
    public static int[] cutTheSticks(int[] arr) {
    	
    	List<Integer> sticks = initializeSticksList(arr);
    	List<Integer> sticksPresent = new ArrayList<>();
    	
    	while(!sticks.isEmpty()) {
    		sticksPresent.add(sticks.size());
    		sticks = cut(sticks);
    	}
    	
    	int[] sticksCount = new int[sticksPresent.size()];
    	for(int i = 0; i < sticksPresent.size(); i++) {
    		sticksCount[i] = sticksPresent.get(i);
    	}
    
    	return sticksCount;
    }
    
    /**
     * Cuts the sticks.
     * 
     * @param sticks List of sticks.
     */
    private static List<Integer> cut(List<Integer> sticks) {
    	Integer smallest = sticks.get(sticks.indexOf(Collections.min(sticks)));
    	List<Integer> cutSticks = sticks.stream().map(s -> s - smallest).collect(Collectors.toList());
    	return cutSticks.stream().filter(s -> s> 0).collect(Collectors.toList());
    }
    
    /**
     * Initializes a list with the sticks heights.
     * 
     * @param arr Array containing the sticks heights.
     * @return A list with the sticks heights.
     */
    private static List<Integer> initializeSticksList(int[] arr){
    	List<Integer> sticks = new ArrayList<>();
    	
    	for(int i = 0; i < arr.length; i++) {
    		sticks.add(arr[i]);
    	}
    	
    	return sticks;
    }
}
