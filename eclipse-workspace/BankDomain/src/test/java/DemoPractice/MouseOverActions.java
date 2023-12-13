package DemoPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		    WebDriverManager.chromedriver().setup();
		     

			WebDriver driver = new ChromeDriver();
			
			//Actions is class  (new Actions is instance) *****
			
			Actions actions = new Actions(driver);
			
			driver.get("https://www.bigbasket.com/");
			
			driver.manage().window().maximize();
			
			//Mouseover Double click Actions **********
			

	
		WebElement doubleC = 	driver.findElement(By.xpath("//*[@class = 'nav navbar-nav visible-md visible-lg']"));
			
//		actions.moveToElement(doubleC).perform();
		//*[text() = 'Bakery, Cakes & Dairy']
		
		WebElement clickAction = 	driver.findElement(By.xpath("//div[contains(@class,'tabs-left')]//following::li[3]//child::a"));
		
		actions.moveToElement(clickAction).perform();

		
//		WebElement textMessage = driver.findElement(By.xpath("//*[contains(@id,'dynamicClickMessage')]"));
//		
//		System.out.println("Click Action Text Message" + " "+textMessage.getText());
//		
//		
			
			
			
			
	}

}
