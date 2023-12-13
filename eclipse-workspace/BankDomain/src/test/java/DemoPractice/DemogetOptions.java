package DemoPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemogetOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		 WebDriverManager.chromedriver().setup();
			
		WebDriver driver  = new ChromeDriver();
			
		driver.get("https://www.google.com/");
		
		//For maximize window ****
		
	    driver.manage().window().maximize();
	    
	    
//	    WebElement firstSelect = ;//Find Element 
	    
//	    Select firstOptions = new Select(driver.findElement(By.xpath("//select[contains(@id,'Carlist')]")));//invoke select method
//	    
//	    
//	    WebElement ele = firstOptions.getFirstSelectedOption(); //stored WebElement ****
//	    
//	    
//	    System.out.println(ele.getText()); //
	    
	    
	    //DropDown empty or not **********
	
		
//	    List<WebElement> emptyorNot   = firstOptions.getOptions();
//	    
//	    if(emptyorNot.isEmpty()) {
//	    	
//	    	System.out.println("Dropdown is empty");
//	    	
//	    	
//	    }else {
//	    	
//	    	System.out.println("Dropdown is  not empty");
//	    	
//	    }
//        
//		

	    
	    //Auto suggestions *********
	    
	    
	    
	    
	    WebElement autosug = driver.findElement(By.xpath("//*[contains(@name,'q')]"));
	    
	    
	    
	    
	    
	    
	    
			

	}

}
