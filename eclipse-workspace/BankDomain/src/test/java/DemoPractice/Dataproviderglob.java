package DemoPractice;

import org.testng.annotations.DataProvider;

public class Dataproviderglob {

	
	
	
	@DataProvider(name = "LoginTestData")
	public Object[][] TestDataFeed(){
		
		//Rows - Number of times your test has to be repeted;
		//Column - Number of parameters in test data;
		Object [][] testdata = new Object[2][2];
		
		
		//1 - row
		
		testdata[0][0] = "standard_user";
		testdata[0][1] = "secret_sauce";
		
	//2 - row
		
		testdata[1][0] = "standard_user1";
		testdata[1][1] = "secret_sauce";
		
		return testdata;
		
		
		
		
	}
}
