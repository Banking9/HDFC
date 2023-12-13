package DemoPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class demopar {
	WebDriver driver;
	
	@Parameters("browserName")
	@Test
	public void InitialiseBrowser(String browserName) {
		
		 WebDriverManager.chromedriver().setup();
			
		 driver  = new ChromeDriver();
				

		
	}
	
//	@Test
//	public void Teardown() {
//		
//		driver.quit();
//	}
	
	@Parameters("url")
	@Test
	public void LaunchApp(String urls) {
		
		driver.get(urls);
	}
	
	

@Parameters({"user","pass"})
	@Test
	public void login(String username,String password) {
		

			
			WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
			
		   WebElement passwords = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		   
		   userName.sendKeys(username);
		   passwords.sendKeys(password);
		   

		   
		   driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		   
		
	}
	
	
}
