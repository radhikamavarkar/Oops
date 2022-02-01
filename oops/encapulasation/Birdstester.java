package com.xworkz.oops.encapulasation;


	public class Birdstester { 
		public static void main(String []args) { 
			Birds b=new Birds(); 
			b.setFeathers("4"); 
			String feathers=b.getFeathers(); 
			System.out.println(feathers); 
		 
		
		b.setWings(2);
				 
		int wings=b.getWings(); 
		System.out.println(wings);
	 

	b.setBeaks(1); 
	int beaks=b.getBeaks(); 
	System.out.println(beaks); 

	b.setWeight(5); 
	int weight=b.getWeight();  
	System.out.println(weight);  

	b.setBeak(1); 
	int beak=b.getBeak(); 
	System.out.println(beak);  

	b.setColour("white"); 
	String colour=b.getColour(); 
	System.out.println(colour); 

	b.setnumLeg(2); 
	int numleg=b.getnumLeg(); 
	System.out.println(numleg); 


	b.setType("hot blooded"); 
	String type=b.getType(); 
	System.out.println(type); 






	b.setBody  ("slim"); 
	String body=b.getBody(); 
	System.out.println(body); 
		}



	`






}
