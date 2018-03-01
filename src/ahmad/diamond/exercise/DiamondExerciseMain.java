package ahmad.diamond.exercise;

import java.io.IOException;

public class DiamondExerciseMain {

	public static void main(String[] args) throws IOException {

		Diamond pd = new Diamond();

		int ch;
		while ((ch = System.in.read()) != -1) {
			// valid input is limited to A-Z, a-z
			if (ch != '\n' && ch != '\r' && ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) {
				String output = pd.processChar((char) ch);
				System.out.println(output);
				return;
			}
		}
	}

}
