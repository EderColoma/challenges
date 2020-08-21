package problem_solving;

import static org.junit.Assert.assertEquals;
import static  problem_solving.CatAndMouse.catAndMouse;

import org.junit.Test;

/**
 * Tests the methods of the {@link CatAndMouse} class.
 */
public class CatAndMouseTest {

	/**
	 * Tests the situation where the cats are in equal distance from the mouse.
	 */
	@Test
	public void mouseEscapesTest() {
		assertEquals("Mouse C", catAndMouse(2, 6, 4));
	}
	
	/**
	 * Tests the situation where Cat A is closer to the mouse.
	 */
	@Test
	public void catACatchesTest() {
		assertEquals("Cat A", catAndMouse(5, 6, 4));
	}
	
	/**
	 * Tests the situation where Cat B is closer to the mouse.
	 */
	@Test
	public void catBCatchesTest() {
		assertEquals("Cat B", catAndMouse(5, 8, 7));
	}

}
