package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.PickingNumbers.pickingNumbers;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link PickingNumbers} class.
 */
public class PickingNumbersTest {

	/**
	 * Tests the finding of the largest number of elements.
	 */
	@Test
	public void pickingNumbersTest() {
		final List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);

		assertEquals(4, pickingNumbers(list));
	}

	/**
	 * Tests the finding of the largest number of elements.
	 */
	@Test
	public void pickingNumbersOtherTest() {
		final List<Integer> list = new ArrayList<>();

		list.add(6);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(1);

		assertEquals(3, pickingNumbers(list));
	}

}
