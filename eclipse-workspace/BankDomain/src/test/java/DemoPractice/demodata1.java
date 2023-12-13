package DemoPractice;

import org.testng.annotations.DataProvider;

public class demodata1 {
	
	
	
	
	@DataProvider(name = "testdata")
	public  Object[][] TestDataFeed(){
		
		Object [][] testDatas = new Object[2][2];
		
		testDatas[0][0] = "standard_user";
		testDatas[0][1] = "secret_sauce";
		
		testDatas[1][0] = "standard_user";
		testDatas[1][1] = "secret_sauce";
		return testDatas;
	}
	

}
