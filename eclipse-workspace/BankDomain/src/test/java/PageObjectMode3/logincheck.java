package PageObjectMode3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.withPageObjectMdl;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logincheck {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		    WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				

			//create object loginPage
//			LoginWithouPageFat loginpages = new  LoginWithouPageFat(driver);
			
//			UsingpageFactory loginpage = new UsingpageFactory(driver);
			pageF loginpages = new pageF(driver);

			   driver.get("https://magento.softwaretestingboard.com/");
			   
			   loginpages.homepage();
			   loginpages.enterusername("bandaru100@gmail.com");
			   loginpages.enterpassword("Ameena@1234");
			   
			   loginpages.clicklogin();
		
		
		
	}

}
