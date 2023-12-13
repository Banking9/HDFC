package DemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsKeybordsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriverManager.chromedriver().setup();
	     

			WebDriver driver = new ChromeDriver();
			
			//Actions is class  (new Actions is instance) *****
			

			
			driver.get("https://the-internet.herokuapp.com/key_presses?");
			
			driver.manage().window().maximize();
			
			//Mouseover Double click Actions **********
			
			Actions actions = new Actions(driver);
			
			actions.sendKeys(Keys.ESCAPE).perform();
		
	WebElement ele = 	driver.findElement(By.xpath("//p[text()='You entered: ESCAPE']"));
		
	System.out.println(ele.getText());
			
			
		
	}

}
