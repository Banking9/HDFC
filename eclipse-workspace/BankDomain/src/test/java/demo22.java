import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo22 {
	
	@Test()
	public void met() {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				

			
			driver.get("https://www.amazon.in/");
		
	}
}
