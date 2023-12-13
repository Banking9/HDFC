package DemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoselectismulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver  = new ChromeDriver();
		
		
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		WebElement selectmulti = driver.findElement(By.xpath("//*[contains(@name,'FromLB')]"));
		
		
		Select  selectdropdown = new Select(selectmulti);
		
		
		//Multiple elements need to be find **************
		
		selectdropdown.selectByValue("Japan");
		selectdropdown.selectByIndex(6);
		selectdropdown.selectByVisibleText("Spain");
		
		boolean statues = selectdropdown.isMultiple();
		
		
		if(statues == true) {
			
			System.out.println("Dropdown multiple selected");
		}else {
			System.out.println("Dropdown multiple not selected");
			
		}
		
		
		
		

		
	}

}
