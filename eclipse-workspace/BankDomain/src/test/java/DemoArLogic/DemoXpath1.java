package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoXpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver  = new ChromeDriver();
		
		
		
		//Load the Url ****
		
		
		driver.get("https://www.saucedemo.com/");
		
		
		//For Basic Xpath *******
		
		//UserName ***
		WebElement userName  = driver.findElement(By.xpath("//*[@name = 'user-name']"));
		
		
		userName.sendKeys("standard_user");
		

		WebElement password = driver.findElement(By.xpath("//*[@type = 'password']"));
		
		
		password.sendKeys("secret_sauce");
		
		
		WebElement login = driver.findElement(By.xpath("//*[@value = 'Login']"));
		
		login.click();
		
	}

}
