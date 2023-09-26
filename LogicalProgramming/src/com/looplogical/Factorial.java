package com.looplogical;
import java.util.Scanner;
public class Factorial 
{
	static void factNumber(int n)
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		factNumber(n);
		//factNumber();
		sc.close();
	}
}
