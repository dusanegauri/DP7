//WAP to find a number is automorphic number or not.
package com.logical_assignments;
import java.util.Scanner;
public class Trimorphic 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int original=num;
		int count=0;
		int cube=num*num*num;
		int pow=1;
		while (num>0)
		{
			int rem=num%10;

			count++;
			num/=10;
			
		}
		for(int i=1;i<=count;i++)
		{
			pow*=10;
		}
		
		if(cube%pow==original)
		{
			System.out.println("The number is Trimorphic.");
		}
		else
		{
			System.out.println("The number is not Trimorphic.");
		}
		sc.close();
	}

}
