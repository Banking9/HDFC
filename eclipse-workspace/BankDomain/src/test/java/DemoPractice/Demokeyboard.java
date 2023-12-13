package DemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demokeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				

			
			driver.get("https://www.amazon.in/");
			
	WebElement ele = driver.findElement(By.xpath("//a[@class ='nav-a ' or  text() = 'Best Sellers']"));
			
			
	
	
	System.out.println("menu name" +"  " +ele.getText());
		

	}

}
