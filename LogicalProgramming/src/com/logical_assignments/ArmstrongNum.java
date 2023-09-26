//WAP to print ARMSTRONG NUMBER between 1 to 1700
package com.logical_assignments;
public class ArmstrongNum 
{
	static void checkArmstrong(int num)
	{
		int num1=num;
		int num2=num;
		int count=0;
		while (num!=0)
		{
			num/=10;
			count++;
		}
		int sum=0;
		//int pow=1;
		while (num1!=0)
		{
			int pow=1;
			int rem=num1%10;
			for(int i=1;i<=count;i++)
			{
				pow=pow*rem;
			}
			sum=sum+pow;
			num1=num1/10;
		}
		if(sum==num2)
			{System.out.println(sum);}
	}
	public static void main(String args[])
	{
		for (int i=1;i<=1700;i++)
		{
			checkArmstrong(i);
			
		}
	}

}
