
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoClass {
	  
	    ChromeDriver driver;
        String url="https://politrip.com/account/sign-up";

 public void invokeBrowser() {
	
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\40736\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String urlFromWebpage = driver.getCurrentUrl();
		
		if (urlFromWebpage.equals("https://politrip.com/account/sign-up")); {
        	System.out.println("Sing-up Successful");
		}
 }
      
@Test      
public void singUp()  {
			
	        driver.findElement(By.name("first-name")).sendKeys("Delia");
	        driver.findElement(By.name("last-name")).sendKeys("Grigoriță");
	        driver.findElement(By.name("email")).sendKeys("deliaagrigorita@yahoo.com");
	        driver.findElement(By.name("password")).sendKeys("AaBbCc1234");
	        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("AaBbCc1234");
	        //driver.findElement(By.id("qa_loader-button")).click();
            
	}


   public static void main(String[] args) {
     DemoClass ps = new DemoClass();
     ps.invokeBrowser();
     ps.singUp();
     
   }
}
