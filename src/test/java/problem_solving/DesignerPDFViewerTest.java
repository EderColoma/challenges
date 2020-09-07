package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link DesignerPDFViewer} class.
 */
public class DesignerPDFViewerTest {

	/**
	 * Tests the calculation of a rectangle highlight area.
	 */
	@Test
	public void designPdfViewerTest() {
		final int[] heights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		assertEquals(9, DesignerPDFViewer.designPdfViewer(heights, "abc"));
	}

}
