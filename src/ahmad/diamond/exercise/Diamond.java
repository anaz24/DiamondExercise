package ahmad.diamond.exercise;

public class Diamond {

	private static final String SPACE = " ";
	private static final int ASCII_A = 65;
	private static final String NEW_LINE = "\n";

	public String processChar(char ch) {
		ch = Character.toUpperCase(ch);
		int spaces = (int) ch - ASCII_A + 1;

		char[] ca = new char[spaces];

		fillArray(ch, ca);

		return buildDiamond(spaces, ca);
	}

	// prints diamond starting from A with given letter at the widest point
	// output is all in upper case
	private String buildDiamond(int spaces, char[] ca) {
		// starting from first element
		StringBuilder sb = new StringBuilder();

		for (int i = 0, j = 0; i < ca.length; i++, j++) {
			sb.append(getSpaces(spaces - (i + 1)));
			sb.append(ca[i]);

			if (i > 0) {
				sb.append(getSpaces(i + (j - 1)));
				sb.append(ca[i]);
			}
			sb.append(NEW_LINE);

		}

		// starting from the second last element
		for (int i = ca.length - 2, j = 1; i >= 0; i--, j++) {

			sb.append(getSpaces(j));

			sb.append(ca[i]);

			if (i > 0) {
				sb.append(getSpaces(spaces - j + (i - 2)));
				sb.append(ca[i]);
			}
			sb.append(NEW_LINE);
		}

		return sb.toString();
	}

	// prints given number of spaces
	private String getSpaces(int numberOfSpaces) {

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= numberOfSpaces; i++) {
			sb.append(SPACE);
		}

		return sb.toString();
	}

	// populates array from A to supplied letter
	private void fillArray(char givenChar, char[] ca) {

		int n = (int) givenChar;

		for (int i = ASCII_A, j = 0; i <= n; i++, j++) {
			ca[j] = (char) i;
		}
	}
}
