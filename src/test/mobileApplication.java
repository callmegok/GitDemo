package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mobileApplication {

	
	@BeforeMethod
	public void beforemet()
	{
		System.out.println("Before Method: This is before Method");
		
	}
	@AfterMethod
	public void Aftermet()
	{
		System.out.println("After Method: This is After Method");
		
	}
	
	@BeforeTest
	public void before()
	{
		System.out.println("This is the Before Execution");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is After Execution");
	}
	@Test
	public void Mobiledemo1()
	{
		System.out.println("Mobile 1");
	}
	@Test(groups= {"smoke"})
	public void Mobiledemo2()
	{
		System.out.println("Mobile 2");
	}
	@Test
	public void Mobiledemo3()
	{
		System.out.println("Mobile 3");
	}
	@Test(dependsOnMethods= {"Mobiledemo1"})
	public void Mobiledemo4()
	{
		System.out.println("Mobile 4");
	}
	@Test
	public void Mobiledemo5()
	{
		System.out.println("Mobile 5");
	}
	
	@Test
	public void Appdemo1()
	{
		System.out.println("App 1");
	}
	@Test
	public void Appdemo2()
	{
		System.out.println("App 2");
	}
	@Test
	public void Appdemo3()
	{
		System.out.println("App 3");
	}@Test
	public void Appdemo4()
	{
		System.out.println("App 4");
	}
	@Test
	public void Appdemo5()
	{
		System.out.println("App 5");
	}


}