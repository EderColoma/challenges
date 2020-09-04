package problem_solving;

import java.util.HashMap;
import java.util.Map;

/**
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
 * The apple tree is to the left of his house, and the orange tree is to its right. 
 * You can assume the trees are located on a single point, where the apple tree is at point a, and the orange tree is at point b.
 * When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. 
 * A negative value of d means the fruit fell d units to the tree's left, and a positive value of d means it falls d units to the tree's right.
 * Given the value of d for n apples and n oranges, determine how many apples and oranges will fall on Sam's house?
 */
public class AppleAndOrange {
	
	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private AppleAndOrange() {}
	
	/**
	 * Determine how many apples and oranges will fall on Sam's house.
	 * 
	 * @param houseStart Starting point of Sam's house location.
	 * @param houseEnd Ending location of Sam's house location.
	 * @param appleTreeLocation Location of the Apple tree.
	 * @param orangeTreeLocation Location of the Orange tree.
	 * @param apples Distances at which each apple falls from the tree.
	 * @param oranges Distances at which each orange falls from the tree.
	 */
	public static Map<String, Integer> countApplesAndOranges(int houseStart, int houseEnd, int appleTreeLocation, int orangeTreeLocation, int[] apples, int[] oranges) {
		Map<String, Integer> fruitsFallenOnHouse = new HashMap<>();
		fruitsFallenOnHouse.put("apple", countFruits(apples, appleTreeLocation, houseStart, houseEnd));
		fruitsFallenOnHouse.put("orange", countFruits(oranges, orangeTreeLocation, houseStart, houseEnd));
		
		return fruitsFallenOnHouse;
    }

	private static int countFruits(int[] fruits, int treeLocation, int houseStart, int houseEnd) {
		int fruitsFallenOnHouse = 0;
		
		for(int i = 0; i < fruits.length; i++) {
			int fallPosition = treeLocation + fruits[i];
			if(fallPosition >= houseStart && fallPosition <= houseEnd) {
				fruitsFallenOnHouse++;
			}
		}
		
		return fruitsFallenOnHouse;
	}
	
}
