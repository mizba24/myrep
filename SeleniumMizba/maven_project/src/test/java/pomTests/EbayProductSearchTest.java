package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.ClsEbay;

public class EbayProductSearchTest {
  @Test
  public void prodSeach()
  {
	  WebDriverManager.chromedriver().browserVersion("108").setup();
	  WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://ebay.com");
		 WebElement txt=driver.findElement(By.id("gh-ac"));
		 txt.sendKeys("sony");
		 WebElement btn=driver.findElement(By.id("gh-btn"));
		 btn.click();
//	  ClsEbay obj=new ClsEbay());
//	  obj.fnSearch("sony");
		 Reporter.log("Ebay search test is succesful",true);
  }
}
