package com.looplogical;
import java.util.Scanner;
public class PerfectNum 
{
	static void perfectNum(int num)
	{
		int sum=0;
		for (int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		
		}
		if (sum==num)
		{System.out.println(num+ " is a perfect num." );}
		
		else 
			{
			System.out.println("The number is not perfect number.");
			}
			 
	
	}  
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		perfectNum(num);
	sc.close();			
	}
}
