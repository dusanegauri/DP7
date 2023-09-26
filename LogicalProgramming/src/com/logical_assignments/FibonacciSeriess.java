package com.logical_assignments;

public class FibonacciSeriess 
{
	public static void main(String[] args) 
	{
		int sum;
		int a=0;
		int b=1;
		for(int i = 1;i<=20;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			if(sum%5!=0)
			{
				System.out.println(sum);
			}
		}
	}
}
