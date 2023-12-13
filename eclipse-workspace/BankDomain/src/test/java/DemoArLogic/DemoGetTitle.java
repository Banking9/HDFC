package DemoArLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		//Get method();
		driver.get("https://www.ebay.com");
		
		//GetTitle() method****
		
		String pageTitle = driver.getTitle();
		
		System.out.println("Current Page Title" + " "+pageTitle );
		
		//close()****
		
		driver.close();
		

	}

}
