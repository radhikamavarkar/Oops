package com.xworkz.Polymorphism.Amazon.Kitchenproducts;

public abstract class Plate implements Kitchen{ 
	public void usetotiffin() { 
		System.out.println("used to tiffin");
	}
	public void usetolunch() { 
		System.out.println("used to lunch");
	}
	
	public void usetodrinktea() { 
		System.out.println("sometimes used to tiffin");	
	}
	public void usedtodrinkwater() { 
		System.out.println("sometimes used to tiffin");
	}
	public void utensils() { 
		System.out.println("glassutensils are used to tiffin");	
	}
	public void tools() { 
		System.out.println("glass toolsused to tiffin");	
	}


}
