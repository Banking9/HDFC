package SeptDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoHandleWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
//			driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
			
			driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		
			driver.findElement(By.xpath(" //a[contains(text() ,' Like us On Facebook ')] ")).click();
			
			//For getwindowhandle string need store value*****
			
			String parentwindow = driver.getWindowHandle();
			
			System.out.print("parent window address"+ "    " +parentwindow );
			

			
			
			
			Set<String> childwindow = driver.getWindowHandles();
			
			
			
			for(String child:childwindow) {
				
				
				System.out.print("child window address"+ "    " +child );
				
				
				driver.switchTo().window(child);
				
				Thread.sleep(3000);
				
				driver.close();
				
				
			}
			
			//switch back to the main window **********************
			
			driver.switchTo().window(parentwindow);
	
		
			
			
			
			
			

	}

}
