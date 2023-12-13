package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		//Get command *****
		driver.get("https://www.ebay.com/");
		
		
		
		WebElement ele = driver.findElement(By.className("hl-item__displayPrice"));
		
	
		
	
		System.out.println(ele.getText());
		
		//Close command ******
		
//		driver.close();
		
		//Quit commands ****
		
		
//		driver.quit();

		
		
		
		
	}

}
