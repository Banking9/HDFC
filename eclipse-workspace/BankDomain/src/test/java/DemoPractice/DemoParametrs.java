package DemoPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DemoParametrs {
	
	
	@Test
@Parameters({"i","j"})
	public void add(int a ,int b) {
		
		System.out.println(a+b);
		
		
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a ,int b) {
		
		System.out.println( a - b);
		
		
	}
	@Parameters("Testing tools")
	@Test
	public void companyName(String name) {
		
		
		
		System.out.println("Software company name" + " " + name);
	}


}
