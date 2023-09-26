package com.looplogical;

public class ExtractNum 
{
	static void extract(int num)
	{
		System.out.println("The digit in number "+num+ " are.");
		while(num!=0)
		{
			int count=0;
			System.out.println(num%10);
			num/=10;
			count++;
			System.out.println(count);
		}
		
	}
	public static void main(String args[])
	{
		extract(987654321);
	}

}