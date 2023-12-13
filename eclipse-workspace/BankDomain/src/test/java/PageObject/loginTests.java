package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.UsingpageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
   
			//create object loginPage
			withPageObjectMdl loginpages = new  withPageObjectMdl(driver);
			
//			UsingpageFactory loginpage = new UsingpageFactory(driver);
			
			   driver.get("https://magento.softwaretestingboard.com/");
			   
			   loginpages.hamePage();
			   loginpages.enterusername("bandaru100@gmail.com");
			   loginpages.enterPassword("Ameena@1234");
			   
			   loginpages.clickonlogin();
		
		
		
	}

}
