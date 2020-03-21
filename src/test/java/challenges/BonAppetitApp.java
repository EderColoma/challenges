package challenges;

import static challenges.BonAppetit.bonAppetit;
import static  java.util.Arrays.asList;

import java.util.List;

public class BonAppetitApp {

	public static void main(final String[] args) {
		final List<Integer> bill = asList(3, 10, 2, 9);
		bonAppetit(bill, 1, 7);
	}
	
}
