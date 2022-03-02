package com.xworkz.Polymorphism.Amazon.Kitchenproducts;

public class Bottle extends Fiber implements Kitchen{ 
	
	public void usetotiffin() { 
		System.out.println("used to tiffin");
	}
	public void usetolunch() { 
		System.out.println("used to lunch");
	}
	
	public void usetodrinktea() { 
		System.out.println("used to drinktea");	
	}
	public void usedtodrinkwater() { 
		System.out.println("used to drinkwatere");
	}
	public void utensils() { 
		System.out.println("used to utensils");	
	}
	public void tools() { 
		System.out.println("used to tools");	
	}


}
