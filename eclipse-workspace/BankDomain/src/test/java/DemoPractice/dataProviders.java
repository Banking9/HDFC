package DemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(dataProvider = "testdata" ,dataProviderClass = demodata1.class)
public class dataProviders {
	
	public void userDetails(String username,String password) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
			
//		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		   driver.get("https://www.saucedemo.com/");
		
		   driver.manage().window().maximize();
		
	       driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys(username);
		
           driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(password);
		   
		   driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		  
	}
	
	
}


