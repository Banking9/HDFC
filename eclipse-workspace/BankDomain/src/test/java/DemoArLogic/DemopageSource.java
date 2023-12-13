package DemoArLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemopageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver  = new ChromeDriver();
		
		
		//Get() method ***
		
		
		driver.get("https://www.bigbasket.com/");
		
		
		
		//Get pagesource ***
		
		
		String currentWebPageSource = driver.getPageSource();
		
		
		System.out.println("Get page Source " + " "+currentWebPageSource);
		
		
		
		
		
		

	}

}
