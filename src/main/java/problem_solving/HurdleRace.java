package problem_solving;

/**
 * Dan is playing a video game in which his character competes in a hurdle race. 
 * Hurdles are of varying heights, and Dan has a maximum height he can jump. 
 * There is a magic potion he can take that will increase his maximum height by 1 unit for each dose. 
 * How many doses of the potion must he take to be able to jump all of the hurdles?
 * Given an array of hurdle heights, and an initial maximum height Dan can jump, determine the minimum number of doses Dan must take to be able to clear all the hurdles in the race.
 */
public class HurdleRace {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private HurdleRace() {}
	
	/**
	 * Calculates how many doses must be taken to complete the race.
	 * 
	 * @param k The maximum height that can be jumped.
	 * @param height Array containing the height of each hurdle.
	 * @return The amount of doses to be taken in order to finish the race.
	 */
	public static int getPotionDoses(int k, int[] height) {
		int doses = 0;
		
		for(int i = 0; i < height.length; i++) {
			if(height[i] > k && height[i] - k > doses) {
				doses = height[i] - k;
			}
		}
		
		return doses;
	}
	
}
