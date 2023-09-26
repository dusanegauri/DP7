package com.looplogical;
//import java.util.Scanner;
public class KrishnamurthyNum 
{
	static void factNum(int n)
	{

		long fact=1;
		for (int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
	public static void main(String args)
	{
		factNum(145);
		
	}

}
