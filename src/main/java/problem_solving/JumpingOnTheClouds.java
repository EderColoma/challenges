package problem_solving;

/**
 * Aerith is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be thunderheads or cumulus clouds. 
 * Her character must jump from cloud to cloud until it reaches the start again.
 * To play, Aerith is given an array of clouds, c and an energy level e = 100. 
 * She starts from c[0] and uses 1 unit of energy to make a jump of size k to cloud c[i+k % n]. 
 * If Aerith lands on a thundercloud, c[i] = 1, her energy (e) decreases by 2 additional units. 
 * The game ends when Aerith lands back on cloud 0.
 * 
 * Given the values of n, k, and the configuration of the clouds as an array c, can you determine the final value of e after the game ends?
 */
public class JumpingOnTheClouds {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private JumpingOnTheClouds() {}
	
	/**
	 * Finds out the amount of energy left after arriving at cloud 0.
	 * 
	 * @param c An array of integers representing cloud types.
	 * @param k The length of one jump
	 * @return The energy left.
	 */
	public static int jumpingOnClouds(int[] c, int k) {
		
		int energyLevel = 100;
		int cloud = 0;
		
		do {
			cloud = (cloud + k) % c.length;
			energyLevel--;
			if(c[cloud] == 1) {
				energyLevel -= 2;
			}
		} while(cloud != 0);
		
		return energyLevel;
	}
	
}
