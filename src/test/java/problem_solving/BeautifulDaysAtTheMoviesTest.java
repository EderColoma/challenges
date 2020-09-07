package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link BeautifulDaysAtTheMovies} class.
 */
public class BeautifulDaysAtTheMoviesTest {

	/**
	 *Tests the counting of beautiful days in a given range.
	 */
	@Test
	public void countBeautifulDaysTest() {
		assertEquals(2, BeautifulDaysAtTheMovies.countBeautifulDays(20, 23, 6));
	}

}
