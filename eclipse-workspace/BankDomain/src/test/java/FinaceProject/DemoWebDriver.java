package FinaceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		
//		WebDriver driver = new WebDriver();

//     WebDriver driver = new ChromeDriver();
		
 WebDriver driver = new  FirefoxDriver();

	

	}

}
