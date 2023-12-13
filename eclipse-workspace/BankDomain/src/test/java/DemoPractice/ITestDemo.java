package DemoPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ITestDemo implements ITestListener {

	
public void onStart(ITestContext Result)	
	
{
	
	
	
}
public void onFinish(ITestContext Result)	

{
	
	
	
}
public void onTestFailure(ITestContext Result)	

{
    System.out.println("The name of the testcase failed is :"+Result.getName());	
	
	
}

public void onTestSkipped(ITestContext Result)	

{
	
	 System.out.println("The name of the testcase Skipped is :"+Result.getName());	
	
}	
	
}
