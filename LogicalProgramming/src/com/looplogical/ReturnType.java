package com.looplogical;

public class ReturnType 
{
	static long factNumber (int n)//formal /dummy argument
	{
		long fact=1;
		for (int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact; //it should be last statement.
		
	}
	public static void main(String args[])
	{
		long ans;
		
		ans= factNumber(7);
		System.out.println("The factorial if 7 is: " +ans);
		ans=factNumber(9);
		System.out.println("The factorial if 9 is: " +ans);
		System.out.println("The factorial if 7 is: " +factNumber(5));
	}

}
