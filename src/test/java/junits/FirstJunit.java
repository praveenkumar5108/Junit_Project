package junits;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FirstJunit {
	@BeforeAll
	public void Method3() {
		System.out.println("Before All");

	}
	@BeforeEach
	public void Method1() {
		System.out.println("Inside BeforeMethod");
	}
	
	@Test
	public void test1() {
		
		System.out.println("Inside Test1");
		boolean flag = true;
		Assert.assertTrue(flag);
		
	}
	@Test
	public void test2() {
		
		System.out.println("Inside Test2");
		
	}
	
	@AfterEach
	public void Method2() {
		System.out.println("After method");
	}
	
	@AfterAll
	public void Method4() {
		System.out.println("After All");

	}
	

}
