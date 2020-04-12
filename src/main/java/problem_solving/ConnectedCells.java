package problem_solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Consider a matrix where each cell contains either a 0 or a 1. 
 * Any cell containing a 1 is called a filled cell. 
 * Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally. 
 * In the following grid, all cells marked X are connected to the cell marked Y.
 * 
 * XXX
 * XYX
 * XXX
 * 
 * If one or more filled cells are also connected, they form a region. 
 * Note that each cell in a region is connected to zero or more cells in the region but is not necessarily directly connected to all the other cells in the region.
 * Given an n X m matrix, find and print the number of cells in the largest region in the matrix. 
 * Note that there may be more than one region in the matrix.
*/
public class ConnectedCells {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private ConnectedCells() {}
	
	public static int connectedCell(final int[][] matrix) {

		final List<Integer> regionSizes = new ArrayList<>();
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				if(matrix[i][j] == 1) {
					regionSizes.add(getRegionSize(i, j, matrix));
				}
			}
		}

		regionSizes.sort(null);
		return regionSizes.get(regionSizes.size() - 1);
		
    }

	private static Integer getRegionSize(final int i, final int j, final int[][] matrix) {
		
		int size = 1;
		for(int idx = i+1; idx < matrix.length; idx++) {
			for(int jdx = j; jdx < matrix.length; jdx++) {
				if(matrix[idx][jdx] == 1) {
					size++;
					matrix[idx][jdx] = 2;
				}else {
					break;
				}
			}
		}
		
		return size;
	}
	
}
