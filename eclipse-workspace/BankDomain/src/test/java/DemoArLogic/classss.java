package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  WebDriverManager.chromedriver().setup();	
		   
		   WebDriver driver = new ChromeDriver();
		   
		   
		   
		   //Open webpage *******
		   
		   driver.get("https://www.facebook.com/");
		   
		   WebElement titleText = driver.findElement(By.className("inputtext _55r1 _6luy"));

		   titleText.sendKeys("asfasdf");
		   
		   
		   
		   
		
		
	}

}
