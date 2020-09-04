package problem_solving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the methods of the {@link ChocolateFeast} class.
 */
public class ServiceLaneTest {

	@Test
	public void serviceLaneTest() {
		int[] roadLanes = {2, 3, 1, 2, 3, 2, 3, 3};
		int[][] segments = new int[5][2];
		
		segments[0][0] = 0;
		segments[0][1] = 3;
		
		segments[1][0] = 4;
		segments[1][1] = 6;
		
		segments[2][0] = 6;
		segments[2][1] = 7;
		
		segments[3][0] = 3;
		segments[3][1] = 5;
		
		segments[4][0] = 0;
		segments[4][1] = 7;
		
		int[] result = ServiceLane.serviceLane(roadLanes, segments);
		
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
		assertEquals(3, result[2]);
		assertEquals(2, result[3]);
		assertEquals(1, result[4]);
	}
	
}
