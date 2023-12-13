package DemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver  = new ChromeDriver();
		
		
		
		
	
		
//		
//        Select eles  = new Select(ele);
        
        
        //Select By Visible Text ;

//        eles.selectByVisibleText("Apr");
        
//    
      WebElement Daydropdown = driver.findElement(By.xpath("//Select[@title = 'Day']"));
		
//      Select DayDrop  = new Select(Daydropdown);
//      
//      DayDrop.selectByVisibleText("10");

        
//      SelectvaluefromDropDown(ele,"Dec");
//      SelectvaluefromDropDown(Daydropdown,"11"); 
   

      
      //Select ByValue *******************
      
//      WebElement textValue = driver.findElement(By.xpath("//Select[@title = 'Year']"));
      
      
//      Select values  = new Select(textValue);
      
      
//      values.selectByValue("2019");
//      
//      SelectvalueBy(textValue,"2018");
      
      
      
      
      
      //SelectByValue *************
      
//      WebElement eleMonth = driver.findElement(By.xpath("//select[@title= 'Month']"));
//      
//      
//      Select visisbleTxt = new Select(eleMonth);
//      
//      
//      visisbleTxt.selectByValue("3");
      
      
      
   
      //SeleByIndex ************
      
//		WebElement ele = driver.findElement(By.xpath("//select[@title= 'Month']"));
//      
//      Select selectIndex = new Select(ele);
//      
//      selectIndex.selectByIndex(11);
        
        
	}
	
	
//	public static void SelectvaluefromDropDown(WebElement Daydropdown12,String DayDrop1) {
//		
//		
//		
//		Select value  = new Select(Daydropdown12);
//		value.selectByVisibleText(DayDrop1);
//		
//		
//	}
//	
//	
//public static void SelectvalueBy(WebElement daydropvalue,String valueText) {
//		
//		
//		
//		Select value  = new Select(daydropvalue);
//		value.selectByVisibleText(valueText);
//		
//		
//	}
//	
	

}
