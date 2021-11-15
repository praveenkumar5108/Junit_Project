package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedtestExamples {
	@RepeatedTest(4)
	public void test1() {
		
			assertTrue(StringFunctions.isPlaindrome("oppo"));

	}
}
