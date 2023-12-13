package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class withPageObjectModel {
	
	
	
	
	WebDriver driver;
	
	
	//Constructor 
	
	withPageObjectModel(WebDriver d){
		
		driver  = d;
		
	}

	
	By username = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	
	
	
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
