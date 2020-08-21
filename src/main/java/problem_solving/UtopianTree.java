package problem_solving;

/**
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.
 * Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after n growth cycles?
 */
public class UtopianTree {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private UtopianTree() {}
	
	/**
	 * Calculates how tall the tree will be after a given number of growth cycles.
	 * 
	 * @param cycles The number of growth cyces.
	 * @return The height of the tree  after a given number of growth cycles.
	 */
	public static int calculateGrowth(int cycles) {
		int height = 1;
		
		for(int i = 1; i <= cycles; i++) {
			height = i % 2 == 0 ? height + 1 : height * 2;
		}
		
		return height;
	}

}
