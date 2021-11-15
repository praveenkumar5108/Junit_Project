package junits;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParametersExample {
	@ParameterizedTest
	@ValueSource(strings = {"oppo","madam","praveen"})
	public void test1(String Name) {
		assertTrue(StringFunctions.isPlaindrome(Name));
	}
	@ParameterizedTest
	@ValueSource(ints= {23,43,24})
	public void oddNumCheck(int num) {
		assertTrue(num%2!=0);
	}

}
