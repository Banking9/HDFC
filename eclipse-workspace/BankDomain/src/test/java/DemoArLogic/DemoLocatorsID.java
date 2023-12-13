package DemoArLogic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoLocatorsID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		//get method() ***
		driver.get("https://www.ebay.com/");
		
		
		
		//1.ID ......Locator 
		
		
        //	WebElement element = 	driver.findElement(By.id("email"));
		
       //	element.sendKeys("jhon@gmail.com");
	
      //	element.clear();
	
		
		
		// 2.Name ......Locator 
		
		
//		WebElement element = driver.findElement(By.name("email"));
//		
//		element.sendKeys("jhon@gmail.com");
//		
//		element.clear();
//	
//		WebElement element1 = driver.findElement(By.name("email"));
	  

		//3.Link Text Locator ******
		
		
//		WebElement element = driver.findElement(By.linkText("Forgotten password?"));
//		
//		element.click();
		
		
		//4.Partial Link Text Locator ******
		
		
//		WebElement partialElement = driver.findElement(By.partialLinkText("Account"));
//		
//		partialElement.click();
		
	
	
		//5.Class name Locator ********
		
		
//		WebElement shopebyCate = driver.findElement(By.className("gh-sprRetina"));
//		
//		
//		shopebyCate.click();
//		
//		WebElement searchTab = driver.findElement(By.className("ui-autocomplete-input"));
//		
//		searchTab.sendKeys("Jewelry & Watches");
		
		
		//6.Tag Name Locator *******
		
		
		
	List<WebElement> links = driver.findElements(By.tagName("li"));
	
	
	for(WebElement tags : links) {
		
		
		System.out.println(tags);
	}
	
	


		
	}

}
