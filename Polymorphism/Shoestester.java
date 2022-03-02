package com.xworkz.Polymorphism;

import com.xworkz.Polymorphism.Amazon.Shoes.Blazer;
import com.xworkz.Polymorphism.Amazon.Shoes.Menshoes;
import com.xworkz.Polymorphism.Amazon.Shoes.Nyka;
import com.xworkz.Polymorphism.Amazon.Shoes.Puma;
import com.xworkz.Polymorphism.Amazon.Shoes.Womenshoes;

public class Shoestester { 
	public static void main(String []args) { 
		
	

	Menshoes s=new Blazer(); 
	s. comfortable(); 
	s. fashionable(); 
	s.Designing(); 
	s. smoothable(); 
	s. business(); 
	s. discount(); 
	s. price(); 
	s. offer(); 
	
	Menshoes k=new Tshirtshoes();
	k. comfortable(); 
	k. fashionable(); 
	k. Designing(); 
	k. smoothable(); 
	k. business(); 
	k. discount(); 
	k. price(); 
	k. offer(); 
	
	
	Womenshoes r=new Puma();
	r. comfortable(); 
	r. fashionable(); 
	r. Designing(); 
	r. smoothable(); 
	r. business(); 
	r. discount(); 
	r. price(); 
	r. offer();  
	
	Womenshoes v=new Nyka();
	v. comfortable(); 
	v. fashionable(); 
	v. Designing(); 
	v. smoothable(); 
	v. business(); 
	v. discount(); 
	v. price(); 
	v. offer(); 
	}
}
