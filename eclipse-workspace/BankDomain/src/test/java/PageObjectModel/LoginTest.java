package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
      
			//create object loginPage
//			withPageObjectModel loginpage = new  withPageObjectModel(driver);
			
			UsingpageFactory loginpage = new UsingpageFactory(driver);
			
			   driver.get("https://www.saucedemo.com/");
			   
			   
			   loginpage.enterusername("standard_user");
			   loginpage.enterPassword("secret_sauce");
			   
			   loginpage.clickonlogin();
		
		
	}

}
