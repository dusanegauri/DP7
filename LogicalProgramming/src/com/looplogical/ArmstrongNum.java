package com.looplogical;
import java.util.Scanner;
public class ArmstrongNum 
{
	static void armStrong(int num)
	{
		int original=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			int result= rem*rem*rem;
			sum+=result;
            num /= 10;
		}
		if(sum==original)
		{System.out.println("The Number is Armstrong Number.");}
		else {System.out.println("The Number is not Armstrong Number.");}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number any 3 digit number: ");
		int num=sc.nextInt();
		armStrong(num);
		sc.close();
	}

}
