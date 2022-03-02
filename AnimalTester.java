package com.xworkz.Exception;

public class AnimalTester { 
	public static void main(String[] args) {
		System.out.println("start of main()");
		Animal a=new Animal();
		Dog d=new Dog();
		//Cat c=(Cat)d; 
		// class casting error occur when we directly doing down casting
		try {
			//System.out.println(c);
			Cat c=(Cat)d; 
		}
		catch(ClassCastException exception) {
			System.out.println(exception.getClass().getSimpleName()+"\t"+exception.getMessage());
			
		}
	}

}
