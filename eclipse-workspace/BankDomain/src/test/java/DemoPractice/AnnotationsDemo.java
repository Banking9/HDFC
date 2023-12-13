package DemoPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {



@BeforeTest	
public void beforeTest() {
	
	System.out.println("BeforeTest success");
	
	
	
}

@AfterTest	
public void afterTest() {
	
	
	System.out.println("AfterTest success");
	
	
}

@BeforeClass	
public void beforeClass() {
	
	System.out.println("Before class success");
	
	
	
}

@AfterClass	
public void afterClass() {
	
	
	System.out.println("After class success");
	
	
}
@BeforeMethod
public void beforemethod() {
	
	System.out.println("Before Method success");
	
	
	
	
	
	
}


@AfterMethod
public void afterMethod() {
	
	System.out.println("After Method success");
	
	
	
}

@Test
public void Test1() {
	
	System.out.println("This is sample test case1");
	
	
	
}	@Test
public void Test2() {
	
	System.out.println("This is sample test case2");
	
	
	
}	

}
