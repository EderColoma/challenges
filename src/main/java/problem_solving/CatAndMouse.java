package problem_solving;

import static java.lang.Math.abs;

/**
 * Two cats and a mouse are at various positions on a line. You will be given their starting positions. 
 * Your task is to determine which cat will reach the mouse first, assuming the mouse doesn't move and the cats travel at equal speed. 
 * If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
 * You are given q queries in the form of x, y, and z representing the respective positions for cats A and B, and for mouse C. 
 * Return the appropriate answer to each query, which will be printed on a new line.
 *
 * If cat A catches the mouse first, print Cat A.
 * If cat B catches the mouse first, print Cat B.
 * If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
 * For example, cat A is at position 2 and cat B is at 5. If mouse C is at position 4, it is 2 units from cat A and 1 unit from cat B. Cat B will catch the mouse.
 */
public class CatAndMouse {
	
	private CatAndMouse() {}
	
	public static String catAndMouse(int x, int y, int z) {
		if(abs(x - z) < abs(y - z)) {
			return "Cat A";
		}else if(abs(x - z) > abs(y - z)) {
			return "Cat B";
		}
		
		return "Mouse C";
    }

}
