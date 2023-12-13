package DemoPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotsss {
	
	
	@Test
	public void takeScrrenShots() throws Exception {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
			driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		//step 1: Convert your driver to an object to TakeScreenshot
		TakesScreenshot screenshot =((TakesScreenshot)driver);
		//step 2: Call getScreenshotAs method to create image file
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		//step 3: Copy file to the Location you want
		FileUtils.copyFile(file, new File("prints//screenshot.png"));
	}

}
