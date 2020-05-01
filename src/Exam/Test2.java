package Exam;

import org.testng.annotations.Test;

public class Test2 {

	@Test(enabled=false)
	public void Student1()
	{
		System.out.println("Student:this is Student 1");
	}
	@Test(dependsOnMethods= {"Student4"})
	public void Student2()
	{
		System.out.println("Student:this is Student 2");
	}
	@Test(enabled=false)
	public void Student3()
	{
		System.out.println("Student:this is Student 3");
	}
	@Test
	public void Student4()
	{
		System.out.println("Student:this is Student 4");
	}
	

	

	

	

	
	
	
}

