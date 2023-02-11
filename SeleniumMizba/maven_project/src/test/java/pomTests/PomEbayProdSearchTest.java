package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pomPages.BrowserFactory;
import pomPages.ClsEbay;

public class PomEbayProdSearchTest {
  @Test
  public void prodSearch()
  {
	  WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://ebay.com");
	 // driver.findElement(By.id("gh-ac")).sendKeys("Sony");
	  // driver.findElement(By.id("gh-btn")).click();
	  ClsEbay obj=new ClsEbay(driver);
	  obj.fnSearch("sony");
	  Reporter.log("Ebay search test is succesful",true);
  }
}
