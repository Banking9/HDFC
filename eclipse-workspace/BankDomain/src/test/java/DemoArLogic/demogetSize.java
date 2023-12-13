package DemoArLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demogetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().window().maximize();
		
		WebElement shopByCate = driver.findElement(By.id("headlessui-menu-button-:r8:"));
		
		
		Dimension  dim = shopByCate.getSize();
		
		
		System.out.println("Button size " + " "+dim.width +" "+ dim.height );

	}

}
