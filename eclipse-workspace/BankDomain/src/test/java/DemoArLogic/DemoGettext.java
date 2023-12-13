package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	   WebDriverManager.chromedriver().setup();	
	   
	   WebDriver driver = new ChromeDriver();
	   
	   
	   
	   //Open webpage *******
	   
	   driver.get("https://www.ebay.com/");
	   
//	   WebElement titleText = driver.findElement(By.className("title"));
//	   
//	   //GetText() method calling ****
//	   String title = titleText.getText();
//	   
//	   System.out.println("Get text " + "  "+title);
//	   
//		
//	   WebElement infoText = driver.findElement(By.className("info"));
//		
//	   System.out.println("Get info  :" + "  "+infoText.getText());
	   
	   
	 

}
}
