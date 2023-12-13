package DemoPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGetWindowTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
//			driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
			
			driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		
			driver.findElement(By.xpath(" //a[contains(text() ,' Like us On Facebook ')] ")).click();
			
			//For getwindowhandle string need store value*****
			
			String parentwindow = driver.getWindowHandle();
			
			System.out.print("parent window address"+ "    " + parentwindow );
			

			
		//
			Set<String> childwindow = driver.getWindowHandles();
			
			for(String  windowTitle :childwindow) {
				
			//Switch to the current window
				
				
				driver.switchTo().window(windowTitle);
				
		
				
				//if Check the current window is not the parent window 
				
				if(!windowTitle.equals(parentwindow)) {
					
					//perform the required operations in the child window 
					
					//print the child window title ***
					
					System.out.println("Child window Title " + driver.getTitle());
					
					driver.close();
				}
				
				
			}
			
			//Switch back to the main window *************
			driver.switchTo().window(parentwindow);
			

	}

}
