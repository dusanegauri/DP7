package com.logical_assignments;
import java.util.Scanner;
public class CovertIntoSingleDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0 || sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			sum=num%10;
			//num/=10;
			if (sum<=9)
			{break;}
		}
		System.out.println(sum);
	}

}
