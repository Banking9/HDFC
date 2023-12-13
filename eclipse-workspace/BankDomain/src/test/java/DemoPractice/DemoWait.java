package DemoPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

		 WebDriverManager.chromedriver().setup();
			
		WebDriver driver  = new ChromeDriver();
			
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		
		//getWindowHandle() & close child wind and back ***** & get title 
		
           driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
           
           String parentWindowHandle = driver.getWindowHandle();
           
        // Get all window handles
           Set<String> allWindowHandles = driver.getWindowHandles();

           // Iterate through all window handles and close each window
           for (String windowHandle : allWindowHandles) {
               // Switch to the window
               driver.switchTo().window(windowHandle);
               // Close the window
               driver.close();
           }

           // Switch back to the main window
           driver.switchTo().window(parentWindowHandle);

           
           
//        // Get the window handle of the parent window
//           String parentWindowHandle = driver.getWindowHandle();
//
//           // Get all the window handles of the open windows
//           Set<String> allWindowHandles = driver.getWindowHandles();
//
//           // Loop through the set of window handles and switch to each window
//           for (String windowHandle : allWindowHandles) {
//               // Switch to the current window
//               driver.switchTo().window(windowHandle);
//
//               // Check if the current window is not the parent window
//               if (!windowHandle.equals(parentWindowHandle)) {
//                   // Perform the required operations in the child window
//
//                   // Example: Print the child window title
//                   System.out.println("Child Window Title: " + driver.getTitle());
//
//                   // Close the child window
//                   driver.close();
//               }
//           }
//
//           // Switch back to the parent window
//           driver.switchTo().window(parentWindowHandle);
           
           
//      String parentwindow = driver.getWindowHandle();    
//           
//      System.out.println("Window handle :" +parentwindow);
//      
//      
//      Set<String> allwindows = driver.getWindowHandles();
//      
//      for(String windowHandle:allwindows) {
//    	  
//    	  
//    	  if(!windowHandle.equalsIgnoreCase(parentwindow));
//    	  
//    	  driver.switchTo().window(windowHandle);
//    	  
//    	  
//    	  
//      }
//      
//      
//      driver.switchTo().window(parentwindow);
//        
//	
//	String eles = driver.getWindowHandle();
//	System.out.println("Window handle :" +eles);
//	
	
//		
//  for(int i=0;i<3;i++) {
//	  
//	  windowHanfle.click();
//	  
//	  Thread.sleep(3000);
//	  
//  }
//		
//  
//  Set<String> elemnt = driver.getWindowHandles();
//		
//		for(String handle:elemnt) {
//			
//			System.out.println("Window handle :" +handle);
//			
//			
//		}
//		

	}

}
