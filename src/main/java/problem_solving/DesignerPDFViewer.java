package problem_solving;
import java.util.Optional;

/**
 * When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue rectangle.
 * In this PDF viewer, each word is highlighted independently.
 * In this challenge, you will be given a list of letter heights in the alphabet and a string.
 * Using the letter heights given, determine the area of the rectangle highlight in mm^2 assuming all letters are 1mm wide.
 */
public class DesignerPDFViewer {

	private DesignerPDFViewer() {}

	/**
	 * Calcuates the area of a rectangle highlight.
	 *
	 * @param heights An array of integers representing the heights of each letter.
	 * @param word Single word, consisting of lowercase English alphabetic letters.
	 * @return An integer representing the size of the highlighted area.
	 */
	public static int designPdfViewer(int[] heights, String word) {
		final int area = 0;

		if(word.length() > 0 && heights.length > 0) {
			char[] letters = new char[word.length()];
			word.getChars(0, word.length(), letters, 0);
			return getGreatestHeight(letters, heights) * word.length();
		}

		return area;
    }

	/**
	 * Finds the height of the highest letter.
	 *
	 * @param letters The letters in the word.
	 * @param heights The letters heights.
	 * @return The height of the highest letter.
	 */
	private static int getGreatestHeight(char[] letters, int[] heights) {
		int greatest = 0;

		for(int i = 0; i < letters.length; i++) {
			int letterPosition = Letter.fromChar(letters[i]).get().getPosition();
			int letterHeight = heights[letterPosition];
			if(isGreater(letterHeight, greatest)) {
				greatest = letterHeight;
			}
		}

		return greatest;
	}

	/**
	 * Checks whether a number is greater than other.
	 *
	 * @param x The number to be checked.
	 * @param y The number to be compared.
	 * @return true, if the number is greater, false otherwise.
	 */
	private static boolean isGreater(int x, int y) {
		return x > y;
	}

	enum Letter{
		A(0),
		B(1),
		C(2),
		D(3),
		E(4),
		F(5),
		G(6),
		H(7),
		I(8),
		J(9),
		K(10),
		L(11),
		M(12),
		N(13),
		O(14),
		P(15),
		Q(16),
		R(17),
		S(18),
		T(19),
		U(20),
		V(21),
		W(22),
		X(23),
		Y(24),
		Z(25);

		private int position;

		Letter(int position) {
			this.position = position;
		}

		public int getPosition() {
			return position;
		}

		public static Optional<Letter> fromChar(char letter) {
			switch(letter) {
				case 'a':
					return Optional.of(A);
				case 'b':
					return Optional.of(B);
				case 'c':
					return Optional.of(C);
				case 'd':
					return Optional.of(D);
				case 'e':
					return Optional.of(E);
				case 'f':
					return Optional.of(F);
				case 'g':
					return Optional.of(G);
				case 'h':
					return Optional.of(H);
				case 'i':
					return Optional.of(I);
				case 'j':
					return Optional.of(J);
				case 'k':
					return Optional.of(K);
				case 'l':
					return Optional.of(L);
				case 'm':
					return Optional.of(M);
				case 'n':
					return Optional.of(N);
				case 'o':
					return Optional.of(O);
				case 'p':
					return Optional.of(P);
				case 'q':
					return Optional.of(Q);
				case 'r':
					return Optional.of(R);
				case 's':
					return Optional.of(S);
				case 't':
					return Optional.of(T);
				case 'u':
					return Optional.of(U);
				case 'v':
					return Optional.of(V);
				case 'w':
					return Optional.of(W);
				case 'x':
					return Optional.of(X);
				case 'y':
					return Optional.of(Y);
				case 'z':
					return Optional.of(Z);
				default:
					return Optional.empty();
			}
		}
	}

}
