//WAP to print Pell Series 
package com.logical_assignments;
import java.util.Scanner;
public class PellNum 
{
	static void pellNumber(int count)
	{
		int a=0, b=1;
		//System.out.println(a+"  "+b+"  ");
		for (int i=2; i<=count;i++)
		{
			int sum=b*2+a;
			System.out.println(sum+"  ");
			a=b;
			b=sum;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count:");
		int count=sc.nextInt();
		pellNumber(count);
		sc.close();
	}

}
