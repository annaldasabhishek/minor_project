package fb_Base_class;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class class_browser
{
	    public static WebDriver driver;
	
      public static void Browser_launch()
      {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
      }
      public static void Browser_close()
      {
    	  driver.close();
      }
}
