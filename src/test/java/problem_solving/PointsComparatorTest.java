package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.PointsComparator.comparePoints;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link PointsComparator} class.
 */
public class PointsComparatorTest {

	/**
	 * Tests the comparison of points of two participants.
	 */
	@Test
	public void comparePointsTest() {
		final List<Integer> a = new ArrayList<>();
		a.add(17);
		a.add(28);
		a.add(8);

		final List<Integer> b = new ArrayList<>();
		b.add(99);
		b.add(16);
		b.add(8);

		final List<Integer> result = comparePoints(a, b);
		assertEquals(Integer.valueOf(1), result.get(0));
		assertEquals(Integer.valueOf(1), result.get(1));
	}


}
