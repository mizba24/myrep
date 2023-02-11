package hybridDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.BrowserFactory;
import pomPages.ClsEbay;
import pomPages.ClsTestData;

public class HybridEbayProdSearchTest {
	
		  @Test(dataProvider = "ebayData")
		  public void prodSearch(String ddValue, String txtValue)
		  {
			  WebDriver driver=BrowserFactory.startBrowser("chrome", "http://ebay.com");
				 ClsEbay obj=new ClsEbay(driver);
			  obj.fnSearch(txtValue);
			  
				  Reporter.log("'"+ txtValue +"'"+ "Product search test is succesful",true);

}
		  @DataProvider
		  public Object[][] ebayData() throws Exception
		  {
		    Object[][] myData=ClsTestData.getExcelData("C:\\Users\\amoham885\\eclipse-workspace\\Mizba_QAsamples\\SeleniumMizba\\maven_project\\src\\test\\resources\\DDFEbayTestData.xlsx");
	
		  return myData;
		  }
		  
}