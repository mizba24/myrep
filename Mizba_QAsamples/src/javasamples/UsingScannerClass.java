package javasamples;
import java.util.Scanner;

public class UsingScannerClass {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter number 1:");
		int i=sc.nextInt();
		System.out.println("Enter number 2:");
		int j=sc.nextInt();
		int k=i+j;
		System.out.println("The 2 numbers entered are" + k );
	}

}
