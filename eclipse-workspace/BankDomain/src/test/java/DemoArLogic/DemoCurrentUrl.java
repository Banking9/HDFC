package DemoArLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		//Get() method *****
		driver.get("https://www.bigbasket.com/");
		
		
		
		 //Get current page url ****
		
		
	String currentUrl = 	driver.getCurrentUrl();
		
	System.out.println("Current Page Url " + currentUrl);
		
		
		

	}

}
