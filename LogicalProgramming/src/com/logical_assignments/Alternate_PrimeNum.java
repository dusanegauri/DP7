package com.logical_assignments;
import java.util.Scanner;
public class Alternate_PrimeNum {
	static void checkPrime(int num) {
		int count;
		int result = 1;
		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				result++;
				if (result % 2 == 0) {
					System.out.println(i + " ");
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		checkPrime(num);
	}
}
