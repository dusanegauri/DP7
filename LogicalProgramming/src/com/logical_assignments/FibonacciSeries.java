//WAP to print fibonacci series
package com.logical_assignments;
import java.util.Scanner;
public class FibonacciSeries 
{  
		public static void main(String args[])  
		{   Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the count:");
		 int count=sc.nextInt();
		 int n1=0;
		 int n2=1;
		 int n3;
		 int i;
		// int count;    
		 System.out.print(n1+" "+n2);   
		    
		 for(i=2;i<count;++i)  
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;  
		  sc.close();
		 }    
		  
		}  

}
