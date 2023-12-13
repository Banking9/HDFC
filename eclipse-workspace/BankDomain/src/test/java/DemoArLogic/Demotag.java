package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		//Load WebPage using Get()method ***
	   driver.get("https://duckduckgo.com/");

	   WebElement tag = driver.findElement(By.id("searchbox_input"));
	   
	   
	   System.out.println("Tag name" + " "+ tag.getTagName());
		
	   
	   
		
	}

}
