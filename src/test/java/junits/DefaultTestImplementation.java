package junits;

import org.junit.jupiter.api.RepeatedTest;

public class DefaultTestImplementation implements DefaultTestInterface{
   @RepeatedTest(4)
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Inside method1");
		
	}
    @RepeatedTest(4)
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Inside method2");

	}

}
