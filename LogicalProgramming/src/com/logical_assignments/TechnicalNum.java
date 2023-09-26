package com.logical_assignments;
import java.util.Scanner;
public class TechnicalNum 
{
	public static void checkNum(int num)
	{
		int count =0;
		int original = num;
		int place=1;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		
			for (int i=1; i<=count/2; i++)
				
			{
				
				place=place*10;
			}
				if (count%2==0)
				{
			
			int no1=original/place;
			int no2=original%place;
			int sum=no1+no2;
			int sq=sum*sum;
			if(sq==original)
			{
				System.out.println("The number is Tech no");
			}
			else {System.out.println("The no is not Tech No");}
		}
		else {System.out.println("The count of the no is not even");}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int num=sc.nextInt();
		checkNum(num);
	}

}
