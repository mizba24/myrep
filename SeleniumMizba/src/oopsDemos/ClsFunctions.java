package oopsDemos;

import java.util.Scanner;

public class ClsFunctions extends ClsMathFunc implements ISttringFunctions
{
	public String strReverse(String str)
	{
		String strrev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			strrev=strrev+str.charAt(i);
		}
		return strrev;
		
	}
	public String getID(String email)
	{
		return(email.substring(0,email.indexOf('@')));
	}

public static void main(String[] args)
{
 	
	//Scanner sc=new Scanner(System.in);
	//System.out.print("enter the String");
//	String str1=sc.next();
	ClsFunctions obj=new ClsFunctions();
	String str1=obj.strReverse("mizba");
	System.out.println("the reverse is:" + str1);
	System.out.println("the ID is:" + obj.getID("mizba24@gmail.com"));
	System.out.println("the sum is:" + obj.Add(23, 24));
	System.out.println("the diff is:" + obj.Subtract(21, 19));
}

}