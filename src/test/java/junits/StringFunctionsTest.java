package junits;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StringFunctionsTest {
	@Test
	@DisplayName("PositiveTest")
	public void test1() {
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
	@Test
	@DisplayName("NegativeTest")
	public void test2() {
		assertFalse(StringFunctions.isPlaindrome("abcd"));
	}
	

}
