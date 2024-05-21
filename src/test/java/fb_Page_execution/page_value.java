package fb_Page_execution;
import org.openqa.selenium.*;

import fb_Base_class.class_browser;
public class page_value extends class_browser
{ 
     public static By emailid     = By.xpath("//input[@type='text']");
     public static By passwordid  = By.xpath("//input[@type='password']");
     public static By login       = By.xpath("//button[@name='login']");
     
     public static void enter_emailid(String email)
     {
   	  driver.findElement(emailid).sendKeys(email);    	  
     }
     public static void enter_password(String password)
     {
   	  driver.findElement(passwordid).sendKeys(password);
     }
     public static void login()
     {
   	  driver.findElement(login).click();
     }
}
