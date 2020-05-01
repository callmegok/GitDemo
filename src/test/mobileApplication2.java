package test;
import org.testng.annotations.Test;

public class mobileApplication2 {

	
	@Test
	public void Mobiledemo1()
	{
		System.out.println("Method 1 ");
		
	}
	@Test(enabled=false)
	public void Mobiledemo2()
	{
		System.out.println("Method 2 ");
		
	}
	
	@Test
	public void Aobiledemo3()
	{
		System.out.println("Method 3");
		
	}
	
	@Test(dependsOnMethods= {"Mobiledemo5"})
	public void Mobiledemo4()
	{
		System.out.println("Mobile 4");
	}
	
	@Test
	public void Mobiledemo5()
	{
		System.out.println("Method 5");
		
	}

}