package Exam;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Test3 {

	

	
	@Test(dataProvider="getdatas")
	public void Student2(String urlname,String password)
	{
		System.out.println("Student:this is Student 2");
		System.out.println(urlname);
		System.out.println(password);
	
	}
	
	@DataProvider
	public Object[] getdatas()
	{
		Object[][] data = new Object[3][2];
		
		//1 st time
		data[0][0]="username1";
		data[0][1]="Password1";
		
		//Second thime
		data[1][0]="Username1";
		data[1][1]="Password2";
		
		//Third Time
		data[2][0]="Username 3";
		data[2][1]="Password3";
		return data;
		
		
		
	}
	
	/*
	@Test(enabled=false)
	public void Student3()
	{
		System.out.println("Student:this is Student 3");
	}
	@Test
	public void Student4()
	{
		System.out.println("Student:this is Student 4");
	}*/
	

	

	

	

	
	
	
}

