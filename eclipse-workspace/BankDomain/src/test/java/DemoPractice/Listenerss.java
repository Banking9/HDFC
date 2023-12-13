package DemoPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listenerss  implements  ITestListener{
	
	

	
	
	 public void onStart(ITestContext Result)					
	   
	 {		
	            		
	    }	

    public void onFinish(ITestContext Result) 					
    {		
                		
    }		

    public void onTestFailure(ITestResult Result) 					
    {		
    System.out.println("The name of the testcase failed is :"+Result.getName());					
    }		
	
   	
    public void onTestSkipped(ITestResult Result) 					
    {		
    System.out.println("The name of the testcase skipped is :"+Result.getName());					
    }
    

    		
   
   
	

}

