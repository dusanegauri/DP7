package com.predictOutput;
public class Output {
	
	public static void main(String[] args) {
		Cars bmw = new Cars("red");
		Cars wagonR = new Cars("blue");
		System.out.println(bmw.wheels);
		System.out.println(bmw.color);
	} 
}

class Cars
{
	static int wheels;
	static {
		m1();
	       }

	{
		System.out.println(++wheels);
	}

	Cars(String color) {
		this.color = color ;
	}

	static void m1() {	
		System.out.println(color);
	}

	static String color = "Red";

	static {
		m1();
	}

	{
		++wheels;
	}
}