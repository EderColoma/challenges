package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Every student receives a grade in the inclusive range from 0 to 100.
 * Any grade less than 40 is a failing grade.
 *
 * A professor at the university and likes to round each student's according to these rules:
 * If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
 * If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 */
public class GradingStudents {

	/**
	 * Makes the constructor private so the class can not be instantiated.
	 */
	private GradingStudents() {}
	
	/**
	 * Calculates the final grades of the students.
	 * 
	 * @param grades The students' grades. 
	 * @return The grades after rounding.
	 */
	public static List<Integer> gradingStudents(final List<Integer> grades) {
		
		final List<Integer> finalGrades = new ArrayList<>();
		
		for(int i = 0; i < grades.size(); i++) {
			if(grades.get(i) < 38 || grades.get(i) % 5 == 0) {
				finalGrades.add(grades.get(i));
			}else{
				final Integer nextMultipleOfFive = findNextMultipleOfFive(grades.get(i));
				if(nextMultipleOfFive - grades.get(i) < 3) {
					finalGrades.add(nextMultipleOfFive);
				}else {
					finalGrades.add(grades.get(i));
				}
			}
		}
		
		return finalGrades;
	}

	/**
	 * Finds the first multiple of five greater than the given number.
	 * 
	 * @param value The base value.
	 * @return The first multiple of five after the given value.
	 */
	private static Integer findNextMultipleOfFive(final Integer value) {
		Integer nextMultipleOfFive = 0;
		
		for(int i = value + 1; i <= value + 5; i++) {
			if(i % 5 == 0) {
				nextMultipleOfFive = i;
			}
		}
		
		return nextMultipleOfFive;
	}
}
