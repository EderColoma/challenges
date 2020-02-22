package challenges;

import static  challenges.GradingStudents.gradingStudents;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests the methods of the {@link DiagonalDifference} class.
 */
public class GradingStudentsTest {

	/**
	 * Tests the rounding of the students' grades when the score is below 38.
	 */
	@Test
	public void gradingStudentsFailedGradeTest() {
		final List<Integer> grades = new ArrayList<>();
		grades.add(26);
		
		final List<Integer> finalGrades = gradingStudents(grades);
		assertEquals(Integer.valueOf(26), finalGrades.get(0));
	}

	/**
	 * Tests the rounding of the students' grades when the difference between the grade and the next multiple of 5 is less than 3.
	 */
	@Test
	public void gradingStudentsRoundingTest() {
		final List<Integer> grades = new ArrayList<>();
		grades.add(88);
		
		final List<Integer> finalGrades = gradingStudents(grades);
		assertEquals(Integer.valueOf(90), finalGrades.get(0));
	}
	
	/**
	 * Tests the rounding of the students' grades when the difference between the grade and the next multiple of 5 is not less than 3.
	 */
	@Test
	public void gradingStudentsNoRoundingTest() {
		final List<Integer> grades = new ArrayList<>();
		grades.add(87);
		
		final List<Integer> finalGrades = gradingStudents(grades);
		assertEquals(Integer.valueOf(87), finalGrades.get(0));
	}
	
	/**
	 * Tests the rounding of the students' grades when it is multiple of five.
	 */
	@Test
	public void gradingStudentsMultipleOfFiveTest() {
		final List<Integer> grades = new ArrayList<>();
		grades.add(70);
		
		final List<Integer> finalGrades = gradingStudents(grades);
		assertEquals(Integer.valueOf(70), finalGrades.get(0));
	}
}
