package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://ebay.com");
		
		driver.manage().window().maximize();
		
		
		//getLocation method *****Start *****
		
		//SeachBox *****
		
		WebElement searchBoxLocation = driver.findElement(By.id("gh-ac"));
		
		
		Point locations = searchBoxLocation.getLocation();
		
		
		System.out.println("X Location" + " "+ locations.getX());
		
		System.out.println("Y Location" + " "+ locations.getY());
		
		
		//Search Button *****
		
		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
		
		
		
		Point button = searchBtn.getLocation();
		
		System.out.println("X Location" + " "+ button.getX());
		System.out.println("Y Location" + " "+ button.getY());
		
		
		
      
	
		
		
		
		
	}

}
