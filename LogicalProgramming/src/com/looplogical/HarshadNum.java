package com.looplogical;
import java.util.Scanner;
public class HarshadNum 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int num=sc.nextInt();
		int original=num;
		int rem=0;
		int sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println("sum= "+sum);
		if (original%sum==0)
		{
			System.out.println(original+" is a Harshad Number.");
		}
		else
		{
			System.out.println(original+" is not a Harshad Number.");
		}
		sc.close();
	}
}
