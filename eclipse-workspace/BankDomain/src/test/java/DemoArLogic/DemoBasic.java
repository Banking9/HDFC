package DemoArLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		//Get() method *****
	
		
		
		driver.navigate().to("https://www.ebay.com/");
		
		
		
	}

}
