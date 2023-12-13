package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class withPageObjectMdl {

	
	
	WebDriver driver;
	
	
	//Constructor 
	
	withPageObjectMdl(WebDriver d){
		
		driver  = d;
		
	}

    By signin = (By.xpath("//a[contains(text(),'Sign In ')]"));
	By username = By.xpath("//input[contains(@id, 'email')]");
	By password = By.xpath("//input[contains(@id, 'pass')]");
	By login = By.xpath("//button[contains(@id, 'send2')]");
	

	 public void hamePage() {
			
			
			driver.findElement(signin).click();;
		    
		    }
			

	public void enterusername(String user) {
		
		
		driver.findElement(username).sendKeys(user);
	}

    public void enterPassword(String pwd) {
		
		
		driver.findElement(password).sendKeys(pwd);
	}
	

    public void clickonlogin() {
	
	
	driver.findElement(login).click();;
    
    }
	
}
