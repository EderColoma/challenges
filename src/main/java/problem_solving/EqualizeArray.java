package problem_solving;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Karl has an array of integers. He wants to reduce the array until all remaining elements are equal. 
 * Determine the minimum number of elements to delete to reach his goal.
 */
public class EqualizeArray {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private EqualizeArray() {}
	
	/**
	 * Calculates the minimum number of deletions to reduce an array until all remaining elements are equal.
	 * 
	 * @param arr The array to be reduced.
	 * @return The minimum number of deletions to reduce an array until all remaining elements are equal.
	 */
	public static int equalizeArray(int[] arr) {
		int numberOfDeletions = 0;
		Map<Integer, Integer> arrayItemsCount = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			arrayItemsCount.put(arr[i], arrayItemsCount.containsKey(arr[i]) ? arrayItemsCount.get(arr[i]) + 1 : 1);
		}
		
		if(!arrayItemsCount.isEmpty()) {
			Integer mostCommonItemCount = getMaxValue(arrayItemsCount);
			numberOfDeletions = arr.length - mostCommonItemCount;
		}
		return numberOfDeletions;
    }
	
	/**
	 * Finds the largest value in a map.
	 * 
	 * @param map The map to be checkes.
	 * @return The largest value in the map.
	 */
	private static <K, V extends Comparable<V>> V getMaxValue(Map<K, V> map) {
	    Optional<Entry<K, V>> maxEntry = map.entrySet()
	        .stream()
	        .max((Entry<K, V> e1, Entry<K, V> e2) -> e1.getValue()
	            .compareTo(e2.getValue())
	        );
	    
	    return maxEntry.get().getValue();
	}
}
