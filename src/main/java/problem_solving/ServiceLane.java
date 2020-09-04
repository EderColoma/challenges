package problem_solving;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Calvin is driving his favorite vehicle on the 101 freeway.
 * He notices that the check engine light of his vehicle is on, and he wants to service it immediately to avoid any risks. 
 * Luckily, a service lane runs parallel to the highway. The service lane varies in width along its length.
 * You will be given an array of widths at points along the road (indices), then a list of the indices of entry and exit points. 
 * Considering each entry and exit point pair, calculate the maximum size vehicle that can travel that segment of the service lane safely.
 */
public class ServiceLane {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private ServiceLane() {}
	
	/**
	 * Calculates the maximum size vehicle that can travel that segment of the service lane safely.
	 * 
	 * @param width The widths of the service lane segments.
	 * @param cases The segments to be checkes.
	 * @return The maximum maximum size vehicle that can travel each segment.
	 */
	public static int[] serviceLane(int[] width, int[][] cases) {

		int[] result = new int[cases.length];
		
		for(int i = 0; i < cases.length; i++) {
			List<Integer> laneSizes = new ArrayList<>();
			for(int j = cases[i][0]; j <= cases[i][1]; j++) {
				laneSizes.add(width[j]);
			}
			
			result[i] = laneSizes.stream().min(Comparator.comparing(Integer::valueOf)).get();
			
		}
		
		return result;

    }
	
}
