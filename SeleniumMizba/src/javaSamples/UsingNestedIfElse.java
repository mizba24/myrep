package javaSamples;

import java.util.Scanner;

public class UsingNestedIfElse {

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter salary");
	 int sal=sc.nextInt();
	 char grade;
	 if(sal<20000)
		 grade='C';
	 else if(sal>20000 && sal<40000)
	 	grade='B';
	 else
		 grade='A';
	 System.out.println("Grade for given salary is :" + grade);
	 
	}
	}
