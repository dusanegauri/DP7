//WAP in which computer asks to guess the no. continue till user guesses correct no. 

package com.logical_assignments;
import java.util.Scanner;
public class GuessNum 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		int num1=28;
		while(num1!=0)
		{
		System.out.println("Guess the number:");
		int num=sc.nextInt();
		count++;
		if (num>num1)
		{
			System.out.println("You have entered higher number. Please enter lower num.");
			//if (count==5)
//			{System.out.println("You have guessed wrong number again and attempted all your chances.");
//			System.out.println("Better luck next time.");
//		break;}
		}
		else if(num<num1)
		{
			System.out.println("You have entered lower number. Please enter higher number.");
		}
		else if (num==num1)
		{
			System.out.println("Congraulations!!! You guessed correct number in "+count+"th attempt.");
			//System.out.println("No. Of Attempts "+count);
			break;
			
		}
		}
		sc.close();
	}

}
