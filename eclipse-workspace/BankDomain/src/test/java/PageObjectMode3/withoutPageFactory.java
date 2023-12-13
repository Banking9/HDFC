package PageObjectMode3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



import io.github.bonigarcia.wdm.WebDriverManager;

public class withoutPageFactory {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();

		 WebDriverManager.chromedriver().setup();
	     

			WebDriver driver = new ChromeDriver();
			
			//Actions is class  (new Actions is instance) *****
			

			
			driver.get("https://magento.softwaretestingboard.com/");
			
			driver.manage().window().maximize();
			
		 driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
			
				
			
			WebElement username = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
			
		
			WebElement password = driver.findElement(By.xpath("	//input[contains(@id,'pass')]"));
			
			
			
			username.sendKeys("bandaru100@gmail.com");
			password.sendKeys("Ameena@1234");
			
			
			
             driver.findElement(By.xpath("//button[contains(@id,'send2')]"));
             
             
             String pageTitle = driver.getTitle();
             
             Assert.assertEquals(pageTitle, "Home Page");
             
			
     
			
			


	}

}
