package testNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DependencyTestDemo extends DriverTest
{
  @Test(dependsOnMethods = "checkTitle")
  public void Search()
  {
	  
		driver.findElement(By.name("q")).sendKeys("selenium");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
}
   @Test
   public void checkTitle()
   {
	 String title=driver.getTitle();
	 Assert.assertEquals(title,"Google");
	 
   }
  
}