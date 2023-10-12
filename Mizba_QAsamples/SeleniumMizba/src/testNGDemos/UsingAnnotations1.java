package testNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UsingAnnotations1 extends DriverTest
{
  @Test
  public void Search()
  {
	  
		driver.findElement(By.name("q")).sendKeys("selenium");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
		
	}
  }

