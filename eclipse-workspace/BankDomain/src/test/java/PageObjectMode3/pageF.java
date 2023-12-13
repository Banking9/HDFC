package PageObjectMode3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageF {
	
	

    WebDriver driver;
	
	
	//Constructor 
	
    pageF(WebDriver d){
		
		driver  = d;
		
		//This method create web
		PageFactory.initElements(driver,this);
	}
   
   //Identify WebElement
   

   @FindBy   (xpath =("//a[contains(text(),'Sign In')]"))WebElement signin ;
   @FindBy   (xpath = ("//input[contains(@id,'email')]")) WebElement username;
   @FindBy   (xpath = ("	//input[contains(@id,'pass')]"))WebElement password;
   @FindBy   (xpath=("//button[contains(@id,'send2')]"))WebElement login;
  
	public void homepage() {
		
		signin.click();
		
	}

public void enterusername(String user) {
		
	username.sendKeys(user);
		
	}
	
public void enterpassword(String pwd) {
	
	password.sendKeys(pwd);
	
}
	
	public void clicklogin() {
		
		login.click();	
		
	}
	
   
   
	
	

}
