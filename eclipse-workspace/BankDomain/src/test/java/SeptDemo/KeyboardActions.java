package SeptDemo;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     

			WebDriver driver = new ChromeDriver();
			
			//Actions is class  (new Actions is instance) *****
			

			
			driver.get("https://www.facebook.com/r.php");
			
			driver.manage().window().maximize();
			
			//Mouseover Double click Actions **********
			
			Actions actions = new Actions(driver);
			
	
		WebElement forgotEle = 	driver.findElement(By.xpath("//*[contains(@name,'firstname')]"));
			
		actions.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("Ameena")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("Raj")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
	
		.sendKeys("12345678").
		sendKeys(Keys.TAB).
		pause(Duration.ofSeconds(1))
		.sendKeys("asfasdfaf").
		build().perform();
	        
		        
		        
	}

}
