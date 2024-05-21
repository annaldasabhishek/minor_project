package instagram_page;
import org.openqa.selenium.By;
import instagram_base.instagram_browser;
public class instagram_value extends instagram_browser
{
	
   public static By user        = By.xpath("//input[@name='username']");
   public static By password    = By.xpath("//input[@name='password']");
   public static By login       = By.xpath("//div//button[@type='submit']");
   
   public static void enter_phonenumber(String number)
   {         
	   driver.findElement(user).sendKeys(number);
   }
   public static void enter_password(String word)
   {
	   driver.findElement(password).sendKeys(word);
   }
   public static void login()
   {
	   driver.findElement(login).click();
   }
}