package Exam;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener
public class Listerners implements ITestListener {

	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This is Listner Success");
	}
}
