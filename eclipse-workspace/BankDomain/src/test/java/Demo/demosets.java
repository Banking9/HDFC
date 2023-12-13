package Demo;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demosets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver  = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/browser-windows");
		
		
	   driver.findElement(By.id("windowButton")).click();
	   
	   
	   
	

}
}