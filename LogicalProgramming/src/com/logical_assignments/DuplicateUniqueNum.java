package com.logical_assignments;

import java.util.Scanner;

public class DuplicateUniqueNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits:");
		int digit=sc.nextInt();
		
		for (int i=0;i<=9;i++)
		{
			int count = 0;
			int original=digit;
			while(original>0)
			{
				int num=original%10;
				if (num==i)
				{
					count++;
				}
				original/=10;
			}

			if(count>1)
			{
				System.out.println("Duplicate Digit : "+i+" counts: "+count);
			}
			if(count==1)
			{
				System.out.println("Unique Digit counts: "+i+" count: "+count);
			}
		}
		
	}

}
