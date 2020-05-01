package Exam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	
	@BeforeSuite
	public void BFSuite()
	{
		System.out.println("Before Suite: This is Before Suite");
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("After Suite : This is after suite");
	}
	
	@BeforeMethod
	public void BFMethod()
	{
		System.out.println("Before Method: This is before Method");
	}
	@AfterMethod
	public void AFMethod()
	{
		System.out.println("After Method: This is After Method");
	}
	
	@BeforeClass
	public void BFClass()
	{
		System.out.println("Before Class: This is before class");
	}
	@AfterClass
	public void AFClass()
	{
		System.out.println("After Class: This is After class");
	}
	
	@BeforeTest
	public void BFtests()
	{
		System.out.println("Before Test: This is before Test");
	}
	@AfterTest
	public void AFtests()
	{
		System.out.println("After Test: This is After Test");
	}
	@Test
	public void Number1()
	{
		System.out.println("Number: this is number 1");
	}
	
	@Test
	public void Number2()
	{
		System.out.println("Number: this is number 2");
	}
	
	@Test
	public void Number3()
	{
		System.out.println("Number: this is number 3");
	}
	
	@Test
	public void Number4()
	{
		System.out.println("Number: this is number 4");
	}
	
	
	
}

