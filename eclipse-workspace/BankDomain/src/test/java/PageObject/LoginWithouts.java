package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
//			driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
			
			   driver.get("https://magento.softwaretestingboard.com/");
			
			   driver.manage().window().maximize();
			   
		
			   String PageTitle = driver.getTitle();
			   
			  System.out.println( PageTitle);
			   
			     driver.findElement(By.xpath("//a[contains(text(),'Sign In ')]")).click();
			
		
			WebElement userName =      driver.findElement(By.xpath("//input[contains(@id, 'email')]"));
			
			WebElement Password =   driver.findElement(By.xpath("//input[contains(@id, 'pass')]"));
			
			
			userName.sendKeys("bandaru100@gmail.com");
			Password.sendKeys("Ameena@1234");
		
			
			  driver.findElement(By.xpath("//button[contains(@id, 'send2')]")).click();
			  
			  
			  Assert.assertEquals(driver.getTitle(), "Home Page");
			  
			  
			  
			  
			  
			  
	}

}
