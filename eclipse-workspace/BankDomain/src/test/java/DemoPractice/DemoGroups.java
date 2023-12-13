package DemoPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DemoGroups {
	
@Test	(groups = {"smoke"})
public void PersonalLoan() {
		
	System.out.println("Personal Loan Test");
	
		
		
	}

	@Test(groups = {"regression","smoke"})
public void HomeLoan() {
		
		System.out.println("Home Loan Test");
		
	}
	
	
@Test(groups = {"sanity","smoke"})
public void CreditcardLoan() {
	
	System.out.println("Credit card Loan Test");
	
}


}
