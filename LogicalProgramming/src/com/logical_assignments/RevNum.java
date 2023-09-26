package com.logical_assignments;

public class RevNum 
{
	
	static boolean checkRev(int num)
	{
		int original=num;
		int last3sum=0;
		int first3sum=0;
		//sum of last 3 digits
		for (int i=0; i<3;i++)
		{
			last3sum=last3sum+(num%10);
			num=num/10;
		}
		System.out.println("Last 3 Digit sum is: "+last3sum);
		num=original;
		int revNum=0;
		while(num!=0)
		{
			revNum=revNum*10+(num%10);
			revNum=revNum/10;
			//System.out.println("Sum of 1st 3 digit: ");
		}
		System.out.println("Sum of 1st 3 digit: "+first3sum);
		
		if (last3sum==first3sum)
		{
			return true;
		}
			else 
				return false;
	}
	public static void main(String args[])
	{
		int n =123321;
		System.out.println(checkRev(n));
	}
}
