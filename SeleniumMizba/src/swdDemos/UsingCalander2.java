package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalander2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month");
		String month=sc.next();
		month=month.substring(0,3);
		System.out.print("Enter the day to select");
		String day=sc.next();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BrowserDrivers108\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.redbus.in");
		 driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
		 while(!driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText().substring(0, 3).equalsIgnoreCase(month))
		 {
			 driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
			 
		 }
		 List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
			
			for(int i=3;i<=rows.size();i++)
			{
				List<WebElement> cols=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+ i +"]/td"));
				
				for(int j=1;j<=cols.size();j++)
				{
					WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+ i +"]/td["+ j +"]"));
						if(cell.getText().equals(day))
							{
								cell.click();
								break;
							}
				}
			}
			driver.findElement(By.id("src")).sendKeys("chennai");
			driver.findElement(By.id("dest")).sendKeys("mumbai");
			driver.findElement(By.id("search_btn")).click();
			
	}

}
