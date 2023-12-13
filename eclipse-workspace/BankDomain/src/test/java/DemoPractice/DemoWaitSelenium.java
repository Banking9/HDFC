package DemoPractice;

import java.util.concurrent.TimeUnit;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWaitSelenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		    WebDriverManager.chromedriver().setup();
		    

			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://nxtgenaiacademy.com/alertandpopup/ ");
			
	      driver.findElement(By.xpath("//button[contains( @name,'alertbox')]")).click();
	     
	     Thread.sleep(3000);
	    //Alert is class ***
	    Alert simpleAlert = driver.switchTo().alert();
	    
	    
	     
	   String textAlert =  simpleAlert.getText();
	   
	   System.out.println("Simple Alert message"+ "    " +textAlert);
	    
	    
	    
	    
	}
}
