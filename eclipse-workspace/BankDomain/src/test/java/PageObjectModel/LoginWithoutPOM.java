package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithoutPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
//			driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
			
			   driver.get("https://www.saucedemo.com/");
			
			   driver.manage().window().maximize();
			
		       driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
			
	           driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
			   
	           driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
	           
	           
	           Assert.assertEquals(driver.getTitle(), "Swag Labs");

	}

}
