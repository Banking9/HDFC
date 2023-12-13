package DemoPractice;

import org.testng.annotations.Test;

public class DemoGropsDemo {
	
@Test	(groups = {"smoke"})
public void MobileLoan() {
		
	System.out.println("Mobile Loan Test");
	
		
		
	}
	@Test(groups = {"regression"})
public void CarLoan() {
		
		System.out.println("Car Loan Test");
		
	}
@Test(groups = {"sanity"})
public void BikeLoan() {
	
	System.out.println("Bike Loan  Test");
	
}
	
	
}
