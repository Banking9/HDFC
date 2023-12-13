package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getlocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		WebElement shopByCate = driver.findElement(By.id("gh-logo"));
		
		Point ele = shopByCate.getLocation();
		
		
		
		System.out.println(" x location " +  "  "+ele.getX());
		
		System.out.println(" x location " +  "  "+ele.getY());
	}

}
