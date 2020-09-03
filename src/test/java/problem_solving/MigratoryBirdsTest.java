package problem_solving;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link MigratoryBirds} class.
 */
public class MigratoryBirdsTest {
	
	/**
	 * Tests the finding of the most commonly sighted bird species.
	 */
	@Test
	public void findMostCommonTest() {

		List<Integer> sights = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
		assertEquals(3, MigratoryBirds.findMostCommon(sights));
		
	}
	
	/**
	 * Tests the finding of the most commonly sighted bird species, when two species have the same number of sights.
	 */
	@Test
	public void findMostCommonDrawTest() {

		List<Integer> sights = Arrays.asList(1, 1, 2, 2, 3);
		assertEquals(1, MigratoryBirds.findMostCommon(sights));
		
	}

	/**
	 * Tests the finding of the most commonly sighted bird species, when no birds where sighted.
	 */
	@Test
	public void findMostCommonNoSightsTest() {

		List<Integer> sights = new ArrayList<>();
		assertEquals(1, MigratoryBirds.findMostCommon(sights));
		
	}

}
