package testNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonTest {
  @Test
  public void aSearch() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://amazon.com");
		 driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("snowpants");
		 driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		 Reporter.log("Amazon search test is succesful...",true);

  }
}
