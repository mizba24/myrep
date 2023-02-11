package testNGDemos;

import org.testng.annotations.Test;

public class GroupTestDemo {
	 @Test(groups = {"Login"})
	  public void Login()
	  {
		  System.out.println("Login Test Script");
	  }
	  @Test(groups = {"Trans"})
	  public void Deposit()
	  {
		  System.out.println("Deposit Test Script");
	  }
	  @Test(groups = {"Login"})
	  public void Withdraw()
	  {
		  System.out.println("Withdraw Test Script");
	  }
	  @Test(groups = {"Trans"})
	  public void Signout()
	  {
		  System.out.println("Signout Test Script");
	  }
}
