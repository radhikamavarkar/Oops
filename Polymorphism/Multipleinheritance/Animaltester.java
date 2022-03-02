package com.xworkz.Polymorphism.Multipleinheritance;

public class Animaltester { 
	public static void main(String []args) { 
		
		Animal a=new Cat(); 
		a.sound();  
		a.run();  
		a.sleep();  
		
		
		Cat c= (Cat)a ;
		
	}

}
