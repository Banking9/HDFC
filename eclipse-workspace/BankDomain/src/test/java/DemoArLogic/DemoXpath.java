package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver  = new ChromeDriver();
		
		//Open webPage ***
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		
	WebElement element = 	driver.findElement(By.xpath("//a[@id = 'cat']"));
		
		//Get inside the test using getText method()
		System.out.println(element.getText());
		
		
	}

}
