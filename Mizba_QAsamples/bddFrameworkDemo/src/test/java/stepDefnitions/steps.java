package stepDefnitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.ClsAmazon;

public class steps
{
	public WebDriver driver;
	public ClsAmazon obj;
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser()
	{
	 WebDriverManager.chromedriver().browserVersion("108").setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 obj=new ClsAmazon(driver);
	    
	}
	@When("user opens url {string}")
	public void user_opens_url(String url) throws Exception
	{
	   driver.get(url);
	   Thread.sleep(3000); 
	}

	@When("user click on signin button")
	public void user_click_on_signin_button()
	{
	    obj.clickSignin();
	    }

	@When("user enter email as {string}")
	public void user_enter_email_as(String email) 
	{
	    obj.setEmail(email);
	}

	@When("user click on continue button")
	public void user_click_on_continue_button()
	{
	obj.clickContinue();    
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String pwd) 
	{
	   obj.setPassword(pwd);
	}

	@When("user click on Login button")
	public void user_click_on_Login_button()
	{
	    obj.clickLogin();
	}

	@Then("page url should be {string}")
	public void page_url_should_be(String expUrl)
	{
	    
String actUrl=driver.getCurrentUrl();
System.out.println(actUrl);
Assert.assertEquals(expUrl, actUrl);
}
}
