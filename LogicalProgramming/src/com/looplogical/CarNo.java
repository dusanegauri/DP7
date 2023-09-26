package com.looplogical;
import java.util.Scanner;
public class CarNo 
{
	static void frequencyOfNum(int num, int digit)
	{
		int count=0;
		while(num!=0)
		{
			int rem=num%10;
			if (rem==digit)
			{
				count++;
			}
			num/=10;
		}
		System.out.println(count);
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Car Number:");
		int num=sc.nextInt();
		System.out.println("Enter your Lucky Number: ");
		int digit=sc.nextInt();
		frequencyOfNum(num,digit);
		sc.close();
	}

}
