package DemoPractice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoPriority {


@Test(priority = 4)	
public void fifthTest() {
	
	
	System.out.println("This is first Test 1");
	
}

@Test(priority = 1)
public void firstTest() {
	
	
	System.out.println("This is first Test");
	
}
	
@Test(priority = 2)
public void secondTest() {
	
	
	System.out.println("This is secondTest");
	
}
	
@Test
public void thirdTest() {
	
	
	System.out.println("This is thirdTest");
	
}
@Test(priority = -1)
public void fourthTest() {
	
	
	System.out.println("This is fourthTest");
	
}
	
	
	

}
