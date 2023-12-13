package DemoPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoParameterSearch {
	
@Parameters("keyword")
	@Test
	
	public void googleSearch(String seachdata) {
		

		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				

			
			driver.get("https://www.amazon.in/");
			
	WebElement searchProduct = driver.findElement(By.id("twotabsearchtextbox"));
			
			searchProduct.sendKeys("Laptop Name",Keys.ENTER );
	
	
		
		
	}

}
