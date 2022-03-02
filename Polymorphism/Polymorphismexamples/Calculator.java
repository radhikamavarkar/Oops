package com.xworkz.Polymorphism.Polymorphismexamples;

public class Calculator { 
	public String type; 
	public String brand; 
	
	public int addition(int a,int b) { 
		return a+b;
	} 
	public float addition(float a, int b) { 
		return a+b;
	} 
	public int substraction(int a, int b) { 
		return a-b;
	} 
	public float substraction(float a, int b) { 
		return a-b;
	} 
	public long multipication(int a, int b) { 
		return a*b;
	}  
	public long muitipication(int a,int b) { 
		 return a*b;
	}
	public int division(float a,int b) { 
		return a/b;
	} 
	public int division(int a, int b) { 
		return a/b;
	}

}
