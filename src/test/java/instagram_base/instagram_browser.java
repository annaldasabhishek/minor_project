package instagram_base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class instagram_browser
{
        public static WebDriver driver;
     
      public static void Browser_launch()
      {
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    	 driver.get(" https://www.instagram.com/accounts/login/");
    	 driver.manage().window().maximize();
    	 
      }
      public static void Browser_close()
      {
    	  driver.close();
      }
}
