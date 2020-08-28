package problem_solving;

import static org.junit.Assert.assertEquals;
import static problem_solving.TimeConversion.convert;

import org.junit.Test;

/**
 * Tests the methods of the {@link TimeConversion} class.
 */
public class TimeConversionTest {

	@Test
	public void convertPMTest() {
		assertEquals("19:05:45", convert("07:05:45PM"));
	}
	
	@Test
	public void convertAMTest() {
		assertEquals("08:15:16", convert("08:15:16AM"));
	}
	
	@Test
	public void convertMidnightTest() {
		assertEquals("00:40:22", convert("12:40:22AM"));
	}
	
	@Test
	public void convertMiddayTest() {
		assertEquals("12:40:22", convert("12:40:22PM"));
	}
}
