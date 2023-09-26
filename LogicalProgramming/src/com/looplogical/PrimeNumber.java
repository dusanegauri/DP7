package com.looplogical;

public class PrimeNumber {
		
		static boolean checkPrime(int n)
		{
			boolean status= true;
			if((n==0)||(n==1))
				status=false;
			else
			{
				for(int i=2;i<=n/2;i++) // (i<=n/2)    (i<n)
				{
					if(n%i==0)
					{
						status=false;
						break;
					}	
				}
					
			}
				
		
			return status;	
		}

		public static void main(String[] args) {
			
			System.out.println(checkPrime(23));
			
			//Series print prime numbers from 1 to 50
			
			System.out.println("Prime numbers from 1 to 50");
			System.out.println();
			for(int i=1;i<=10;i++)
			{
				if(checkPrime(i)) // if(checkPrime(i)== true)
				{
					System.out.println(i);
				}
			}
			
			
		}
		
	}
