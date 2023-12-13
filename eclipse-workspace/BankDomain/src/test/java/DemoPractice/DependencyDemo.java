package DemoPractice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependencyDemo {

	@Test
	public void firstTest() {
		
		System.out.println("This is Test case 1");		
		
		throw new RuntimeException();
	}
	
	@Test
public void secondTest() {
		
	System.out.println("This is Test case 2");	
		
	}
	
	@Test(dependsOnMethods="firstTest")
public void thirdTest() {
	
	System.out.println("This is Test case 3");	
	
}
	@Test
public void fourthTest() {
	
	System.out.println("This is Test case 4");	
	
}



}
