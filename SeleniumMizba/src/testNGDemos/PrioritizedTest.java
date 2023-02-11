package testNGDemos;

import org.testng.annotations.Test;

public class PrioritizedTest {
	 @Test(priority=3)
	  public void Withdraw()
	  {
		  System.out.println("Withdraw Test Script");
	  }
	@Test(priority=1)
	public void Login()
	  {
		  System.out.println("Login Test Script");
	  }
	 @Test(priority=4,enabled=false)
	  public void Signout()
	  {
		  System.out.println("Signout Test Script");
	  }
	 
	  @Test(priority=2)
	  public void Deposit()
	  {
		  System.out.println("Deposit Test Script");
	  }
}
