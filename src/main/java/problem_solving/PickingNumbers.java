package problem_solving;

import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, find and print the maximum number of integers 
 * you can select from the array such that the absolute difference between any 
 * two of the chosen integers is less than or equal to 1.
 */
public class PickingNumbers {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private PickingNumbers() {}
	
	/**
	 * Check the possible lists of numbers for the highest number of elements between these lists.
	 * 
	 * @param a The list to be considered.
	 * @return The highest number of elements between the possible lists.
	 */
    public static int pickingNumbers(final List<Integer> a) {
    	
    	int lasgestListSize = 0;
    	final List<Integer> currentList = new ArrayList<>();
    	
    	a.sort(null);
    	for(int i = 0; i < a.size(); i++) {
    		 
    		currentList.clear();
    		currentList.add(a.get(i));
    		
    		for(int j = i + 1; j < a.size(); j++) {
    			if(a.get(i) - a.get(j) == 0 || abs(a.get(i) - a.get(j)) == 1){
    				currentList.add(a.get(j));
        		}
    		}
    		
    		if(currentList.size() > lasgestListSize) {
    			lasgestListSize = currentList.size();
    		}
    	}
    	
    	return lasgestListSize;
    }
	        
}
