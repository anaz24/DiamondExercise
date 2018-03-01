package ahmad.diamond.exercise.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ahmad.diamond.exercise.Diamond;

public class TestDiamond {
	
	private static final String NEW_LINE = "\n";

	@Test
	public void testDiamondWithC() {
		StringBuilder expectedOutput = new StringBuilder();

		expectedOutput.append("  A");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append(" B B");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append("C   C");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append(" B B");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append("  A");
		expectedOutput.append(NEW_LINE);
		
		Diamond d = new Diamond();

		char ch = 'C';
		String actualOutput = d.processChar(ch);

		assertEquals(expectedOutput.toString(), actualOutput);
	}

	@Test
	public void testDiamondWithD() {
		StringBuilder expectedOutput = new StringBuilder();

		expectedOutput.append("   A");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append("  B B");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append(" C   C");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append("D     D");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append(" C   C");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append("  B B");
		expectedOutput.append(NEW_LINE);
		expectedOutput.append("   A");
		expectedOutput.append(NEW_LINE);
		
		Diamond d = new Diamond();

		char ch = 'D';
		String actualOutput = d.processChar(ch);

		assertEquals(expectedOutput.toString(), actualOutput);
	}

}
