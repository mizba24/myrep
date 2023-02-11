package oopsDemos;

import java.util.Scanner;

public class UsingExceptionHandling {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("enter number1: ");
			int n1=sc.nextInt();
			System.out.print("enter number2: ");
			int n2=sc.nextInt();
			int res=n1/n2;
			int res1=n1%n2;
			System.out.println("the division of " + n1 + "with" + n2 + "is :" + res + "reminder is" + res1);
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("you cant divide number with zero");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		

	}

}
