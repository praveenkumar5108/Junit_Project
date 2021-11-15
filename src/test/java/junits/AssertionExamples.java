package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionExamples {
	@Test
	public void test() {
		String name1 = "Praveen";
		String name2 = "Praveen";
		
		assertEquals(name1,name2);
		
		
		String[] expectedArray = {"one","two","three"};
		String[] actualArray = {"one","two","three"};
		
		assertArrayEquals(expectedArray,actualArray);

	}

}
