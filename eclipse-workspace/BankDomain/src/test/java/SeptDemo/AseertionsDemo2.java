package SeptDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AseertionsDemo2 {
	
	@Test
	public void verifyValues() {
	//Assertion True or false 
	
	int  number = 5;
	int  number2 = 10;
	
	
	Assert.assertTrue(number<number2);
	
	System.out.println("The Assertion is success");
	
	
	
	}
	

}
