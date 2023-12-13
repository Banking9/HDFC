package PageObjectMode3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWithouPageFat {

	WebDriver driver;
	
	//constructor
	
	LoginWithouPageFat(WebDriver d){
		
		driver = d;
		
	}
	
	
	By signin =    (By.xpath("//a[contains(text(),'Sign In')]"));
	By username =  (By.xpath("//input[contains(@id,'email')]"));
	By password =  (By.xpath("	//input[contains(@id,'pass')]"));
	By login =     (By.xpath("//button[contains(@id,'send2')]"));
	
	
	public void homepage() {
		
		driver.findElement(signin).click();
		
	}
	
	
public void enterusername(String user) {
		
		driver.findElement(username).sendKeys(user);
		
	}
	
public void enterpassword(String pwd) {
	
	driver.findElement(password).sendKeys(pwd);
	
}
	
	public void clicklogin() {
		
		driver.findElement(login).click();	
		
	}
	

}
