package DemoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

public class DemoParamerterss {
	WebDriver driver;
	@Parameters({"i","j"})
	@Test
	public void add(int a, int b) {
		
		
		System.out.println("Add two numbers result"+  " "+(a+b));
		
		
	}
	@Parameters({"Hyderabad","Telangana"})
	@Test
	public void cityname(String city, String State) {
		
		
		System.out.println(" city name  state name and"+ city +" "+ State);
		
		
	}
	
	@Parameters("browserName")
	@Test
	public void InitialBrowser(String browserName) {
		
		 WebDriverManager.chromedriver().setup();
			
			
		 driver  = new ChromeDriver();
				
		
	}
	
	@Parameters("url")
	@Test
	public void Launchurl(String url) {
		
		driver.get(url);
				
		
	}
	
	

}
