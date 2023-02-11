package testNGDemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class UsingAssertions
{
  @Test
  public void f()
  {
	  //HardAssertion(Assert)
//		
		  System.out.println("Beginning...."); 
		  Assert.assertTrue(true);
		  System.out.println("Test1 is passed");
		  Assert.assertTrue(false);
		  System.out.println("Test2 is failed");
		  Assert.assertTrue(false);
		  System.out.println("Test3 is failed");
		  System.out.println("Ending..");
		 
	  //SostAssertion(Verify)
//	  System.out.println("Beginning....");
//	  SoftAssert sa=new SoftAssert();
//	  sa.assertTrue(true);
//	  System.out.println("Test1 is passed");
//		sa.assertTrue(false, "Test2 is failed" );
//		System.out.println("Test2 is failed");
//		sa.assertTrue(false, "Test3 is failed" );
//		System.out.println("Test3 is failed");
//		System.out.println("Ending...");
//		sa.assertAll();

  }
}
