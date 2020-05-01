package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dayonce2 {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite: I am Before Suite");
	}
	
	@BeforeTest
	public void beforedey2()
	{
		System.out.println("This is day3 before");
	}
	@Test
	public void Demo()
	{
		System.out.println("Hello Udayakumar");
	}
	@Test
	public void Demo4()
	{
		System.out.println("Hello Demo4");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite: This is after suite");
	}
	@Test
	public void Demo5()
	{
		System.out.println("Hello Demo5");
	}

}
