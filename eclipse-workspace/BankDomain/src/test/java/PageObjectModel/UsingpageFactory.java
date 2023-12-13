package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingpageFactory {
	
	
	
     WebDriver driver;
	
	
	//Constructor 
	
    UsingpageFactory(WebDriver d){
		
		driver  = d;
		
		//This method create web
		PageFactory.initElements(driver,this);
	}
    
    
    
    
    //Identify WebElement
    
    @FindBy(id = "user-name")WebElement username;
    @FindBy(id = "password")WebElement password;
    @FindBy(id = "login-button")WebElement login;
    
    
public void enterusername(String user1) {
		
		
	username.sendKeys(user1);
	}
	
    public void enterPassword(String pwd1) {
		
		
    	password.sendKeys(pwd1);
	}
	

    public void clickonlogin() {
	
	
    	login.click();;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    


}
