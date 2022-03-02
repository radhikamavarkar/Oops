package com.xworkz.Polymorphism;

public class Booktester { 
	public static void main(String []args) { 
		
	Dictionary d=new Longman();
	d. read(); 
	d. write(); 
	d. information(); 
	d. knowledgable(); 
	d. confidence(); 
	d. illumination();  
	d. newlangauge(); 
	d. helptoimprove();  
	
	
	Dictionary k=new Oxford(); 
	
	k. read(); 
	k. write(); 
	k. information(); 
	k. knowledgable(); 
	k. confidence(); 
	k. illumination();  
	k. newlangauge(); 
	k. helptoimprove(); 
	
	Course d=new Science();
	d. read(); 
	d. write(); 
	d. information(); 
	d. knowledgable(); 
	d. confidence(); 
	d. illumination();  
	d. newlangauge(); 
	d. helptoimprove(); 
	
	
	Course d=new Mathematics();
	d. read(); 
	d. write(); 
	d. information(); 
	d. knowledgable(); 
	d. confidence(); 
	d. illumination();  
	d. newlangauge(); 
	d. helptoimprove();
	}
	
	
}
