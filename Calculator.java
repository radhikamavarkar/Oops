package com.xworkz.Exception;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("start main()");
		int num1=2; //int num1=0;arithmetic exception
		int num2=10;
		String name="manjula";//String name=null;nullpointer exception
		int []a= {1,2,3,4}; // array index out of bounce exception
		
		try {
			for(int i=0;i<=a.length;i++) {
				System.out.println("array elements are:"+"\t"+a[i]);
				}
			//System.out.println(a[a.length]);
			System.out.println(num2/num1);
			//this line might be causing exception
			System.out.println(name.toUpperCase());
			
			
			
		}
		//catch block handle the exception
		catch(ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException exception) {
		
			System.out.println(exception.getClass().getSimpleName()+"\t"+exception.getMessage());
			
		}
		System.out.println("end main()");
	}

}
